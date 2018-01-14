public class Credit extends Account {
    int creditNumber;
    double creditBalance;
    double limit;


    public Credit(String customerName, int accountNumber, String email, String customerPhoneNumber, double checkingBalance, int creditNumber, double creditBalance, double limit) {
        super(customerName, accountNumber, email, customerPhoneNumber, checkingBalance);
        this.creditNumber = creditNumber;
        this.creditBalance = creditBalance;
        this.limit = limit;
    }

    public void paymentMade(double amount){
        if(this.creditBalance == 0){
            System.out.println("You have 0 credit balance. Congrats");
        }
        else{
            this.creditBalance -= amount;
            System.out.println("Your new credit balance is " + this.creditBalance);
        }
    }

    public int getCreditNumber() {
        return creditNumber;
    }

    public void setCreditNumber(int creditNumber) {
        this.creditNumber = creditNumber;
    }

    public double getTotalBalance() {
        return creditBalance;
    }

    public void setTotalBalance(double totalBalance) {
        this.creditBalance = totalBalance;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }
}
