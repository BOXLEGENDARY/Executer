package androidx.core.view;

import android.view.View;

public interface F {
    void onNestedPreScroll(View view, int i7, int i8, int[] iArr, int i9);

    void onNestedScroll(View view, int i7, int i8, int i9, int i10, int i11);

    void onNestedScrollAccepted(View view, View view2, int i7, int i8);

    boolean onStartNestedScroll(View view, View view2, int i7, int i8);

    void onStopNestedScroll(View view, int i7);
}
