package ua.nure;

import javax.swing.*;
import java.awt.*;


public class AppGr
{
    public static void main( String[] args )
    {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(350, 350);
            frame.setMinimumSize(new Dimension(300, 300));
            frame.setMaximumSize(new Dimension(400, 400));
            frame.setTitle("Calculator");
            frame.setLocationRelativeTo(null);


            JPanel panel = new JPanel(new GridBagLayout());
            GridBagConstraints constraints = new GridBagConstraints();
            constraints.gridx = 0;
            constraints.gridy = 0;
            constraints.gridwidth = 2;
            panel.add(new JButton("Широка кнопка"), constraints);
            constraints.gridx = 0;
            constraints.gridy = 1;
            constraints.gridwidth = 1;
            panel.add(new JButton("Кнопка 1"), constraints);
            constraints.gridx = 1;
            constraints.gridy = 1;
            panel.add(new JButton("Кнопка 2"), constraints);


            frame.add(panel);
            frame.setVisible(true);
        });
    }
}
