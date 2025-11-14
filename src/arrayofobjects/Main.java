package arrayofobjects;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setId(1);
        student1.setFirstname("ali");
        student1.setLastname("sadeghi");
        student1.setAge(16);

        Student student2 = new Student();
        student2.setId(2);
        student2.setFirstname("esmaeil");
        student2.setLastname("sadeghi");
        student2.setAge(16);

        Student[] student = new Student[2];
        student[0] =  student1;
        student[1] = student2;

        for (int i = 0; i < student.length; i++) {
            System.out.println(student[i].getFirstname() );
            System.out.println(student[i].getLastname());
        }
    }
}
