// /**
//  * 
// Hoàn thiện các hàm isTriangle(double x1, double y1, double x2, double y2, double x3, double y3) và isRightTriangle(double x1, double y1, double x2, double y2, double x3, double y3)  cho trong lớp Triangle. 

// Hàm isTriangle kiểm tra ba tọa độ thực (x1, y1); (x2, y2) và (x3, y3)  có lập thành ba đỉnh của tam giác hay không, nếu đúng thì trả về true; ngược lại trả về false.

// Hàm isRightTriangle kiểm tra ba tọa độ thực (x1, y1); (x2, y2) và (x3, y3)  có lập thành ba đỉnh của tam giác vuông hay không, nếu đúng thì trả về true; ngược lại trả về false.

// (được dùng cấu trúc if ... else  và cũng có thể không dùng nếu thấy không cần thiết). 
//  */

//  public class Triangle
//  {
//      static boolean isTriangle(double x1, double y1, double x2, double y2, double x3, double y3)
//      {
//          // begin edit 
//          double s = (Math.abs(x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2)))/2;
//          if (s != 0)
//              return true;
//              return false;
//          //end edit
//      }
//      static boolean isRightTriangle(double x1, double y1, double x2, double y2, double x3, double y3)
//      {
//          // begin edit 
//          double a2 = Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2);
//          double b2 = Math.pow(x3 - x2,2) + Math.pow(y3 - y2,2);
//          double c2 = Math.pow(x1 - x3,2) + Math.pow(y1 - y3,2);  
 
//          if ((isTriangle(x1, y1, x2, y2, x3, y3) == true) & (a2==b2+c2 | b2==a2+c2 | c2==a2+b2))
//              return true;
//              return false;
//          //end edit         
//      }
//      public static void main(String [] args)
//      {
//          double x1 = Double.parseDouble(args[0]);
//          double y1 = Double.parseDouble(args[1]);
//          double x2 = Double.parseDouble(args[2]);
//          double y2 = Double.parseDouble(args[3]);
//          double x3 = Double.parseDouble(args[4]);
//          double y3 = Double.parseDouble(args[5]);
 
//          isTriangle(x1, y1, x2, y2, x3, y3);
//          isRightTriangle(x1, y1, x2, y2, x3, y3);
 
//      }
//  }

public class Triangle
{
    static boolean isTriangle(double a, double b, double c)
    {
        // begin edit 
        if (a > 0 && b >0 && c > 0 
            && a + b > c && a + c > b 
            && b + c > a)

            return true;
            return false;
        //end edit
    }
    static double getArea(double a, double b, double c)
    {
        // begin edit 
            double s = (a + b + c)/2;
            return Math.sqrt(s * (s - a) * (s - b) * (s - c));
        //end edit         
    }
    public static void main(String [] args)
    {
         double a = Double.parseDouble(args[0]);
         double b = Double.parseDouble(args[1]);
         double c = Double.parseDouble(args[2]);
 
         if (isTriangle(a, b, c) == true){
            double area = getArea(a, b, c);
            System.out.println(area);
        }
        else 
            System.out.println(0);  
    }
}