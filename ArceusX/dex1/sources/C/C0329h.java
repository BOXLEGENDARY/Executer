package C;

final class C0329h extends AbstractC0344o0 {

    private final Object f599a;

    C0329h(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null value");
        }
        this.f599a = obj;
    }

    @Override
    public Object b() {
        return this.f599a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0344o0) {
            return this.f599a.equals(((AbstractC0344o0) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f599a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Identifier{value=" + this.f599a + "}";
    }
}
