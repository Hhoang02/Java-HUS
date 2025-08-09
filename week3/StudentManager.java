package week3;
import java.util.Scanner;
// import week3.Student;

public class StudentManager {

    public static void inputStu(Student s[], Scanner scan){
        for(int=0; i<n; i++){
            String id = scan.nextLine();
            String name = scan.nextLine();
            String hometown = scan.nextLine();
            boolean isMale = Boolean.parseBoolean(scan.nextLine());
            double score = Double.parseDouble(scan.nextLine());
            
            s[i] = new Student(id, name, hometown, isMale, score);


        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập vào số sinh viên n = ");
        int n = scan.nextInt();






        // Student s = new Student();
        // s.name = "Kinh";
        // System.out.println(s.name);

        // Student a = new Student("001", "Hoang", "DA", false, 5.5);
        // System.out.println(a.name);
        // System.out.println(a.toString());
    }
    
}
