package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;
import w0.C2963b;

class q implements Spannable {

    private boolean f10895d = false;

    private Spannable f10896e;

    private static class a {
        static IntStream a(CharSequence charSequence) {
            return charSequence.chars();
        }

        static IntStream b(CharSequence charSequence) {
            return charSequence.codePoints();
        }
    }

    static class b {
        b() {
        }

        boolean a(CharSequence charSequence) {
            return charSequence instanceof w0.p;
        }
    }

    static class c extends b {
        c() {
        }

        @Override
        boolean a(CharSequence charSequence) {
            return C2963b.a(charSequence) || (charSequence instanceof w0.p);
        }
    }

    q(Spannable spannable) {
        this.f10896e = spannable;
    }

    private void a() {
        Spannable spannable = this.f10896e;
        if (!this.f10895d && c().a(spannable)) {
            this.f10896e = new SpannableString(spannable);
        }
        this.f10895d = true;
    }

    static b c() {
        return Build.VERSION.SDK_INT < 28 ? new b() : new c();
    }

    Spannable b() {
        return this.f10896e;
    }

    @Override
    public char charAt(int i7) {
        return this.f10896e.charAt(i7);
    }

    @Override
    public IntStream chars() {
        return a.a(this.f10896e);
    }

    @Override
    public IntStream codePoints() {
        return a.b(this.f10896e);
    }

    @Override
    public int getSpanEnd(Object obj) {
        return this.f10896e.getSpanEnd(obj);
    }

    @Override
    public int getSpanFlags(Object obj) {
        return this.f10896e.getSpanFlags(obj);
    }

    @Override
    public int getSpanStart(Object obj) {
        return this.f10896e.getSpanStart(obj);
    }

    @Override
    public <T> T[] getSpans(int i7, int i8, Class<T> cls) {
        return (T[]) this.f10896e.getSpans(i7, i8, cls);
    }

    @Override
    public int length() {
        return this.f10896e.length();
    }

    @Override
    public int nextSpanTransition(int i7, int i8, Class cls) {
        return this.f10896e.nextSpanTransition(i7, i8, cls);
    }

    @Override
    public void removeSpan(Object obj) {
        a();
        this.f10896e.removeSpan(obj);
    }

    @Override
    public void setSpan(Object obj, int i7, int i8, int i9) {
        a();
        this.f10896e.setSpan(obj, i7, i8, i9);
    }

    @Override
    public CharSequence subSequence(int i7, int i8) {
        return this.f10896e.subSequence(i7, i8);
    }

    @Override
    public String toString() {
        return this.f10896e.toString();
    }

    q(CharSequence charSequence) {
        this.f10896e = new SpannableString(charSequence);
    }
}
