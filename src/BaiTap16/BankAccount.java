package BaiTap16;

public class BankAccount {
    public String accountNumber; // số tài khoản
    public String ownerName;     // chủ tài khoản
    public String typeAccount;   // loại tài khoản(vd: tiết kiệm)
    public long surplus;         // số dư
    public String bankName;      // tên ngân hàng
    public String startDate;     // ngày phát hành
    public String endDate;       // ngày hết hạn

    public BankAccount() {
        accountNumber = "";
        ownerName = "";
        typeAccount = "";
        surplus = 0;
        bankName = "";
        startDate = "";
        endDate = "";
    }

    public BankAccount(String accountNumber, String ownerName,
                       String typeAccount, long surplus,
                       String bankName, String startDate, String endDate) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.typeAccount = typeAccount;
        this.surplus = surplus;
        this.bankName = bankName;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    /**
     * Phuong Thuc Chuyen Tien Vao Tai Khoan
     *
     * @param amount So Tien Chuyen
     * @return Chuyen Tien Thanh Cong Hoac Trua
     */
    public boolean deposit(long amount) {
        if (amount > 0) {
            surplus += amount;
            return true;
        }
        return false;
    }

    // Phuong Thuc Rut Tien
    public boolean withdrawal(long amount) {
        if (amount > 0 && amount < surplus) {
            surplus -= amount;
            return true;
        }
        return false;
    }

    /**
     * Phuong Thuc Chuyen Khoan
     *
     * @param other  Tai Khoan Khac
     * @param amount So Tien Chuyen
     * @return Chuyen Thanh Cong Hoac Chua
     */
    public boolean bankTransfer(BankAccount other, long amount) {
        if (amount > 0 && amount < surplus) {
            surplus -= amount;
            other.surplus += amount;
            return true;
        }
        return false;
    }

    // Kiem Tra So Du
    public void checkAccountSurplus() {
        System.out.println("So Du Hien Tai Cua Ban La " + surplus);
    }

    // Thanh Toan Cac Dich Vu Khac
    public boolean payment(String service, long amount) {
        if (!service.isEmpty() && amount > 0 && amount < surplus) {
            surplus -= amount;
            return true;
        }
        return false;
    }
}
