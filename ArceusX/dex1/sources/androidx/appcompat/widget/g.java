package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import g.C2456j;

class g {

    private final TextView f9288a;

    private final K0.f f9289b;

    g(TextView textView) {
        this.f9288a = textView;
        this.f9289b = new K0.f(textView, false);
    }

    InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f9289b.a(inputFilterArr);
    }

    public boolean b() {
        return this.f9289b.b();
    }

    void c(AttributeSet attributeSet, int i7) {
        TypedArray typedArrayObtainStyledAttributes = this.f9288a.getContext().obtainStyledAttributes(attributeSet, C2456j.f20829i0, i7, 0);
        try {
            int i8 = C2456j.f20886w0;
            boolean z7 = typedArrayObtainStyledAttributes.hasValue(i8) ? typedArrayObtainStyledAttributes.getBoolean(i8, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            e(z7);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    void d(boolean z7) {
        this.f9289b.c(z7);
    }

    void e(boolean z7) {
        this.f9289b.d(z7);
    }

    public TransformationMethod f(TransformationMethod transformationMethod) {
        return this.f9289b.e(transformationMethod);
    }
}
