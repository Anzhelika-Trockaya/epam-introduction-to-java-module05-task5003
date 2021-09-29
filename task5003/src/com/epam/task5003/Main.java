package com.epam.task5003;

//Задача 3.
//Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию о
//выходных и праздничных днях.

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Calendar myCalendar;
        CalendarLogic logic;
        CalendarView view;

        myCalendar = new Calendar();

        logic = new CalendarLogic(myCalendar);
        view = new CalendarView();

        logic.addDate(LocalDate.of(2021, 3, 8), "Woman Day");
        logic.addDate(LocalDate.of(2021, 1, 1), "New Year");
        logic.addDate(LocalDate.of(2021, 12, 25), "Christmas");
        logic.addDate(LocalDate.of(2021, 4, 1), "1 April");

        view.printDates(logic.getDates());

        logic.deleteDate(LocalDate.of(2021, 3, 8));
        logic.deleteDate("1 April");
        logic.addDate(LocalDate.of(2021, 4, 25));

        view.printDates(logic.getDates());
    }
}
