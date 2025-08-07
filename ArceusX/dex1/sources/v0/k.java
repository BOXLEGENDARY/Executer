package v0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import java.util.Collections;
import java.util.List;
import z.F;

public class k {

    public static class b {

        private final Uri f24082a;

        private final int f24083b;

        private final int f24084c;

        private final boolean f24085d;

        private final int f24086e;

        @Deprecated
        public b(Uri uri, int i7, int i8, boolean z7, int i9) {
            this.f24082a = (Uri) x0.g.g(uri);
            this.f24083b = i7;
            this.f24084c = i8;
            this.f24085d = z7;
            this.f24086e = i9;
        }

        static b a(Uri uri, int i7, int i8, boolean z7, int i9) {
            return new b(uri, i7, i8, z7, i9);
        }

        public int b() {
            return this.f24086e;
        }

        public int c() {
            return this.f24083b;
        }

        public Uri d() {
            return this.f24082a;
        }

        public int e() {
            return this.f24084c;
        }

        public boolean f() {
            return this.f24085d;
        }
    }

    public static class c {
        public void a(int i7) {
            throw null;
        }

        public void b(Typeface typeface) {
            throw null;
        }
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, b[] bVarArr) {
        return androidx.core.graphics.f.b(context, cancellationSignal, bVarArr, 0);
    }

    public static a b(Context context, CancellationSignal cancellationSignal, e eVar) throws PackageManager.NameNotFoundException {
        return d.e(context, F.a(new Object[]{eVar}), cancellationSignal);
    }

    public static Typeface c(Context context, List<e> list, int i7, boolean z7, int i8, Handler handler, c cVar) {
        v0.a aVar = new v0.a(cVar, l.b(handler));
        if (!z7) {
            return i.d(context, list, i7, null, aVar);
        }
        if (list.size() <= 1) {
            return i.e(context, list.get(0), aVar, i7, i8);
        }
        throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
    }

    public static class a {

        private final int f24080a;

        private final List<b[]> f24081b;

        @Deprecated
        public a(int i7, b[] bVarArr) {
            this.f24080a = i7;
            this.f24081b = Collections.singletonList(bVarArr);
        }

        static a a(int i7, List<b[]> list) {
            return new a(i7, list);
        }

        static a b(int i7, b[] bVarArr) {
            return new a(i7, bVarArr);
        }

        public b[] c() {
            return this.f24081b.get(0);
        }

        public List<b[]> d() {
            return this.f24081b;
        }

        public int e() {
            return this.f24080a;
        }

        boolean f() {
            return this.f24081b.size() > 1;
        }

        a(int i7, List<b[]> list) {
            this.f24080a = i7;
            this.f24081b = list;
        }
    }
}
