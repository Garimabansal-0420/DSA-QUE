package DSA1;
import java.util.Scanner;

public class SetMatrixZeroes_1st {
    public static void main() {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m= sc.nextInt();
        int [][] matrix=new int[n][m];
        for (int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=sc.nextInt();
                }
            }
        boolean[] row=new boolean[n];
        boolean[] col=new boolean[m];
        for (int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    row[i]=true;
                    col[j]=true;
                }
            }
        }

       for (int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(row[i] || col[j])
                    matrix[i][j]=0;
            }
        }

        for (int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j] );
                }
            }
    }
}
