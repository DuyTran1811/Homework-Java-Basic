package BaiTap2SuDungLopMath;


public class BT9 {
    public static void main(String[] args) {
        var a = 60;
        var b = 80;
        var c = 60;
        var p = 0.5 * (a + b + c);
        var area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("Dien Tich Tam Giac: " + area);
    }
}
