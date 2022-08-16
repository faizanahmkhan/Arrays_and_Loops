import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerTest  {
    public static void main(String[] args) throws FileNotFoundException {
       // an object is a 'reference value'

        // Scanner is built-in class in Java
        // To use it, we need to create an object from the class
        System.out.println("Hello, what is your name?");
        Scanner inputScanner = new Scanner(System.in);

        String userName = inputScanner.nextLine();
        // program will hang until we provide some input, then move out
        System.out.println("Welcome: " + userName);

        System.out.println("May I ask your age?");

        Integer age = inputScanner.nextInt();

        System.out.println("So your name is " + userName + ", and you're " + age + " years old. Cool!");

        // We can loop through the content in a file with Scanner!!

        File file = new File("names.txt");
        Scanner fileScanner = new Scanner(file);

        System.out.println("Reading names.txt");
        while(fileScanner.hasNextLine()) {
            System.out.println(fileScanner.nextLine());
    }
        System.out.println("Finished!");
}}
