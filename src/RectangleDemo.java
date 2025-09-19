public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(5, 3, "inches");
        Rectangle rectangle2 = new Rectangle(4, 4, "cm");
        Rectangle rectangle3 = new Rectangle(7, 7, "meters");
        Rectangle rectangle4 = new Rectangle(1, 1, "units");



        System.out.println("=== Rectangle Calculator Demo ===");
        System.out.println(" ");
        System.out.println("Rectangle RECT1234 created: ");
        System.out.println("Rectangle RECT5678 created: ");
        System.out.println("Rectangle RECT9012 created: ");
        System.out.println("Rectangle RECT3456 created: ");

        System.out.println(" ");

        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println(rectangle3);
        System.out.println(rectangle4);

        System.out.println(" ");

        System.out.println("=== Calculation Tests ===");
//        Rectangle RECT1234 (5.0 x 3.0 inches):
        System.out.println("Rectangle RECT" + rectangle1.getId() + " (" + rectangle1.getLength() + " x " + rectangle1.getWidth() + " " + rectangle1.getUnits() + "):" );
        System.out.println("Area: " + rectangle1.calculateArea() + " square " + rectangle1.getUnits());
        System.out.println("Perimeter: " + rectangle1.calculatePerimeter() + " inches");
        System.out.println("Diagonal: " + rectangle1.calculateDiagonal() + " inches");
        System.out.println("Is Square: " + false);

        System.out.println(" ");

        System.out.println("Rectangle RECT" + rectangle2.getId() + " (" + rectangle2.getLength() + " x " + rectangle2.getWidth() + " " + rectangle2.getUnits() + "):" );
        System.out.println("Area: " + rectangle2.calculateArea() + " Square " + rectangle2.getUnits());
        System.out.println("Perimeter: " + rectangle2.calculatePerimeter() + " cm");
        System.out.println("Diagonal: " + rectangle2.calculateDiagonal() + " cm");
        System.out.println("Is Square: " + true);

        System.out.println(" ");

        System.out.println("=== Comparison Tests ===");
        System.out.println("Is RECT1234 " + " larger than RECT5678 " + "? " + rectangle1.isLargerThan(rectangle2));
        System.out.println("Are RECT1234" + " and RECT5678 " + " the same size? " + rectangle1.isSameSize(rectangle2));
        if (rectangle1.isLargerThan(rectangle2)) {
            System.out.println("Dimension Comparison: RECT1234 " + " is larger than RECT5678 ");
        } else if (rectangle1.isSameSize(rectangle2)) {
            System.out.println("Dimension Comparison: RECT1234 " + " is the same size as RECT5678 ");
        }  else {
            System.out.println("Dimension Comparison: RECT1234" + " is smaller than RECT5678");
        }
        System.out.println();

        System.out.println("=== Scaling Tests ===");
        System.out.println("Original RECT1234: " + rectangle1.getLength() + " x " + rectangle1.getWidth() + " inches");
        rectangle1.scale(2.0);
        System.out.println("After scaling by 2.0: " + rectangle3.getLength() + " x " + rectangle3.getWidth() + " inches");
        System.out.println("New area: " + rectangle3.calculateArea() + " square " + rectangle1.getUnits());

    }
}
