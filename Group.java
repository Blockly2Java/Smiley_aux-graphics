import java.util.ArrayList;
import java.util.List;

public class Group extends Shape {
    private List<Shape> children;

    public Group() {
        super(0, 0);
        children = new ArrayList<>();
    }

    public Group(Shape... shapes) {
        this();
        if (shapes == null) {
            return;
        }
        for (Shape shape : shapes) {
            add(shape);
        }
    }

    public void add(Shape shape) {
        if (shape == null) {
            return;
        }
        children.add(shape);
        updateCenterFromChildren();
    }

    @Override
    public void move(double dx, double dy) {
        super.move(dx, dy);
        for (Shape shape : children) {
            shape.move(dx, dy);
        }
    }

    private void updateCenterFromChildren() {
        if (children.isEmpty()) {
            return;
        }

        double sumX = 0;
        double sumY = 0;
        for (Shape child : children) {
            sumX += child.getCenterX();
            sumY += child.getCenterY();
        }

        double targetX = sumX / children.size();
        double targetY = sumY / children.size();
        super.move(targetX - getCenterX(), targetY - getCenterY());
    }
}
