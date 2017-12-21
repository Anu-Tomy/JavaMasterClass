public class Main {

    public static void main(String[] args) {

        // 1. Create a byte variable and set it to any valid byte number.
        // 2. Create a short variable and set it to any valid short number.
        // 3. Create a int variable and set it to any valid in number.
        // 4. Create a variable of type long, and make it equal to 50000 + 10 times the sum of the byte, plus the short plus the int


        //int has a width of 32
        int intValue = 50;

        //byte has a width of 8
        byte byteValue = 10;

        //short has a width of 16
        short shortValue = 20;

        //long has a width of 64
        long longTotalValue = 50000L + (intValue + byteValue + shortValue)* 10L;
        short shortTotal = (short)(1000 + (intValue + byteValue + shortValue)* 10);

        System.out.println("LongTotalValue = " + longTotalValue);
        System.out.println("ShortTotalValue = " + shortTotal);
    }
}
