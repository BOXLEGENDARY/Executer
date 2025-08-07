package u4;

import android.graphics.RectF;
import java.util.Arrays;

public final class i implements InterfaceC2933c {

    private final float f23962a;

    public i(float f7) {
        this.f23962a = f7;
    }

    private static float b(RectF rectF) {
        return Math.min(rectF.width(), rectF.height());
    }

    @Override
    public float a(RectF rectF) {
        return this.f23962a * b(rectF);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.f23962a == ((i) obj).f23962a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f23962a)});
    }
}
