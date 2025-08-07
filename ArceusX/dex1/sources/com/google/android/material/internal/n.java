package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;
import r4.C2755d;

public class n {

    private float f18166c;

    private float f18167d;

    private C2755d f18170g;

    private final TextPaint f18164a = new TextPaint(1);

    private final r4.f f18165b = new a();

    private boolean f18168e = true;

    private WeakReference<b> f18169f = new WeakReference<>(null);

    class a extends r4.f {
        a() {
        }

        @Override
        public void a(int i7) {
            n.this.f18168e = true;
            b bVar = (b) n.this.f18169f.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override
        public void b(Typeface typeface, boolean z7) {
            if (z7) {
                return;
            }
            n.this.f18168e = true;
            b bVar = (b) n.this.f18169f.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public n(b bVar) {
        i(bVar);
    }

    private float c(String str) {
        if (str == null) {
            return 0.0f;
        }
        return Math.abs(this.f18164a.getFontMetrics().ascent);
    }

    private float d(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f18164a.measureText(charSequence, 0, charSequence.length());
    }

    private void h(String str) {
        this.f18166c = d(str);
        this.f18167d = c(str);
        this.f18168e = false;
    }

    public C2755d e() {
        return this.f18170g;
    }

    public TextPaint f() {
        return this.f18164a;
    }

    public float g(String str) {
        if (!this.f18168e) {
            return this.f18166c;
        }
        h(str);
        return this.f18166c;
    }

    public void i(b bVar) {
        this.f18169f = new WeakReference<>(bVar);
    }

    public void j(C2755d c2755d, Context context) {
        if (this.f18170g != c2755d) {
            this.f18170g = c2755d;
            if (c2755d != null) {
                c2755d.o(context, this.f18164a, this.f18165b);
                b bVar = this.f18169f.get();
                if (bVar != null) {
                    this.f18164a.drawableState = bVar.getState();
                }
                c2755d.n(context, this.f18164a, this.f18165b);
                this.f18168e = true;
            }
            b bVar2 = this.f18169f.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void k(boolean z7) {
        this.f18168e = z7;
    }

    public void l(Context context) {
        this.f18170g.n(context, this.f18164a, this.f18165b);
    }
}
