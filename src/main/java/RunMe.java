import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.storage.StorageLevel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.supercsv.io.CsvBeanReader;
import org.supercsv.prefs.CsvPreference;

import java.io.IOException;
import java.io.StringReader;

public class RunMe {
    private static final Logger logger = LoggerFactory.getLogger(RunMe.class);

    public static void main(String[] args) throws IOException {
        JavaSparkContext sc = getJavaSparkContext();

        JavaRDD<Sample> sampleRdd = getSampleRdd(sc);

        long zombieCount = sampleRdd.filter(new Function<Sample, Boolean>() {
            @Override
            public Boolean call(Sample sample) throws Exception {
                return sample.isSymptomatic();
            }
        }).count();

        System.out.print("Zombies: " + zombieCount);
    }

    private static JavaRDD<Sample> getSampleRdd(JavaSparkContext sc) {
        final String[] fields = {null,
                "sex",
                "name",
                "address",
                "city",
                "state",
                "zip",
                "phone",
                "birthdate",
                "ssn",
                "occupation",
                "blood",
                "weight",
                "height",
                "lat",
                "lng",
                "symptomatic"};

        return sc.textFile("zombies.csv").map(new Function<String, Sample>() {
            @Override
            public Sample call(String s) throws Exception {
                CsvBeanReader reader = new CsvBeanReader(new StringReader(s), CsvPreference.STANDARD_PREFERENCE);
                return reader.read(Sample.class, fields);
            }
        }).persist(StorageLevel.MEMORY_ONLY_SER());
    }

    private static JavaSparkContext getJavaSparkContext() {
        return new JavaSparkContext("local[4]", "spark-lab");
    }
}
