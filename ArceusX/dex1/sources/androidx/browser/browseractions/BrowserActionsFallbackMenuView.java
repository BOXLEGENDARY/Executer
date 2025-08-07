package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import o.C2673a;

@Deprecated
public class BrowserActionsFallbackMenuView extends LinearLayout {

    private final int f9373d;

    private final int f9374e;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9373d = getResources().getDimensionPixelOffset(C2673a.f22314b);
        this.f9374e = getResources().getDimensionPixelOffset(C2673a.f22313a);
    }

    @Override
    protected void onMeasure(int i7, int i8) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f9373d * 2), this.f9374e), 1073741824), i8);
    }
}
