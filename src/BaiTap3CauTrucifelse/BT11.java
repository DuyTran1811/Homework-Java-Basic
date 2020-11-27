package BaiTap3CauTrucifelse;


public class BT11 {
    public static void main(String[] args) {
        var moneyArea = 152 * 65 * 0.01 * 0.01;
        var buidingArea = 72 * 12 * 80;
        var needed = Math.ceil(buidingArea / moneyArea);
        var base = 500_000;
        var property = 200_000_000_000L;
        var vnd = 23250;
        var exchange = property * vnd;
        var total = exchange / base;
        var result = total / needed;
        System.out.println("So Toa Nha Co The rai: "+result);
    }
}
