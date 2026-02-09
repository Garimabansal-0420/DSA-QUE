package DSA1;
import java.util.Scanner;

public class SearchInSortedMatrix {
    public static void main() {
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }

        }

        int row=0;
        int col=m-1;
        boolean found =false;
        while(row<n && col>=0){
            if(arr[row][col]==target){
                System.out.println(row + " " + col);
                found=true;
                break;
            }
            else if(arr[row][col]>target){
                col--;
            }
            else{
                row++;
            }
        }
        if(!found){
            System.out.println("Not Found.");
        }
    }
}




