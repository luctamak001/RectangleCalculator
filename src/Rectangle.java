public class Rectangle {

        // Instance Variables (fields)
        private double length;
        private double width;
        private String id;
        private String units;

        // Initializer Block
        {
            int numId = (int) ((Math.random() * (9999 - 1000 +1)) + 1000);
            id = String.valueOf(numId);
        }

        public Rectangle(int length, int width, String units) {
            this.length = length;
            this.width = width;
            this.units = units;
        }

        public Rectangle(int length, int width) {
            this.units = "unite";
        }

        public Rectangle(int sideLenght, String units){
            this.length = sideLenght;
            this.width = sideLenght;
            this.units = units;
            //or
            // this(sideLenght, sideLenght, units);
        }

        public Rectangle(){
            this.length = 1;
            this.width = 1;
            this.units = "unite";

        }
    // Methods
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
            if (length <= 0)
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
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


    public boolean isSquare() {
            return length == width;
    }


}