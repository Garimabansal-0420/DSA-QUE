package DSA1;
import java.util.*;

public class SecondLargestinArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int lar=arr[0];
        int seclar=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]>lar){
                seclar=lar;
                lar=arr[i];
            }
            else if(arr[i]<lar && arr[i]>seclar){
                seclar=arr[i];
            }
        }
        System.out.println("Second Largest Element is : " + seclar);
    }
}
