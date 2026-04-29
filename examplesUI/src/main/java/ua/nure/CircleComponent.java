package ua.nure;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.List;

public class CircleComponent extends JComponent {
    public static final int MAX_COORD = 100;

    private int circleNumber;
    private static final List<Color> color = List.of(Color.BLUE, Color.RED, Color.GREEN, Color.YELLOW, Color.CYAN, Color.MAGENTA);

    public void setCircleNumber( int circleNumber ) {
        this.circleNumber = circleNumber;
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        for ( int i = 0; i < circleNumber; i++ ) {
            g.setColor( color.get( new Random().nextInt(color.size()) ) );
            g.drawOval( randCoord(), randCoord(), randWidth(), randHeight() );
        }

    }
    private int randCoord(){
        return new Random().nextInt(MAX_COORD);
    }
    private int randWidth(){
        return new Random().nextInt(getWidth()/3);
    }
    private int randHeight(){
        return new Random().nextInt(getHeight()/3);
    }

}
