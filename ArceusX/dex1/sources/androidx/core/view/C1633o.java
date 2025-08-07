package androidx.core.view;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

public class C1633o {

    private final Context f10706a;

    private final InterfaceC1635p f10707b;

    private final b f10708c;

    private final a f10709d;

    private VelocityTracker f10710e;

    private float f10711f;

    private int f10712g;

    private int f10713h;

    private int f10714i;

    private final int[] f10715j;

    interface a {
        float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i7);
    }

    interface b {
        void a(Context context, int[] iArr, MotionEvent motionEvent, int i7);
    }

    public C1633o(Context context, InterfaceC1635p interfaceC1635p) {
        this(context, interfaceC1635p, new b() {
            @Override
            public final void a(Context context2, int[] iArr, MotionEvent motionEvent, int i7) {
                C1633o.c(context2, iArr, motionEvent, i7);
            }
        }, new a() {
            @Override
            public final float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i7) {
                return C1633o.f(velocityTracker, motionEvent, i7);
            }
        });
    }

    public static void c(Context context, int[] iArr, MotionEvent motionEvent, int i7) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        iArr[0] = C1610c0.g(context, viewConfiguration, motionEvent.getDeviceId(), i7, motionEvent.getSource());
        iArr[1] = C1610c0.f(context, viewConfiguration, motionEvent.getDeviceId(), i7, motionEvent.getSource());
    }

    private boolean d(MotionEvent motionEvent, int i7) {
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.f10713h == source && this.f10714i == deviceId && this.f10712g == i7) {
            return false;
        }
        this.f10708c.a(this.f10706a, this.f10715j, motionEvent, i7);
        this.f10713h = source;
        this.f10714i = deviceId;
        this.f10712g = i7;
        return true;
    }

    private float e(MotionEvent motionEvent, int i7) {
        if (this.f10710e == null) {
            this.f10710e = VelocityTracker.obtain();
        }
        return this.f10709d.a(this.f10710e, motionEvent, i7);
    }

    public static float f(VelocityTracker velocityTracker, MotionEvent motionEvent, int i7) {
        W.a(velocityTracker, motionEvent);
        W.b(velocityTracker, 1000);
        return W.d(velocityTracker, i7);
    }

    public void g(MotionEvent motionEvent, int i7) {
        boolean zD = d(motionEvent, i7);
        if (this.f10715j[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f10710e;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f10710e = null;
                return;
            }
            return;
        }
        float fE = e(motionEvent, i7) * this.f10707b.b();
        float fSignum = Math.signum(fE);
        if (zD || (fSignum != Math.signum(this.f10711f) && fSignum != 0.0f)) {
            this.f10707b.c();
        }
        float fAbs = Math.abs(fE);
        int[] iArr = this.f10715j;
        if (fAbs < iArr[0]) {
            return;
        }
        float fMax = Math.max(-r6, Math.min(fE, iArr[1]));
        this.f10711f = this.f10707b.a(fMax) ? fMax : 0.0f;
    }

    C1633o(Context context, InterfaceC1635p interfaceC1635p, b bVar, a aVar) {
        this.f10712g = -1;
        this.f10713h = -1;
        this.f10714i = -1;
        this.f10715j = new int[]{Integer.MAX_VALUE, 0};
        this.f10706a = context;
        this.f10707b = interfaceC1635p;
        this.f10708c = bVar;
        this.f10709d = aVar;
    }
}
