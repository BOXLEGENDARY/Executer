package r4;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import c4.C1755k;
import p0.h;

public class C2755d {

    public final ColorStateList f22897a;

    public final ColorStateList f22898b;

    public final ColorStateList f22899c;

    public final String f22900d;

    public final int f22901e;

    public final int f22902f;

    public final boolean f22903g;

    public final float f22904h;

    public final float f22905i;

    public final float f22906j;

    public final boolean f22907k;

    public final float f22908l;

    private ColorStateList f22909m;

    private float f22910n;

    private final int f22911o;

    private boolean f22912p = false;

    private Typeface f22913q;

    class a extends h.f {

        final f f22914a;

        a(f fVar) {
            this.f22914a = fVar;
        }

        @Override
        public void f(int i7) {
            C2755d.this.f22912p = true;
            this.f22914a.a(i7);
        }

        @Override
        public void g(Typeface typeface) {
            C2755d c2755d = C2755d.this;
            c2755d.f22913q = Typeface.create(typeface, c2755d.f22901e);
            C2755d.this.f22912p = true;
            this.f22914a.b(C2755d.this.f22913q, false);
        }
    }

    class b extends f {

        final Context f22916a;

        final TextPaint f22917b;

        final f f22918c;

        b(Context context, TextPaint textPaint, f fVar) {
            this.f22916a = context;
            this.f22917b = textPaint;
            this.f22918c = fVar;
        }

        @Override
        public void a(int i7) {
            this.f22918c.a(i7);
        }

        @Override
        public void b(Typeface typeface, boolean z7) {
            C2755d.this.p(this.f22916a, this.f22917b, typeface);
            this.f22918c.b(typeface, z7);
        }
    }

    public C2755d(Context context, int i7) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i7, C1755k.f13168f6);
        l(typedArrayObtainStyledAttributes.getDimension(C1755k.f13176g6, 0.0f));
        k(C2754c.a(context, typedArrayObtainStyledAttributes, C1755k.f13200j6));
        this.f22897a = C2754c.a(context, typedArrayObtainStyledAttributes, C1755k.f13207k6);
        this.f22898b = C2754c.a(context, typedArrayObtainStyledAttributes, C1755k.f13214l6);
        this.f22901e = typedArrayObtainStyledAttributes.getInt(C1755k.f13192i6, 0);
        this.f22902f = typedArrayObtainStyledAttributes.getInt(C1755k.f13184h6, 1);
        int iE = C2754c.e(typedArrayObtainStyledAttributes, C1755k.f13255r6, C1755k.f13248q6);
        this.f22911o = typedArrayObtainStyledAttributes.getResourceId(iE, 0);
        this.f22900d = typedArrayObtainStyledAttributes.getString(iE);
        this.f22903g = typedArrayObtainStyledAttributes.getBoolean(C1755k.f13262s6, false);
        this.f22899c = C2754c.a(context, typedArrayObtainStyledAttributes, C1755k.f13221m6);
        this.f22904h = typedArrayObtainStyledAttributes.getFloat(C1755k.f13228n6, 0.0f);
        this.f22905i = typedArrayObtainStyledAttributes.getFloat(C1755k.f13234o6, 0.0f);
        this.f22906j = typedArrayObtainStyledAttributes.getFloat(C1755k.f13241p6, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i7, C1755k.f13246q4);
        int i8 = C1755k.f13253r4;
        this.f22907k = typedArrayObtainStyledAttributes2.hasValue(i8);
        this.f22908l = typedArrayObtainStyledAttributes2.getFloat(i8, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    private void d() {
        String str;
        if (this.f22913q == null && (str = this.f22900d) != null) {
            this.f22913q = Typeface.create(str, this.f22901e);
        }
        if (this.f22913q == null) {
            int i7 = this.f22902f;
            if (i7 == 1) {
                this.f22913q = Typeface.SANS_SERIF;
            } else if (i7 == 2) {
                this.f22913q = Typeface.SERIF;
            } else if (i7 != 3) {
                this.f22913q = Typeface.DEFAULT;
            } else {
                this.f22913q = Typeface.MONOSPACE;
            }
            this.f22913q = Typeface.create(this.f22913q, this.f22901e);
        }
    }

    private boolean m(Context context) {
        if (e.a()) {
            return true;
        }
        int i7 = this.f22911o;
        return (i7 != 0 ? p0.h.c(context, i7) : null) != null;
    }

    public Typeface e() {
        d();
        return this.f22913q;
    }

    public Typeface f(Context context) {
        if (this.f22912p) {
            return this.f22913q;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceH = p0.h.h(context, this.f22911o);
                this.f22913q = typefaceH;
                if (typefaceH != null) {
                    this.f22913q = Typeface.create(typefaceH, this.f22901e);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e7) {
                Log.d("TextAppearance", "Error loading font " + this.f22900d, e7);
            }
        }
        d();
        this.f22912p = true;
        return this.f22913q;
    }

    public void g(Context context, TextPaint textPaint, f fVar) {
        p(context, textPaint, e());
        h(context, new b(context, textPaint, fVar));
    }

    public void h(Context context, f fVar) {
        if (m(context)) {
            f(context);
        } else {
            d();
        }
        int i7 = this.f22911o;
        if (i7 == 0) {
            this.f22912p = true;
        }
        if (this.f22912p) {
            fVar.b(this.f22913q, true);
            return;
        }
        try {
            p0.h.j(context, i7, new a(fVar), null);
        } catch (Resources.NotFoundException unused) {
            this.f22912p = true;
            fVar.a(1);
        } catch (Exception e7) {
            Log.d("TextAppearance", "Error loading font " + this.f22900d, e7);
            this.f22912p = true;
            fVar.a(-3);
        }
    }

    public ColorStateList i() {
        return this.f22909m;
    }

    public float j() {
        return this.f22910n;
    }

    public void k(ColorStateList colorStateList) {
        this.f22909m = colorStateList;
    }

    public void l(float f7) {
        this.f22910n = f7;
    }

    public void n(Context context, TextPaint textPaint, f fVar) {
        o(context, textPaint, fVar);
        ColorStateList colorStateList = this.f22909m;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f7 = this.f22906j;
        float f8 = this.f22904h;
        float f9 = this.f22905i;
        ColorStateList colorStateList2 = this.f22899c;
        textPaint.setShadowLayer(f7, f8, f9, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void o(Context context, TextPaint textPaint, f fVar) {
        if (m(context)) {
            p(context, textPaint, f(context));
        } else {
            g(context, textPaint, fVar);
        }
    }

    public void p(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceA = j.a(context, typeface);
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        textPaint.setTypeface(typeface);
        int i7 = this.f22901e & (~typeface.getStyle());
        textPaint.setFakeBoldText((i7 & 1) != 0);
        textPaint.setTextSkewX((i7 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f22910n);
        if (this.f22907k) {
            textPaint.setLetterSpacing(this.f22908l);
        }
    }
}
