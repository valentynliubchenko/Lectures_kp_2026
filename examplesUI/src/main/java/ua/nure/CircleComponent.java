package ua.nure;

import javax.swing.*;
import java.awt.*;

public class CircleComponent extends JComponent {
    private int circleNumber;

    public void setCircleNumber( int circleNumber ) {
        this.circleNumber = circleNumber;
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        g.setColor( Color.BLUE );
        g.drawOval( 0, 0, 50, 100 );

    }
}
