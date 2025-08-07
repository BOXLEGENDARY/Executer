package a4;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

final class G<TResult, TContinuationResult> implements InterfaceC1570g<TContinuationResult>, InterfaceC1569f, InterfaceC1568e, H {

    private final Executor f8299a;

    private final InterfaceC1573j f8300b;

    private final M f8301c;

    public G(Executor executor, InterfaceC1573j interfaceC1573j, M m7) {
        this.f8299a = executor;
        this.f8300b = interfaceC1573j;
        this.f8301c = m7;
    }

    @Override
    public final void a() {
        this.f8301c.t();
    }

    @Override
    public final void b(Task task) {
        this.f8299a.execute(new F(this, task));
    }

    @Override
    public final void onFailure(Exception exc) {
        this.f8301c.r(exc);
    }

    @Override
    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.f8301c.s(tcontinuationresult);
    }
}
