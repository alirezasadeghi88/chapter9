package homework;

 class Test {
     public static void main(String[] args) {
         A a = new A();
         a.print();
     }
}

class A {
     String s;
     A() {
     }

     A(String newS) {
         s = newS;
     }

    public void print() {
        System.out.println(s);
    }
}
