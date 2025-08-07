package l2;

import com.birbit.android.jobqueue.CancelResult;

public class d extends k2.b {

    CancelResult.AsyncCancelCallback f21765d;

    CancelResult f21766e;

    public d() {
        super(k2.g.CANCEL_RESULT_CALLBACK);
    }

    @Override
    protected void a() {
        this.f21766e = null;
        this.f21765d = null;
    }

    public CancelResult.AsyncCancelCallback c() {
        return this.f21765d;
    }

    public CancelResult d() {
        return this.f21766e;
    }

    public void e(CancelResult.AsyncCancelCallback asyncCancelCallback, CancelResult cancelResult) {
        this.f21765d = asyncCancelCallback;
        this.f21766e = cancelResult;
    }
}
