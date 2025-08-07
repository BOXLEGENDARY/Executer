package V5;

import android.os.Handler;
import android.os.Message;
import h7.l;
import java.util.Iterator;
import java.util.Vector;

public abstract class d extends Handler {

    private String f7558a;

    private int f7559b = 0;

    private Vector<a> f7560c = new Vector<>();

    public interface a {
        void start();
    }

    public d(String str) {
        this.f7558a = str;
    }

    public void a(a aVar) {
        this.f7560c.add(aVar);
        this.f7559b++;
    }

    public abstract void b();

    protected void c() {
        Iterator<a> it = this.f7560c.iterator();
        while (it.hasNext()) {
            it.next().start();
        }
    }

    public void d(String str) {
        sendMessage(obtainMessage(200, str));
    }

    public void e() {
        sendMessage(obtainMessage(100));
    }

    @Override
    public void handleMessage(Message message) {
        int i7 = message.what;
        if (i7 == 100 && this.f7559b > 0) {
            l.i("rbx.execute", "MTCH.handleMessage() group:" + this.f7558a + " START size:" + this.f7559b);
            c();
        } else if (i7 == 200) {
            this.f7559b--;
            l.i("rbx.execute", "MTCH.handleMessage() task:" + message.obj + " COMPLETE size:" + this.f7559b);
        }
        if (this.f7559b <= 0) {
            l.i("rbx.execute", "MTCH.handleMessage() group:" + this.f7558a + " complete");
            b();
        }
    }
}
