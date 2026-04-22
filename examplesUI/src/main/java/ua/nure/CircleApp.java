package ua.nure;

import javax.swing.*;
import java.awt.*;


public class CircleApp
{
    public static void main( String[] args )
    {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            frame.setTitle("Circle Drawer");
            frame.setLocationRelativeTo(null);
            frame.setLayout(new BorderLayout());
            frame.setSize(400, 400);


            JPanel inputPanel = new JPanel();
            JTextField circleNumbers = new JTextField(10);
            JButton drawButton = new JButton("Draw circles");

            inputPanel.add(new JLabel("Number of Circles"));
            inputPanel.add(circleNumbers);
            inputPanel.add(drawButton);
            frame.add(inputPanel, BorderLayout.SOUTH);

            frame.setVisible(true);
        });
    }
}
