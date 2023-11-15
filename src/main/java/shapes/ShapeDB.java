package shapes;

import java.awt.*;
import java.util.ArrayList;

public class ShapeDB {
    // We've moved the keeping track of shapes from Drawing to a separate class
    private ArrayList<Shape> shapes=new ArrayList<Shape>();
    // Package private methods  - only accessible from classes in the same package
    void addCircle(int radius, Point position, Color colour) {
        Circle circ=new Circle(radius, position, colour);
        shapes.add(circ);
    }
    void addRect(int width,int height, Point position, Color colour) {
        Rect rect=new Rect(width, height, position, colour);
        shapes.add(rect);
    }
    void addSquare(int width, Point position, Color colour) {
        Square square=new Square(width, position, colour);
        shapes.add(square);
    }
    void drawShapes(Graphics g) {
        for (Shape s: shapes) {
            s.draw(g);
        }
    }
}
