package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import g.C2447a;

public class AppCompatSeekBar extends SeekBar {
    private final l mAppCompatSeekBarHelper;

    public AppCompatSeekBar(Context context) {
        this(context, null);
    }

    @Override
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.mAppCompatSeekBarHelper.h();
    }

    @Override
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.mAppCompatSeekBarHelper.i();
    }

    @Override
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.mAppCompatSeekBarHelper.g(canvas);
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2447a.f20533N);
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        ThemeUtils.checkAppCompatTheme(this, getContext());
        l lVar = new l(this);
        this.mAppCompatSeekBarHelper = lVar;
        lVar.c(attributeSet, i7);
    }
}
