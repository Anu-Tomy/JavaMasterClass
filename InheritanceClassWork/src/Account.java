public class Account extends Bank {
    String customerName;
    int accountNumber;
    String email;
    String customerPhoneNumber;
    double checkingBalance;

    public Account(String customerName, int accountNumber, String email, String customerPhoneNumber, double checkingBalance) {
        super("Bank of America", "800-432-1000", "Charlotte, NC");
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.email = email;
        this.customerPhoneNumber = customerPhoneNumber;
        this.checkingBalance = checkingBalance;
    }

    public void deposit(double amount){
        this.checkingBalance += amount;
        System.out.println("Amount " + amount + " was deposited. Your new balance is  " + checkingBalance);
    }
    public void withdrawal(double amount){
        if(this.checkingBalance > 0){
            this.checkingBalance -= amount;
            System.out.println("Withdrawal successfull. New balance is " + this.checkingBalance);
        }
        else{
            System.out.println("Withdrawal denied. current balance is " + this.checkingBalance);
        }
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getBalance() {
        return checkingBalance;
    }

    public void setBalance(double balance) {
        this.checkingBalance = balance;
    }
}
