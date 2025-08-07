package l2;

public class j extends k2.b {

    private com.birbit.android.jobqueue.f f21776d;

    private Object f21777e;

    private int f21778f;

    public j() {
        super(k2.g.RUN_JOB_RESULT);
    }

    @Override
    protected void a() {
        this.f21776d = null;
    }

    public com.birbit.android.jobqueue.f c() {
        return this.f21776d;
    }

    public int d() {
        return this.f21778f;
    }

    public Object e() {
        return this.f21777e;
    }

    public void f(com.birbit.android.jobqueue.f fVar) {
        this.f21776d = fVar;
    }

    public void g(int i7) {
        this.f21778f = i7;
    }

    public void h(Object obj) {
        this.f21777e = obj;
    }
}
