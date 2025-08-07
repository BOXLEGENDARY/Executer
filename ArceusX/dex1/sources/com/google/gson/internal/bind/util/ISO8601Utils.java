package com.google.gson.internal.bind.util;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class ISO8601Utils {
    private static final String UTC_ID = "UTC";
    private static final TimeZone TIMEZONE_UTC = TimeZone.getTimeZone(UTC_ID);

    private ISO8601Utils() {
    }

    private static boolean checkOffset(String str, int i7, char c2) {
        return i7 < str.length() && str.charAt(i7) == c2;
    }

    public static String format(Date date) {
        return format(date, false, TIMEZONE_UTC);
    }

    private static int indexOfNonDigit(String str, int i7) {
        while (i7 < str.length()) {
            char cCharAt = str.charAt(i7);
            if (cCharAt < '0' || cCharAt > '9') {
                return i7;
            }
            i7++;
        }
        return str.length();
    }

    private static void padInt(StringBuilder sb, int i7, int i8) {
        String string = Integer.toString(i7);
        for (int length = i8 - string.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(string);
    }

    public static java.util.Date parse(java.lang.String r19, java.text.ParsePosition r20) throws java.text.ParseException {
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.util.ISO8601Utils.parse(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    private static int parseInt(String str, int i7, int i8) throws NumberFormatException {
        int i9;
        int i10;
        if (i7 < 0 || i8 > str.length() || i7 > i8) {
            throw new NumberFormatException(str);
        }
        if (i7 < i8) {
            i10 = i7 + 1;
            int iDigit = Character.digit(str.charAt(i7), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i7, i8));
            }
            i9 = -iDigit;
        } else {
            i9 = 0;
            i10 = i7;
        }
        while (i10 < i8) {
            int i11 = i10 + 1;
            int iDigit2 = Character.digit(str.charAt(i10), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i7, i8));
            }
            i9 = (i9 * 10) - iDigit2;
            i10 = i11;
        }
        return -i9;
    }

    public static String format(Date date, boolean z7) {
        return format(date, z7, TIMEZONE_UTC);
    }

    public static String format(Date date, boolean z7, TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder(19 + (z7 ? 4 : 0) + (timeZone.getRawOffset() == 0 ? 1 : 6));
        padInt(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        padInt(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        padInt(sb, gregorianCalendar.get(5), 2);
        sb.append('T');
        padInt(sb, gregorianCalendar.get(11), 2);
        sb.append(':');
        padInt(sb, gregorianCalendar.get(12), 2);
        sb.append(':');
        padInt(sb, gregorianCalendar.get(13), 2);
        if (z7) {
            sb.append('.');
            padInt(sb, gregorianCalendar.get(14), 3);
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i7 = offset / 60000;
            int iAbs = Math.abs(i7 / 60);
            int iAbs2 = Math.abs(i7 % 60);
            sb.append(offset >= 0 ? '+' : '-');
            padInt(sb, iAbs, 2);
            sb.append(':');
            padInt(sb, iAbs2, 2);
        } else {
            sb.append('Z');
        }
        return sb.toString();
    }
}
