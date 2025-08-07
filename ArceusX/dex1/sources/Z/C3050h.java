package z;

import android.graphics.Matrix;
import android.graphics.Rect;
import z.F0;

final class C3050h extends F0.h {

    private final Rect f24645a;

    private final int f24646b;

    private final int f24647c;

    private final boolean f24648d;

    private final Matrix f24649e;

    private final boolean f24650f;

    C3050h(Rect rect, int i7, int i8, boolean z7, Matrix matrix, boolean z8) {
        if (rect == null) {
            throw new NullPointerException("Null getCropRect");
        }
        this.f24645a = rect;
        this.f24646b = i7;
        this.f24647c = i8;
        this.f24648d = z7;
        if (matrix == null) {
            throw new NullPointerException("Null getSensorToBufferTransform");
        }
        this.f24649e = matrix;
        this.f24650f = z8;
    }

    @Override
    public Rect a() {
        return this.f24645a;
    }

    @Override
    public int b() {
        return this.f24646b;
    }

    @Override
    public Matrix c() {
        return this.f24649e;
    }

    @Override
    public int d() {
        return this.f24647c;
    }

    @Override
    public boolean e() {
        return this.f24648d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F0.h)) {
            return false;
        }
        F0.h hVar = (F0.h) obj;
        return this.f24645a.equals(hVar.a()) && this.f24646b == hVar.b() && this.f24647c == hVar.d() && this.f24648d == hVar.e() && this.f24649e.equals(hVar.c()) && this.f24650f == hVar.f();
    }

    @Override
    public boolean f() {
        return this.f24650f;
    }

    public int hashCode() {
        return ((((((((((this.f24645a.hashCode() ^ 1000003) * 1000003) ^ this.f24646b) * 1000003) ^ this.f24647c) * 1000003) ^ (this.f24648d ? 1231 : 1237)) * 1000003) ^ this.f24649e.hashCode()) * 1000003) ^ (this.f24650f ? 1231 : 1237);
    }

    public String toString() {
        return "TransformationInfo{getCropRect=" + this.f24645a + ", getRotationDegrees=" + this.f24646b + ", getTargetRotation=" + this.f24647c + ", hasCameraTransform=" + this.f24648d + ", getSensorToBufferTransform=" + this.f24649e + ", isMirroring=" + this.f24650f + "}";
    }
}
