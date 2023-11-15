package drawingUI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class SquareDimsSelector extends JPanel {
    private int side=0;
    public SquareDimsSelector() {
        JLabel squareTextSide=new JLabel("Square side");
        JSlider sideSlider=new JSlider(0, 100, 0);

        sideSlider.addChangeListener(e -> {
            side=sideSlider.getValue();
        });
        add(squareTextSide);
        add(sideSlider);
        sideSlider.setBorder(new EmptyBorder(10, 10, 10, 10));
    }
    public int getSide(){
        return side;
    }

}
