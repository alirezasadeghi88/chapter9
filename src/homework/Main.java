package homework;

public class Main {
    public static void main(String[] args) {
      Human ali = new Human();
        ali.age = 16;
        ali.wright = 70;
        ali.height = 184;
        ali.gender = "boy";

        System.out.println("ALI");

        System.out.println(ali.age);
        System.out.println(ali.height);
        System.out.println(ali.wright);
        System.out.println(ali.gender);

        ali.walk();
        ali.drink();
        ali.eat();
        ali.sit();
        System.out.println("_________________");
        System.out.println("REZA");

      Human reza = new Human();
        reza.age = 20;
        reza.wright = 80;
        reza.height = 170;
        reza.gender = "boy";

        System.out.println(reza.age);
        System.out.println(reza.height);
        System.out.println(reza.wright);
        System.out.println(reza.gender);

        reza.walk();
        reza.drink();
        reza.eat();
        reza.sit();
        System.out.println("_________________");
        System.out.println("ZAHRA");

        Human zahra = new Human();
        zahra.age = 23;
        zahra.wright = 60;
        zahra.height = 168;
        zahra.gender = "girl";

        System.out.println(zahra.age);
        System.out.println(zahra.height);
        System.out.println(zahra.wright);
        System.out.println(zahra.gender);

        zahra.walk();
        zahra.drink();
        zahra.eat();
        zahra.sit();
        System.out.println("_________________");


    }



}
