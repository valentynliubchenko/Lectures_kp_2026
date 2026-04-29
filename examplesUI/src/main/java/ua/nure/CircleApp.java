package ua.nure;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


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
            CircleComponent circleComponent = new CircleComponent();
            circleComponent.setCircleNumber(1);
            drawButton.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    int circleNumber = 0;
                    try {
                        circleNumber = Integer.parseInt(circleNumbers.getText());
                        circleComponent.setCircleNumber(circleNumber);
                        System.out.println("circleNumber = " + circleNumber);
                    }
                    catch (NumberFormatException err) {
                        JOptionPane.showMessageDialog(null, "Please enter a valid circle number!", "Error", JOptionPane.ERROR_MESSAGE);
                        circleNumbers.setText("");
                        circleNumbers.requestFocus();
                        return;
                    }
                }
            });

            inputPanel.add(new JLabel("Number of Circles"));
            inputPanel.add(circleNumbers);
            inputPanel.add(drawButton);
            frame.add(inputPanel, BorderLayout.SOUTH);
            frame.add(circleComponent, BorderLayout.CENTER);

            frame.setVisible(true);
        });
    }
}
