package androidx.camera.core;

import C.g1;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.n;
import java.nio.ByteBuffer;
import z.AbstractC3037a0;
import z.V;

final class a implements n {

    private final Image f9414d;

    private final C0072a[] f9415e;

    private final V f9416i;

    private static final class C0072a implements n.a {

        private final Image.Plane f9417a;

        C0072a(Image.Plane plane) {
            this.f9417a = plane;
        }

        @Override
        public ByteBuffer c() {
            return this.f9417a.getBuffer();
        }

        @Override
        public int d() {
            return this.f9417a.getRowStride();
        }

        @Override
        public int e() {
            return this.f9417a.getPixelStride();
        }
    }

    a(Image image) {
        this.f9414d = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.f9415e = new C0072a[planes.length];
            for (int i7 = 0; i7 < planes.length; i7++) {
                this.f9415e[i7] = new C0072a(planes[i7]);
            }
        } else {
            this.f9415e = new C0072a[0];
        }
        this.f9416i = AbstractC3037a0.f(g1.b(), image.getTimestamp(), 0, new Matrix());
    }

    @Override
    public void B0(Rect rect) {
        this.f9414d.setCropRect(rect);
    }

    @Override
    public V D0() {
        return this.f9416i;
    }

    @Override
    public void close() {
        this.f9414d.close();
    }

    @Override
    public int getHeight() {
        return this.f9414d.getHeight();
    }

    @Override
    public int getWidth() {
        return this.f9414d.getWidth();
    }

    @Override
    public int i() {
        return this.f9414d.getFormat();
    }

    @Override
    public Image l() {
        return this.f9414d;
    }

    @Override
    public n.a[] s() {
        return this.f9415e;
    }
}
