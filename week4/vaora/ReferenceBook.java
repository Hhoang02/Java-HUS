public class ReferenceBook extends Book{
	private double tax;
	public ReferenceBook(String id, String name, int quantity, String publisher, double price) {
		
		// TODO Auto-generated constructor stub
		super(id, name, quantity, publisher, price); // gọi hàm dựng từ Book
	}
	
	public ReferenceBook(String id, String name, int quantity, String publisher, double price,
			double tax) {
		super(id, name, quantity, publisher, price);
		this.tax = tax;
	}

	public double getTax() {
		return tax;
	}
	public void setTax(double price) {
		this.tax = price;
	}

	@Override
	public double getAmount() {
		// TODO Auto-generated method stub
        return getPrice() * getQuantity() + getTax();
	}

	@Override
	public String toString() {
		return "ReferenceBook [tax=" + tax + ", getId()=" + getId() + ", getName()=" + getName() + ", getQuantity()="
				+ getQuantity() + ", getPublisher()=" + getPublisher() + ", getPrice()=" + getPrice()+ ", getAmount()=" + getAmount() +  "]";
	}
}
