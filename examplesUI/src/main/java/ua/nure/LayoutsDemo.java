package ua.nure;

import javax.swing.*;
import java.awt.*;

public class LayoutsDemo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Демонстрація менеджерів розміщення");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);

            // Використання JTabbedPane для демонстрації різних менеджерів
            JTabbedPane tabbedPane = new JTabbedPane();

            // FlowLayout
            JPanel flowPanel = new JPanel(new FlowLayout());
            for (int i = 1; i <= 10; i++) {
                flowPanel.add(new JButton("Кнопка " + i));
            }
            tabbedPane.addTab("FlowLayout", flowPanel);

            // BorderLayout
            JPanel borderPanel = new JPanel(new BorderLayout(10, 10));
            borderPanel.add(new JButton("Північ"), BorderLayout.NORTH);
            borderPanel.add(new JButton("Південь"), BorderLayout.SOUTH);
            borderPanel.add(new JButton("Схід"), BorderLayout.EAST);
            borderPanel.add(new JButton("Захід"), BorderLayout.WEST);
            borderPanel.add(new JButton("Центр"), BorderLayout.CENTER);
            tabbedPane.addTab("BorderLayout", borderPanel);

            // GridLayout
            JPanel gridPanel = new JPanel(new GridLayout(3, 3, 5, 5));
            for (int i = 1; i <= 9; i++) {
                gridPanel.add(new JButton("" + i));
            }
            tabbedPane.addTab("GridLayout", gridPanel);

            // BoxLayout
            JPanel boxPanel = new JPanel();
            boxPanel.setLayout(new BoxLayout(boxPanel, BoxLayout.Y_AXIS));
            for (int i = 1; i <= 5; i++) {
                JButton button = new JButton("Кнопка " + i);
                button.setAlignmentX(Component.CENTER_ALIGNMENT);
                boxPanel.add(button);
                boxPanel.add(Box.createRigidArea(new Dimension(0, 10)));
            }
            tabbedPane.addTab("BoxLayout", boxPanel);

            // Додавання панелі вкладок до вікна
            frame.add(tabbedPane);

            // Відображення вікна
            frame.setVisible(true);
        });
    }
}
