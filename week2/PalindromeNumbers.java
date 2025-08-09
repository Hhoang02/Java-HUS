import java.util.Scanner;
//in ra cac so doi xung giua M và N
public class PalindromeNumbers{

    //ham kiem tra so nguyen k co la doi xung?
    //@para n kieu in
    //@return boolean
    public static boolean isPalindrome(int k)
    {
        // Noi dung ham o day
        int original = k;
        int reversed = 0;
    
        while (k != 0) {
            int digit = k % 10;
            reversed = reversed * 10 + digit;
            k = k / 10;
        }
    
        if (original == reversed) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số nguyên M: ");
        int m = sc.nextInt();

        System.out.print("nhập số nguyên N: ");
        int n = sc.nextInt();

        int start = Math.min(m, n);
        int end = Math.max(m, n);

        // Liệt kê số đối xứng giữa M và N
        for (int i = start; i <= end; i++) {
            if (isPalindrome(i)) {
                System.out.print(i + " ");
            }
        }

    }

}