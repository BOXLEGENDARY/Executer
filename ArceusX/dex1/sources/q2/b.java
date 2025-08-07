package q2;

public final class b {

    private final String f22706a;

    private b(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f22706a = str;
    }

    public static b b(String str) {
        return new b(str);
    }

    public String a() {
        return this.f22706a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f22706a.equals(((b) obj).f22706a);
        }
        return false;
    }

    public int hashCode() {
        return this.f22706a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f22706a + "\"}";
    }
}
