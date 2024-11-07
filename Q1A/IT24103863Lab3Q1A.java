import java.util.Scanner;
public class IT24103863Lab3Q1A {
    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the price of 1 kg of rice: ");
        double pricePerKg = scanner.nextDouble(); // Read the price (double)

 
        System.out.print("Enter the number of kilograms you want to buy: ");
        double quantity = scanner.nextDouble(); // Read the quantity (double)

   
        double totalAmount = pricePerKg * quantity;

     
        System.out.println("Total amount to pay: " + totalAmount);


        scanner.close();
    }
}