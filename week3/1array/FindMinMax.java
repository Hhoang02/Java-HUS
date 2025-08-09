/**
 * Chương trình nhập một số nguyên n và mảng gồm n số nguyên
 * sau đó in ra giá trị nhỏ nhất và lớn nhất của mảng trên cùng dòng, 
 * cách nhau bởi một khoảng trống. Cần giữ khung chương trình.
 * */
//import <libraries needed here>
import java.util.Scanner;

public class FindMinMax{
    
    public static int findMax(int Array[]){
        //editing here
        int max = Array[0];
        for (int i = 0; i<Array.length; i++) {
            if (Array[i] > max)
                max = Array[i];
        }
        return max;
    }
    
    public static int findMin(int Array[]){
        //editing here
        int min = Array[0];
        for (int i = 0; i<Array.length; i++) {
            if (Array[i] < min)
                min = Array[i];
        }
        return min;
    }
    
    public static void main(String args[]){
        // editing here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int arrayA[] = new int[n];
        for (int i = 0; i<arrayA.length; i++) {
            arrayA[i] = scan.nextInt();
        }

        int min = findMin(arrayA);
        int max = findMax(arrayA);

        System.out.print(min + " " + max);


    }
    
}
