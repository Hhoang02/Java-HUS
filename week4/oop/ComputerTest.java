import java.util.Scanner;

public class ComputerTest {
	
	private Computer computers[];
	private int n;
	
	// Hàm nhập vào số n và một mảng gồm thông tin của n máy tính
	public void input(Scanner scan)
	{
        n = Integer.parseInt(scan.nextLine());

        // Cấp phát mảng studentArray
        computers = new Computer[n];

        for (int i = 0; i < n; i++) {
            // System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");

            String name = scan.nextLine();

            String brand = scan.nextLine();

            Integer namsx = Integer.parseInt(scan.nextLine());

            String cauhinh = scan.nextLine();

            double price = Double.parseDouble(scan.nextLine());

            // Khởi tạo đối tượng Student và gán vào mảng
            computers[i] = new Computer(name, brand, namsx, cauhinh, price);
        }
	}
	
	// in ra các máy tính, mỗi thông tin của một máy tính trên một dòng
	public void output()
	{
        for (int i = 0; i < n; i++) {
            System.out.println(computers[i].toString());
        }
	}
	
	// Trả về giá trung bình của các máy tính
	public double getAvgPrice()
	{   
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += computers[i].getPrice();
        }
    
        if (n == 0) return 1.0;  // Tránh chia cho 0
        return sum / n;
	}
	
	// In ra các máy tính có giá cao nhất
	public void getMaxPrice()
	{    
        double max = computers[0].getPrice();
        for (int i = 0; i < n; i++) {
            if (max < computers[i].getPrice()){
                max = computers[i].getPrice();
            }     
        }

        // System.out.println("Các máy tính có giá cao nhất (" + max + "):");
        for (int i = 0; i < n; i++) {
            if (computers[i].getPrice() == max) {
                System.out.println(computers[i].toString());
            }
        }
	}
	
	// In ra các máy tính có nhà sản xuất là Dell
	public void getDell()
	{
        for (int i = 0; i < n; i++) {
            if (computers[i].getBrand().equalsIgnoreCase("Dell")) {
                System.out.println(computers[i].toString());
            }
        }
        
	
	}
	
	// Sắp xếp các máy tính theo chiều giảm dần của giá, và in ra mảng sau khi sắp xếp
	public void sort()
	{
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (computers[i].getPrice() < computers[j].getPrice()) {
                    // Đổi chỗ hai phần tử
                    Computer temp = computers[i];
                    computers[i] = computers[j];
                    computers[j] = temp;
                }
            }
        }
    
        // In ra sau khi sắp xếp
        // System.out.println("Danh sách máy tính sau khi sắp xếp theo giá giảm dần:");
        for (int i = 0; i < n; i++) {
            System.out.println(computers[i].toString());
        }
	}
	
	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ComputerTest computerTest = new ComputerTest();

        computerTest.input(scan);

	}

}
