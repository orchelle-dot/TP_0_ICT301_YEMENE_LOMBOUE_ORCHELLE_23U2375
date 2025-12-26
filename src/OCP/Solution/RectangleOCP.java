package OCP.Solution;

public class RectangleOCP implements Shape {

    private double width;

    private double height;

    public RectangleOCP(double width, double
            height) {

        this.width = width;

        this.height = height;

    }

    @Override

    public double calculateArea() {

        return width * height;

    }
}

