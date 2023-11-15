package drawingUI;

import javax.swing.*;

public class ShapeSelector extends JPanel{
    private JRadioButton bCirc=new JRadioButton("Circle");
    private JRadioButton bRect=new JRadioButton("Rectangle");
    private JRadioButton bSquare=new JRadioButton("Square");
    ButtonGroup shapeGroup=new ButtonGroup();
    private String currentShape;
    public String getCurrentShape(){
        return currentShape;
    }
}
