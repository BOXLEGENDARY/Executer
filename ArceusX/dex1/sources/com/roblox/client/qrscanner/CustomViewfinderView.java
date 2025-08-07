package com.roblox.client.qrscanner;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.a;
import com.roblox.client.I;

public class CustomViewfinderView extends View {

    private int f20222A;

    private final float f20223d;

    private final float f20224e;

    private final int f20225i;

    private final int f20226v;

    private final int f20227w;

    private final int f20228y;

    private int f20229z;

    public CustomViewfinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20223d = 16.0f;
        this.f20224e = 16.0f;
        this.f20225i = 400;
        this.f20226v = 80;
        this.f20227w = a(16.0f, context);
        this.f20228y = a(16.0f, context);
    }

    private int a(float f7, Context context) {
        return (int) (f7 * (context.getResources().getDisplayMetrics().densityDpi / 160));
    }

    private void b(Canvas canvas, Context context) {
        Rect rectE = e(context);
        int i7 = rectE.left;
        int i8 = rectE.top;
        int iWidth = rectE.width();
        Paint paint = new Paint();
        paint.setColor(2130706432);
        float f7 = i8;
        canvas.drawRect(0.0f, 0.0f, this.f20229z, f7, paint);
        float f8 = i8 + iWidth;
        canvas.drawRect(0.0f, f7, i7, f8, paint);
        canvas.drawRect(i7 + iWidth, f7, this.f20229z, f8, paint);
        canvas.drawRect(0.0f, f8, this.f20229z, this.f20222A, paint);
    }

    private void c(Canvas canvas, Context context, int i7, Rect rect) {
        Drawable drawableE = a.e(context, i7);
        drawableE.setBounds(rect);
        drawableE.draw(canvas);
    }

    private void d(Canvas canvas, Context context) {
        Rect rectE = e(context);
        int i7 = rectE.left;
        int i8 = rectE.top;
        int iWidth = rectE.width();
        Rect rect = new Rect();
        rect.set(i7, i8, this.f20227w + i7, this.f20228y + i8);
        c(canvas, context, I.f19462e, rect);
        int i9 = i7 + iWidth;
        rect.set(i9 - this.f20227w, i8, i9, this.f20228y + i8);
        c(canvas, context, I.f19464g, rect);
        int i10 = i8 + iWidth;
        rect.set(i7, i10 - this.f20228y, this.f20227w + i7, i10);
        c(canvas, context, I.f19461d, rect);
        rect.set(i9 - this.f20227w, i10 - this.f20228y, i9, i10);
        c(canvas, context, I.f19463f, rect);
    }

    private Rect e(Context context) {
        int iA = a(80.0f, context);
        int iA2 = a(400.0f, context);
        int i7 = this.f20229z;
        int i8 = i7 - (iA * 2);
        if (i8 > iA2) {
            iA = (i7 - iA2) / 2;
        } else {
            iA2 = i8;
        }
        int i9 = (this.f20222A - iA2) / 2;
        return new Rect(iA, i9, iA + iA2, iA2 + i9);
    }

    @Override
    public void onDraw(Canvas canvas) {
        Context context = getContext();
        this.f20229z = getWidth();
        this.f20222A = getHeight();
        b(canvas, context);
        d(canvas, context);
    }
}
