package com.google.android.material.carousel;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

abstract class c {

    final int f17568a;

    class a extends c {

        final CarouselLayoutManager f17569b;

        a(int i7, CarouselLayoutManager carouselLayoutManager) {
            super(i7, null);
            this.f17569b = carouselLayoutManager;
        }

        @Override
        public void a(RectF rectF, RectF rectF2, RectF rectF3) {
            float f7 = rectF2.top;
            float f8 = rectF3.top;
            if (f7 < f8 && rectF2.bottom > f8) {
                float f9 = f8 - f7;
                rectF.top += f9;
                rectF3.top += f9;
            }
            float f10 = rectF2.bottom;
            float f11 = rectF3.bottom;
            if (f10 <= f11 || rectF2.top >= f11) {
                return;
            }
            float f12 = f10 - f11;
            rectF.bottom = Math.max(rectF.bottom - f12, rectF.top);
            rectF2.bottom = Math.max(rectF2.bottom - f12, rectF2.top);
        }

        @Override
        public float e(RecyclerView.q qVar) {
            return ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override
        public RectF f(float f7, float f8, float f9, float f10) {
            return new RectF(0.0f, f9, f8, f7 - f9);
        }

        @Override
        int g() {
            return this.f17569b.b0();
        }

        @Override
        int h() {
            return g();
        }

        @Override
        int i() {
            return this.f17569b.i0();
        }

        @Override
        int j() {
            return this.f17569b.s0() - this.f17569b.j0();
        }

        @Override
        int k() {
            return l();
        }

        @Override
        int l() {
            return 0;
        }

        @Override
        public void m(View view, int i7, int i8) {
            int i9 = i();
            this.f17569b.D0(view, i9, i7, i9 + p(view), i8);
        }

        @Override
        public void n(RectF rectF, RectF rectF2, RectF rectF3) {
            if (rectF2.bottom <= rectF3.top) {
                float fFloor = ((float) Math.floor(rectF.bottom)) - 1.0f;
                rectF.bottom = fFloor;
                rectF.top = Math.min(rectF.top, fFloor);
            }
            if (rectF2.top >= rectF3.bottom) {
                float fCeil = ((float) Math.ceil(rectF.top)) + 1.0f;
                rectF.top = fCeil;
                rectF.bottom = Math.max(fCeil, rectF.bottom);
            }
        }

        @Override
        public void o(View view, Rect rect, float f7, float f8) {
            view.offsetTopAndBottom((int) (f8 - (rect.top + f7)));
        }

        int p(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f17569b.X(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }
    }

    class b extends c {

        final CarouselLayoutManager f17570b;

        b(int i7, CarouselLayoutManager carouselLayoutManager) {
            super(i7, null);
            this.f17570b = carouselLayoutManager;
        }

        @Override
        public void a(RectF rectF, RectF rectF2, RectF rectF3) {
            float f7 = rectF2.left;
            float f8 = rectF3.left;
            if (f7 < f8 && rectF2.right > f8) {
                float f9 = f8 - f7;
                rectF.left += f9;
                rectF2.left += f9;
            }
            float f10 = rectF2.right;
            float f11 = rectF3.right;
            if (f10 <= f11 || rectF2.left >= f11) {
                return;
            }
            float f12 = f10 - f11;
            rectF.right = Math.max(rectF.right - f12, rectF.left);
            rectF2.right = Math.max(rectF2.right - f12, rectF2.left);
        }

        @Override
        public float e(RecyclerView.q qVar) {
            return ((ViewGroup.MarginLayoutParams) qVar).rightMargin + ((ViewGroup.MarginLayoutParams) qVar).leftMargin;
        }

        @Override
        public RectF f(float f7, float f8, float f9, float f10) {
            return new RectF(f10, 0.0f, f8 - f10, f7);
        }

        @Override
        int g() {
            return this.f17570b.b0() - this.f17570b.h0();
        }

        @Override
        int h() {
            return this.f17570b.F2() ? i() : j();
        }

        @Override
        int i() {
            return 0;
        }

        @Override
        int j() {
            return this.f17570b.s0();
        }

        @Override
        int k() {
            return this.f17570b.F2() ? j() : i();
        }

        @Override
        int l() {
            return this.f17570b.k0();
        }

        @Override
        public void m(View view, int i7, int i8) {
            int iL = l();
            this.f17570b.D0(view, i7, iL, i8, iL + p(view));
        }

        @Override
        public void n(RectF rectF, RectF rectF2, RectF rectF3) {
            if (rectF2.right <= rectF3.left) {
                float fFloor = ((float) Math.floor(rectF.right)) - 1.0f;
                rectF.right = fFloor;
                rectF.left = Math.min(rectF.left, fFloor);
            }
            if (rectF2.left >= rectF3.right) {
                float fCeil = ((float) Math.ceil(rectF.left)) + 1.0f;
                rectF.left = fCeil;
                rectF.right = Math.max(fCeil, rectF.right);
            }
        }

        @Override
        public void o(View view, Rect rect, float f7, float f8) {
            view.offsetLeftAndRight((int) (f8 - (rect.left + f7)));
        }

        int p(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f17570b.W(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }
    }

    c(int i7, a aVar) {
        this(i7);
    }

    private static c b(CarouselLayoutManager carouselLayoutManager) {
        return new b(0, carouselLayoutManager);
    }

    static c c(CarouselLayoutManager carouselLayoutManager, int i7) {
        if (i7 == 0) {
            return b(carouselLayoutManager);
        }
        if (i7 == 1) {
            return d(carouselLayoutManager);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    private static c d(CarouselLayoutManager carouselLayoutManager) {
        return new a(1, carouselLayoutManager);
    }

    abstract void a(RectF rectF, RectF rectF2, RectF rectF3);

    abstract float e(RecyclerView.q qVar);

    abstract RectF f(float f7, float f8, float f9, float f10);

    abstract int g();

    abstract int h();

    abstract int i();

    abstract int j();

    abstract int k();

    abstract int l();

    abstract void m(View view, int i7, int i8);

    abstract void n(RectF rectF, RectF rectF2, RectF rectF3);

    abstract void o(View view, Rect rect, float f7, float f8);

    private c(int i7) {
        this.f17568a = i7;
    }
}
