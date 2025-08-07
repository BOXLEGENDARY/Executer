package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

public final class h {

    private static final androidx.concurrent.futures.d<c> f11473a = androidx.concurrent.futures.d.t();

    private static final Object f11474b = new Object();

    private static c f11475c = null;

    private static class a {
        static PackageInfo a(PackageManager packageManager, Context context) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    static class b {

        final int f11476a;

        final int f11477b;

        final long f11478c;

        final long f11479d;

        b(int i7, int i8, long j7, long j8) {
            this.f11476a = i7;
            this.f11477b = i8;
            this.f11478c = j7;
            this.f11479d = j8;
        }

        static b a(File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } catch (Throwable th) {
                try {
                    dataInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        void b(File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f11476a);
                dataOutputStream.writeInt(this.f11477b);
                dataOutputStream.writeLong(this.f11478c);
                dataOutputStream.writeLong(this.f11479d);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f11477b == bVar.f11477b && this.f11478c == bVar.f11478c && this.f11476a == bVar.f11476a && this.f11479d == bVar.f11479d;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f11477b), Long.valueOf(this.f11478c), Integer.valueOf(this.f11476a), Long.valueOf(this.f11479d));
        }
    }

    public static class c {

        final int f11480a;

        private final boolean f11481b;

        private final boolean f11482c;

        private final boolean f11483d;

        c(int i7, boolean z7, boolean z8, boolean z9) {
            this.f11480a = i7;
            this.f11482c = z8;
            this.f11481b = z7;
            this.f11483d = z9;
        }
    }

    private static long a(Context context) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? a.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    private static c b(int i7, boolean z7, boolean z8, boolean z9) {
        c cVar = new c(i7, z7, z8, z9);
        f11475c = cVar;
        f11473a.q(cVar);
        return f11475c;
    }

    static androidx.profileinstaller.h.c c(android.content.Context r19, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: androidx.profileinstaller.h.c(android.content.Context, boolean):androidx.profileinstaller.h$c");
    }
}
