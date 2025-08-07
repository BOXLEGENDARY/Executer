package H4;

public final class A implements InterfaceC0452z {

    private final Object f1579a;

    private A(Object obj) {
        this.f1579a = obj;
    }

    public static InterfaceC0452z b(Object obj) {
        if (obj != null) {
            return new A(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override
    public final Object a() {
        return this.f1579a;
    }
}
