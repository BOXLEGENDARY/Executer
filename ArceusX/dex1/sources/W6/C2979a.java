package w6;

import android.graphics.Rect;
import android.view.C1709w;
import android.view.LiveData;
import android.view.View;
import androidx.core.graphics.Insets;
import androidx.core.view.I;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.Z;

public class C2979a implements I {

    private C1709w<Rect> f24303d = new C1709w<>();

    private C1709w<Rect> f24304e = new C1709w<>();

    @Override
    public WindowInsetsCompat K(View view, WindowInsetsCompat windowInsetsCompat) {
        Rect rect = new Rect();
        rect.top = windowInsetsCompat.getSystemWindowInsetTop();
        rect.left = windowInsetsCompat.getSystemWindowInsetLeft();
        rect.right = windowInsetsCompat.getSystemWindowInsetRight();
        rect.bottom = windowInsetsCompat.getSystemWindowInsetBottom();
        this.f24303d.o(rect);
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.displayCutout());
        Rect rect2 = new Rect();
        rect2.left = insets.left;
        rect2.top = insets.top;
        rect2.right = insets.right;
        rect2.bottom = insets.bottom;
        this.f24304e.o(rect2);
        return windowInsetsCompat;
    }

    public LiveData<Rect> a() {
        return this.f24304e;
    }

    public C1709w<Rect> b() {
        return this.f24303d;
    }

    public Rect c() {
        return this.f24303d.f();
    }

    public void d(View view) {
        Z.B0(view, this);
    }
}
