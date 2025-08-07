package T6;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.text.TextUtils;
import d8.C;
import d8.E;
import d8.t;
import h7.j;
import h7.l;

public abstract class d extends AsyncTask<Void, Void, String> {

    private E f7451a = new j.a();

    private Context f7452b;

    private long f7453c;

    private U6.b f7454d;

    private String f7455e;

    class a implements C {
        a() {
        }

        public void a(Drawable drawable) {
            l.c("Failed to get thumbnail bitmap. error: " + drawable);
            d.this.d(null);
        }

        public void b(Bitmap bitmap, t.e eVar) {
            d.this.d(bitmap);
        }

        public void c(Drawable drawable) {
        }
    }

    static class b {

        static final int[] f7457a;

        static {
            int[] iArr = new int[U6.b.values().length];
            f7457a = iArr;
            try {
                iArr[U6.b.user.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public d(Context context, long j7, U6.b bVar, String str) {
        this.f7452b = context;
        this.f7453c = j7;
        this.f7454d = bVar;
        this.f7455e = str;
    }

    private java.lang.String a(long r5, java.lang.String r7) {
        throw new UnsupportedOperationException("Method not decompiled: T6.d.a(long, java.lang.String):java.lang.String");
    }

    private void c(Context context, String str) {
        t.p(context).k(str).g(this.f7451a).e(new a());
    }

    @Override
    public String doInBackground(Void... voidArr) {
        U6.b bVar = this.f7454d;
        if (bVar == null) {
            return null;
        }
        try {
            return b.f7457a[bVar.ordinal()] != 1 ? this.f7455e : a(this.f7453c, this.f7455e);
        } catch (Exception e7) {
            l.c("failed to retrieve thumbnail. Exception: " + e7);
            return null;
        }
    }

    public abstract void d(Bitmap bitmap);

    @Override
    public void onPostExecute(String str) {
        if (TextUtils.isEmpty(str)) {
            d(null);
        } else {
            c(this.f7452b, str);
        }
    }
}
