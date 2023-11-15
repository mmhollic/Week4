package drawingUI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class ColourSelector extends JPanel {
    private Color currentColour;
    public ColourSelector(){
        JColorChooser colourChooser=new JColorChooser();
        JButton colourButton=new JButton("Choose Colour");
        colourButton.addActionListener(e -> {
           currentColour = JColorChooser.showDialog(
                    this,
                    "Choose Background Color",
                    currentColour);
        });
        add(colourButton);
    }
    public Color getCurrentColour(){
        return currentColour;
    }
}
