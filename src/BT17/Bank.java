package BT17;

public class Bank {
    public String accountNumber; // số tài khoản
    public String ownerName;     // chủ tài khoản
    public String typeAccount;   // loại tài khoản(vd: tiết kiệm)
    public long surplus;         // số dư
    public String bankName;      // tên ngân hàng
    public String startDate;     // ngày phát hành
    public String endDate;       // ngày hết hạn

    public Bank() {
        accountNumber = "";
        ownerName = "";
        typeAccount = "";
        surplus = 0;
        bankName = "";
        startDate = "";
        endDate = "";
    }

    public Bank(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Bank(String accountNumber, String ownerName) {
        this(accountNumber);
        this.ownerName = ownerName;
    }

    public Bank(String accountNumber, String ownerName, String typeAccount) {
        this(accountNumber, ownerName);
        this.typeAccount = typeAccount;
    }

    public Bank(String accountNumber, String ownerName, String typeAccount, long surplus) {
        this(accountNumber, ownerName, typeAccount);
        this.surplus = surplus;
    }

    public Bank(String accountNumber, String ownerName,
                String typeAccount, long surplus, String bankName) {
        this(accountNumber, ownerName, typeAccount, surplus);
        this.bankName = bankName;
    }

    public Bank(String accountNumber, String ownerName,
                String typeAccount, long surplus, String bankName,
                String startDate) {
        this(accountNumber, ownerName, typeAccount, surplus, bankName);
        this.startDate = startDate;
    }

    public Bank(String accountNumber, String ownerName,
                String typeAccount, long surplus,
                String bankName, String startDate, String endDate) {
        this(accountNumber, ownerName, typeAccount, surplus, bankName, startDate);
        this.endDate = endDate;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getTypeAccount() {
        return typeAccount;
    }

    public void setTypeAccount(String typeAccount) {
        this.typeAccount = typeAccount;
    }

    public long getSurplus() {
        return surplus;
    }

    public void setSurplus(long surplus) {
        this.surplus = surplus;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    // phương thức chuyển tiền
    private boolean transfers(long amount) {
        if (amount > 0) {
            surplus += amount;
            return true;
        }
        return false;
    }

    // phuong thuc rut tien
    private boolean Withdrawal(long amount) {
        if (amount > 0 && amount < surplus) {
            surplus -= amount;
            return true;
        }
        return false;
    }

}
