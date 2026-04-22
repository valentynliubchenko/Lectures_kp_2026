package ua.nure;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


public class AppSp
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
            frame.setLayout(new FlowLayout());
            frame.setLocationRelativeTo(null);
            JLabel label = new JLabel("Привіт, Swing!");

// Числовий спінер
            SpinnerNumberModel numModel = new SpinnerNumberModel(
                    50,     // початкове значення
                    0,      // мінімум
                    100,    // максимум
                    5       // крок
            );
            JSpinner numSpinner = new JSpinner(numModel);

// Спінер з датами
            Date now = new Date();
            SpinnerDateModel dateModel = new SpinnerDateModel(
                    now,                           // початкове значення
                    null,                          // мінімум (null - без обмежень)
                    null,                          // максимум (null - без обмежень)
                    Calendar.DAY_OF_MONTH          // поле для збільшення/зменшення
            );
            JSpinner dateSpinner = new JSpinner(dateModel);
            dateSpinner.setEditor(new JSpinner.DateEditor(dateSpinner, "dd.MM.yyyy"));

// Спінер зі списком значень
            String[] months = {"Січень", "Лютий", "Березень", "Квітень", "Травень",
                    "Червень", "Липень", "Серпень", "Вересень",
                    "Жовтень", "Листопад", "Грудень"};
            SpinnerListModel monthModel = new SpinnerListModel(months);
            JSpinner monthSpinner = new JSpinner(monthModel);

// Обробка зміни значення
            numSpinner.addChangeListener(e -> {
                System.out.println("Нове значення: " + numSpinner.getValue());
            });


            JToggleButton toggleButton = new JToggleButton("Увімкнути");
            toggleButton.addItemListener(e -> {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    toggleButton.setText("Вимкнути");
                    // Дія при увімкненні
                } else {
                    toggleButton.setText("Увімкнути");
                    // Дія при вимкненні
                }
            });

            JCheckBox checkBox = new JCheckBox("Підтвердити умови");

// Прапорець, вже відмічений при створенні
            JCheckBox selectedCheckBox = new JCheckBox("Активовано", true);

// Додавання обробника події
            checkBox.addItemListener(e -> {
                boolean selected = checkBox.isSelected();
                System.out.println("Прапорець " + (selected ? "відмічено" : "знято"));
            });

// Отримання стану прапорця
            boolean isChecked = checkBox.isSelected();

// Кнопка вже натиснута при створенні
            JToggleButton preselectedButton = new JToggleButton("Активно", true);

            // Створення групи перемикачів
            JRadioButton option1 = new JRadioButton("Опція 1");
            JRadioButton option2 = new JRadioButton("Опція 2");
            JRadioButton option3 = new JRadioButton("Опція 3");

// Створення групи кнопок (тільки одна може бути вибрана)
            ButtonGroup group = new ButtonGroup();
            group.add(option1);
            group.add(option2);
            group.add(option3);

// Встановлення початкового вибору
            option1.setSelected(true);

// Додавання обробника події
            option1.addItemListener(e -> {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    System.out.println("Вибрано опцію 1");
                }
            });
            option2.addItemListener(e -> {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    System.out.println("Вибрано опцію 2");
                }
            });

// Перевірка, яка опція вибрана
            if (option2.isSelected()) {
                System.out.println("Опція 2 активна");
            }

            String[] items = {"Елемент 1", "Елемент 2", "Елемент 3", "Елемент 4", "Елемент 5"};
            JList<String> list = new JList<>(items);

// Встановлення режиму вибору
            list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // один елемент
// або
            list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION); // декілька елементів

// Додавання до панелі прокрутки
            JScrollPane scrollPane = new JScrollPane(list);

// Додавання обробника вибору
            list.addListSelectionListener(e -> {
                if (!e.getValueIsAdjusting()) { // уникнення повторних подій
                    List<String> selectedItems = list.getSelectedValuesList();
                    System.out.println("Вибрано: " + selectedItems);
                }
            });

// Програмний вибір елементів
            list.setSelectedIndex(2); // вибір третього елемента


            frame.add(label);
            frame.add(numSpinner);
            frame.add(dateSpinner);
            frame.add(toggleButton);
            frame.add(checkBox);
            frame.add(selectedCheckBox);
            frame.setVisible(true);
            frame.add(preselectedButton);
            frame.add(option1);
            frame.add(option2);
            frame.add(option3);
            frame.add(list);

        });
    }
}
