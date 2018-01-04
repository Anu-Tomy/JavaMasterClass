public class Account {
    private int number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public  void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("The deposited amount is " + depositAmount + ". New balance is " + this.balance);
    }

    public void withdrawal(double withdrawalAmount) {
        if ((this.balance - withdrawalAmount) <= 0){
            System.out.println("Only " + this.balance + " available. Withdrawal is not processed");
        }else{
            this.balance -= withdrawalAmount;
            System.out.println("The withdrawal amount is " + withdrawalAmount + ". New balance is " + this.balance);
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
