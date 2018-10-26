package com.andreperegrina.openhours;

import java.util.HashMap;
import java.util.Map;

public enum BusinessDay {
    SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4),
    THURSDAY(5), FRIDAY(6), SATURDAY(7);

    private final int day;
    private static Map<Integer, BusinessDay> map = new HashMap<>();

    BusinessDay(int day) {
        this.day = day;
    }

    static {
        for (BusinessDay businessDay : BusinessDay.values()) {
            map.put(businessDay.day, businessDay);
        }
    }

    public static BusinessDay valueOf(int pageType) {
        return map.get(pageType);
    }

    public int getValue() {
        return day;
    }
}
