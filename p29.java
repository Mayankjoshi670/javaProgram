/*Q29.Write a java program to implement abstract class and abstract method with 
following details: 
Create a abstract Base Class TemperatureData members: 
double temp; 
Method members: 
void setTempData(double) abstact void changeTemp() 
Sub Class Fahrenheit (subclass of Temperature) Data members: 
double ctemp; 
method member: 
Override abstract method changeTemp() to convert Fahrenheit temperature into degree Celsius 
by using formula C=5/9*(F-32) and display converted temperature 
Sub Class Celsius (subclass of Temperature) 
Data member: 
double ftemp; 
Method member: 
Override abstract method changeTemp() to convert degree Celsius into Fahrenheit temperature 
by using formula F=9/5*c+32 and display converted temperature 
*/
import java.util.* ; 


abstact clas  TemperatureData{
    double temp ; 
    public void setTempData(double temp){
        this.temp = temp ; 
    }
    abstract public void changeTemp() ; 
}
class Fahrenheit extends  TemperatureData{
    double ctemp  ; 
    public void changeTemp(){
        ctemp = (5/9.0)*(temp-32) ; 
    }
    public void display(){
        System.out.println("fahrenheit----->celsius"+ctemp) ; 

    }
}

class Celsius extends TemperatureData{ 
 double ftemp; 
 public void changeTemp(){ 
 ftemp=9/5.0*temp+32; 
 } 
 public void display(){ 
 System.out.println("celsius------>fahrenheit"+ftemp); 
 } 
}