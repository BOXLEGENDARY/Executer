package t5;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.internal.mlkit_vision_barcode.zzu;
import s5.InterfaceC2885a;

public final class c implements InterfaceC2885a {

    private final zzu f23832a;

    public c(zzu zzuVar) {
        this.f23832a = zzuVar;
    }

    @Override
    public final Rect a() {
        zzu zzuVar = this.f23832a;
        if (zzuVar.f15477w == null) {
            return null;
        }
        int i7 = 0;
        int iMax = Integer.MIN_VALUE;
        int iMin = Integer.MAX_VALUE;
        int iMin2 = Integer.MAX_VALUE;
        int iMax2 = Integer.MIN_VALUE;
        while (true) {
            Point[] pointArr = zzuVar.f15477w;
            if (i7 >= pointArr.length) {
                return new Rect(iMin, iMin2, iMax, iMax2);
            }
            Point point = pointArr[i7];
            iMin = Math.min(iMin, point.x);
            iMax = Math.max(iMax, point.x);
            iMin2 = Math.min(iMin2, point.y);
            iMax2 = Math.max(iMax2, point.y);
            i7++;
        }
    }

    @Override
    public final String b() {
        return this.f23832a.f15474e;
    }

    @Override
    public final int c() {
        return this.f23832a.f15476v;
    }

    @Override
    public final Point[] d() {
        return this.f23832a.f15477w;
    }

    @Override
    public final int i() {
        return this.f23832a.f15473d;
    }
}
