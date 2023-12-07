package Week7_Polymorphism_2;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Layer extends JPanel {
    private final List<Shape> shapes = new ArrayList<>();

    public Layer() {
    }

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

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

    public List<Shape> getShapes() {
        return shapes;
    }

}
