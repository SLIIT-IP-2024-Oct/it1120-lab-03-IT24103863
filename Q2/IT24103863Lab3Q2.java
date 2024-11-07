import java.util.Scanner;  

public class IT24103863Lab3Q2 {
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the monthly salary: ");
        double monthlySalary = scanner.nextDouble(); // Read the monthly salary (double)

      
        System.out.print("Enter the number of OT hours worked: ");
        double otHours = scanner.nextDouble(); // Read the number of OT hours (double)

      
        System.out.print("Enter the OT hourly rate: ");
        double otHourlyRate = scanner.nextDouble(); // Read the OT hourly rate (double)

    
        double otAmount = otHours * otHourlyRate;

      
        double totalSalary = monthlySalary + otAmount;

       
        System.out.println("OT Amount: " + otAmount);
        System.out.println("Total Salary (Monthly Salary + OT Amount): " + totalSalary);

       
        scanner.close();
    }
}
