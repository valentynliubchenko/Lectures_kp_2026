package ua.nure;

import org.junit.jupiter.api.Test;

import java.util.EnumMap;
import java.util.EnumSet;

import static org.junit.jupiter.api.Assertions.*;

class DayOfWeekTestSetMap {

    @Test
    void values() {

// Створення EnumSet з кількох констант
        EnumSet<DayOfWeek> weekends = EnumSet.of(DayOfWeek.SATURDAY, DayOfWeek.SUNDAY);
        DayOfWeek monday = DayOfWeek.MONDAY;
        assertFalse(weekends.contains(monday));

        DayOfWeek s = DayOfWeek.SUNDAY;
        assertTrue(weekends.contains(s));


        for (DayOfWeek day : weekends) {
            System.out.println(day);
        }

// Створення EnumSet з усіх констант
        EnumSet<DayOfWeek> allDays = EnumSet.allOf(DayOfWeek.class);
        for (DayOfWeek day : allDays) {
            System.out.println(day);
        }

// Створення EnumSet з усіх констант, окрім вказаних
        EnumSet<DayOfWeek> workDays = EnumSet.complementOf(weekends);
        for (DayOfWeek day : workDays) {
            System.out.println(day);
        }




        EnumMap<DayOfWeek, String> dayActivities = new EnumMap<>(DayOfWeek.class);
        dayActivities.put(DayOfWeek.MONDAY, "Зустріч команди");
        dayActivities.put(DayOfWeek.WEDNESDAY, "Перегляд проміжних результатів");
        dayActivities.put(DayOfWeek.FRIDAY, "Підбиття підсумків тижня");

        System.out.println("У середу: " + dayActivities.get(DayOfWeek.WEDNESDAY));
        for (String day : dayActivities.values()) {
            System.out.println(day);
        }
    }
}