package C;

import C.InterfaceC0336k0;
import java.util.List;

final class C0325f extends InterfaceC0336k0.b {

    private final int f578a;

    private final int f579b;

    private final List<InterfaceC0336k0.a> f580c;

    private final List<InterfaceC0336k0.c> f581d;

    C0325f(int i7, int i8, List<InterfaceC0336k0.a> list, List<InterfaceC0336k0.c> list2) {
        this.f578a = i7;
        this.f579b = i8;
        if (list == null) {
            throw new NullPointerException("Null audioProfiles");
        }
        this.f580c = list;
        if (list2 == null) {
            throw new NullPointerException("Null videoProfiles");
        }
        this.f581d = list2;
    }

    @Override
    public int a() {
        return this.f578a;
    }

    @Override
    public int b() {
        return this.f579b;
    }

    @Override
    public List<InterfaceC0336k0.a> c() {
        return this.f580c;
    }

    @Override
    public List<InterfaceC0336k0.c> d() {
        return this.f581d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InterfaceC0336k0.b)) {
            return false;
        }
        InterfaceC0336k0.b bVar = (InterfaceC0336k0.b) obj;
        return this.f578a == bVar.a() && this.f579b == bVar.b() && this.f580c.equals(bVar.c()) && this.f581d.equals(bVar.d());
    }

    public int hashCode() {
        return ((((((this.f578a ^ 1000003) * 1000003) ^ this.f579b) * 1000003) ^ this.f580c.hashCode()) * 1000003) ^ this.f581d.hashCode();
    }

    public String toString() {
        return "ImmutableEncoderProfilesProxy{defaultDurationSeconds=" + this.f578a + ", recommendedFileFormat=" + this.f579b + ", audioProfiles=" + this.f580c + ", videoProfiles=" + this.f581d + "}";
    }
}
