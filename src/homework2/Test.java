package homework2;

public class Test {
    static int count;

    public static void main(String[] args) {

    }
    public static int getCount() {
        return count;
    }
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++)
            result *= i;
        return result;
    }
}
