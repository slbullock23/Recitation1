import java.util.Scanner;

public class BasicInput {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userInt = 0;
        double userDouble = 0.0;
        String userString = " ";
        char userChar = ' ';

        System.out.println("Enter integer:"); // Asks for user to input an integer
        userInt = scnr.nextInt(); // scans the next token of the input as an int

        System.out.println("Enter double:"); // Asks for user to input a double
        userDouble = scnr.nextDouble(); // scans the next token of the input as a double

        System.out.println("Enter character:"); // Asks for user to input a character
        userChar = scnr.next().charAt(0);

        System.out.println("Enter string:"); // Asks for user to input a string
        userString = scnr.next(); // scans the next token of the input as a string

        System.out.println(userInt + " " + userDouble + " " + userChar + " " + userString);
        System.out.println(userString + " " + userChar + " " + userDouble + " " + userInt);

        int userIntTwo = (int) userDouble; // casting the double into an integer
        System.out.println(userDouble +" " + "cast to an integer is" + " " + userIntTwo); // outputting the integer
    }
}