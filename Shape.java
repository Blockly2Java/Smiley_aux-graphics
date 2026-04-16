public class Shape {
    private double centerX;
    private double centerY;
    private double radius;
    private String fillColor;

    public Shape(double x, double y) {
        centerX = x;
        centerY = y;
    }

    public void setFillColor(String color) {
        fillColor = color;
    }

    public double getCenterX() {
        return centerX;
    }

    public double getCenterY() {
        return centerY;
    }

    public void move(double dx, double dy) {
        centerX += dx;
        centerY += dy;
    }

    public void rotate(double angle) {
    }

    public void scale(double factor) {
    }

    public World getWorld() {
        return new World();
    }
}
