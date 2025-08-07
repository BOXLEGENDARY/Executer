package j1;

import android.view.View;
import android.view.ViewGroup;

public class b {
    public static <T extends View> T a(View view, int i7) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            T t7 = (T) viewGroup.getChildAt(i8).findViewById(i7);
            if (t7 != null) {
                return t7;
            }
        }
        return null;
    }
}
