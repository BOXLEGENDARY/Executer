package S;

import S.C1230l;
import android.util.Size;
import com.roblox.client.realtime.WEmv.tAjeAKSIqDqzNP;
import e2.vb.oyfFwvPUKctyaG;
import java.util.List;

final class C1224f extends C1230l.b {

    private final int f6287j;

    private final String f6288k;

    private final List<Size> f6289l;

    C1224f(int i7, String str, List<Size> list) {
        this.f6287j = i7;
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f6288k = str;
        if (list == null) {
            throw new NullPointerException(oyfFwvPUKctyaG.AbzmrWLxutmXOaW);
        }
        this.f6289l = list;
    }

    @Override
    public String c() {
        return this.f6288k;
    }

    @Override
    public List<Size> d() {
        return this.f6289l;
    }

    @Override
    public int e() {
        return this.f6287j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1230l.b)) {
            return false;
        }
        C1230l.b bVar = (C1230l.b) obj;
        return this.f6287j == bVar.e() && this.f6288k.equals(bVar.c()) && this.f6289l.equals(bVar.d());
    }

    public int hashCode() {
        return ((((this.f6287j ^ 1000003) * 1000003) ^ this.f6288k.hashCode()) * 1000003) ^ this.f6289l.hashCode();
    }

    public String toString() {
        return tAjeAKSIqDqzNP.cmJaqpuMhoeLsX + this.f6287j + ", name=" + this.f6288k + ", typicalSizes=" + this.f6289l + "}";
    }
}
