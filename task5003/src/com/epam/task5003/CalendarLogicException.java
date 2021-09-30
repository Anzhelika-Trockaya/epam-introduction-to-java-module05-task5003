package com.epam.task5003;

public class CalendarLogicException extends Exception {
    public CalendarLogicException() {
    }

    public CalendarLogicException(String message) {
        super(message);
    }

    public CalendarLogicException(String message, Exception exception) {
        super(message, exception);
    }

    public CalendarLogicException(Exception exception) {
        super(exception);
    }
}
