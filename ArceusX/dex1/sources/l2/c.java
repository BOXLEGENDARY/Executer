package l2;

import com.birbit.android.jobqueue.CancelResult;

public class c extends k2.b {

    private f2.f f21762d;

    private String[] f21763e;

    private CancelResult.AsyncCancelCallback f21764f;

    public c() {
        super(k2.g.CANCEL);
    }

    @Override
    protected void a() {
    }

    public CancelResult.AsyncCancelCallback c() {
        return this.f21764f;
    }

    public f2.f d() {
        return this.f21762d;
    }

    public String[] e() {
        return this.f21763e;
    }
}
