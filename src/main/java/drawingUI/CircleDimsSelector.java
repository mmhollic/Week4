package drawingUI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class CircleDimsSelector extends JPanel {
    private int radius=0;
    public CircleDimsSelector(){
        JLabel radiusText=new JLabel("Circle radius");
        JSlider radiusSlider=new JSlider(0, 100, 0);
        radiusSlider.addChangeListener(e -> {
            radius=radiusSlider.getValue();
        });
        add(radiusText);
        add(radiusSlider);
        radiusSlider.setBorder(new EmptyBorder(10, 10, 10, 10));
    }
    public int getRadius(){
        return radius;
    }
}
