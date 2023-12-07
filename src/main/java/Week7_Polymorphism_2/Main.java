package Week7_Polymorphism_2;

import javax.swing.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Drawing Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1366, 768);

        Layer layer = new Layer();
        addRandomShapes(layer);

        frame.add(layer);
        frame.setVisible(true);

        Thread animationThread = new Thread(() -> {
            while (true) {
                moveShapes(layer);
                layer.repaint();
                try {
                    Thread.sleep(30);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        animationThread.start();
    }

    private static void moveShapes(Layer layer) {
        for (Shape shape : layer.getShapes()) {
            shape.move();
            if (shape instanceof Circle) {
                ((Circle) shape).collidesWithFrame(1366, 768);
                ((Circle) shape).reverseDirection();
            } else if (shape instanceof Rectangle) {
                ((Rectangle) shape).collidesWithFrame(1366, 768);
                ((Rectangle) shape).reverseDirection();
            }
        }
    }

    private static void addRandomShapes(Layer layer) {
        Random random = new Random();
        int numOfShapes = 70;

        for (int i = 0; i < numOfShapes; i++) {
            int choice = random.nextInt(2);

            if (choice == 0) {
                double radius = random.nextDouble() * 50 + 20;
                double centerX = random.nextDouble() * 1366;
                double centerY = random.nextDouble() * 768;

                Point center = new Point(centerX, centerY);
                String color = getRandomColor(random);
                boolean isFilled = random.nextBoolean();

                Circle circle = new Circle(center, radius, color, isFilled);
                layer.addShape(circle);
            } else {
                double width = random.nextDouble() * 80 + 30;
                double length = random.nextDouble() * 80 + 30;
                double topLeftX = random.nextDouble() * 1366;
                double topLeftY = random.nextDouble() * 768;

                Point topLeft = new Point(topLeftX, topLeftY);
                String color = getRandomColor(random);
                boolean isFilled = random.nextBoolean();

                Rectangle rectangle = new Rectangle(topLeft, width, length, color, isFilled);
                layer.addShape(rectangle);
            }
        }
    }

    private static String getRandomColor(Random random) {
        int red = random.nextInt(256);
        int green = random.nextInt(256);
        int blue = random.nextInt(256);

        return String.format("#%02x%02x%02x", red, green, blue);
    }
}
