import java.util.Scanner;

public class StudentManager{
    
    private Student[] studentArray;
    private int n;
   
    // Nhập số sinh viên n và danh sách sinh viên từ bàn phím
    // Chú ý việc đọc dữ liệu, Có thể đọc dữ liệu theo từng dòng, rồi dùng các phương thức parse tương ứng với từng loại dữ liệu để chuyển sang kiểu dữ liệu mong muốn
    // Ví dụ đọc vào  số sinh viên trên dòng đầu tiên  n = Integer.parseInt(reader.nextLine());
    //       Đọc vào điểm số double diemso = Double.parseDouble(reader.nextLine());        
    // Sinh viên vẫn có thể đọc dữ liệu theo từng kiểu riêng như nextInt, nextDouble(),.. Nhưng cần chú ý đến việc chuyển con trỏ đến dòng tiếp theo nếu muốn đọc vào 1 dòng 
    // bằng lệnh nextLine();
    public void inputStudents()
    {
        // Chú ý tạo đối tượng Scanner để đọc dữ liệu
        // Không khai báo biến n mới, dùng biến n của lớp
        // Khai báo cấp phát cho mảng studentArray với kích thước n
        // Mỗi phần tử trong mảng studentArray là 1 đối tượng Student, cần được khởi tạo.
        Scanner reader = new Scanner(System.in);

        // Nhập số sinh viên
        // System.out.print("Nhập số sinh viên: ");
        n = Integer.parseInt(reader.nextLine());

        // Cấp phát mảng studentArray
        studentArray = new Student[n];

        // Nhập từng sinh viên
        for (int i = 0; i < n; i++) {
            // System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");

            // System.out.print("Họ tên: ");
            String name = reader.nextLine();

            // System.out.print("Mã sinh viên: ");
            String id = reader.nextLine();

            // System.out.print("Điểm: ");
            double score = Double.parseDouble(reader.nextLine());

            // Khởi tạo đối tượng Student và gán vào mảng
            studentArray[i] = new Student(name, id, score);
        }

    }
    
    public void printStudents()
    {
        // System.out.println("\nDanh sách sinh viên:");
        for (int i = 0; i < n; i++) {
            studentArray[i].printInfor();
        }
    }
    
    public static void main(String[] args)
    {
       
        StudentManager studentmanager = new StudentManager();
        studentmanager.inputStudents();
        studentmanager.printStudents();
        
    }
    
    
}
