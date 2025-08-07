package com.google.gson.internal;

import y0.xyyu.hkVlaTTCDY;

public final class JavaVersion {
    private static final int majorJavaVersion = determineMajorJavaVersion();

    private JavaVersion() {
    }

    private static int determineMajorJavaVersion() {
        return parseMajorJavaVersion(System.getProperty("java.version"));
    }

    private static int extractBeginningInt(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            for (int i7 = 0; i7 < str.length(); i7++) {
                char cCharAt = str.charAt(i7);
                if (!Character.isDigit(cCharAt)) {
                    break;
                }
                sb.append(cCharAt);
            }
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static int getMajorJavaVersion() {
        return majorJavaVersion;
    }

    public static boolean isJava9OrLater() {
        return majorJavaVersion >= 9;
    }

    private static int parseDotted(String str) throws NumberFormatException {
        try {
            String[] strArrSplit = str.split(hkVlaTTCDY.sYdhDNqBEDkcvr, 3);
            int i7 = Integer.parseInt(strArrSplit[0]);
            return (i7 != 1 || strArrSplit.length <= 1) ? i7 : Integer.parseInt(strArrSplit[1]);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    static int parseMajorJavaVersion(String str) throws NumberFormatException {
        int dotted = parseDotted(str);
        if (dotted == -1) {
            dotted = extractBeginningInt(str);
        }
        if (dotted == -1) {
            return 6;
        }
        return dotted;
    }
}
