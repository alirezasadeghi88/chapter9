package workout;

public class ShowErrors {



    public static void main(String[] args) {
        C c = new C(5.0);
        System.out.println(c.value);
    }
}

class C {
    double value = 2;
    C() {

    }
    C(double a) {
        value = a;
    }

}
