package androidx.core.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.C1605a;
import androidx.core.view.C1630m0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import y0.C3019t;
import y0.InterfaceC3022w;

public class Z {

    private static WeakHashMap<View, C1620h0> f10618a;

    private static Field f10619b;

    private static boolean f10620c;

    private static final int[] f10621d = {o0.e.f22345b, o0.e.f22346c, o0.e.f22357n, o0.e.f22368y, o0.e.f22326B, o0.e.f22327C, o0.e.f22328D, o0.e.f22329E, o0.e.f22330F, o0.e.f22331G, o0.e.f22347d, o0.e.f22348e, o0.e.f22349f, o0.e.f22350g, o0.e.f22351h, o0.e.f22352i, o0.e.f22353j, o0.e.f22354k, o0.e.f22355l, o0.e.f22356m, o0.e.f22358o, o0.e.f22359p, o0.e.f22360q, o0.e.f22361r, o0.e.f22362s, o0.e.f22363t, o0.e.f22364u, o0.e.f22365v, o0.e.f22366w, o0.e.f22367x, o0.e.f22369z, o0.e.f22325A};

    private static final K f10622e = new K() {
        @Override
        public final C1611d onReceiveContent(C1611d c1611d) {
            return Z.V(c1611d);
        }
    };

    private static final e f10623f = new e();

    class a extends f<Boolean> {
        a(int i7, Class cls, int i8) {
            super(i7, cls, i8);
        }

        @Override
        public Boolean c(View view) {
            return Boolean.valueOf(k.c(view));
        }

        @Override
        public void d(View view, Boolean bool) {
            k.f(view, bool.booleanValue());
        }

        @Override
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    class b extends f<CharSequence> {
        b(int i7, Class cls, int i8, int i9) {
            super(i7, cls, i8, i9);
        }

        @Override
        public CharSequence c(View view) {
            return k.a(view);
        }

        @Override
        public void d(View view, CharSequence charSequence) {
            k.e(view, charSequence);
        }

        @Override
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    class c extends f<CharSequence> {
        c(int i7, Class cls, int i8, int i9) {
            super(i7, cls, i8, i9);
        }

        @Override
        public CharSequence c(View view) {
            return m.a(view);
        }

        @Override
        public void d(View view, CharSequence charSequence) {
            m.c(view, charSequence);
        }

        @Override
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    class d extends f<Boolean> {
        d(int i7, Class cls, int i8) {
            super(i7, cls, i8);
        }

        @Override
        public Boolean c(View view) {
            return Boolean.valueOf(k.b(view));
        }

        @Override
        public void d(View view, Boolean bool) {
            k.d(view, bool.booleanValue());
        }

        @Override
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        private final WeakHashMap<View, Boolean> f10624d = new WeakHashMap<>();

        e() {
        }

        private void b(Map.Entry<View, Boolean> entry) {
            View key = entry.getKey();
            boolean zBooleanValue = entry.getValue().booleanValue();
            boolean z7 = key.isShown() && key.getWindowVisibility() == 0;
            if (zBooleanValue != z7) {
                Z.W(key, z7 ? 16 : 32);
                entry.setValue(Boolean.valueOf(z7));
            }
        }

        private void c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        private void e(View view) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        void a(View view) {
            this.f10624d.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (view.isAttachedToWindow()) {
                c(view);
            }
        }

        void d(View view) {
            this.f10624d.remove(view);
            view.removeOnAttachStateChangeListener(this);
            e(view);
        }

        @Override
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                Iterator<Map.Entry<View, Boolean>> it = this.f10624d.entrySet().iterator();
                while (it.hasNext()) {
                    b(it.next());
                }
            }
        }

        @Override
        public void onViewAttachedToWindow(View view) {
            c(view);
        }

        @Override
        public void onViewDetachedFromWindow(View view) {
        }
    }

    static abstract class f<T> {

        private final int f10625a;

        private final Class<T> f10626b;

        private final int f10627c;

        private final int f10628d;

        f(int i7, Class<T> cls, int i8) {
            this(i7, cls, 0, i8);
        }

        private boolean b() {
            return Build.VERSION.SDK_INT >= this.f10627c;
        }

        boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        abstract T c(View view);

        abstract void d(View view, T t7);

        T e(View view) {
            if (b()) {
                return c(view);
            }
            T t7 = (T) view.getTag(this.f10625a);
            if (this.f10626b.isInstance(t7)) {
                return t7;
            }
            return null;
        }

        void f(View view, T t7) {
            if (b()) {
                d(view, t7);
            } else if (g(e(view), t7)) {
                Z.j(view);
                view.setTag(this.f10625a, t7);
                Z.W(view, this.f10628d);
            }
        }

        abstract boolean g(T t7, T t8);

        f(int i7, Class<T> cls, int i8, int i9) {
            this.f10625a = i7;
            this.f10626b = cls;
            this.f10628d = i8;
            this.f10627c = i9;
        }
    }

    static class g {
        static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        static void c(View view) {
            view.requestApplyInsets();
        }
    }

    private static class h {

        class a implements View.OnApplyWindowInsetsListener {

            WindowInsetsCompat f10629a = null;

            final View f10630b;

            final I f10631c;

            a(View view, I i7) {
                this.f10630b = view;
                this.f10631c = i7;
            }

            @Override
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(windowInsets, view);
                int i7 = Build.VERSION.SDK_INT;
                if (i7 < 30) {
                    h.a(windowInsets, this.f10630b);
                    if (windowInsetsCompat.equals(this.f10629a)) {
                        return this.f10631c.K(view, windowInsetsCompat).toWindowInsets();
                    }
                }
                this.f10629a = windowInsetsCompat;
                WindowInsetsCompat windowInsetsCompatK = this.f10631c.K(view, windowInsetsCompat);
                if (i7 >= 30) {
                    return windowInsetsCompatK.toWindowInsets();
                }
                Z.k0(view);
                return windowInsetsCompatK.toWindowInsets();
            }
        }

        static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(o0.e.f22343S);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        static WindowInsetsCompat b(View view, WindowInsetsCompat windowInsetsCompat, Rect rect) {
            WindowInsets windowInsets = windowInsetsCompat.toWindowInsets();
            if (windowInsets != null) {
                return WindowInsetsCompat.toWindowInsetsCompat(view.computeSystemWindowInsets(windowInsets, rect), view);
            }
            rect.setEmpty();
            return windowInsetsCompat;
        }

        static ColorStateList c(View view) {
            return view.getBackgroundTintList();
        }

        static PorterDuff.Mode d(View view) {
            return view.getBackgroundTintMode();
        }

        static float e(View view) {
            return view.getElevation();
        }

        static String f(View view) {
            return view.getTransitionName();
        }

        static float g(View view) {
            return view.getTranslationZ();
        }

        static float h(View view) {
            return view.getZ();
        }

        static boolean i(View view) {
            return view.isNestedScrollingEnabled();
        }

        static void j(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        static void k(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        static void l(View view, float f7) {
            view.setElevation(f7);
        }

        static void m(View view, I i7) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(o0.e.f22336L, i7);
            }
            if (i7 == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(o0.e.f22343S));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, i7));
            }
        }

        static void n(View view, String str) {
            view.setTransitionName(str);
        }

        static void o(View view, float f7) {
            view.setTranslationZ(f7);
        }

        static void p(View view, float f7) {
            view.setZ(f7);
        }

        static void q(View view) {
            view.stopNestedScroll();
        }
    }

    private static class i {
        public static WindowInsetsCompat a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(rootWindowInsets);
            windowInsetsCompat.setRootWindowInsets(windowInsetsCompat);
            windowInsetsCompat.copyRootViewBounds(view.getRootView());
            return windowInsetsCompat;
        }

        static void b(View view, int i7, int i8) {
            view.setScrollIndicators(i7, i8);
        }
    }

    static class j {
        static int a(View view) {
            return view.getImportantForAutofill();
        }

        static void b(View view, int i7) {
            view.setImportantForAutofill(i7);
        }
    }

    static class k {
        static CharSequence a(View view) {
            return view.getAccessibilityPaneTitle();
        }

        static boolean b(View view) {
            return view.isAccessibilityHeading();
        }

        static boolean c(View view) {
            return view.isScreenReaderFocusable();
        }

        static void d(View view, boolean z7) {
            view.setAccessibilityHeading(z7);
        }

        static void e(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        static void f(View view, boolean z7) {
            view.setScreenReaderFocusable(z7);
        }
    }

    private static class l {
        static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        static void b(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i7, int i8) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i7, i8);
        }
    }

    private static class m {
        static CharSequence a(View view) {
            return view.getStateDescription();
        }

        public static c1 b(View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return c1.f(windowInsetsController);
            }
            return null;
        }

        static void c(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    private static final class n {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static C1611d b(View view, C1611d c1611d) {
            ContentInfo contentInfoF = c1611d.f();
            ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoF);
            if (contentInfoPerformReceiveContent == null) {
                return null;
            }
            return contentInfoPerformReceiveContent == contentInfoF ? c1611d : C1611d.g(contentInfoPerformReceiveContent);
        }
    }

    public interface o {
        boolean a(View view, KeyEvent keyEvent);
    }

    static class p {

        private static final ArrayList<WeakReference<View>> f10632d = new ArrayList<>();

        private WeakHashMap<View, Boolean> f10633a = null;

        private SparseArray<WeakReference<View>> f10634b = null;

        private WeakReference<KeyEvent> f10635c = null;

        p() {
        }

        static p a(View view) {
            int i7 = o0.e.f22341Q;
            p pVar = (p) view.getTag(i7);
            if (pVar != null) {
                return pVar;
            }
            p pVar2 = new p();
            view.setTag(i7, pVar2);
            return pVar2;
        }

        private View c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f10633a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View viewC = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (viewC != null) {
                            return viewC;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private SparseArray<WeakReference<View>> d() {
            if (this.f10634b == null) {
                this.f10634b = new SparseArray<>();
            }
            return this.f10634b;
        }

        private boolean e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(o0.e.f22342R);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((o) arrayList.get(size)).a(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        private void g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f10633a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f10632d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                try {
                    if (this.f10633a == null) {
                        this.f10633a = new WeakHashMap<>();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList<WeakReference<View>> arrayList2 = f10632d;
                        View view = arrayList2.get(size).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f10633a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f10633a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View viewC = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (viewC != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference<>(viewC));
                }
            }
            return viewC != null;
        }

        boolean f(KeyEvent keyEvent) {
            WeakReference<View> weakReferenceValueAt;
            int iIndexOfKey;
            WeakReference<KeyEvent> weakReference = this.f10635c;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f10635c = new WeakReference<>(keyEvent);
            SparseArray<WeakReference<View>> sparseArrayD = d();
            if (keyEvent.getAction() != 1 || (iIndexOfKey = sparseArrayD.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReferenceValueAt = null;
            } else {
                weakReferenceValueAt = sparseArrayD.valueAt(iIndexOfKey);
                sparseArrayD.removeAt(iIndexOfKey);
            }
            if (weakReferenceValueAt == null) {
                weakReferenceValueAt = sparseArrayD.get(keyEvent.getKeyCode());
            }
            if (weakReferenceValueAt == null) {
                return false;
            }
            View view = weakReferenceValueAt.get();
            if (view != null && view.isAttachedToWindow()) {
                e(view, keyEvent);
            }
            return true;
        }
    }

    @Deprecated
    public static int A(View view) {
        return view.getMinimumHeight();
    }

    @Deprecated
    public static void A0(View view, int i7) {
        view.setLabelFor(i7);
    }

    @Deprecated
    public static int B(View view) {
        return view.getMinimumWidth();
    }

    public static void B0(View view, I i7) {
        h.m(view, i7);
    }

    public static String[] C(View view) {
        return Build.VERSION.SDK_INT >= 31 ? n.a(view) : (String[]) view.getTag(o0.e.f22338N);
    }

    @Deprecated
    public static void C0(View view, int i7, int i8, int i9, int i10) {
        view.setPaddingRelative(i7, i8, i9, i10);
    }

    @Deprecated
    public static int D(View view) {
        return view.getPaddingEnd();
    }

    public static void D0(View view, boolean z7) {
        m0().f(view, Boolean.valueOf(z7));
    }

    @Deprecated
    public static int E(View view) {
        return view.getPaddingStart();
    }

    public static void E0(View view, int i7, int i8) {
        i.b(view, i7, i8);
    }

    public static WindowInsetsCompat F(View view) {
        return i.a(view);
    }

    public static void F0(View view, CharSequence charSequence) {
        K0().f(view, charSequence);
    }

    public static CharSequence G(View view) {
        return K0().e(view);
    }

    public static void G0(View view, String str) {
        h.n(view, str);
    }

    public static String H(View view) {
        return h.f(view);
    }

    public static void H0(View view, float f7) {
        h.o(view, f7);
    }

    public static float I(View view) {
        return h.g(view);
    }

    public static void I0(View view, C1630m0.b bVar) {
        C1630m0.d(view, bVar);
    }

    @Deprecated
    public static c1 J(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return m.b(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return C1628l0.a(window, view);
                }
                return null;
            }
        }
        return null;
    }

    public static void J0(View view, float f7) {
        h.p(view, f7);
    }

    @Deprecated
    public static int K(View view) {
        return view.getWindowSystemUiVisibility();
    }

    private static f<CharSequence> K0() {
        return new c(o0.e.f22340P, CharSequence.class, 64, 30);
    }

    public static float L(View view) {
        return h.h(view);
    }

    public static void L0(View view) {
        h.q(view);
    }

    public static boolean M(View view) {
        return m(view) != null;
    }

    @Deprecated
    public static boolean N(View view) {
        return view.hasOnClickListeners();
    }

    @Deprecated
    public static boolean O(View view) {
        return view.hasTransientState();
    }

    public static boolean P(View view) {
        Boolean boolE = b().e(view);
        return boolE != null && boolE.booleanValue();
    }

    @Deprecated
    public static boolean Q(View view) {
        return view.isAttachedToWindow();
    }

    @Deprecated
    public static boolean R(View view) {
        return view.isLaidOut();
    }

    public static boolean S(View view) {
        return h.i(view);
    }

    @Deprecated
    public static boolean T(View view) {
        return view.isPaddingRelative();
    }

    public static boolean U(View view) {
        Boolean boolE = m0().e(view);
        return boolE != null && boolE.booleanValue();
    }

    public static C1611d V(C1611d c1611d) {
        return c1611d;
    }

    static void W(View view, int i7) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z7 = o(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z7) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z7 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i7);
                if (z7) {
                    accessibilityEventObtain.getText().add(o(view));
                    y0(view);
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i7 == 32) {
                AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.setEventType(32);
                accessibilityEventObtain2.setContentChangeTypes(i7);
                accessibilityEventObtain2.setSource(view);
                view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.getText().add(o(view));
                accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i7);
                } catch (AbstractMethodError e7) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e7);
                }
            }
        }
    }

    public static void X(View view, int i7) {
        view.offsetLeftAndRight(i7);
    }

    public static void Y(View view, int i7) {
        view.offsetTopAndBottom(i7);
    }

    public static WindowInsetsCompat Z(View view, WindowInsetsCompat windowInsetsCompat) {
        WindowInsets windowInsets = windowInsetsCompat.toWindowInsets();
        if (windowInsets != null) {
            WindowInsets windowInsetsB = g.b(view, windowInsets);
            if (!windowInsetsB.equals(windowInsets)) {
                return WindowInsetsCompat.toWindowInsetsCompat(windowInsetsB, view);
            }
        }
        return windowInsetsCompat;
    }

    @Deprecated
    public static void a0(View view, C3019t c3019t) {
        view.onInitializeAccessibilityNodeInfo(c3019t.E0());
    }

    private static f<Boolean> b() {
        return new d(o0.e.f22334J, Boolean.class, 28);
    }

    private static f<CharSequence> b0() {
        return new b(o0.e.f22335K, CharSequence.class, 8, 28);
    }

    public static int c(View view, CharSequence charSequence, InterfaceC3022w interfaceC3022w) {
        int iQ = q(view, charSequence);
        if (iQ != -1) {
            d(view, new C3019t.a(iQ, charSequence, interfaceC3022w));
        }
        return iQ;
    }

    @Deprecated
    public static boolean c0(View view, int i7, Bundle bundle) {
        return view.performAccessibilityAction(i7, bundle);
    }

    private static void d(View view, C3019t.a aVar) {
        j(view);
        i0(aVar.b(), view);
        p(view).add(aVar);
        W(view, 0);
    }

    public static C1611d d0(View view, C1611d c1611d) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c1611d + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return n.b(view, c1611d);
        }
        J j7 = (J) view.getTag(o0.e.f22337M);
        if (j7 == null) {
            return v(view).onReceiveContent(c1611d);
        }
        C1611d c1611dA = j7.a(view, c1611d);
        if (c1611dA == null) {
            return null;
        }
        return v(view).onReceiveContent(c1611dA);
    }

    @Deprecated
    public static C1620h0 e(View view) {
        if (f10618a == null) {
            f10618a = new WeakHashMap<>();
        }
        C1620h0 c1620h0 = f10618a.get(view);
        if (c1620h0 != null) {
            return c1620h0;
        }
        C1620h0 c1620h02 = new C1620h0(view);
        f10618a.put(view, c1620h02);
        return c1620h02;
    }

    @Deprecated
    public static void e0(View view) {
        view.postInvalidateOnAnimation();
    }

    public static WindowInsetsCompat f(View view, WindowInsetsCompat windowInsetsCompat, Rect rect) {
        return h.b(view, windowInsetsCompat, rect);
    }

    @Deprecated
    public static void f0(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static WindowInsetsCompat g(View view, WindowInsetsCompat windowInsetsCompat) {
        WindowInsets windowInsets = windowInsetsCompat.toWindowInsets();
        if (windowInsets != null) {
            WindowInsets windowInsetsA = g.a(view, windowInsets);
            if (!windowInsetsA.equals(windowInsets)) {
                return WindowInsetsCompat.toWindowInsetsCompat(windowInsetsA, view);
            }
        }
        return windowInsetsCompat;
    }

    @Deprecated
    public static void g0(View view, Runnable runnable, long j7) {
        view.postOnAnimationDelayed(runnable, j7);
    }

    static boolean h(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return p.a(view).b(view, keyEvent);
    }

    public static void h0(View view, int i7) {
        i0(i7, view);
        W(view, 0);
    }

    static boolean i(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return p.a(view).f(keyEvent);
    }

    private static void i0(int i7, View view) {
        List<C3019t.a> listP = p(view);
        for (int i8 = 0; i8 < listP.size(); i8++) {
            if (listP.get(i8).b() == i7) {
                listP.remove(i8);
                return;
            }
        }
    }

    static void j(View view) {
        C1605a c1605aL = l(view);
        if (c1605aL == null) {
            c1605aL = new C1605a();
        }
        n0(view, c1605aL);
    }

    public static void j0(View view, C3019t.a aVar, CharSequence charSequence, InterfaceC3022w interfaceC3022w) {
        if (interfaceC3022w == null && charSequence == null) {
            h0(view, aVar.b());
        } else {
            d(view, aVar.a(charSequence, interfaceC3022w));
        }
    }

    @Deprecated
    public static int k() {
        return View.generateViewId();
    }

    public static void k0(View view) {
        g.c(view);
    }

    public static C1605a l(View view) {
        View.AccessibilityDelegate accessibilityDelegateM = m(view);
        if (accessibilityDelegateM == null) {
            return null;
        }
        return accessibilityDelegateM instanceof C1605a.C0086a ? ((C1605a.C0086a) accessibilityDelegateM).f10639a : new C1605a(accessibilityDelegateM);
    }

    public static void l0(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i7, int i8) {
        if (Build.VERSION.SDK_INT >= 29) {
            l.b(view, context, iArr, attributeSet, typedArray, i7, i8);
        }
    }

    private static View.AccessibilityDelegate m(View view) {
        return Build.VERSION.SDK_INT >= 29 ? l.a(view) : n(view);
    }

    private static f<Boolean> m0() {
        return new a(o0.e.f22339O, Boolean.class, 28);
    }

    private static View.AccessibilityDelegate n(View view) {
        if (f10620c) {
            return null;
        }
        if (f10619b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f10619b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f10620c = true;
                return null;
            }
        }
        try {
            Object obj = f10619b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f10620c = true;
            return null;
        }
    }

    public static void n0(View view, C1605a c1605a) {
        if (c1605a == null && (m(view) instanceof C1605a.C0086a)) {
            c1605a = new C1605a();
        }
        y0(view);
        view.setAccessibilityDelegate(c1605a == null ? null : c1605a.d());
    }

    public static CharSequence o(View view) {
        return b0().e(view);
    }

    public static void o0(View view, boolean z7) {
        b().f(view, Boolean.valueOf(z7));
    }

    private static List<C3019t.a> p(View view) {
        int i7 = o0.e.f22332H;
        ArrayList arrayList = (ArrayList) view.getTag(i7);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(i7, arrayList2);
        return arrayList2;
    }

    @Deprecated
    public static void p0(View view, int i7) {
        view.setAccessibilityLiveRegion(i7);
    }

    private static int q(View view, CharSequence charSequence) {
        List<C3019t.a> listP = p(view);
        for (int i7 = 0; i7 < listP.size(); i7++) {
            if (TextUtils.equals(charSequence, listP.get(i7).c())) {
                return listP.get(i7).b();
            }
        }
        int i8 = -1;
        int i9 = 0;
        while (true) {
            int[] iArr = f10621d;
            if (i9 >= iArr.length || i8 != -1) {
                break;
            }
            int i10 = iArr[i9];
            boolean z7 = true;
            for (int i11 = 0; i11 < listP.size(); i11++) {
                z7 &= listP.get(i11).b() != i10;
            }
            if (z7) {
                i8 = i10;
            }
            i9++;
        }
        return i8;
    }

    public static void q0(View view, CharSequence charSequence) {
        b0().f(view, charSequence);
        if (charSequence != null) {
            f10623f.a(view);
        } else {
            f10623f.d(view);
        }
    }

    public static ColorStateList r(View view) {
        return h.c(view);
    }

    @Deprecated
    public static void r0(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static PorterDuff.Mode s(View view) {
        return h.d(view);
    }

    public static void s0(View view, ColorStateList colorStateList) {
        h.j(view, colorStateList);
    }

    @Deprecated
    public static Display t(View view) {
        return view.getDisplay();
    }

    public static void t0(View view, PorterDuff.Mode mode) {
        h.k(view, mode);
    }

    public static float u(View view) {
        return h.e(view);
    }

    @Deprecated
    public static void u0(View view, Rect rect) {
        view.setClipBounds(rect);
    }

    private static K v(View view) {
        return view instanceof K ? (K) view : f10622e;
    }

    public static void v0(View view, float f7) {
        h.l(view, f7);
    }

    @Deprecated
    public static boolean w(View view) {
        return view.getFitsSystemWindows();
    }

    @Deprecated
    public static void w0(View view, boolean z7) {
        view.setFitsSystemWindows(z7);
    }

    @Deprecated
    public static int x(View view) {
        return view.getImportantForAccessibility();
    }

    @Deprecated
    public static void x0(View view, int i7) {
        view.setImportantForAccessibility(i7);
    }

    public static int y(View view) {
        return j.a(view);
    }

    private static void y0(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    @Deprecated
    public static int z(View view) {
        return view.getLayoutDirection();
    }

    public static void z0(View view, int i7) {
        j.b(view, i7);
    }
}
