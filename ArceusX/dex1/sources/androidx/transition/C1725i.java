package androidx.transition;

import android.graphics.Matrix;
import android.graphics.RectF;

class C1725i {

    static final Matrix f12323a = new a();

    class a extends Matrix {
        a() {
        }

        void a() {
            throw new IllegalStateException("Matrix can not be modified");
        }

        @Override
        public boolean postConcat(Matrix matrix) {
            a();
            return false;
        }

        @Override
        public boolean postRotate(float f7, float f8, float f9) {
            a();
            return false;
        }

        @Override
        public boolean postScale(float f7, float f8, float f9, float f10) {
            a();
            return false;
        }

        @Override
        public boolean postSkew(float f7, float f8, float f9, float f10) {
            a();
            return false;
        }

        @Override
        public boolean postTranslate(float f7, float f8) {
            a();
            return false;
        }

        @Override
        public boolean preConcat(Matrix matrix) {
            a();
            return false;
        }

        @Override
        public boolean preRotate(float f7, float f8, float f9) {
            a();
            return false;
        }

        @Override
        public boolean preScale(float f7, float f8, float f9, float f10) {
            a();
            return false;
        }

        @Override
        public boolean preSkew(float f7, float f8, float f9, float f10) {
            a();
            return false;
        }

        @Override
        public boolean preTranslate(float f7, float f8) {
            a();
            return false;
        }

        @Override
        public void reset() {
            a();
        }

        @Override
        public void set(Matrix matrix) {
            a();
        }

        @Override
        public boolean setConcat(Matrix matrix, Matrix matrix2) {
            a();
            return false;
        }

        @Override
        public boolean setPolyToPoly(float[] fArr, int i7, float[] fArr2, int i8, int i9) {
            a();
            return false;
        }

        @Override
        public boolean setRectToRect(RectF rectF, RectF rectF2, Matrix.ScaleToFit scaleToFit) {
            a();
            return false;
        }

        @Override
        public void setRotate(float f7, float f8, float f9) {
            a();
        }

        @Override
        public void setScale(float f7, float f8, float f9, float f10) {
            a();
        }

        @Override
        public void setSinCos(float f7, float f8, float f9, float f10) {
            a();
        }

        @Override
        public void setSkew(float f7, float f8, float f9, float f10) {
            a();
        }

        @Override
        public void setTranslate(float f7, float f8) {
            a();
        }

        @Override
        public void setValues(float[] fArr) {
            a();
        }

        @Override
        public boolean postRotate(float f7) {
            a();
            return false;
        }

        @Override
        public boolean postScale(float f7, float f8) {
            a();
            return false;
        }

        @Override
        public boolean postSkew(float f7, float f8) {
            a();
            return false;
        }

        @Override
        public boolean preRotate(float f7) {
            a();
            return false;
        }

        @Override
        public boolean preScale(float f7, float f8) {
            a();
            return false;
        }

        @Override
        public boolean preSkew(float f7, float f8) {
            a();
            return false;
        }

        @Override
        public void setRotate(float f7) {
            a();
        }

        @Override
        public void setScale(float f7, float f8) {
            a();
        }

        @Override
        public void setSinCos(float f7, float f8) {
            a();
        }

        @Override
        public void setSkew(float f7, float f8) {
            a();
        }
    }
}
