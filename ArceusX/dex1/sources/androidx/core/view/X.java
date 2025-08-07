package androidx.core.view;

import android.view.MotionEvent;

class X {

    private final float[] f10613a = new float[20];

    private final long[] f10614b = new long[20];

    private float f10615c = 0.0f;

    private int f10616d = 0;

    private int f10617e = 0;

    X() {
    }

    private void b() {
        this.f10616d = 0;
        this.f10615c = 0.0f;
    }

    private float e() {
        long[] jArr;
        long j7;
        int i7 = this.f10616d;
        if (i7 < 2) {
            return 0.0f;
        }
        int i8 = this.f10617e;
        int i9 = ((i8 + 20) - (i7 - 1)) % 20;
        long j8 = this.f10614b[i8];
        while (true) {
            jArr = this.f10614b;
            j7 = jArr[i9];
            if (j8 - j7 <= 100) {
                break;
            }
            this.f10616d--;
            i9 = (i9 + 1) % 20;
        }
        int i10 = this.f10616d;
        if (i10 < 2) {
            return 0.0f;
        }
        if (i10 == 2) {
            int i11 = (i9 + 1) % 20;
            if (j7 == jArr[i11]) {
                return 0.0f;
            }
            return this.f10613a[i11] / (r2 - j7);
        }
        float fAbs = 0.0f;
        int i12 = 0;
        for (int i13 = 0; i13 < this.f10616d - 1; i13++) {
            int i14 = i13 + i9;
            long[] jArr2 = this.f10614b;
            long j9 = jArr2[i14 % 20];
            int i15 = (i14 + 1) % 20;
            if (jArr2[i15] != j9) {
                i12++;
                float f7 = f(fAbs);
                float f8 = this.f10613a[i15] / (this.f10614b[i15] - j9);
                fAbs += (f8 - f7) * Math.abs(f8);
                if (i12 == 1) {
                    fAbs *= 0.5f;
                }
            }
        }
        return f(fAbs);
    }

    private static float f(float f7) {
        return (f7 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f7) * 2.0f));
    }

    void a(MotionEvent motionEvent) {
        long eventTime = motionEvent.getEventTime();
        if (this.f10616d != 0 && eventTime - this.f10614b[this.f10617e] > 40) {
            b();
        }
        int i7 = (this.f10617e + 1) % 20;
        this.f10617e = i7;
        int i8 = this.f10616d;
        if (i8 != 20) {
            this.f10616d = i8 + 1;
        }
        this.f10613a[i7] = motionEvent.getAxisValue(26);
        this.f10614b[this.f10617e] = eventTime;
    }

    void c(int i7, float f7) {
        float fE = e() * i7;
        this.f10615c = fE;
        if (fE < (-Math.abs(f7))) {
            this.f10615c = -Math.abs(f7);
        } else if (this.f10615c > Math.abs(f7)) {
            this.f10615c = Math.abs(f7);
        }
    }

    float d(int i7) {
        if (i7 != 26) {
            return 0.0f;
        }
        return this.f10615c;
    }
}
