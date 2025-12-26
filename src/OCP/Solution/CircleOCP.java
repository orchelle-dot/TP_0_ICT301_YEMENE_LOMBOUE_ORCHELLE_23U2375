package OCP.Solution;

public class CircleOCP implements Shape {
    private double radius ;

    public CircleOCP(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI*radius*radius;
    }
}

