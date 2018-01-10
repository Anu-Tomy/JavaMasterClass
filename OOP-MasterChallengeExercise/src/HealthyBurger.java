public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private double healthyExtra1Price;


    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown Rye");
    }

    public void addHealthyAddition1(String name, double price){
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }
    public void addHealthyAddition2(String name, double price){
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double additionalPriceOfHamburger() {
        double hamburgerPrice = super.additionalPriceOfHamburger();
        if(this.healthyExtra1Name != null){
          hamburgerPrice += this.healthyExtra1Price;
            System.out.println("Added item is " + this.healthyExtra1Name + " for an extra price of " + this.healthyExtra1Price);
        }
        if(this.healthyExtra2Name != null){
            hamburgerPrice += this.healthyExtra2Price;
            System.out.println("Added item is " + this.healthyExtra2Name + " for an extra price of " + this.healthyExtra2Name);
        }
        return hamburgerPrice;

    }
}
