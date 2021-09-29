package com.epam.task5003;

import java.time.LocalDate;
import java.util.Set;

public class CalendarLogic {
    private Calendar calendar;

    public CalendarLogic(Calendar calendar) {
        if(calendar!=null) {
            this.calendar = calendar;
        } else{
            this.calendar=new Calendar();
        }
    }

    public Set<Calendar.Date> getDates(){
        return calendar.getDates();
    }

    public void addDate(LocalDate date) {
        calendar.getDates().add(new Calendar.Date(date));
    }

    public void addDate(LocalDate date, String nameOfHoliday) {
        calendar.getDates().add(new Calendar.Date(date, nameOfHoliday));
    }

    public void deleteDate(LocalDate date) {
        for (Calendar.Date currentDate : calendar.getDates()) {
            if (currentDate.getDate().equals(date)) {
                calendar.getDates().remove(currentDate);
                break;
            }
        }
    }

    public void deleteDate(String nameOfHoliday) {
        for (Calendar.Date currentDate : calendar.getDates()) {
            if (currentDate.getNameOfHoliday().equals(nameOfHoliday)) {
                calendar.getDates().remove(currentDate);
                break;
            }
        }
    }
}
