package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

class o {

    private static final o f17869c = new o(null, null);

    private final Long f17870a;

    private final TimeZone f17871b;

    private o(Long l7, TimeZone timeZone) {
        this.f17870a = l7;
        this.f17871b = timeZone;
    }

    static o c() {
        return f17869c;
    }

    Calendar a() {
        return b(this.f17871b);
    }

    Calendar b(TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l7 = this.f17870a;
        if (l7 != null) {
            calendar.setTimeInMillis(l7.longValue());
        }
        return calendar;
    }
}
