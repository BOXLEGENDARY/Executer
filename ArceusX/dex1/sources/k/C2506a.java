package k;

import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

public class C2506a implements TransformationMethod {

    private Locale f21156d;

    public C2506a(Context context) {
        this.f21156d = context.getResources().getConfiguration().locale;
    }

    @Override
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.f21156d);
        }
        return null;
    }

    @Override
    public void onFocusChanged(View view, CharSequence charSequence, boolean z7, int i7, Rect rect) {
    }
}
