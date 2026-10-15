public class student{
    private String firstName;
    private String lastName;
    private String iD;
    private int year;

    public student(String firstName, String lastName, int year){
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
    }

    public void stuNum(studentNumber S){
        this.iD = "G"+((this.year)%100)+((this.lastName).charAt(0))+S.getValue();
    }

    public String info(){
        return this.firstName+" "+this.lastName+": "+this.iD;
    }

    public static void keyInfo(student s){
        String studentKey = (s.firstName+"|"+s.lastName+"|"+s.year).toLowerCase(java.util.Locale.ROOT);
        s.stuNum(new studentNumber(studentKey));
        System.out.print(s.info());
    }

    public static void main(String[] args){
        student s1 = new student("Seporo", "Mampuru", 2026);
        student s2 = new student("Hans", "Kimaro", 2026);
        keyInfo(s2);
    }

}