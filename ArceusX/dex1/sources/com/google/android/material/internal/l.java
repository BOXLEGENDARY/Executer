package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.github.luben.zstd.BuildConfig;

final class l {

    static final int f18150n = 1;

    private CharSequence f18151a;

    private final TextPaint f18152b;

    private final int f18153c;

    private int f18155e;

    private boolean f18162l;

    private int f18154d = 0;

    private Layout.Alignment f18156f = Layout.Alignment.ALIGN_NORMAL;

    private int f18157g = Integer.MAX_VALUE;

    private float f18158h = 0.0f;

    private float f18159i = 1.0f;

    private int f18160j = f18150n;

    private boolean f18161k = true;

    private TextUtils.TruncateAt f18163m = null;

    static class a extends Exception {
    }

    private l(CharSequence charSequence, TextPaint textPaint, int i7) {
        this.f18151a = charSequence;
        this.f18152b = textPaint;
        this.f18153c = i7;
        this.f18155e = charSequence.length();
    }

    public static l b(CharSequence charSequence, TextPaint textPaint, int i7) {
        return new l(charSequence, textPaint, i7);
    }

    public StaticLayout a() throws a {
        if (this.f18151a == null) {
            this.f18151a = BuildConfig.FLAVOR;
        }
        int iMax = Math.max(0, this.f18153c);
        CharSequence charSequenceEllipsize = this.f18151a;
        if (this.f18157g == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f18152b, iMax, this.f18163m);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f18155e);
        this.f18155e = iMin;
        if (this.f18162l && this.f18157g == 1) {
            this.f18156f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, this.f18154d, iMin, this.f18152b, iMax);
        builderObtain.setAlignment(this.f18156f);
        builderObtain.setIncludePad(this.f18161k);
        builderObtain.setTextDirection(this.f18162l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f18163m;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f18157g);
        float f7 = this.f18158h;
        if (f7 != 0.0f || this.f18159i != 1.0f) {
            builderObtain.setLineSpacing(f7, this.f18159i);
        }
        if (this.f18157g > 1) {
            builderObtain.setHyphenationFrequency(this.f18160j);
        }
        return builderObtain.build();
    }

    public l c(Layout.Alignment alignment) {
        this.f18156f = alignment;
        return this;
    }

    public l d(TextUtils.TruncateAt truncateAt) {
        this.f18163m = truncateAt;
        return this;
    }

    public l e(int i7) {
        this.f18160j = i7;
        return this;
    }

    public l f(boolean z7) {
        this.f18161k = z7;
        return this;
    }

    public l g(boolean z7) {
        this.f18162l = z7;
        return this;
    }

    public l h(float f7, float f8) {
        this.f18158h = f7;
        this.f18159i = f8;
        return this;
    }

    public l i(int i7) {
        this.f18157g = i7;
        return this;
    }

    public l j(m mVar) {
        return this;
    }
}
