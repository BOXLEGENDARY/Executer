package u4;

import android.graphics.RectF;
import java.util.Arrays;

public final class C2932b implements InterfaceC2933c {

    private final InterfaceC2933c f23909a;

    private final float f23910b;

    public C2932b(float f7, InterfaceC2933c interfaceC2933c) {
        while (interfaceC2933c instanceof C2932b) {
            interfaceC2933c = ((C2932b) interfaceC2933c).f23909a;
            f7 += ((C2932b) interfaceC2933c).f23910b;
        }
        this.f23909a = interfaceC2933c;
        this.f23910b = f7;
    }

    @Override
    public float a(RectF rectF) {
        return Math.max(0.0f, this.f23909a.a(rectF) + this.f23910b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2932b)) {
            return false;
        }
        C2932b c2932b = (C2932b) obj;
        return this.f23909a.equals(c2932b.f23909a) && this.f23910b == c2932b.f23910b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f23909a, Float.valueOf(this.f23910b)});
    }
}
