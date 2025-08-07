package ha;

import android.os.AsyncTask;
import h7.l;
import ha.C2697c;
import r6.c;
import r6.d;

public abstract class AbstractAsyncTaskC2695a extends AsyncTask<Void, Void, C2704j> {

    protected C2704j f22510a;

    protected String f22511b;

    protected C2697c.a[] f22512c;

    protected InterfaceC2706l f22513d;

    protected String f22514e = null;

    protected String f22515f = null;

    protected d<C2704j> f22516g;

    public AbstractAsyncTaskC2695a(String str, InterfaceC2706l interfaceC2706l, C2697c.a[] aVarArr) {
        this.f22513d = interfaceC2706l;
        this.f22511b = str;
        this.f22512c = aVarArr;
        g(new c());
    }

    @Override
    public C2704j doInBackground(Void... voidArr) throws InterruptedException {
        this.f22510a = C2697c.j(this.f22511b, this.f22514e, this.f22512c, this.f22515f);
        do {
            d<C2704j> dVar = this.f22516g;
            if (dVar == null || !dVar.d(this.f22510a) || !this.f22516g.b()) {
                return this.f22510a;
            }
            if (this.f22516g.c() > 0) {
                try {
                    Thread.sleep(this.f22516g.c());
                } catch (InterruptedException e7) {
                    l.g("rbx.httprequest", "Thread sleep error: " + e7.getMessage());
                }
            }
            this.f22510a = C2697c.j(this.f22511b, this.f22514e, this.f22512c, this.f22515f);
            this.f22516g.a();
            f();
        } while (!c());
        return null;
    }

    public void b() {
        executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public boolean c() {
        return isCancelled();
    }

    @Override
    public void onPostExecute(C2704j c2704j) {
        super.onPostExecute(c2704j);
        InterfaceC2706l interfaceC2706l = this.f22513d;
        if (interfaceC2706l != null) {
            interfaceC2706l.a(this.f22510a);
        }
    }

    @Override
    public void onProgressUpdate(Void... voidArr) {
        super.onProgressUpdate(voidArr);
        InterfaceC2706l interfaceC2706l = this.f22513d;
        if (interfaceC2706l != null) {
            interfaceC2706l.b(this.f22510a);
        }
    }

    public void f() {
        publishProgress(new Void[0]);
    }

    public void g(d<C2704j> dVar) {
        this.f22516g = dVar;
    }
}
