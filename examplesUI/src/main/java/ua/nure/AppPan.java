package ua.nure;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


public class AppPan
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
            frame.setLayout(new BorderLayout());
            frame.setLocationRelativeTo(null);

// Створення компонентів для розділеної панелі
            JPanel leftPanel = new JPanel();
            leftPanel.add(new JLabel("Ліва панель"));

            JPanel rightPanel = new JPanel();
            rightPanel.add(new JLabel("Права панель"));

// Створення горизонтально розділеної панелі
            JSplitPane horizontalSplit = new JSplitPane(
                    JSplitPane.HORIZONTAL_SPLIT, // орієнтація
                    leftPanel,                    // лівий компонент
                    rightPanel                    // правий компонент
            );

// Налаштування панелі
            horizontalSplit.setDividerLocation(150); // початкове положення розділювача
            horizontalSplit.setResizeWeight(0.3); // лівий компонент отримує 30% при зміні розміру
            horizontalSplit.setOneTouchExpandable(true); // кнопки для швидкого розгортання

// Створення вертикально розділеної панелі
            JSplitPane verticalSplit = new JSplitPane(
                    JSplitPane.VERTICAL_SPLIT,
                    new JScrollPane(new JTextArea("Верхня область")),
                    new JScrollPane(new JTextArea("Нижня область"))
            );
            verticalSplit.setDividerLocation(200);
            frame.add(horizontalSplit);
            frame.add(verticalSplit);
            frame.setVisible(true);

        });
    }
}
