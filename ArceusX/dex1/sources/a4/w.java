package a4;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

final class w<TResult, TContinuationResult> implements InterfaceC1570g<TContinuationResult>, InterfaceC1569f, InterfaceC1568e, H {

    private final Executor f8337a;

    private final InterfaceC1566c f8338b;

    private final M f8339c;

    public w(Executor executor, InterfaceC1566c interfaceC1566c, M m7) {
        this.f8337a = executor;
        this.f8338b = interfaceC1566c;
        this.f8339c = m7;
    }

    @Override
    public final void a() {
        this.f8339c.t();
    }

    @Override
    public final void b(Task task) {
        this.f8337a.execute(new v(this, task));
    }

    @Override
    public final void onFailure(Exception exc) {
        this.f8339c.r(exc);
    }

    @Override
    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.f8339c.s(tcontinuationresult);
    }
}
