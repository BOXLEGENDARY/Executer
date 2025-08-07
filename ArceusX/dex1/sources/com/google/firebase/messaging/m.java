package com.google.firebase.messaging;

import a4.C1576m;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import n3.C2651i;

final class m implements Closeable {

    private final URL f19143d;

    private Task<Bitmap> f19144e;

    private volatile InputStream f19145i;

    private m(URL url) {
        this.f19143d = url;
    }

    public static m e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new m(new URL(str));
        } catch (MalformedURLException unused) {
            String strValueOf = String.valueOf(str);
            Log.w("FirebaseMessaging", strValueOf.length() != 0 ? "Not downloading image, bad URL: ".concat(strValueOf) : new String("Not downloading image, bad URL: "));
            return null;
        }
    }

    private final byte[] m() throws IOException {
        URLConnection uRLConnectionOpenConnection = this.f19143d.openConnection();
        if (uRLConnectionOpenConnection.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        try {
            this.f19145i = inputStream;
            byte[] bArrB = L3.i.b(L3.i.a(inputStream, 1048577L));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                int length = bArrB.length;
                String strValueOf = String.valueOf(this.f19143d);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 34);
                sb.append("Downloaded ");
                sb.append(length);
                sb.append(" bytes from ");
                sb.append(strValueOf);
                Log.v("FirebaseMessaging", sb.toString());
            }
            if (bArrB.length <= 1048576) {
                return bArrB;
            }
            throw new IOException("Image exceeds max size of 1048576");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th3) {
                        L3.l.b(th, th3);
                    }
                }
                throw th2;
            }
        }
    }

    public final Task<Bitmap> b() {
        return (Task) C2651i.l(this.f19144e);
    }

    @Override
    public final void close() {
        L3.j.a(this.f19145i);
    }

    public final void f(Executor executor) {
        this.f19144e = C1576m.c(executor, new Callable(this) {

            private final m f19142d;

            {
                this.f19142d = this;
            }

            @Override
            public final Object call() {
                return this.f19142d.j();
            }
        });
    }

    public final Bitmap j() throws IOException {
        String strValueOf = String.valueOf(this.f19143d);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 22);
        sb.append("Starting download of: ");
        sb.append(strValueOf);
        Log.i("FirebaseMessaging", sb.toString());
        byte[] bArrM = m();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrM, 0, bArrM.length);
        if (bitmapDecodeByteArray == null) {
            String strValueOf2 = String.valueOf(this.f19143d);
            StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 24);
            sb2.append("Failed to decode image: ");
            sb2.append(strValueOf2);
            throw new IOException(sb2.toString());
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            String strValueOf3 = String.valueOf(this.f19143d);
            StringBuilder sb3 = new StringBuilder(strValueOf3.length() + 31);
            sb3.append("Successfully downloaded image: ");
            sb3.append(strValueOf3);
            Log.d("FirebaseMessaging", sb3.toString());
        }
        return bitmapDecodeByteArray;
    }
}
