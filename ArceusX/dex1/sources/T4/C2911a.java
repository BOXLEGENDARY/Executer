package t4;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

public class C2911a {

    private static final int[] f23819i = new int[3];

    private static final float[] f23820j = {0.0f, 0.5f, 1.0f};

    private static final int[] f23821k = new int[4];

    private static final float[] f23822l = {0.0f, 0.0f, 0.5f, 1.0f};

    private final Paint f23823a;

    private final Paint f23824b;

    private final Paint f23825c;

    private int f23826d;

    private int f23827e;

    private int f23828f;

    private final Path f23829g;

    private final Paint f23830h;

    public C2911a() {
        this(-16777216);
    }

    public void a(Canvas canvas, Matrix matrix, RectF rectF, int i7, float f7, float f8) {
        boolean z7 = f8 < 0.0f;
        Path path = this.f23829g;
        if (z7) {
            int[] iArr = f23821k;
            iArr[0] = 0;
            iArr[1] = this.f23828f;
            iArr[2] = this.f23827e;
            iArr[3] = this.f23826d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f7, f8);
            path.close();
            float f9 = -i7;
            rectF.inset(f9, f9);
            int[] iArr2 = f23821k;
            iArr2[0] = 0;
            iArr2[1] = this.f23826d;
            iArr2[2] = this.f23827e;
            iArr2[3] = this.f23828f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f10 = 1.0f - (i7 / fWidth);
        float[] fArr = f23822l;
        fArr[1] = f10;
        fArr[2] = ((1.0f - f10) / 2.0f) + f10;
        this.f23824b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, f23821k, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z7) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f23830h);
        }
        canvas.drawArc(rectF, f7, f8, true, this.f23824b);
        canvas.restore();
    }

    public void b(Canvas canvas, Matrix matrix, RectF rectF, int i7) {
        rectF.bottom += i7;
        rectF.offset(0.0f, -i7);
        int[] iArr = f23819i;
        iArr[0] = this.f23828f;
        iArr[1] = this.f23827e;
        iArr[2] = this.f23826d;
        Paint paint = this.f23825c;
        float f7 = rectF.left;
        paint.setShader(new LinearGradient(f7, rectF.top, f7, rectF.bottom, iArr, f23820j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f23825c);
        canvas.restore();
    }

    public Paint c() {
        return this.f23823a;
    }

    public void d(int i7) {
        this.f23826d = androidx.core.graphics.a.l(i7, 68);
        this.f23827e = androidx.core.graphics.a.l(i7, 20);
        this.f23828f = androidx.core.graphics.a.l(i7, 0);
        this.f23823a.setColor(this.f23826d);
    }

    public C2911a(int i7) {
        this.f23829g = new Path();
        Paint paint = new Paint();
        this.f23830h = paint;
        this.f23823a = new Paint();
        d(i7);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f23824b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f23825c = new Paint(paint2);
    }
}
