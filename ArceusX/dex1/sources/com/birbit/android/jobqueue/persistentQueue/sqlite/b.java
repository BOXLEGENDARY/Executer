package com.birbit.android.jobqueue.persistentQueue.sqlite;

import android.content.Context;
import j2.C2491a;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import okio.f;
import okio.g;
import okio.w;

class b {

    private final File f13820a;

    b(Context context, String str) {
        File file = new File(context.getDir("com_birbit_jobqueue_jobs", 0), "files_" + str);
        this.f13820a = file;
        file.mkdirs();
    }

    private static void a(Closeable closeable) throws IOException {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    private static String c(String str) {
        return str + ".jobs";
    }

    private static String d(String str) {
        if (str.length() < 6) {
            return null;
        }
        return str.substring(0, str.length() - 5);
    }

    private File g(String str) {
        return new File(this.f13820a, c(str));
    }

    void b(String str) {
        File fileG = g(str);
        if (fileG.exists()) {
            fileG.delete();
        }
    }

    byte[] e(String str) throws IOException {
        File fileG = g(str);
        if (!fileG.exists() || !fileG.canRead()) {
            return null;
        }
        g gVarD = w.d(w.k(fileG));
        try {
            return gVarD.O();
        } finally {
            a(gVarD);
        }
    }

    void f(String str, byte[] bArr) throws IOException {
        f fVarC = w.c(w.f(g(str)));
        try {
            fVarC.Y0(bArr).flush();
        } finally {
            a(fVarC);
        }
    }

    void h(Set<String> set) {
        for (String str : this.f13820a.list()) {
            if (str.endsWith(".jobs") && !set.contains(d(str))) {
                File file = new File(this.f13820a, str);
                if (!file.delete()) {
                    C2491a.b("cannot delete unused job toFile " + file.getAbsolutePath(), new Object[0]);
                }
            }
        }
    }
}
