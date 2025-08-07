package J8;

public final class m implements C9.d<String> {
    private final com.withpersona.sdk2.inquiry.internal.network.b a;

    public m(com.withpersona.sdk2.inquiry.internal.network.b bVar) {
        this.a = bVar;
    }

    public static m a(com.withpersona.sdk2.inquiry.internal.network.b bVar) {
        return new m(bVar);
    }

    public static String c(com.withpersona.sdk2.inquiry.internal.network.b bVar) {
        return (String) C9.g.d(bVar.getServerEndpoint());
    }

    public String get() {
        return c(this.a);
    }
}
