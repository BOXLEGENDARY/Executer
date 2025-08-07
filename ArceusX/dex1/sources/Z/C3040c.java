package z;

import z.AbstractC3062q;

final class C3040c extends AbstractC3062q.a {

    private final int f24611a;

    private final Throwable f24612b;

    C3040c(int i7, Throwable th) {
        this.f24611a = i7;
        this.f24612b = th;
    }

    @Override
    public Throwable c() {
        return this.f24612b;
    }

    @Override
    public int d() {
        return this.f24611a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3062q.a)) {
            return false;
        }
        AbstractC3062q.a aVar = (AbstractC3062q.a) obj;
        if (this.f24611a == aVar.d()) {
            Throwable th = this.f24612b;
            if (th == null) {
                if (aVar.c() == null) {
                    return true;
                }
            } else if (th.equals(aVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i7 = (this.f24611a ^ 1000003) * 1000003;
        Throwable th = this.f24612b;
        return i7 ^ (th == null ? 0 : th.hashCode());
    }

    public String toString() {
        return "StateError{code=" + this.f24611a + ", cause=" + this.f24612b + "}";
    }
}
