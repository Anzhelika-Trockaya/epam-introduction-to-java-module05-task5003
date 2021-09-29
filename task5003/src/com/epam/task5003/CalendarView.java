package com.epam.task5003;

import java.time.format.DateTimeFormatter;
import java.util.Set;

public class CalendarView {
    private static final DateTimeFormatter formatter;

    static{
        formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
    }

    public CalendarView() {
    }

    public void printDates(Set<Calendar.Date> dateSet) {
        for (Calendar.Date date : dateSet) {
            System.out.println(dateToString(date));
        }
        System.out.println();
    }

    public String dateToString(Calendar.Date date) {
        String result;

        result = formatter.format(date.getDate());

        if (date.getNameOfHoliday() != null) {
            result += " - " + date.getNameOfHoliday();
        } else {
            result += " - day off";
        }

        return result;
    }
}
