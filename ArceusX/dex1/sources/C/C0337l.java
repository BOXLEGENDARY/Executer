package C;

import C.b1;

final class C0337l extends b1.a {

    private final Throwable f629a;

    C0337l(Throwable th) {
        if (th == null) {
            throw new NullPointerException("Null error");
        }
        this.f629a = th;
    }

    @Override
    public Throwable a() {
        return this.f629a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b1.a) {
            return this.f629a.equals(((b1.a) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.f629a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ErrorWrapper{error=" + this.f629a + "}";
    }
}
