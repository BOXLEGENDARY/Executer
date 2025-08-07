package s;

class C2824k1 {

    private final Object f23390a = new Object();

    private final t.B f23391b;

    private int f23392c;

    C2824k1(t.B b2, int i7) {
        this.f23391b = b2;
        this.f23392c = i7;
    }

    public int a() {
        int i7;
        synchronized (this.f23390a) {
            i7 = this.f23392c;
        }
        return i7;
    }

    void b(int i7) {
        synchronized (this.f23390a) {
            this.f23392c = i7;
        }
    }
}
