public class Baby {
    
    // khai báo các thuộc tính của một baby
    // tạo tất cả các hàm dựng (có đối và không đối)
    // xây dựng các hàm getter, setter phù hợp với các thuộc tính
    private String day = "01/01/2020";
    private String name = "UnRegistered";
    private boolean gender;
    private double weight, length;
	public Baby() {
	}

	public Baby(String bbName, String bbNamebbDay, boolean bbGender, double bbWeight, double bbLength) {
        this.day = bbNamebbDay;
        this.name = bbName;
        this.gender = bbGender;
        this.weight = bbWeight;
        this.length = bbLength;
	}
    
    public String getName() {
        return name;
    }

    public String getDay() {
        return day;
    }

    public String getGender() {
        return gender ? "Girl" : "Boy";
    }

    public double getWeight() {
        return weight;
    }

    public double getLength() {
        return length;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setLength(double length) {
        this.length = length;
    }
    /*
        Lưu ý, đối với hàm public String getGender() sẽ trả về Boy nếu gender = false, ngược lại trả về "Girl"
    */
    // in ra thong tin cua baby theo thu tu: ten, ngay thang nam sinh, gioi tinh, can nang, chieu cao
	public String toString() {
	    return getName() + " " + this.day + " " + getGender() + "  " + this.length + " " + this.weight;
	}

}
