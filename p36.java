/*36	Write a java program to create an interface that consists of a method to display
volume () as an abstract method and redefine this method in   the derived	
2	classes to suit their requirements.
Create classes called Cone, Hemisphere and Cylinder that implements the interface. Using these three classes, design a program that will accept dimensions of a cone, cylinder and hemisphere interactively and display the volumes.
Volume of cone = (1/3)πr2h Volume of hemisphere = (2/3)πr3Volume of cylinder = πr2h	 */

   // interface is not a class and all the members in it are degault public abstract
 


 
import java.util.Scanner;

interface Display {
    void displayVolume(Scanner sc);
}

class Cone implements Display {
    public void displayVolume(Scanner sc) {
        System.out.println("Enter the radius and height of the cone:");
        double radius = sc.nextDouble();
        double height = sc.nextDouble();
        double volume = (1 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
        System.out.println("Volume of the cone is: " + volume);
    }
}

class Hemisphere implements Display {
    public void displayVolume(Scanner sc) {
        System.out.println("Enter the radius of the hemisphere:");
        double radius = sc.nextDouble();
        double volume = (2 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.println("Volume of the hemisphere is: " + volume);
    }
}

class Cylinder implements Display {
    public void displayVolume(Scanner sc) {
        System.out.println("Enter the radius and height of the cylinder:");
        double radius = sc.nextDouble();
        double height = sc.nextDouble();
        double volume = Math.PI * Math.pow(radius, 2) * height;
        System.out.println("Volume of the cylinder is: " + volume);
    }
}

public class p36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Display cone = new Cone();
        cone.displayVolume(sc);
        
        Display hemisphere = new Hemisphere();
        hemisphere.displayVolume(sc);
        
        Display cylinder = new Cylinder();
        cylinder.displayVolume(sc);
        
        sc.close(); 
    }
}
