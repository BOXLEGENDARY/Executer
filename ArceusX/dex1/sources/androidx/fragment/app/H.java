package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

final class H extends Writer {

    private final String f11108d;

    private StringBuilder f11109e = new StringBuilder(128);

    H(String str) {
        this.f11108d = str;
    }

    private void b() {
        if (this.f11109e.length() > 0) {
            Log.d(this.f11108d, this.f11109e.toString());
            StringBuilder sb = this.f11109e;
            sb.delete(0, sb.length());
        }
    }

    @Override
    public void close() {
        b();
    }

    @Override
    public void flush() {
        b();
    }

    @Override
    public void write(char[] cArr, int i7, int i8) {
        for (int i9 = 0; i9 < i8; i9++) {
            char c2 = cArr[i7 + i9];
            if (c2 == '\n') {
                b();
            } else {
                this.f11109e.append(c2);
            }
        }
    }
}
