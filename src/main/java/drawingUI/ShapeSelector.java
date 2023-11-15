package drawingUI;

import javax.swing.*;
import java.awt.*;

public class ShapeSelector extends JPanel{
    public static String CIRCLE="Circle";
    public static String RECTANGLE="Rectangle";
    public static String SQUARE="Square";

    private JRadioButton bCirc=new JRadioButton(CIRCLE);
    private JRadioButton bRect=new JRadioButton(RECTANGLE);
    private JRadioButton bSquare=new JRadioButton(SQUARE);
    ButtonGroup shapeGroup=new ButtonGroup();
    public ShapeSelector(){
        shapeGroup.add(bCirc);
        shapeGroup.add(bRect);
        shapeGroup.add(bSquare);
        add(bCirc);
        add(bRect);
        add(bSquare);
        bCirc.setSelected(true);
    }

    public String getCurrentShape(){
        if (bCirc.isSelected()){
           return CIRCLE;
        }
        else if (bRect.isSelected()){
            return RECTANGLE;
        }
        else if (bSquare.isSelected()){
            return SQUARE;
        }
        else{
            return CIRCLE;// Default to Circle
        }
    }
}
