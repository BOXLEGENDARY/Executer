package w0;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import x0.C2985b;

public class p implements Spannable {

    private static final Object f24246v = new Object();

    private final Spannable f24247d;

    private final a f24248e;

    private final PrecomputedText f24249i;

    public a a() {
        return this.f24248e;
    }

    public PrecomputedText b() {
        if (C2963b.a(this.f24247d)) {
            return C2964c.a(this.f24247d);
        }
        return null;
    }

    @Override
    public char charAt(int i7) {
        return this.f24247d.charAt(i7);
    }

    @Override
    public int getSpanEnd(Object obj) {
        return this.f24247d.getSpanEnd(obj);
    }

    @Override
    public int getSpanFlags(Object obj) {
        return this.f24247d.getSpanFlags(obj);
    }

    @Override
    public int getSpanStart(Object obj) {
        return this.f24247d.getSpanStart(obj);
    }

    @Override
    public <T> T[] getSpans(int i7, int i8, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? (T[]) this.f24249i.getSpans(i7, i8, cls) : (T[]) this.f24247d.getSpans(i7, i8, cls);
    }

    @Override
    public int length() {
        return this.f24247d.length();
    }

    @Override
    public int nextSpanTransition(int i7, int i8, Class cls) {
        return this.f24247d.nextSpanTransition(i7, i8, cls);
    }

    @Override
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f24249i.removeSpan(obj);
        } else {
            this.f24247d.removeSpan(obj);
        }
    }

    @Override
    public void setSpan(Object obj, int i7, int i8, int i9) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f24249i.setSpan(obj, i7, i8, i9);
        } else {
            this.f24247d.setSpan(obj, i7, i8, i9);
        }
    }

    @Override
    public CharSequence subSequence(int i7, int i8) {
        return this.f24247d.subSequence(i7, i8);
    }

    @Override
    public String toString() {
        return this.f24247d.toString();
    }

    public static final class a {

        private final TextPaint f24250a;

        private final TextDirectionHeuristic f24251b;

        private final int f24252c;

        private final int f24253d;

        final PrecomputedText.Params f24254e;

        public static class C0237a {

            private final TextPaint f24255a;

            private int f24257c = 1;

            private int f24258d = 1;

            private TextDirectionHeuristic f24256b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public C0237a(TextPaint textPaint) {
                this.f24255a = textPaint;
            }

            public a a() {
                return new a(this.f24255a, this.f24256b, this.f24257c, this.f24258d);
            }

            public C0237a b(int i7) {
                this.f24257c = i7;
                return this;
            }

            public C0237a c(int i7) {
                this.f24258d = i7;
                return this;
            }

            public C0237a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f24256b = textDirectionHeuristic;
                return this;
            }
        }

        a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i7, int i8) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f24254e = o.a(textPaint).setBreakStrategy(i7).setHyphenationFrequency(i8).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f24254e = null;
            }
            this.f24250a = textPaint;
            this.f24251b = textDirectionHeuristic;
            this.f24252c = i7;
            this.f24253d = i8;
        }

        public boolean a(a aVar) {
            if (this.f24252c == aVar.b() && this.f24253d == aVar.c() && this.f24250a.getTextSize() == aVar.e().getTextSize() && this.f24250a.getTextScaleX() == aVar.e().getTextScaleX() && this.f24250a.getTextSkewX() == aVar.e().getTextSkewX() && this.f24250a.getLetterSpacing() == aVar.e().getLetterSpacing() && TextUtils.equals(this.f24250a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()) && this.f24250a.getFlags() == aVar.e().getFlags() && this.f24250a.getTextLocales().equals(aVar.e().getTextLocales())) {
                return this.f24250a.getTypeface() == null ? aVar.e().getTypeface() == null : this.f24250a.getTypeface().equals(aVar.e().getTypeface());
            }
            return false;
        }

        public int b() {
            return this.f24252c;
        }

        public int c() {
            return this.f24253d;
        }

        public TextDirectionHeuristic d() {
            return this.f24251b;
        }

        public TextPaint e() {
            return this.f24250a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return a(aVar) && this.f24251b == aVar.d();
        }

        public int hashCode() {
            return C2985b.b(Float.valueOf(this.f24250a.getTextSize()), Float.valueOf(this.f24250a.getTextScaleX()), Float.valueOf(this.f24250a.getTextSkewX()), Float.valueOf(this.f24250a.getLetterSpacing()), Integer.valueOf(this.f24250a.getFlags()), this.f24250a.getTextLocales(), this.f24250a.getTypeface(), Boolean.valueOf(this.f24250a.isElegantTextHeight()), this.f24251b, Integer.valueOf(this.f24252c), Integer.valueOf(this.f24253d));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f24250a.getTextSize());
            sb.append(", textScaleX=" + this.f24250a.getTextScaleX());
            sb.append(", textSkewX=" + this.f24250a.getTextSkewX());
            sb.append(", letterSpacing=" + this.f24250a.getLetterSpacing());
            sb.append(", elegantTextHeight=" + this.f24250a.isElegantTextHeight());
            sb.append(", textLocale=" + this.f24250a.getTextLocales());
            sb.append(", typeface=" + this.f24250a.getTypeface());
            sb.append(", variationSettings=" + this.f24250a.getFontVariationSettings());
            sb.append(", textDir=" + this.f24251b);
            sb.append(", breakStrategy=" + this.f24252c);
            sb.append(", hyphenationFrequency=" + this.f24253d);
            sb.append("}");
            return sb.toString();
        }

        public a(PrecomputedText.Params params) {
            this.f24250a = params.getTextPaint();
            this.f24251b = params.getTextDirection();
            this.f24252c = params.getBreakStrategy();
            this.f24253d = params.getHyphenationFrequency();
            this.f24254e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
