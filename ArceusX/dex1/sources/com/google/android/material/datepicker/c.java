package com.google.android.material.datepicker;

import android.content.Context;
import c4.C1753i;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

class c {
    static String a(Context context, long j7, boolean z7, boolean z8, boolean z9) {
        String strD = d(j7);
        if (z7) {
            strD = String.format(context.getString(C1753i.f12938q), strD);
        }
        return z8 ? String.format(context.getString(C1753i.f12937p), strD) : z9 ? String.format(context.getString(C1753i.f12934m), strD) : strD;
    }

    static String b(long j7) {
        return c(j7, Locale.getDefault());
    }

    static String c(long j7, Locale locale) {
        return p.d(locale).format(new Date(j7));
    }

    static String d(long j7) {
        return i(j7) ? b(j7) : g(j7);
    }

    static String e(Context context, int i7) {
        return p.g().get(1) == i7 ? String.format(context.getString(C1753i.f12935n), Integer.valueOf(i7)) : String.format(context.getString(C1753i.f12936o), Integer.valueOf(i7));
    }

    static String f(long j7) {
        return p.k(Locale.getDefault()).format(new Date(j7));
    }

    static String g(long j7) {
        return h(j7, Locale.getDefault());
    }

    static String h(long j7, Locale locale) {
        return p.l(locale).format(new Date(j7));
    }

    private static boolean i(long j7) {
        Calendar calendarG = p.g();
        Calendar calendarI = p.i();
        calendarI.setTimeInMillis(j7);
        return calendarG.get(1) == calendarI.get(1);
    }
}
