package androidx.camera.view;

import android.graphics.Bitmap;
import android.util.Size;
import android.view.View;
import android.widget.FrameLayout;
import z.F0;

abstract class q {

    Size f9699a;

    FrameLayout f9700b;

    private final m f9701c;

    private boolean f9702d = false;

    interface a {
        void a();
    }

    q(FrameLayout frameLayout, m mVar) {
        this.f9700b = frameLayout;
        this.f9701c = mVar;
    }

    Bitmap a() {
        Bitmap bitmapC = c();
        if (bitmapC == null) {
            return null;
        }
        return this.f9701c.a(bitmapC, new Size(this.f9700b.getWidth(), this.f9700b.getHeight()), this.f9700b.getLayoutDirection());
    }

    abstract View b();

    abstract Bitmap c();

    abstract void d();

    abstract void e();

    void f() {
        this.f9702d = true;
        h();
    }

    abstract void g(F0 f02, a aVar);

    void h() {
        View viewB = b();
        if (viewB == null || !this.f9702d) {
            return;
        }
        this.f9701c.s(new Size(this.f9700b.getWidth(), this.f9700b.getHeight()), this.f9700b.getLayoutDirection(), viewB);
    }

    abstract com.google.common.util.concurrent.p<Void> i();
}
