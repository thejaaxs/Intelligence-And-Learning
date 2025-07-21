import java.util.Scanner;

public class matrixAddition {

    static int[][] addMatrices(int matrix1[][], int matrix2[][]) {
        if (matrix1 == null || matrix2 == null || matrix1.length == 0 || matrix2.length == 0
                || matrix1.length != matrix2.length) {
            return null;
        }
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter Number Of Rows : ");
            int rows = sc.nextInt();
            System.out.println("Enter Number Of Columns : ");
            int cols = sc.nextInt();

            if (rows <= 0 || cols <= 0) {
                System.out.println("Invalid Matrix Dimension");
                return;
            }

            int matrix1[][] = new int[rows][cols];
            int matrix2[][] = new int[rows][cols];

            System.out.println("Enter Element Of Matrix 1 : ");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix1[i][j] = sc.nextInt();
                }
            }

            System.out.println("Enter Element Of Matrix 2 : ");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix2[i][j] = sc.nextInt();
                }
            }
            int result[][] = addMatrices(matrix1, matrix2);
            if(result==null){
                System.out.println("Matrix Addition Invalid !");
            }
            else {
                System.out.println("Resultant Matrix : ");
                for(int[] row : result){
                    for(int num : row){
                        System.out.print(num+" ");
                    }
                    System.out.println();
                }
            }
        } catch (Exception e) {
            System.out.println("Invalid Matrix Dimensions");
        } finally {
            sc.close();
        }
    }
}
