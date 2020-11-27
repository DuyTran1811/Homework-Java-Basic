package BT9Method;

/**
 * Liet Ke Cac So Co & Chu So
 */
public class BT20 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1000000; i <= 9999999; i++) {
            if (isRevert(i) && !isContain8(i) && isDivBy9(i)) {
                System.out.print(i + " ");
                count++;
                if (count % 10 == 0) {
                    count = 0;
                    System.out.println();
                }
            }
        }
    }

    private static boolean isDivBy9(int n) {
        int total = 0;
        while (n > 0) {
            total += n % 10;
            n /= 10;
        }
        return total % 9 == 0;
    }

    private static boolean isContain8(int n) {
        while (n > 0) {
            if (n % 10 == 8) {
                return true;
            }
            n /= 10;
        }
        return false;
    }

    private static boolean isRevert(int n) {
        int m = n;
        int rev = 0;
        while (m > 0) {
            rev = rev * 10 + m % 10;
            m /= 10;
        }
        return rev == n;
    }
}
