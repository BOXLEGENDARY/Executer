package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.TintTypedArray;

public final class ExpandedMenuView extends ListView implements g.b, n, AdapterView.OnItemClickListener {

    private static final int[] f8882i = {R.attr.background, R.attr.divider};

    private g f8883d;

    private int f8884e;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    public int getWindowAnimations() {
        return this.f8884e;
    }

    @Override
    public void initialize(g gVar) {
        this.f8883d = gVar;
    }

    @Override
    public boolean invokeItem(i iVar) {
        return this.f8883d.L(iVar, 0);
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override
    public void onItemClick(AdapterView adapterView, View view, int i7, long j7) {
        invokeItem((i) getAdapter().getItem(i7));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, f8882i, i7, 0);
        if (tintTypedArrayObtainStyledAttributes.hasValue(0)) {
            setBackgroundDrawable(tintTypedArrayObtainStyledAttributes.getDrawable(0));
        }
        if (tintTypedArrayObtainStyledAttributes.hasValue(1)) {
            setDivider(tintTypedArrayObtainStyledAttributes.getDrawable(1));
        }
        tintTypedArrayObtainStyledAttributes.recycle();
    }
}
