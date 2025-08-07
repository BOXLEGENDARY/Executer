package H4;

import com.roblox.engine.jni.autovalue.le.wtzgsqRsIZB;
import java.util.List;

final class r extends AbstractC0445s {

    final transient int f1617v;

    final transient int f1618w;

    final AbstractC0445s f1619y;

    r(AbstractC0445s abstractC0445s, int i7, int i8) {
        this.f1619y = abstractC0445s;
        this.f1617v = i7;
        this.f1618w = i8;
    }

    @Override
    final int e() {
        return this.f1619y.g() + this.f1617v + this.f1618w;
    }

    @Override
    final int g() {
        return this.f1619y.g() + this.f1617v;
    }

    @Override
    public final Object get(int i7) {
        C0440m.a(i7, this.f1618w, wtzgsqRsIZB.vLiawdmHVd);
        return this.f1619y.get(i7 + this.f1617v);
    }

    @Override
    final Object[] j() {
        return this.f1619y.j();
    }

    @Override
    public final AbstractC0445s subList(int i7, int i8) {
        C0440m.c(i7, i8, this.f1618w);
        int i9 = this.f1617v;
        return this.f1619y.subList(i7 + i9, i8 + i9);
    }

    @Override
    public final int size() {
        return this.f1618w;
    }

    @Override
    public final List subList(int i7, int i8) {
        return subList(i7, i8);
    }
}
