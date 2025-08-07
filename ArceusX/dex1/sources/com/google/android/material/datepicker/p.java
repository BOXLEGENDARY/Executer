package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

class p {

    static AtomicReference<o> f17872a = new AtomicReference<>();

    static long a(long j7) {
        Calendar calendarI = i();
        calendarI.setTimeInMillis(j7);
        return c(calendarI).getTimeInMillis();
    }

    private static DateFormat b(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(h());
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        return instanceForSkeleton;
    }

    static Calendar c(Calendar calendar) {
        Calendar calendarJ = j(calendar);
        Calendar calendarI = i();
        calendarI.set(calendarJ.get(1), calendarJ.get(2), calendarJ.get(5));
        return calendarI;
    }

    static DateFormat d(Locale locale) {
        return b("MMMMEEEEd", locale);
    }

    static o e() {
        o oVar = f17872a.get();
        return oVar == null ? o.c() : oVar;
    }

    private static TimeZone f() {
        return TimeZone.getTimeZone("UTC");
    }

    static Calendar g() {
        Calendar calendarA = e().a();
        calendarA.set(11, 0);
        calendarA.set(12, 0);
        calendarA.set(13, 0);
        calendarA.set(14, 0);
        calendarA.setTimeZone(f());
        return calendarA;
    }

    private static android.icu.util.TimeZone h() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    static Calendar i() {
        return j(null);
    }

    static Calendar j(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(f());
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }

    static DateFormat k(Locale locale) {
        return b("yMMMM", locale);
    }

    static DateFormat l(Locale locale) {
        return b("yMMMMEEEEd", locale);
    }
}
