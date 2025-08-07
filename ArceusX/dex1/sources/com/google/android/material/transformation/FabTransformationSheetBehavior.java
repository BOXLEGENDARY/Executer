package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.Z;
import c4.C1745a;
import com.google.android.material.transformation.FabTransformationBehavior;
import d4.C2395h;
import d4.C2397j;
import java.util.HashMap;
import java.util.Map;

@Deprecated
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    private Map<View, Integer> f18775i;

    public FabTransformationSheetBehavior() {
    }

    private void g0(View view, boolean z7) {
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z7) {
                this.f18775i = new HashMap(childCount);
            }
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = coordinatorLayout.getChildAt(i7);
                boolean z8 = (childAt.getLayoutParams() instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) childAt.getLayoutParams()).f() instanceof FabTransformationScrimBehavior);
                if (childAt != view && !z8) {
                    if (z7) {
                        this.f18775i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        Z.x0(childAt, 4);
                    } else {
                        Map<View, Integer> map = this.f18775i;
                        if (map != null && map.containsKey(childAt)) {
                            Z.x0(childAt, this.f18775i.get(childAt).intValue());
                        }
                    }
                }
            }
            if (z7) {
                return;
            }
            this.f18775i = null;
        }
    }

    @Override
    protected boolean H(View view, View view2, boolean z7, boolean z8) {
        g0(view2, z7);
        return super.H(view, view2, z7, z8);
    }

    @Override
    protected FabTransformationBehavior.e e0(Context context, boolean z7) {
        int i7 = z7 ? C1745a.f12704d : C1745a.f12703c;
        FabTransformationBehavior.e eVar = new FabTransformationBehavior.e();
        eVar.f18768a = C2395h.c(context, i7);
        eVar.f18769b = new C2397j(17, 0.0f, 0.0f);
        return eVar;
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
