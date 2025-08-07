package P1;

import android.content.Context;
import androidx.annotation.NonNull;
import java.io.File;

public class c {
    public static boolean a;
    private static boolean b;
    private static String[] c;
    private static long[] d;
    private static int e;
    private static int f;
    private static Y1.f g;
    private static Y1.e h;
    private static volatile Y1.h i;
    private static volatile Y1.g j;

    class a implements Y1.e {
        final Context a;

        a(Context context) {
            this.a = context;
        }

        @Override
        @NonNull
        public File a() {
            return new File(this.a.getCacheDir(), "lottie_network_cache");
        }
    }

    public static void a(String str) {
        if (b) {
            int i2 = e;
            if (i2 == 20) {
                f++;
                return;
            }
            c[i2] = str;
            d[i2] = System.nanoTime();
            u0.m.a(str);
            e++;
        }
    }

    public static float b(String str) {
        int i2 = f;
        if (i2 > 0) {
            f = i2 - 1;
            return 0.0f;
        }
        if (!b) {
            return 0.0f;
        }
        int i3 = e - 1;
        e = i3;
        if (i3 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
        if (str.equals(c[i3])) {
            u0.m.b();
            return (System.nanoTime() - d[e]) / 1000000.0f;
        }
        throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + c[e] + ".");
    }

    @NonNull
    public static Y1.g c(@NonNull Context context) {
        Context applicationContext = context.getApplicationContext();
        Y1.g gVar = j;
        if (gVar == null) {
            synchronized (Y1.g.class) {
                try {
                    gVar = j;
                    if (gVar == null) {
                        Y1.e aVar = h;
                        if (aVar == null) {
                            aVar = new a(applicationContext);
                        }
                        gVar = new Y1.g(aVar);
                        j = gVar;
                    }
                } finally {
                }
            }
        }
        return gVar;
    }

    @NonNull
    public static Y1.h d(@NonNull Context context) {
        Y1.h hVar = i;
        if (hVar == null) {
            synchronized (Y1.h.class) {
                try {
                    hVar = i;
                    if (hVar == null) {
                        Y1.g gVarC = c(context);
                        Y1.f bVar = g;
                        if (bVar == null) {
                            bVar = new Y1.b();
                        }
                        hVar = new Y1.h(gVarC, bVar);
                        i = hVar;
                    }
                } finally {
                }
            }
        }
        return hVar;
    }
}
