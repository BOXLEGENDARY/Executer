package K0;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

class h implements TransformationMethod {

    private final TransformationMethod f1762d;

    h(TransformationMethod transformationMethod) {
        this.f1762d = transformationMethod;
    }

    public TransformationMethod a() {
        return this.f1762d;
    }

    @Override
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f1762d;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        return (charSequence == null || androidx.emoji2.text.f.b().d() != 1) ? charSequence : androidx.emoji2.text.f.b().o(charSequence);
    }

    @Override
    public void onFocusChanged(View view, CharSequence charSequence, boolean z7, int i7, Rect rect) {
        TransformationMethod transformationMethod = this.f1762d;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z7, i7, rect);
        }
    }
}
