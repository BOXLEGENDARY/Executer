package androidx.appcompat.widget;

import S9.Gvmm.CAqKeu;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.Z;
import g.C2456j;
import j0.tkB.pkcpMQSgx;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

class o {

    private static final RectF f9324l = new RectF();

    private static ConcurrentHashMap<String, Method> f9325m = new ConcurrentHashMap<>();

    private static ConcurrentHashMap<String, Field> f9326n = new ConcurrentHashMap<>();

    private int f9327a = 0;

    private boolean f9328b = false;

    private float f9329c = -1.0f;

    private float f9330d = -1.0f;

    private float f9331e = -1.0f;

    private int[] f9332f = new int[0];

    private boolean f9333g = false;

    private TextPaint f9334h;

    private final TextView f9335i;

    private final Context f9336j;

    private final f f9337k;

    private static final class a {
        static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i7, TextView textView, TextPaint textPaint) {
            return new StaticLayout(charSequence, textPaint, i7, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
        }

        static int b(TextView textView) {
            return textView.getMaxLines();
        }
    }

    private static final class b {
        static boolean a(View view) {
            return view.isInLayout();
        }
    }

    private static final class c {
        static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i7, int i8, TextView textView, TextPaint textPaint, f fVar) {
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i7);
            StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i8 == -1) {
                i8 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i8);
            try {
                fVar.a(builderObtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return builderObtain.build();
        }
    }

    private static class d extends f {
        d() {
        }

        @Override
        void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) o.m(textView, pkcpMQSgx.sxaermxJhy, TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    private static class e extends d {
        e() {
        }

        @Override
        void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override
        boolean b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    private static class f {
        f() {
        }

        void a(StaticLayout.Builder builder, TextView textView) {
            throw null;
        }

        boolean b(TextView textView) {
            return ((Boolean) o.m(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    o(TextView textView) {
        this.f9335i = textView;
        this.f9336j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f9337k = new e();
        } else {
            this.f9337k = new d();
        }
    }

    private int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i7 : iArr) {
            if (i7 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i7)) < 0) {
                arrayList.add(Integer.valueOf(i7));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i8 = 0; i8 < size; i8++) {
            iArr2[i8] = ((Integer) arrayList.get(i8)).intValue();
        }
        return iArr2;
    }

    private void c() {
        this.f9327a = 0;
        this.f9330d = -1.0f;
        this.f9331e = -1.0f;
        this.f9329c = -1.0f;
        this.f9332f = new int[0];
        this.f9328b = false;
    }

    private int e(RectF rectF) {
        int length = this.f9332f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i7 = 1;
        int i8 = length - 1;
        int i9 = 0;
        while (i7 <= i8) {
            int i10 = (i7 + i8) / 2;
            if (x(this.f9332f[i10], rectF)) {
                int i11 = i10 + 1;
                i9 = i7;
                i7 = i11;
            } else {
                i9 = i10 - 1;
                i8 = i9;
            }
        }
        return this.f9332f[i9];
    }

    private static Method k(String str) throws SecurityException {
        try {
            Method declaredMethod = f9325m.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, null)) != null) {
                declaredMethod.setAccessible(true);
                f9325m.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception e7) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e7);
            return null;
        }
    }

    static <T> T m(Object obj, String str, T t7) {
        try {
            return (T) k(str).invoke(obj, null);
        } catch (Exception e7) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e7);
            return t7;
        }
    }

    private void s(float f7) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (f7 != this.f9335i.getPaint().getTextSize()) {
            this.f9335i.getPaint().setTextSize(f7);
            boolean zA = b.a(this.f9335i);
            if (this.f9335i.getLayout() != null) {
                this.f9328b = false;
                try {
                    Method methodK = k(CAqKeu.LFiGo);
                    if (methodK != null) {
                        methodK.invoke(this.f9335i, null);
                    }
                } catch (Exception e7) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e7);
                }
                if (zA) {
                    this.f9335i.forceLayout();
                } else {
                    this.f9335i.requestLayout();
                }
                this.f9335i.invalidate();
            }
        }
    }

    private boolean u() {
        if (y() && this.f9327a == 1) {
            if (!this.f9333g || this.f9332f.length == 0) {
                int iFloor = ((int) Math.floor((this.f9331e - this.f9330d) / this.f9329c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i7 = 0; i7 < iFloor; i7++) {
                    iArr[i7] = Math.round(this.f9330d + (i7 * this.f9329c));
                }
                this.f9332f = b(iArr);
            }
            this.f9328b = true;
        } else {
            this.f9328b = false;
        }
        return this.f9328b;
    }

    private void v(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i7 = 0; i7 < length; i7++) {
                iArr[i7] = typedArray.getDimensionPixelSize(i7, -1);
            }
            this.f9332f = b(iArr);
            w();
        }
    }

    private boolean w() {
        boolean z7 = this.f9332f.length > 0;
        this.f9333g = z7;
        if (z7) {
            this.f9327a = 1;
            this.f9330d = r0[0];
            this.f9331e = r0[r1 - 1];
            this.f9329c = -1.0f;
        }
        return z7;
    }

    private boolean x(int i7, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f9335i.getText();
        TransformationMethod transformationMethod = this.f9335i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f9335i)) != null) {
            text = transformation;
        }
        int iB = a.b(this.f9335i);
        l(i7);
        StaticLayout staticLayoutD = d(text, (Layout.Alignment) m(this.f9335i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), iB);
        return (iB == -1 || (staticLayoutD.getLineCount() <= iB && staticLayoutD.getLineEnd(staticLayoutD.getLineCount() - 1) == text.length())) && ((float) staticLayoutD.getHeight()) <= rectF.bottom;
    }

    private boolean y() {
        return !(this.f9335i instanceof AppCompatEditText);
    }

    private void z(float f7, float f8, float f9) throws IllegalArgumentException {
        if (f7 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f7 + "px) is less or equal to (0px)");
        }
        if (f8 <= f7) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f8 + "px) is less or equal to minimum auto-size text size (" + f7 + "px)");
        }
        if (f9 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f9 + "px) is less or equal to (0px)");
        }
        this.f9327a = 1;
        this.f9330d = f7;
        this.f9331e = f8;
        this.f9329c = f9;
        this.f9333g = false;
    }

    void a() {
        if (n()) {
            if (this.f9328b) {
                if (this.f9335i.getMeasuredHeight() <= 0 || this.f9335i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f9337k.b(this.f9335i) ? 1048576 : (this.f9335i.getMeasuredWidth() - this.f9335i.getTotalPaddingLeft()) - this.f9335i.getTotalPaddingRight();
                int height = (this.f9335i.getHeight() - this.f9335i.getCompoundPaddingBottom()) - this.f9335i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f9324l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fE = e(rectF);
                        if (fE != this.f9335i.getTextSize()) {
                            t(0, fE);
                        }
                    } finally {
                    }
                }
            }
            this.f9328b = true;
        }
    }

    StaticLayout d(CharSequence charSequence, Layout.Alignment alignment, int i7, int i8) {
        return c.a(charSequence, alignment, i7, i8, this.f9335i, this.f9334h, this.f9337k);
    }

    int f() {
        return Math.round(this.f9331e);
    }

    int g() {
        return Math.round(this.f9330d);
    }

    int h() {
        return Math.round(this.f9329c);
    }

    int[] i() {
        return this.f9332f;
    }

    int j() {
        return this.f9327a;
    }

    void l(int i7) {
        TextPaint textPaint = this.f9334h;
        if (textPaint == null) {
            this.f9334h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f9334h.set(this.f9335i.getPaint());
        this.f9334h.setTextSize(i7);
    }

    boolean n() {
        return y() && this.f9327a != 0;
    }

    void o(AttributeSet attributeSet, int i7) {
        int resourceId;
        Context context = this.f9336j;
        int[] iArr = C2456j.f20829i0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i7, 0);
        TextView textView = this.f9335i;
        Z.l0(textView, textView.getContext(), iArr, attributeSet, typedArrayObtainStyledAttributes, i7, 0);
        int i8 = C2456j.f20851n0;
        if (typedArrayObtainStyledAttributes.hasValue(i8)) {
            this.f9327a = typedArrayObtainStyledAttributes.getInt(i8, 0);
        }
        int i9 = C2456j.f20847m0;
        float dimension = typedArrayObtainStyledAttributes.hasValue(i9) ? typedArrayObtainStyledAttributes.getDimension(i9, -1.0f) : -1.0f;
        int i10 = C2456j.f20839k0;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(i10) ? typedArrayObtainStyledAttributes.getDimension(i10, -1.0f) : -1.0f;
        int i11 = C2456j.f20834j0;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(i11) ? typedArrayObtainStyledAttributes.getDimension(i11, -1.0f) : -1.0f;
        int i12 = C2456j.f20843l0;
        if (typedArrayObtainStyledAttributes.hasValue(i12) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(i12, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            v(typedArrayObtainTypedArray);
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!y()) {
            this.f9327a = 0;
            return;
        }
        if (this.f9327a == 1) {
            if (!this.f9333g) {
                DisplayMetrics displayMetrics = this.f9336j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                z(dimension2, dimension3, dimension);
            }
            u();
        }
    }

    void p(int i7, int i8, int i9, int i10) throws IllegalArgumentException {
        if (y()) {
            DisplayMetrics displayMetrics = this.f9336j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(i10, i7, displayMetrics), TypedValue.applyDimension(i10, i8, displayMetrics), TypedValue.applyDimension(i10, i9, displayMetrics));
            if (u()) {
                a();
            }
        }
    }

    void q(int[] iArr, int i7) throws IllegalArgumentException {
        if (y()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i7 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f9336j.getResources().getDisplayMetrics();
                    for (int i8 = 0; i8 < length; i8++) {
                        iArrCopyOf[i8] = Math.round(TypedValue.applyDimension(i7, iArr[i8], displayMetrics));
                    }
                }
                this.f9332f = b(iArrCopyOf);
                if (!w()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f9333g = false;
            }
            if (u()) {
                a();
            }
        }
    }

    void r(int i7) {
        if (y()) {
            if (i7 == 0) {
                c();
                return;
            }
            if (i7 != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i7);
            }
            DisplayMetrics displayMetrics = this.f9336j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (u()) {
                a();
            }
        }
    }

    void t(int i7, float f7) {
        Context context = this.f9336j;
        s(TypedValue.applyDimension(i7, f7, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }
}
