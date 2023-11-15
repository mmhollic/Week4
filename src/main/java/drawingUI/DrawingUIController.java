package drawingUI;
import shapes.*;

import javax.swing.*;

public class DrawingUIController {
    Drawing drawing=new Drawing();
    JPanel controlsPanel=new JPanel();
    JPanel mainPanel=new JPanel();
    ShapeSelector sSel=new ShapeSelector();
    ColourSelector cSel=new ColourSelector();
    CircleDimsSelector circDims=new CircleDimsSelector();
    public DrawingUIController(){
        controlsPanel.add(sSel);
        controlsPanel.add(cSel);
        controlsPanel.add(circDims);
        mainPanel.add(controlsPanel);
        mainPanel.add(drawing);
    }
    public JPanel getMainPanel(){
        return mainPanel;
    }

}
