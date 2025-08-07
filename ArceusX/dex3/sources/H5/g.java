package H5;

public final class g {
    private G5.b a;
    private G5.a b;
    private G5.c c;
    private int d = -1;
    private b e;

    public static boolean b(int i) {
        return i >= 0 && i < 8;
    }

    public b a() {
        return this.e;
    }

    public void c(G5.a aVar) {
        this.b = aVar;
    }

    public void d(int i) {
        this.d = i;
    }

    public void e(b bVar) {
        this.e = bVar;
    }

    public void f(G5.b bVar) {
        this.a = bVar;
    }

    public void g(G5.c cVar) {
        this.c = cVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(200);
        sb.append("<<\n");
        sb.append(" mode: ");
        sb.append(this.a);
        sb.append("\n ecLevel: ");
        sb.append(this.b);
        sb.append("\n version: ");
        sb.append(this.c);
        sb.append("\n maskPattern: ");
        sb.append(this.d);
        if (this.e == null) {
            sb.append("\n matrix: null\n");
        } else {
            sb.append("\n matrix:\n");
            sb.append(this.e);
        }
        sb.append(">>\n");
        return sb.toString();
    }
}
