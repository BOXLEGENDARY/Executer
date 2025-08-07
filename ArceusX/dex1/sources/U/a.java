package U;

import C.InterfaceC0336k0;
import com.roblox.client.realtime.WEmv.tAjeAKSIqDqzNP;
import java.util.List;

final class a extends g {

    private final int f7473a;

    private final int f7474b;

    private final List<InterfaceC0336k0.a> f7475c;

    private final List<InterfaceC0336k0.c> f7476d;

    private final InterfaceC0336k0.a f7477e;

    private final InterfaceC0336k0.c f7478f;

    a(int i7, int i8, List<InterfaceC0336k0.a> list, List<InterfaceC0336k0.c> list2, InterfaceC0336k0.a aVar, InterfaceC0336k0.c cVar) {
        this.f7473a = i7;
        this.f7474b = i8;
        if (list == null) {
            throw new NullPointerException("Null audioProfiles");
        }
        this.f7475c = list;
        if (list2 == null) {
            throw new NullPointerException("Null videoProfiles");
        }
        this.f7476d = list2;
        this.f7477e = aVar;
        if (cVar == null) {
            throw new NullPointerException("Null defaultVideoProfile");
        }
        this.f7478f = cVar;
    }

    @Override
    public int a() {
        return this.f7473a;
    }

    @Override
    public int b() {
        return this.f7474b;
    }

    @Override
    public List<InterfaceC0336k0.a> c() {
        return this.f7475c;
    }

    @Override
    public List<InterfaceC0336k0.c> d() {
        return this.f7476d;
    }

    public boolean equals(Object obj) {
        InterfaceC0336k0.a aVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f7473a == gVar.a() && this.f7474b == gVar.b() && this.f7475c.equals(gVar.c()) && this.f7476d.equals(gVar.d()) && ((aVar = this.f7477e) != null ? aVar.equals(gVar.j()) : gVar.j() == null) && this.f7478f.equals(gVar.k());
    }

    public int hashCode() {
        int iHashCode = (((((((this.f7473a ^ 1000003) * 1000003) ^ this.f7474b) * 1000003) ^ this.f7475c.hashCode()) * 1000003) ^ this.f7476d.hashCode()) * 1000003;
        InterfaceC0336k0.a aVar = this.f7477e;
        return ((iHashCode ^ (aVar == null ? 0 : aVar.hashCode())) * 1000003) ^ this.f7478f.hashCode();
    }

    @Override
    public InterfaceC0336k0.a j() {
        return this.f7477e;
    }

    @Override
    public InterfaceC0336k0.c k() {
        return this.f7478f;
    }

    public String toString() {
        return "VideoValidatedEncoderProfilesProxy{defaultDurationSeconds=" + this.f7473a + ", recommendedFileFormat=" + this.f7474b + ", audioProfiles=" + this.f7475c + ", videoProfiles=" + this.f7476d + ", defaultAudioProfile=" + this.f7477e + tAjeAKSIqDqzNP.VBrpCpsYDnZJAVh + this.f7478f + "}";
    }
}
