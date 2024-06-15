// 31	Class definition, creating objects and constructors:
// Write a java program to create a class named 'Bank ' with the following data members:
// ●Name of depositor
// ●Address of depositor
// ●Account Number
// ●Balance in account
// Class 'Bank' has a method for each of the following:
// 1.Generate a unique account number for each depositor.
// 2.For first depositor, account number will be 1001, for second depositor it will be 1002 and so on
// 3.Display information and balance of depositor
// 4.Deposit more amount in balance of any depositor
// 5.Withdraw some amount from balance deposited.
// 6.Change address of depositor	
// 	After creating the class, do the following operations.
// 1.Enter the information (name, address, account number, balance) of the depositors. Number of depositors is to be entered by the user.
// 2.Print the information of any depositor.
// 3.Add some amount to the account of any depositor and then display final information of that depositor.
// 4.Remove some amount from the account of any.
// depositor and then display final information of that depositor.
// 5.Change the address of any depositor and then display the final information of that depositor.
// 6.Randomly repeat these processes for some other
// bank accounts.	


import java.util.* ; 
 class Bank{
    private String name ;
    private String add ; 
    private int acc ; 
    private double balance ; 
    private static int  prevAccNo = 1000 ; 
    public Bank(String name , String add , double money){
        this.name = name ; 
        this.add = add ; 
        this.balance = money ; 
        this.acc = ++prevAccNo ; 
    }
    public void display(){
        System.out.println("name is "+ name  + "address" + add +"balance" +balance + "account no" + acc) ; 
    }
    
    public void deposit(double money){
        balance+= money ; 
        System.out.println(money + " deposited successfully.");
        System.out.println(balance + "is in you bank") ; 
    }
    
       public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
            System.out.println(balance + "left") ; 
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
    
}
 public class Main{

    public static void main(String props[]){
            Scanner sc = new Scanner(System.in) ; 
            String name = sc.nextLine() ; 
            String address = sc.nextLine() ; 
            double money = sc.nextDouble() ; 
            Bank B = new Bank(name , address, money) ; 
            B.display() ; 
            B.withdraw(100.50) ; 
            B.deposit(99999); 
    }     
 }