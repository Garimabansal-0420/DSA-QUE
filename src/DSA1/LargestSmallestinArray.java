package DSA1;
import java.util.*;

public class LargestSmallestinArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];

        if(n==0){
            System.out.println("Array is Empty.");
            return;
        }
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int lar=arr[0];
        int small=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>lar ){
                lar=arr[i];
            }
            if(arr[i]<small){
                small=arr[i];
            }
        }
        System.out.println("Largest Element : " + lar);
        System.out.println("Smallest Element : " + small);
    }
}
