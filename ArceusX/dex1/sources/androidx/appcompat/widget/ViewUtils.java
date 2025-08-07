package androidx.appcompat.widget;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import androidx.core.view.Z;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ViewUtils {
    static final boolean SDK_LEVEL_SUPPORTS_AUTOSIZE;
    private static final String TAG = "ViewUtils";
    private static Method sComputeFitSystemWindowsMethod;

    static {
        SDK_LEVEL_SUPPORTS_AUTOSIZE = Build.VERSION.SDK_INT >= 27;
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            sComputeFitSystemWindowsMethod = declaredMethod;
            if (declaredMethod.isAccessible()) {
                return;
            }
            sComputeFitSystemWindowsMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
            Log.d(TAG, "Could not find method computeFitSystemWindows. Oh well.");
        }
    }

    private ViewUtils() {
    }

    public static void computeFitSystemWindows(View view, Rect rect, Rect rect2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method = sComputeFitSystemWindowsMethod;
        if (method != null) {
            try {
                method.invoke(view, rect, rect2);
            } catch (Exception e7) {
                Log.d(TAG, "Could not invoke computeFitSystemWindows", e7);
            }
        }
    }

    public static boolean isLayoutRtl(View view) {
        return Z.z(view) == 1;
    }

    public static void makeOptionalFitsSystemWindows(View view) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(view, null);
        } catch (IllegalAccessException e7) {
            Log.d(TAG, "Could not invoke makeOptionalFitsSystemWindows", e7);
        } catch (NoSuchMethodException unused) {
            Log.d(TAG, "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e8) {
            Log.d(TAG, "Could not invoke makeOptionalFitsSystemWindows", e8);
        }
    }
}
