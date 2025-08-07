package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.b;
import g.C2456j;

public abstract class a {

    public interface b {
        void a(boolean z7);
    }

    @Deprecated
    public static abstract class c {
        public abstract CharSequence a();

        public abstract View b();

        public abstract Drawable c();

        public abstract CharSequence d();

        public abstract void e();
    }

    public boolean a() {
        return false;
    }

    public abstract boolean b();

    public abstract void c(boolean z7);

    public abstract int d();

    public abstract Context e();

    public abstract void f();

    public boolean g() {
        return false;
    }

    public void h(Configuration configuration) {
    }

    void i() {
    }

    public abstract boolean j(int i7, KeyEvent keyEvent);

    public boolean k(KeyEvent keyEvent) {
        return false;
    }

    public boolean l() {
        return false;
    }

    public abstract void m(boolean z7);

    public abstract void n(boolean z7);

    public abstract void o(CharSequence charSequence);

    public androidx.appcompat.view.b p(b.a aVar) {
        return null;
    }

    public static class C0067a extends ViewGroup.MarginLayoutParams {
        public int gravity;

        public C0067a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.gravity = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2456j.f20873t);
            this.gravity = typedArrayObtainStyledAttributes.getInt(C2456j.f20877u, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public C0067a(int i7, int i8) {
            super(i7, i8);
            this.gravity = 8388627;
        }

        public C0067a(int i7, int i8, int i9) {
            super(i7, i8);
            this.gravity = i9;
        }

        public C0067a(int i7) {
            this(-2, -1, i7);
        }

        public C0067a(C0067a c0067a) {
            super((ViewGroup.MarginLayoutParams) c0067a);
            this.gravity = 0;
            this.gravity = c0067a.gravity;
        }

        public C0067a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.gravity = 0;
        }
    }
}
