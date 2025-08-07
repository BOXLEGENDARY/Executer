package C;

import E.h;
import android.hardware.camera2.CaptureResult;

public interface InterfaceC0364z {

    public static final class a implements InterfaceC0364z {
        public static InterfaceC0364z c() {
            return new a();
        }

        @Override
        public g1 b() {
            return g1.b();
        }

        @Override
        public long d() {
            return -1L;
        }

        @Override
        public EnumC0360x e() {
            return EnumC0360x.UNKNOWN;
        }

        @Override
        public EnumC0362y f() {
            return EnumC0362y.UNKNOWN;
        }

        @Override
        public EnumC0358w g() {
            return EnumC0358w.f752d;
        }

        @Override
        public EnumC0354u h() {
            return EnumC0354u.UNKNOWN;
        }

        @Override
        public EnumC0352t i() {
            return EnumC0352t.UNKNOWN;
        }

        @Override
        public CaptureResult j() {
            return null;
        }

        @Override
        public EnumC0350s k() {
            return EnumC0350s.UNKNOWN;
        }

        @Override
        public EnumC0356v l() {
            return EnumC0356v.UNKNOWN;
        }
    }

    default void a(h.b bVar) {
        bVar.g(f());
    }

    g1 b();

    long d();

    EnumC0360x e();

    EnumC0362y f();

    EnumC0358w g();

    EnumC0354u h();

    EnumC0352t i();

    default CaptureResult j() {
        return null;
    }

    EnumC0350s k();

    EnumC0356v l();
}
