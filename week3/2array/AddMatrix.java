/** 
* Program to add two matrices
*/

import java.util.Scanner;

public class AddMatrix {
    public static void main(String[] args) {
        // input rows
        // inputs columns
        // if using inputMatrix, allocate matrix first, and then pass matrix to inputMatrix method
        // if using generateMatrix, pass rows and columns to generateMatrix method, and then allocate matrix
        // call addMatrix to add the matrices
        // print matrix
        /* TODO */
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();

        int[][] matrixA = new int[m][n];
        int[][] matrixB = new int[m][n];

        inputMatrix(matrixA, scan);
        inputMatrix(matrixB, scan);

        int[][] matrixC = addMatrix(matrixA, matrixB);
        print(matrixC);

    }
    
    public static void inputMatrix(int[][] matrix, Scanner scan) {
        /* TODO */
        // Scanner scan = new Scanner(System.in);
        // int m = scan.nextInt();
        // int n = scan.nextInt();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
    }
    
    // public static void generateMatrix(int rows, int columns, Scanner keyboard) {
    //     /* TODO */
    // }
    
    public static int[][] addMatrix(int[][] leftMatrix, int[][] rightMatrix) {
        /* TODO */
        int[][] matrix = new int[leftMatrix.length][leftMatrix[0].length];

        for (int i = 0; i<leftMatrix.length; i++){
            for (int j = 0; j<leftMatrix[i].length; j++){
                matrix[i][j] = 2*leftMatrix[i][j] + 3*rightMatrix[i][j];
            }
        }
        return matrix;
    }
    
    public static void print(int[][] matrix) {
        /* TODO */
        for (int i = 0; i<matrix.length; i++){
            for (int j = 0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            
            }
            System.out.println();
        }
    }
}