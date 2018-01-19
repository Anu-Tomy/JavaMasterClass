public class DoubleDeluxeHamburger extends Hamburger {
    private String doubleDeluxeExtraName;
    private double doubleDeluxeExtraPrice;

    public DoubleDeluxeHamburger(String doubleDeluxeExtraName, double doubleDeluxeExtraPrice) {
        super("Double Deluxe", "Chicken", 10.99, "White");
        this.doubleDeluxeExtraName = doubleDeluxeExtraName;
        this.doubleDeluxeExtraPrice = doubleDeluxeExtraPrice;
    }

    public void addDoubleDeluxeExtra(String name, double price){
        this.doubleDeluxeExtraName = doubleDeluxeExtraName;
        this.doubleDeluxeExtraPrice = doubleDeluxeExtraPrice;
    }

    @Override
    public double additionalPriceOfHamburger() {
        double additionalPrice = super.additionalPriceOfHamburger();
        if(this.doubleDeluxeExtraName != null){
            additionalPrice += this.doubleDeluxeExtraPrice;
            System.out.println("Added Extra meat " + this.doubleDeluxeExtraName + " for an extra " + this.doubleDeluxeExtraPrice);
        }
        return additionalPrice;
    }
}
