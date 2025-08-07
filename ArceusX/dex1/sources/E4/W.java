package E4;

public final class W implements Z, V {

    private static final Object f1102c = new Object();

    private volatile Z f1103a;

    private volatile Object f1104b = f1102c;

    private W(Z z7) {
        this.f1103a = z7;
    }

    public static V a(Z z7) {
        return z7 instanceof V ? (V) z7 : new W(z7);
    }

    public static Z b(Z z7) {
        z7.getClass();
        return z7 instanceof W ? z7 : new W(z7);
    }

    @Override
    public final Object zza() {
        Object objZza = this.f1104b;
        Object obj = f1102c;
        if (objZza == obj) {
            synchronized (this) {
                try {
                    objZza = this.f1104b;
                    if (objZza == obj) {
                        objZza = this.f1103a.zza();
                        Object obj2 = this.f1104b;
                        if (obj2 != obj && obj2 != objZza) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + objZza + ". This is likely due to a circular dependency.");
                        }
                        this.f1104b = objZza;
                        this.f1103a = null;
                    }
                } finally {
                }
            }
        }
        return objZza;
    }
}
