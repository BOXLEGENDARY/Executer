package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.transition.A;
import androidx.transition.AbstractC1733q;
import java.util.Map;

public class C1720d extends AbstractC1733q {

    private static final String[] f12293g0 = {"android:changeImageTransform:matrix", "android:changeImageTransform:bounds"};

    private static final TypeEvaluator<Matrix> f12294h0 = new a();

    private static final Property<ImageView, Matrix> f12295i0 = new b(Matrix.class, "animatedTransform");

    class a implements TypeEvaluator<Matrix> {
        a() {
        }

        @Override
        public Matrix evaluate(float f7, Matrix matrix, Matrix matrix2) {
            return null;
        }
    }

    class b extends Property<ImageView, Matrix> {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override
        public Matrix get(ImageView imageView) {
            return null;
        }

        @Override
        public void set(ImageView imageView, Matrix matrix) {
            C1724h.a(imageView, matrix);
        }
    }

    static class c {

        static final int[] f12296a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f12296a = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12296a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private static class C0122d extends AnimatorListenerAdapter implements AbstractC1733q.f {

        private final ImageView f12297a;

        private final Matrix f12298b;

        private final Matrix f12299c;

        private boolean f12300d = true;

        C0122d(ImageView imageView, Matrix matrix, Matrix matrix2) {
            this.f12297a = imageView;
            this.f12298b = matrix;
            this.f12299c = matrix2;
        }

        private void h() {
            ImageView imageView = this.f12297a;
            int i7 = C1728l.f12327d;
            Matrix matrix = (Matrix) imageView.getTag(i7);
            if (matrix != null) {
                C1724h.a(this.f12297a, matrix);
                this.f12297a.setTag(i7, null);
            }
        }

        private void i(Matrix matrix) {
            this.f12297a.setTag(C1728l.f12327d, matrix);
            C1724h.a(this.f12297a, this.f12299c);
        }

        @Override
        public void a(AbstractC1733q abstractC1733q) {
        }

        @Override
        public void b(AbstractC1733q abstractC1733q) {
            if (this.f12300d) {
                i(this.f12298b);
            }
        }

        @Override
        public void d(AbstractC1733q abstractC1733q) {
        }

        @Override
        public void e(AbstractC1733q abstractC1733q) {
        }

        @Override
        public void g(AbstractC1733q abstractC1733q) {
            h();
        }

        @Override
        public void onAnimationEnd(Animator animator, boolean z7) {
            this.f12300d = z7;
        }

        @Override
        public void onAnimationPause(Animator animator) {
            i((Matrix) ((ObjectAnimator) animator).getAnimatedValue());
        }

        @Override
        public void onAnimationResume(Animator animator) {
            h();
        }

        @Override
        public void onAnimationStart(Animator animator, boolean z7) {
            this.f12300d = false;
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            this.f12300d = false;
        }

        @Override
        public void onAnimationStart(Animator animator) {
            this.f12300d = false;
        }
    }

    private void o0(B b2, boolean z7) {
        View view = b2.f12210b;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() == null) {
                return;
            }
            Map<String, Object> map = b2.f12209a;
            map.put("android:changeImageTransform:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            Matrix matrixQ0 = z7 ? (Matrix) imageView.getTag(C1728l.f12327d) : null;
            if (matrixQ0 == null) {
                matrixQ0 = q0(imageView);
            }
            map.put("android:changeImageTransform:matrix", matrixQ0);
        }
    }

    private static Matrix p0(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        float width = imageView.getWidth();
        float f7 = intrinsicWidth;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        float height = imageView.getHeight();
        float f8 = intrinsicHeight;
        float fMax = Math.max(width / f7, height / f8);
        int iRound = Math.round((width - (f7 * fMax)) / 2.0f);
        int iRound2 = Math.round((height - (f8 * fMax)) / 2.0f);
        Matrix matrix = new Matrix();
        matrix.postScale(fMax, fMax);
        matrix.postTranslate(iRound, iRound2);
        return matrix;
    }

    private static Matrix q0(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            return new Matrix(imageView.getImageMatrix());
        }
        int i7 = c.f12296a[imageView.getScaleType().ordinal()];
        return i7 != 1 ? i7 != 2 ? new Matrix(imageView.getImageMatrix()) : p0(imageView) : t0(imageView);
    }

    private ObjectAnimator r0(ImageView imageView, Matrix matrix, Matrix matrix2) {
        return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) f12295i0, (TypeEvaluator) new A.b(), (Object[]) new Matrix[]{matrix, matrix2});
    }

    private ObjectAnimator s0(ImageView imageView) {
        Property<ImageView, Matrix> property = f12295i0;
        TypeEvaluator<Matrix> typeEvaluator = f12294h0;
        Matrix matrix = C1725i.f12323a;
        return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) property, (TypeEvaluator) typeEvaluator, (Object[]) new Matrix[]{matrix, matrix});
    }

    private static Matrix t0(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        Matrix matrix = new Matrix();
        matrix.postScale(imageView.getWidth() / drawable.getIntrinsicWidth(), imageView.getHeight() / drawable.getIntrinsicHeight());
        return matrix;
    }

    @Override
    public String[] J() {
        return f12293g0;
    }

    @Override
    public void g(B b2) {
        o0(b2, false);
    }

    @Override
    public void j(B b2) {
        o0(b2, true);
    }

    @Override
    public Animator o(ViewGroup viewGroup, B b2, B b3) {
        if (b2 != null && b3 != null) {
            Rect rect = (Rect) b2.f12209a.get("android:changeImageTransform:bounds");
            Rect rect2 = (Rect) b3.f12209a.get("android:changeImageTransform:bounds");
            if (rect != null && rect2 != null) {
                Matrix matrix = (Matrix) b2.f12209a.get("android:changeImageTransform:matrix");
                Matrix matrix2 = (Matrix) b3.f12209a.get("android:changeImageTransform:matrix");
                boolean z7 = (matrix == null && matrix2 == null) || (matrix != null && matrix.equals(matrix2));
                if (rect.equals(rect2) && z7) {
                    return null;
                }
                ImageView imageView = (ImageView) b3.f12210b;
                Drawable drawable = imageView.getDrawable();
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
                    return s0(imageView);
                }
                if (matrix == null) {
                    matrix = C1725i.f12323a;
                }
                if (matrix2 == null) {
                    matrix2 = C1725i.f12323a;
                }
                f12295i0.set(imageView, matrix);
                ObjectAnimator objectAnimatorR0 = r0(imageView, matrix, matrix2);
                C0122d c0122d = new C0122d(imageView, matrix, matrix2);
                objectAnimatorR0.addListener(c0122d);
                objectAnimatorR0.addPauseListener(c0122d);
                a(c0122d);
                return objectAnimatorR0;
            }
        }
        return null;
    }
}
