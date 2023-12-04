package Week7_Polymorphism_2;

import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.List;

public class Layer {
    private List<Shape> shapes = new ArrayList<>();

    /**
     * javadoc.
     */
    public void addShape(Shape newShape) {
        shapes.add(newShape);
    }

    /**
     * javadoc.
     */
    public void removeCircles() {
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) instanceof Circle) {
                shapes.remove(shapes.get(i));
            }
        }
    }

    /**
     * javadoc.
     */
    public String getInfo() {
        StringBuilder crazyShapes = new StringBuilder();
        for (int i = 0; i < shapes.size(); i++) {
            crazyShapes.append(shapes.get(i));
            crazyShapes.append("\n");
        }
        return "Layer of crazy shapes:\n" + crazyShapes;
    }

    /**
     * javadoc.
     */
    public void removeDuplicates() {
        LinkedHashSet<Shape> crazyShapes = new LinkedHashSet<>();
        for (int i = 0; i < shapes.size(); i++) {
            crazyShapes.add(shapes.get(i));
        }
        shapes.clear();
        shapes.addAll(crazyShapes);
    }
}
