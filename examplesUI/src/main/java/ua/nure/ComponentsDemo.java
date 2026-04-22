package ua.nure;

import javax.swing.*;
import java.awt.*;

public class ComponentsDemo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Демонстрація компонентів");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500, 400);

            // Створення панелі з розміткою сітки
            JPanel panel = new JPanel(new GridLayout(0, 2, 10, 10));
            panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

            // Додавання різних компонентів
            panel.add(new JLabel("Мітка (JLabel):"));
            panel.add(new JLabel("Це текстова мітка"));

            panel.add(new JLabel("Кнопка (JButton):"));
            panel.add(new JButton("Натисни мене"));

            panel.add(new JLabel("Текстове поле (JTextField):"));
            panel.add(new JTextField("Редагуй мене"));

            panel.add(new JLabel("Прапорець (JCheckBox):"));
            panel.add(new JCheckBox("Вибери мене"));

            panel.add(new JLabel("Перемикачі (JRadioButton):"));
            JPanel radioPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
            ButtonGroup group = new ButtonGroup();
            JRadioButton option1 = new JRadioButton("Опція 1");
            JRadioButton option2 = new JRadioButton("Опція 2");
            group.add(option1);
            group.add(option2);
            radioPanel.add(option1);
            radioPanel.add(option2);
            panel.add(radioPanel);

            panel.add(new JLabel("Випадаючий список (JComboBox):"));
            JComboBox<String> comboBox = new JComboBox<>(
                    new String[]{"Елемент 1", "Елемент 2", "Елемент 3"});
            panel.add(comboBox);

            // Додавання панелі до вікна
            frame.add(panel);

            // Відображення вікна
            frame.setVisible(true);
        });
    }
}

