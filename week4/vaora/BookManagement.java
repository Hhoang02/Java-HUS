import java.util.ArrayList;
import java.util.Scanner;

public class BookManagement {
    /* Thứ tự nhập
        +) Số lượng các cuốn sách

        +) 1 số nguyên 0 hoặc 1 (nếu 0 là sách tham khảo, 1 là sách giáo khoa)

        +)  id (mã sách), name (tên sách), quantity (số lượng), publisher (NXB), price (giá)

        +)  status (trạng thái) với sách giáo khoa,  tax (thuế) đối với sách tham khảo.
    */

	public Book[] readData(Scanner sc) {
		int n = Integer.parseInt(sc.nextLine());
		Book[] books = new Book[n];

		for (int i = 0; i < n; i++) {
			int type = Integer.parseInt(sc.nextLine()); // 0: ReferenceBook, 1: TextBook
	
			String id = sc.nextLine();
			String name = sc.nextLine();
			int quantity = Integer.parseInt(sc.nextLine());
			String publisher = sc.nextLine();
			double price = Double.parseDouble(sc.nextLine());
	
			if (type == 1) {
				boolean status = Boolean.parseBoolean(sc.nextLine());
				books[i] = new TextBook(id, name, quantity, publisher, price, status);
			} else {
				double tax = Double.parseDouble(sc.nextLine());
				books[i] = new ReferenceBook(id, name, quantity, publisher, price, tax);
			}
		}
		return books;
	}
    // In thong tin các cuốn sách
	public void printBooks(Book[] books) {
		for (Book i : books) {
            System.out.println(i);
        }
	}
    // Tìm các cuốn sách của nhà xuất bản publisher
	public ArrayList<Book> findBooks(Book[] books, String publisher) {
		ArrayList<Book> result = new ArrayList<>();
		for (Book b : books) {
			if (b.getPublisher().equalsIgnoreCase(publisher)) {
				result.add(b);
			}
		}
		return result;

	}
    // Tính giá trị trung bình của các cuốn sách thuộc thể loại typeOfBooks
	public double computeAverage(Book[] books, String typeOfBooks) {
		double totalAmount = 0; // Tổng số tiền của các sách cần tính
		int bookCount = 0;      // Số lượng sách cần tính
	
		// Duyệt qua từng cuốn sách trong mảng
		for (int i = 0; i < books.length; i++) {
			Book currentBook = books[i];
	
			if (typeOfBooks.equalsIgnoreCase("TextBook") && currentBook instanceof TextBook) {
				totalAmount += currentBook.getAmount(); // Cộng tiền của sách này vào tổng
				bookCount++; // Tăng số lượng sách lên
			}
	
			else if (typeOfBooks.equalsIgnoreCase("ReferenceBook") && currentBook instanceof ReferenceBook) {
				totalAmount += currentBook.getAmount();
				bookCount++;
			}
		}

		return totalAmount / bookCount;
	}
    // Sắp xếp các cuốn sách tăng dần về giá tiền
	public void sortByPrice(Book[] books) {
	    for (int i = 0; i < books.length - 1; i++) {
			for (int j = i + 1; j < books.length; j++) {
				if (books[i].getPrice() > books[j].getPrice()) {
					Book tmp = books[i];
					books[i] = books[j];
					books[j] = tmp;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BookManagement bm = new BookManagement();
	
		Book[] books = bm.readData(sc);
	}
}
