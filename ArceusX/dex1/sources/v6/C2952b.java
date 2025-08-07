package v6;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class C2952b extends Z5.b {

    private d f24181f;

    class a implements Runnable {
        a() {
        }

        @Override
        public void run() {
            C2952b.f().b(new C0235b());
        }
    }

    private class C0235b implements Z5.c {

        class a extends AsyncTask<Void, Void, Void> {

            final Z5.a f24184a;

            a(Z5.a aVar) {
                this.f24184a = aVar;
            }

            @Override
            public Void doInBackground(Void... voidArr) throws IOException {
                Socket socket = C2952b.this.f24181f.f24189c;
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (IOException e7) {
                        Log.w("InfluxV2Queue", "[Close-connection-item] Error closing socket: " + e7.getMessage());
                    }
                    C2952b.this.f24181f.f24189c = null;
                }
                C2952b.this.f24181f = null;
                return null;
            }

            @Override
            public void onPostExecute(Void r1) {
                Z5.a aVar = this.f24184a;
                if (aVar != null) {
                    aVar.a();
                }
            }
        }

        @Override
        public void a(Z5.a aVar) {
            if (C2952b.this.f24181f == null) {
                return;
            }
            Log.d("InfluxV2Queue", "fireAction: Close the existing socket...");
            new a(aVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }

        @Override
        public boolean b() {
            return true;
        }

        private C0235b() {
        }
    }

    private static class c {

        static final C2952b f24186a = new C2952b();
    }

    public class d {

        public String f24187a;

        public int f24188b;

        public Socket f24189c;

        public int f24190d;

        public d() {
        }
    }

    public static C2952b f() {
        return c.f24186a;
    }

    public d g() {
        d dVar = this.f24181f;
        if (dVar != null && dVar.f24189c != null) {
            return dVar;
        }
        String strO0 = j6.d.a().O0();
        int iX1 = j6.d.a().x1();
        int iR1 = j6.d.a().r1();
        d dVar2 = new d();
        this.f24181f = dVar2;
        dVar2.f24187a = strO0;
        dVar2.f24188b = iX1;
        dVar2.f24190d = iR1;
        try {
            Log.d("InfluxV2Queue", "getSocketInfo: Create a socket to " + strO0 + ":" + iX1 + "...");
            Socket socket = new Socket(InetAddress.getByName(strO0), iX1);
            d dVar3 = this.f24181f;
            dVar3.f24189c = socket;
            if (dVar3.f24190d > 0) {
                Handler handler = new Handler(Looper.getMainLooper());
                Log.d("InfluxV2Queue", "Schedule a special close-connection item with delay=" + this.f24181f.f24190d + "s...");
                handler.postDelayed(new a(), ((long) this.f24181f.f24190d) * 1000);
            }
            return this.f24181f;
        } catch (IOException e7) {
            Log.w("InfluxV2Queue", "Error creating the socket: " + e7.getMessage());
            return this.f24181f;
        }
    }
}
