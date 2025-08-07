package androidx.transition;

import android.graphics.Matrix;
import android.view.View;

class S extends Q {
    S() {
    }

    @Override
    public float b(View view) {
        return view.getTransitionAlpha();
    }

    @Override
    public void d(View view, int i7, int i8, int i9, int i10) {
        view.setLeftTopRightBottom(i7, i8, i9, i10);
    }

    @Override
    public void e(View view, float f7) {
        view.setTransitionAlpha(f7);
    }

    @Override
    public void f(View view, int i7) {
        view.setTransitionVisibility(i7);
    }

    @Override
    public void g(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override
    public void h(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
