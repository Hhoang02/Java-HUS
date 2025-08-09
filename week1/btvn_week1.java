package week1;
import java.util.Scanner;

public class btvn_week1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập hai số nguyên
        System.out.print("Nhập số nguyên a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập số nguyên b: ");
        int b = scanner.nextInt();

        // 1. Tinh tổng, hiệu, tích
        int tong = a + b;
        int hieu = a - b;
        int tich = a * b;
        double thuong = a/b;

        System.out.println("\nKết quả tính toán:");
        System.out.println("Tổng = " + tong);
        System.out.println("Hiệu = " + hieu);
        System.out.println("Tích = " + tich);
        System.out.println("Thương = " + thuong);

        // 2. Tìm số lớn hơn
        if (hieu > 0) {
            System.out.println("a là số lớn hơn");
        } else if (hieu == 0) {
            System.out.println("a bằng b");
        } else {
            System.out.println("b là số lơn hơn");
        }

        // 3. Kiểm tra a có phải số chẵn hay không
        if (a % 2 == 0) {
            System.out.println("a là số chẵn");
        } else {
            System.out.println("a là số lẻ");
        }
    }
}