package f6;

import V5.g;
import android.os.AsyncTask;
import h7.l;
import k7.h;
import w7.Jld.EZYiRMRTxKdo;

public class AsyncTaskC2446a extends AsyncTask<Void, Void, Void> implements g {

    public static g.a<InterfaceC0189a> f20518b = new b();

    private InterfaceC0189a f20519a;

    public interface InterfaceC0189a {
        void a(int i7);
    }

    public static class b implements g.a<InterfaceC0189a> {
        @Override
        public g a(InterfaceC0189a interfaceC0189a) {
            return new AsyncTaskC2446a(interfaceC0189a);
        }
    }

    public AsyncTaskC2446a(InterfaceC0189a interfaceC0189a) {
        this.f20519a = interfaceC0189a;
    }

    public static g b(InterfaceC0189a interfaceC0189a) {
        return f20518b.a(interfaceC0189a);
    }

    @Override
    public void a() {
        executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @Override
    public Void doInBackground(Void... voidArr) {
        h.j().m();
        l.a(EZYiRMRTxKdo.DpRALkdSMLcHi, "Unpacking complete");
        return null;
    }

    @Override
    public void onPostExecute(Void r22) {
        InterfaceC0189a interfaceC0189a = this.f20519a;
        if (interfaceC0189a != null) {
            interfaceC0189a.a(0);
        }
    }
}
