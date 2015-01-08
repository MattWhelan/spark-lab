import com.google.common.base.Objects;

import java.io.Serializable;

public class Sample implements Serializable {
    private String sex;
    private String name;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phone;
    private String birthdate;
    private String ssn;
    private String occupation;
    private String blood;
    private double weight;
    private String height;
    private double lat;
    private double lng;
    private boolean symptomatic;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setWeight(String weight) {
        this.weight = Double.valueOf(weight);
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public void setLat(String lat) {
        this.lat = Double.valueOf(lat);
    }


    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public void setLng(String lng) {
        this.lng = Double.valueOf(lng);
    }

    public boolean isSymptomatic() {
        return symptomatic;
    }

    public void setSymptomatic(boolean symptomatic) {
        this.symptomatic = symptomatic;
    }

    public void setSymptomatic(String symptomatic) {
        this.symptomatic = "y".equalsIgnoreCase(symptomatic);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sample sample = (Sample) o;

        if (Double.compare(sample.lat, lat) != 0) return false;
        if (Double.compare(sample.lng, lng) != 0) return false;
        if (symptomatic != sample.symptomatic) return false;
        if (Double.compare(sample.weight, weight) != 0) return false;
        if (address != null ? !address.equals(sample.address) : sample.address != null) return false;
        if (birthdate != null ? !birthdate.equals(sample.birthdate) : sample.birthdate != null) return false;
        if (blood != null ? !blood.equals(sample.blood) : sample.blood != null) return false;
        if (city != null ? !city.equals(sample.city) : sample.city != null) return false;
        if (height != null ? !height.equals(sample.height) : sample.height != null) return false;
        if (name != null ? !name.equals(sample.name) : sample.name != null) return false;
        if (occupation != null ? !occupation.equals(sample.occupation) : sample.occupation != null) return false;
        if (phone != null ? !phone.equals(sample.phone) : sample.phone != null) return false;
        if (sex != null ? !sex.equals(sample.sex) : sample.sex != null) return false;
        if (ssn != null ? !ssn.equals(sample.ssn) : sample.ssn != null) return false;
        if (state != null ? !state.equals(sample.state) : sample.state != null) return false;
        if (zip != null ? !zip.equals(sample.zip) : sample.zip != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = sex != null ? sex.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (zip != null ? zip.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (birthdate != null ? birthdate.hashCode() : 0);
        result = 31 * result + (ssn != null ? ssn.hashCode() : 0);
        result = 31 * result + (occupation != null ? occupation.hashCode() : 0);
        result = 31 * result + (blood != null ? blood.hashCode() : 0);
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (height != null ? height.hashCode() : 0);
        temp = Double.doubleToLongBits(lat);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(lng);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (symptomatic ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("sex", sex)
                .add("name", name)
                .add("address", address)
                .add("city", city)
                .add("state", state)
                .add("zip", zip)
                .add("phone", phone)
                .add("birthdate", birthdate)
                .add("ssn", ssn)
                .add("occupation", occupation)
                .add("blood", blood)
                .add("weight", weight)
                .add("height", height)
                .add("lat", lat)
                .add("lng", lng)
                .add("symptomatic", symptomatic)
                .toString();
    }
}
