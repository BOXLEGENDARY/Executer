package androidx.transition;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;

class C1726j {

    static class a {
        static <T, V> ObjectAnimator a(T t7, Property<T, V> property, Path path) {
            return ObjectAnimator.ofObject(t7, property, (TypeConverter) null, path);
        }
    }

    static <T> ObjectAnimator a(T t7, Property<T, PointF> property, Path path) {
        return a.a(t7, property, path);
    }
}
