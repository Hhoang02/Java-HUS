package week2;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("a = ");
        int a = scan.nextInt();  

        System.out.print("b = ");
        int b = scan.nextInt();

        System.out.print("c = ");
        int c = scan.nextInt();

        if (tamgiaccheck(a, b, c) == true){
            System.out.println("3 canh a, b, c tao thanh 1 tam giac");
            chuvi(a, b, c);
            dientich(a, b, c);
        }
        else 
            System.out.println("3 canh a, b, c khong tao thanh 1 tam giac");

    }

    public static boolean tamgiaccheck(int a, int b, int c){
        if(a > 0 & b >0 & c > 0 & a + b > c & a + c > b & b + c > a)
            return true;
            return false;
            // System.out.println("3 canh a, b, c khong tao thanh 1 tam giac");

    }

    public static void chuvi(int a, int b, int c){
        double tong = a + b + c;
        System.out.println("chu vi tam gia la: " + tong);
    }

    public static void dientich(int a, int b, int c){
        double s = (a + b + c)/2;
        double dientich = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("chu vi tam gia la: " + dientich);
    }

}
