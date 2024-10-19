public class TestMyRectangle {
    public static void main(String[] args) {
        MyPoint topLeft = new MyPoint(1, 5);
        MyPoint bottomRight = new MyPoint(5, 1);

        MyRectangle rect1 = new MyRectangle(topLeft, bottomRight);

        MyRectangle rect2 = new MyRectangle(0, 6, 4, 2);

        System.out.println("Rectangle1: " + rect1);
        System.out.println("Area of Rectangle1: " + rect1.getArea());
        System.out.println("Perimeter of Rectangle1: " + rect1.getPerimeter());

        System.out.println("Rectangle2: " + rect2);
        System.out.println("Area of Rectangle2: " + rect2.getArea());
        System.out.println("Perimeter of Rectangle2: " + rect2.getPerimeter());
        
        rect1.setTopLeft(new MyPoint(2, 7));
        rect1.setBottomRight(new MyPoint(6, 3));
        System.out.println("Updated Rectangle1: " + rect1);
        System.out.println("Updated Area of Rectangle1: " + rect1.getArea());
        System.out.println("Updated Perimeter of Rectangle1: " + rect1.getPerimeter());
    }
}

