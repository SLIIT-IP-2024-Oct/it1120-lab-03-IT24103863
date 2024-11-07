import java.util.Scanner;  

public class IT24103863Lab3Q4 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
    
        System.out.print("Enter a five-digit number: ");
        int number = scanner.nextInt();
        
      
        if (number >= 10000 && number <= 99999) {
           
            int divisor = 10000;  // The divisor will be 10000, 1000, 100, 10, and 1 to extract each digit
            while (divisor > 0) {
                int digit = number / divisor; 
                System.out.print(digit + " ");  
                number = number % divisor; 
                divisor /= 10; 
            }
        } else {
            System.out.println("Please enter a valid five-digit number.");
        }
        
       
        scanner.close();
    }
}

