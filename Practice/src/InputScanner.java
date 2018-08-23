import java.util.Scanner;

public class InputScanner {
    public static void main(String[] args) {
        System.out.println("Enter yor grade: ");
        Scanner scanner = new Scanner(System.in);
        int grade = scanner.nextInt();
        if(grade > 90){
            System.out.println("Wow! you did well!");
        }else{
            System.out.println("Not bad, but you can do better next time!");
        }
    }
}
