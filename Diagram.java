import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Diagram {
    private List<Shape> shapes;

    public Diagram() {
        shapes = new ArrayList<>();
    }

    public void addShape(Shape s) {
        shapes.add(s);
    }

    public void removeShape(Shape s) {
        shapes.remove(s);
    }

    public void removeOverlappingShapes() {
        List<Shape> uniqueShapes = new ArrayList<>();
        for (Shape s1 : shapes) {
            boolean isOverlapping = false;
            for (Shape s2 : uniqueShapes) {
                if (s1.overlaps(s2)) {
                    isOverlapping = true;
                    break;
                }
            }
            if (!isOverlapping) {
                uniqueShapes.add(s1);
            }
        }
        shapes = uniqueShapes;
    }

    public void drawAll() {
        for (Shape s : shapes) {
            s.draw();
        }
    }
}
