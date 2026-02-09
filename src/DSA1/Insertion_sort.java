package DSA1;
import java.util.Scanner;

public class Insertion_sort {
    public static void main() {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i =0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
            for(int i=1;i< arr.length;i++){
            int j=i-1;
            int temp=arr[i];
            while(j>=0 && temp<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        System.out.println("after insertion sort");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
