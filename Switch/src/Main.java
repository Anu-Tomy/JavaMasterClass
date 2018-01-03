public class Main {

    public static void main(String[] args) {

        int switchValue = 3;
        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
            System.out.println("Value was 3");
            break;

            case 4: case 5: case 6:
                System.out.println("Value was a 4 or a 5, or a 6");
                break;

            default:
                System.out.println("Actually value was " + switchValue);
                break;
        }
        // Create a new switch statement using char instead of int
        // create a new char variable
        // create a switch statement testing for A, B, C, D, or E
        // display a message if any of these are found and then break
        // Add a default which displays a message saying not found

        char charValue = 'D';
        switch (charValue){
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C': case 'D': case 'E':
                System.out.println(charValue + " was found");
                break;
            default:
                System.out.println(charValue + " Was not found");
                break;
        }

        String month = "JaNuaRy";
        switch (month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not Sure");
                break;

        }

    }
}
