package s;

import C.EnumC0350s;
import C.EnumC0352t;
import C.EnumC0354u;
import C.EnumC0356v;
import C.EnumC0358w;
import C.EnumC0360x;
import C.EnumC0362y;
import C.InterfaceC0364z;
import E.h;
import android.hardware.camera2.CaptureResult;
import android.os.Build;
import java.nio.BufferUnderflowException;
import z.C3043d0;

public class C2810g implements InterfaceC0364z {

    private final C.g1 f23346a;

    private final CaptureResult f23347b;

    public C2810g(C.g1 g1Var, CaptureResult captureResult) {
        this.f23346a = g1Var;
        this.f23347b = captureResult;
    }

    @Override
    public void a(h.b bVar) {
        super.a(bVar);
        try {
            Integer num = (Integer) this.f23347b.get(CaptureResult.JPEG_ORIENTATION);
            if (num != null) {
                bVar.m(num.intValue());
            }
        } catch (BufferUnderflowException unused) {
            C3043d0.l("C2CameraCaptureResult", "Failed to get JPEG orientation.");
        }
        Long l7 = (Long) this.f23347b.get(CaptureResult.SENSOR_EXPOSURE_TIME);
        if (l7 != null) {
            bVar.f(l7.longValue());
        }
        Float f7 = (Float) this.f23347b.get(CaptureResult.LENS_APERTURE);
        if (f7 != null) {
            bVar.l(f7.floatValue());
        }
        Integer numValueOf = (Integer) this.f23347b.get(CaptureResult.SENSOR_SENSITIVITY);
        if (numValueOf != null) {
            if (((Integer) this.f23347b.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST)) != null) {
                numValueOf = Integer.valueOf(numValueOf.intValue() * ((int) (r1.intValue() / 100.0f)));
            }
            bVar.k(numValueOf.intValue());
        }
        Float f8 = (Float) this.f23347b.get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f8 != null) {
            bVar.h(f8.floatValue());
        }
        Integer num2 = (Integer) this.f23347b.get(CaptureResult.CONTROL_AWB_MODE);
        if (num2 != null) {
            h.c cVar = h.c.AUTO;
            if (num2.intValue() == 0) {
                cVar = h.c.MANUAL;
            }
            bVar.n(cVar);
        }
    }

    @Override
    public C.g1 b() {
        return this.f23346a;
    }

    @Override
    public long d() {
        Long l7 = (Long) this.f23347b.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l7 == null) {
            return -1L;
        }
        return l7.longValue();
    }

    @Override
    public EnumC0360x e() {
        Integer num = (Integer) this.f23347b.get(CaptureResult.CONTROL_AWB_STATE);
        if (num == null) {
            return EnumC0360x.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return EnumC0360x.INACTIVE;
        }
        if (iIntValue == 1) {
            return EnumC0360x.METERING;
        }
        if (iIntValue == 2) {
            return EnumC0360x.f765v;
        }
        if (iIntValue == 3) {
            return EnumC0360x.LOCKED;
        }
        C3043d0.c("C2CameraCaptureResult", "Undefined awb state: " + num);
        return EnumC0360x.UNKNOWN;
    }

    @Override
    public EnumC0362y f() {
        Integer num = (Integer) this.f23347b.get(CaptureResult.FLASH_STATE);
        if (num == null) {
            return EnumC0362y.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0 || iIntValue == 1) {
            return EnumC0362y.NONE;
        }
        if (iIntValue == 2) {
            return EnumC0362y.READY;
        }
        if (iIntValue == 3 || iIntValue == 4) {
            return EnumC0362y.FIRED;
        }
        C3043d0.c("C2CameraCaptureResult", "Undefined flash state: " + num);
        return EnumC0362y.UNKNOWN;
    }

    @Override
    public EnumC0358w g() {
        Integer num = (Integer) this.f23347b.get(CaptureResult.CONTROL_AWB_MODE);
        if (num == null) {
            return EnumC0358w.f752d;
        }
        switch (num.intValue()) {
        }
        return EnumC0358w.f752d;
    }

    @Override
    public EnumC0354u h() {
        Integer num = (Integer) this.f23347b.get(CaptureResult.CONTROL_AF_MODE);
        if (num == null) {
            return EnumC0354u.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue != 0) {
            if (iIntValue == 1 || iIntValue == 2) {
                return EnumC0354u.ON_MANUAL_AUTO;
            }
            if (iIntValue == 3 || iIntValue == 4) {
                return EnumC0354u.ON_CONTINUOUS_AUTO;
            }
            if (iIntValue != 5) {
                C3043d0.c("C2CameraCaptureResult", "Undefined af mode: " + num);
                return EnumC0354u.UNKNOWN;
            }
        }
        return EnumC0354u.OFF;
    }

    @Override
    public EnumC0352t i() {
        Integer num = (Integer) this.f23347b.get(CaptureResult.CONTROL_AE_STATE);
        if (num == null) {
            return EnumC0352t.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return EnumC0352t.INACTIVE;
        }
        if (iIntValue != 1) {
            if (iIntValue == 2) {
                return EnumC0352t.CONVERGED;
            }
            if (iIntValue == 3) {
                return EnumC0352t.LOCKED;
            }
            if (iIntValue == 4) {
                return EnumC0352t.FLASH_REQUIRED;
            }
            if (iIntValue != 5) {
                C3043d0.c("C2CameraCaptureResult", "Undefined ae state: " + num);
                return EnumC0352t.UNKNOWN;
            }
        }
        return EnumC0352t.SEARCHING;
    }

    @Override
    public CaptureResult j() {
        return this.f23347b;
    }

    @Override
    public EnumC0350s k() {
        Integer num = (Integer) this.f23347b.get(CaptureResult.CONTROL_AE_MODE);
        if (num == null) {
            return EnumC0350s.UNKNOWN;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return EnumC0350s.OFF;
        }
        if (iIntValue == 1) {
            return EnumC0350s.ON;
        }
        if (iIntValue == 2) {
            return EnumC0350s.ON_AUTO_FLASH;
        }
        if (iIntValue == 3) {
            return EnumC0350s.ON_ALWAYS_FLASH;
        }
        if (iIntValue == 4) {
            return EnumC0350s.ON_AUTO_FLASH_REDEYE;
        }
        if (iIntValue == 5 && Build.VERSION.SDK_INT >= 28) {
            return EnumC0350s.ON_EXTERNAL_FLASH;
        }
        return EnumC0350s.UNKNOWN;
    }

    @Override
    public EnumC0356v l() {
        Integer num = (Integer) this.f23347b.get(CaptureResult.CONTROL_AF_STATE);
        if (num == null) {
            return EnumC0356v.UNKNOWN;
        }
        switch (num.intValue()) {
            case 0:
                break;
            case 1:
            case 3:
                break;
            case 2:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                C3043d0.c("C2CameraCaptureResult", "Undefined af state: " + num);
                break;
        }
        return EnumC0356v.UNKNOWN;
    }

    public C2810g(CaptureResult captureResult) {
        this(C.g1.b(), captureResult);
    }
}
