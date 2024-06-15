//Write a java program to delete vowels from given string using StringBuffer class
import java.util.* ; 

public class p30 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("enter the string"); 
        String st = sc.nextLine(); 
        String result = deleteVowel(st);
        System.out.println("your input string is " + st);
        System.out.println("resultant string: " + result); 
    }

    static String deleteVowel(String st) {
        StringBuffer sb = new StringBuffer(); 
        for (int i = 0; i < st.length(); i++) {
            if (!isVowel(st.charAt(i))) {
                sb.append(st.charAt(i)); 
            }
        }
        return sb.toString(); 
    }

    static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}
