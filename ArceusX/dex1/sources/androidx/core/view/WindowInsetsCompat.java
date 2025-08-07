package androidx.core.view;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import androidx.core.graphics.Insets;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import x0.C2985b;

public class WindowInsetsCompat {
    public static final WindowInsetsCompat CONSUMED;
    private static final String TAG = "WindowInsetsCompat";
    private final Impl mImpl;

    static class Api21ReflectionHolder {
        private static Field sContentInsets;
        private static boolean sReflectionSucceeded;
        private static Field sStableInsets;
        private static Field sViewAttachInfoField;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                sViewAttachInfoField = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                sStableInsets = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                sContentInsets = declaredField3;
                declaredField3.setAccessible(true);
                sReflectionSucceeded = true;
            } catch (ReflectiveOperationException e7) {
                Log.w(WindowInsetsCompat.TAG, "Failed to get visible insets from AttachInfo " + e7.getMessage(), e7);
            }
        }

        private Api21ReflectionHolder() {
        }

        public static WindowInsetsCompat getRootWindowInsets(View view) throws IllegalAccessException, IllegalArgumentException {
            if (sReflectionSucceeded && view.isAttachedToWindow()) {
                try {
                    Object obj = sViewAttachInfoField.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) sStableInsets.get(obj);
                        Rect rect2 = (Rect) sContentInsets.get(obj);
                        if (rect != null && rect2 != null) {
                            WindowInsetsCompat windowInsetsCompatBuild = new Builder().setStableInsets(Insets.of(rect)).setSystemWindowInsets(Insets.of(rect2)).build();
                            windowInsetsCompatBuild.setRootWindowInsets(windowInsetsCompatBuild);
                            windowInsetsCompatBuild.copyRootViewBounds(view.getRootView());
                            return windowInsetsCompatBuild;
                        }
                    }
                } catch (IllegalAccessException e7) {
                    Log.w(WindowInsetsCompat.TAG, "Failed to get insets from AttachInfo. " + e7.getMessage(), e7);
                }
            }
            return null;
        }
    }

    private static class BuilderImpl {
        private final WindowInsetsCompat mInsets;
        Insets[] mInsetsTypeMask;

        BuilderImpl() {
            this(new WindowInsetsCompat((WindowInsetsCompat) null));
        }

        protected final void applyInsetTypes() {
            Insets[] insetsArr = this.mInsetsTypeMask;
            if (insetsArr != null) {
                Insets insets = insetsArr[Type.indexOf(1)];
                Insets insets2 = this.mInsetsTypeMask[Type.indexOf(2)];
                if (insets2 == null) {
                    insets2 = this.mInsets.getInsets(2);
                }
                if (insets == null) {
                    insets = this.mInsets.getInsets(1);
                }
                setSystemWindowInsets(Insets.max(insets, insets2));
                Insets insets3 = this.mInsetsTypeMask[Type.indexOf(16)];
                if (insets3 != null) {
                    setSystemGestureInsets(insets3);
                }
                Insets insets4 = this.mInsetsTypeMask[Type.indexOf(32)];
                if (insets4 != null) {
                    setMandatorySystemGestureInsets(insets4);
                }
                Insets insets5 = this.mInsetsTypeMask[Type.indexOf(64)];
                if (insets5 != null) {
                    setTappableElementInsets(insets5);
                }
            }
        }

        WindowInsetsCompat build() {
            applyInsetTypes();
            return this.mInsets;
        }

        void setDisplayCutout(r rVar) {
        }

        void setInsets(int i7, Insets insets) {
            if (this.mInsetsTypeMask == null) {
                this.mInsetsTypeMask = new Insets[9];
            }
            for (int i8 = 1; i8 <= 256; i8 <<= 1) {
                if ((i7 & i8) != 0) {
                    this.mInsetsTypeMask[Type.indexOf(i8)] = insets;
                }
            }
        }

        void setInsetsIgnoringVisibility(int i7, Insets insets) {
            if (i7 == 8) {
                throw new IllegalArgumentException("Ignoring visibility inset not available for IME");
            }
        }

        void setMandatorySystemGestureInsets(Insets insets) {
        }

        void setStableInsets(Insets insets) {
        }

        void setSystemGestureInsets(Insets insets) {
        }

        void setSystemWindowInsets(Insets insets) {
        }

        void setTappableElementInsets(Insets insets) {
        }

        void setVisible(int i7, boolean z7) {
        }

        BuilderImpl(WindowInsetsCompat windowInsetsCompat) {
            this.mInsets = windowInsetsCompat;
        }
    }

    private static class BuilderImpl30 extends BuilderImpl29 {
        BuilderImpl30() {
        }

        @Override
        void setInsets(int i7, Insets insets) {
            this.mPlatBuilder.setInsets(TypeImpl30.toPlatformType(i7), insets.toPlatformInsets());
        }

        @Override
        void setInsetsIgnoringVisibility(int i7, Insets insets) throws IllegalArgumentException {
            this.mPlatBuilder.setInsetsIgnoringVisibility(TypeImpl30.toPlatformType(i7), insets.toPlatformInsets());
        }

        @Override
        void setVisible(int i7, boolean z7) {
            this.mPlatBuilder.setVisible(TypeImpl30.toPlatformType(i7), z7);
        }

        BuilderImpl30(WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
        }
    }

    private static class Impl {
        static final WindowInsetsCompat CONSUMED = new Builder().build().consumeDisplayCutout().consumeStableInsets().consumeSystemWindowInsets();
        final WindowInsetsCompat mHost;

        Impl(WindowInsetsCompat windowInsetsCompat) {
            this.mHost = windowInsetsCompat;
        }

        WindowInsetsCompat consumeDisplayCutout() {
            return this.mHost;
        }

        WindowInsetsCompat consumeStableInsets() {
            return this.mHost;
        }

        WindowInsetsCompat consumeSystemWindowInsets() {
            return this.mHost;
        }

        void copyRootViewBounds(View view) {
        }

        void copyWindowDataInto(WindowInsetsCompat windowInsetsCompat) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Impl)) {
                return false;
            }
            Impl impl = (Impl) obj;
            return isRound() == impl.isRound() && isConsumed() == impl.isConsumed() && C2985b.a(getSystemWindowInsets(), impl.getSystemWindowInsets()) && C2985b.a(getStableInsets(), impl.getStableInsets()) && C2985b.a(getDisplayCutout(), impl.getDisplayCutout());
        }

        r getDisplayCutout() {
            return null;
        }

        Insets getInsets(int i7) {
            return Insets.NONE;
        }

        Insets getInsetsIgnoringVisibility(int i7) {
            if ((i7 & 8) == 0) {
                return Insets.NONE;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        Insets getMandatorySystemGestureInsets() {
            return getSystemWindowInsets();
        }

        Insets getStableInsets() {
            return Insets.NONE;
        }

        Insets getSystemGestureInsets() {
            return getSystemWindowInsets();
        }

        Insets getSystemWindowInsets() {
            return Insets.NONE;
        }

        Insets getTappableElementInsets() {
            return getSystemWindowInsets();
        }

        public int hashCode() {
            return C2985b.b(Boolean.valueOf(isRound()), Boolean.valueOf(isConsumed()), getSystemWindowInsets(), getStableInsets(), getDisplayCutout());
        }

        WindowInsetsCompat inset(int i7, int i8, int i9, int i10) {
            return CONSUMED;
        }

        boolean isConsumed() {
            return false;
        }

        boolean isRound() {
            return false;
        }

        boolean isVisible(int i7) {
            return true;
        }

        public void setOverriddenInsets(Insets[] insetsArr) {
        }

        void setRootViewData(Insets insets) {
        }

        void setRootWindowInsets(WindowInsetsCompat windowInsetsCompat) {
        }

        public void setStableInsets(Insets insets) {
        }
    }

    private static class Impl20 extends Impl {
        private static Class<?> sAttachInfoClass;
        private static Field sAttachInfoField;
        private static Method sGetViewRootImplMethod;
        private static Field sVisibleInsetsField;
        private static boolean sVisibleRectReflectionFetched;
        private Insets[] mOverriddenInsets;
        final WindowInsets mPlatformInsets;
        Insets mRootViewVisibleInsets;
        private WindowInsetsCompat mRootWindowInsets;
        private Insets mSystemWindowInsets;

        Impl20(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat);
            this.mSystemWindowInsets = null;
            this.mPlatformInsets = windowInsets;
        }

        private Insets getRootStableInsets() {
            WindowInsetsCompat windowInsetsCompat = this.mRootWindowInsets;
            return windowInsetsCompat != null ? windowInsetsCompat.getStableInsets() : Insets.NONE;
        }

        private Insets getVisibleInsets(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!sVisibleRectReflectionFetched) {
                loadReflectionField();
            }
            Method method = sGetViewRootImplMethod;
            if (method != null && sAttachInfoClass != null && sVisibleInsetsField != null) {
                try {
                    Object objInvoke = method.invoke(view, null);
                    if (objInvoke == null) {
                        Log.w(WindowInsetsCompat.TAG, "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) sVisibleInsetsField.get(sAttachInfoField.get(objInvoke));
                    if (rect != null) {
                        return Insets.of(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e7) {
                    Log.e(WindowInsetsCompat.TAG, "Failed to get visible insets. (Reflection error). " + e7.getMessage(), e7);
                }
            }
            return null;
        }

        private static void loadReflectionField() throws ClassNotFoundException, SecurityException {
            try {
                sGetViewRootImplMethod = View.class.getDeclaredMethod("getViewRootImpl", null);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                sAttachInfoClass = cls;
                sVisibleInsetsField = cls.getDeclaredField("mVisibleInsets");
                sAttachInfoField = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                sVisibleInsetsField.setAccessible(true);
                sAttachInfoField.setAccessible(true);
            } catch (ReflectiveOperationException e7) {
                Log.e(WindowInsetsCompat.TAG, "Failed to get visible insets. (Reflection error). " + e7.getMessage(), e7);
            }
            sVisibleRectReflectionFetched = true;
        }

        @Override
        void copyRootViewBounds(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
            Insets visibleInsets = getVisibleInsets(view);
            if (visibleInsets == null) {
                visibleInsets = Insets.NONE;
            }
            setRootViewData(visibleInsets);
        }

        @Override
        void copyWindowDataInto(WindowInsetsCompat windowInsetsCompat) {
            windowInsetsCompat.setRootWindowInsets(this.mRootWindowInsets);
            windowInsetsCompat.setRootViewData(this.mRootViewVisibleInsets);
        }

        @Override
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.mRootViewVisibleInsets, ((Impl20) obj).mRootViewVisibleInsets);
            }
            return false;
        }

        @Override
        public Insets getInsets(int i7) {
            return getInsets(i7, false);
        }

        protected Insets getInsetsForType(int i7, boolean z7) {
            Insets stableInsets;
            int i8;
            if (i7 == 1) {
                return z7 ? Insets.of(0, Math.max(getRootStableInsets().top, getSystemWindowInsets().top), 0, 0) : Insets.of(0, getSystemWindowInsets().top, 0, 0);
            }
            if (i7 == 2) {
                if (z7) {
                    Insets rootStableInsets = getRootStableInsets();
                    Insets stableInsets2 = getStableInsets();
                    return Insets.of(Math.max(rootStableInsets.left, stableInsets2.left), 0, Math.max(rootStableInsets.right, stableInsets2.right), Math.max(rootStableInsets.bottom, stableInsets2.bottom));
                }
                Insets systemWindowInsets = getSystemWindowInsets();
                WindowInsetsCompat windowInsetsCompat = this.mRootWindowInsets;
                stableInsets = windowInsetsCompat != null ? windowInsetsCompat.getStableInsets() : null;
                int iMin = systemWindowInsets.bottom;
                if (stableInsets != null) {
                    iMin = Math.min(iMin, stableInsets.bottom);
                }
                return Insets.of(systemWindowInsets.left, 0, systemWindowInsets.right, iMin);
            }
            if (i7 != 8) {
                if (i7 == 16) {
                    return getSystemGestureInsets();
                }
                if (i7 == 32) {
                    return getMandatorySystemGestureInsets();
                }
                if (i7 == 64) {
                    return getTappableElementInsets();
                }
                if (i7 != 128) {
                    return Insets.NONE;
                }
                WindowInsetsCompat windowInsetsCompat2 = this.mRootWindowInsets;
                r displayCutout = windowInsetsCompat2 != null ? windowInsetsCompat2.getDisplayCutout() : getDisplayCutout();
                return displayCutout != null ? Insets.of(displayCutout.b(), displayCutout.d(), displayCutout.c(), displayCutout.a()) : Insets.NONE;
            }
            Insets[] insetsArr = this.mOverriddenInsets;
            stableInsets = insetsArr != null ? insetsArr[Type.indexOf(8)] : null;
            if (stableInsets != null) {
                return stableInsets;
            }
            Insets systemWindowInsets2 = getSystemWindowInsets();
            Insets rootStableInsets2 = getRootStableInsets();
            int i9 = systemWindowInsets2.bottom;
            if (i9 > rootStableInsets2.bottom) {
                return Insets.of(0, 0, 0, i9);
            }
            Insets insets = this.mRootViewVisibleInsets;
            return (insets == null || insets.equals(Insets.NONE) || (i8 = this.mRootViewVisibleInsets.bottom) <= rootStableInsets2.bottom) ? Insets.NONE : Insets.of(0, 0, 0, i8);
        }

        @Override
        public Insets getInsetsIgnoringVisibility(int i7) {
            return getInsets(i7, true);
        }

        @Override
        final Insets getSystemWindowInsets() {
            if (this.mSystemWindowInsets == null) {
                this.mSystemWindowInsets = Insets.of(this.mPlatformInsets.getSystemWindowInsetLeft(), this.mPlatformInsets.getSystemWindowInsetTop(), this.mPlatformInsets.getSystemWindowInsetRight(), this.mPlatformInsets.getSystemWindowInsetBottom());
            }
            return this.mSystemWindowInsets;
        }

        @Override
        WindowInsetsCompat inset(int i7, int i8, int i9, int i10) {
            Builder builder = new Builder(WindowInsetsCompat.toWindowInsetsCompat(this.mPlatformInsets));
            builder.setSystemWindowInsets(WindowInsetsCompat.insetInsets(getSystemWindowInsets(), i7, i8, i9, i10));
            builder.setStableInsets(WindowInsetsCompat.insetInsets(getStableInsets(), i7, i8, i9, i10));
            return builder.build();
        }

        @Override
        boolean isRound() {
            return this.mPlatformInsets.isRound();
        }

        protected boolean isTypeVisible(int i7) {
            if (i7 != 1 && i7 != 2) {
                if (i7 == 4) {
                    return false;
                }
                if (i7 != 8 && i7 != 128) {
                    return true;
                }
            }
            return !getInsetsForType(i7, false).equals(Insets.NONE);
        }

        @Override
        boolean isVisible(int i7) {
            for (int i8 = 1; i8 <= 256; i8 <<= 1) {
                if ((i7 & i8) != 0 && !isTypeVisible(i8)) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public void setOverriddenInsets(Insets[] insetsArr) {
            this.mOverriddenInsets = insetsArr;
        }

        @Override
        void setRootViewData(Insets insets) {
            this.mRootViewVisibleInsets = insets;
        }

        @Override
        void setRootWindowInsets(WindowInsetsCompat windowInsetsCompat) {
            this.mRootWindowInsets = windowInsetsCompat;
        }

        private Insets getInsets(int i7, boolean z7) {
            Insets insetsMax = Insets.NONE;
            for (int i8 = 1; i8 <= 256; i8 <<= 1) {
                if ((i7 & i8) != 0) {
                    insetsMax = Insets.max(insetsMax, getInsetsForType(i8, z7));
                }
            }
            return insetsMax;
        }

        Impl20(WindowInsetsCompat windowInsetsCompat, Impl20 impl20) {
            this(windowInsetsCompat, new WindowInsets(impl20.mPlatformInsets));
        }
    }

    private static class Impl28 extends Impl21 {
        Impl28(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        @Override
        WindowInsetsCompat consumeDisplayCutout() {
            return WindowInsetsCompat.toWindowInsetsCompat(this.mPlatformInsets.consumeDisplayCutout());
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Impl28)) {
                return false;
            }
            Impl28 impl28 = (Impl28) obj;
            return Objects.equals(this.mPlatformInsets, impl28.mPlatformInsets) && Objects.equals(this.mRootViewVisibleInsets, impl28.mRootViewVisibleInsets);
        }

        @Override
        r getDisplayCutout() {
            return r.g(this.mPlatformInsets.getDisplayCutout());
        }

        @Override
        public int hashCode() {
            return this.mPlatformInsets.hashCode();
        }

        Impl28(WindowInsetsCompat windowInsetsCompat, Impl28 impl28) {
            super(windowInsetsCompat, impl28);
        }
    }

    private static class Impl30 extends Impl29 {
        static final WindowInsetsCompat CONSUMED = WindowInsetsCompat.toWindowInsetsCompat(WindowInsets.CONSUMED);

        Impl30(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        @Override
        final void copyRootViewBounds(View view) {
        }

        @Override
        public Insets getInsets(int i7) {
            return Insets.toCompatInsets(this.mPlatformInsets.getInsets(TypeImpl30.toPlatformType(i7)));
        }

        @Override
        public Insets getInsetsIgnoringVisibility(int i7) {
            return Insets.toCompatInsets(this.mPlatformInsets.getInsetsIgnoringVisibility(TypeImpl30.toPlatformType(i7)));
        }

        @Override
        public boolean isVisible(int i7) {
            return this.mPlatformInsets.isVisible(TypeImpl30.toPlatformType(i7));
        }

        Impl30(WindowInsetsCompat windowInsetsCompat, Impl30 impl30) {
            super(windowInsetsCompat, impl30);
        }
    }

    public static final class Type {
        static final int CAPTION_BAR = 4;
        static final int DISPLAY_CUTOUT = 128;
        static final int FIRST = 1;
        static final int IME = 8;
        static final int LAST = 256;
        static final int MANDATORY_SYSTEM_GESTURES = 32;
        static final int NAVIGATION_BARS = 2;
        static final int SIZE = 9;
        static final int STATUS_BARS = 1;
        static final int SYSTEM_GESTURES = 16;
        static final int TAPPABLE_ELEMENT = 64;
        static final int WINDOW_DECOR = 256;

        @Retention(RetentionPolicy.SOURCE)
        public @interface InsetsType {
        }

        private Type() {
        }

        static int all() {
            return -1;
        }

        public static int captionBar() {
            return 4;
        }

        public static int displayCutout() {
            return DISPLAY_CUTOUT;
        }

        public static int ime() {
            return 8;
        }

        static int indexOf(int i7) {
            if (i7 == 1) {
                return 0;
            }
            if (i7 == 2) {
                return 1;
            }
            if (i7 == 4) {
                return 2;
            }
            if (i7 == 8) {
                return 3;
            }
            if (i7 == 16) {
                return 4;
            }
            if (i7 == 32) {
                return 5;
            }
            if (i7 == 64) {
                return 6;
            }
            if (i7 == DISPLAY_CUTOUT) {
                return 7;
            }
            if (i7 == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i7);
        }

        public static int mandatorySystemGestures() {
            return 32;
        }

        public static int navigationBars() {
            return 2;
        }

        public static int statusBars() {
            return 1;
        }

        public static int systemBars() {
            return 7;
        }

        public static int systemGestures() {
            return 16;
        }

        public static int tappableElement() {
            return 64;
        }
    }

    private static final class TypeImpl30 {
        private TypeImpl30() {
        }

        static int toPlatformType(int i7) {
            int iStatusBars;
            int i8 = 0;
            for (int i9 = 1; i9 <= 256; i9 <<= 1) {
                if ((i7 & i9) != 0) {
                    if (i9 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i9 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i9 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i9 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i9 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i9 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i9 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i9 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    }
                    i8 |= iStatusBars;
                }
            }
            return i8;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            CONSUMED = Impl30.CONSUMED;
        } else {
            CONSUMED = Impl.CONSUMED;
        }
    }

    private WindowInsetsCompat(WindowInsets windowInsets) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
            this.mImpl = new Impl30(this, windowInsets);
            return;
        }
        if (i7 >= 29) {
            this.mImpl = new Impl29(this, windowInsets);
        } else if (i7 >= 28) {
            this.mImpl = new Impl28(this, windowInsets);
        } else {
            this.mImpl = new Impl21(this, windowInsets);
        }
    }

    static Insets insetInsets(Insets insets, int i7, int i8, int i9, int i10) {
        int iMax = Math.max(0, insets.left - i7);
        int iMax2 = Math.max(0, insets.top - i8);
        int iMax3 = Math.max(0, insets.right - i9);
        int iMax4 = Math.max(0, insets.bottom - i10);
        return (iMax == i7 && iMax2 == i8 && iMax3 == i9 && iMax4 == i10) ? insets : Insets.of(iMax, iMax2, iMax3, iMax4);
    }

    public static WindowInsetsCompat toWindowInsetsCompat(WindowInsets windowInsets) {
        return toWindowInsetsCompat(windowInsets, null);
    }

    @Deprecated
    public WindowInsetsCompat consumeDisplayCutout() {
        return this.mImpl.consumeDisplayCutout();
    }

    @Deprecated
    public WindowInsetsCompat consumeStableInsets() {
        return this.mImpl.consumeStableInsets();
    }

    @Deprecated
    public WindowInsetsCompat consumeSystemWindowInsets() {
        return this.mImpl.consumeSystemWindowInsets();
    }

    void copyRootViewBounds(View view) {
        this.mImpl.copyRootViewBounds(view);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WindowInsetsCompat) {
            return C2985b.a(this.mImpl, ((WindowInsetsCompat) obj).mImpl);
        }
        return false;
    }

    public r getDisplayCutout() {
        return this.mImpl.getDisplayCutout();
    }

    public Insets getInsets(int i7) {
        return this.mImpl.getInsets(i7);
    }

    public Insets getInsetsIgnoringVisibility(int i7) {
        return this.mImpl.getInsetsIgnoringVisibility(i7);
    }

    @Deprecated
    public Insets getMandatorySystemGestureInsets() {
        return this.mImpl.getMandatorySystemGestureInsets();
    }

    @Deprecated
    public int getStableInsetBottom() {
        return this.mImpl.getStableInsets().bottom;
    }

    @Deprecated
    public int getStableInsetLeft() {
        return this.mImpl.getStableInsets().left;
    }

    @Deprecated
    public int getStableInsetRight() {
        return this.mImpl.getStableInsets().right;
    }

    @Deprecated
    public int getStableInsetTop() {
        return this.mImpl.getStableInsets().top;
    }

    @Deprecated
    public Insets getStableInsets() {
        return this.mImpl.getStableInsets();
    }

    @Deprecated
    public Insets getSystemGestureInsets() {
        return this.mImpl.getSystemGestureInsets();
    }

    @Deprecated
    public int getSystemWindowInsetBottom() {
        return this.mImpl.getSystemWindowInsets().bottom;
    }

    @Deprecated
    public int getSystemWindowInsetLeft() {
        return this.mImpl.getSystemWindowInsets().left;
    }

    @Deprecated
    public int getSystemWindowInsetRight() {
        return this.mImpl.getSystemWindowInsets().right;
    }

    @Deprecated
    public int getSystemWindowInsetTop() {
        return this.mImpl.getSystemWindowInsets().top;
    }

    @Deprecated
    public Insets getSystemWindowInsets() {
        return this.mImpl.getSystemWindowInsets();
    }

    @Deprecated
    public Insets getTappableElementInsets() {
        return this.mImpl.getTappableElementInsets();
    }

    public boolean hasInsets() {
        Insets insets = getInsets(Type.all());
        Insets insets2 = Insets.NONE;
        return (insets.equals(insets2) && getInsetsIgnoringVisibility(Type.all() ^ Type.ime()).equals(insets2) && getDisplayCutout() == null) ? false : true;
    }

    @Deprecated
    public boolean hasStableInsets() {
        return !this.mImpl.getStableInsets().equals(Insets.NONE);
    }

    @Deprecated
    public boolean hasSystemWindowInsets() {
        return !this.mImpl.getSystemWindowInsets().equals(Insets.NONE);
    }

    public int hashCode() {
        Impl impl = this.mImpl;
        if (impl == null) {
            return 0;
        }
        return impl.hashCode();
    }

    public WindowInsetsCompat inset(Insets insets) {
        return inset(insets.left, insets.top, insets.right, insets.bottom);
    }

    public boolean isConsumed() {
        return this.mImpl.isConsumed();
    }

    public boolean isRound() {
        return this.mImpl.isRound();
    }

    public boolean isVisible(int i7) {
        return this.mImpl.isVisible(i7);
    }

    @Deprecated
    public WindowInsetsCompat replaceSystemWindowInsets(int i7, int i8, int i9, int i10) {
        return new Builder(this).setSystemWindowInsets(Insets.of(i7, i8, i9, i10)).build();
    }

    void setOverriddenInsets(Insets[] insetsArr) {
        this.mImpl.setOverriddenInsets(insetsArr);
    }

    void setRootViewData(Insets insets) {
        this.mImpl.setRootViewData(insets);
    }

    void setRootWindowInsets(WindowInsetsCompat windowInsetsCompat) {
        this.mImpl.setRootWindowInsets(windowInsetsCompat);
    }

    void setStableInsets(Insets insets) {
        this.mImpl.setStableInsets(insets);
    }

    public WindowInsets toWindowInsets() {
        Impl impl = this.mImpl;
        if (impl instanceof Impl20) {
            return ((Impl20) impl).mPlatformInsets;
        }
        return null;
    }

    private static class BuilderImpl20 extends BuilderImpl {
        private static Constructor<WindowInsets> sConstructor;
        private static boolean sConstructorFetched;
        private static Field sConsumedField;
        private static boolean sConsumedFieldFetched;
        private WindowInsets mPlatformInsets;
        private Insets mStableInsets;

        BuilderImpl20() {
            this.mPlatformInsets = createWindowInsetsInstance();
        }

        private static WindowInsets createWindowInsetsInstance() {
            if (!sConsumedFieldFetched) {
                try {
                    sConsumedField = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e7) {
                    Log.i(WindowInsetsCompat.TAG, "Could not retrieve WindowInsets.CONSUMED field", e7);
                }
                sConsumedFieldFetched = true;
            }
            Field field = sConsumedField;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e8) {
                    Log.i(WindowInsetsCompat.TAG, "Could not get value from WindowInsets.CONSUMED field", e8);
                }
            }
            if (!sConstructorFetched) {
                try {
                    sConstructor = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e9) {
                    Log.i(WindowInsetsCompat.TAG, "Could not retrieve WindowInsets(Rect) constructor", e9);
                }
                sConstructorFetched = true;
            }
            Constructor<WindowInsets> constructor = sConstructor;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e10) {
                    Log.i(WindowInsetsCompat.TAG, "Could not invoke WindowInsets(Rect) constructor", e10);
                }
            }
            return null;
        }

        @Override
        WindowInsetsCompat build() {
            applyInsetTypes();
            WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(this.mPlatformInsets);
            windowInsetsCompat.setOverriddenInsets(this.mInsetsTypeMask);
            windowInsetsCompat.setStableInsets(this.mStableInsets);
            return windowInsetsCompat;
        }

        @Override
        void setStableInsets(Insets insets) {
            this.mStableInsets = insets;
        }

        @Override
        void setSystemWindowInsets(Insets insets) {
            WindowInsets windowInsets = this.mPlatformInsets;
            if (windowInsets != null) {
                this.mPlatformInsets = windowInsets.replaceSystemWindowInsets(insets.left, insets.top, insets.right, insets.bottom);
            }
        }

        BuilderImpl20(WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
            this.mPlatformInsets = windowInsetsCompat.toWindowInsets();
        }
    }

    private static class BuilderImpl29 extends BuilderImpl {
        final WindowInsets.Builder mPlatBuilder;

        BuilderImpl29() {
            this.mPlatBuilder = H0.a();
        }

        @Override
        WindowInsetsCompat build() {
            applyInsetTypes();
            WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(this.mPlatBuilder.build());
            windowInsetsCompat.setOverriddenInsets(this.mInsetsTypeMask);
            return windowInsetsCompat;
        }

        @Override
        void setDisplayCutout(r rVar) {
            this.mPlatBuilder.setDisplayCutout(rVar != null ? rVar.f() : null);
        }

        @Override
        void setMandatorySystemGestureInsets(Insets insets) {
            this.mPlatBuilder.setMandatorySystemGestureInsets(insets.toPlatformInsets());
        }

        @Override
        void setStableInsets(Insets insets) {
            this.mPlatBuilder.setStableInsets(insets.toPlatformInsets());
        }

        @Override
        void setSystemGestureInsets(Insets insets) {
            this.mPlatBuilder.setSystemGestureInsets(insets.toPlatformInsets());
        }

        @Override
        void setSystemWindowInsets(Insets insets) {
            this.mPlatBuilder.setSystemWindowInsets(insets.toPlatformInsets());
        }

        @Override
        void setTappableElementInsets(Insets insets) {
            this.mPlatBuilder.setTappableElementInsets(insets.toPlatformInsets());
        }

        BuilderImpl29(WindowInsetsCompat windowInsetsCompat) {
            WindowInsets.Builder builderA;
            super(windowInsetsCompat);
            WindowInsets windowInsets = windowInsetsCompat.toWindowInsets();
            if (windowInsets != null) {
                builderA = G0.a(windowInsets);
            } else {
                builderA = H0.a();
            }
            this.mPlatBuilder = builderA;
        }
    }

    private static class Impl21 extends Impl20 {
        private Insets mStableInsets;

        Impl21(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
            this.mStableInsets = null;
        }

        @Override
        WindowInsetsCompat consumeStableInsets() {
            return WindowInsetsCompat.toWindowInsetsCompat(this.mPlatformInsets.consumeStableInsets());
        }

        @Override
        WindowInsetsCompat consumeSystemWindowInsets() {
            return WindowInsetsCompat.toWindowInsetsCompat(this.mPlatformInsets.consumeSystemWindowInsets());
        }

        @Override
        final Insets getStableInsets() {
            if (this.mStableInsets == null) {
                this.mStableInsets = Insets.of(this.mPlatformInsets.getStableInsetLeft(), this.mPlatformInsets.getStableInsetTop(), this.mPlatformInsets.getStableInsetRight(), this.mPlatformInsets.getStableInsetBottom());
            }
            return this.mStableInsets;
        }

        @Override
        boolean isConsumed() {
            return this.mPlatformInsets.isConsumed();
        }

        @Override
        public void setStableInsets(Insets insets) {
            this.mStableInsets = insets;
        }

        Impl21(WindowInsetsCompat windowInsetsCompat, Impl21 impl21) {
            super(windowInsetsCompat, impl21);
            this.mStableInsets = null;
            this.mStableInsets = impl21.mStableInsets;
        }
    }

    public static WindowInsetsCompat toWindowInsetsCompat(WindowInsets windowInsets, View view) {
        WindowInsetsCompat windowInsetsCompat = new WindowInsetsCompat((WindowInsets) x0.g.g(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            windowInsetsCompat.setRootWindowInsets(Z.F(view));
            windowInsetsCompat.copyRootViewBounds(view.getRootView());
        }
        return windowInsetsCompat;
    }

    public WindowInsetsCompat inset(int i7, int i8, int i9, int i10) {
        return this.mImpl.inset(i7, i8, i9, i10);
    }

    private static class Impl29 extends Impl28 {
        private Insets mMandatorySystemGestureInsets;
        private Insets mSystemGestureInsets;
        private Insets mTappableElementInsets;

        Impl29(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
            this.mSystemGestureInsets = null;
            this.mMandatorySystemGestureInsets = null;
            this.mTappableElementInsets = null;
        }

        @Override
        Insets getMandatorySystemGestureInsets() {
            if (this.mMandatorySystemGestureInsets == null) {
                this.mMandatorySystemGestureInsets = Insets.toCompatInsets(this.mPlatformInsets.getMandatorySystemGestureInsets());
            }
            return this.mMandatorySystemGestureInsets;
        }

        @Override
        Insets getSystemGestureInsets() {
            if (this.mSystemGestureInsets == null) {
                this.mSystemGestureInsets = Insets.toCompatInsets(this.mPlatformInsets.getSystemGestureInsets());
            }
            return this.mSystemGestureInsets;
        }

        @Override
        Insets getTappableElementInsets() {
            if (this.mTappableElementInsets == null) {
                this.mTappableElementInsets = Insets.toCompatInsets(this.mPlatformInsets.getTappableElementInsets());
            }
            return this.mTappableElementInsets;
        }

        @Override
        WindowInsetsCompat inset(int i7, int i8, int i9, int i10) {
            return WindowInsetsCompat.toWindowInsetsCompat(this.mPlatformInsets.inset(i7, i8, i9, i10));
        }

        @Override
        public void setStableInsets(Insets insets) {
        }

        Impl29(WindowInsetsCompat windowInsetsCompat, Impl29 impl29) {
            super(windowInsetsCompat, impl29);
            this.mSystemGestureInsets = null;
            this.mMandatorySystemGestureInsets = null;
            this.mTappableElementInsets = null;
        }
    }

    @Deprecated
    public WindowInsetsCompat replaceSystemWindowInsets(Rect rect) {
        return new Builder(this).setSystemWindowInsets(Insets.of(rect)).build();
    }

    public static final class Builder {
        private final BuilderImpl mImpl;

        public Builder() {
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 30) {
                this.mImpl = new BuilderImpl30();
            } else if (i7 >= 29) {
                this.mImpl = new BuilderImpl29();
            } else {
                this.mImpl = new BuilderImpl20();
            }
        }

        public WindowInsetsCompat build() {
            return this.mImpl.build();
        }

        public Builder setDisplayCutout(r rVar) {
            this.mImpl.setDisplayCutout(rVar);
            return this;
        }

        public Builder setInsets(int i7, Insets insets) {
            this.mImpl.setInsets(i7, insets);
            return this;
        }

        public Builder setInsetsIgnoringVisibility(int i7, Insets insets) {
            this.mImpl.setInsetsIgnoringVisibility(i7, insets);
            return this;
        }

        @Deprecated
        public Builder setMandatorySystemGestureInsets(Insets insets) {
            this.mImpl.setMandatorySystemGestureInsets(insets);
            return this;
        }

        @Deprecated
        public Builder setStableInsets(Insets insets) {
            this.mImpl.setStableInsets(insets);
            return this;
        }

        @Deprecated
        public Builder setSystemGestureInsets(Insets insets) {
            this.mImpl.setSystemGestureInsets(insets);
            return this;
        }

        @Deprecated
        public Builder setSystemWindowInsets(Insets insets) {
            this.mImpl.setSystemWindowInsets(insets);
            return this;
        }

        @Deprecated
        public Builder setTappableElementInsets(Insets insets) {
            this.mImpl.setTappableElementInsets(insets);
            return this;
        }

        public Builder setVisible(int i7, boolean z7) {
            this.mImpl.setVisible(i7, z7);
            return this;
        }

        public Builder(WindowInsetsCompat windowInsetsCompat) {
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 30) {
                this.mImpl = new BuilderImpl30(windowInsetsCompat);
            } else if (i7 >= 29) {
                this.mImpl = new BuilderImpl29(windowInsetsCompat);
            } else {
                this.mImpl = new BuilderImpl20(windowInsetsCompat);
            }
        }
    }

    public WindowInsetsCompat(WindowInsetsCompat windowInsetsCompat) {
        if (windowInsetsCompat != null) {
            Impl impl = windowInsetsCompat.mImpl;
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 30 && (impl instanceof Impl30)) {
                this.mImpl = new Impl30(this, (Impl30) impl);
            } else if (i7 >= 29 && (impl instanceof Impl29)) {
                this.mImpl = new Impl29(this, (Impl29) impl);
            } else if (i7 >= 28 && (impl instanceof Impl28)) {
                this.mImpl = new Impl28(this, (Impl28) impl);
            } else if (impl instanceof Impl21) {
                this.mImpl = new Impl21(this, (Impl21) impl);
            } else if (impl instanceof Impl20) {
                this.mImpl = new Impl20(this, (Impl20) impl);
            } else {
                this.mImpl = new Impl(this);
            }
            impl.copyWindowDataInto(this);
            return;
        }
        this.mImpl = new Impl(this);
    }
}
