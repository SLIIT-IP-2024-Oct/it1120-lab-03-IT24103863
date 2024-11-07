import java.util.Scanner;
public class IT24103863Lab3Q1A {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the price of 1 kg of rice
        System.out.print("Enter the price of 1 kg of rice: ");
        double pricePerKg = scanner.nextDouble(); // Read the price (double)

        // Prompt the user to enter the number of kilograms they want to buy
        System.out.print("Enter the number of kilograms you want to buy: ");
        double quantity = scanner.nextDouble(); // Read the quantity (double)

        // Calculate the total amount to pay
        double totalAmount = pricePerKg * quantity;

        // Display the result
        System.out.println("Total amount to pay: " + totalAmount);

        // Close the scanner object to avoid resource leaks
        scanner.close();
    }
}