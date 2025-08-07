package j3;

import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import l3.AbstractC2535j;
import l3.C2536k;
import m3.C2581l;
import n3.C2651i;
import q3.C2732a;

public final class RunnableC2495d implements Runnable {

    private static final C2732a f21131i = new C2732a("RevokeAccessOperation", new String[0]);

    private final String f21132d;

    private final C2581l f21133e = new C2581l(null);

    public RunnableC2495d(String str) {
        this.f21132d = C2651i.f(str);
    }

    public static AbstractC2535j a(String str) {
        if (str == null) {
            return C2536k.a(new Status(4), null);
        }
        RunnableC2495d runnableC2495d = new RunnableC2495d(str);
        new Thread(runnableC2495d).start();
        return runnableC2495d.f21133e;
    }

    @Override
    public final void run() throws IOException {
        Status status = Status.f14054A;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.f21132d).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f14060y;
            } else {
                f21131i.b("Unable to revoke access!", new Object[0]);
            }
            f21131i.a("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e7) {
            f21131i.b("IOException when revoking access: ".concat(String.valueOf(e7.toString())), new Object[0]);
        } catch (Exception e8) {
            f21131i.b("Exception when revoking access: ".concat(String.valueOf(e8.toString())), new Object[0]);
        }
        this.f21133e.f(status);
    }
}
