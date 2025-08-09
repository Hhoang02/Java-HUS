// Bài thực hành in ra các số hoàn hảo nhỏ hơn n với n được nhập từ bàn phím
//Kết quả in trên một dòng các số được cách nhau bởi một dấu cach

/*

Viết chương trình thực hiện in ra số hoàn hảo nhỏ hơn n.

Hoàn thiện các phương thức cho trong lớp NPerfects

Ví dụ: n = 100 kết quả là

6 28

 */

 import java.util.Scanner;

 public class NPerfects
 {
     // Hàm kiểm tra số n có phải là số hoàn hảo hay không
     // nếu n là số hoàn hảo thì trả về true, ngược lại trả về false
     static boolean isPerfect(int n)
     {
         //begin edit
         int tong = 0;
         for(int i=1; i<n; i++){
             if (n%i==0) {
                 tong += i;
             }
         }
         if(tong == n)
             return true;
             return false;
         //end edit
         
     }
     // hàm in ra các số hoàn hảo nhỏ hơn n trên cùng dòng, ví dụ n = 100 kết quả in ra là:
     // 6 28
     
     static void printNPerfect(int n)
     {
         for(int i=1; i<n; i++) {
             if (isPerfect(i) == true) {
                 System.out.print(i + " ");
             }
         }
     }
     public static void main (String args[])
     {
         Scanner sc = new Scanner(System.in);
         System.out.print("nhập số nguyên dương n: ");
         int n = sc.nextInt();
         
         printNPerfect(n);
 
         sc.close();
     }
 }
