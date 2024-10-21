public class Main {
    public static void main(String[] args) {
        MyTriangle triangle1 = new MyTriangle(0, 0, 4, 0, 0, 3);
        System.out.println(triangle1);
        System.out.println("Perimeter of triangle1: " + triangle1.getPerimeter());  // 12.0
        triangle1.printType();
        MyPoint p1 = new MyPoint(1, 1);
        MyPoint p2 = new MyPoint(4, 1);
        MyPoint p3 = new MyPoint(1, 4);
        MyTriangle triangle2 = new MyTriangle(p1, p2, p3);
        System.out.println(triangle2);
        System.out.println("Perimeter of triangle2: " + triangle2.getPerimeter());
        triangle2.printType();
    }
}
