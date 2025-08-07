package com.appsflyer.internal;

import com.appsflyer.R;
import java.util.Map;

public class AFa1gSDK {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int $12 = 0;
    private static int $13 = 1;
    public static final Map AFKeystoreWrapper;
    private static int afDebugLog;
    private static long afErrorLog;
    private static long afInfoLog;
    private static byte afLogForce;

    private static Object f13583d;

    public static final Map f13584e;
    private static int force;

    private static Object f13585i;
    private static byte[] unregisterClient;

    private static long f13586v;

    private static byte[] f13587w;

    private static java.lang.String $$c(short r6, int r7, byte r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1gSDK.$$c(short, int, byte):java.lang.String");
    }

    static {
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1gSDK.<clinit>():void");
    }

    private AFa1gSDK() {
    }

    public static int AFAdRevenueData(Object obj) throws Throwable {
        Object obj2;
        int i7 = $11;
        int i8 = (i7 & 25) + (i7 | 25);
        int i9 = i8 % 128;
        $10 = i9;
        if (i8 % 2 != 0) {
            obj2 = f13585i;
            int i10 = 27 / 0;
        } else {
            obj2 = f13585i;
        }
        $11 = ((i9 ^ 83) + ((i9 & 83) << 1)) % 128;
        try {
            byte b2 = $$a[19];
            int iIntValue = ((Integer) Class.forName($$c(b2, (short) ((b2 ^ 528) | (b2 & 528)), r0[214]), true, (ClassLoader) f13583d).getMethod($$c((byte) 70, (short) 626, r0[417]), Object.class).invoke(obj2, obj)).intValue();
            $10 = ($11 + 19) % 128;
            return iIntValue;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static int getCurrencyIso4217Code(int i7) throws Throwable {
        Object obj;
        int i8 = $10 + 13;
        int i9 = i8 % 128;
        $11 = i9;
        if (i8 % 2 == 0) {
            obj = f13585i;
            int i10 = 44 / 0;
        } else {
            obj = f13585i;
        }
        int i11 = ((i9 & R.styleable.AppCompatTheme_windowActionModeOverlay) + (i9 | R.styleable.AppCompatTheme_windowActionModeOverlay)) % 128;
        $10 = i11;
        $11 = (i11 + 25) % 128;
        try {
            Object[] objArr = {Integer.valueOf(i7)};
            byte b2 = $$a[19];
            return ((Integer) Class.forName($$c(b2, (short) ((b2 ^ 528) | (b2 & 528)), r1[214]), true, (ClassLoader) f13583d).getMethod($$c(r1[915], (short) 1154, r1[113]), Integer.TYPE).invoke(obj, objArr)).intValue();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static void getMediationNetwork(int i7, int i8) {
        int i9 = $11;
        int i10 = (i9 & 77) + (i9 | 77);
        $10 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    public static Object getMonetizationNetwork(int i7, int i8, char c2) throws Throwable {
        int i9 = ($11 + R.styleable.AppCompatTheme_windowFixedWidthMinor) % 128;
        $10 = i9;
        Object obj = f13585i;
        $11 = ((i9 & 35) + (i9 | 35)) % 128;
        try {
            Object[] objArr = {Integer.valueOf(i7), Integer.valueOf(i8), Character.valueOf(c2)};
            byte b2 = $$a[19];
            Class<?> cls = Class.forName($$c(b2, (short) ((b2 ^ 528) | (b2 & 528)), r7[214]), true, (ClassLoader) f13583d);
            String str$$c = $$c((byte) 70, (short) 626, r7[417]);
            Class cls2 = Integer.TYPE;
            Object objInvoke = cls.getMethod(str$$c, cls2, cls2, Character.TYPE).invoke(obj, objArr);
            int i10 = $10;
            int i11 = (i10 ^ 109) + ((i10 & 109) << 1);
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 54 / 0;
            }
            return objInvoke;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    static void init$0() {
        int i7 = $11;
        $10 = (((i7 | 29) << 1) - (i7 ^ 29)) % 128;
        byte[] bArr = new byte[1172];
        System.arraycopy("oØ\u0098\u0013ð\u0007ï\u0000\u0003\u00023Äò\u000eî\u0005ü\u0003íBÇï\u000eç\u0013üó\u00044çÏ\u000eç\u0013üó\u0004\nï\u0001\u0000ó\u000e\u0013Ü\fû÷òøñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:ëøâ-Ì\f\föõýñÿ<Êîýú\n÷ð\u0011ðð\u0007ï\u0000\u0003\u00023Êîý?êÛì\bð\nòø\"éó\n\u0001úë\u0000ý\nô÷0Îý\u0001\u0000\u0003ÿê\b÷þð\u0007ï\u0000\u0003\u00023Êîý?êÎý&Øú\nþòöÿî(Ø\u0002ò\b\u0005ò(Îý\u0001\u0000\u0003ÿê\b÷þÿî+Úú\u0004ï,Øôÿî.Ñ\bü\u001fßûø\u0000\u001eØôÿî.ßûø\u0000\u001eØôÈ\u0000ê\u0010/È\u0000ê\u0010/\u0006è\u00120Â÷>åÚú\u0004\u0006è\u00120Â÷>·\u0004ú\tøô\u0006è\u00120¿\bð\u00046Ø×\u0003ü\fõÿî!Û\u0000ü\bðûøñ\bü\u0003ùÿûø\u0000ð\u0007ï\u0000\u0003\u00023¼ùBéÊ\tú\u0005=Ë\u000eðü\u0007÷þ\föé\u0013ø÷ÿð\u0014â\u0006ò\f\u0012÷\u0013õ\u0006è\u00120Â÷>â÷\u0007Ê\u0012ûòù\b÷þë\u0000ý\nô÷\u001dèù\u0005\u0015áúý\u0000ó\u0006è\u00120Â÷>åÚú\u0004\u0013×þ\u0001øþ\u001eÜÿ\n\u0001ñôúù\u000b\u0012ú\u0010õËëý\u000bîþAÉñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:Ê)Ð'\u0004ýÉ\u0000ýý+\u0000ûýÐ+Ï1ÿî\u001fêï\u0001÷\u0000\fû\u0006è\u00120½\u0006îCÖ\u0000\u0003ÿî!ìê\t\u0006è\u00120Â÷>éÊ\fýþð\nþ\u0018Øûøþ\u001eÜÿ\n\u0001ñ\u0006è\u00120Â÷>âØûøþ\u001eÜÿ\n\u0001ñ\u0006è\u00120Â÷>çàê\u0010\u0015Øûøþ\u001eÜÿ\n\u0001ñ\n\u0001ú\u001bÎ\u0006ýð\u0006è\u00120Â÷>éÆ\u0002\f!Ìý\u000eå-Øûøþ\u001eÜÿ\n\u0001ñìý\u000eå\u0013ñüôñÿ<Êîýú\n÷ð\u0011ðAÂø÷\fð\u0001\nò;êøØ7¹\u001f\föñÿ<Êîýú\n÷ð\u0011ðAÂø÷\fð\u0001\nò;êøâ-Ì\f\föõýÿî\u001fêì\u000eôö\r\u0005ÿö\n\u0001ú\u000bî\u001fê\u0001ú\u0012Þÿð\u0012ù\u0011õ\u0002\u0006ò\fÿî+ÿ\u0006è\u00120Â÷>åÚú\u0004\u001eÜï\rî\u0006öù\u0002ú÷\b\b\u0000òó\nû:¸÷\u0003ü\fõ<çÜê/Úú\u0004ú\u000bú\u001dÜêÿî0Üì\u0001\u0000ôþ\f\u0012ìê\tüö\u0004î\fÿî.Ô\bëý$Ú\u000búüð\u0006è\u00120¶þ\bú;±\u000eö?Ñîö$Øûøþ\u001eÜÿ\n\u0001ñÿî#æê\u0001,Ô÷ÿö\u0006è\u00120¶þ\bú;±\u000eö?Ñîö(Ô÷ÿöÿî\u001eçì\u0012\u0006è\u00120Â÷>éÆ\u0002\f!Ìý\u000eå'×þ\u0001øþ\u001eÜÿ\n\u0001ñ\u0002*Æ\u0002\f!Ìý\u000eå\u0006è\u00120Â÷>èÔúù\u000b\u0001üó\u0004\u0000òó\nû:¸÷\u0003ü\fõ<âØ\u001eåõûúö2Üê2Ô\bëý$Ú\u000búüð\u0006è\u00120½\u0002÷>éÆ\u0002\f Ê\fýþð\u0006è\u00120¿\bð\u00046èÔ\bëý$Ú\u000búüð\u0002\u000eî\u0000òó\nû:¸÷\u0003ü\fõ<éÞë\u000b\u001eÜê2Ô\bëý$Ú\u000búüð\fê\t\u0019àóü\nê\bð\u000e\u0016à\u0004í\u000eìö2Øô\nÿì\u0002ú\u0006\u0001ï\nê\bð\u000e\u0016à\u0004í\u000eìö&ìê\t Ö\u0004õ\u0005ô÷þÿî.Ñÿúþþ\u0006ô÷\u001dØ\u0006\b\u0012õ\u0015õú\u000bú\u001eÔ\bëýñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:ëøâ-Ç\u0011\fö$¸Ëëý\u000bîþAÉñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:öúÕû(\u0001ý\u0000Ë,üýþ\u0001úË\u00002\u0012ö\u0014õ·üL·\u0002òý\u0007þûõõP±\u0004üïHø\u0002Ú\u000fêì\u000eôö\r\u001eàê\u0010".getBytes("ISO-8859-1"), 0, bArr, 0, 1172);
        $$a = bArr;
        $$b = 232;
        int i8 = $11;
        int i9 = ((i8 | 81) << 1) - (i8 ^ 81);
        $10 = i9 % 128;
        if (i9 % 2 != 0) {
            throw null;
        }
    }
}
