package androidx.camera.camera2.internal.compat.quirk;

import C.N0;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import t.B;

public class AeFpsRangeLegacyQuirk implements N0 {

    private final Range<Integer> f9375a;

    public AeFpsRangeLegacyQuirk(B b2) {
        this.f9375a = i((Range[]) b2.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES));
    }

    private Range<Integer> f(Range<Integer> range) {
        int iIntValue = ((Integer) range.getUpper()).intValue();
        int iIntValue2 = ((Integer) range.getLower()).intValue();
        if (((Integer) range.getUpper()).intValue() >= 1000) {
            iIntValue = ((Integer) range.getUpper()).intValue() / 1000;
        }
        if (((Integer) range.getLower()).intValue() >= 1000) {
            iIntValue2 = ((Integer) range.getLower()).intValue() / 1000;
        }
        return new Range<>(Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue));
    }

    static boolean h(B b2) {
        Integer num = (Integer) b2.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }

    private Range<Integer> i(Range<Integer>[] rangeArr) {
        Range<Integer> range = null;
        if (rangeArr != null && rangeArr.length != 0) {
            for (Range<Integer> range2 : rangeArr) {
                Range<Integer> rangeF = f(range2);
                if (((Integer) rangeF.getUpper()).intValue() == 30 && (range == null || ((Integer) rangeF.getLower()).intValue() < ((Integer) range.getLower()).intValue())) {
                    range = rangeF;
                }
            }
        }
        return range;
    }

    public Range<Integer> g() {
        return this.f9375a;
    }
}
