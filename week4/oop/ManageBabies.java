import java.util.Arrays;
import java.util.Scanner;

public class ManageBabies {
	
    private Baby[] babyArray;
    private int n;
	
	/*  Nhap vao thong tin cua n baby tu ban phim. Cac thong tin theo thu tu ten, ngay thang nam sinh, gioi tinh
	gioi tinh, can nang, chieu cao
	*/
	
	// nhap vao so nguyen duong n va thong tin cua n baby
	Baby[] createData (Scanner sc)
	{
        n = Integer.parseInt(sc.nextLine());

        // Cấp phát mảng studentArray
        babyArray = new Baby[n];

                // Nhập từng sinh viên
        for (int i = 0; i < n; i++) {
            // System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");

            String name = sc.nextLine();

            String dob = sc.nextLine();

            boolean gender = Boolean.parseBoolean(sc.nextLine());

            double weight = Double.parseDouble(sc.nextLine());

            double length = Double.parseDouble(sc.nextLine());

            // Khởi tạo đối tượng Student và gán vào mảng
            babyArray[i] = new Baby(name, dob, gender, weight, length);
        }
        return babyArray;
	}
	
	 // In ra thong tin cua n baby sau khi chuan hoa ho ten
	void printInforBabies (Baby babies[])
	{
        for (int i = 0; i < n; i++) {
            System.out.println(babies[i].toString());
        }
	}
	// Sap xep cac baby theo trong luong giam dan
	void sortWeight (Baby babies[])
	{
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (babies[i].getWeight() < babies[j].getWeight()) {
                    // Hoán đổi 2 đối tượng baby
                    Baby temp = babies[i];
                    babies[i] = babies[j];
                    babies[j] = temp;
                }
            }
        }
	}
	// Loc ra tat ca nhung baby co gioi tinh la gender
	void filterGender(Baby babies[], String gender)
	{
        for (Baby baby : babies) {
            if (baby.getGender().equalsIgnoreCase(gender)) {
                System.out.println(baby.toString());
            }
        }
	}
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ManageBabies babiesManager = new ManageBabies();
    
        Baby[] babies = babiesManager.createData(sc);
        babiesManager.sortWeight(babies);
        babiesManager.printInforBabies(babies);

	}

}
