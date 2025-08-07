package K4;

final class h<T> extends d<T> {

    private final T f1911d;

    h(T t7) {
        this.f1911d = t7;
    }

    @Override
    public T b() {
        return this.f1911d;
    }

    @Override
    public boolean c() {
        return true;
    }

    @Override
    public T e(T t7) {
        g.h(t7, "use Optional.orNull() instead of Optional.or(null)");
        return this.f1911d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f1911d.equals(((h) obj).f1911d);
        }
        return false;
    }

    public int hashCode() {
        return this.f1911d.hashCode() + 1502476572;
    }

    public String toString() {
        String strValueOf = String.valueOf(this.f1911d);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 13);
        sb.append("Optional.of(");
        sb.append(strValueOf);
        sb.append(")");
        return sb.toString();
    }
}
