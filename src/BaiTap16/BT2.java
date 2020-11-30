package BaiTap16;

public class BT2 {
    public static void main(String[] args) {
        Address address = new Address();
        address.city = "Ha Noi";
        address.lane = "B12ND";
        address.district = "My Tien";
        address.village = "Nguyen Hue";
        System.out.println("Dia Chi Cua Toi " + address.fullAddress());
    }
}
