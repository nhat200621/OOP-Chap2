public class Main {
    public static void main(String[] args) {
        MyRectangle rect1 = new MyRectangle(1, 4, 5, 1);
        System.out.println(rect1);
        System.out.println("Width: " + rect1.getWidth());
        System.out.println("Height: " + rect1.getHeight());
        System.out.println("Area: " + rect1.getArea());
        System.out.println("Perimeter: " + rect1.getPerimeter());
        MyPoint p1 = new MyPoint(2, 5);
        MyPoint p2 = new MyPoint(6, 2);
        MyRectangle rect2 = new MyRectangle(p1, p2);
        System.out.println(rect2);
        System.out.println("Width: " + rect2.getWidth());
        System.out.println("Height: " + rect2.getHeight());
        System.out.println("Area: " + rect2.getArea());
        System.out.println("Perimeter: " + rect2.getPerimeter());
    }
}
