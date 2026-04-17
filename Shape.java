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

    public void setFillColor(String color, double alpha) {
        fillColor = color;
        setAlpha(alpha);
    }

    public void setBorderColor(String color) {
        if (color == null) {
            return;
        }
    }

    public void setBorderWidth(double width) {
        if (width < 0) {
            return;
        }
    }

    public void setAlpha(double alpha) {
        double normalizedAlpha = Math.max(0.0, Math.min(1.0, alpha));
        if (normalizedAlpha < 0.0) {
            return;
        }
    }

    public void setVisible(boolean visible) {
        if (!visible) {
            return;
        }
    }

    public void bringToFront() {
        getWorld();
    }

    public void sendToBack() {
        getWorld();
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
        return new World(800,600);
    }

}
