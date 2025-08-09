import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CardManagement {

	
	public CardManagement()
	{
		super();
	}
	/*
	    Thứ tự nhập như sau:
	    - Số lượng xe
	    - Trong vòng lặp để nhập thông tin mỗi thẻ: nhập số nguyên c = 0 (thẻ học sinh) hoặc 1 (thẻ nhân viên)
	    - Nhập thông tin mỗi thẻ: id, years, day, price, fee (với thẻ sinh viên), và card (với thẻ học sinh)
	*/
	public ArrayList<Card> readData (String fileName)
	{
		ArrayList<Card> cards = new ArrayList<>();
        try {
            Scanner sc = new Scanner(new File(fileName));
            int n = Integer.parseInt(sc.nextLine());  // Số lượng xe
    
            for (int i = 0; i < n; i++) {
                int type = Integer.parseInt(sc.nextLine());  // 0 = studentcard, 1 = staffcard
    
                String id = sc.nextLine();
                Integer year = Integer.parseInt(sc.nextLine());
                double days = Double.parseDouble(sc.nextLine());
                double price = Double.parseDouble(sc.nextLine());
    
                if (type == 0) {
                    double fee = Double.parseDouble(sc.nextLine());
                    cards.add(new StudentCard(id, year, days, price, fee));
                } else {
                    double tax = Double.parseDouble(sc.nextLine());
                    cards.add(new StaffCard(id, year, days, price, tax));
                }
            }
    
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    
        return cards;
		
	}
	
	public void printArrayList(ArrayList<Card> cards) {
		for (int i =0;i<cards.size();i++)
			System.out.println(cards.get(i).toString());
	}
	// Hoan thien phuong thuc findCards de tim nhung  xe co nam san xuat la year
	
	public ArrayList<Card> findCards (ArrayList<Card> cards, int year){
		//Begin editable part
        ArrayList<Card> result = new ArrayList<>();

        for (Card card : cards){
            if (card.getYear() == year) {
                result.add(card);
            }
        }
        return result;
		//End editable part
	}
	
	// Hoan thien phuong thuc getMaxAmount de tim cac xe thuoc the loai typeOfCard
	public ArrayList<Card> getMaxAmount (ArrayList<Card> cards, String typeOfCard){
		//Begin editable part
        ArrayList<Card> result = new ArrayList<>();
        double maxAmount = 0;

        // Bước 1: Tìm maxAmount
        for (Card card: cards) {
			if (typeOfCard.equalsIgnoreCase("StaffCard") && card instanceof StaffCard) {
                if (card.getAmount() > maxAmount){
                    maxAmount = card.getAmount();
                }
			}
	
			else if (typeOfCard.equalsIgnoreCase("StudentCard") && card instanceof StudentCard) {
                if (card.getAmount() > maxAmount){
                    maxAmount = card.getAmount();
                }
			}            
		}
        // Bước 2: Tìm các thẻ có amount == maxAmount
        for (Card card : cards) {
            if (typeOfCard.equalsIgnoreCase("StaffCard") && card instanceof StaffCard) {
                if (card.getAmount() == maxAmount) {
                    result.add(card);
                }
            } else if (typeOfCard.equalsIgnoreCase("StudentCard") && card instanceof StudentCard) {
                if (card.getAmount() == maxAmount) {
                    result.add(card);
                }
            }
        }

    return result;

		//End editable part
	}
	
	
	// Hoan thien phuong thuc sortByAmount de sap xep cac xe theo thu tu giam dan
	public void sortByAmount (ArrayList<Card> cards) {
		//Begin editable part

        for (int i = 0; i < cards.size() - 1; i++) {
            for (int j = i + 1; j < cards.size(); j++) {
                if (cards.get(i).getAmount() < cards.get(j).getAmount()) {
                    Card tmp = cards.get(i);
                    cards.set(i, cards.get(j));
                    cards.set(j, tmp);
                }
            }
        }

		//End editable part
	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		CardManagement cardMng = new CardManagement();
		ArrayList<Card> cards = cardMng.readData("datas.txt");
	}

}
