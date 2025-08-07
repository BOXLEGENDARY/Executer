package W1;

public class d {
    private final float[] a;
    private final int[] b;

    public d(float[] fArr, int[] iArr) {
        this.a = fArr;
        this.b = iArr;
    }

    public int[] a() {
        return this.b;
    }

    public float[] b() {
        return this.a;
    }

    public int c() {
        return this.b.length;
    }

    public void d(d dVar, d dVar2, float f) {
        if (dVar.b.length == dVar2.b.length) {
            for (int i = 0; i < dVar.b.length; i++) {
                this.a[i] = b2.g.k(dVar.a[i], dVar2.a[i], f);
                this.b[i] = b2.b.c(f, dVar.b[i], dVar2.b[i]);
            }
            return;
        }
        throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + dVar.b.length + " vs " + dVar2.b.length + ")");
    }
}
