import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
@SuppressWarnings("unchecked")
public class CandidateManager {
    
    private ArrayList<Candidate> candidates;
    
    public CandidateManager() {
        this.candidates = new ArrayList<>();
    }
    
    /*
    readData
    doc du lieu tu file van ban textFile va luu du lieu vao cac bien thanh vien
    */
    public boolean readData(String textFile) {
        try {
            File file = new File(textFile);
            Scanner fileReader = new Scanner(file);
            
            while (fileReader.hasNextLine()) {
                String[] fields = fileReader.nextLine().trim().split("\\|");
                if (fields.length != 6) {
                    continue;
                }
                String id = fields[0].trim();
                String name = fields[1].trim();
                String selection = fields[2].trim();
                String sex = fields[3].trim();
                int year = Integer.parseInt(fields[4].trim());
                int priority = Integer.parseInt(fields[5].trim());
                
                Candidate newCandidate = new Candidate(id, name, selection, sex, year, priority);
                this.candidates.add(newCandidate);
            }
            
            fileReader.close();
            return true;
        } catch(IOException ex) {
            System.out.println("Error reading file '" + textFile + "'");
            return false;
        }  
    }
    
    /* 
    getSelectionCandicates 
    trả về danh sách các thí sinh có khối thi là selection 
    */
    public ArrayList<Candidate> getSelectionCandicates(String selection) { 
        
        /* Todo */
        ArrayList<Candidate> result = new ArrayList<>();

        for (Candidate candidate : candidates){
            if (candidate.selection().equalsIgnoreCase(selection)) {
                result.add(candidate);
            }
        }
        return result;
    }
    
    /* 
    getPriorityCandidates 
    trả về danh sách thí sinh được ưu tiên (có độ ưu tiên bằng 1)
    */
    public ArrayList<Candidate> getPriorityCandidates() {
        
        /* Todo */
        ArrayList<Candidate> result = new ArrayList<>();

        for (Candidate candidate : candidates){
            if (candidate.priority() == 1) {
                result.add(candidate);
            }
        }
        return result;
    }
    
    /* 
    sortByName 
    tra ve danh sach cac thi sinh duoc sap xep theo ho va ten (name)
    */
    public ArrayList<Candidate> sortByName() {
    // Tạo bản sao của danh sách gốc để không thay đổi danh sách ban đầu
    ArrayList<Candidate> sortedList = new ArrayList<>(candidates);

    // Duyệt qua từng cặp phần tử để so sánh tên và sắp xếp (bubble sort đơn giản)
    for (int i = 0; i < sortedList.size() - 1; i++) {
        for (int j = i + 1; j < sortedList.size(); j++) {
            String name1 = sortedList.get(i).name();
            String name2 = sortedList.get(j).name();

            if (name1.compareToIgnoreCase(name2) > 0) {
                // Hoán đổi nếu tên đứng sau trong bảng chữ cái
                Candidate temp = sortedList.get(i);
                sortedList.set(i, sortedList.get(j));
                sortedList.set(j, temp);
            }
        }
    }
    return sortedList;
    }
    
    /* 
    getSecondYoungestCandidates 
    trả về danh sách các thí sinh có tuổi trẻ thứ 2 trong danh sách 
    (ví dụ: các khách hàng có các năm sinh 1990 1991 1992 1993, 
    trả về danh sách các khách hàng sinh năm 1992)
    */
    public ArrayList<Candidate> getSecondYoungestCandidates() {
        /* Todo */
        ArrayList<Candidate> sortedyear = new ArrayList<>(candidates);

        // Bubble sort đơn giản dựa trên năm sinh
        for (int i = 0; i < sortedyear.size() - 1; i++) {
            for (int j = i + 1; j < sortedyear.size(); j++) {
                if (sortedyear.get(i).year() < sortedyear.get(j).year()) {
                    Candidate tmp = sortedyear.get(i);
                    sortedyear.set(i, sortedyear.get(j));
                    sortedyear.set(j, tmp);
                }
            }
        }
        // Tìm năm sinh trẻ thứ 2
        int youngestYear = sortedyear.get(0).year();  // Trẻ nhất
        Integer secondYoungestYear = null;

        for (Candidate c : sortedyear) {
            if (c.year() < youngestYear) {
                secondYoungestYear = c.year();
                break;
            }
        }
        // Trả về tất cả candidate có năm sinh == secondYoungestYear
        ArrayList<Candidate> result = new ArrayList<>();
        if (secondYoungestYear != null) {
            for (Candidate c : sortedyear) {
                if (c.year() == secondYoungestYear) {
                    result.add(c);
                }
            }
        }

        return result;
    }
    
    /*
    printCandidatesFromArray 
    in danh sach cac thi sinh tu mot List da cho
    */
    public void printCandidatesFromArray(ArrayList<Candidate> candidates) {
        if (candidates == null) {
            return;
        }
        
        for (int i = 0; i < candidates.size(); i++) {
            candidates.get(i).print();
        }
    }
    
    /*
    printCandidates 
    in danh cach cac thi sinh duoc luu trong bien thanh vien candidates
    */
    public void printCandidates() {
        printCandidatesFromArray(this.candidates);
    }
    
    public static void main(String[] args) {
        CandidateManager candidateManager = new CandidateManager();
        if (!candidateManager.readData("candidates.txt")) {
            return;
        }
            
        //ArrayList<Candidate> selectionCandidates = candidateManager.getSelectionCandicates("A");
        //candidateManager.printCandidatesFromArray(selectionCandidates);
        //System.out.println();
        
        //ArrayList<Candidate> priorityCandidates = candidateManager.getPriorityCandidates();
        //candidateManager.printCandidatesFromArray(priorityCandidates);
        //System.out.println();
            
        //ArrayList<Candidate> sortedNameCandidates = candidateManager.sortByName();
        //candidateManager.printCandidatesFromArray(sortedNameCandidates);
        //System.out.println();
            
        //ArrayList<Candidate> secondYoungestCandidates = candidateManager.getSecondYoungestCandidates();
        //candidateManager.printCandidatesFromArray(secondYoungestCandidates);
    }
}
