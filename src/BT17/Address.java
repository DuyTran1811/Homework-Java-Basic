package BT17;

public class Address {
    public String number;    // số nhà
    public String lane;      // ngõ
    public String street;    // tên đường
    public String village;   // tên xóm
    public String wards;     // phường/xã
    public String district;  // quận/huyện
    public String city;      // thành phố

    public Address() {
        number = "";
        lane = "";
        street = "";
        village = "";
        wards = "";
        district = "";
        city = "";
    }

    public Address(String number) {
        this.number = number;
    }

    public Address(String number, String lane) {
        this(number);
        this.lane = lane;
    }

    public Address(String number, String lane, String street) {
        this(number, lane);
        this.street = street;
    }

    public Address(String number, String lane, String street, String village) {
        this(number, lane, street);
        this.village = village;
    }

    public Address(String number, String lane,
                   String street, String village,
                   String wards) {
        this(number, lane, street, village);
        this.wards = wards;
    }

    public Address(String number, String lane,
                   String street, String village,
                   String wards, String district) {
        this(number, lane, street, village, wards);
        this.district = district;
    }

    public Address(String number, String lane,
                   String street, String village,
                   String wards, String district, String city) {
        this(number, lane, street, village, wards, district);
        this.city = city;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getLane() {
        return lane;
    }

    public void setLane(String lane) {
        this.lane = lane;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getWards() {
        return wards;
    }

    public void setWards(String wards) {
        this.wards = wards;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
