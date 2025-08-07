package r4;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;

public class C2753b {
    public static TypedValue a(Context context, int i7) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i7, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean b(Context context, int i7, boolean z7) {
        TypedValue typedValueA = a(context, i7);
        return (typedValueA == null || typedValueA.type != 18) ? z7 : typedValueA.data != 0;
    }

    public static int c(Context context, int i7, int i8) {
        TypedValue typedValueA = a(context, i7);
        return (typedValueA == null || typedValueA.type != 16) ? i8 : typedValueA.data;
    }

    public static int d(Context context, int i7, String str) {
        return e(context, i7, str).data;
    }

    public static TypedValue e(Context context, int i7, String str) {
        TypedValue typedValueA = a(context, i7);
        if (typedValueA != null) {
            return typedValueA;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i7)));
    }

    public static TypedValue f(View view, int i7) {
        return e(view.getContext(), i7, view.getClass().getCanonicalName());
    }
}
