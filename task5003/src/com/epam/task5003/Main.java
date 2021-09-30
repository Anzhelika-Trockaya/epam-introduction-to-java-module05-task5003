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

        logic = new CalendarLogic();
        view = new CalendarView();

        try {
            logic.addDate(myCalendar, LocalDate.of(2021, 3, 8), "Woman Day");
            logic.addDate(myCalendar, LocalDate.of(2021, 1, 1), "New Year");
            logic.addDate(myCalendar, LocalDate.of(2021, 12, 25), "Christmas");
            logic.addDate(myCalendar, LocalDate.of(2021, 4, 1), "1 April");

            view.printDates(logic.getDates(myCalendar));

            logic.deleteDate(myCalendar, LocalDate.of(2021, 3, 8));
            logic.deleteDate(myCalendar, "1 April");
            logic.addDate(myCalendar, LocalDate.of(2021, 4, 25));

            view.printDates(logic.getDates(myCalendar));
        } catch (CalendarLogicException exception) {
            System.out.println("Error! " + exception.getMessage());
        }
    }
}
