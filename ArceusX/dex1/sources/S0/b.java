package S0;

import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class b<D> {

    private int f6373a;

    private a<D> f6374b;

    private Context f6375c;

    private boolean f6376d = false;

    private boolean f6377e = false;

    private boolean f6378f = true;

    private boolean f6379g = false;

    private boolean f6380h = false;

    public interface a<D> {
        void a(b<D> bVar, D d7);
    }

    public b(Context context) {
        this.f6375c = context.getApplicationContext();
    }

    public void a() {
        this.f6377e = true;
        k();
    }

    public boolean b() {
        return l();
    }

    public void c() {
        this.f6380h = false;
    }

    public String d(D d7) {
        StringBuilder sb = new StringBuilder(64);
        if (d7 == null) {
            sb.append("null");
        } else {
            Class<?> cls = d7.getClass();
            sb.append(cls.getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(cls)));
            sb.append("}");
        }
        return sb.toString();
    }

    public void e() {
    }

    public void f(D d7) {
        a<D> aVar = this.f6374b;
        if (aVar != null) {
            aVar.a(this, d7);
        }
    }

    @Deprecated
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f6373a);
        printWriter.print(" mListener=");
        printWriter.println(this.f6374b);
        if (this.f6376d || this.f6379g || this.f6380h) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f6376d);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f6379g);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f6380h);
        }
        if (this.f6377e || this.f6378f) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f6377e);
            printWriter.print(" mReset=");
            printWriter.println(this.f6378f);
        }
    }

    public void h() {
        n();
    }

    public boolean i() {
        return this.f6377e;
    }

    public boolean j() {
        return this.f6376d;
    }

    protected void k() {
    }

    protected boolean l() {
        throw null;
    }

    public void m() {
        if (this.f6376d) {
            h();
        } else {
            this.f6379g = true;
        }
    }

    protected void n() {
    }

    protected void o() {
    }

    protected void p() {
        throw null;
    }

    protected void q() {
    }

    public void r(int i7, a<D> aVar) {
        if (this.f6374b != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        this.f6374b = aVar;
        this.f6373a = i7;
    }

    public void s() {
        o();
        this.f6378f = true;
        this.f6376d = false;
        this.f6377e = false;
        this.f6379g = false;
        this.f6380h = false;
    }

    public void t() {
        if (this.f6380h) {
            m();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        Class<?> cls = getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append(" id=");
        sb.append(this.f6373a);
        sb.append("}");
        return sb.toString();
    }

    public final void u() {
        this.f6376d = true;
        this.f6378f = false;
        this.f6377e = false;
        p();
    }

    public void v() {
        this.f6376d = false;
        q();
    }

    public void w(a<D> aVar) {
        a<D> aVar2 = this.f6374b;
        if (aVar2 == null) {
            throw new IllegalStateException("No listener register");
        }
        if (aVar2 != aVar) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.f6374b = null;
    }
}
