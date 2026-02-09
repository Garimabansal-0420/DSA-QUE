// for square matrix only.
package DSA1;

public class SetMatrixZeroes_2nd {
    public static void main(String[] args) {
        int[][] matrix={
                {1,2,3},
                {4,0,6},
                {7,8,9}
        };
        boolean[] row=new boolean[matrix.length];
        boolean[] col=new boolean[matrix.length];
        for(int i=0;i<matrix.length;i++){                                   //SET MATRIX ZERO
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    row[i]=true;
                    col[j]=true;
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(row[i] || col[j]){
                    matrix[i][j]=0;
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
