package com.google.firebase.installations;

import android.util.Log;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

class a {

    private final FileChannel f19093a;

    private final FileLock f19094b;

    private a(FileChannel fileChannel, FileLock fileLock) {
        this.f19093a = fileChannel;
        this.f19094b = fileLock;
    }

    static com.google.firebase.installations.a a(android.content.Context r4, java.lang.String r5) throws java.io.IOException {
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.a.a(android.content.Context, java.lang.String):com.google.firebase.installations.a");
    }

    void b() throws IOException {
        try {
            this.f19094b.release();
            this.f19093a.close();
        } catch (IOException e7) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e7);
        }
    }
}
