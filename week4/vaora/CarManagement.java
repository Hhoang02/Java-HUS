import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CarManagement {
	
	// Hàm dựng 
	public CarManagement(){
		super();
	}
	
	// Phương thức readData() cho phép đọc dữ liệu từ tệp văn bản
	/*
	    Thứ tự nhập như sau:
	    - Nhập số lượng xe
	    - Trong vòng lặp với mỗi loại xe:
	       - Nhập 1 số nguyên c, c = 0 là ServiceCar, c = 1 là SportCar
	       - Nhập thông tin của các xe: id, name, manufacturer, hours, price, fee (Đối với ServiceCar, tax với SportCar)
	*/
	
	public ArrayList<Car> readData(String fileName) {
        ArrayList<Car> cars = new ArrayList<>();
        try {
            Scanner sc = new Scanner(new File(fileName));
            int n = Integer.parseInt(sc.nextLine());  // Số lượng xe
    
            for (int i = 0; i < n; i++) {
                int type = Integer.parseInt(sc.nextLine());  // 0 = ServiceCar, 1 = SportCar
    
                String id = sc.nextLine();
                String name = sc.nextLine();
                String manufacturer = sc.nextLine();
                double hours = Double.parseDouble(sc.nextLine());
                double price = Double.parseDouble(sc.nextLine());
    
                if (type == 0) {
                    double fee = Double.parseDouble(sc.nextLine());
                    cars.add(new ServiceCar(id, name, manufacturer, hours, price, fee));
                } else {
                    double tax = Double.parseDouble(sc.nextLine());
                    cars.add(new SportCar(id, name, manufacturer, hours, price, tax));
                }
            }
    
            sc.close();
        } catch (Exception e) {
            e.printStackTrace(); // chỉ in lỗi nếu có, không xử lý gì thêm
        }
    
        return cars;
	}
	
	// Phương thức in danh sách thông tin liên quan các loại xe trong mảng
	public void printCars(ArrayList<Car> cars) {
		for (int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i).toString());
		}
	}
	
	// Phương thức xuất ra danh sách những xe có tên nhà sản xuất là "manuName"
	public ArrayList<Car> findCars(ArrayList<Car> cars, String manuName){
        ArrayList<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.getManufacturer().equalsIgnoreCase(manuName)) {
                result.add(car);
            }
        }
        return result;
	}
	
	// Phương thức xuất ra danh sách những xe giá thành tiền (amount) cao nhất thuộc loại typeOfCars
	
	public ArrayList<Car> getMaxAmount(ArrayList<Car> cars, String typeOfCars){
		
        ArrayList<Car> result = new ArrayList<>();
        double maxAmount = 0;
    
        // Bước 1: Tìm giá trị amount lớn nhất của đúng loại xe
        for (Car car : cars) {
            if (typeOfCars.equalsIgnoreCase("SportCar") && car instanceof SportCar) {
                if (car.getAmount() > maxAmount) {
                    maxAmount = car.getAmount();
                }
            } else if (typeOfCars.equalsIgnoreCase("ServiceCar") && car instanceof ServiceCar) {
                if (car.getAmount() > maxAmount) {
                    maxAmount = car.getAmount();
                }
            }
        }
    
        // Bước 2: Lấy tất cả các xe có amount bằng maxAmount
        for (Car car : cars) {
            if (typeOfCars.equalsIgnoreCase("SportCar") && car instanceof SportCar) {
                if (car.getAmount() == maxAmount) {
                    result.add(car);
                }
            } else if (typeOfCars.equalsIgnoreCase("ServiceCar") && car instanceof ServiceCar) {
                if (car.getAmount() == maxAmount) {
                    result.add(car);
                }
            }
        }
    
        return result;
		
	}
	
	// Phướng thức sắp xếp giá thành tiền các loại xe theo thứ tự giảm dần
	public void sortByAmount(ArrayList<Car> cars){
		//Begin editable part
        for (int i = 0; i < cars.size() - 1; i++) {
            for (int j = i + 1; j < cars.size(); j++) {
                if (cars.get(i).getAmount() > cars.get(j).getAmount()) {
                    // hoán đổi
                    Car tmp = cars.get(i);
                    cars.set(i, cars.get(j));
                    cars.set(j, tmp);
                }
            }
        }
	}
// Hàm main 
    public static void main(String[] args)  {
        CarManagement carManag = new CarManagement();
        ArrayList<Car> cars = carManag.readData("data.txt");
    //	carManag.printCars(cars);
        
        for (int i = 0; i < cars.size(); i++) {
            System.out.print(cars.get(i).getAmount() + " ");
        }
        System.out.println();
        ArrayList<Car> carsList = carManag.findCars(cars,"honda");
        carManag.printCars(carsList);
        
        ArrayList<Car> carsList1 = carManag.getMaxAmount(cars, "SportCar");
        carManag.printCars(carsList1);
        
        carManag.sortByAmount(cars);
        carManag.printCars(cars);
			
		}
}
