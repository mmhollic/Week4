package shapes;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class Drawing extends Canvas {
    // Declare the shapes - they can all be private as nothing else needs to access them
    private ShapeDB shapes=new ShapeDB();

    public Drawing() {
        setSize(400, 200);
        setBackground(Color.white);
    }

    public void addCircle(int radius, Point position, Color colour) {
        shapes.addCircle(radius, position, colour);
    }
    public void addRect(int width,int height, Point position, Color colour) {
        shapes.addRect(width, height, position, colour);
    }
    public void addSquare(int width, Point position, Color colour) {
        shapes.addSquare(width, position, colour);
    }

    // Inherited from Canvas - called by Windows when the canvas needs to be redrawn
    @Override
    public void paint(Graphics g) {
        // Draw the shapes
        shapes.drawShapes(g);
    }

}
