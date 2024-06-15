/*
Write a java program to accept and print the employee details during runtime. The details will include employee id, name, dept_ Id. The program should raise an exception if user inputs incomplete or incorrect data. The entered value should meet the following conditions:

a.First Letter of employee name should be in capital letter.
b.Employee id should be between 2001 and 5001
c.Department id should be an integer between 1 and 5.

If the above conditions are not met, then the application should raise specific exception else should complete normal execution.
*/
import java.util.Scanner;

public class EmployeeDetails {
public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);

 try {
System.out.print("Enter Employee ID (between 2001 and 5001): ");
int employeeId = scanner.nextInt();
 if (employeeId < 2001 || employeeId > 5001) {
 throw new IllegalArgumentException("Employee ID must be between 2001 and 5001.");
 }

System.out.print("Enter Employee Name (start with a capital letter): ");
 String employeeName = scanner.next();
if (!Character.isUpperCase(employeeName.charAt(0))) {
 throw new IllegalArgumentException("First letter of Employee Name must be a capital letter.");
}

System.out.print("Enter Department ID (between 1 and 5): ");
int deptId = scanner.nextInt();
 if (deptId < 1 || deptId > 5) {
 throw new IllegalArgumentException("Department ID must be between 1 and 5.");
 }
 System.out.println("Employee Details:");
System.out.println("Employee ID: " + employeeId);
System.out.println("Employee Name: " + employeeName);
System.out.println("Department ID: " + deptId);

 } catch (IllegalArgumentException e) {
System.out.println("Error: " + e.getMessage());
} finally {
 scanner.close();
 }
 }
}
