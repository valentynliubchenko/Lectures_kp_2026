package ua.nure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class DayOfWeekTest {

    @Test
    void values() {
        DayOfWeek day = DayOfWeek.TUESDAY;
        DayOfWeek dayW = DayOfWeek.valueOf("WEDNESDAY");
        System.out.println("day = " + day);
        System.out.println("dayW = " + dayW);
        for (DayOfWeek d : DayOfWeek.values()) {
            System.out.println(d);
        }
        DayOfWeek today = DayOfWeek.MONDAY;
        DayOfWeek friday = DayOfWeek.FRIDAY;
        if (today.compareTo(friday) < 0) {
            System.out.println("Понеділок настає раніше ніж п'ятниця");
        }


    }
}