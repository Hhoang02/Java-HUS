// Chương trình nhân 2 ma trận
import java.util.Scanner;

public class TimesMatrix {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();

        int[][] matrixA = new int[m][n];
        int[][] matrixB = new int[n][m];

        inputMatrix(matrixA, scan);
        inputMatrix(matrixB, scan);

        int[][] matrixC = NhanMatran(matrixA, matrixB);
        printMatrix(matrixC);
        
    }

    public static void inputMatrix(int[][] matrix, Scanner scan) {
        /* TODO */
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
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

    public static int[][] NhanMatran(int[][] matrixA, int[][] matrixB) {
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int rowsB = matrixB.length;
        int colsB = matrixB[0].length;
    
        // // Kiểm tra điều kiện nhân ma trận: số cột của A = số hàng của B
        // if (colsA != rowsB) {
        //     System.out.println("Không thể nhân hai ma trận: số cột của ma trận A phải bằng số hàng của ma trận B.");
        //     return null;
        // }
    
        // Tạo ma trận kết quả có kích thước rowsA x colsB
        int[][] result = new int[rowsA][colsB];
    
        // Thực hiện phép nhân ma trận
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
    
        return result;
    }
    
}
