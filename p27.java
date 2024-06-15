/*33	Method overloading (Compile time Polymorphism): Write a Java program to create a class called ArrayDemo and overload arrayFunc() function.
void arrayFunc(int [], int)	To find all pairs of elements in an Array whose sum is equal to a givennumber :
Array numbers= [4, 6, 5, -10, 8, 5, 20], target=10
Output :
Pairs of elements whose sum is 10 are :4 + 6 = 10
5 + 5 = 10
-10 + 20 = 10
void arrayFunc(int A[], int p, int B[], int q)	Giventwo sorted arrays A and B of size p and q, Overload method arrayFunc() to merge elements of A with B bymaintaining the sorted order i.e. fill A with first p smallest elements and fill B with remaining elements.
Example: Input :	
	int[] A = { 1, 5, 6, 7, 8, 10 }
int[] B = { 2, 4, 9 }
Output:
Sorted Arrays:
A: [1, 2, 4, 5, 6, 7]
B: [8, 9, 10]
(Use	Compile	time	Polymorphism	MethodOverloading)	*/
import java.util.* ; 
 public class p27{
    public static void main(String [] props){
        Scanner sc = new Scanner(System.in) ;
            int n ; 
           n =  sc.nextInt() ;
           System.out.println("eneter elements") ; 
           int a[] = new int[n] ;
           for(int i= 0 ; i< n ; i++){
            a[i] = sc.nextInt() ;
           } 
         System.out.println("enter size of 2nd elements") ;
         int m = sc.nextInt() ;
          System.out.println("enter elements") ;
          int b[] = new int[m] ; 
          for(int i = 0 ; i < m ; i++){
            b[i] = sc.nextInt() ;
          } 
          voidArrayFunc(a , n) ; 
          voidArrayFunc(a, n, b, m) ; 

    }
    

 static void voidArrayFunc(int a[] , int n ){
     System.out.println("eneter elements whose sum youu want") ;
       Scanner sc = new Scanner(System.in);
     int target = sc.nextInt() ;
     for(int i = 0 ; i< n-1 ; i++){
        for(int  j = i+1 ; j< n ; j++){
            if(a[i]+a[j] == target){
                System.out.println(a[i] + " + " + a[j] + " = " + target) ;
            }
        }
     }
 }
     static void voidArrayFunc(int a[] , int n , int b[] , int m){
        int arr[] = new int[n+m -1 ] ; 
       Arrays.sort(a) ; 
        Arrays.sort(b) ;
        int i = 0  , j = 0 , k = 0  ; 
        while( i<n && j < m ){
            if(a[i]<=b[j]){
                arr[k] = a[i] ; 
                i++  ; 
            }
            else {
                arr[k]  = b[j] ; 
                j++ ; 
            }
            k++ ; 
        }
        while(i<n){
            arr[k] = a[i] ; 
            i++ ; 
            k++ ;
        }
        while(j<m){
            arr[k] = b[j] ; 
            j++ ; 
            k++ ;
        }
        for(int x = 0 ; x<= k ; x++){
            System.out.print(arr[x] + " ") ;
        }
     }  
 

 }