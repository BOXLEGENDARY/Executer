package com.roblox.client;

import android.os.AsyncTask;
import com.roblox.engine.jni.NativeSettingsInterface;

public class C2371t {

    private static C2371t f20251b;

    private boolean f20252a = false;

    class a extends AsyncTask<Void, Void, Boolean> {
        a(c cVar) {
        }

        @Override
        public Boolean doInBackground(Void... voidArr) {
            return Boolean.valueOf(C2371t.this.e() || C2371t.this.f());
        }

        @Override
        public void onPostExecute(Boolean bool) {
            C2371t.this.f20252a = bool.booleanValue();
        }
    }

    public enum b {
        UNKNOWN,
        ARM32,
        ARM64,
        X86_64;

        public static b e(int i7) {
            return i7 != 1 ? i7 != 2 ? i7 != 3 ? UNKNOWN : X86_64 : ARM64 : ARM32;
        }
    }

    public interface c {
    }

    private C2371t() {
    }

    public boolean e() {
        return false;
    }

    public boolean f() {
        return false;
    }

    public static C2371t g() {
        C2371t c2371t = f20251b;
        if (c2371t != null) {
            return c2371t;
        }
        synchronized (C2371t.class) {
            try {
                if (f20251b == null) {
                    f20251b = new C2371t();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f20251b;
    }

    public void d(c cVar) {
        new a(cVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public boolean h() {
        return this.f20252a;
    }

    public b i() {
        return b.e(NativeSettingsInterface.getRunningArchitecture());
    }
}
