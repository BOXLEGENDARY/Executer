package t5;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyb;
import s5.InterfaceC2885a;

public final class b implements InterfaceC2885a {

    private final zzyb f23831a;

    public b(zzyb zzybVar) {
        this.f23831a = zzybVar;
    }

    @Override
    public final Rect a() {
        Point[] pointArrP = this.f23831a.p();
        if (pointArrP == null) {
            return null;
        }
        int iMax = Integer.MIN_VALUE;
        int iMin = Integer.MAX_VALUE;
        int iMin2 = Integer.MAX_VALUE;
        int iMax2 = Integer.MIN_VALUE;
        for (Point point : pointArrP) {
            iMin = Math.min(iMin, point.x);
            iMax = Math.max(iMax, point.x);
            iMin2 = Math.min(iMin2, point.y);
            iMax2 = Math.max(iMax2, point.y);
        }
        return new Rect(iMin, iMin2, iMax, iMax2);
    }

    @Override
    public final String b() {
        return this.f23831a.o();
    }

    @Override
    public final int c() {
        return this.f23831a.n();
    }

    @Override
    public final Point[] d() {
        return this.f23831a.p();
    }

    @Override
    public final int i() {
        return this.f23831a.l();
    }
}
