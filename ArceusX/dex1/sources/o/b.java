package O;

import S5.Cg.XjqcfAbdbc;
import android.graphics.Rect;
import android.util.Size;
import java.util.UUID;

final class b extends f {

    private final UUID f2666a;

    private final int f2667b;

    private final int f2668c;

    private final Rect f2669d;

    private final Size f2670e;

    private final int f2671f;

    private final boolean f2672g;

    private final boolean f2673h;

    b(UUID uuid, int i7, int i8, Rect rect, Size size, int i9, boolean z7, boolean z8) {
        if (uuid == null) {
            throw new NullPointerException("Null getUuid");
        }
        this.f2666a = uuid;
        this.f2667b = i7;
        this.f2668c = i8;
        if (rect == null) {
            throw new NullPointerException("Null getCropRect");
        }
        this.f2669d = rect;
        if (size == null) {
            throw new NullPointerException("Null getSize");
        }
        this.f2670e = size;
        this.f2671f = i9;
        this.f2672g = z7;
        this.f2673h = z8;
    }

    @Override
    public Rect a() {
        return this.f2669d;
    }

    @Override
    public int b() {
        return this.f2668c;
    }

    @Override
    public int c() {
        return this.f2671f;
    }

    @Override
    public Size d() {
        return this.f2670e;
    }

    @Override
    public int e() {
        return this.f2667b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f2666a.equals(fVar.f()) && this.f2667b == fVar.e() && this.f2668c == fVar.b() && this.f2669d.equals(fVar.a()) && this.f2670e.equals(fVar.d()) && this.f2671f == fVar.c() && this.f2672g == fVar.g() && this.f2673h == fVar.k();
    }

    @Override
    UUID f() {
        return this.f2666a;
    }

    @Override
    public boolean g() {
        return this.f2672g;
    }

    public int hashCode() {
        return ((((((((((((((this.f2666a.hashCode() ^ 1000003) * 1000003) ^ this.f2667b) * 1000003) ^ this.f2668c) * 1000003) ^ this.f2669d.hashCode()) * 1000003) ^ this.f2670e.hashCode()) * 1000003) ^ this.f2671f) * 1000003) ^ (this.f2672g ? 1231 : 1237)) * 1000003) ^ (this.f2673h ? 1231 : 1237);
    }

    @Override
    public boolean k() {
        return this.f2673h;
    }

    public String toString() {
        return "OutConfig{getUuid=" + this.f2666a + ", getTargets=" + this.f2667b + ", getFormat=" + this.f2668c + XjqcfAbdbc.yxVeocUAiKf + this.f2669d + ", getSize=" + this.f2670e + ", getRotationDegrees=" + this.f2671f + ", isMirroring=" + this.f2672g + ", shouldRespectInputCropRect=" + this.f2673h + "}";
    }
}
