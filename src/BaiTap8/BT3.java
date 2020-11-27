package BaiTap8;


public class BT3 {
    public static void main(String[] args) {
        // ý tưởng của lời giải là bắt đầu từ giá trị i = 1
        // lần lượt tăng i lên đồng thời cộng i vào tổng gốc
        // nếu tại một thời điểm nào đó mà i cộng vào tổng cho kq >= 500
        // ta in ra kq, dừng vòng lặp => tìm xong đáp án
        int i = 1;
        int total = 0;
        while (true) {
            total += i;
            if (total >= 500) {
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}
