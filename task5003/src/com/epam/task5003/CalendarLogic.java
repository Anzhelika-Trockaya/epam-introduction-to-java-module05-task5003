package com.epam.task5003;

import java.time.LocalDate;
import java.util.Set;

public class CalendarLogic {

    public CalendarLogic() {
    }

    public Set<Calendar.Date> getDates(Calendar calendar) throws CalendarLogicException {
        if (calendar != null) {
            return calendar.getDates();
        } else {
            throw new CalendarLogicException("Calendar is null!");
        }
    }

    public void addDate(Calendar calendar, LocalDate date) throws CalendarLogicException {
        if (calendar != null) {
            calendar.getDates().add(new Calendar.Date(date));
        } else {
            throw new CalendarLogicException("Calendar is null!");
        }
    }

    public void addDate(Calendar calendar, LocalDate date, String nameOfHoliday) throws CalendarLogicException {
        if (calendar != null) {
            calendar.getDates().add(new Calendar.Date(date, nameOfHoliday));
        } else {
            throw new CalendarLogicException("Calendar is null!");
        }
    }

    public void deleteDate(Calendar calendar, LocalDate date) throws CalendarLogicException {
        if (calendar != null) {
            for (Calendar.Date currentDate : calendar.getDates()) {
                if (currentDate.getDate().equals(date)) {
                    calendar.getDates().remove(currentDate);
                    break;
                }
            }
        } else {
            throw new CalendarLogicException("Calendar is null!");
        }
    }

    public void deleteDate(Calendar calendar, String nameOfHoliday) throws CalendarLogicException {
        if (calendar != null) {
            for (Calendar.Date currentDate : calendar.getDates()) {
                if (currentDate.getNameOfHoliday().equals(nameOfHoliday)) {
                    calendar.getDates().remove(currentDate);
                    break;
                }
            }
        } else {
            throw new CalendarLogicException("Calendar is null!");
        }
    }
}
