// 1st method in this time complexity is larger and space complexity is smaller
/*package Recursion;
import java.util.Scanner;

public class Fibonacci {
    public static int Fibonacci_Series(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return Fibonacci_Series(n-1) + Fibonacci_Series(n-2);
    }
    public static void main() {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print(Fibonacci_Series(i)+" ");
        }
    }
}*/

// 2nd method in this time complexity is smaller and space complexity is larger

package Recursion;
import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    public static int[] arr;
    public static int Fib(int n) {
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        if(arr[n]!=-1)
            return arr[n];
        arr[n]= Fib(n-1) + Fib(n-2);
        return arr[n];
    }
    public static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        arr=new int[n];
        Arrays.fill(arr,-1);
        for(int i=0;i<n;i++){
        System.out.print(Fib(i) + " ");
        }
    }
}
