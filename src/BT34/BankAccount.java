package BT34;

public class BankAccount {
    private String id;                      // Ma Tai Khoan
    private String accountNumber;           // So Tai Khoan
    private String ownerName;               // Chu Tai Khoan
    private String typeAccount;             // Loai Tai Khoan
    private long surplus;                   // So Du Tai Khoan
    private String bankName;                // Ten Ngan Hang
    private String startDate;               // Ngay Phat Hanh
    private String endDate;                 // Ngay Het Han

    public BankAccount() {
        id = "";
        accountNumber = "";
        ownerName = "";
        typeAccount = "";
        surplus = 0;
        bankName = "";
        startDate = "";
        endDate = "";
    }

    public BankAccount(String id) {
        this.id = id;
    }

    public BankAccount(String id, String accountNumber) {
        this(id);
        this.accountNumber = accountNumber;
    }

    public BankAccount(String id, String accountNumber, String ownerName) {
        this(id, accountNumber);
        this.ownerName = ownerName;
    }

    public BankAccount(String id, String accountNumber,
                       String ownerName, String typeAccount) {
        this(id, accountNumber, ownerName);
        this.typeAccount = typeAccount;
    }

    public BankAccount(String id, String accountNumber,
                       String ownerName, String typeAccount, long surplus) {
        this(id, accountNumber, ownerName, typeAccount);
        this.surplus = surplus;
    }

    public BankAccount(String id, String accountNumber,
                       String ownerName, String typeAccount,
                       long surplus, String bankName) {
        this(id, accountNumber, ownerName, typeAccount, surplus);
        this.bankName = bankName;
    }

    public BankAccount(String id, String accountNumber,
                       String ownerName, String typeAccount,
                       long surplus, String bankName, String startDate) {
        this(id, accountNumber, ownerName, typeAccount, surplus, bankName);
        this.startDate = startDate;
    }

    public BankAccount(String id, String accountNumber,
                       String ownerName, String typeAccount,
                       long surplus, String bankName, String startDate, String endDate) {
        this(id, accountNumber, ownerName, typeAccount, surplus, bankName, startDate);
        this.endDate = endDate;
    }

    public String getId() {
        return id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getTypeAccount() {
        return typeAccount;
    }

    public long getSurplus() {
        return surplus;
    }

    public String getBankName() {
        return bankName;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    // account transfer method
    public boolean transfer(long amount) {
        if (amount > 0) {
            surplus += amount;
            return true;
        }
        return false;
    }

    // account withdrawal method
    public boolean Withdrawal(long amount) {
        if (amount > 0 && amount < surplus) {
            surplus -= amount;
            return true;
        }
        return false;
    }

    // balance check
    public void balanceCheck() {
        System.out.println("Your Balance" + surplus);
    }

    // Transfer money from an existing account to another
    public boolean banktransfer(BankAccount other, long amount) {
        if (0 < amount && amount < surplus) {
            surplus -= amount;
            other.surplus += amount;
            return true;
        }
        return false;
    }
}
