public class Ellipse extends Shape {
    private double radiusX;
    private double radiusY;

    public Ellipse(double x, double y, double rX, double rY) {
        super(x, y);
        radiusX = rX;
        radiusY = rY;
    }
}
