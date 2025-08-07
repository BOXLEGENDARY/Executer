package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import g.C2447a;

public class AppCompatRatingBar extends RatingBar {
    private final j mAppCompatProgressBarHelper;

    public AppCompatRatingBar(Context context) {
        this(context, null);
    }

    @Override
    protected synchronized void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        Bitmap bitmapB = this.mAppCompatProgressBarHelper.b();
        if (bitmapB != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmapB.getWidth() * getNumStars(), i7, 0), getMeasuredHeight());
        }
    }

    public AppCompatRatingBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2447a.f20531L);
    }

    public AppCompatRatingBar(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        ThemeUtils.checkAppCompatTheme(this, getContext());
        j jVar = new j(this);
        this.mAppCompatProgressBarHelper = jVar;
        jVar.c(attributeSet, i7);
    }
}
