package N3;

final class C0536g {

    private final Object f2609a;

    private final Object f2610b;

    private final Object f2611c;

    C0536g(Object obj, Object obj2, Object obj3) {
        this.f2609a = obj;
        this.f2610b = obj2;
        this.f2611c = obj3;
    }

    final IllegalArgumentException a() {
        Object obj = this.f2611c;
        Object obj2 = this.f2610b;
        Object obj3 = this.f2609a;
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(obj3) + "=" + String.valueOf(obj2) + " and " + String.valueOf(obj3) + "=" + String.valueOf(obj));
    }
}
