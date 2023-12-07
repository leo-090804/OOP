package Week7_Polymorphism_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DrawingPanel extends JPanel implements KeyListener, ActionListener {
    private List<Circle1> circles = new ArrayList<>();
    private Timer timer;

    public DrawingPanel() {
        this.setFocusable(true);
        this.addKeyListener(this);

        timer = new Timer(50, this);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (Circle1 circle : circles) {
            circle.move(getWidth(), getHeight());
        }
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Circle1 circle : circles) {
            circle.draw(g);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getKeyChar() == 'c') {
            Random rand = new Random();
            int x = rand.nextInt(getWidth());
            int y = rand.nextInt(getHeight());
            int radius = rand.nextInt(50) + 20;
            Color color = new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat());

            double velocityX = rand.nextDouble() * 5 - 2.5; // Random velocity for X-axis (-2.5 to 2.5)
            double velocityY = rand.nextDouble() * 5 - 2.5; // Random velocity for Y-axis (-2.5 to 2.5)

            Circle1 circle = new Circle1(x, y, radius, velocityX, velocityY, color);
            circles.add(circle);
            repaint();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Drawing Panel");
        DrawingPanel drawingPanel = new DrawingPanel();
        frame.add(drawingPanel);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class Circle1 {
    private int x;
    private int y;
    private int radius;
    private double velocityX;
    private double velocityY;
    private Color color;

    public Circle1(int x, int y, int radius, double velocityX, double velocityY, Color color) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.velocityX = velocityX;
        this.velocityY = velocityY;
        this.color = color;
    }

    public void move(int panelWidth, int panelHeight) {
        x += velocityX;
        y += velocityY;

        if (x + radius > panelWidth || x - radius < 0) {
            velocityX = -velocityX;
        }

        if (y + radius > panelHeight || y - radius < 0) {
            velocityY = -velocityY;
        }
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }
}
