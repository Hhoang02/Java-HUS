import java.util.Scanner;

public class Matrix {

    public static int[][] inputMatrix()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap vao so dong, cot");
        int n = scan.nextInt(); //Dong
        int m = scan.nextInt(); //Cot

        int[][] matrix = new int[n][m];
        for (int i = 0; i<n; i++)
            for (int j = 0; j < m; j++)
            {
                System.out.println("matix["+ i +"]["+ j +"]");
                matrix[i][j] = scan.nextInt();
            }
        return matrix;

    }

    public static void printMatrix(int matrix[][]){
        for (int i = 0; i<matrix.length; i++){
            for (int j = 0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            
            }
            System.out.println();
        }
    }

    public static int findMax(int matrix[][]){
        int max = matrix[0][0];
        for(int i=0; i<matrix.length;i++){
            for(int j=0; j<matrix[i].length;j++)
                if(matrix[i][j] > max)
                    max = matrix[i][j];
        }
        return max;
    }
    public static void main(String[] args) {
        int matrix[][] = inputMatrix();
        printMatrix(matrix);
        System.out.println(findMax(matrix));
    }
}
