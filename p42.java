/*
Collection and Generic Framework:
Write a method removeEvenLength that takes an ArrayList of Strings as a parameter and that removesall the strings of even length from the list. (Use ArrayList)
 */

import java.util.* ; 
public class p42{
    public static void main(String []args){
        System.out.println("enter the no of string you want to add") ; 
        Scanner sc = new Scanner(System.in) ; 
        int n = sc.nextInt() ; 
        sc.nextLine();
        ArrayList<String>list = new ArrayList<>() ;
        for(int i = 0 ; i< n ; i++){
            String s = sc.nextLine() ; 
            list.add(s) ; 
        }
        removeEvenLength(list) ; 
        System.out.println(list) ; 
     
    }
    public static void removeEvenLength(ArrayList<String>lis){
        Iterator<String>it = lis.iterator();
        while(it.hasNext()){
            String st = it.next() ; 
            if(st.length()%2 == 0 ){
                it.remove() ; 
            }
        }
    }
}