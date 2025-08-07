package E;

import C.EnumC0362y;
import Q6.QtA.QXojhh;
import android.os.Build;
import android.util.Pair;
import com.github.luben.zstd.BuildConfig;
import e2.vb.oyfFwvPUKctyaG;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import w7.Jld.EZYiRMRTxKdo;
import y0.xyyu.hkVlaTTCDY;
import z.C3043d0;

public class h {

    static final String[] f1026c = {BuildConfig.FLAVOR, "BYTE", "STRING", "USHORT", QXojhh.kgrCMMnYNZcKgN, "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    private static final j[] f1027d;

    private static final j[] f1028e;

    private static final j[] f1029f;

    static final j[] f1030g;

    private static final j[] f1031h;

    static final j[][] f1032i;

    static final HashSet<String> f1033j;

    private final List<Map<String, g>> f1034a;

    private final ByteOrder f1035b;

    static class a {

        static final int[] f1036a;

        static {
            int[] iArr = new int[EnumC0362y.values().length];
            f1036a = iArr;
            try {
                iArr[EnumC0362y.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1036a[EnumC0362y.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1036a[EnumC0362y.FIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class b {

        private static final Pattern f1037c = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");

        private static final Pattern f1038d = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

        private static final Pattern f1039e = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

        static final List<HashMap<String, j>> f1040f = Collections.list(new a());

        final List<Map<String, g>> f1041a = Collections.list(new C0010b());

        private final ByteOrder f1042b;

        class a implements Enumeration<HashMap<String, j>> {

            int f1043a = 0;

            a() {
            }

            @Override
            public HashMap<String, j> nextElement() {
                HashMap<String, j> map = new HashMap<>();
                for (j jVar : h.f1032i[this.f1043a]) {
                    map.put(jVar.f1059b, jVar);
                }
                this.f1043a++;
                return map;
            }

            @Override
            public boolean hasMoreElements() {
                return this.f1043a < h.f1032i.length;
            }
        }

        class C0010b implements Enumeration<Map<String, g>> {

            int f1044a = 0;

            C0010b() {
            }

            @Override
            public Map<String, g> nextElement() {
                this.f1044a++;
                return new HashMap();
            }

            @Override
            public boolean hasMoreElements() {
                return this.f1044a < h.f1032i.length;
            }
        }

        class c implements Enumeration<Map<String, g>> {

            final Enumeration<Map<String, g>> f1046a;

            c() {
                this.f1046a = Collections.enumeration(b.this.f1041a);
            }

            @Override
            public Map<String, g> nextElement() {
                return new HashMap(this.f1046a.nextElement());
            }

            @Override
            public boolean hasMoreElements() {
                return this.f1046a.hasMoreElements();
            }
        }

        b(ByteOrder byteOrder) {
            this.f1042b = byteOrder;
        }

        private static Pair<Integer, Integer> b(String str) throws NumberFormatException {
            if (str.contains(",")) {
                String[] strArrSplit = str.split(",", -1);
                Pair<Integer, Integer> pairB = b(strArrSplit[0]);
                if (((Integer) pairB.first).intValue() == 2) {
                    return pairB;
                }
                for (int i7 = 1; i7 < strArrSplit.length; i7++) {
                    Pair<Integer, Integer> pairB2 = b(strArrSplit[i7]);
                    int iIntValue = (((Integer) pairB2.first).equals(pairB.first) || ((Integer) pairB2.second).equals(pairB.first)) ? ((Integer) pairB.first).intValue() : -1;
                    int iIntValue2 = (((Integer) pairB.second).intValue() == -1 || !(((Integer) pairB2.first).equals(pairB.second) || ((Integer) pairB2.second).equals(pairB.second))) ? -1 : ((Integer) pairB.second).intValue();
                    if (iIntValue == -1 && iIntValue2 == -1) {
                        return new Pair<>(2, -1);
                    }
                    if (iIntValue == -1) {
                        pairB = new Pair<>(Integer.valueOf(iIntValue2), -1);
                    } else if (iIntValue2 == -1) {
                        pairB = new Pair<>(Integer.valueOf(iIntValue), -1);
                    }
                }
                return pairB;
            }
            if (!str.contains("/")) {
                try {
                    try {
                        long j7 = Long.parseLong(str);
                        return (j7 < 0 || j7 > 65535) ? j7 < 0 ? new Pair<>(9, -1) : new Pair<>(4, -1) : new Pair<>(3, 4);
                    } catch (NumberFormatException unused) {
                        return new Pair<>(2, -1);
                    }
                } catch (NumberFormatException unused2) {
                    Double.parseDouble(str);
                    return new Pair<>(12, -1);
                }
            }
            String[] strArrSplit2 = str.split("/", -1);
            if (strArrSplit2.length == 2) {
                try {
                    long j8 = (long) Double.parseDouble(strArrSplit2[0]);
                    long j9 = (long) Double.parseDouble(strArrSplit2[1]);
                    if (j8 >= 0 && j9 >= 0) {
                        if (j8 <= 2147483647L && j9 <= 2147483647L) {
                            return new Pair<>(10, 5);
                        }
                        return new Pair<>(5, -1);
                    }
                    return new Pair<>(10, -1);
                } catch (NumberFormatException unused3) {
                }
            }
            return new Pair<>(2, -1);
        }

        private void d(String str, String str2, List<Map<String, g>> list) throws NumberFormatException {
            Iterator<Map<String, g>> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().containsKey(str)) {
                    return;
                }
            }
            e(str, str2, list);
        }

        private void e(String str, String str2, List<Map<String, g>> list) throws NumberFormatException {
            int i7;
            int i8;
            int i9;
            b bVar = this;
            String str3 = str;
            String strReplaceAll = str2;
            if (("DateTime".equals(str3) || "DateTimeOriginal".equals(str3) || "DateTimeDigitized".equals(str3)) && strReplaceAll != null) {
                boolean zFind = f1038d.matcher(strReplaceAll).find();
                boolean zFind2 = f1039e.matcher(strReplaceAll).find();
                if (str2.length() != 19 || (!zFind && !zFind2)) {
                    C3043d0.l("ExifData", "Invalid value for " + str3 + " : " + strReplaceAll);
                    return;
                }
                if (zFind2) {
                    strReplaceAll = strReplaceAll.replaceAll("-", ":");
                }
            }
            if ("ISOSpeedRatings".equals(str3)) {
                str3 = "PhotographicSensitivity";
            }
            String str4 = str3;
            int i10 = 2;
            int i11 = 1;
            if (strReplaceAll != null && h.f1033j.contains(str4)) {
                if (str4.equals("GPSTimeStamp")) {
                    Matcher matcher = f1037c.matcher(strReplaceAll);
                    if (!matcher.find()) {
                        C3043d0.l("ExifData", "Invalid value for " + str4 + " : " + strReplaceAll);
                        return;
                    }
                    strReplaceAll = Integer.parseInt((String) x0.g.g(matcher.group(1))) + "/1," + Integer.parseInt((String) x0.g.g(matcher.group(2))) + "/1," + Integer.parseInt((String) x0.g.g(matcher.group(3))) + "/1";
                } else {
                    try {
                        strReplaceAll = new k(Double.parseDouble(strReplaceAll)).toString();
                    } catch (NumberFormatException e7) {
                        C3043d0.m("ExifData", "Invalid value for " + str4 + " : " + strReplaceAll, e7);
                        return;
                    }
                }
            }
            int i12 = 0;
            int i13 = 0;
            while (i13 < h.f1032i.length) {
                j jVar = f1040f.get(i13).get(str4);
                if (jVar == null) {
                    i7 = i13;
                    i8 = i11;
                } else {
                    if (strReplaceAll != null) {
                        Pair<Integer, Integer> pairB = b(strReplaceAll);
                        if (jVar.f1060c == ((Integer) pairB.first).intValue() || jVar.f1060c == ((Integer) pairB.second).intValue()) {
                            i9 = jVar.f1060c;
                        } else {
                            int i14 = jVar.f1061d;
                            if (i14 == -1 || !(i14 == ((Integer) pairB.first).intValue() || jVar.f1061d == ((Integer) pairB.second).intValue())) {
                                i9 = jVar.f1060c;
                                if (i9 == i11 || i9 == 7 || i9 == i10) {
                                }
                            } else {
                                i9 = jVar.f1061d;
                            }
                        }
                        String str5 = "/";
                        switch (i9) {
                            case 1:
                                i7 = i13;
                                i8 = i11;
                                list.get(i7).put(str4, g.a(strReplaceAll));
                                break;
                            case 2:
                            case 7:
                                i7 = i13;
                                i8 = i11;
                                list.get(i7).put(str4, g.e(strReplaceAll));
                                break;
                            case 3:
                                i7 = i13;
                                i8 = i11;
                                String[] strArrSplit = strReplaceAll.split(",", -1);
                                int[] iArr = new int[strArrSplit.length];
                                for (int i15 = 0; i15 < strArrSplit.length; i15++) {
                                    iArr[i15] = Integer.parseInt(strArrSplit[i15]);
                                }
                                list.get(i7).put(str4, g.i(iArr, bVar.f1042b));
                                break;
                            case 4:
                                i7 = i13;
                                i8 = i11;
                                String[] strArrSplit2 = strReplaceAll.split(",", -1);
                                long[] jArr = new long[strArrSplit2.length];
                                for (int i16 = 0; i16 < strArrSplit2.length; i16++) {
                                    jArr[i16] = Long.parseLong(strArrSplit2[i16]);
                                }
                                list.get(i7).put(str4, g.g(jArr, bVar.f1042b));
                                break;
                            case 5:
                                String str6 = "/";
                                String[] strArrSplit3 = strReplaceAll.split(",", -1);
                                k[] kVarArr = new k[strArrSplit3.length];
                                int i17 = i12;
                                while (i17 < strArrSplit3.length) {
                                    String str7 = str6;
                                    String[] strArrSplit4 = strArrSplit3[i17].split(str7, -1);
                                    kVarArr[i17] = new k((long) Double.parseDouble(strArrSplit4[i12]), (long) Double.parseDouble(strArrSplit4[1]));
                                    i17++;
                                    str6 = str7;
                                    i13 = i13;
                                    i12 = 0;
                                }
                                i7 = i13;
                                i8 = 1;
                                list.get(i7).put(str4, g.h(kVarArr, bVar.f1042b));
                                break;
                            case 9:
                                String[] strArrSplit5 = strReplaceAll.split(",", -1);
                                int[] iArr2 = new int[strArrSplit5.length];
                                for (int i18 = i12; i18 < strArrSplit5.length; i18++) {
                                    iArr2[i18] = Integer.parseInt(strArrSplit5[i18]);
                                }
                                list.get(i13).put(str4, g.c(iArr2, bVar.f1042b));
                                i7 = i13;
                                i8 = 1;
                                break;
                            case 10:
                                String[] strArrSplit6 = strReplaceAll.split(",", -1);
                                k[] kVarArr2 = new k[strArrSplit6.length];
                                int i19 = i12;
                                while (i19 < strArrSplit6.length) {
                                    String[] strArrSplit7 = strArrSplit6[i19].split(str5, -1);
                                    kVarArr2[i19] = new k((long) Double.parseDouble(strArrSplit7[i12]), (long) Double.parseDouble(strArrSplit7[i11]));
                                    i19++;
                                    str5 = str5;
                                    i11 = 1;
                                }
                                bVar = this;
                                list.get(i13).put(str4, g.d(kVarArr2, bVar.f1042b));
                                i7 = i13;
                                i8 = 1;
                                break;
                            case 12:
                                String[] strArrSplit8 = strReplaceAll.split(",", -1);
                                double[] dArr = new double[strArrSplit8.length];
                                for (int i20 = i12; i20 < strArrSplit8.length; i20++) {
                                    dArr[i20] = Double.parseDouble(strArrSplit8[i20]);
                                }
                                list.get(i13).put(str4, g.b(dArr, bVar.f1042b));
                                break;
                        }
                    } else {
                        list.get(i13).remove(str4);
                    }
                    i7 = i13;
                    i8 = i11;
                }
                i13 = i7 + 1;
                i11 = i8;
                i10 = 2;
                i12 = 0;
            }
        }

        public h a() throws NumberFormatException {
            ArrayList list = Collections.list(new c());
            if (!list.get(1).isEmpty()) {
                d("ExposureProgram", String.valueOf(0), list);
                d("ExifVersion", "0230", list);
                d("ComponentsConfiguration", "1,2,3,0", list);
                d("MeteringMode", String.valueOf(0), list);
                d("LightSource", String.valueOf(0), list);
                d("FlashpixVersion", "0100", list);
                d("FocalPlaneResolutionUnit", String.valueOf(2), list);
                d("FileSource", String.valueOf(3), list);
                d("SceneType", String.valueOf(1), list);
                d("CustomRendered", String.valueOf(0), list);
                d("SceneCaptureType", String.valueOf(0), list);
                d("Contrast", String.valueOf(0), list);
                d("Saturation", String.valueOf(0), list);
                d("Sharpness", String.valueOf(0), list);
            }
            if (!list.get(2).isEmpty()) {
                d("GPSVersionID", "2300", list);
                d("GPSSpeedRef", "K", list);
                d("GPSTrackRef", "T", list);
                d("GPSImgDirectionRef", "T", list);
                d("GPSDestBearingRef", "T", list);
                d("GPSDestDistanceRef", "K", list);
            }
            return new h(this.f1042b, list);
        }

        public b c(String str, String str2) throws NumberFormatException {
            e(str, str2, this.f1041a);
            return this;
        }

        public b f(long j7) {
            return c("ExposureTime", String.valueOf(j7 / TimeUnit.SECONDS.toNanos(1L)));
        }

        public b g(EnumC0362y enumC0362y) {
            int i7;
            if (enumC0362y == EnumC0362y.UNKNOWN) {
                return this;
            }
            int i8 = a.f1036a[enumC0362y.ordinal()];
            if (i8 == 1) {
                i7 = 0;
            } else if (i8 == 2) {
                i7 = 32;
            } else {
                if (i8 != 3) {
                    C3043d0.l("ExifData", "Unknown flash state: " + enumC0362y);
                    return this;
                }
                i7 = 1;
            }
            if ((i7 & 1) == 1) {
                c("LightSource", String.valueOf(4));
            }
            return c("Flash", String.valueOf(i7));
        }

        public b h(float f7) {
            return c(oyfFwvPUKctyaG.fdEfUt, new k((long) (f7 * 1000.0f), 1000L).toString());
        }

        public b i(int i7) {
            return c("ImageLength", String.valueOf(i7));
        }

        public b j(int i7) {
            return c("ImageWidth", String.valueOf(i7));
        }

        public b k(int i7) {
            return c("SensitivityType", String.valueOf(3)).c("PhotographicSensitivity", String.valueOf(Math.min(65535, i7)));
        }

        public b l(float f7) {
            return c("FNumber", String.valueOf(f7));
        }

        public b m(int i7) {
            int i8;
            if (i7 == 0) {
                i8 = 1;
            } else if (i7 == 90) {
                i8 = 6;
            } else if (i7 == 180) {
                i8 = 3;
            } else if (i7 != 270) {
                C3043d0.l("ExifData", "Unexpected orientation value: " + i7 + ". Must be one of 0, 90, 180, 270.");
                i8 = 0;
            } else {
                i8 = 8;
            }
            return c("Orientation", String.valueOf(i8));
        }

        public b n(c cVar) {
            int iOrdinal = cVar.ordinal();
            return c("WhiteBalance", iOrdinal != 0 ? iOrdinal != 1 ? null : String.valueOf(1) : String.valueOf(0));
        }
    }

    public enum c {
        AUTO,
        MANUAL
    }

    static {
        j[] jVarArr = {new j("ImageWidth", 256, 3, 4), new j("ImageLength", 257, 3, 4), new j("Make", 271, 2), new j("Model", 272, 2), new j("Orientation", 274, 3), new j("XResolution", 282, 5), new j("YResolution", 283, 5), new j("ResolutionUnit", 296, 3), new j("Software", 305, 2), new j("DateTime", 306, 2), new j("YCbCrPositioning", 531, 3), new j("SubIFDPointer", 330, 4), new j("ExifIFDPointer", 34665, 4), new j("GPSInfoIFDPointer", 34853, 4)};
        f1027d = jVarArr;
        j[] jVarArr2 = {new j("ExposureTime", 33434, 5), new j("FNumber", 33437, 5), new j("ExposureProgram", 34850, 3), new j("PhotographicSensitivity", 34855, 3), new j("SensitivityType", 34864, 3), new j("ExifVersion", 36864, 2), new j("DateTimeOriginal", 36867, 2), new j("DateTimeDigitized", 36868, 2), new j("ComponentsConfiguration", 37121, 7), new j("ShutterSpeedValue", 37377, 10), new j("ApertureValue", 37378, 5), new j("BrightnessValue", 37379, 10), new j("ExposureBiasValue", 37380, 10), new j("MaxApertureValue", 37381, 5), new j("MeteringMode", 37383, 3), new j("LightSource", 37384, 3), new j("Flash", 37385, 3), new j("FocalLength", 37386, 5), new j("SubSecTime", 37520, 2), new j("SubSecTimeOriginal", 37521, 2), new j("SubSecTimeDigitized", 37522, 2), new j(hkVlaTTCDY.ObvBEHmUiuLUGfF, 40960, 7), new j("ColorSpace", 40961, 3), new j("PixelXDimension", 40962, 3, 4), new j("PixelYDimension", 40963, 3, 4), new j("InteroperabilityIFDPointer", 40965, 4), new j("FocalPlaneResolutionUnit", 41488, 3), new j("SensingMethod", 41495, 3), new j("FileSource", 41728, 7), new j("SceneType", 41729, 7), new j("CustomRendered", 41985, 3), new j(EZYiRMRTxKdo.uYjPa, 41986, 3), new j("WhiteBalance", 41987, 3), new j("SceneCaptureType", 41990, 3), new j("Contrast", 41992, 3), new j("Saturation", 41993, 3), new j("Sharpness", 41994, 3)};
        f1028e = jVarArr2;
        j[] jVarArr3 = {new j("GPSVersionID", 0, 1), new j("GPSLatitudeRef", 1, 2), new j("GPSLatitude", 2, 5, 10), new j("GPSLongitudeRef", 3, 2), new j("GPSLongitude", 4, 5, 10), new j("GPSAltitudeRef", 5, 1), new j("GPSAltitude", 6, 5), new j("GPSTimeStamp", 7, 5), new j("GPSSpeedRef", 12, 2), new j("GPSTrackRef", 14, 2), new j("GPSImgDirectionRef", 16, 2), new j("GPSDestBearingRef", 23, 2), new j("GPSDestDistanceRef", 25, 2)};
        f1029f = jVarArr3;
        f1030g = new j[]{new j("SubIFDPointer", 330, 4), new j("ExifIFDPointer", 34665, 4), new j("GPSInfoIFDPointer", 34853, 4), new j("InteroperabilityIFDPointer", 40965, 4)};
        j[] jVarArr4 = {new j("InteroperabilityIndex", 1, 2)};
        f1031h = jVarArr4;
        f1032i = new j[][]{jVarArr, jVarArr2, jVarArr3, jVarArr4};
        f1033j = new HashSet<>(Arrays.asList("FNumber", "ExposureTime", "GPSTimeStamp"));
    }

    h(ByteOrder byteOrder, List<Map<String, g>> list) {
        x0.g.j(list.size() == f1032i.length, "Malformed attributes list. Number of IFDs mismatch.");
        this.f1035b = byteOrder;
        this.f1034a = list;
    }

    public static b a() {
        return new b(ByteOrder.BIG_ENDIAN).c("Orientation", String.valueOf(1)).c("XResolution", "72/1").c("YResolution", "72/1").c("ResolutionUnit", String.valueOf(2)).c("YCbCrPositioning", String.valueOf(1)).c(QXojhh.fwbXSksseOglnZ, Build.MANUFACTURER).c("Model", Build.MODEL);
    }

    public static h b(androidx.camera.core.n nVar, int i7) {
        b bVarA = a();
        if (nVar.D0() != null) {
            nVar.D0().a(bVarA);
        }
        bVarA.m(i7);
        return bVarA.j(nVar.getWidth()).i(nVar.getHeight()).a();
    }

    Map<String, g> c(int i7) {
        x0.g.c(i7, 0, f1032i.length, "Invalid IFD index: " + i7 + ". Index should be between [0, EXIF_TAGS.length] ");
        return this.f1034a.get(i7);
    }

    public ByteOrder d() {
        return this.f1035b;
    }
}
