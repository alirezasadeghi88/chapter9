package homework;

public class TestPants {
    public static void main(String[] args) {
        System.out.println("LI");
        Pants li = new Pants();
        li.color = "blue";
        li.size = 110;

        System.out.println(li.color);
        System.out.println(li.size);
        li.button();
        System.out.println("_________________");
        System.out.println("FABRIC");

        Pants fabric = new Pants();
        fabric.color = "blak";
        fabric.size = 100;

        System.out.println(fabric.color);
        System.out.println(fabric.size);
        fabric.button();
        System.out.println("_________________");
        System.out.println("VELVET");

        Pants velvet = new Pants();
        velvet.color = "red";
        velvet.size = 105;

        System.out.println(velvet.color);
        System.out.println(velvet.size);
        velvet.button();
        System.out.println("_________________");
    }
}
