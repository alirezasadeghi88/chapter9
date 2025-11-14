package homework5;

public class TestCircleWithPrivateDataFields {

    public static void main(String[] args) {

        Circle mycCircle = new Circle(5.0);
        System.out.println("The area of the circle of radius"
            + mycCircle.getRadius() + " is " + mycCircle.getArea());

        mycCircle.setRadius(mycCircle.getRadius() * 1.1);
        System.out.println("The area of the circle of radius"
            + mycCircle.getRadius() + " is " + mycCircle.getArea());

        System.out.println("The number of objects created is"
            + Circle.getNumberOfObjects());
    }
}
