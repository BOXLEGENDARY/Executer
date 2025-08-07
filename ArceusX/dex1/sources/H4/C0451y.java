package H4;

public final class C0451y implements D {

    private static final Object f1629c = new Object();

    private volatile D f1630a;

    private volatile Object f1631b = f1629c;

    private C0451y(D d7) {
        this.f1630a = d7;
    }

    public static D b(D d7) {
        return d7 instanceof C0451y ? d7 : new C0451y(d7);
    }

    @Override
    public final Object a() {
        Object objA = this.f1631b;
        Object obj = f1629c;
        if (objA == obj) {
            synchronized (this) {
                try {
                    objA = this.f1631b;
                    if (objA == obj) {
                        objA = this.f1630a.a();
                        Object obj2 = this.f1631b;
                        if (obj2 != obj && obj2 != objA) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + objA + ". This is likely due to a circular dependency.");
                        }
                        this.f1631b = objA;
                        this.f1630a = null;
                    }
                } finally {
                }
            }
        }
        return objA;
    }
}
