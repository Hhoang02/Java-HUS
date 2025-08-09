import java.util.Scanner;

public class DayTang {
    
    public static boolean Check(int array[]){
        int sum = 0;
        for (int i = 0; i<array.length - 1; i++) {
            if (array[i] < array[i+1]) {
                sum += 1;
            }
        }
        if (sum == array.length - 1){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int arrayA[] = new int[n];
        for (int i = 0; i<arrayA.length; i++) {
            arrayA[i] = scan.nextInt();
        }

        if (Check(arrayA) == true) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
