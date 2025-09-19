public class Account {
    private String accountId;
    private double balance;

    public Account(String accountId, double balance) {
        this.accountId = accountId;
        this.balance = balance;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void printInfo() {
        System.out.println("Thong tin tai khoan:");
        System.out.println("- Ma so tai khoan: " + accountId);
        System.out.println("- So tien: " + (long)balance);
    }
}
