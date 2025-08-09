// Viết chương trình tính exp theo công thức khai triển Taylor được mô tả trong file Đề bài tinh_exp.pdf
// Khuôn mẫu các phương thức và lớp cần được giữ nguyên 
// Có thể bổ sung thêm các phương thức khác nếu cần!

import java.lang.Math.*;

public class Exp{
    
    // phương thức dblExp tính và trả về giá trị gần đúng của e^x
    public static double dblExp(double x, int n){
        //begin editing 
        double exp = 1.0; // hạng đầu tiên là 1
        double term = 1.0;   // dùng để lưu x^k / k!

        for (int k = 1; k <= n; k++) {
            term = term * x / k; // tính x^k / k! dựa vào term trước
            exp += term;
        }

        return exp;
        //end editing
    }
    
    public static void main(String args[]){
    
    double x = Double.parseDouble(args[0]);
    int n = Integer.parseInt(args[1]);
    
    double exp = dblExp(x, n);
    System.out.println(Math.round(exp*1000.0)/1000.0);

    }
}
