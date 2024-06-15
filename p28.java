/*Q28.Method overriding (Runtime Polymorphism), Abstract class and Abstract method, 
Inheritance, interfaces: 
Write a java program to calculate the area of a rectangle, a square and a circle.Create an abstract 
class 'Shape' with three abstract methods namely rectangleArea() taking two parameters, 
squareArea() and circleArea() takingone parameter each.Now create another class ‘Area’ 
containing all the three methods rectangleArea(), squareArea() and circleArea() for printing 
the area of rectangle, square and circle respectively. Create an object of class Area and call all 
the three methods. 
(Use Runtime Polymorphism) 
*/
import java.util.* ; 
abstract class Shape {
    abstract public void rectangleArea(int l, int w); 
    abstract public void squareArea(int w); 
    abstract public void circleArea(int r);  
}
class Area extends Shape {
 
    public void rectangleArea(int l, int w) {
        System.out.println("Area of rectangle is " + l * w); 
    }

    public void squareArea(int w) {
        System.out.println("Area of square is " + w * w); 
    }

    public void circleArea(int r) {
        System.out.println("Area of circle is " + Math.PI * r * r); 
    } 
}
public class p28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the length and width of rectangle:");
        int l = sc.nextInt(); 
        int w = sc.nextInt(); 

        System.out.println("Enter the side of a square:"); 
        int a = sc.nextInt(); 

        System.out.println("Enter the radius of circle:"); 
        int r = sc.nextInt(); 

        Area ar = new Area();  
        ar.rectangleArea(l, w); 
        ar.squareArea(a); 
        ar.circleArea(r); 

        sc.close();  
    }
}