package com.epam.task5003;

//Задача 3.
//Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию о
//выходных и праздничных днях.

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Calendar myCalendar = new Calendar();
        myCalendar.addDate(LocalDate.of(2021,3,8), "Woman Day");
        myCalendar.addDate(LocalDate.of(2021,1,1), "New Year");
        myCalendar.addDate(LocalDate.of(2021,12,25),"Christmas");
        myCalendar.addDate(LocalDate.of(2021,4,1),"1 April");

        myCalendar.printDates();
        System.out.println();

        myCalendar.deleteDate(LocalDate.of(2021,3,8));
        myCalendar.deleteDate("1 April");
        myCalendar.addDate(LocalDate.of(2021,4,25));
        myCalendar.printDates();
    }
}
