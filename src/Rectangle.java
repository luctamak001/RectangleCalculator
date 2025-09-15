public class Rectangle {

    // Instance Variables (fields)
    private double length;
    private double width;
    private String id;
    private String units;

    // Initializer Block
    {
        int numId = (int) ((Math.random() * (9999 - 1000 + 1)) + 1000);
        id = String.valueOf(numId);
    }

    public Rectangle(double length, double width, String units) {
        if (length < 0) {
            System.out.println("Invalid length. Should be positive.");
            System.out.println("");
        }
        this.length = length;
        this.width = width;
        this.units = units;
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
        this.units = "unite";
    }

    public Rectangle(double sideLenght, String units) {
        this.length = sideLenght;
        this.width = sideLenght;
        this.units = units;
        //or
        // this(sideLenght, sideLenght, units);
    }

    public Rectangle() {
        this.length = 1;
        this.width = 1;
        this.units = "unite";

    }

    // Methods
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        } else {
            System.out.println("Invalid length.  Length should be greater than 0.");
            System.out.println("Length not Set");
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        // TODO: same as length.
    }

    public String getId() {
        return id;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        if (units != null && !units.isEmpty()) {
            this.units = units;
        } else {
            System.out.println("Invalid units, units shouldn't be empty or null");
            System.out.println("Units not Set");
        }
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * length + 2 * width;
    }

    // TODO: you do the calculateDiagonal() method,
    public double calculateDiagonal() {
        double lSq = Math.pow(length, 2); // or length * length
        double rSq = Math.pow(width, 2);
        double sumOfSquares = lSq + rSq;
        return Math.sqrt(sumOfSquares);
    }

    public boolean isSquare() {
        return length == width;
    }

    public boolean isLargerThan(Rectangle other) {
        double thisArea = calculateArea();
        double otherArea = other.calculateArea();
        return thisArea > otherArea;
    }

    // TODO: isSameSize()
    public boolean isSameSize(Rectangle other) {
        double thisArea = calculateArea();
        double otherArea = other.calculateArea();
        return thisArea == otherArea;
    }

    // TODO: scale(factor).  scale width and height using factor.  Hint:  this.length *= factor
    public void scale(double factor){
        length *= factor;
        width *= factor;
    }


    // TODO: getInfo()
    public String getInfo() {
        return "Rectangle{width=" + width + ", length=" + length + ", id=" + id + ", units=" + units + "}, area=" + calculateArea();
    }


    @Override
    public String toString() {
        return "Rectangle{width=" + width + ", length=" + length + ", id=" + id + ", units=" + units + "}";
    }


}