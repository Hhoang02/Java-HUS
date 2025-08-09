import java.util.Scanner;
//Viet chuong trinh kiem tra mot so nguyen duong n nhap tu ban phim co phai la so hoan hao hay khong
/*
 Số hoàn thiện (số hoàn hảo) là số có tổng các ước dương nhỏ hơn nó bằng chính số đó.

Hoàn thiện phương thức isPerfect cho trong lớp PerfectNumber để kiểm tra một số nguyên dương n có phải là số hoàn hảo hay không, trả về đúng hoặc sai.
 */

public class PerfectNumber
{
    public static boolean isPerfect(int n)
    {
        // begin edit
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
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số nguyên dương n: ");
        int n = sc.nextInt();
        
        
        if (isPerfect(n)==true)
            System.out.println("n là số hoàn hảo");

        sc.close();
    }
    
}
