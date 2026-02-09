package DSA1;
import java.util.Scanner;
/*
public class MeanMax4_OfArr {
    public static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int winsum=0;
        int k=4;
        for(int i=0;i<k;i++){
            winsum=winsum+arr[i];
        }
        int max=winsum;
        for(int i=k;i<arr.length;i++){
            winsum+=arr[i];
            winsum-=arr[i-k];
            if(winsum>max){
                max=winsum;
            }
        }
        System.out.println((double)(max/k));
    }
}



*/


public class MeanMax4_OfArr {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k=4;
        int foursum=0;
        for(int i=0;i<k;i++){
            foursum=foursum+arr[i];
        }
        int max=foursum;
        for(int i=k;i<arr.length;i++){
            foursum+=arr[i];
            foursum-=arr[i-k];
            if(foursum>max){
                max=foursum;
            }
        }
        System.out.println((double)(max/k));

    }
}
