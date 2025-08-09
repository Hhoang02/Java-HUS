package week2;
import java.util.Scanner;

public class ex1 {
    // Nhap n tu ban phim
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("n = ");
        int n = scan.nextInt();  
        
        sochan(n);
        sumsole(n);
        System.out.println("Tong so le la " + sumsole(n));
        socp(n);
        sont(n);


    }
    // cau 1 in ra cac so chan nho hon n
    public static void sochan(int n){
        for (int i = 1; i <=n; i++)
            if (i%2 == 0)
            System.out.println("so chan la " + i);
    }

    // cau 2 tinh tong cac so le
    public static int sumsole(int n){
        int sum = 0;
        for (int i = 1; i <=n; i++)
            if (i%2 != 0)
                sum += i;
        
        return sum;
    }

    // cau 3 kiem tra n co phai so chinh phuong hay ko
    public static void socp(int n){
        if (n % Math.sqrt(n) == 0)
            System.out.println("n la so chinh phuong ");
        else
            System.out.println("n ko phai so chinh phuong");
    }

    // cau 4 kiem tra n co phai so nguyen to hay ko
    public static void sont(int n){
        int sum = 0;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                sum = sum + 1;
        
        if (sum == 0 & n > 1)
            System.out.println("n la so nguyen to");
        else
            System.out.println("n ko phai la so nguyen to");
    }
}
