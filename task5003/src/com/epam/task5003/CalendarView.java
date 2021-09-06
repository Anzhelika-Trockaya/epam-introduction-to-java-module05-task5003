package com.epam.task5003;

import java.time.format.DateTimeFormatter;

public class CalendarView {
    private Calendar calendar;
    private static final DateTimeFormatter formatter;

    static{
        formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
    }

    public CalendarView(Calendar calendar) {
        if (calendar != null) {
            this.calendar = calendar;
        } else {
            this.calendar = new Calendar();
        }
    }

    public void printDates() {
        for (Calendar.Date date : calendar.getDates()) {
            System.out.println(dateToString(date));
        }
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
