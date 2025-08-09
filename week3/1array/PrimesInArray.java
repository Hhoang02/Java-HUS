import java.util.Scanner;

public class PrimesInArray {
    public static boolean IsPrime(int n){
        int sum = 0;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                sum = sum + 1;
        
        if (sum == 0 & n > 1)
            return true;
        else
            return false;
    }

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();    
        
        int arrayA[] = new int[n];
        for (int i = 0; i<arrayA.length; i++) {
            arrayA[i] = scan.nextInt();
        }
        
        for (int x : arrayA){
            if (IsPrime(x) == true){
                System.out.print(x + " ");
            }

        }

    }
    
}
