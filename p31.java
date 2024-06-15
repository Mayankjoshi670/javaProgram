/*Q31.Write a java program to accept and print the employee details during runtime.The details 
will include employee id, name, dept_ Id. The program should raise an exception if user inputs 
incomplete or incorrect data. The entered value should meet the following conditions: 
a. First Letter of employee name should be in capital letter. 
b. Employee id should be between 2001 and 5001 
c. Department id should be an integer between 1 and 5. 
If the above conditions are not met, then the application should raise specific exception else 
should complete normal execution.*/


import java.util.* ; 
public class p31{
    public static void main(String props[]){
        Scanner sc = new Scanner(System.in) ; 
        try{
        System.out.println("Eneter the Student id should be between 2001 and 5001 ") ; 
        int id = sc.nextInt() ;
        sc.nextLine() ;  
        if(id<2001 || id>5001){
            throw new IllegalArgumentException(" id must be between 2001 and 5001") ; 
        }

        System.out.println("Eneter the Student name with first letter capital ") ; 
        String name = sc.nextLine()  ; 
        if(Character.toUpperCase(name.charAt(0)) != name.charAt(0)){
            throw new IllegalArgumentException("first should be capital") ; 
        }


         System.out.print("Enter Department ID (between 1 and 5): ");
            int deptId = sc.nextInt();
            if (deptId < 1 || deptId > 5) {
            throw new IllegalArgumentException("Department ID must be between 1 and 5.");
 }

        System.out.println("Employee Details:");
 System.out.println("Employee ID: " + id);
 System.out.println("Employee Name: " + name);
  System.out.println("Department ID: " + deptId);
    }
    catch(IllegalArgumentException er){
        System.out.println("IllegalArgumentExceptionor" + er);
    }
    finally{
        System.out.println("at last comes heare") ;
    }
    


        }
}

