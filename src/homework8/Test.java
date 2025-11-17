package homework8;

public class Test {
    public static void main(String[] args) {
        Student student = new Student(111223333,  "john");
        java.util.Date dateCreated = student.getDateCreated();
        dateCreated.setTime(200000);
    }
}
