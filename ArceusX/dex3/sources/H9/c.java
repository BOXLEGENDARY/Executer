package H9;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Locale;

public class c {
    private static final float[] x = {2.0f, 1.5f, 1.17f, 1.0f, 0.83f, 0.67f};
    protected final int a;
    protected final boolean b;
    protected final int c;
    protected final int d;
    protected final int e;
    protected final int f;
    protected final int g;
    protected final int h;
    protected final int i;
    protected final int j;
    protected final int k;
    protected final int l;
    protected final int m;
    protected final Typeface n;
    protected final Typeface o;
    protected final int p;
    protected final int q;
    protected final int r;
    protected final int s;
    protected final Typeface t;
    protected final float[] u;
    protected final int v;
    protected final int w;

    public static class a {
        private int a;
        private int c;
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;
        private int i;
        private int j;
        private int k;
        private int l;
        private int m;
        private Typeface n;
        private Typeface o;
        private int p;
        private int q;
        private int s;
        private Typeface t;
        private float[] u;
        private int v;
        private boolean b = true;
        private int r = -1;
        private int w = -1;

        a() {
        }

        @NonNull
        public a A(int i) {
            this.g = i;
            return this;
        }

        @NonNull
        public a B(int i) {
            this.m = i;
            return this;
        }

        @NonNull
        public a C(int i) {
            this.r = i;
            return this;
        }

        @NonNull
        public a D(int i) {
            this.w = i;
            return this;
        }

        @NonNull
        public a x(int i) {
            this.c = i;
            return this;
        }

        @NonNull
        public a y(int i) {
            this.d = i;
            return this;
        }

        @NonNull
        public c z() {
            return new c(this);
        }
    }

    protected c(@NonNull a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
        this.f = aVar.f;
        this.g = aVar.g;
        this.h = aVar.h;
        this.i = aVar.i;
        this.j = aVar.j;
        this.k = aVar.k;
        this.l = aVar.l;
        this.m = aVar.m;
        this.n = aVar.n;
        this.o = aVar.o;
        this.p = aVar.p;
        this.q = aVar.q;
        this.r = aVar.r;
        this.s = aVar.s;
        this.t = aVar.t;
        this.u = aVar.u;
        this.v = aVar.v;
        this.w = aVar.w;
    }

    @NonNull
    public static a i(@NonNull Context context) {
        N9.b bVarA = N9.b.a(context);
        return new a().B(bVarA.b(8)).x(bVarA.b(24)).y(bVarA.b(4)).A(bVarA.b(1)).C(bVarA.b(1)).D(bVarA.b(4));
    }

    public void a(@NonNull Paint paint) {
        int iA = this.e;
        if (iA == 0) {
            iA = N9.a.a(paint.getColor(), 25);
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(iA);
    }

    public void b(@NonNull Paint paint) {
        int i = this.j;
        if (i == 0) {
            i = this.i;
        }
        if (i != 0) {
            paint.setColor(i);
        }
        Typeface typeface = this.o;
        if (typeface == null) {
            typeface = this.n;
        }
        if (typeface != null) {
            paint.setTypeface(typeface);
            int i2 = this.q;
            if (i2 <= 0) {
                i2 = this.p;
            }
            if (i2 > 0) {
                paint.setTextSize(i2);
                return;
            }
            return;
        }
        paint.setTypeface(Typeface.MONOSPACE);
        int i3 = this.q;
        if (i3 <= 0) {
            i3 = this.p;
        }
        if (i3 > 0) {
            paint.setTextSize(i3);
        } else {
            paint.setTextSize(paint.getTextSize() * 0.87f);
        }
    }

    public void c(@NonNull Paint paint) {
        int i = this.i;
        if (i != 0) {
            paint.setColor(i);
        }
        Typeface typeface = this.n;
        if (typeface != null) {
            paint.setTypeface(typeface);
            int i2 = this.p;
            if (i2 > 0) {
                paint.setTextSize(i2);
                return;
            }
            return;
        }
        paint.setTypeface(Typeface.MONOSPACE);
        int i3 = this.p;
        if (i3 > 0) {
            paint.setTextSize(i3);
        } else {
            paint.setTextSize(paint.getTextSize() * 0.87f);
        }
    }

    public void d(@NonNull Paint paint) {
        int iA = this.s;
        if (iA == 0) {
            iA = N9.a.a(paint.getColor(), 75);
        }
        paint.setColor(iA);
        paint.setStyle(Paint.Style.FILL);
        int i = this.r;
        if (i >= 0) {
            paint.setStrokeWidth(i);
        }
    }

    public void e(@NonNull Paint paint, int i) {
        Typeface typeface = this.t;
        if (typeface == null) {
            paint.setFakeBoldText(true);
        } else {
            paint.setTypeface(typeface);
        }
        float[] fArr = this.u;
        if (fArr == null) {
            fArr = x;
        }
        if (fArr == null || fArr.length < i) {
            throw new IllegalStateException(String.format(Locale.US, "Supplied heading level: %d is invalid, where configured heading sizes are: `%s`", Integer.valueOf(i), Arrays.toString(fArr)));
        }
        paint.setTextSize(paint.getTextSize() * fArr[i - 1]);
    }

    public void f(@NonNull TextPaint textPaint) {
        textPaint.setUnderlineText(this.b);
        int i = this.a;
        if (i != 0) {
            textPaint.setColor(i);
        } else {
            textPaint.setColor(textPaint.linkColor);
        }
    }

    public void g(@NonNull Paint paint) {
        int color = this.f;
        if (color == 0) {
            color = paint.getColor();
        }
        paint.setColor(color);
        int i = this.g;
        if (i != 0) {
            paint.setStrokeWidth(i);
        }
    }

    public void h(@NonNull Paint paint) {
        int iA = this.v;
        if (iA == 0) {
            iA = N9.a.a(paint.getColor(), 25);
        }
        paint.setColor(iA);
        paint.setStyle(Paint.Style.FILL);
        int i = this.w;
        if (i >= 0) {
            paint.setStrokeWidth(i);
        }
    }

    public int j() {
        return this.c;
    }

    public int k() {
        int i = this.d;
        return i == 0 ? (int) ((this.c * 0.25f) + 0.5f) : i;
    }

    public int l(int i) {
        int iMin = Math.min(this.c, i) / 2;
        int i2 = this.h;
        return (i2 == 0 || i2 > iMin) ? iMin : i2;
    }

    public int m(@NonNull Paint paint) {
        int i = this.k;
        return i != 0 ? i : N9.a.a(paint.getColor(), 25);
    }

    public int n(@NonNull Paint paint) {
        int i = this.l;
        if (i == 0) {
            i = this.k;
        }
        return i != 0 ? i : N9.a.a(paint.getColor(), 25);
    }

    public int o() {
        return this.m;
    }
}
