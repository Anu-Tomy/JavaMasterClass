import java.io.File;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) throws Exception{
        File file = new File("Java.txt");
        Scanner fileScanner = new Scanner(file);

        int words = 0;
        while(fileScanner.hasNextLine()){
            String line = fileScanner.nextLine();
            words += line.split(" ").length;
        }
        System.out.println("The file contains " + words+ " words.");
    }
}
