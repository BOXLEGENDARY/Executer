package v5;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.List;

public class C2947b {
    public static int a(int i7) {
        if (i7 == 0) {
            return 0;
        }
        if (i7 == 90) {
            return 1;
        }
        if (i7 == 180) {
            return 2;
        }
        if (i7 == 270) {
            return 3;
        }
        throw new IllegalArgumentException("Invalid rotation: " + i7);
    }

    public static void b(Point[] pointArr, Matrix matrix) {
        int length = pointArr.length;
        float[] fArr = new float[length + length];
        for (int i7 = 0; i7 < pointArr.length; i7++) {
            Point point = pointArr[i7];
            int i8 = i7 + i7;
            fArr[i8] = point.x;
            fArr[i8 + 1] = point.y;
        }
        matrix.mapPoints(fArr);
        for (int i9 = 0; i9 < pointArr.length; i9++) {
            int i10 = i9 + i9;
            pointArr[i9].set((int) fArr[i10], (int) fArr[i10 + 1]);
        }
    }

    public static void c(PointF pointF, Matrix matrix) {
        float[] fArr = {pointF.x, pointF.y};
        matrix.mapPoints(fArr);
        pointF.set(fArr[0], fArr[1]);
    }

    public static void d(List<PointF> list, Matrix matrix) {
        int size = list.size();
        float[] fArr = new float[size + size];
        for (int i7 = 0; i7 < list.size(); i7++) {
            int i8 = i7 + i7;
            fArr[i8] = list.get(i7).x;
            fArr[i8 + 1] = list.get(i7).y;
        }
        matrix.mapPoints(fArr);
        for (int i9 = 0; i9 < list.size(); i9++) {
            int i10 = i9 + i9;
            list.get(i9).set(fArr[i10], fArr[i10 + 1]);
        }
    }

    public static void e(Rect rect, Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }
}
