package Q;

import C.EnumC0350s;
import C.EnumC0352t;
import C.EnumC0354u;
import C.EnumC0356v;
import C.EnumC0358w;
import C.EnumC0360x;
import C.EnumC0362y;
import C.InterfaceC0364z;
import C.g1;

public class m implements InterfaceC0364z {

    private final InterfaceC0364z f3779a;

    private final g1 f3780b;

    private final long f3781c;

    public m(g1 g1Var, InterfaceC0364z interfaceC0364z) {
        this(interfaceC0364z, g1Var, -1L);
    }

    @Override
    public g1 b() {
        return this.f3780b;
    }

    @Override
    public long d() {
        InterfaceC0364z interfaceC0364z = this.f3779a;
        if (interfaceC0364z != null) {
            return interfaceC0364z.d();
        }
        long j7 = this.f3781c;
        if (j7 != -1) {
            return j7;
        }
        throw new IllegalStateException("No timestamp is available.");
    }

    @Override
    public EnumC0360x e() {
        InterfaceC0364z interfaceC0364z = this.f3779a;
        return interfaceC0364z != null ? interfaceC0364z.e() : EnumC0360x.UNKNOWN;
    }

    @Override
    public EnumC0362y f() {
        InterfaceC0364z interfaceC0364z = this.f3779a;
        return interfaceC0364z != null ? interfaceC0364z.f() : EnumC0362y.UNKNOWN;
    }

    @Override
    public EnumC0358w g() {
        InterfaceC0364z interfaceC0364z = this.f3779a;
        return interfaceC0364z != null ? interfaceC0364z.g() : EnumC0358w.f752d;
    }

    @Override
    public EnumC0354u h() {
        InterfaceC0364z interfaceC0364z = this.f3779a;
        return interfaceC0364z != null ? interfaceC0364z.h() : EnumC0354u.UNKNOWN;
    }

    @Override
    public EnumC0352t i() {
        InterfaceC0364z interfaceC0364z = this.f3779a;
        return interfaceC0364z != null ? interfaceC0364z.i() : EnumC0352t.UNKNOWN;
    }

    @Override
    public EnumC0350s k() {
        InterfaceC0364z interfaceC0364z = this.f3779a;
        return interfaceC0364z != null ? interfaceC0364z.k() : EnumC0350s.UNKNOWN;
    }

    @Override
    public EnumC0356v l() {
        InterfaceC0364z interfaceC0364z = this.f3779a;
        return interfaceC0364z != null ? interfaceC0364z.l() : EnumC0356v.UNKNOWN;
    }

    public m(g1 g1Var, long j7) {
        this(null, g1Var, j7);
    }

    private m(InterfaceC0364z interfaceC0364z, g1 g1Var, long j7) {
        this.f3779a = interfaceC0364z;
        this.f3780b = g1Var;
        this.f3781c = j7;
    }
}
