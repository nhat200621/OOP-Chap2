public class Main {
    public static void main(String[] args) {
        MyCircle circle1 = new MyCircle();
        System.out.println(circle1);
        MyCircle circle2 = new MyCircle(2, 3, 5);
        System.out.println(circle2);
        MyPoint centerPoint = new MyPoint(1, 1);
        MyCircle circle3 = new MyCircle(centerPoint, 4);
        System.out.println(circle3);
        circle2.setCenter(new MyPoint(4, 5));
        circle2.setRadius(6);
        System.out.println("Center of circle2: " + circle2.getCenter());
        System.out.println("Radius of circle2: " + circle2.getRadius());
        System.out.println("Area of circle2: " + circle2.getArea());
        System.out.println("Circumference of circle2: " + circle2.getCircumference());
        System.out.println("Distance between circle1 and circle2: " + circle1.distance(circle2));
    }
}
