public class TestMyLine {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(0, 0);
        MyPoint p2 = new MyPoint(3, 4);

        MyLine line1 = new MyLine(p1, p2);
        MyLine line2 = new MyLine(1, 1, 4, 5);

        System.out.println("Line1: " + line1);
        System.out.println("Length of Line1: " + line1.getLength());
        System.out.println("Gradient of Line1: " + line1.getGradient());

        System.out.println("Line2: " + line2);
        System.out.println("Length of Line2: " + line2.getLength());
        System.out.println("Gradient of Line2: " + line2.getGradient());

        line1.setBeginXY(2, 2);
        line1.setEndXY(5, 6);
        System.out.println("Updated Line1: " + line1);
        System.out.println("Updated Length of Line1: " + line1.getLength());
    }
}
