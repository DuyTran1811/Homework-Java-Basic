package BT34.BT3;
// phan loai hoc luc
public enum Classification {
   F("Trượt"),D("YẾU"),C("TRUNG BÌNH"),
    B("KHÁ"),A("GIỎI"),A_PLUS("XUẤT SẮC");

    Classification(String value) {
        this.value = value;
    }
    private String value;

    public String getValue() {
        return value;
    }
}
