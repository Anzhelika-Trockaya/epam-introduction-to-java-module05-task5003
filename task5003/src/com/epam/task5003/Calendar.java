package com.epam.task5003;

////Задача 3.
////Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию о
////выходных и праздничных днях.

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.TreeSet;

public class Calendar {

    private final TreeSet<Date> dates;

    public Calendar() {
        dates = new TreeSet<>(Date::compareTo);
    }

    public void addDate(LocalDate date) {
        dates.add(new Date(date));
    }

    public void addDate(LocalDate date, String nameOfHoliday) {
        dates.add(new Date(date, nameOfHoliday));
    }

    public void deleteDate(LocalDate date) {
        for (Date currentDate : dates) {
            if (currentDate.date.equals(date)) {
                dates.remove(currentDate);
                break;
            }
        }
    }

    public void deleteDate(String nameOfHoliday) {
        for (Date currentDate : dates) {
            if (currentDate.nameOfHoliday.equals(nameOfHoliday)) {
                dates.remove(currentDate);
                break;
            }
        }
    }

    public void printDates() {
        for (Date date : dates) {
            System.out.println(date);
        }
    }

    private class Date {
        private final LocalDate date;
        private String nameOfHoliday;
        private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");

        public Date(LocalDate date) {
            this.date = date;
        }

        public Date(LocalDate date, String nameOfHoliday) {
            this.date = date;
            this.nameOfHoliday = nameOfHoliday;
        }

        public String toString() {
            String result = formatter.format(date);
            if (nameOfHoliday != null) {
                result += " - " + nameOfHoliday;
            } else {
                result += " - day off";
            }
            return result;
        }

        public int compareTo(Date other) {
            if (this.date.isBefore(other.date)) {
                return -1;
            } else if (this.date.isAfter(other.date)) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}
