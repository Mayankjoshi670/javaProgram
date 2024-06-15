/*Q32.Create a class MyCalculator which consists of a single method power (int, int). This 
method takes two integers, n and p, as parameters and finds np. If either n or p is negative, 
then the method must throw an exception which says, "n and p should be non- negative". 
Input Format 
Each line of the input contains two integers, n and p. Output Format 
Each line of the output contains the result, if neither of n and p is negative. 
Otherwise, the output contains "n and p should be non- negative". 
Sample Input 
-1 0 
 4 5 
 0 0 
 -2 -5 
Sample Output 
n and p should be non-negative 
1024 
n and p should not be zero 
n and p should be non-negative 
java.lang.Exception: n and p should not be zero. java.lang.Exception: n or p 
should not be negative. java. lang. Exception: n or p should not be negative. 
Explanation 
In the first two cases, both n and p are positive. So, the power function returns 
the answer correctly. 
In the third case, both n and p are zero. So, the exception, "n and p should not 
be zero.” is printed. 
In the last two cases, at least one out of n and p is negative. So, the exception, 
"n or p should not be negative.” is printed for these two cases. 
*/ 
import java.util.Scanner; 
class MyCalculator { 
 // Method to calculate n raised to the power of p 
 public long power(int n, int p) throws Exception { 
 if (n < 0 || p < 0) { 
 throw new Exception("n and p should be non-negative"); 
 } else if (n == 0 && p == 0) { 
 throw new Exception("n and p should not be zero"); 
 } else { 
 return (long) Math.pow(n, p); 
 } 
 } 
} 
public class p32 { 
 public static void main(String[] args) { 
 Scanner sc = new Scanner(System.in); 
 MyCalculator myCalculator = new MyCalculator(); 
 int numberOfPairs = sc.nextInt(); // Assuming the first input is the number of pairs 
 for (int i = 0; i < numberOfPairs; i++) { 
 int n = sc.nextInt(); // Read the next integer n 
 int p = sc.nextInt(); // Read the next integer p 
 try { 
 System.out.println(myCalculator.power(n, p)); 
 } catch (Exception e) { 
 System.out.println(e.getMessage()); 
 } 
 } 
 sc.close(); 
 } 
}