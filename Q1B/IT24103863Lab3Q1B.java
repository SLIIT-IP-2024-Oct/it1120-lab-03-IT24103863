import java.util.Scanner; 

public class IT24103863Lab3Q1B {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the price of 1 kg of rice: ");
        double pricePerKg = scanner.nextDouble(); // Read the price (double)

        
        System.out.print("Enter the number of kilograms you want to buy: ");
        double quantity = scanner.nextDouble(); // Read the quantity (double)

        
        double totalAmount = pricePerKg * quantity;

        
        double discount = totalAmount * 0.10;

        
        double finalAmount = totalAmount - discount;

       
        System.out.println("Total amount to pay before discount: " + totalAmount);
        System.out.println("Discount applied: " + discount);
        System.out.println("Total amount to pay after discount: " + finalAmount);

      
        scanner.close();
    }
}
