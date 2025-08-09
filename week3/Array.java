import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Nhap vao so phan tu cua mang
        System.out.print("Nhap vao so phan tu cua mang: n = ");
        int n = scan.nextInt();

        int[] array = new int[n];

        // Nhap(array, scan);
        // Xuat(array);
        System.out.println("mang array2[]");
        int array2[] = Nhap2(scan);
        Xuat(array2);
        Tong(array2);
        int tong2 = Tong2(array2);
        System.out.println("Tong 2 =" + tong2);

    }
        // array[0] = 2;
        // array[1] = 2;

        // int array1[] = {1,2,3,4,5};

        // System.out.println("Phan tu dau tien cua mang la " + array[1]);
        // System.out.println("Phan tu dau tien cua mang array1 la " + array1.length);
    // cach 2 Dung ham co tra ve gia tri
    public static int[] Nhap2(Scanner scan)
    {
        System.out.print("Nhap vao so phan tu cua mang: n = ");
        int n = scan.nextInt();
        // Nhap tu ban phim
        int array[] = new int[n];
        System.out.println("Nhap vao cac phan tu cua mang");
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }

        return array;
    }
    
    public static void Nhap(int array[], Scanner scan) 
    {
        // Nhap tu ban phim
        System.out.println("Nhap vao cac phan tu cua mang");
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }

    }

    public static void Xuat(int array[]) 
    {
        // in mang
        System.out.println("In mang vua nhap");
        for (int i = 0; i<array.length; i++) {
            System.out.print(array[i] + "\t");
        }

    }

    public static void Tong(int array[])
    {   
        int tong = 0;
        for (int i=0; i < array.length; i++){
            tong += array[i];
        }
    System.out.println("tong =" + tong);
    }

    // cach 2
    public static int Tong2(int array[])
    {   
        int tong = 0;
        for (int i=0; i < array.length; i++){
            tong += array[i];
        }
        return tong;
    }
}
    
