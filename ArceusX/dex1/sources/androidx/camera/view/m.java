package androidx.camera.view;

import K0.wJ.BtcVLuo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import androidx.camera.view.PreviewView;
import z.C3043d0;
import z.F0;

final class m {

    private static final PreviewView.d f9681i = PreviewView.d.FILL_CENTER;

    private Size f9682a;

    private Rect f9683b;

    private int f9684c;

    private Matrix f9685d;

    private int f9686e;

    private boolean f9687f;

    private boolean f9688g;

    private PreviewView.d f9689h = f9681i;

    static class a {

        static final int[] f9690a;

        static {
            int[] iArr = new int[PreviewView.d.values().length];
            f9690a = iArr;
            try {
                iArr[PreviewView.d.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9690a[PreviewView.d.FILL_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9690a[PreviewView.d.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9690a[PreviewView.d.FILL_END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9690a[PreviewView.d.FIT_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9690a[PreviewView.d.FILL_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    m() {
    }

    private static RectF b(RectF rectF, float f7) {
        float f8 = f7 + f7;
        return new RectF(f8 - rectF.right, rectF.top, f8 - rectF.left, rectF.bottom);
    }

    private int e() {
        return !this.f9688g ? this.f9684c : -E.c.b(this.f9686e);
    }

    private Size f() {
        return E.q.i(this.f9684c) ? new Size(this.f9683b.height(), this.f9683b.width()) : new Size(this.f9683b.width(), this.f9683b.height());
    }

    private RectF l(Size size, int i7) {
        x0.g.i(m());
        Matrix matrixJ = j(size, i7);
        RectF rectF = new RectF(0.0f, 0.0f, this.f9682a.getWidth(), this.f9682a.getHeight());
        matrixJ.mapRect(rectF);
        return rectF;
    }

    private boolean m() {
        return (this.f9683b == null || this.f9682a == null || !(!this.f9688g || this.f9686e != -1)) ? false : true;
    }

    private static void p(Matrix matrix, RectF rectF, RectF rectF2, PreviewView.d dVar) {
        Matrix.ScaleToFit scaleToFit;
        switch (a.f9690a[dVar.ordinal()]) {
            case 1:
            case 2:
                scaleToFit = Matrix.ScaleToFit.CENTER;
                break;
            case 3:
            case 4:
                scaleToFit = Matrix.ScaleToFit.END;
                break;
            case 5:
            case 6:
                scaleToFit = Matrix.ScaleToFit.START;
                break;
            default:
                C3043d0.c("PreviewTransform", "Unexpected crop rect: " + dVar);
                scaleToFit = Matrix.ScaleToFit.FILL;
                break;
        }
        if (dVar == PreviewView.d.FIT_CENTER || dVar == PreviewView.d.FIT_START || dVar == PreviewView.d.FIT_END) {
            matrix.setRectToRect(rectF, rectF2, scaleToFit);
        } else {
            matrix.setRectToRect(rectF2, rectF, scaleToFit);
            matrix.invert(matrix);
        }
    }

    Bitmap a(Bitmap bitmap, Size size, int i7) {
        if (!m()) {
            return bitmap;
        }
        Matrix matrixK = k();
        RectF rectFL = l(size, i7);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), bitmap.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Matrix matrix = new Matrix();
        matrix.postConcat(matrixK);
        matrix.postScale(rectFL.width() / this.f9682a.getWidth(), rectFL.height() / this.f9682a.getHeight());
        matrix.postTranslate(rectFL.left, rectFL.top);
        canvas.drawBitmap(bitmap, matrix, new Paint(7));
        return bitmapCreateBitmap;
    }

    Matrix c(Size size, int i7, Rect rect) {
        if (!m()) {
            return null;
        }
        Matrix matrix = new Matrix();
        h(size, i7).invert(matrix);
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(new RectF(0.0f, 0.0f, rect.width(), rect.height()), new RectF(0.0f, 0.0f, 1.0f, 1.0f), Matrix.ScaleToFit.FILL);
        matrix.postConcat(matrix2);
        return matrix;
    }

    RectF d(Size size, int i7) {
        RectF rectF = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
        Size sizeF = f();
        RectF rectF2 = new RectF(0.0f, 0.0f, sizeF.getWidth(), sizeF.getHeight());
        Matrix matrix = new Matrix();
        p(matrix, rectF2, rectF, this.f9689h);
        matrix.mapRect(rectF2);
        return i7 == 1 ? b(rectF2, size.getWidth() / 2.0f) : rectF2;
    }

    PreviewView.d g() {
        return this.f9689h;
    }

    Matrix h(Size size, int i7) {
        if (!m()) {
            return null;
        }
        Matrix matrix = new Matrix(this.f9685d);
        matrix.postConcat(j(size, i7));
        return matrix;
    }

    Rect i() {
        return this.f9683b;
    }

    Matrix j(Size size, int i7) {
        x0.g.i(m());
        Matrix matrixD = E.q.d(new RectF(this.f9683b), n(size) ? new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()) : d(size, i7), this.f9684c);
        if (this.f9687f && this.f9688g) {
            if (E.q.i(this.f9684c)) {
                matrixD.preScale(1.0f, -1.0f, this.f9683b.centerX(), this.f9683b.centerY());
            } else {
                matrixD.preScale(-1.0f, 1.0f, this.f9683b.centerX(), this.f9683b.centerY());
            }
        }
        return matrixD;
    }

    Matrix k() {
        x0.g.i(m());
        RectF rectF = new RectF(0.0f, 0.0f, this.f9682a.getWidth(), this.f9682a.getHeight());
        return E.q.d(rectF, rectF, e());
    }

    boolean n(Size size) {
        return E.q.k(size, true, f(), false);
    }

    void o(int i7, int i8) {
        if (this.f9688g) {
            this.f9684c = i7;
            this.f9686e = i8;
        }
    }

    void q(PreviewView.d dVar) {
        this.f9689h = dVar;
    }

    void r(F0.h hVar, Size size, boolean z7) {
        C3043d0.a("PreviewTransform", "Transformation info set: " + hVar + " " + size + " " + z7);
        this.f9683b = hVar.a();
        this.f9684c = hVar.b();
        this.f9686e = hVar.d();
        this.f9682a = size;
        this.f9687f = z7;
        this.f9688g = hVar.e();
        this.f9685d = hVar.c();
    }

    void s(Size size, int i7, View view) {
        if (size.getHeight() == 0 || size.getWidth() == 0) {
            C3043d0.l("PreviewTransform", "Transform not applied due to PreviewView size: " + size);
            return;
        }
        if (m()) {
            if (view instanceof TextureView) {
                ((TextureView) view).setTransform(k());
            } else {
                Display display = view.getDisplay();
                boolean z7 = false;
                boolean z8 = (!this.f9688g || display == null || display.getRotation() == this.f9686e) ? false : true;
                if (!this.f9688g && e() != 0) {
                    z7 = true;
                }
                if (z8 || z7) {
                    C3043d0.c("PreviewTransform", BtcVLuo.SSfmhAnEmi);
                }
            }
            RectF rectFL = l(size, i7);
            view.setPivotX(0.0f);
            view.setPivotY(0.0f);
            view.setScaleX(rectFL.width() / this.f9682a.getWidth());
            view.setScaleY(rectFL.height() / this.f9682a.getHeight());
            view.setTranslationX(rectFL.left - view.getLeft());
            view.setTranslationY(rectFL.top - view.getTop());
        }
    }
}
