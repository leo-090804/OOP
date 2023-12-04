package Week9_Interface;

import java.util.LinkedHashSet;
import java.util.List;

public class ShapeUtil {
    /**
     * javadoc.
     */
    public String printInfo(List<GeometricObject> shapes) {
        StringBuilder circleList = new StringBuilder("Circle:\n");
        StringBuilder triangleList = new StringBuilder("Triangle:\n");
        LinkedHashSet<GeometricObject> removeDuplicate = new LinkedHashSet<>();
        for (GeometricObject shape : shapes) {
            removeDuplicate.add(shape);
        }
        shapes.clear();
        shapes.addAll(removeDuplicate);

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) instanceof Circle) {
                circleList.append(shapes.get(i).getInfo()).append("\n");
            } else if (shapes.get(i) instanceof Triangle) {
                triangleList.append(shapes.get(i).getInfo()).append("\n");
            }
        }
        return circleList.toString() + triangleList.toString();
    }
}