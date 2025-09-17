public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(5, 3, "inches");
        Rectangle rectangle2 = new Rectangle(4, 4, "cm");
        Rectangle rectangle3 = new Rectangle(7, 7, "meters");
        Rectangle rectangle4 = new Rectangle(1, 1, "units");



        System.out.println("Rectangle RECT1234 created: ");
        System.out.println("Rectangle RECT5678 created: ");
        System.out.println("Rectangle RECT9012 created: ");
        System.out.println("Rectangle RECT3456 created: ");

        System.out.println(" ");

        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println(rectangle3);
        System.out.println(rectangle4);

//        Rectangle RECT1234 (5.0 x 3.0 inches):
        System.out.println("Rectangle RECT" + rectangle1.getId() + "(" + rectangle1.getLength() + " x " + rectangle1.getWidth() + " " + rectangle1.getUnits());
        System.out.println("Area:" + rectangle1.calculateArea() + "square " + rectangle1.getUnits());

    }
}
