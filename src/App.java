public class App {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(5, 3, "cm");
        Rectangle rectangle2 = new Rectangle(5, 3, "inch");

        Rectangle unitsRectangle = new Rectangle(1, 3);

        Rectangle square = new Rectangle(3, "m");

        Rectangle defaultRect = new Rectangle();

        System.out.println(rectangle1.getLength());


    }
}
