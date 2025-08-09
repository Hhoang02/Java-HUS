public class Computer {
    
    // khai báo các thuộc tính của một computer
    // tạo tất cả các hàm dựng (có đối và không đối)
    // xây dựng các hàm getter, setter phù hợp với các thuộc tính
    // 
    private String name;
    private String brand;
    private Integer namsx;
    private String cauhinh;
    private Double price;

	
	public Computer() {

	}
	
	public Computer(String name, String manu, int year, String detail, double price) {
        this.name = name;
        this.brand = manu;
        this.namsx = year;
        this.cauhinh = detail;
        this.price = price;
	
	}

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public Integer getNamsx() {
        return namsx;
    }

    public String getCauhinh() {
        return cauhinh;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setNamsx(Integer namsx) {
        this.namsx = namsx;
    }

    public void setCauhinh(String cauhinh) {
        this.cauhinh = cauhinh;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    // Hàm trả về một chuỗi thông tin của một máy tính, mỗi thuộc tính cách nhau một dấu cách
	@Override
	public String toString() {
		return name + " " + brand + " " + namsx + " " + cauhinh + " " + price;
	}
}
