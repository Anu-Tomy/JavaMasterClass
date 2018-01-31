public class Main {

    public static void main(String[] args) {
      /* You job is to create a simple banking application.
         There should be a Bank class
         It should have an arraylist of Branches
         Each Branch should have an arraylist of Customers
         The Customer class should have an arraylist of Doubles (transactions)
         Customer:
         Name, and the ArrayList of doubles.
         Branch:
         Need to be able to add a new customer and initial transaction amount.
         Also needs to add additional transactions for that customer/branch
         Bank:
         Add a new branch
         Add a customer to that branch with initial transaction
         Add a transaction for an existing customer for that branch
         Show a list of customers for a particular branch and optionally a list
         of their transactions
         Demonstration autoboxing and unboxing in your code
         Hint: Transactions
         Add data validation.
         e.g. check if exists, or does not exist, etc.
         Think about where you are adding the code to perform certain actions
      */

      Bank bank = new Bank("Bank of America","4563256", "150 Broadway New York");

      bank.addBranch("Providence");

      bank.addCustomer("Providence", "Tom", 50.05);
      bank.addCustomer("Providence", "Mary", 200.75);
      bank.addCustomer("Providence", "Will", 120.25);

      bank.addBranch("Boston");

      bank.addCustomer("Boston", "John", 270.50);

      bank.addCustomerTransaction("Providence", "Tom", 30.25);
      bank.addCustomerTransaction("Providence", "Tom", 10.75);
      bank.addCustomerTransaction("Providence", "Mary", 8.25);

      bank.listCustomers("Providence", true);
      bank.listCustomers("Boston", true);

      if(!bank.addCustomer("Newport", "Allen", 5.53)) {
        System.out.println("Error Newport branch does not exist");
      }

      if(!bank.addBranch("Boston")) {
        System.out.println("Boston branch already exists");
      }

      if(!bank.addCustomerTransaction("Providence", "Shaun", 52.33)) {
        System.out.println("Customer does not exist at branch");
      }

      if(!bank.addCustomer("Providence", "Tom", 12.21)) {
        System.out.println("Customer Tom already exists");
      }

    }
}
