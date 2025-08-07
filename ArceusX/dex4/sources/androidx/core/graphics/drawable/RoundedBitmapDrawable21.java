package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.Gravity;
import androidx.annotation.RequiresApi;
import androidx.core.view.MotionEventCompat;

@RequiresApi(MotionEventCompat.AXIS_WHEEL)
class RoundedBitmapDrawable21 extends RoundedBitmapDrawable {
    protected RoundedBitmapDrawable21(Resources res, Bitmap bitmap) {
        super(res, bitmap);
    }

    @Override
    public void getOutline(Outline outline) {
        updateDstRect();
        outline.setRoundRect(this.mDstRect, getCornerRadius());
    }

    @Override
    public void setMipMap(boolean mipMap) {
        Bitmap bitmap = this.mBitmap;
        if (bitmap != null) {
            bitmap.setHasMipMap(mipMap);
            invalidateSelf();
        }
    }

    @Override
    public boolean hasMipMap() {
        Bitmap bitmap = this.mBitmap;
        return bitmap != null && bitmap.hasMipMap();
    }

    @Override
    void gravityCompatApply(int gravity, int bitmapWidth, int bitmapHeight, Rect bounds, Rect outRect) {
        Gravity.apply(gravity, bitmapWidth, bitmapHeight, bounds, outRect, 0);
    }
}
