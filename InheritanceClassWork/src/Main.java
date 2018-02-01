public class Main {

    public static void main(String[] args) {

        Account newAccount = new Account("Bob",56234,"bob@gmail.com", "401256895",500);
        newAccount.deposit(200);

        Credit newCredit = new Credit("Tom",458697,"tom@gmail.com","401256895",500.00,25457,2000.00, 5000.00);
        newCredit.paymentMade(100.00);

        newAccount.withdrawal(100);

    }
}
