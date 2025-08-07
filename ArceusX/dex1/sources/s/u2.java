package s;

import C.AbstractC0324e0;
import C.AbstractC0345p;
import C.C0355u0;
import C.InterfaceC0353t0;
import C.X0;
import L.c;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageWriter;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.ZslDisablerQuirk;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import z.C3043d0;

final class u2 implements q2 {

    private final t.B f23497a;

    final L.f f23498b;

    private boolean f23499c = false;

    private boolean f23500d = false;

    private boolean f23501e;

    private boolean f23502f;

    androidx.camera.core.q f23503g;

    private AbstractC0345p f23504h;

    private AbstractC0324e0 f23505i;

    ImageWriter f23506j;

    class a extends CameraCaptureSession.StateCallback {
        a() {
        }

        @Override
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        }

        @Override
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            Surface inputSurface = cameraCaptureSession.getInputSurface();
            if (inputSurface != null) {
                u2.this.f23506j = I.a.c(inputSurface, 1);
            }
        }
    }

    u2(t.B b2) {
        this.f23501e = false;
        this.f23502f = false;
        this.f23497a = b2;
        this.f23501e = v2.a(b2, 4);
        this.f23502f = androidx.camera.camera2.internal.compat.quirk.b.b(ZslDisablerQuirk.class) != null;
        this.f23498b = new L.f(3, new c.a() {
            @Override
            public final void a(Object obj) {
                ((androidx.camera.core.n) obj).close();
            }
        });
    }

    private void j() {
        L.f fVar = this.f23498b;
        while (!fVar.isEmpty()) {
            fVar.a().close();
        }
        AbstractC0324e0 abstractC0324e0 = this.f23505i;
        if (abstractC0324e0 != null) {
            androidx.camera.core.q qVar = this.f23503g;
            if (qVar != null) {
                abstractC0324e0.k().c(new t2(qVar), F.a.d());
                this.f23503g = null;
            }
            abstractC0324e0.d();
            this.f23505i = null;
        }
        ImageWriter imageWriter = this.f23506j;
        if (imageWriter != null) {
            imageWriter.close();
            this.f23506j = null;
        }
    }

    private Map<Integer, Size> k(t.B b2) {
        StreamConfigurationMap streamConfigurationMap;
        try {
            streamConfigurationMap = (StreamConfigurationMap) b2.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        } catch (AssertionError e7) {
            C3043d0.c("ZslControlImpl", "Failed to retrieve StreamConfigurationMap, error = " + e7.getMessage());
            streamConfigurationMap = null;
        }
        if (streamConfigurationMap == null || streamConfigurationMap.getInputFormats() == null) {
            return new HashMap();
        }
        HashMap map = new HashMap();
        for (int i7 : streamConfigurationMap.getInputFormats()) {
            Size[] inputSizes = streamConfigurationMap.getInputSizes(i7);
            if (inputSizes != null) {
                Arrays.sort(inputSizes, new E.d(true));
                map.put(Integer.valueOf(i7), inputSizes[0]);
            }
        }
        return map;
    }

    private boolean l(t.B b2, int i7) {
        int[] validOutputFormatsForInput;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) b2.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null || (validOutputFormatsForInput = streamConfigurationMap.getValidOutputFormatsForInput(i7)) == null) {
            return false;
        }
        for (int i8 : validOutputFormatsForInput) {
            if (i8 == 256) {
                return true;
            }
        }
        return false;
    }

    public void m(InterfaceC0353t0 interfaceC0353t0) {
        try {
            androidx.camera.core.n nVarC = interfaceC0353t0.c();
            if (nVarC != null) {
                this.f23498b.c(nVarC);
            }
        } catch (IllegalStateException e7) {
            C3043d0.c("ZslControlImpl", "Failed to acquire latest image IllegalStateException = " + e7.getMessage());
        }
    }

    @Override
    public boolean a() {
        return this.f23499c;
    }

    @Override
    public void b(X0.b bVar) {
        j();
        if (this.f23499c) {
            bVar.z(1);
            return;
        }
        if (this.f23502f) {
            bVar.z(1);
            return;
        }
        Map<Integer, Size> mapK = k(this.f23497a);
        if (!this.f23501e || mapK.isEmpty() || !mapK.containsKey(34) || !l(this.f23497a, 34)) {
            bVar.z(1);
            return;
        }
        Size size = mapK.get(34);
        androidx.camera.core.p pVar = new androidx.camera.core.p(size.getWidth(), size.getHeight(), 34, 9);
        this.f23504h = pVar.n();
        this.f23503g = new androidx.camera.core.q(pVar);
        pVar.e(new InterfaceC0353t0.a() {
            @Override
            public final void a(InterfaceC0353t0 interfaceC0353t0) {
                this.f23456a.m(interfaceC0353t0);
            }
        }, F.a.c());
        C0355u0 c0355u0 = new C0355u0(this.f23503g.a(), new Size(this.f23503g.getWidth(), this.f23503g.getHeight()), 34);
        this.f23505i = c0355u0;
        androidx.camera.core.q qVar = this.f23503g;
        com.google.common.util.concurrent.p<Void> pVarK = c0355u0.k();
        Objects.requireNonNull(qVar);
        pVarK.c(new t2(qVar), F.a.d());
        bVar.l(this.f23505i);
        bVar.e(this.f23504h);
        bVar.k(new a());
        bVar.w(new InputConfiguration(this.f23503g.getWidth(), this.f23503g.getHeight(), this.f23503g.d()));
    }

    @Override
    public boolean c() {
        return this.f23500d;
    }

    @Override
    public void d(boolean z7) {
        this.f23500d = z7;
    }

    @Override
    public void e(boolean z7) {
        this.f23499c = z7;
    }

    @Override
    public androidx.camera.core.n f() {
        try {
            return this.f23498b.a();
        } catch (NoSuchElementException unused) {
            C3043d0.c("ZslControlImpl", "dequeueImageFromBuffer no such element");
            return null;
        }
    }

    @Override
    public boolean g(androidx.camera.core.n nVar) {
        Image imageL = nVar.l();
        ImageWriter imageWriter = this.f23506j;
        if (imageWriter != null && imageL != null) {
            try {
                I.a.d(imageWriter, imageL);
                return true;
            } catch (IllegalStateException e7) {
                C3043d0.c("ZslControlImpl", "enqueueImageToImageWriter throws IllegalStateException = " + e7.getMessage());
            }
        }
        return false;
    }
}
