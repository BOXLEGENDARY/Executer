package s;

import android.hardware.camera2.CameraCharacteristics;
import android.view.LiveData;
import z.InterfaceC3060o;

public class C2773H0 implements InterfaceC3060o {

    private final String f22969a;

    private final t.B f22970b;

    private final y.h f22971c;

    @Override
    public int a() {
        return l(0);
    }

    public String d() {
        return this.f22969a;
    }

    @Override
    public LiveData<Integer> e() {
        throw new UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override
    public int h() {
        Integer num = (Integer) this.f22970b.a(CameraCharacteristics.LENS_FACING);
        x0.g.b(num != null, "Unable to get the lens facing of the camera.");
        return B1.a(num.intValue());
    }

    @Override
    public int l(int i7) {
        return E.c.a(E.c.b(i7), t(), 1 == h());
    }

    @Override
    public LiveData<z.J0> q() {
        throw new UnsupportedOperationException("Physical camera doesn't support this function");
    }

    public y.h r() {
        return this.f22971c;
    }

    public t.B s() {
        return this.f22970b;
    }

    int t() {
        Integer num = (Integer) this.f22970b.a(CameraCharacteristics.SENSOR_ORIENTATION);
        x0.g.g(num);
        return num.intValue();
    }
}
