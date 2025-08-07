package l2;

public class b extends k2.b {

    private int f21757d;

    private int f21758e;

    private boolean f21759f;

    private com.birbit.android.jobqueue.e f21760g;

    private Throwable f21761h;

    public b() {
        super(k2.g.CALLBACK);
    }

    @Override
    protected void a() {
        this.f21760g = null;
        this.f21761h = null;
    }

    public com.birbit.android.jobqueue.e c() {
        return this.f21760g;
    }

    public int d() {
        return this.f21758e;
    }

    public Throwable e() {
        return this.f21761h;
    }

    public int f() {
        return this.f21757d;
    }

    public boolean g() {
        return this.f21759f;
    }

    public void h(com.birbit.android.jobqueue.e eVar, int i7) {
        this.f21757d = i7;
        this.f21760g = eVar;
    }

    public void i(com.birbit.android.jobqueue.e eVar, int i7, int i8) {
        this.f21757d = i7;
        this.f21758e = i8;
        this.f21760g = eVar;
    }

    public void j(com.birbit.android.jobqueue.e eVar, int i7, boolean z7, Throwable th) {
        this.f21757d = i7;
        this.f21759f = z7;
        this.f21760g = eVar;
        this.f21761h = th;
    }
}
