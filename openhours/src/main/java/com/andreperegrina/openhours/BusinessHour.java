package com.andreperegrina.openhours;

import java.util.Calendar;

public class BusinessHour {
    private BusinessDay day;
    private Calendar startTime = Calendar.getInstance();
    private Calendar endTime = Calendar.getInstance();


    public BusinessHour(BusinessDay day, int hourStart, int minuteStart, int hourEnd, int minuteEnd) throws Exception {
        if (hourStart >= 0 && hourStart < 24 && minuteStart >= 0 && minuteStart < 60 && hourEnd >= 0 && hourEnd < 24 && minuteEnd >= 0 && minuteEnd < 60) {
            setStartTime(hourStart, minuteStart);
            int plusDays = 0;
            if (hourEnd < hourStart || (hourEnd == hourStart && minuteEnd < minuteStart))
                plusDays = 1;
            setEndTime(hourEnd, minuteEnd, plusDays);
            this.day = day;
        } else {
            throw new Exception("The hour most be between 0 and 23 and the minute between 0 and 59");
        }
    }

    public void setStartTime(int hour, int minute) {
        this.startTime.set(Calendar.HOUR_OF_DAY, hour);
        this.startTime.set(Calendar.MINUTE, minute);
    }

    public void setEndTime(int hour, int minute, int plusDays) {
        this.endTime.set(Calendar.HOUR_OF_DAY, hour);
        this.endTime.set(Calendar.MINUTE, minute);
        this.endTime.set(Calendar.DAY_OF_YEAR, this.endTime.get(Calendar.DAY_OF_YEAR) + plusDays);
    }

    public boolean isOpen(Calendar time) {
        return time.after(startTime) && time.before(endTime);
    }

    public boolean isNotOpenYet(Calendar time) {
        return time.before(startTime);
    }

    public boolean isClosed(Calendar time) {
        return time.after(endTime);
    }

    public BusinessState theBusinessIs(Calendar time) {
        if (isNotOpenYet(time))
            return BusinessState.NOT_OPEN_YET;
        if (isClosed(time))
            return BusinessState.CLOSED;
        return BusinessState.OPEN;
    }

    //Getters and setters
    public Calendar getStartTime() {
        return startTime;
    }

    public Calendar getEndTime() {
        return endTime;
    }

    public BusinessDay getDay() {
        return day;
    }

    public void setDay(BusinessDay day) {
        this.day = day;
    }
}
