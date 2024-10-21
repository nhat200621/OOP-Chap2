public class Main {
    public static void main(String[] args) {
        MyLine line1 = new MyLine();
        System.out.println(line1);
        MyLine line2 = new MyLine(new MyPoint(1, 1), new MyPoint(4, 5));
        System.out.println(line2);
        MyLine line3 = new MyLine(2, 3, 6, 8);
        System.out.println(line3);
        line3.setBegin(new MyPoint(0, 0));
        line3.setEnd(new MyPoint(10, 10));
        System.out.println("Begin: " + line3.getBegin());
        System.out.println("End: " + line3.getEnd());
        line3.setBeginXY(3, 4);
        line3.setEndXY(8, 9);
        System.out.println(line3);
        System.out.println("Length of line3: " + line3.getLength());
        System.out.println("Gradient of line3: " + Math.toDegrees(line3.getGradient()));
    }
}
