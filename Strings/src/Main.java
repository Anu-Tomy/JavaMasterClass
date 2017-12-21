public class Main {

    public static void main(String[] args) {
        //PRIMITIVE DATA TYPES
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        String myString = "This is a string";
        System.out.println("MyString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("MyString is equal to " + myString);
        myString = myString + " \u00A9 2017";
        System.out.println("MyString is equal to " + myString);  //MyString is equal to This is a string, and this is more. © 2017

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("The result is " + numberString);    //The result is 250.5549.95

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);     //LastString is equal to 1050
        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println("LastString value: " + lastString);      //LastString value: 1050120.47
    }
}
