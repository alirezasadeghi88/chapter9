package homework11;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student(111223333, "john");
        java.util.Date dateCreated = student.getDateCreated();
        dateCreated.setTime(200000);
    }
}
