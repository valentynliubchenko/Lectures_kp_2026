package ua.nure;

import javax.swing.*;
import java.awt.*;


public class AppBorderButton
{
    public static void main( String[] args )
    {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(350, 350);
            frame.setMinimumSize(new Dimension(300, 300));
            frame.setMaximumSize(new Dimension(400, 400));
            frame.setTitle("Buttons");
            frame.setLocationRelativeTo(null);
            frame.setLayout(new BorderLayout());

            frame.add(new JButton("Верх"), BorderLayout.NORTH);
            frame.add(new JButton("Низ"), BorderLayout.SOUTH);
            frame.add(new JButton("Лівий"), BorderLayout.WEST);
            frame.add(new JButton("Правий"), BorderLayout.EAST);
            frame.add(new JButton("Центр"), BorderLayout.CENTER);

            frame.setVisible(true);
        });
    }
}
