/** 
* Nhập ma trận matrixA cỡ rows x columns, sau đó in ra tổng các phần tử của các cột.
*/
 
import java.util.Scanner;

public class SumColumns {
    public static void main (String[] args) {
        // input rows
        // input columns
        // call inputMatrix method to input values of the matrix, or call generateMatrix to generate a matrix
        // call sumColumns to sum columns of the matrix
        // print array
        /* TODO */
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();

        int[][] matrixA = new int[m][n];
        inputMatrix(matrixA, scan);

        int[] tong = sumColumns(matrixA);
        printArray(tong);


    }
    
    public static void inputMatrix(int[][] matrix, Scanner scan) {
        /* TODO */
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
    } 
    
    public static void generateMatrix(int rows, int columns, Scanner scan) {
        /* TODO */
        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scan.nextInt(); // ví dụ: 0–99
            }
        }
    }
    
    public static int[] sumColumns(int[][] matrix) {
        /* TODO */
        int tongcol[] = new int[matrix[0].length];

        for (int i = 0; i<matrix.length; i++){
            for (int j = 0; j<matrix[i].length; j++){
            tongcol[j] += matrix[i][j];
            }
        }
        return tongcol;

    }
    
    public static void printMatrix(int[][] matrix) {
        /* TODO */
        for (int i = 0; i<matrix.length; i++){
            for (int j = 0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            
            }
            System.out.println();
        }
    }
    
    public static void printArray(int[] array) {
        /* TODO */
        for (int x : array){
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
