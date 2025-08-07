package androidx.emoji2.text;

import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public final class o extends SpannableStringBuilder {

    private final Class<?> f10890d;

    private final List<a> f10891e;

    private static class a implements TextWatcher, SpanWatcher {

        final Object f10892d;

        private final AtomicInteger f10893e = new AtomicInteger(0);

        a(Object obj) {
            this.f10892d = obj;
        }

        private boolean b(Object obj) {
            return obj instanceof j;
        }

        final void a() {
            this.f10893e.incrementAndGet();
        }

        @Override
        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f10892d).afterTextChanged(editable);
        }

        @Override
        public void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
            ((TextWatcher) this.f10892d).beforeTextChanged(charSequence, i7, i8, i9);
        }

        final void c() {
            this.f10893e.decrementAndGet();
        }

        @Override
        public void onSpanAdded(Spannable spannable, Object obj, int i7, int i8) {
            if (this.f10893e.get() <= 0 || !b(obj)) {
                ((SpanWatcher) this.f10892d).onSpanAdded(spannable, obj, i7, i8);
            }
        }

        @Override
        public void onSpanChanged(android.text.Spannable r9, java.lang.Object r10, int r11, int r12, int r13, int r14) {
            throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.o.a.onSpanChanged(android.text.Spannable, java.lang.Object, int, int, int, int):void");
        }

        @Override
        public void onSpanRemoved(Spannable spannable, Object obj, int i7, int i8) {
            if (this.f10893e.get() <= 0 || !b(obj)) {
                ((SpanWatcher) this.f10892d).onSpanRemoved(spannable, obj, i7, i8);
            }
        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
            ((TextWatcher) this.f10892d).onTextChanged(charSequence, i7, i8, i9);
        }
    }

    o(Class<?> cls, CharSequence charSequence) {
        super(charSequence);
        this.f10891e = new ArrayList();
        x0.g.h(cls, "watcherClass cannot be null");
        this.f10890d = cls;
    }

    private void b() {
        for (int i7 = 0; i7 < this.f10891e.size(); i7++) {
            this.f10891e.get(i7).a();
        }
    }

    public static o c(Class<?> cls, CharSequence charSequence) {
        return new o(cls, charSequence);
    }

    private void e() {
        for (int i7 = 0; i7 < this.f10891e.size(); i7++) {
            this.f10891e.get(i7).onTextChanged(this, 0, length(), length());
        }
    }

    private a f(Object obj) {
        for (int i7 = 0; i7 < this.f10891e.size(); i7++) {
            a aVar = this.f10891e.get(i7);
            if (aVar.f10892d == obj) {
                return aVar;
            }
        }
        return null;
    }

    private boolean g(Class<?> cls) {
        return this.f10890d == cls;
    }

    private boolean h(Object obj) {
        return obj != null && g(obj.getClass());
    }

    private void i() {
        for (int i7 = 0; i7 < this.f10891e.size(); i7++) {
            this.f10891e.get(i7).c();
        }
    }

    public void a() {
        b();
    }

    public void d() {
        i();
        e();
    }

    @Override
    public int getSpanEnd(Object obj) {
        a aVarF;
        if (h(obj) && (aVarF = f(obj)) != null) {
            obj = aVarF;
        }
        return super.getSpanEnd(obj);
    }

    @Override
    public int getSpanFlags(Object obj) {
        a aVarF;
        if (h(obj) && (aVarF = f(obj)) != null) {
            obj = aVarF;
        }
        return super.getSpanFlags(obj);
    }

    @Override
    public int getSpanStart(Object obj) {
        a aVarF;
        if (h(obj) && (aVarF = f(obj)) != null) {
            obj = aVarF;
        }
        return super.getSpanStart(obj);
    }

    @Override
    public <T> T[] getSpans(int i7, int i8, Class<T> cls) {
        if (!g(cls)) {
            return (T[]) super.getSpans(i7, i8, cls);
        }
        a[] aVarArr = (a[]) super.getSpans(i7, i8, a.class);
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, aVarArr.length));
        for (int i9 = 0; i9 < aVarArr.length; i9++) {
            tArr[i9] = aVarArr[i9].f10892d;
        }
        return tArr;
    }

    @Override
    public int nextSpanTransition(int i7, int i8, Class cls) {
        if (cls == null || g(cls)) {
            cls = a.class;
        }
        return super.nextSpanTransition(i7, i8, cls);
    }

    @Override
    public void removeSpan(Object obj) {
        a aVarF;
        if (h(obj)) {
            aVarF = f(obj);
            if (aVarF != null) {
                obj = aVarF;
            }
        } else {
            aVarF = null;
        }
        super.removeSpan(obj);
        if (aVarF != null) {
            this.f10891e.remove(aVarF);
        }
    }

    @Override
    public void setSpan(Object obj, int i7, int i8, int i9) {
        if (h(obj)) {
            a aVar = new a(obj);
            this.f10891e.add(aVar);
            obj = aVar;
        }
        super.setSpan(obj, i7, i8, i9);
    }

    @Override
    public CharSequence subSequence(int i7, int i8) {
        return new o(this.f10890d, this, i7, i8);
    }

    @Override
    public SpannableStringBuilder delete(int i7, int i8) {
        super.delete(i7, i8);
        return this;
    }

    @Override
    public SpannableStringBuilder insert(int i7, CharSequence charSequence) {
        super.insert(i7, charSequence);
        return this;
    }

    @Override
    public SpannableStringBuilder replace(int i7, int i8, CharSequence charSequence) {
        b();
        super.replace(i7, i8, charSequence);
        i();
        return this;
    }

    @Override
    public SpannableStringBuilder insert(int i7, CharSequence charSequence, int i8, int i9) {
        super.insert(i7, charSequence, i8, i9);
        return this;
    }

    o(Class<?> cls, CharSequence charSequence, int i7, int i8) {
        super(charSequence, i7, i8);
        this.f10891e = new ArrayList();
        x0.g.h(cls, "watcherClass cannot be null");
        this.f10890d = cls;
    }

    @Override
    public SpannableStringBuilder replace(int i7, int i8, CharSequence charSequence, int i9, int i10) {
        b();
        super.replace(i7, i8, charSequence, i9, i10);
        i();
        return this;
    }

    @Override
    public SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override
    public SpannableStringBuilder append(char c2) {
        super.append(c2);
        return this;
    }

    @Override
    public SpannableStringBuilder append(CharSequence charSequence, int i7, int i8) {
        super.append(charSequence, i7, i8);
        return this;
    }

    @Override
    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i7) {
        super.append(charSequence, obj, i7);
        return this;
    }
}
