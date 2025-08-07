package com.airbnb.lottie;

import P1.i;
import P1.j;
import P1.k;
import P1.l;
import P1.m;
import P1.n;
import P1.o;
import P1.p;
import P1.q;
import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.Z;
import b2.h;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;

public class LottieAnimationView extends AppCompatImageView {
    private static final String M = "LottieAnimationView";
    private static final P1.g<Throwable> N = new a();
    private int A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private o H;
    private final Set<i> I;
    private int J;
    private com.airbnb.lottie.b<P1.d> K;
    private P1.d L;
    private final P1.g<P1.d> d;
    private final P1.g<Throwable> e;
    private P1.g<Throwable> i;
    private int v;
    private final com.airbnb.lottie.a w;
    private boolean y;
    private String z;

    private static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        String d;
        int e;
        float i;
        boolean v;
        String w;
        int y;
        int z;

        class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcel parcel, a aVar) {
            this(parcel);
        }

        @Override
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.d);
            parcel.writeFloat(this.i);
            parcel.writeInt(this.v ? 1 : 0);
            parcel.writeString(this.w);
            parcel.writeInt(this.y);
            parcel.writeInt(this.z);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.d = parcel.readString();
            this.i = parcel.readFloat();
            this.v = parcel.readInt() == 1;
            this.w = parcel.readString();
            this.y = parcel.readInt();
            this.z = parcel.readInt();
        }
    }

    class a implements P1.g<Throwable> {
        a() {
        }

        @Override
        public void onResult(Throwable th) {
            if (!h.k(th)) {
                throw new IllegalStateException("Unable to parse composition", th);
            }
            b2.d.d("Unable to load composition.", th);
        }
    }

    class b implements P1.g<P1.d> {
        b() {
        }

        @Override
        public void onResult(P1.d dVar) {
            LottieAnimationView.this.setComposition(dVar);
        }
    }

    class c implements P1.g<Throwable> {
        c() {
        }

        @Override
        public void onResult(Throwable th) {
            if (LottieAnimationView.this.v != 0) {
                LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                lottieAnimationView.setImageResource(lottieAnimationView.v);
            }
            (LottieAnimationView.this.i == null ? LottieAnimationView.N : LottieAnimationView.this.i).onResult(th);
        }
    }

    class d implements Callable<k<P1.d>> {
        final int d;

        d(int i) {
            this.d = i;
        }

        @Override
        public k<P1.d> call() {
            return LottieAnimationView.this.G ? P1.e.o(LottieAnimationView.this.getContext(), this.d) : P1.e.p(LottieAnimationView.this.getContext(), this.d, null);
        }
    }

    class e implements Callable<k<P1.d>> {
        final String d;

        e(String str) {
            this.d = str;
        }

        @Override
        public k<P1.d> call() {
            return LottieAnimationView.this.G ? P1.e.f(LottieAnimationView.this.getContext(), this.d) : P1.e.g(LottieAnimationView.this.getContext(), this.d, null);
        }
    }

    class f<T> extends c2.c<T> {
        final c2.e d;

        f(c2.e eVar) {
            this.d = eVar;
        }

        @Override
        public T a(c2.b<T> bVar) {
            return (T) this.d.a(bVar);
        }
    }

    static class g {
        static final int[] a;

        static {
            int[] iArr = new int[o.values().length];
            a = iArr;
            try {
                iArr[o.HARDWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[o.SOFTWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[o.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new b();
        this.e = new c();
        this.v = 0;
        this.w = new com.airbnb.lottie.a();
        this.B = false;
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = true;
        this.H = o.AUTOMATIC;
        this.I = new HashSet();
        this.J = 0;
        p(attributeSet, m.a);
    }

    private void j() {
        com.airbnb.lottie.b<P1.d> bVar = this.K;
        if (bVar != null) {
            bVar.k(this.d);
            this.K.j(this.e);
        }
    }

    private void k() {
        this.L = null;
        this.w.j();
    }

    private void m() {
        P1.d dVar;
        P1.d dVar2;
        int i = g.a[this.H.ordinal()];
        int i2 = 2;
        if (i != 1 && (i == 2 || i != 3 || (((dVar = this.L) != null && dVar.q() && Build.VERSION.SDK_INT < 28) || ((dVar2 = this.L) != null && dVar2.m() > 4)))) {
            i2 = 1;
        }
        if (i2 != getLayerType()) {
            setLayerType(i2, null);
        }
    }

    private com.airbnb.lottie.b<P1.d> n(String str) {
        return isInEditMode() ? new com.airbnb.lottie.b<>(new e(str), true) : this.G ? P1.e.d(getContext(), str) : P1.e.e(getContext(), str, null);
    }

    private com.airbnb.lottie.b<P1.d> o(int i) {
        return isInEditMode() ? new com.airbnb.lottie.b<>(new d(i), true) : this.G ? P1.e.m(getContext(), i) : P1.e.n(getContext(), i, null);
    }

    private void p(AttributeSet attributeSet, int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, n.a, i, 0);
        this.G = typedArrayObtainStyledAttributes.getBoolean(n.c, true);
        int i2 = n.l;
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i2);
        int i3 = n.g;
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(i3);
        int i4 = n.r;
        boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(i4);
        if (zHasValue && zHasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (zHasValue) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(i2, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (zHasValue2) {
            String string2 = typedArrayObtainStyledAttributes.getString(i3);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (zHasValue3 && (string = typedArrayObtainStyledAttributes.getString(i4)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(typedArrayObtainStyledAttributes.getResourceId(n.f, 0));
        if (typedArrayObtainStyledAttributes.getBoolean(n.b, false)) {
            this.D = true;
            this.F = true;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(n.j, false)) {
            this.w.i0(-1);
        }
        int i5 = n.o;
        if (typedArrayObtainStyledAttributes.hasValue(i5)) {
            setRepeatMode(typedArrayObtainStyledAttributes.getInt(i5, 1));
        }
        int i6 = n.n;
        if (typedArrayObtainStyledAttributes.hasValue(i6)) {
            setRepeatCount(typedArrayObtainStyledAttributes.getInt(i6, -1));
        }
        int i7 = n.q;
        if (typedArrayObtainStyledAttributes.hasValue(i7)) {
            setSpeed(typedArrayObtainStyledAttributes.getFloat(i7, 1.0f));
        }
        setImageAssetsFolder(typedArrayObtainStyledAttributes.getString(n.i));
        setProgress(typedArrayObtainStyledAttributes.getFloat(n.k, 0.0f));
        l(typedArrayObtainStyledAttributes.getBoolean(n.e, false));
        int i10 = n.d;
        if (typedArrayObtainStyledAttributes.hasValue(i10)) {
            g(new U1.e("**"), j.K, new c2.c(new p(h.a.a(getContext(), typedArrayObtainStyledAttributes.getResourceId(i10, -1)).getDefaultColor())));
        }
        int i11 = n.p;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            this.w.l0(typedArrayObtainStyledAttributes.getFloat(i11, 1.0f));
        }
        int i12 = n.m;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            o oVar = o.AUTOMATIC;
            int iOrdinal = typedArrayObtainStyledAttributes.getInt(i12, oVar.ordinal());
            if (iOrdinal >= o.values().length) {
                iOrdinal = oVar.ordinal();
            }
            setRenderMode(o.values()[iOrdinal]);
        }
        setIgnoreDisabledSystemAnimations(typedArrayObtainStyledAttributes.getBoolean(n.h, false));
        typedArrayObtainStyledAttributes.recycle();
        this.w.n0(Boolean.valueOf(h.f(getContext()) != 0.0f));
        m();
        this.y = true;
    }

    private void setCompositionTask(com.airbnb.lottie.b<P1.d> bVar) {
        k();
        j();
        this.K = bVar.f(this.d).e(this.e);
    }

    private void y() {
        boolean zQ = q();
        setImageDrawable(null);
        setImageDrawable(this.w);
        if (zQ) {
            this.w.P();
        }
    }

    public void buildDrawingCache(boolean z) {
        P1.c.a("buildDrawingCache");
        this.J++;
        super/*android.view.View*/.buildDrawingCache(z);
        if (this.J == 1 && getWidth() > 0 && getHeight() > 0 && getLayerType() == 1 && getDrawingCache(z) == null) {
            setRenderMode(o.HARDWARE);
        }
        this.J--;
        P1.c.b("buildDrawingCache");
    }

    public void e(Animator.AnimatorListener animatorListener) {
        this.w.c(animatorListener);
    }

    public boolean f(@NonNull i iVar) {
        P1.d dVar = this.L;
        if (dVar != null) {
            iVar.a(dVar);
        }
        return this.I.add(iVar);
    }

    public <T> void g(U1.e eVar, T t, c2.c<T> cVar) {
        this.w.d(eVar, t, cVar);
    }

    public P1.d getComposition() {
        return this.L;
    }

    public long getDuration() {
        P1.d dVar = this.L;
        if (dVar != null) {
            return (long) dVar.d();
        }
        return 0L;
    }

    public int getFrame() {
        return this.w.t();
    }

    public String getImageAssetsFolder() {
        return this.w.w();
    }

    public float getMaxFrame() {
        return this.w.x();
    }

    public float getMinFrame() {
        return this.w.z();
    }

    public l getPerformanceTracker() {
        return this.w.A();
    }

    public float getProgress() {
        return this.w.B();
    }

    public int getRepeatCount() {
        return this.w.C();
    }

    public int getRepeatMode() {
        return this.w.D();
    }

    public float getScale() {
        return this.w.E();
    }

    public float getSpeed() {
        return this.w.F();
    }

    public <T> void h(U1.e eVar, T t, c2.e<T> eVar2) {
        this.w.d(eVar, t, new f(eVar2));
    }

    public void i() {
        this.D = false;
        this.C = false;
        this.B = false;
        this.w.i();
        m();
    }

    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable drawable2 = getDrawable();
        com.airbnb.lottie.a aVar = this.w;
        if (drawable2 == aVar) {
            super/*android.view.View*/.invalidateDrawable(aVar);
        } else {
            super/*android.view.View*/.invalidateDrawable(drawable);
        }
    }

    public void l(boolean z) {
        this.w.n(z);
    }

    protected void onAttachedToWindow() {
        super/*android.view.View*/.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        if (this.F || this.D) {
            s();
            this.F = false;
            this.D = false;
        }
    }

    protected void onDetachedFromWindow() {
        if (q()) {
            i();
            this.D = true;
        }
        super/*android.view.View*/.onDetachedFromWindow();
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super/*android.view.View*/.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super/*android.view.View*/.onRestoreInstanceState(savedState.getSuperState());
        String str = savedState.d;
        this.z = str;
        if (!TextUtils.isEmpty(str)) {
            setAnimation(this.z);
        }
        int i = savedState.e;
        this.A = i;
        if (i != 0) {
            setAnimation(i);
        }
        setProgress(savedState.i);
        if (savedState.v) {
            s();
        }
        this.w.W(savedState.w);
        setRepeatMode(savedState.y);
        setRepeatCount(savedState.z);
    }

    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super/*android.view.View*/.onSaveInstanceState());
        savedState.d = this.z;
        savedState.e = this.A;
        savedState.i = this.w.B();
        savedState.v = this.w.I() || (!Z.Q(this) && this.D);
        savedState.w = this.w.w();
        savedState.y = this.w.D();
        savedState.z = this.w.C();
        return savedState;
    }

    protected void onVisibilityChanged(@NonNull View view, int i) {
        if (this.y) {
            if (!isShown()) {
                if (q()) {
                    r();
                    this.C = true;
                    return;
                }
                return;
            }
            if (this.C) {
                v();
            } else if (this.B) {
                s();
            }
            this.C = false;
            this.B = false;
        }
    }

    public boolean q() {
        return this.w.I();
    }

    public void r() {
        this.F = false;
        this.D = false;
        this.C = false;
        this.B = false;
        this.w.K();
        m();
    }

    public void s() {
        if (!isShown()) {
            this.B = true;
        } else {
            this.w.L();
            m();
        }
    }

    public void setAnimation(int i) {
        this.A = i;
        this.z = null;
        setCompositionTask(o(i));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        x(str, null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.G ? P1.e.q(getContext(), str) : P1.e.r(getContext(), str, null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.w.Q(z);
    }

    public void setCacheComposition(boolean z) {
        this.G = z;
    }

    public void setComposition(@NonNull P1.d dVar) {
        if (P1.c.a) {
            Log.v(M, "Set Composition \n" + dVar);
        }
        this.w.setCallback(this);
        this.L = dVar;
        this.E = true;
        boolean zR = this.w.R(dVar);
        this.E = false;
        m();
        if (getDrawable() != this.w || zR) {
            if (!zR) {
                y();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator<i> it = this.I.iterator();
            while (it.hasNext()) {
                it.next().a(dVar);
            }
        }
    }

    public void setFailureListener(P1.g<Throwable> gVar) {
        this.i = gVar;
    }

    public void setFallbackResource(int i) {
        this.v = i;
    }

    public void setFontAssetDelegate(P1.a aVar) {
        this.w.S(aVar);
    }

    public void setFrame(int i) {
        this.w.T(i);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.w.U(z);
    }

    public void setImageAssetDelegate(P1.b bVar) {
        this.w.V(bVar);
    }

    public void setImageAssetsFolder(String str) {
        this.w.W(str);
    }

    public void setImageBitmap(Bitmap bitmap) {
        j();
        super.setImageBitmap(bitmap);
    }

    public void setImageDrawable(Drawable drawable) {
        j();
        super.setImageDrawable(drawable);
    }

    public void setImageResource(int i) {
        j();
        super.setImageResource(i);
    }

    public void setMaxFrame(int i) {
        this.w.X(i);
    }

    public void setMaxProgress(float f2) {
        this.w.Z(f2);
    }

    public void setMinAndMaxFrame(String str) {
        this.w.b0(str);
    }

    public void setMinFrame(int i) {
        this.w.c0(i);
    }

    public void setMinProgress(float f2) {
        this.w.e0(f2);
    }

    public void setOutlineMasksAndMattes(boolean z) {
        this.w.f0(z);
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.w.g0(z);
    }

    public void setProgress(float f2) {
        this.w.h0(f2);
    }

    public void setRenderMode(o oVar) {
        this.H = oVar;
        m();
    }

    public void setRepeatCount(int i) {
        this.w.i0(i);
    }

    public void setRepeatMode(int i) {
        this.w.j0(i);
    }

    public void setSafeMode(boolean z) {
        this.w.k0(z);
    }

    public void setScale(float f2) {
        this.w.l0(f2);
        if (getDrawable() == this.w) {
            y();
        }
    }

    public void setSpeed(float f2) {
        this.w.m0(f2);
    }

    public void setTextDelegate(q qVar) {
        this.w.o0(qVar);
    }

    public void t() {
        this.w.M();
    }

    public void u() {
        this.w.N();
    }

    public void unscheduleDrawable(Drawable drawable) {
        com.airbnb.lottie.a aVar;
        if (!this.E && drawable == (aVar = this.w) && aVar.I()) {
            r();
        } else if (!this.E && (drawable instanceof com.airbnb.lottie.a)) {
            com.airbnb.lottie.a aVar2 = (com.airbnb.lottie.a) drawable;
            if (aVar2.I()) {
                aVar2.K();
            }
        }
        super/*android.view.View*/.unscheduleDrawable(drawable);
    }

    public void v() {
        if (isShown()) {
            this.w.P();
            m();
        } else {
            this.B = false;
            this.C = true;
        }
    }

    public void w(InputStream inputStream, String str) {
        setCompositionTask(P1.e.h(inputStream, str));
    }

    public void x(String str, String str2) {
        w(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void setMaxFrame(String str) {
        this.w.Y(str);
    }

    public void setMinFrame(String str) {
        this.w.d0(str);
    }

    public void setAnimation(String str) {
        this.z = str;
        this.A = 0;
        setCompositionTask(n(str));
    }
}
