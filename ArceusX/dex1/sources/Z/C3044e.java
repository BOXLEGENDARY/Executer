package z;

import S5.Cg.XjqcfAbdbc;
import android.graphics.Rect;
import android.util.Size;
import z.u0;

final class C3044e extends u0.a {

    private final Size f24629a;

    private final Rect f24630b;

    private final C.J f24631c;

    private final int f24632d;

    private final boolean f24633e;

    C3044e(Size size, Rect rect, C.J j7, int i7, boolean z7) {
        if (size == null) {
            throw new NullPointerException("Null inputSize");
        }
        this.f24629a = size;
        if (rect == null) {
            throw new NullPointerException(XjqcfAbdbc.COcdo);
        }
        this.f24630b = rect;
        this.f24631c = j7;
        this.f24632d = i7;
        this.f24633e = z7;
    }

    @Override
    public C.J a() {
        return this.f24631c;
    }

    @Override
    public Rect b() {
        return this.f24630b;
    }

    @Override
    public Size c() {
        return this.f24629a;
    }

    @Override
    public boolean d() {
        return this.f24633e;
    }

    @Override
    public int e() {
        return this.f24632d;
    }

    public boolean equals(Object obj) {
        C.J j7;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u0.a)) {
            return false;
        }
        u0.a aVar = (u0.a) obj;
        return this.f24629a.equals(aVar.c()) && this.f24630b.equals(aVar.b()) && ((j7 = this.f24631c) != null ? j7.equals(aVar.a()) : aVar.a() == null) && this.f24632d == aVar.e() && this.f24633e == aVar.d();
    }

    public int hashCode() {
        int iHashCode = (((this.f24629a.hashCode() ^ 1000003) * 1000003) ^ this.f24630b.hashCode()) * 1000003;
        C.J j7 = this.f24631c;
        return ((((iHashCode ^ (j7 == null ? 0 : j7.hashCode())) * 1000003) ^ this.f24632d) * 1000003) ^ (this.f24633e ? 1231 : 1237);
    }

    public String toString() {
        return "CameraInputInfo{inputSize=" + this.f24629a + ", inputCropRect=" + this.f24630b + ", cameraInternal=" + this.f24631c + ", rotationDegrees=" + this.f24632d + ", mirroring=" + this.f24633e + "}";
    }
}
