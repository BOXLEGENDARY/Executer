package androidx.transition;

import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;

class C1724h {

    private static boolean f12322a = true;

    static class a {
        static void a(ImageView imageView, Matrix matrix) {
            imageView.animateTransform(matrix);
        }
    }

    static void a(ImageView imageView, Matrix matrix) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.a(imageView, matrix);
            return;
        }
        if (matrix != null) {
            b(imageView, matrix);
            return;
        }
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setBounds(0, 0, (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight(), (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom());
            imageView.invalidate();
        }
    }

    private static void b(ImageView imageView, Matrix matrix) {
        if (f12322a) {
            try {
                a.a(imageView, matrix);
            } catch (NoSuchMethodError unused) {
                f12322a = false;
            }
        }
    }
}
