package BaiTap16;

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

    public String fullAddress() {
        String address = "";
        if (!number.isEmpty()) {
            address += " So " + number;
        }
        if (!lane.isEmpty()) {
            address += " Ngo " + lane;
        }
        if (!street.isEmpty()) {
            address += " Duong " + street;
        }
        if (!village.isEmpty()) {
            address += " Xom " + village;
        }
        if (!wards.isEmpty()) {
            address += " Xa/Phuong " + wards;
        }
        if (!district.isEmpty()) {
            address += " Qua Huyen" + district;
        }
        if (!city.isEmpty()) {
            address += " Thanh Pho " + city;
        }
        return address;
    }
}
