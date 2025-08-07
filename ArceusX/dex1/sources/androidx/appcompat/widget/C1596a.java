package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

class C1596a extends Drawable {

    final ActionBarContainer f9238a;

    private static class C0070a {
        public static void a(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }
    }

    public C1596a(ActionBarContainer actionBarContainer) {
        this.f9238a = actionBarContainer;
    }

    @Override
    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f9238a;
        if (actionBarContainer.mIsSplit) {
            Drawable drawable = actionBarContainer.mSplitBackground;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.mBackground;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f9238a;
        Drawable drawable3 = actionBarContainer2.mStackedBackground;
        if (drawable3 == null || !actionBarContainer2.mIsStacked) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override
    public int getOpacity() {
        return 0;
    }

    @Override
    public void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f9238a;
        if (actionBarContainer.mIsSplit) {
            if (actionBarContainer.mSplitBackground != null) {
                C0070a.a(actionBarContainer.mBackground, outline);
            }
        } else {
            Drawable drawable = actionBarContainer.mBackground;
            if (drawable != null) {
                C0070a.a(drawable, outline);
            }
        }
    }

    @Override
    public void setAlpha(int i7) {
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
