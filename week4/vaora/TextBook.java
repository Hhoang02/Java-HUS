public class TextBook extends Book {

	private boolean status;

	public TextBook(String id, String name, int quantity, String publisher, double price, boolean status) {
        super(id, name, quantity, publisher, price); // gọi hàm dựng từ Book
        this.status = status;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public double getAmount() {
		// TODO Auto-generated method stub
        if (status == true) { // Nếu sách còn mới
            return getPrice() * getQuantity();
        } else { // Nếu sách cũ
            return getPrice() * getQuantity() * 0.5;
        }
	}

	@Override
	public String toString() {
		return "TextBook [status=" + status + ", getId()=" + getId() + ", getName()=" + getName() + ", getQuantity()="
				+ getQuantity() + ", getPublisher()=" + getPublisher() + ", getPrice()=" + getPrice() + ", getAmount()="
				+ getAmount() + "]";
	}
}
