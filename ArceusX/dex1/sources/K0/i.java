package k0;

import com.github.luben.zstd.BuildConfig;
import java.util.Arrays;
import java.util.HashSet;

public class i {

    private static int f21217r = 1;

    public boolean f21218a;

    private String f21219b;

    public float f21223f;

    a f21227j;

    public int f21220c = -1;

    int f21221d = -1;

    public int f21222e = 0;

    public boolean f21224g = false;

    float[] f21225h = new float[9];

    float[] f21226i = new float[9];

    C2508b[] f21228k = new C2508b[16];

    int f21229l = 0;

    public int f21230m = 0;

    boolean f21231n = false;

    int f21232o = -1;

    float f21233p = 0.0f;

    HashSet<C2508b> f21234q = null;

    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public i(a aVar, String str) {
        this.f21227j = aVar;
    }

    static void b() {
        f21217r++;
    }

    public final void a(C2508b c2508b) {
        int i7 = 0;
        while (true) {
            int i8 = this.f21229l;
            if (i7 >= i8) {
                C2508b[] c2508bArr = this.f21228k;
                if (i8 >= c2508bArr.length) {
                    this.f21228k = (C2508b[]) Arrays.copyOf(c2508bArr, c2508bArr.length * 2);
                }
                C2508b[] c2508bArr2 = this.f21228k;
                int i9 = this.f21229l;
                c2508bArr2[i9] = c2508b;
                this.f21229l = i9 + 1;
                return;
            }
            if (this.f21228k[i7] == c2508b) {
                return;
            } else {
                i7++;
            }
        }
    }

    public final void c(C2508b c2508b) {
        int i7 = this.f21229l;
        int i8 = 0;
        while (i8 < i7) {
            if (this.f21228k[i8] == c2508b) {
                while (i8 < i7 - 1) {
                    C2508b[] c2508bArr = this.f21228k;
                    int i9 = i8 + 1;
                    c2508bArr[i8] = c2508bArr[i9];
                    i8 = i9;
                }
                this.f21229l--;
                return;
            }
            i8++;
        }
    }

    public void d() {
        this.f21219b = null;
        this.f21227j = a.UNKNOWN;
        this.f21222e = 0;
        this.f21220c = -1;
        this.f21221d = -1;
        this.f21223f = 0.0f;
        this.f21224g = false;
        this.f21231n = false;
        this.f21232o = -1;
        this.f21233p = 0.0f;
        int i7 = this.f21229l;
        for (int i8 = 0; i8 < i7; i8++) {
            this.f21228k[i8] = null;
        }
        this.f21229l = 0;
        this.f21230m = 0;
        this.f21218a = false;
        Arrays.fill(this.f21226i, 0.0f);
    }

    public void e(C2510d c2510d, float f7) {
        this.f21223f = f7;
        this.f21224g = true;
        this.f21231n = false;
        this.f21232o = -1;
        this.f21233p = 0.0f;
        int i7 = this.f21229l;
        this.f21221d = -1;
        for (int i8 = 0; i8 < i7; i8++) {
            this.f21228k[i8].A(c2510d, this, false);
        }
        this.f21229l = 0;
    }

    public void f(a aVar, String str) {
        this.f21227j = aVar;
    }

    public final void g(C2510d c2510d, C2508b c2508b) {
        int i7 = this.f21229l;
        for (int i8 = 0; i8 < i7; i8++) {
            this.f21228k[i8].B(c2510d, c2508b, false);
        }
        this.f21229l = 0;
    }

    public String toString() {
        if (this.f21219b != null) {
            return BuildConfig.FLAVOR + this.f21219b;
        }
        return BuildConfig.FLAVOR + this.f21220c;
    }
}
