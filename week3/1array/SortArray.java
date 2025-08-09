import java.util.Scanner;

public class SortArray {

    public static int[] SortHoang(int[] array){
        int[] x = array.clone(); 

        for (int i = 0; i < x.length - 1; i++) {
            for (int j = 0; j < x.length - 1 - i; j++) {
                if (x[j] > x[j + 1]) {
                    int temp = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = temp;
                }
            }
        }
        return x;
    } 

    public static void PrintArray(int[] A){
        for (int x : A){
            System.out.print(x + " ");
        }
        System.out.println();
    } 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int arrayA[] = new int[n];
        for (int i = 0; i<arrayA.length; i++) {
            arrayA[i] = scan.nextInt();
        }

        int[] new_array = SortHoang(arrayA);
        PrintArray(new_array);
    }
}
