package com.epam.task5003;

////Задача 3.
////Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию о
////выходных и праздничных днях.

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Calendar implements Serializable {

    private Set<Date> dates;

    public Calendar() {
        dates = new TreeSet<>();
    }

    public Calendar(Set<Date> dates) {
        if (dates != null) {
            this.dates = dates;
        } else {
            this.dates = new TreeSet<>();
        }
    }

    public Set<Date> getDates() {
        return dates;
    }

    public void setDates(Set<Date> dates) {
        if (dates != null) {
            this.dates = dates;
        } else {
            this.dates = new TreeSet<>();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Calendar)) return false;
        Calendar calendar = (Calendar) o;
        return Objects.equals(dates, calendar.dates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dates);
    }

    @Override
    public String toString() {
        return "Calendar{" +
                "dates=" + dates +
                '}';
    }

    public static class Date implements Comparable<Date>, Serializable {
        private LocalDate date;
        private String nameOfHoliday;

        public Date() {
            this.date = LocalDate.now();
            this.nameOfHoliday = "day off";
        }

        public Date(LocalDate date) {
            this.date = date;
            this.nameOfHoliday = "day off";
        }

        public Date(LocalDate date, String nameOfHoliday) {
            this.date = date;
            this.nameOfHoliday = nameOfHoliday;
        }

        public LocalDate getDate() {
            return date;
        }

        public void setDate(LocalDate date) {
            this.date = date;
        }

        public String getNameOfHoliday() {
            return nameOfHoliday;
        }

        public void setNameOfHoliday(String nameOfHoliday) {
            if (nameOfHoliday != null) {
                this.nameOfHoliday = nameOfHoliday;
            } else {
                this.nameOfHoliday = "";
            }
        }

        @Override
        public int compareTo(Date other) {
            if (this.date.isBefore(other.date)) {
                return -1;
            } else if (this.date.isAfter(other.date)) {
                return 1;
            } else {
                return 0;
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Date)) return false;
            Date date1 = (Date) o;
            return Objects.equals(date, date1.date) &&
                    Objects.equals(nameOfHoliday, date1.nameOfHoliday);
        }

        @Override
        public int hashCode() {
            return Objects.hash(date, nameOfHoliday);
        }

        @Override
        public String toString() {
            return "Date{" +
                    "date=" + date +
                    ", nameOfHoliday='" + nameOfHoliday + '\'' +
                    '}';
        }
    }
}
