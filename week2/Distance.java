public class Distance {
    public static void main (String[] args) {
        // Nhận 4 đối số từ dòng lệnh: x1 y1 x2 y2
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);

        // Tính khoảng cách Euclid
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // Làm tròn đến 2 chữ số thập phân
        distance = Math.round(distance * 100.0) / 100.0; 
        System.out.println(distance);      
    }
}
