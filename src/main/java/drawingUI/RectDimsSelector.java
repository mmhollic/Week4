package drawingUI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class RectDimsSelector extends JPanel {
    private int width=0;
    private int height=0;
    public RectDimsSelector() {
        JLabel rectTextWidth=new JLabel("Rectangle width");
        JSlider widthSlider=new JSlider(0, 100, 0);
        JLabel rectTextHeight=new JLabel("Rectangle height");
        JSlider heightSlider=new JSlider(0, 100, 0);
        widthSlider.addChangeListener(e -> {
            width=widthSlider.getValue();
        });
        heightSlider.addChangeListener(e -> {
            height=heightSlider.getValue();
        });
        add(rectTextWidth);
        add(widthSlider);
        widthSlider.setBorder(new EmptyBorder(10, 10, 10, 10));
        add(rectTextHeight);
        add(heightSlider);
        heightSlider.setBorder(new EmptyBorder(10, 10, 10, 10));
    }
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
}
