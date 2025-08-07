package com.google.mlkit.vision.text.internal;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.internal.mlkit_vision_text_common.zzf;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

final class d {
    static Rect a(List list) {
        Iterator it = list.iterator();
        int iMax = Integer.MIN_VALUE;
        int iMin = Integer.MAX_VALUE;
        int iMin2 = Integer.MAX_VALUE;
        int iMax2 = Integer.MIN_VALUE;
        while (it.hasNext()) {
            Point point = (Point) it.next();
            iMin = Math.min(iMin, point.x);
            iMax = Math.max(iMax, point.x);
            iMin2 = Math.min(iMin2, point.y);
            iMax2 = Math.max(iMax2, point.y);
        }
        return new Rect(iMin, iMin2, iMax, iMax2);
    }

    static List b(zzf zzfVar) {
        double dSin = Math.sin(Math.toRadians(zzfVar.f15710w));
        double dCos = Math.cos(Math.toRadians(zzfVar.f15710w));
        double d7 = zzfVar.f15706d;
        double d8 = zzfVar.f15708i;
        Point point = new Point((int) (d7 + (d8 * dCos)), (int) (zzfVar.f15707e + (d8 * dSin)));
        double d9 = point.x;
        int i7 = zzfVar.f15709v;
        double d10 = i7 * dSin;
        double d11 = pointArr[1].y + (i7 * dCos);
        Point point2 = pointArr[0];
        int i8 = point2.x;
        Point point3 = pointArr[2];
        int i9 = point3.x;
        Point point4 = pointArr[1];
        Point[] pointArr = {new Point(zzfVar.f15706d, zzfVar.f15707e), point, new Point((int) (d9 - d10), (int) d11), new Point(i8 + (i9 - point4.x), point2.y + (point3.y - point4.y))};
        return Arrays.asList(pointArr);
    }
}
