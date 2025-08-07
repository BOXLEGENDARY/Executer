package M5;

import android.content.Context;
import com.roblox.client.G;
import e7.d;
import e7.f;

public class b implements d {

    private final int f2375a;

    private final int f2376b;

    static class a {

        static final int[] f2377a;

        static {
            int[] iArr = new int[f.values().length];
            f2377a = iArr;
            try {
                iArr[f.e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2377a[f.i.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2377a[f.v.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public b(Context context) {
        this.f2375a = context.getResources().getColor(G.f19449p);
        this.f2376b = context.getResources().getColor(G.f19443j);
    }

    public int a(f fVar) {
        int i7 = a.f2377a[fVar.ordinal()];
        if (i7 == 1) {
            return this.f2375a;
        }
        if (i7 != 2) {
            return -1;
        }
        return this.f2376b;
    }
}
