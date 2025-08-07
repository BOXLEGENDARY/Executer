package androidx.appcompat.widget;

class x {

    private int f9345a = 0;

    private int f9346b = 0;

    private int f9347c = Integer.MIN_VALUE;

    private int f9348d = Integer.MIN_VALUE;

    private int f9349e = 0;

    private int f9350f = 0;

    private boolean f9351g = false;

    private boolean f9352h = false;

    x() {
    }

    public int a() {
        return this.f9351g ? this.f9345a : this.f9346b;
    }

    public int b() {
        return this.f9345a;
    }

    public int c() {
        return this.f9346b;
    }

    public int d() {
        return this.f9351g ? this.f9346b : this.f9345a;
    }

    public void e(int i7, int i8) {
        this.f9352h = false;
        if (i7 != Integer.MIN_VALUE) {
            this.f9349e = i7;
            this.f9345a = i7;
        }
        if (i8 != Integer.MIN_VALUE) {
            this.f9350f = i8;
            this.f9346b = i8;
        }
    }

    public void f(boolean z7) {
        if (z7 == this.f9351g) {
            return;
        }
        this.f9351g = z7;
        if (!this.f9352h) {
            this.f9345a = this.f9349e;
            this.f9346b = this.f9350f;
            return;
        }
        if (z7) {
            int i7 = this.f9348d;
            if (i7 == Integer.MIN_VALUE) {
                i7 = this.f9349e;
            }
            this.f9345a = i7;
            int i8 = this.f9347c;
            if (i8 == Integer.MIN_VALUE) {
                i8 = this.f9350f;
            }
            this.f9346b = i8;
            return;
        }
        int i9 = this.f9347c;
        if (i9 == Integer.MIN_VALUE) {
            i9 = this.f9349e;
        }
        this.f9345a = i9;
        int i10 = this.f9348d;
        if (i10 == Integer.MIN_VALUE) {
            i10 = this.f9350f;
        }
        this.f9346b = i10;
    }

    public void g(int i7, int i8) {
        this.f9347c = i7;
        this.f9348d = i8;
        this.f9352h = true;
        if (this.f9351g) {
            if (i8 != Integer.MIN_VALUE) {
                this.f9345a = i8;
            }
            if (i7 != Integer.MIN_VALUE) {
                this.f9346b = i7;
                return;
            }
            return;
        }
        if (i7 != Integer.MIN_VALUE) {
            this.f9345a = i7;
        }
        if (i8 != Integer.MIN_VALUE) {
            this.f9346b = i8;
        }
    }
}
