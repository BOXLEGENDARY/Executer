package q2;

final class a<T> extends c<T> {

    private final Integer f22703a;

    private final T f22704b;

    private final d f22705c;

    a(Integer num, T t7, d dVar) {
        this.f22703a = num;
        if (t7 == null) {
            throw new NullPointerException("Null payload");
        }
        this.f22704b = t7;
        if (dVar == null) {
            throw new NullPointerException("Null priority");
        }
        this.f22705c = dVar;
    }

    @Override
    public Integer a() {
        return this.f22703a;
    }

    @Override
    public T b() {
        return this.f22704b;
    }

    @Override
    public d c() {
        return this.f22705c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        Integer num = this.f22703a;
        if (num != null ? num.equals(cVar.a()) : cVar.a() == null) {
            if (this.f22704b.equals(cVar.b()) && this.f22705c.equals(cVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f22703a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f22704b.hashCode()) * 1000003) ^ this.f22705c.hashCode();
    }

    public String toString() {
        return "Event{code=" + this.f22703a + ", payload=" + this.f22704b + ", priority=" + this.f22705c + "}";
    }
}
