// Hoàn thiện hàm kiểm tra số nguyên tố isPrime
// Sinh viên có thể viết thêm các hàm khác nếu cần, tuy nhiên cần giữ nguyên khuôn mẫu hàm isPrime


public class NumberProps{
    
    //Sinh viên hoàn thiện hàm isPrime, giữ nguyên nguyên mẫu hàm
    public static boolean isPrime(int k){
        int sum = 0;
        for (int i = 2; i <= Math.sqrt(k); i++)
            if (k % i == 0)
                sum = sum + 1;
        
        if (sum == 0 & k > 1)
        return true;
        return false;
    }
    public static void main (String[] args) {
    int k = Integer.parseInt(args[0]);

    isPrime(k);
    }
}
