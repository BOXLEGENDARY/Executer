package u4;

import android.graphics.RectF;
import java.util.Arrays;

public final class C2931a implements InterfaceC2933c {

    private final float f23908a;

    public C2931a(float f7) {
        this.f23908a = f7;
    }

    @Override
    public float a(RectF rectF) {
        return this.f23908a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2931a) && this.f23908a == ((C2931a) obj).f23908a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f23908a)});
    }
}
