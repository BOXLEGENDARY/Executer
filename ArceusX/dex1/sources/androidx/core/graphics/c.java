package androidx.core.graphics;

import android.graphics.Path;
import android.util.Log;
import com.appsflyer.R;
import java.util.ArrayList;

public final class c {

    private static class a {

        int f10564a;

        boolean f10565b;

        a() {
        }
    }

    private static void a(ArrayList<b> arrayList, char c2, float[] fArr) {
        arrayList.add(new b(c2, fArr));
    }

    public static boolean b(b[] bVarArr, b[] bVarArr2) {
        if (bVarArr == null || bVarArr2 == null || bVarArr.length != bVarArr2.length) {
            return false;
        }
        for (int i7 = 0; i7 < bVarArr.length; i7++) {
            if (bVarArr[i7].f10566a != bVarArr2[i7].f10566a || bVarArr[i7].f10567b.length != bVarArr2[i7].f10567b.length) {
                return false;
            }
        }
        return true;
    }

    static float[] c(float[] fArr, int i7, int i8) {
        if (i7 > i8) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (i7 < 0 || i7 > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i9 = i8 - i7;
        int iMin = Math.min(i9, length - i7);
        float[] fArr2 = new float[i9];
        System.arraycopy(fArr, i7, fArr2, 0, iMin);
        return fArr2;
    }

    public static b[] d(String str) {
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        int i8 = 1;
        while (i8 < str.length()) {
            int i9 = i(str, i8);
            String strTrim = str.substring(i7, i9).trim();
            if (!strTrim.isEmpty()) {
                a(arrayList, strTrim.charAt(0), h(strTrim));
            }
            i7 = i9;
            i8 = i9 + 1;
        }
        if (i8 - i7 == 1 && i7 < str.length()) {
            a(arrayList, str.charAt(i7), new float[0]);
        }
        return (b[]) arrayList.toArray(new b[0]);
    }

    public static Path e(String str) {
        Path path = new Path();
        try {
            b.h(d(str), path);
            return path;
        } catch (RuntimeException e7) {
            throw new RuntimeException("Error in parsing " + str, e7);
        }
    }

    public static b[] f(b[] bVarArr) {
        b[] bVarArr2 = new b[bVarArr.length];
        for (int i7 = 0; i7 < bVarArr.length; i7++) {
            bVarArr2[i7] = new b(bVarArr[i7]);
        }
        return bVarArr2;
    }

    private static void g(java.lang.String r8, int r9, androidx.core.graphics.c.a r10) {
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.c.g(java.lang.String, int, androidx.core.graphics.c$a):void");
    }

    private static float[] h(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            a aVar = new a();
            int length = str.length();
            int i7 = 1;
            int i8 = 0;
            while (i7 < length) {
                g(str, i7, aVar);
                int i9 = aVar.f10564a;
                if (i7 < i9) {
                    fArr[i8] = Float.parseFloat(str.substring(i7, i9));
                    i8++;
                }
                i7 = aVar.f10565b ? i9 : i9 + 1;
            }
            return c(fArr, 0, i8);
        } catch (NumberFormatException e7) {
            throw new RuntimeException("error in parsing \"" + str + "\"", e7);
        }
    }

    private static int i(String str, int i7) {
        while (i7 < str.length()) {
            char cCharAt = str.charAt(i7);
            if (((cCharAt - 'A') * (cCharAt - 'Z') <= 0 || (cCharAt - 'a') * (cCharAt - 'z') <= 0) && cCharAt != 'e' && cCharAt != 'E') {
                return i7;
            }
            i7++;
        }
        return i7;
    }

    public static void j(b[] bVarArr, Path path) {
        float[] fArr = new float[6];
        char c2 = 'm';
        for (b bVar : bVarArr) {
            b.e(path, fArr, c2, bVar.f10566a, bVar.f10567b);
            c2 = bVar.f10566a;
        }
    }

    public static void k(b[] bVarArr, b[] bVarArr2) {
        for (int i7 = 0; i7 < bVarArr2.length; i7++) {
            bVarArr[i7].f10566a = bVarArr2[i7].f10566a;
            for (int i8 = 0; i8 < bVarArr2[i7].f10567b.length; i8++) {
                bVarArr[i7].f10567b[i8] = bVarArr2[i7].f10567b[i8];
            }
        }
    }

    public static class b {

        private char f10566a;

        private final float[] f10567b;

        b(char c2, float[] fArr) {
            this.f10566a = c2;
            this.f10567b = fArr;
        }

        public static void e(Path path, float[] fArr, char c2, char c3, float[] fArr2) {
            int i7;
            int i8;
            int i9;
            float f7;
            float f8;
            float f9;
            float f10;
            float f11;
            float f12;
            float f13;
            float f14;
            char c7 = c3;
            boolean z7 = false;
            float f15 = fArr[0];
            float f16 = fArr[1];
            float f17 = fArr[2];
            float f18 = fArr[3];
            float f19 = fArr[4];
            float f20 = fArr[5];
            switch (c7) {
                case 'A':
                case 'a':
                    i7 = 7;
                    i8 = i7;
                    break;
                case 'C':
                case 'c':
                    i7 = 6;
                    i8 = i7;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case R.styleable.AppCompatTheme_windowActionBarOverlay:
                    i8 = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case 'l':
                case 'm':
                case R.styleable.AppCompatTheme_viewInflaterClass:
                default:
                    i8 = 2;
                    break;
                case 'Q':
                case 'S':
                case R.styleable.AppCompatTheme_toolbarStyle:
                case R.styleable.AppCompatTheme_tooltipFrameBackground:
                    i8 = 4;
                    break;
                case 'Z':
                case R.styleable.AppCompatTheme_windowFixedWidthMajor:
                    path.close();
                    path.moveTo(f19, f20);
                    f15 = f19;
                    f17 = f15;
                    f16 = f20;
                    f18 = f16;
                    i8 = 2;
                    break;
            }
            float f21 = f15;
            float f22 = f16;
            float f23 = f19;
            float f24 = f20;
            int i10 = 0;
            char c8 = c2;
            while (i10 < fArr2.length) {
                if (c7 != 'A') {
                    if (c7 == 'C') {
                        i9 = i10;
                        int i11 = i9 + 2;
                        int i12 = i9 + 3;
                        int i13 = i9 + 4;
                        int i14 = i9 + 5;
                        path.cubicTo(fArr2[i9], fArr2[i9 + 1], fArr2[i11], fArr2[i12], fArr2[i13], fArr2[i14]);
                        f21 = fArr2[i13];
                        float f25 = fArr2[i14];
                        float f26 = fArr2[i11];
                        float f27 = fArr2[i12];
                        f22 = f25;
                        f18 = f27;
                        f17 = f26;
                    } else if (c7 == 'H') {
                        i9 = i10;
                        path.lineTo(fArr2[i9], f22);
                        f21 = fArr2[i9];
                    } else if (c7 == 'Q') {
                        i9 = i10;
                        int i15 = i9 + 1;
                        int i16 = i9 + 2;
                        int i17 = i9 + 3;
                        path.quadTo(fArr2[i9], fArr2[i15], fArr2[i16], fArr2[i17]);
                        float f28 = fArr2[i9];
                        float f29 = fArr2[i15];
                        f21 = fArr2[i16];
                        f22 = fArr2[i17];
                        f17 = f28;
                        f18 = f29;
                    } else if (c7 == 'V') {
                        i9 = i10;
                        path.lineTo(f21, fArr2[i9]);
                        f22 = fArr2[i9];
                    } else if (c7 != 'a') {
                        if (c7 != 'c') {
                            if (c7 == 'h') {
                                path.rLineTo(fArr2[i10], 0.0f);
                                f21 += fArr2[i10];
                            } else if (c7 != 'q') {
                                if (c7 == 'v') {
                                    path.rLineTo(0.0f, fArr2[i10]);
                                    f10 = fArr2[i10];
                                } else if (c7 == 'L') {
                                    int i18 = i10 + 1;
                                    path.lineTo(fArr2[i10], fArr2[i18]);
                                    f21 = fArr2[i10];
                                    f22 = fArr2[i18];
                                } else if (c7 == 'M') {
                                    f21 = fArr2[i10];
                                    f22 = fArr2[i10 + 1];
                                    if (i10 > 0) {
                                        path.lineTo(f21, f22);
                                    } else {
                                        path.moveTo(f21, f22);
                                        i9 = i10;
                                        f24 = f22;
                                        f23 = f21;
                                    }
                                } else if (c7 == 'S') {
                                    if (c8 == 'c' || c8 == 's' || c8 == 'C' || c8 == 'S') {
                                        f21 = (f21 * 2.0f) - f17;
                                        f22 = (f22 * 2.0f) - f18;
                                    }
                                    float f30 = f22;
                                    float f31 = f21;
                                    int i19 = i10 + 1;
                                    int i20 = i10 + 2;
                                    int i21 = i10 + 3;
                                    path.cubicTo(f31, f30, fArr2[i10], fArr2[i19], fArr2[i20], fArr2[i21]);
                                    f7 = fArr2[i10];
                                    f8 = fArr2[i19];
                                    f21 = fArr2[i20];
                                    f22 = fArr2[i21];
                                    f17 = f7;
                                    f18 = f8;
                                } else if (c7 == 'T') {
                                    if (c8 == 'q' || c8 == 't' || c8 == 'Q' || c8 == 'T') {
                                        f21 = (f21 * 2.0f) - f17;
                                        f22 = (f22 * 2.0f) - f18;
                                    }
                                    int i22 = i10 + 1;
                                    path.quadTo(f21, f22, fArr2[i10], fArr2[i22]);
                                    i9 = i10;
                                    f18 = f22;
                                    f17 = f21;
                                    f21 = fArr2[i10];
                                    f22 = fArr2[i22];
                                } else if (c7 == 'l') {
                                    int i23 = i10 + 1;
                                    path.rLineTo(fArr2[i10], fArr2[i23]);
                                    f21 += fArr2[i10];
                                    f10 = fArr2[i23];
                                } else if (c7 == 'm') {
                                    float f32 = fArr2[i10];
                                    f21 += f32;
                                    float f33 = fArr2[i10 + 1];
                                    f22 += f33;
                                    if (i10 > 0) {
                                        path.rLineTo(f32, f33);
                                    } else {
                                        path.rMoveTo(f32, f33);
                                        i9 = i10;
                                        f24 = f22;
                                        f23 = f21;
                                    }
                                } else if (c7 == 's') {
                                    if (c8 == 'c' || c8 == 's' || c8 == 'C' || c8 == 'S') {
                                        float f34 = f21 - f17;
                                        f11 = f22 - f18;
                                        f12 = f34;
                                    } else {
                                        f12 = 0.0f;
                                        f11 = 0.0f;
                                    }
                                    int i24 = i10 + 1;
                                    int i25 = i10 + 2;
                                    int i26 = i10 + 3;
                                    path.rCubicTo(f12, f11, fArr2[i10], fArr2[i24], fArr2[i25], fArr2[i26]);
                                    f7 = fArr2[i10] + f21;
                                    f8 = fArr2[i24] + f22;
                                    f21 += fArr2[i25];
                                    f9 = fArr2[i26];
                                } else if (c7 == 't') {
                                    if (c8 == 'q' || c8 == 't' || c8 == 'Q' || c8 == 'T') {
                                        f13 = f21 - f17;
                                        f14 = f22 - f18;
                                    } else {
                                        f14 = 0.0f;
                                        f13 = 0.0f;
                                    }
                                    int i27 = i10 + 1;
                                    path.rQuadTo(f13, f14, fArr2[i10], fArr2[i27]);
                                    float f35 = f13 + f21;
                                    float f36 = f14 + f22;
                                    f21 += fArr2[i10];
                                    f22 += fArr2[i27];
                                    f18 = f36;
                                    f17 = f35;
                                }
                                f22 += f10;
                            } else {
                                int i28 = i10 + 1;
                                int i29 = i10 + 2;
                                int i30 = i10 + 3;
                                path.rQuadTo(fArr2[i10], fArr2[i28], fArr2[i29], fArr2[i30]);
                                f7 = fArr2[i10] + f21;
                                f8 = fArr2[i28] + f22;
                                f21 += fArr2[i29];
                                f9 = fArr2[i30];
                            }
                            i9 = i10;
                        } else {
                            int i31 = i10 + 2;
                            int i32 = i10 + 3;
                            int i33 = i10 + 4;
                            int i34 = i10 + 5;
                            path.rCubicTo(fArr2[i10], fArr2[i10 + 1], fArr2[i31], fArr2[i32], fArr2[i33], fArr2[i34]);
                            f7 = fArr2[i31] + f21;
                            f8 = fArr2[i32] + f22;
                            f21 += fArr2[i33];
                            f9 = fArr2[i34];
                        }
                        f22 += f9;
                        f17 = f7;
                        f18 = f8;
                        i9 = i10;
                    } else {
                        int i35 = i10 + 5;
                        int i36 = i10 + 6;
                        i9 = i10;
                        g(path, f21, f22, fArr2[i35] + f21, fArr2[i36] + f22, fArr2[i10], fArr2[i10 + 1], fArr2[i10 + 2], fArr2[i10 + 3] != 0.0f, fArr2[i10 + 4] != 0.0f);
                        f21 += fArr2[i35];
                        f22 += fArr2[i36];
                    }
                    i10 = i9 + i8;
                    c8 = c3;
                    c7 = c8;
                    z7 = false;
                } else {
                    i9 = i10;
                    int i37 = i9 + 5;
                    int i38 = i9 + 6;
                    g(path, f21, f22, fArr2[i37], fArr2[i38], fArr2[i9], fArr2[i9 + 1], fArr2[i9 + 2], fArr2[i9 + 3] != 0.0f, fArr2[i9 + 4] != 0.0f);
                    f21 = fArr2[i37];
                    f22 = fArr2[i38];
                }
                f18 = f22;
                f17 = f21;
                i10 = i9 + i8;
                c8 = c3;
                c7 = c8;
                z7 = false;
            }
            fArr[z7 ? 1 : 0] = f21;
            fArr[1] = f22;
            fArr[2] = f17;
            fArr[3] = f18;
            fArr[4] = f23;
            fArr[5] = f24;
        }

        private static void f(Path path, double d7, double d8, double d9, double d10, double d11, double d12, double d13, double d14, double d15) {
            double d16 = d9;
            int iCeil = (int) Math.ceil(Math.abs((d15 * 4.0d) / 3.141592653589793d));
            double dCos = Math.cos(d13);
            double dSin = Math.sin(d13);
            double dCos2 = Math.cos(d14);
            double dSin2 = Math.sin(d14);
            double d17 = -d16;
            double d18 = d17 * dCos;
            double d19 = d10 * dSin;
            double d20 = (d18 * dSin2) - (d19 * dCos2);
            double d21 = d17 * dSin;
            double d22 = d10 * dCos;
            double d23 = (dSin2 * d21) + (dCos2 * d22);
            double d24 = d15 / iCeil;
            double d25 = d23;
            double d26 = d20;
            int i7 = 0;
            double d27 = d11;
            double d28 = d12;
            double d29 = d14;
            while (i7 < iCeil) {
                double d30 = d29 + d24;
                double dSin3 = Math.sin(d30);
                double dCos3 = Math.cos(d30);
                double d31 = (d7 + ((d16 * dCos) * dCos3)) - (d19 * dSin3);
                double d32 = d8 + (d16 * dSin * dCos3) + (d22 * dSin3);
                double d33 = (d18 * dSin3) - (d19 * dCos3);
                double d34 = (dSin3 * d21) + (dCos3 * d22);
                double d35 = d30 - d29;
                double dTan = Math.tan(d35 / 2.0d);
                double dSin4 = (Math.sin(d35) * (Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d)) / 3.0d;
                double d36 = d27 + (d26 * dSin4);
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) d36, (float) (d28 + (d25 * dSin4)), (float) (d31 - (dSin4 * d33)), (float) (d32 - (dSin4 * d34)), (float) d31, (float) d32);
                i7++;
                d24 = d24;
                dSin = dSin;
                d27 = d31;
                d21 = d21;
                dCos = dCos;
                d29 = d30;
                d25 = d34;
                d26 = d33;
                iCeil = iCeil;
                d28 = d32;
                d16 = d9;
            }
        }

        private static void g(Path path, float f7, float f8, float f9, float f10, float f11, float f12, float f13, boolean z7, boolean z8) {
            double d7;
            double d8;
            double radians = Math.toRadians(f13);
            double dCos = Math.cos(radians);
            double dSin = Math.sin(radians);
            double d9 = f7;
            double d10 = d9 * dCos;
            double d11 = f8;
            double d12 = f11;
            double d13 = (d10 + (d11 * dSin)) / d12;
            double d14 = ((-f7) * dSin) + (d11 * dCos);
            double d15 = f12;
            double d16 = d14 / d15;
            double d17 = f10;
            double d18 = ((f9 * dCos) + (d17 * dSin)) / d12;
            double d19 = (((-f9) * dSin) + (d17 * dCos)) / d15;
            double d20 = d13 - d18;
            double d21 = d16 - d19;
            double d22 = (d13 + d18) / 2.0d;
            double d23 = (d16 + d19) / 2.0d;
            double d24 = (d20 * d20) + (d21 * d21);
            if (d24 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d25 = (1.0d / d24) - 0.25d;
            if (d25 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d24);
                float fSqrt = (float) (Math.sqrt(d24) / 1.99999d);
                g(path, f7, f8, f9, f10, f11 * fSqrt, f12 * fSqrt, f13, z7, z8);
                return;
            }
            double dSqrt = Math.sqrt(d25);
            double d26 = d20 * dSqrt;
            double d27 = dSqrt * d21;
            if (z7 == z8) {
                d7 = d22 - d27;
                d8 = d23 + d26;
            } else {
                d7 = d22 + d27;
                d8 = d23 - d26;
            }
            double dAtan2 = Math.atan2(d16 - d8, d13 - d7);
            double dAtan22 = Math.atan2(d19 - d8, d18 - d7) - dAtan2;
            if (z8 != (dAtan22 >= 0.0d)) {
                dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
            }
            double d28 = d7 * d12;
            double d29 = d8 * d15;
            f(path, (d28 * dCos) - (d29 * dSin), (d28 * dSin) + (d29 * dCos), d12, d15, d9, d11, radians, dAtan2, dAtan22);
        }

        @Deprecated
        public static void h(b[] bVarArr, Path path) {
            c.j(bVarArr, path);
        }

        b(b bVar) {
            this.f10566a = bVar.f10566a;
            float[] fArr = bVar.f10567b;
            this.f10567b = c.c(fArr, 0, fArr.length);
        }
    }
}
