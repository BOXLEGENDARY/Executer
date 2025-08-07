package com.appsflyer.internal;

import android.content.Context;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.MotionEvent;
import com.appsflyer.AFLogger;
import com.appsflyer.R;
import com.appsflyer.internal.AFf1lSDK;
import com.github.luben.zstd.BuildConfig;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import w7.Jld.EZYiRMRTxKdo;

public final class AFf1iSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int component1 = 586908573;
    private static int component4 = -2033323395;
    private static byte[] copy = {-101, -126, 109, -103, -116, -106, -102, -107, -75, -111, -123, -107};
    private static short[] copydefault = null;
    private static int equals = 1;
    private static int hashCode = 0;
    private static int toString = 1998795834;
    private final AFf1lSDK AFAdRevenueData;
    private volatile String areAllFieldsValid;
    private volatile String component2;
    private final AFc1hSDK getCurrencyIso4217Code;
    Map<String, Object> getMediationNetwork;
    private long getRevenue;
    private boolean getMonetizationNetwork = false;
    private volatile boolean component3 = false;

    public AFf1iSDK(AFc1hSDK aFc1hSDK, AFf1lSDK aFf1lSDK) {
        this.getCurrencyIso4217Code = aFc1hSDK;
        this.AFAdRevenueData = aFf1lSDK;
    }

    public static Object AFAdRevenueData(Object[] objArr, int i7, int i8, int i9) {
        int i10 = (i7 * 491) + (i8 * (-489));
        int i11 = ~i7;
        int i12 = ~i8;
        int i13 = i10 + ((i11 | i12 | (~i9)) * (-490)) + (((~(i7 | i12)) | (~(i12 | i9))) * 490) + (i11 * 490);
        return i13 != 1 ? i13 != 2 ? getMonetizationNetwork(objArr) : getCurrencyIso4217Code(objArr) : getMediationNetwork(objArr);
    }

    private static void a(int i7, int i8, int i9, byte b2, short s7, Object[] objArr) {
        boolean z7;
        boolean z8;
        char c2;
        AFk1pSDK aFk1pSDK = new AFk1pSDK();
        StringBuilder sb = new StringBuilder();
        int i10 = ((int) (component1 ^ (-1123129136953719915L))) + i9;
        if (i10 == -1) {
            $10 = ($11 + 9) % 128;
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7) {
            byte[] bArr = copy;
            if (bArr != null) {
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                for (int i11 = 0; i11 < length; i11++) {
                    bArr2[i11] = (byte) (bArr[i11] ^ (-1123129136953719915L));
                }
                bArr = bArr2;
            }
            if (bArr != null) {
                i10 = (byte) (((byte) (copy[((int) (component4 ^ (-1123129136953719915L))) + i8] ^ (-1123129136953719915L))) + ((int) (component1 ^ (-1123129136953719915L))));
                $10 = ($11 + 73) % 128;
            } else {
                i10 = (short) (((short) (copydefault[((int) (component4 ^ (-1123129136953719915L))) + i8] ^ (-1123129136953719915L))) + ((int) (component1 ^ (-1123129136953719915L))));
            }
        }
        if (i10 > 0) {
            aFk1pSDK.getCurrencyIso4217Code = ((i8 + i10) - 2) + ((int) (component4 ^ (-1123129136953719915L))) + (!(z7 ^ true) ? 1 : 0);
            char c3 = (char) (((int) (toString ^ (-1123129136953719915L))) + i7);
            aFk1pSDK.AFAdRevenueData = c3;
            sb.append(c3);
            aFk1pSDK.getMonetizationNetwork = aFk1pSDK.AFAdRevenueData;
            byte[] bArr3 = copy;
            if (bArr3 != null) {
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                for (int i12 = 0; i12 < length2; i12++) {
                    bArr4[i12] = (byte) (bArr3[i12] ^ (-1123129136953719915L));
                }
                bArr3 = bArr4;
            }
            if (bArr3 != null) {
                $10 = ($11 + 29) % 128;
                z8 = true;
            } else {
                z8 = false;
            }
            aFk1pSDK.getMediationNetwork = 1;
            while (aFk1pSDK.getMediationNetwork < i10) {
                int i13 = $10;
                $11 = (i13 + 23) % 128;
                if (!z8) {
                    short[] sArr = copydefault;
                    aFk1pSDK.getCurrencyIso4217Code = aFk1pSDK.getCurrencyIso4217Code - 1;
                    aFk1pSDK.AFAdRevenueData = (char) (aFk1pSDK.getMonetizationNetwork + (((short) (((short) (sArr[r9] ^ (-1123129136953719915L))) + s7)) ^ b2));
                } else {
                    int i14 = i13 + R.styleable.AppCompatTheme_windowActionBar;
                    $11 = i14 % 128;
                    if (i14 % 2 == 0) {
                        byte[] bArr5 = copy;
                        aFk1pSDK.getCurrencyIso4217Code = aFk1pSDK.getCurrencyIso4217Code + 1;
                        c2 = (char) (aFk1pSDK.getMonetizationNetwork << (((byte) (((byte) (bArr5[r9] - (-1123129136953719915L))) >> s7)) ^ b2));
                    } else {
                        byte[] bArr6 = copy;
                        aFk1pSDK.getCurrencyIso4217Code = aFk1pSDK.getCurrencyIso4217Code - 1;
                        c2 = (char) (aFk1pSDK.getMonetizationNetwork + (((byte) (((byte) (bArr6[r9] ^ (-1123129136953719915L))) + s7)) ^ b2));
                    }
                    aFk1pSDK.AFAdRevenueData = c2;
                }
                sb.append(aFk1pSDK.AFAdRevenueData);
                aFk1pSDK.getMonetizationNetwork = aFk1pSDK.AFAdRevenueData;
                aFk1pSDK.getMediationNetwork++;
            }
        }
        objArr[0] = sb.toString();
    }

    private long component3() {
        return ((Long) AFAdRevenueData(new Object[]{this}, -2122128656, 2122128657, System.identityHashCode(this))).longValue();
    }

    private boolean component4() {
        int i7 = equals;
        hashCode = (i7 + 37) % 128;
        Map<String, Object> map = this.getMediationNetwork;
        if (map != null) {
            hashCode = (i7 + R.styleable.AppCompatTheme_tooltipFrameBackground) % 128;
            if (!map.isEmpty()) {
                hashCode = (equals + 31) % 128;
                return true;
            }
        }
        equals = (hashCode + 79) % 128;
        return false;
    }

    private static Object getCurrencyIso4217Code(Object[] objArr) {
        AFf1iSDK aFf1iSDK = (AFf1iSDK) objArr[0];
        String str = (String) objArr[1];
        int i7 = equals + R.styleable.AppCompatTheme_windowActionModeOverlay;
        hashCode = i7 % 128;
        if (i7 % 2 != 0) {
            aFf1iSDK.component2 = str;
            int i8 = 14 / 0;
        } else {
            aFf1iSDK.component2 = str;
        }
        hashCode = (equals + 9) % 128;
        return null;
    }

    private static java.lang.Object getMonetizationNetwork(java.lang.Object[] r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1iSDK.getMonetizationNetwork(java.lang.Object[]):java.lang.Object");
    }

    final void component2() {
        Map<String, Object> map;
        Object objAFAdRevenueData;
        int i7 = hashCode + 79;
        equals = i7 % 128;
        if (i7 % 2 == 0) {
            this.getMediationNetwork.put("ttr", Long.valueOf(System.currentTimeMillis() ^ this.getRevenue));
            map = this.getMediationNetwork;
            objAFAdRevenueData = AFAdRevenueData(new Object[]{this}, -2122128656, 2122128657, System.identityHashCode(this));
        } else {
            this.getMediationNetwork.put("ttr", Long.valueOf(System.currentTimeMillis() - this.getRevenue));
            map = this.getMediationNetwork;
            objAFAdRevenueData = AFAdRevenueData(new Object[]{this}, -2122128656, 2122128657, System.identityHashCode(this));
        }
        map.put("lvl_timestamp", Long.valueOf(((Long) objAFAdRevenueData).longValue()));
    }

    public final boolean getMediationNetwork() {
        int i7 = hashCode + 43;
        equals = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
        boolean z7 = this.component3;
        int i8 = hashCode + 77;
        equals = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 88 / 0;
        }
        return z7;
    }

    public final void getRevenue(String str) {
        hashCode = (equals + 59) % 128;
        this.areAllFieldsValid = str;
        hashCode = (equals + 29) % 128;
    }

    public final String AFAdRevenueData() {
        equals = (hashCode + 23) % 128;
        String str = this.areAllFieldsValid;
        int i7 = equals + 79;
        hashCode = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 53 / 0;
        }
        return str;
    }

    public final Map<String, Object> getMediationNetwork(Map<String, Object> map) {
        AFc1jSDK aFc1jSDK = new AFc1jSDK(map, this.getCurrencyIso4217Code.getMonetizationNetwork);
        int i7 = hashCode + 39;
        equals = i7 % 128;
        if (i7 % 2 != 0) {
            return aFc1jSDK;
        }
        throw null;
    }

    public final void AFAdRevenueData(String str) {
        AFAdRevenueData(new Object[]{this, str}, 99232209, -99232207, System.identityHashCode(this));
    }

    public final String getRevenue() {
        hashCode = (equals + 37) % 128;
        String str = this.component2;
        equals = (hashCode + 45) % 128;
        return str;
    }

    private static Object getMediationNetwork(Object[] objArr) {
        AFf1iSDK aFf1iSDK = (AFf1iSDK) objArr[0];
        int i7 = hashCode + 51;
        equals = i7 % 128;
        if (i7 % 2 != 0) {
            return Long.valueOf(aFf1iSDK.getRevenue);
        }
        long j7 = aFf1iSDK.getRevenue;
        throw null;
    }

    public final void getRevenue(boolean z7) {
        equals = (hashCode + 73) % 128;
        this.component3 = z7;
        equals = (hashCode + 27) % 128;
    }

    public final Map<String, Object> getCurrencyIso4217Code() {
        HashMap map = new HashMap();
        if (component4()) {
            int i7 = hashCode + 5;
            equals = i7 % 128;
            if (i7 % 2 == 0) {
                map.put("lvl", this.getMediationNetwork);
                throw null;
            }
            map.put("lvl", this.getMediationNetwork);
        } else if (this.getMonetizationNetwork) {
            this.getMediationNetwork = new HashMap();
            component2();
            this.getMediationNetwork.put("error", "pending LVL response");
            map.put("lvl", this.getMediationNetwork);
        }
        int i8 = equals + 47;
        hashCode = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 94 / 0;
        }
        return map;
    }

    public final Map<String, Object> getRevenue(Map<String, Object> map) {
        try {
            try {
                Object[] objArr = {map, this.getCurrencyIso4217Code.getMonetizationNetwork};
                Map map2 = AFa1gSDK.f13584e;
                Object declaredConstructor = map2.get(-2122095116);
                if (declaredConstructor == null) {
                    declaredConstructor = ((Class) AFa1gSDK.getMonetizationNetwork(TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0) + 37, 123 - MotionEvent.axisFromString(BuildConfig.FLAVOR), (char) Gravity.getAbsoluteGravity(0, 0))).getDeclaredConstructor(Map.class, Context.class);
                    map2.put(-2122095116, declaredConstructor);
                }
                Map<String, Object> map3 = (Map) ((Constructor) declaredConstructor).newInstance(objArr);
                int i7 = equals + R.styleable.AppCompatTheme_windowFixedHeightMinor;
                hashCode = i7 % 128;
                if (i7 % 2 == 0) {
                    return map3;
                }
                throw null;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (Throwable th2) {
            AFLogger.afErrorLogForExcManagerOnly("AFCksmV3: reflection init failed", th2);
            return new HashMap();
        }
    }

    private long getRevenue(AFc1kSDK aFc1kSDK) {
        StringBuilder sb = new StringBuilder();
        sb.append(AFb1kSDK.getMonetizationNetwork(aFc1kSDK.getRevenue));
        sb.append(((Long) AFAdRevenueData(new Object[]{this}, -2122128656, 2122128657, System.identityHashCode(this))).longValue());
        long monetizationNetwork = AFj1hSDK.getMonetizationNetwork(AFj1hSDK.getMediationNetwork(sb.toString()));
        equals = (hashCode + 111) % 128;
        return monetizationNetwork;
    }

    public final void getCurrencyIso4217Code(AFc1kSDK aFc1kSDK) {
        this.getRevenue = System.currentTimeMillis();
        this.getMonetizationNetwork = this.AFAdRevenueData.AFAdRevenueData(getRevenue(aFc1kSDK), this.getCurrencyIso4217Code.getMonetizationNetwork, new AFf1lSDK.AFa1vSDK() {
            @Override
            public final void AFAdRevenueData(String str, String str2) {
                AFf1iSDK.this.getMediationNetwork = new ConcurrentHashMap();
                AFf1iSDK.this.getMediationNetwork.put("signedData", str);
                AFf1iSDK.this.getMediationNetwork.put(EZYiRMRTxKdo.flZPCgAzCVwDyJi, str2);
                AFf1iSDK.this.component2();
                AFLogger.afInfoLog("Successfully retrieved Google LVL data.");
            }

            @Override
            public final void getMediationNetwork(String str, Exception exc) {
                AFf1iSDK.this.getMediationNetwork = new ConcurrentHashMap();
                String message = exc.getMessage();
                if (message == null) {
                    message = "unknown";
                }
                AFf1iSDK.this.component2();
                AFf1iSDK.this.getMediationNetwork.put("error", message);
                AFLogger.afErrorLog(str, exc, true, true, false);
            }
        });
        int i7 = equals + 69;
        hashCode = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 7 / 0;
        }
    }

    private static boolean getRevenue(android.content.Context r4) {
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1iSDK.getRevenue(android.content.Context):boolean");
    }

    public final String getCurrencyIso4217Code(AFc1sSDK aFc1sSDK) {
        return (String) AFAdRevenueData(new Object[]{this, aFc1sSDK}, 527487030, -527487030, System.identityHashCode(this));
    }

    public static void getMonetizationNetwork(AFh1tSDK aFh1tSDK) throws Throwable {
        try {
            new AFb1sSDK(aFh1tSDK).afInfoLog();
            int i7 = equals + 99;
            hashCode = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
        } catch (Exception e7) {
            AFLogger.afErrorLogForExcManagerOnly("native: reflection init failed", e7);
        }
    }

    public final boolean getMonetizationNetwork() {
        equals = (hashCode + 45) % 128;
        if (!this.getMonetizationNetwork || component4()) {
            return false;
        }
        int i7 = equals + 21;
        hashCode = i7 % 128;
        if (i7 % 2 == 0) {
            return true;
        }
        throw null;
    }

    public static void getRevenue(java.util.Map<java.lang.String, java.lang.Object> r12, com.appsflyer.internal.AFc1kSDK r13) throws java.lang.NumberFormatException {
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1iSDK.getRevenue(java.util.Map, com.appsflyer.internal.AFc1kSDK):void");
    }
}
