package androidx.recyclerview.widget;

public class e implements n {

    final n f11854a;

    int f11855b = 0;

    int f11856c = -1;

    int f11857d = -1;

    Object f11858e = null;

    public e(n nVar) {
        this.f11854a = nVar;
    }

    @Override
    public void a(int i7, int i8) {
        e();
        this.f11854a.a(i7, i8);
    }

    @Override
    public void b(int i7, int i8) {
        int i9;
        if (this.f11855b == 1 && i7 >= (i9 = this.f11856c)) {
            int i10 = this.f11857d;
            if (i7 <= i9 + i10) {
                this.f11857d = i10 + i8;
                this.f11856c = Math.min(i7, i9);
                return;
            }
        }
        e();
        this.f11856c = i7;
        this.f11857d = i8;
        this.f11855b = 1;
    }

    @Override
    public void c(int i7, int i8) {
        int i9;
        if (this.f11855b == 2 && (i9 = this.f11856c) >= i7 && i9 <= i7 + i8) {
            this.f11857d += i8;
            this.f11856c = i7;
        } else {
            e();
            this.f11856c = i7;
            this.f11857d = i8;
            this.f11855b = 2;
        }
    }

    @Override
    public void d(int i7, int i8, Object obj) {
        int i9;
        if (this.f11855b == 3) {
            int i10 = this.f11856c;
            int i11 = this.f11857d;
            if (i7 <= i10 + i11 && (i9 = i7 + i8) >= i10 && this.f11858e == obj) {
                this.f11856c = Math.min(i7, i10);
                this.f11857d = Math.max(i11 + i10, i9) - this.f11856c;
                return;
            }
        }
        e();
        this.f11856c = i7;
        this.f11857d = i8;
        this.f11858e = obj;
        this.f11855b = 3;
    }

    public void e() {
        int i7 = this.f11855b;
        if (i7 == 0) {
            return;
        }
        if (i7 == 1) {
            this.f11854a.b(this.f11856c, this.f11857d);
        } else if (i7 == 2) {
            this.f11854a.c(this.f11856c, this.f11857d);
        } else if (i7 == 3) {
            this.f11854a.d(this.f11856c, this.f11857d, this.f11858e);
        }
        this.f11858e = null;
        this.f11855b = 0;
    }
}
