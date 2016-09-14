package br.com.improving.demo.jackpot.time;

import org.joda.time.Days;
import org.joda.time.LocalDate;

public class LocalDateDemo {
    public int daysToEndOfMonth() {
        LocalDate today = new LocalDate();
        return today.dayOfMonth().getMaximumValue() - today.getDayOfMonth();
    }
    
    public LocalDate nextOrSameSundayAfterEndOfMonth() {
        return new LocalDate().dayOfMonth().withMaximumValue()
                .dayOfWeek().withMaximumValue();
    }
    
    public int dateDiff(LocalDate start, LocalDate end) {
        return Days.daysBetween(start, end).getDays();
    }
}
