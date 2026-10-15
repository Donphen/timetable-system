public class studentNumber{
    private String value;

    public studentNumber(String studentKey){
        newNum(studentKey);
    }

    private void newNum(String studentKey){
        int number = Math.floorMod(studentKey.hashCode(), 9000) + 1000;
        this.value = String.valueOf(number);
    }
    
    public String getValue(){
        return this.value;
    }
}