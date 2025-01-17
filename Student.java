//672115019 Thinnapop Srisomboon
public class Student {
    private String fName;
    private int SID;
    private double GPA;

    public Student(String fName, int SID, double GPA){
        this.fName = fName;
        this.SID = SID;
        this.GPA = GPA;
    }
    public String toString(){
        return "[ "+fName+" "+SID+" "+GPA+" ]"; 
    }
}
