public class AverageThree {

    public static void main (String[] args) {
        // Nhận 4 đối số từ dòng lệnh: x1 y1 x2 y2
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        double average = (a + b + c)/3;
        System.out.println(average);  
    }
}
