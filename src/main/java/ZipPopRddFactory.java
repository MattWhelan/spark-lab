import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.Function;
import scala.Tuple2;

public class ZipPopRddFactory {
  public static JavaRDD<Tuple2<String, Integer>> getZipPopRdd(JavaSparkContext sc){
    return sc.textFile("zipPopulation.csv").map(new Function<String, Tuple2<String, Integer>>() {
      @Override
      public Tuple2<String, Integer> call(String v1) throws Exception {
        String[] split = v1.split(",");
        return new Tuple2<String, Integer>(split[0], Integer.valueOf(split[1], 10));
      }
    });
  }
}
