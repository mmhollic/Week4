package drawingUI;
import shapes.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DrawingUIController {
    Drawing drawing=new Drawing();
    JPanel controlsPanel=new JPanel();
    JPanel mainPanel=new JPanel();
    ShapeSelector sSel=new ShapeSelector();
    ColourSelector cSel=new ColourSelector();
    CircleDimsSelector circDims=new CircleDimsSelector();
    RectDimsSelector rectDims=new RectDimsSelector();
    SquareDimsSelector squareDims=new SquareDimsSelector();
    public DrawingUIController(){
        mainPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        mainPanel.setLayout(new GridLayout(1,2));
        controlsPanel.setLayout(new GridLayout(3,2));
        controlsPanel.add(sSel);
        controlsPanel.add(cSel);
        controlsPanel.add(circDims);
        controlsPanel.add(rectDims);
        controlsPanel.add(squareDims);
        mainPanel.add(controlsPanel);
        mainPanel.add(drawing);
        addMouseListenerToDrawing();
    }
    private void addMouseListenerToDrawing(){
        drawing.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(sSel.getCurrentShape()==ShapeSelector.CIRCLE){
                    drawing.addCircle(circDims.getRadius(),e.getPoint(), cSel.getCurrentColour());
                }
                else if(sSel.getCurrentShape()==ShapeSelector.RECTANGLE){
                    drawing.addRect(rectDims.getWidth(), rectDims.getHeight(), e.getPoint(), cSel.getCurrentColour());
                }
                else if(sSel.getCurrentShape()==ShapeSelector.SQUARE){
                    drawing.addSquare(squareDims.getSide(), e.getPoint(), cSel.getCurrentColour());
                }
                drawing.repaint();
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
    }
    public JPanel getMainPanel(){
        return mainPanel;
    }

}
