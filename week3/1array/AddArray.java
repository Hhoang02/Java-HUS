//  * Chương trình cộng 2 mảng số nguyên: 
//  * Cho phép đọc số nguyên n, và 2 mảng với n phần tử nguyên
//  * Tính và in ra mảng có phần tử là tổng phần tử tương ứng
//  * của 2 mảng nhập vào trên một dòng, cách nhau bởi khoảng trống.
//  * Yêu cầu giữ cấu trúc các hàm/phương thức đã có, có thể bổ sung nếu cần
//  * */

import java.util.Scanner; 

class AddArray{
     
    // hàm/phương thức SumArray trả về tổng 2 mảng nguyên A, B
    // .....{.......}
    public static int[] SumArray(int[] A, int[] B){
        int[] C = new int[A.length];

        for (int i = 0; i < A.length; i++){
            C[i] = A[i] + B[i];
        }

        return C;
    }
    
    // hàm/phương thức printArray để in một mảng A ra màn hình
    public static void PrintArray(int[] A){
        for (int x : A){
            System.out.print(x + " ");
        }
        System.out.println();
    }
    
    public static void main(String args[]){
        //editing
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int arrayA[] = new int[n];
        int arrayB[] = new int[n];

        // System.out.println("Nhap du lieu mang A: ");
        for (int i = 0; i<arrayA.length; i++) {
            arrayA[i] = scan.nextInt();
        }
        
        // System.out.println("Nhap du lieu mang B: ");
        for (int i = 0; i<arrayB.length; i++) {
            arrayB[i] = scan.nextInt();
        }
        
        int[] arraySum = SumArray(arrayA, arrayB);
        PrintArray(arraySum);
        
    }
}
