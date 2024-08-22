import java.util.Scanner; // Import the Scanner class for user input

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); // Read user input

        // Using if, else if, and else statements to check the number
        if (number % 5 == 0) {
            System.out.println(number + " is a multiple of five.");
        } else if (number % 10 == 0) {
            System.out.println(number + " is a multiple of ten.");
        } else {
            System.out.println("out out bound");
        }

        scanner.close(); // Close the scanner
    }
}
