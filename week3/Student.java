package week3;

public class Student {

    private String id;
    private String name;
    private String hometown;
    private boolean isMale;
    private double score;

    // public String toString() {
    //     return id + " " + name + " " + hometown + " " + isMale + " " + score;
    // }
    public Student() {} // Ham khong doi

    public Student(String id, String name, String hometown, boolean isMale, double score){
        this.id = id;
        this.name = name;
        this.hometown = hometown;
        this.isMale = isMale;
        this.score = score;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }


    
}
