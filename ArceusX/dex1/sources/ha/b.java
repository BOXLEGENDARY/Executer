package ha;

import E6.h;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import backtraceio.library.events.OnBeforeSendEventListener;
import backtraceio.library.models.BacktraceData;
import backtraceio.library.models.BacktraceExceptionHandler;
import backtraceio.library.watchdog.BacktraceWatchdogTimeoutException;
import backtraceio.library.watchdog.OnApplicationNotRespondingEvent;
import com.roblox.client.C2374w;
import com.roblox.client.a0;
import com.roblox.engine.jni.NativeGLInterface;
import h7.l;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.UUID;

public class b {

    public y1.a f2074a;

    private UUID f2075b;

    class a extends ArrayList<String> {

        final String f2076d;

        a(String str) {
            this.f2076d = str;
            add(str);
        }
    }

    private static class C0031b implements OnApplicationNotRespondingEvent {

        private final y1.a f2078a;

        public C0031b(y1.a aVar) {
            this.f2078a = aVar;
        }

        private static String a(boolean z7) {
            return a0.k0() ? z7 ? "Quest-Backtrace-ANRException-Sent" : "Quest-Backtrace-ANRException-NotSent" : z7 ? "Android-Backtrace-ANRException-Sent" : "Android-Backtrace-ANRException-NotSent";
        }

        private boolean b() {
            return ((int) (Math.random() * 100.0d)) < j6.d.a().k0();
        }

        private void c(boolean z7) {
            h.b().p(a(z7));
            if (a0.b0()) {
                return;
            }
            h.b().p(a(z7) + "-Channel-" + a0.T());
        }

        @Override
        public void onEvent(BacktraceWatchdogTimeoutException backtraceWatchdogTimeoutException) {
            l.a("rbx.backtrace", "OnApplicationNotRespondingEvent()");
            String[] activeShaders = NativeGLInterface.getActiveShaders();
            if (activeShaders != null) {
                for (int i7 = 0; i7 < activeShaders.length; i7++) {
                    String str = activeShaders[i7];
                    if (str != null && !str.isEmpty()) {
                        this.f2078a.getAttributes().put(String.format("GfxActiveShader%d", Integer.valueOf(i7)), activeShaders[i7]);
                    }
                }
            }
            if (!b()) {
                c(false);
            } else {
                c(true);
                this.f2078a.c(backtraceWatchdogTimeoutException);
            }
        }
    }

    private static class c {

        static final b f2079a = new b();
    }

    public static class d implements Thread.UncaughtExceptionHandler {

        private final Thread.UncaughtExceptionHandler f2080a = Thread.getDefaultUncaughtExceptionHandler();

        private final Thread.UncaughtExceptionHandler f2081b;

        public d(y1.a aVar) {
            BacktraceExceptionHandler.enable(aVar);
            this.f2081b = Thread.getDefaultUncaughtExceptionHandler();
        }

        private static String a(boolean z7) {
            return a0.k0() ? z7 ? "Quest-Backtrace-UnhandledException-Sent" : "Quest-Backtrace-UnhandledException-NotSent" : z7 ? "Android-Backtrace-UnhandledException-Sent" : "Android-Backtrace-UnhandledException-NotSent";
        }

        private boolean b(Throwable th) {
            return this.f2081b != null && (th instanceof Exception);
        }

        private boolean c() {
            return ((int) (Math.random() * 100.0d)) < j6.d.a().N1();
        }

        private void d(boolean z7) {
            h.b().p(a(z7));
        }

        private boolean e(Throwable th) {
            return Build.VERSION.SDK_INT == 33 && "android.app.RemoteServiceException$CannotDeliverBroadcastException".equals(th.getClass().getName());
        }

        @Override
        public void uncaughtException(Thread thread, Throwable th) {
            if (e(th)) {
                l.a("rbx.backtrace", "Suppressing known exception " + th.getClass().getName());
                return;
            }
            if (c() && b(th)) {
                l.a("rbx.backtrace", "uncaughtException() using: " + this.f2081b);
                d(true);
                this.f2081b.uncaughtException(thread, th);
                return;
            }
            l.a("rbx.backtrace", "uncaughtException() using: " + this.f2080a);
            if (this.f2080a != null) {
                d(false);
                this.f2080a.uncaughtException(thread, th);
            }
        }
    }

    private void b(Context context) throws IOException {
        try {
            Process processStart = new ProcessBuilder("logcat", "-t", j6.d.a().F(), "-v", "time").start();
            File file = new File(context.getCacheDir(), "androidLog.txt");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processStart.getInputStream()));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    bufferedWriter.close();
                    processStart.destroy();
                    return;
                }
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (Exception e7) {
            l.k("rbx.backtrace", "Bypass Java log due to " + e7);
        }
    }

    public static b c() {
        return c.f2079a;
    }

    public BacktraceData e(Context context, BacktraceData backtraceData) throws IOException {
        backtraceData.attributes.put("BaseUrl", a0.i());
        backtraceData.attributes.put("UserId", Long.toString(g7.c.c().j()));
        backtraceData.attributes.put("IsInGame", Boolean.toString(C2374w.h().f().i()));
        backtraceData.attributes.put("BuildVariant", h7.h.a());
        backtraceData.attributes.put("BuildId", a0.G());
        backtraceData.attributes.put("RobloxChannel", a0.T());
        UUID uuid = this.f2075b;
        if (uuid != null) {
            backtraceData.attributes.put("symbolication_id", uuid.toString());
        }
        b(context);
        return backtraceData;
    }

    public void d(final Context context) {
        if (this.f2074a == null) {
            y1.a aVar = new y1.a(context, new y1.b(j6.d.a().z2(), j6.d.a().K()), new a(context.getCacheDir() + "/androidLog.txt"));
            this.f2074a = aVar;
            if (this.f2075b != null) {
                aVar.enableProguard();
            }
            this.f2074a.a(j6.d.a().n2(), new C0031b(this.f2074a));
            this.f2074a.setOnBeforeSendEventListener(new OnBeforeSendEventListener() {
                @Override
                public final BacktraceData onEvent(BacktraceData backtraceData) {
                    return this.f2072a.e(context, backtraceData);
                }
            });
            Thread.setDefaultUncaughtExceptionHandler(new d(this.f2074a));
        }
    }

    private b() {
        this.f2075b = null;
        if (j6.d.a().T0()) {
            if (TextUtils.isEmpty("15266360-cfd8-428f-aa40-c0cb97613cd4")) {
                l.g("rbx.backtrace", "No symbolication ID provided.");
                return;
            }
            try {
                this.f2075b = UUID.fromString("15266360-cfd8-428f-aa40-c0cb97613cd4");
            } catch (IllegalArgumentException unused) {
                l.g("rbx.backtrace", "Could not parse provided symbolication ID.");
            }
        }
    }
}
