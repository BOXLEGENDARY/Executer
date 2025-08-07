package com.appsflyer.internal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.AFLogger;
import com.appsflyer.R;
import com.github.luben.zstd.BuildConfig;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class AFc1jSDK extends HashMap<String, Object> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static boolean AFAdRevenueData = false;
    private static boolean areAllFieldsValid = false;
    private static int component2 = 1;
    private static int component3;
    private static int component4;
    private static char[] getMonetizationNetwork;
    private static int getRevenue;
    private final Context getCurrencyIso4217Code;
    private final Map<String, Object> getMediationNetwork;

    public static class AFa1vSDK {
        static byte[] getMonetizationNetwork(String str) throws Exception {
            return str.getBytes(Charset.defaultCharset());
        }

        static byte[] getRevenue(byte[] bArr) throws Exception {
            for (int i7 = 0; i7 < bArr.length; i7++) {
                bArr[i7] = (byte) (bArr[i7] ^ ((i7 % 2) + 42));
            }
            return bArr;
        }
    }

    static {
        getMonetizationNetwork();
        ExpandableListView.getPackedPositionChild(0L);
        View.resolveSize(0, 0);
        Process.getThreadPriority(0);
        ViewConfiguration.getTouchSlop();
        View.MeasureSpec.getSize(0);
        TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0');
        ExpandableListView.getPackedPositionForGroup(0);
        TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0);
        ViewConfiguration.getPressedStateDuration();
        View.MeasureSpec.getMode(0);
        ViewConfiguration.getTapTimeout();
        Color.argb(0, 0, 0, 0);
        View.resolveSize(0, 0);
        int i7 = component2 + 1;
        component3 = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    public AFc1jSDK(Map<String, Object> map, Context context) {
        this.getMediationNetwork = map;
        this.getCurrencyIso4217Code = context;
        put(getMediationNetwork(), AFAdRevenueData());
    }

    private static StringBuilder AFAdRevenueData(String... strArr) throws Exception {
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        for (int i7 = 0; i7 < 3; i7++) {
            arrayList.add(Integer.valueOf(strArr[i7].length()));
        }
        Collections.sort(arrayList);
        int iIntValue = ((Integer) arrayList.get(0)).intValue();
        StringBuilder sb = new StringBuilder();
        int i8 = 0;
        while (i8 < iIntValue) {
            component2 = (component3 + 1) % 128;
            Integer numValueOf = null;
            int i9 = 0;
            while (i9 < 3) {
                component3 = (component2 + 65) % 128;
                int iCharAt = strArr[i9].charAt(i8);
                if (numValueOf != null) {
                    iCharAt ^= numValueOf.intValue();
                }
                numValueOf = Integer.valueOf(iCharAt);
                i9++;
                component3 = (component2 + 17) % 128;
            }
            sb.append(Integer.toHexString(numValueOf.intValue()));
            i8++;
            component2 = (component3 + 27) % 128;
        }
        return sb;
    }

    private static void a(String str, int[] iArr, String str2, int i7, Object[] objArr) throws UnsupportedEncodingException {
        int i8;
        byte[] bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = bytes;
        char[] cArr = str;
        if (str != null) {
            char[] charArray = str.toCharArray();
            $10 = ($11 + 47) % 128;
            cArr = charArray;
        }
        char[] cArr2 = cArr;
        AFk1vSDK aFk1vSDK = new AFk1vSDK();
        char[] cArr3 = getMonetizationNetwork;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            for (int i9 = 0; i9 < length; i9++) {
                cArr4[i9] = (char) (cArr3[i9] ^ 2910800062654154531L);
            }
            cArr3 = cArr4;
        }
        int i10 = (int) (2910800062654154531L ^ getRevenue);
        if (areAllFieldsValid) {
            $11 = ($10 + 87) % 128;
            int length2 = bArr.length;
            aFk1vSDK.getMediationNetwork = length2;
            char[] cArr5 = new char[length2];
            aFk1vSDK.AFAdRevenueData = 0;
            while (true) {
                int i11 = aFk1vSDK.AFAdRevenueData;
                int i12 = aFk1vSDK.getMediationNetwork;
                if (i11 >= i12) {
                    objArr[0] = new String(cArr5);
                    return;
                } else {
                    $11 = ($10 + 11) % 128;
                    cArr5[i11] = (char) (cArr3[bArr[(i12 - 1) - i11] + i7] - i10);
                    aFk1vSDK.AFAdRevenueData = i11 + 1;
                }
            }
        } else {
            if (AFAdRevenueData) {
                int length3 = cArr2.length;
                aFk1vSDK.getMediationNetwork = length3;
                char[] cArr6 = new char[length3];
                aFk1vSDK.AFAdRevenueData = 0;
                while (true) {
                    int i13 = aFk1vSDK.AFAdRevenueData;
                    int i14 = aFk1vSDK.getMediationNetwork;
                    if (i13 >= i14) {
                        break;
                    }
                    cArr6[i13] = (char) (cArr3[cArr2[(i14 - 1) - i13] - i7] - i10);
                    aFk1vSDK.AFAdRevenueData = i13 + 1;
                }
                String str3 = new String(cArr6);
                int i15 = $11 + 31;
                $10 = i15 % 128;
                if (i15 % 2 != 0) {
                    throw null;
                }
                objArr[0] = str3;
                return;
            }
            int length4 = iArr.length;
            aFk1vSDK.getMediationNetwork = length4;
            char[] cArr7 = new char[length4];
            aFk1vSDK.AFAdRevenueData = 0;
            while (true) {
                int i16 = aFk1vSDK.AFAdRevenueData;
                int i17 = aFk1vSDK.getMediationNetwork;
                if (i16 >= i17) {
                    objArr[0] = new String(cArr7);
                    return;
                }
                int i18 = $10 + R.styleable.AppCompatTheme_windowActionModeOverlay;
                $11 = i18 % 128;
                if (i18 % 2 == 0) {
                    cArr7[i16] = (char) (cArr3[iArr[i17 >> i16] << i7] >>> i10);
                    i8 = i16 % 0;
                } else {
                    cArr7[i16] = (char) (cArr3[iArr[(i17 - 1) - i16] - i7] - i10);
                    i8 = i16 + 1;
                }
                aFk1vSDK.AFAdRevenueData = i8;
            }
        }
    }

    private static void b(int r10, int r11, int r12, java.lang.String r13, boolean r14, java.lang.Object[] r15) {
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFc1jSDK.b(int, int, int, java.lang.String, boolean, java.lang.Object[]):void");
    }

    private String getMediationNetwork() throws UnsupportedEncodingException {
        component3 = (component2 + 53) % 128;
        try {
            String string = Integer.toString(Build.VERSION.SDK_INT);
            Map<String, Object> map = this.getMediationNetwork;
            Object[] objArr = new Object[1];
            a(null, null, "\u0089\u0086\u0081\u0084\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081", ExpandableListView.getPackedPositionGroup(0L) + 127, objArr);
            String string2 = map.get(((String) objArr[0]).intern()).toString();
            Map<String, Object> map2 = this.getMediationNetwork;
            Object[] objArr2 = new Object[1];
            a(null, null, "\u008d\u008c\u0081\u008b\u008a", 127 - KeyEvent.getDeadChar(0, 0), objArr2);
            String string3 = map2.get(((String) objArr2[0]).intern()).toString();
            if (string3 == null) {
                component2 = (component3 + R.styleable.AppCompatTheme_windowFixedWidthMinor) % 128;
                Object[] objArr3 = new Object[1];
                b(2 - (ViewConfiguration.getScrollBarSize() >> 8), 8 - View.MeasureSpec.getSize(0), (Process.myTid() >> 22) + R.styleable.AppCompatTheme_tooltipFrameBackground, "\u0002\ufff8\u0002\u0003\u0013\ufff6\u0006\ufff5", false, objArr3);
                string3 = ((String) objArr3[0]).intern();
            }
            StringBuilder sb = new StringBuilder(string2);
            sb.reverse();
            StringBuilder sbAFAdRevenueData = AFAdRevenueData(string, string3, sb.toString());
            int length = sbAFAdRevenueData.length();
            if (length > 4) {
                component3 = (component2 + 43) % 128;
                sbAFAdRevenueData.delete(4, length);
                component2 = (component3 + 75) % 128;
            } else {
                while (length < 4) {
                    int i7 = component2 + 5;
                    component3 = i7 % 128;
                    if (i7 % 2 != 0) {
                        length += 39;
                        sbAFAdRevenueData.append('F');
                    } else {
                        length++;
                        sbAFAdRevenueData.append('1');
                    }
                }
            }
            Object[] objArr4 = new Object[1];
            b(Color.blue(0) + 2, 3 - (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getScrollBarSize() >> 8) + 142, "\ufffe\uffff\u0004", false, objArr4);
            sbAFAdRevenueData.insert(0, ((String) objArr4[0]).intern());
            return sbAFAdRevenueData.toString();
        } catch (Exception e7) {
            Object[] objArr5 = new Object[1];
            a(null, null, "\u0097\u0084\u0085\u0096\u008e\u0093\u0087\u0095\u008e\u0082\u0087\u0095\u008e\u008f\u008c\u0085\u0084\u0081\u008b\u0087\u008c\u0087\u008f\u008e\u008d\u0087\u0094\u0085\u0081\u0082\u008e\u0093\u0087\u0092\u0091\u0090\u0084\u0087\u008f\u008e", 127 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr5);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr5[0]).intern(), e7);
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr6 = new Object[1];
            a(null, null, "\u008e\u009b\u008c\u009a\u0085\u0084\u0089\u0087\u0099\u0098\u0087\u008e\u0097\u0084\u0085\u0096\u008e\u0093\u0087\u0095\u008e\u0082\u0087\u0095\u008e\u008f\u008c\u0085\u0084\u0081\u008b\u0087\u008c\u0087\u008f\u008e\u008d\u0087\u0094\u0085\u0081\u0082", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + R.styleable.AppCompatTheme_windowNoTitle, objArr6);
            sb2.append(((String) objArr6[0]).intern());
            sb2.append(e7);
            AFLogger.afRDLog(sb2.toString());
            Object[] objArr7 = new Object[1];
            a(null, null, "\u009c\u009c\u009c\u009c\u0082\u0087\u0095", 127 - Drawable.resolveOpacity(0, 0), objArr7);
            return ((String) objArr7[0]).intern();
        }
    }

    static void getMonetizationNetwork() {
        getMonetizationNetwork = new char[]{34688, 34699, 34690, 34709, 34696, 34700, 34692, 34710, 34705, 34695, 34711, 34707, 34693, 34625, 34698, 34747, 34647, 34734, 34712, 34701, 34702, 34714, 34697, 34713, 34694, 34706, 34655, 34648, 34733, 34708, 34725, 34715, 34641, 34644, 34645, 34640, 34649, 34635};
        getRevenue = 581928801;
        AFAdRevenueData = true;
        areAllFieldsValid = true;
        component4 = 2144156583;
    }

    private java.lang.String AFAdRevenueData() throws java.io.UnsupportedEncodingException {
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFc1jSDK.AFAdRevenueData():java.lang.String");
    }
}
