package H;

import C.AbstractC0344o0;
import H.f;

final class a extends f.b {

    private final String f1475a;

    private final AbstractC0344o0 f1476b;

    a(String str, AbstractC0344o0 abstractC0344o0) {
        if (str == null) {
            throw new NullPointerException("Null cameraIdString");
        }
        this.f1475a = str;
        if (abstractC0344o0 == null) {
            throw new NullPointerException("Null cameraConfigId");
        }
        this.f1476b = abstractC0344o0;
    }

    @Override
    public AbstractC0344o0 b() {
        return this.f1476b;
    }

    @Override
    public String c() {
        return this.f1475a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f.b)) {
            return false;
        }
        f.b bVar = (f.b) obj;
        return this.f1475a.equals(bVar.c()) && this.f1476b.equals(bVar.b());
    }

    public int hashCode() {
        return ((this.f1475a.hashCode() ^ 1000003) * 1000003) ^ this.f1476b.hashCode();
    }

    public String toString() {
        return "CameraId{cameraIdString=" + this.f1475a + ", cameraConfigId=" + this.f1476b + "}";
    }
}
