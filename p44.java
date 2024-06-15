/*
Write a method called alternate that accepts two Listsof integers as its parameters and returns a
new List containing alternating elements from the twolists, in the following order:
●First element from first list
●First element from second list
●Second element from first list
●Second element from second list
●Third element from first list
●Third element from second list


If the lists do not contain the same number of elements, the remaining elements from the longer list should be placed consecutively at the end. For example, for a first list of (1, 2, 3, 4, 5) and a second
list of (6, 7, 8, 9, 10, 11, 12), a call of alternate (list1,
list2) should return a list containing (1, 6, 2, 7, 3, 8, 4,
9, 5, 10, 11, 12). Do not modify the parameter lists passed in.
 */
import java.util.*; 

public class p44 {
    public static void main(String[] props) {
        Scanner sc = new Scanner(System.in); 
        ArrayList<Integer> a = new ArrayList<>(); 
        ArrayList<Integer> b = new ArrayList<>(); 
        int n, m; 

        System.out.println("Enter the size of the first ArrayList:"); 
        n = sc.nextInt(); 
        for (int i = 0; i < n; i++) {
            int s = sc.nextInt(); 
            a.add(s);
        }

        System.out.println("Enter the size of the second ArrayList:"); 
        m = sc.nextInt(); 
        for (int i = 0; i < m; i++) {
            int s = sc.nextInt(); 
            b.add(s); 
        }

        List<Integer> result = alternate(a, b); 
        System.out.println(result); 
    }

    public static ArrayList<Integer> alternate(List<Integer> a, List<Integer> b) {
        ArrayList<Integer> result = new ArrayList<>(); 
        
        int size1 = a.size();
        int size2 = b.size();
        int maxSize = Math.max(size1, size2);
        
        for (int i = 0; i < maxSize; i++) {
            if (i < size1) {
                result.add(a.get(i));
            }
            if (i < size2) {
                result.add(b.get(i));
            }
        }
        
        return result;
    }
}
