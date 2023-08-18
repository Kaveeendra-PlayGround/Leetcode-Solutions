import java.util.Arrays;

public class Leetcode867TransposeMatrix{

    public static void main(String[] args) {
        

    }

    public static int[][] transpose (int[][] matrix){

        int [][]matrix2 = new int [matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                matrix2[j][i] = matrix [i][j];
                
            }
            
        }
        return matrix2;
        
    }
    
}