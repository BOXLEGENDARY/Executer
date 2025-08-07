package androidx.appcompat.app;

import S9.Gvmm.CAqKeu;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.AbstractC1694h;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.InterfaceC1701o;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.b;
import androidx.appcompat.view.f;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.DecorContentParent;
import androidx.appcompat.widget.TintTypedArray;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.VectorEnabledTintResources;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.appcompat.widget.ViewUtils;
import androidx.core.view.C1620h0;
import androidx.core.view.C1624j0;
import androidx.core.view.C1642t;
import androidx.core.view.C1644u;
import androidx.core.view.I;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.Z;
import g.C2447a;
import g.C2449c;
import g.C2452f;
import g.C2453g;
import g.C2455i;
import g.C2456j;
import h.C2473a;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import p0.h;
import ya.HnSi.PLHvHoayk;

class h extends androidx.appcompat.app.g implements g.a, LayoutInflater.Factory2 {

    private static final g0.k<String, Integer> f8608C0 = new g0.k<>();

    private static final boolean f8609D0 = false;

    private static final int[] f8610E0 = {R.attr.windowBackground};

    private static final boolean f8611F0 = !"robolectric".equals(Build.FINGERPRINT);

    private static final boolean f8612G0 = true;

    private OnBackInvokedDispatcher f8613A0;

    private OnBackInvokedCallback f8614B0;

    final Object f8615C;

    final Context f8616D;

    Window f8617E;

    private o f8618F;

    final androidx.appcompat.app.e f8619G;

    androidx.appcompat.app.a f8620H;

    MenuInflater f8621I;

    private CharSequence f8622J;

    private DecorContentParent f8623K;

    private C0068h f8624L;

    private v f8625M;

    androidx.appcompat.view.b f8626N;

    ActionBarContextView f8627O;

    PopupWindow f8628P;

    Runnable f8629Q;

    C1620h0 f8630R;

    private boolean f8631S;

    private boolean f8632T;

    ViewGroup f8633U;

    private TextView f8634V;

    private View f8635W;

    private boolean f8636X;

    private boolean f8637Y;

    boolean f8638Z;

    boolean f8639a0;

    boolean f8640b0;

    boolean f8641c0;

    boolean f8642d0;

    private boolean f8643e0;

    private u[] f8644f0;

    private u f8645g0;

    private boolean f8646h0;

    private boolean f8647i0;

    private boolean f8648j0;

    boolean f8649k0;

    private Configuration f8650l0;

    private int f8651m0;

    private int f8652n0;

    private int f8653o0;

    private boolean f8654p0;

    private q f8655q0;

    private q f8656r0;

    boolean f8657s0;

    int f8658t0;

    private final Runnable f8659u0;

    private boolean f8660v0;

    private Rect f8661w0;

    private Rect f8662x0;

    private androidx.appcompat.app.q f8663y0;

    private androidx.appcompat.app.u f8664z0;

    class a implements Runnable {
        a() {
        }

        @Override
        public void run() {
            h hVar = h.this;
            if ((hVar.f8658t0 & 1) != 0) {
                hVar.i0(0);
            }
            h hVar2 = h.this;
            if ((hVar2.f8658t0 & 4096) != 0) {
                hVar2.i0(108);
            }
            h hVar3 = h.this;
            hVar3.f8657s0 = false;
            hVar3.f8658t0 = 0;
        }
    }

    class b implements I {
        b() {
        }

        @Override
        public WindowInsetsCompat K(View view, WindowInsetsCompat windowInsetsCompat) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            int systemWindowInsetTop = windowInsetsCompat.getSystemWindowInsetTop();
            int iE1 = h.this.e1(windowInsetsCompat, null);
            if (systemWindowInsetTop != iE1) {
                windowInsetsCompat = windowInsetsCompat.replaceSystemWindowInsets(windowInsetsCompat.getSystemWindowInsetLeft(), iE1, windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom());
            }
            return Z.Z(view, windowInsetsCompat);
        }
    }

    class c implements ContentFrameLayout.OnAttachListener {
        c() {
        }

        @Override
        public void onAttachedFromWindow() {
        }

        @Override
        public void onDetachedFromWindow() {
            h.this.g0();
        }
    }

    class d implements Runnable {

        class a extends C1624j0 {
            a() {
            }

            @Override
            public void onAnimationEnd(View view) {
                h.this.f8627O.setAlpha(1.0f);
                h.this.f8630R.h(null);
                h.this.f8630R = null;
            }

            @Override
            public void onAnimationStart(View view) {
                h.this.f8627O.setVisibility(0);
            }
        }

        d() {
        }

        @Override
        public void run() {
            h hVar = h.this;
            hVar.f8628P.showAtLocation(hVar.f8627O, 55, 0, 0);
            h.this.j0();
            if (!h.this.U0()) {
                h.this.f8627O.setAlpha(1.0f);
                h.this.f8627O.setVisibility(0);
            } else {
                h.this.f8627O.setAlpha(0.0f);
                h hVar2 = h.this;
                hVar2.f8630R = Z.e(hVar2.f8627O).b(1.0f);
                h.this.f8630R.h(new a());
            }
        }
    }

    class e extends C1624j0 {
        e() {
        }

        @Override
        public void onAnimationEnd(View view) {
            h.this.f8627O.setAlpha(1.0f);
            h.this.f8630R.h(null);
            h.this.f8630R = null;
        }

        @Override
        public void onAnimationStart(View view) {
            h.this.f8627O.setVisibility(0);
            if (h.this.f8627O.getParent() instanceof View) {
                Z.k0((View) h.this.f8627O.getParent());
            }
        }
    }

    private class f implements androidx.appcompat.app.b {
        f() {
        }
    }

    interface g {
        boolean a(int i7);

        View onCreatePanelView(int i7);
    }

    private final class C0068h implements m.a {
        C0068h() {
        }

        @Override
        public void a(androidx.appcompat.view.menu.g gVar, boolean z7) {
            h.this.Z(gVar);
        }

        @Override
        public boolean b(androidx.appcompat.view.menu.g gVar) {
            Window.Callback callbackV0 = h.this.v0();
            if (callbackV0 == null) {
                return true;
            }
            callbackV0.onMenuOpened(108, gVar);
            return true;
        }
    }

    class i implements b.a {

        private b.a f8673a;

        class a extends C1624j0 {
            a() {
            }

            @Override
            public void onAnimationEnd(View view) {
                h.this.f8627O.setVisibility(8);
                h hVar = h.this;
                PopupWindow popupWindow = hVar.f8628P;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (hVar.f8627O.getParent() instanceof View) {
                    Z.k0((View) h.this.f8627O.getParent());
                }
                h.this.f8627O.killMode();
                h.this.f8630R.h(null);
                h hVar2 = h.this;
                hVar2.f8630R = null;
                Z.k0(hVar2.f8633U);
            }
        }

        public i(b.a aVar) {
            this.f8673a = aVar;
        }

        @Override
        public void a(androidx.appcompat.view.b bVar) {
            this.f8673a.a(bVar);
            h hVar = h.this;
            if (hVar.f8628P != null) {
                hVar.f8617E.getDecorView().removeCallbacks(h.this.f8629Q);
            }
            h hVar2 = h.this;
            if (hVar2.f8627O != null) {
                hVar2.j0();
                h hVar3 = h.this;
                hVar3.f8630R = Z.e(hVar3.f8627O).b(0.0f);
                h.this.f8630R.h(new a());
            }
            h hVar4 = h.this;
            androidx.appcompat.app.e eVar = hVar4.f8619G;
            if (eVar != null) {
                eVar.onSupportActionModeFinished(hVar4.f8626N);
            }
            h hVar5 = h.this;
            hVar5.f8626N = null;
            Z.k0(hVar5.f8633U);
            h.this.c1();
        }

        @Override
        public boolean b(androidx.appcompat.view.b bVar, Menu menu) {
            return this.f8673a.b(bVar, menu);
        }

        @Override
        public boolean c(androidx.appcompat.view.b bVar, Menu menu) {
            Z.k0(h.this.f8633U);
            return this.f8673a.c(bVar, menu);
        }

        @Override
        public boolean d(androidx.appcompat.view.b bVar, MenuItem menuItem) {
            return this.f8673a.d(bVar, menuItem);
        }
    }

    static class j {
        static Context a(Context context, Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        static void b(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i7 = configuration.densityDpi;
            int i8 = configuration2.densityDpi;
            if (i7 != i8) {
                configuration3.densityDpi = i8;
            }
        }

        static void c(Configuration configuration, Locale locale) {
            configuration.setLayoutDirection(locale);
        }

        static void d(Configuration configuration, Locale locale) {
            configuration.setLocale(locale);
        }
    }

    static class k {
        static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        static String b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    static class l {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        static u0.i b(Configuration configuration) {
            return u0.i.b(configuration.getLocales().toLanguageTags());
        }

        public static void c(u0.i iVar) {
            LocaleList.setDefault(LocaleList.forLanguageTags(iVar.g()));
        }

        static void d(Configuration configuration, u0.i iVar) {
            configuration.setLocales(LocaleList.forLanguageTags(iVar.g()));
        }
    }

    static class m {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i7 = configuration.colorMode & 3;
            int i8 = configuration2.colorMode;
            if (i7 != (i8 & 3)) {
                configuration3.colorMode |= i8 & 3;
            }
            int i9 = configuration.colorMode & 12;
            int i10 = configuration2.colorMode;
            if (i9 != (i10 & 12)) {
                configuration3.colorMode |= i10 & 12;
            }
        }
    }

    static class n {
        static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        static OnBackInvokedCallback b(Object obj, final h hVar) {
            Objects.requireNonNull(hVar);
            OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() {
                public final void onBackInvoked() {
                    hVar.D0();
                }
            };
            androidx.appcompat.app.j.a(obj).registerOnBackInvokedCallback(1000000, onBackInvokedCallback);
            return onBackInvokedCallback;
        }

        static void c(Object obj, Object obj2) {
            androidx.appcompat.app.j.a(obj).unregisterOnBackInvokedCallback(androidx.appcompat.app.i.a(obj2));
        }
    }

    class o extends androidx.appcompat.view.i {

        private g f8676e;

        private boolean f8677i;

        private boolean f8678v;

        private boolean f8679w;

        o(Window.Callback callback) {
            super(callback);
        }

        public boolean b(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.f8678v = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.f8678v = false;
            }
        }

        public void c(Window.Callback callback) {
            try {
                this.f8677i = true;
                callback.onContentChanged();
            } finally {
                this.f8677i = false;
            }
        }

        public void d(Window.Callback callback, int i7, Menu menu) {
            try {
                this.f8679w = true;
                callback.onPanelClosed(i7, menu);
            } finally {
                this.f8679w = false;
            }
        }

        @Override
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.f8678v ? a().dispatchKeyEvent(keyEvent) : h.this.h0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || h.this.G0(keyEvent.getKeyCode(), keyEvent);
        }

        void e(g gVar) {
            this.f8676e = gVar;
        }

        final ActionMode f(ActionMode.Callback callback) {
            f.a aVar = new f.a(h.this.f8616D, callback);
            androidx.appcompat.view.b bVarP = h.this.P(aVar);
            if (bVarP != null) {
                return aVar.e(bVarP);
            }
            return null;
        }

        @Override
        public void onContentChanged() {
            if (this.f8677i) {
                a().onContentChanged();
            }
        }

        @Override
        public boolean onCreatePanelMenu(int i7, Menu menu) {
            if (i7 != 0 || (menu instanceof androidx.appcompat.view.menu.g)) {
                return super.onCreatePanelMenu(i7, menu);
            }
            return false;
        }

        @Override
        public View onCreatePanelView(int i7) {
            View viewOnCreatePanelView;
            g gVar = this.f8676e;
            return (gVar == null || (viewOnCreatePanelView = gVar.onCreatePanelView(i7)) == null) ? super.onCreatePanelView(i7) : viewOnCreatePanelView;
        }

        @Override
        public boolean onMenuOpened(int i7, Menu menu) {
            super.onMenuOpened(i7, menu);
            h.this.J0(i7);
            return true;
        }

        @Override
        public void onPanelClosed(int i7, Menu menu) {
            if (this.f8679w) {
                a().onPanelClosed(i7, menu);
            } else {
                super.onPanelClosed(i7, menu);
                h.this.K0(i7);
            }
        }

        @Override
        public boolean onPreparePanel(int i7, View view, Menu menu) {
            androidx.appcompat.view.menu.g gVar = menu instanceof androidx.appcompat.view.menu.g ? (androidx.appcompat.view.menu.g) menu : null;
            if (i7 == 0 && gVar == null) {
                return false;
            }
            if (gVar != null) {
                gVar.a0(true);
            }
            g gVar2 = this.f8676e;
            boolean zOnPreparePanel = gVar2 != null && gVar2.a(i7);
            if (!zOnPreparePanel) {
                zOnPreparePanel = super.onPreparePanel(i7, view, menu);
            }
            if (gVar != null) {
                gVar.a0(false);
            }
            return zOnPreparePanel;
        }

        @Override
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i7) {
            androidx.appcompat.view.menu.g gVar;
            u uVarT0 = h.this.t0(0, true);
            if (uVarT0 == null || (gVar = uVarT0.f8698j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i7);
            } else {
                super.onProvideKeyboardShortcuts(list, gVar, i7);
            }
        }

        @Override
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @Override
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i7) {
            return (h.this.B0() && i7 == 0) ? f(callback) : super.onWindowStartingActionMode(callback, i7);
        }
    }

    private class p extends q {

        private final PowerManager f8681c;

        p(Context context) {
            super();
            this.f8681c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override
        public int c() {
            return k.a(this.f8681c) ? 2 : 1;
        }

        @Override
        public void d() {
            h.this.T();
        }
    }

    abstract class q {

        private BroadcastReceiver f8683a;

        class a extends BroadcastReceiver {
            a() {
            }

            @Override
            public void onReceive(Context context, Intent intent) {
                q.this.d();
            }
        }

        q() {
        }

        void a() {
            BroadcastReceiver broadcastReceiver = this.f8683a;
            if (broadcastReceiver != null) {
                try {
                    h.this.f8616D.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f8683a = null;
            }
        }

        abstract IntentFilter b();

        abstract int c();

        public abstract void d();

        void e() {
            a();
            IntentFilter intentFilterB = b();
            if (intentFilterB == null || intentFilterB.countActions() == 0) {
                return;
            }
            if (this.f8683a == null) {
                this.f8683a = new a();
            }
            h.this.f8616D.registerReceiver(this.f8683a, intentFilterB);
        }
    }

    private class r extends q {

        private final y f8686c;

        r(y yVar) {
            super();
            this.f8686c = yVar;
        }

        @Override
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override
        public int c() {
            return this.f8686c.d() ? 2 : 1;
        }

        @Override
        public void d() {
            h.this.T();
        }
    }

    private static class s {
        static void a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    private class t extends ContentFrameLayout {
        public t(Context context) {
            super(context);
        }

        private boolean a(int i7, int i8) {
            return i7 < -5 || i8 < -5 || i7 > getWidth() + 5 || i8 > getHeight() + 5;
        }

        @Override
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return h.this.h0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !a((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            h.this.b0(0);
            return true;
        }

        @Override
        public void setBackgroundResource(int i7) {
            setBackgroundDrawable(C2473a.b(getContext(), i7));
        }
    }

    protected static final class u {

        int f8689a;

        int f8690b;

        int f8691c;

        int f8692d;

        int f8693e;

        int f8694f;

        ViewGroup f8695g;

        View f8696h;

        View f8697i;

        androidx.appcompat.view.menu.g f8698j;

        androidx.appcompat.view.menu.e f8699k;

        Context f8700l;

        boolean f8701m;

        boolean f8702n;

        boolean f8703o;

        public boolean f8704p;

        boolean f8705q = false;

        boolean f8706r;

        Bundle f8707s;

        u(int i7) {
            this.f8689a = i7;
        }

        androidx.appcompat.view.menu.n a(m.a aVar) {
            if (this.f8698j == null) {
                return null;
            }
            if (this.f8699k == null) {
                androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(this.f8700l, C2453g.f20688l);
                this.f8699k = eVar;
                eVar.f(aVar);
                this.f8698j.b(this.f8699k);
            }
            return this.f8699k.j(this.f8695g);
        }

        public boolean b() {
            if (this.f8696h == null) {
                return false;
            }
            return this.f8697i != null || this.f8699k.i().getCount() > 0;
        }

        void c(androidx.appcompat.view.menu.g gVar) {
            androidx.appcompat.view.menu.e eVar;
            androidx.appcompat.view.menu.g gVar2 = this.f8698j;
            if (gVar == gVar2) {
                return;
            }
            if (gVar2 != null) {
                gVar2.O(this.f8699k);
            }
            this.f8698j = gVar;
            if (gVar == null || (eVar = this.f8699k) == null) {
                return;
            }
            gVar.b(eVar);
        }

        void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(C2447a.f20539a, typedValue, true);
            int i7 = typedValue.resourceId;
            if (i7 != 0) {
                themeNewTheme.applyStyle(i7, true);
            }
            themeNewTheme.resolveAttribute(C2447a.f20528I, typedValue, true);
            int i8 = typedValue.resourceId;
            if (i8 != 0) {
                themeNewTheme.applyStyle(i8, true);
            } else {
                themeNewTheme.applyStyle(C2455i.f20716a, true);
            }
            androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, 0);
            dVar.getTheme().setTo(themeNewTheme);
            this.f8700l = dVar;
            TypedArray typedArrayObtainStyledAttributes = dVar.obtainStyledAttributes(C2456j.f20720A0);
            this.f8690b = typedArrayObtainStyledAttributes.getResourceId(C2456j.f20732D0, 0);
            this.f8694f = typedArrayObtainStyledAttributes.getResourceId(C2456j.f20728C0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private final class v implements m.a {
        v() {
        }

        @Override
        public void a(androidx.appcompat.view.menu.g gVar, boolean z7) {
            androidx.appcompat.view.menu.g gVarD = gVar.D();
            boolean z8 = gVarD != gVar;
            h hVar = h.this;
            if (z8) {
                gVar = gVarD;
            }
            u uVarM0 = hVar.m0(gVar);
            if (uVarM0 != null) {
                if (!z8) {
                    h.this.c0(uVarM0, z7);
                } else {
                    h.this.Y(uVarM0.f8689a, uVarM0, gVarD);
                    h.this.c0(uVarM0, true);
                }
            }
        }

        @Override
        public boolean b(androidx.appcompat.view.menu.g gVar) {
            Window.Callback callbackV0;
            if (gVar != gVar.D()) {
                return true;
            }
            h hVar = h.this;
            if (!hVar.f8638Z || (callbackV0 = hVar.v0()) == null || h.this.f8649k0) {
                return true;
            }
            callbackV0.onMenuOpened(108, gVar);
            return true;
        }
    }

    h(Activity activity, androidx.appcompat.app.e eVar) {
        this(activity, null, eVar, activity);
    }

    private void A0(int i7) {
        this.f8658t0 = (1 << i7) | this.f8658t0;
        if (this.f8657s0) {
            return;
        }
        Z.f0(this.f8617E.getDecorView(), this.f8659u0);
        this.f8657s0 = true;
    }

    private boolean F0(int i7, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        u uVarT0 = t0(i7, true);
        if (uVarT0.f8703o) {
            return false;
        }
        return P0(uVarT0, keyEvent);
    }

    private boolean I0(int r5, android.view.KeyEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.I0(int, android.view.KeyEvent):boolean");
    }

    private void M0(androidx.appcompat.app.h.u r12, android.view.KeyEvent r13) {
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.M0(androidx.appcompat.app.h$u, android.view.KeyEvent):void");
    }

    private boolean O0(u uVar, int i7, KeyEvent keyEvent, int i8) {
        androidx.appcompat.view.menu.g gVar;
        boolean zPerformShortcut = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((uVar.f8701m || P0(uVar, keyEvent)) && (gVar = uVar.f8698j) != null) {
            zPerformShortcut = gVar.performShortcut(i7, keyEvent, i8);
        }
        if (zPerformShortcut && (i8 & 1) == 0 && this.f8623K == null) {
            c0(uVar, true);
        }
        return zPerformShortcut;
    }

    private boolean P0(u uVar, KeyEvent keyEvent) {
        DecorContentParent decorContentParent;
        DecorContentParent decorContentParent2;
        DecorContentParent decorContentParent3;
        if (this.f8649k0) {
            return false;
        }
        if (uVar.f8701m) {
            return true;
        }
        u uVar2 = this.f8645g0;
        if (uVar2 != null && uVar2 != uVar) {
            c0(uVar2, false);
        }
        Window.Callback callbackV0 = v0();
        if (callbackV0 != null) {
            uVar.f8697i = callbackV0.onCreatePanelView(uVar.f8689a);
        }
        int i7 = uVar.f8689a;
        boolean z7 = i7 == 0 || i7 == 108;
        if (z7 && (decorContentParent3 = this.f8623K) != null) {
            decorContentParent3.setMenuPrepared();
        }
        if (uVar.f8697i == null && (!z7 || !(N0() instanceof w))) {
            androidx.appcompat.view.menu.g gVar = uVar.f8698j;
            if (gVar == null || uVar.f8706r) {
                if (gVar == null && (!z0(uVar) || uVar.f8698j == null)) {
                    return false;
                }
                if (z7 && this.f8623K != null) {
                    if (this.f8624L == null) {
                        this.f8624L = new C0068h();
                    }
                    this.f8623K.setMenu(uVar.f8698j, this.f8624L);
                }
                uVar.f8698j.d0();
                if (!callbackV0.onCreatePanelMenu(uVar.f8689a, uVar.f8698j)) {
                    uVar.c(null);
                    if (z7 && (decorContentParent = this.f8623K) != null) {
                        decorContentParent.setMenu(null, this.f8624L);
                    }
                    return false;
                }
                uVar.f8706r = false;
            }
            uVar.f8698j.d0();
            Bundle bundle = uVar.f8707s;
            if (bundle != null) {
                uVar.f8698j.P(bundle);
                uVar.f8707s = null;
            }
            if (!callbackV0.onPreparePanel(0, uVar.f8697i, uVar.f8698j)) {
                if (z7 && (decorContentParent2 = this.f8623K) != null) {
                    decorContentParent2.setMenu(null, this.f8624L);
                }
                uVar.f8698j.c0();
                return false;
            }
            boolean z8 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            uVar.f8704p = z8;
            uVar.f8698j.setQwertyMode(z8);
            uVar.f8698j.c0();
        }
        uVar.f8701m = true;
        uVar.f8702n = false;
        this.f8645g0 = uVar;
        return true;
    }

    private void Q0(boolean z7) {
        DecorContentParent decorContentParent = this.f8623K;
        if (decorContentParent == null || !decorContentParent.canShowOverflowMenu() || (ViewConfiguration.get(this.f8616D).hasPermanentMenuKey() && !this.f8623K.isOverflowMenuShowPending())) {
            u uVarT0 = t0(0, true);
            uVarT0.f8705q = true;
            c0(uVarT0, false);
            M0(uVarT0, null);
            return;
        }
        Window.Callback callbackV0 = v0();
        if (this.f8623K.isOverflowMenuShowing() && z7) {
            this.f8623K.hideOverflowMenu();
            if (this.f8649k0) {
                return;
            }
            callbackV0.onPanelClosed(108, t0(0, true).f8698j);
            return;
        }
        if (callbackV0 == null || this.f8649k0) {
            return;
        }
        if (this.f8657s0 && (this.f8658t0 & 1) != 0) {
            this.f8617E.getDecorView().removeCallbacks(this.f8659u0);
            this.f8659u0.run();
        }
        u uVarT02 = t0(0, true);
        androidx.appcompat.view.menu.g gVar = uVarT02.f8698j;
        if (gVar == null || uVarT02.f8706r || !callbackV0.onPreparePanel(0, uVarT02.f8697i, gVar)) {
            return;
        }
        callbackV0.onMenuOpened(108, uVarT02.f8698j);
        this.f8623K.showOverflowMenu();
    }

    private boolean R(boolean z7) {
        return S(z7, true);
    }

    private int R0(int i7) {
        if (i7 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (i7 != 9) {
            return i7;
        }
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        return 109;
    }

    private boolean S(boolean z7, boolean z8) throws PackageManager.NameNotFoundException {
        if (this.f8649k0) {
            return false;
        }
        int iX = X();
        int iC0 = C0(this.f8616D, iX);
        u0.i iVarW = Build.VERSION.SDK_INT < 33 ? W(this.f8616D) : null;
        if (!z8 && iVarW != null) {
            iVarW = s0(this.f8616D.getResources().getConfiguration());
        }
        boolean zB1 = b1(iC0, iVarW, z7);
        if (iX == 0) {
            r0(this.f8616D).e();
        } else {
            q qVar = this.f8655q0;
            if (qVar != null) {
                qVar.a();
            }
        }
        if (iX == 3) {
            q0(this.f8616D).e();
        } else {
            q qVar2 = this.f8656r0;
            if (qVar2 != null) {
                qVar2.a();
            }
        }
        return zB1;
    }

    private void U() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f8633U.findViewById(R.id.content);
        View decorView = this.f8617E.getDecorView();
        contentFrameLayout.setDecorPadding(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes = this.f8616D.obtainStyledAttributes(C2456j.f20720A0);
        typedArrayObtainStyledAttributes.getValue(C2456j.f20762M0, contentFrameLayout.getMinWidthMajor());
        typedArrayObtainStyledAttributes.getValue(C2456j.f20765N0, contentFrameLayout.getMinWidthMinor());
        int i7 = C2456j.f20756K0;
        if (typedArrayObtainStyledAttributes.hasValue(i7)) {
            typedArrayObtainStyledAttributes.getValue(i7, contentFrameLayout.getFixedWidthMajor());
        }
        int i8 = C2456j.f20759L0;
        if (typedArrayObtainStyledAttributes.hasValue(i8)) {
            typedArrayObtainStyledAttributes.getValue(i8, contentFrameLayout.getFixedWidthMinor());
        }
        int i9 = C2456j.f20749I0;
        if (typedArrayObtainStyledAttributes.hasValue(i9)) {
            typedArrayObtainStyledAttributes.getValue(i9, contentFrameLayout.getFixedHeightMajor());
        }
        int i10 = C2456j.f20752J0;
        if (typedArrayObtainStyledAttributes.hasValue(i10)) {
            typedArrayObtainStyledAttributes.getValue(i10, contentFrameLayout.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private void V(Window window) {
        if (this.f8617E != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof o) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        o oVar = new o(callback);
        this.f8618F = oVar;
        window.setCallback(oVar);
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(this.f8616D, (AttributeSet) null, f8610E0);
        Drawable drawableIfKnown = tintTypedArrayObtainStyledAttributes.getDrawableIfKnown(0);
        if (drawableIfKnown != null) {
            window.setBackgroundDrawable(drawableIfKnown);
        }
        tintTypedArrayObtainStyledAttributes.recycle();
        this.f8617E = window;
        if (Build.VERSION.SDK_INT < 33 || this.f8613A0 != null) {
            return;
        }
        L(null);
    }

    private boolean V0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f8617E.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || Z.Q((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private int X() {
        int i7 = this.f8651m0;
        return i7 != -100 ? i7 : androidx.appcompat.app.g.m();
    }

    private void Y0() {
        if (this.f8632T) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private androidx.appcompat.app.d Z0() {
        for (Context baseContext = this.f8616D; baseContext != null; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof androidx.appcompat.app.d) {
                return (androidx.appcompat.app.d) baseContext;
            }
            if (!(baseContext instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    private void a0() {
        q qVar = this.f8655q0;
        if (qVar != null) {
            qVar.a();
        }
        q qVar2 = this.f8656r0;
        if (qVar2 != null) {
            qVar2.a();
        }
    }

    private void a1(Configuration configuration) {
        Activity activity = (Activity) this.f8615C;
        if (activity instanceof InterfaceC1701o) {
            if (((InterfaceC1701o) activity).getLifecycle().getState().e(AbstractC1694h.b.CREATED)) {
                activity.onConfigurationChanged(configuration);
            }
        } else {
            if (!this.f8648j0 || this.f8649k0) {
                return;
            }
            activity.onConfigurationChanged(configuration);
        }
    }

    private boolean b1(int r9, u0.i r10, boolean r11) throws android.content.pm.PackageManager.NameNotFoundException {
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.b1(int, u0.i, boolean):boolean");
    }

    private Configuration d0(Context context, int i7, u0.i iVar, Configuration configuration, boolean z7) {
        int i8 = i7 != 1 ? i7 != 2 ? z7 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i8 | (configuration2.uiMode & (-49));
        if (iVar != null) {
            S0(configuration2, iVar);
        }
        return configuration2;
    }

    private void d1(int i7, u0.i iVar, boolean z7, Configuration configuration) {
        Resources resources = this.f8616D.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i7 | (resources.getConfiguration().uiMode & (-49));
        if (iVar != null) {
            S0(configuration2, iVar);
        }
        resources.updateConfiguration(configuration2, null);
        int i8 = this.f8652n0;
        if (i8 != 0) {
            this.f8616D.setTheme(i8);
            this.f8616D.getTheme().applyStyle(this.f8652n0, true);
        }
        if (z7 && (this.f8615C instanceof Activity)) {
            a1(configuration2);
        }
    }

    private ViewGroup e0() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ViewGroup viewGroup;
        TypedArray typedArrayObtainStyledAttributes = this.f8616D.obtainStyledAttributes(C2456j.f20720A0);
        int i7 = C2456j.f20740F0;
        if (!typedArrayObtainStyledAttributes.hasValue(i7)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(C2456j.f20768O0, false)) {
            H(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(i7, false)) {
            H(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(C2456j.f20743G0, false)) {
            H(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(C2456j.f20746H0, false)) {
            H(10);
        }
        this.f8641c0 = typedArrayObtainStyledAttributes.getBoolean(C2456j.f20724B0, false);
        typedArrayObtainStyledAttributes.recycle();
        l0();
        this.f8617E.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f8616D);
        if (this.f8642d0) {
            viewGroup = this.f8640b0 ? (ViewGroup) layoutInflaterFrom.inflate(C2453g.f20693q, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(C2453g.f20692p, (ViewGroup) null);
        } else if (this.f8641c0) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(C2453g.f20684h, (ViewGroup) null);
            this.f8639a0 = false;
            this.f8638Z = false;
        } else if (this.f8638Z) {
            TypedValue typedValue = new TypedValue();
            this.f8616D.getTheme().resolveAttribute(C2447a.f20545g, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new androidx.appcompat.view.d(this.f8616D, typedValue.resourceId) : this.f8616D).inflate(C2453g.f20694r, (ViewGroup) null);
            DecorContentParent decorContentParent = (DecorContentParent) viewGroup.findViewById(C2452f.f20667q);
            this.f8623K = decorContentParent;
            decorContentParent.setWindowCallback(v0());
            if (this.f8639a0) {
                this.f8623K.initFeature(109);
            }
            if (this.f8636X) {
                this.f8623K.initFeature(2);
            }
            if (this.f8637Y) {
                this.f8623K.initFeature(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f8638Z + ", windowActionBarOverlay: " + this.f8639a0 + ", android:windowIsFloating: " + this.f8641c0 + ", windowActionModeOverlay: " + this.f8640b0 + ", windowNoTitle: " + this.f8642d0 + " }");
        }
        Z.B0(viewGroup, new b());
        if (this.f8623K == null) {
            this.f8634V = (TextView) viewGroup.findViewById(C2452f.f20647R);
        }
        ViewUtils.makeOptionalFitsSystemWindows(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C2452f.f20652b);
        ViewGroup viewGroup2 = (ViewGroup) this.f8617E.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f8617E.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new c());
        return viewGroup;
    }

    private void f1(View view) {
        view.setBackgroundColor((Z.K(view) & 8192) != 0 ? androidx.core.content.a.c(this.f8616D, C2449c.f20567b) : androidx.core.content.a.c(this.f8616D, C2449c.f20566a));
    }

    private void k0() {
        if (this.f8632T) {
            return;
        }
        this.f8633U = e0();
        CharSequence charSequenceU0 = u0();
        if (!TextUtils.isEmpty(charSequenceU0)) {
            DecorContentParent decorContentParent = this.f8623K;
            if (decorContentParent != null) {
                decorContentParent.setWindowTitle(charSequenceU0);
            } else if (N0() != null) {
                N0().o(charSequenceU0);
            } else {
                TextView textView = this.f8634V;
                if (textView != null) {
                    textView.setText(charSequenceU0);
                }
            }
        }
        U();
        L0(this.f8633U);
        this.f8632T = true;
        u uVarT0 = t0(0, false);
        if (this.f8649k0) {
            return;
        }
        if (uVarT0 == null || uVarT0.f8698j == null) {
            A0(108);
        }
    }

    private void l0() {
        if (this.f8617E == null) {
            Object obj = this.f8615C;
            if (obj instanceof Activity) {
                V(((Activity) obj).getWindow());
            }
        }
        if (this.f8617E == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private static Configuration n0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f7 = configuration.fontScale;
            float f8 = configuration2.fontScale;
            if (f7 != f8) {
                configuration3.fontScale = f8;
            }
            int i7 = configuration.mcc;
            int i8 = configuration2.mcc;
            if (i7 != i8) {
                configuration3.mcc = i8;
            }
            int i9 = configuration.mnc;
            int i10 = configuration2.mnc;
            if (i9 != i10) {
                configuration3.mnc = i10;
            }
            l.a(configuration, configuration2, configuration3);
            int i11 = configuration.touchscreen;
            int i12 = configuration2.touchscreen;
            if (i11 != i12) {
                configuration3.touchscreen = i12;
            }
            int i13 = configuration.keyboard;
            int i14 = configuration2.keyboard;
            if (i13 != i14) {
                configuration3.keyboard = i14;
            }
            int i15 = configuration.keyboardHidden;
            int i16 = configuration2.keyboardHidden;
            if (i15 != i16) {
                configuration3.keyboardHidden = i16;
            }
            int i17 = configuration.navigation;
            int i18 = configuration2.navigation;
            if (i17 != i18) {
                configuration3.navigation = i18;
            }
            int i19 = configuration.navigationHidden;
            int i20 = configuration2.navigationHidden;
            if (i19 != i20) {
                configuration3.navigationHidden = i20;
            }
            int i21 = configuration.orientation;
            int i22 = configuration2.orientation;
            if (i21 != i22) {
                configuration3.orientation = i22;
            }
            int i23 = configuration.screenLayout & 15;
            int i24 = configuration2.screenLayout;
            if (i23 != (i24 & 15)) {
                configuration3.screenLayout |= i24 & 15;
            }
            int i25 = configuration.screenLayout & 192;
            int i26 = configuration2.screenLayout;
            if (i25 != (i26 & 192)) {
                configuration3.screenLayout |= i26 & 192;
            }
            int i27 = configuration.screenLayout & 48;
            int i28 = configuration2.screenLayout;
            if (i27 != (i28 & 48)) {
                configuration3.screenLayout |= i28 & 48;
            }
            int i29 = configuration.screenLayout & 768;
            int i30 = configuration2.screenLayout;
            if (i29 != (i30 & 768)) {
                configuration3.screenLayout |= i30 & 768;
            }
            m.a(configuration, configuration2, configuration3);
            int i31 = configuration.uiMode & 15;
            int i32 = configuration2.uiMode;
            if (i31 != (i32 & 15)) {
                configuration3.uiMode |= i32 & 15;
            }
            int i33 = configuration.uiMode & 48;
            int i34 = configuration2.uiMode;
            if (i33 != (i34 & 48)) {
                configuration3.uiMode |= i34 & 48;
            }
            int i35 = configuration.screenWidthDp;
            int i36 = configuration2.screenWidthDp;
            if (i35 != i36) {
                configuration3.screenWidthDp = i36;
            }
            int i37 = configuration.screenHeightDp;
            int i38 = configuration2.screenHeightDp;
            if (i37 != i38) {
                configuration3.screenHeightDp = i38;
            }
            int i39 = configuration.smallestScreenWidthDp;
            int i40 = configuration2.smallestScreenWidthDp;
            if (i39 != i40) {
                configuration3.smallestScreenWidthDp = i40;
            }
            j.b(configuration, configuration2, configuration3);
        }
        return configuration3;
    }

    private int p0(Context context) throws PackageManager.NameNotFoundException {
        if (!this.f8654p0 && (this.f8615C instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.f8615C.getClass()), Build.VERSION.SDK_INT >= 29 ? 269221888 : 786432);
                if (activityInfo != null) {
                    this.f8653o0 = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e7) {
                Log.d("AppCompatDelegate", PLHvHoayk.MnBfhKKHvTLmVzF, e7);
                this.f8653o0 = 0;
            }
        }
        this.f8654p0 = true;
        return this.f8653o0;
    }

    private q q0(Context context) {
        if (this.f8656r0 == null) {
            this.f8656r0 = new p(context);
        }
        return this.f8656r0;
    }

    private q r0(Context context) {
        if (this.f8655q0 == null) {
            this.f8655q0 = new r(y.a(context));
        }
        return this.f8655q0;
    }

    private void w0() {
        k0();
        if (this.f8638Z && this.f8620H == null) {
            Object obj = this.f8615C;
            if (obj instanceof Activity) {
                this.f8620H = new z((Activity) this.f8615C, this.f8639a0);
            } else if (obj instanceof Dialog) {
                this.f8620H = new z((Dialog) this.f8615C);
            }
            androidx.appcompat.app.a aVar = this.f8620H;
            if (aVar != null) {
                aVar.m(this.f8660v0);
            }
        }
    }

    private boolean x0(u uVar) {
        View view = uVar.f8697i;
        if (view != null) {
            uVar.f8696h = view;
            return true;
        }
        if (uVar.f8698j == null) {
            return false;
        }
        if (this.f8625M == null) {
            this.f8625M = new v();
        }
        View view2 = (View) uVar.a(this.f8625M);
        uVar.f8696h = view2;
        return view2 != null;
    }

    private boolean y0(u uVar) {
        uVar.d(o0());
        uVar.f8695g = new t(uVar.f8700l);
        uVar.f8691c = 81;
        return true;
    }

    private boolean z0(u uVar) {
        Resources.Theme themeNewTheme;
        Context context = this.f8616D;
        int i7 = uVar.f8689a;
        if ((i7 == 0 || i7 == 108) && this.f8623K != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(C2447a.f20545g, typedValue, true);
            if (typedValue.resourceId != 0) {
                themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(theme);
                themeNewTheme.applyStyle(typedValue.resourceId, true);
                themeNewTheme.resolveAttribute(C2447a.f20546h, typedValue, true);
            } else {
                theme.resolveAttribute(C2447a.f20546h, typedValue, true);
                themeNewTheme = null;
            }
            if (typedValue.resourceId != 0) {
                if (themeNewTheme == null) {
                    themeNewTheme = context.getResources().newTheme();
                    themeNewTheme.setTo(theme);
                }
                themeNewTheme.applyStyle(typedValue.resourceId, true);
            }
            if (themeNewTheme != null) {
                androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, 0);
                dVar.getTheme().setTo(themeNewTheme);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(context);
        gVar.R(this);
        uVar.c(gVar);
        return true;
    }

    @Override
    public void A(Bundle bundle) {
        k0();
    }

    @Override
    public void B() {
        androidx.appcompat.app.a aVarS = s();
        if (aVarS != null) {
            aVarS.n(true);
        }
    }

    public boolean B0() {
        return this.f8631S;
    }

    @Override
    public void C(Bundle bundle) {
    }

    int C0(Context context, int i7) {
        if (i7 == -100) {
            return -1;
        }
        if (i7 != -1) {
            if (i7 == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return r0(context).c();
            }
            if (i7 != 1 && i7 != 2) {
                if (i7 == 3) {
                    return q0(context).c();
                }
                throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
            }
        }
        return i7;
    }

    @Override
    public void D() throws PackageManager.NameNotFoundException {
        S(true, false);
    }

    boolean D0() {
        boolean z7 = this.f8646h0;
        this.f8646h0 = false;
        u uVarT0 = t0(0, false);
        if (uVarT0 != null && uVarT0.f8703o) {
            if (!z7) {
                c0(uVarT0, true);
            }
            return true;
        }
        androidx.appcompat.view.b bVar = this.f8626N;
        if (bVar != null) {
            bVar.c();
            return true;
        }
        androidx.appcompat.app.a aVarS = s();
        return aVarS != null && aVarS.b();
    }

    @Override
    public void E() {
        androidx.appcompat.app.a aVarS = s();
        if (aVarS != null) {
            aVarS.n(false);
        }
    }

    boolean E0(int i7, KeyEvent keyEvent) {
        if (i7 == 4) {
            this.f8646h0 = (keyEvent.getFlags() & 128) != 0;
        } else if (i7 == 82) {
            F0(0, keyEvent);
            return true;
        }
        return false;
    }

    boolean G0(int i7, KeyEvent keyEvent) {
        androidx.appcompat.app.a aVarS = s();
        if (aVarS != null && aVarS.j(i7, keyEvent)) {
            return true;
        }
        u uVar = this.f8645g0;
        if (uVar != null && O0(uVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            u uVar2 = this.f8645g0;
            if (uVar2 != null) {
                uVar2.f8702n = true;
            }
            return true;
        }
        if (this.f8645g0 == null) {
            u uVarT0 = t0(0, true);
            P0(uVarT0, keyEvent);
            boolean zO0 = O0(uVarT0, keyEvent.getKeyCode(), keyEvent, 1);
            uVarT0.f8701m = false;
            if (zO0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean H(int i7) {
        int iR0 = R0(i7);
        if (this.f8642d0 && iR0 == 108) {
            return false;
        }
        if (this.f8638Z && iR0 == 1) {
            this.f8638Z = false;
        }
        if (iR0 == 1) {
            Y0();
            this.f8642d0 = true;
            return true;
        }
        if (iR0 == 2) {
            Y0();
            this.f8636X = true;
            return true;
        }
        if (iR0 == 5) {
            Y0();
            this.f8637Y = true;
            return true;
        }
        if (iR0 == 10) {
            Y0();
            this.f8640b0 = true;
            return true;
        }
        if (iR0 == 108) {
            Y0();
            this.f8638Z = true;
            return true;
        }
        if (iR0 != 109) {
            return this.f8617E.requestFeature(iR0);
        }
        Y0();
        this.f8639a0 = true;
        return true;
    }

    boolean H0(int i7, KeyEvent keyEvent) {
        if (i7 != 4) {
            if (i7 == 82) {
                I0(0, keyEvent);
                return true;
            }
        } else if (D0()) {
            return true;
        }
        return false;
    }

    @Override
    public void I(int i7) {
        k0();
        ViewGroup viewGroup = (ViewGroup) this.f8633U.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f8616D).inflate(i7, viewGroup);
        this.f8618F.c(this.f8617E.getCallback());
    }

    @Override
    public void J(View view) {
        k0();
        ViewGroup viewGroup = (ViewGroup) this.f8633U.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f8618F.c(this.f8617E.getCallback());
    }

    void J0(int i7) {
        androidx.appcompat.app.a aVarS;
        if (i7 != 108 || (aVarS = s()) == null) {
            return;
        }
        aVarS.c(true);
    }

    @Override
    public void K(View view, ViewGroup.LayoutParams layoutParams) {
        k0();
        ViewGroup viewGroup = (ViewGroup) this.f8633U.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f8618F.c(this.f8617E.getCallback());
    }

    void K0(int i7) {
        if (i7 == 108) {
            androidx.appcompat.app.a aVarS = s();
            if (aVarS != null) {
                aVarS.c(false);
                return;
            }
            return;
        }
        if (i7 == 0) {
            u uVarT0 = t0(i7, true);
            if (uVarT0.f8703o) {
                c0(uVarT0, false);
            }
        }
    }

    @Override
    public void L(android.window.OnBackInvokedDispatcher r3) {
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.L(android.window.OnBackInvokedDispatcher):void");
    }

    void L0(ViewGroup viewGroup) {
    }

    @Override
    public void M(Toolbar toolbar) {
        if (this.f8615C instanceof Activity) {
            androidx.appcompat.app.a aVarS = s();
            if (aVarS instanceof z) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.f8621I = null;
            if (aVarS != null) {
                aVarS.i();
            }
            this.f8620H = null;
            if (toolbar != null) {
                w wVar = new w(toolbar, u0(), this.f8618F);
                this.f8620H = wVar;
                this.f8618F.e(wVar.f8734c);
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.f8618F.e(null);
            }
            u();
        }
    }

    @Override
    public void N(int i7) {
        this.f8652n0 = i7;
    }

    final androidx.appcompat.app.a N0() {
        return this.f8620H;
    }

    @Override
    public final void O(CharSequence charSequence) {
        this.f8622J = charSequence;
        DecorContentParent decorContentParent = this.f8623K;
        if (decorContentParent != null) {
            decorContentParent.setWindowTitle(charSequence);
            return;
        }
        if (N0() != null) {
            N0().o(charSequence);
            return;
        }
        TextView textView = this.f8634V;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override
    public androidx.appcompat.view.b P(b.a aVar) {
        androidx.appcompat.app.e eVar;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        androidx.appcompat.view.b bVar = this.f8626N;
        if (bVar != null) {
            bVar.c();
        }
        i iVar = new i(aVar);
        androidx.appcompat.app.a aVarS = s();
        if (aVarS != null) {
            androidx.appcompat.view.b bVarP = aVarS.p(iVar);
            this.f8626N = bVarP;
            if (bVarP != null && (eVar = this.f8619G) != null) {
                eVar.onSupportActionModeStarted(bVarP);
            }
        }
        if (this.f8626N == null) {
            this.f8626N = X0(iVar);
        }
        c1();
        return this.f8626N;
    }

    void S0(Configuration configuration, u0.i iVar) {
        l.d(configuration, iVar);
    }

    public boolean T() {
        return R(true);
    }

    void T0(u0.i iVar) {
        l.c(iVar);
    }

    final boolean U0() {
        ViewGroup viewGroup;
        return this.f8632T && (viewGroup = this.f8633U) != null && Z.R(viewGroup);
    }

    u0.i W(Context context) {
        u0.i iVarR;
        if (Build.VERSION.SDK_INT >= 33 || (iVarR = androidx.appcompat.app.g.r()) == null) {
            return null;
        }
        u0.i iVarS0 = s0(context.getApplicationContext().getResources().getConfiguration());
        u0.i iVarB = androidx.appcompat.app.v.b(iVarR, iVarS0);
        return iVarB.e() ? iVarS0 : iVarB;
    }

    boolean W0() {
        if (this.f8613A0 == null) {
            return false;
        }
        u uVarT0 = t0(0, false);
        return (uVarT0 != null && uVarT0.f8703o) || this.f8626N != null;
    }

    androidx.appcompat.view.b X0(b.a aVar) {
        androidx.appcompat.view.b bVarOnWindowStartingSupportActionMode;
        Context dVar;
        androidx.appcompat.app.e eVar;
        j0();
        androidx.appcompat.view.b bVar = this.f8626N;
        if (bVar != null) {
            bVar.c();
        }
        if (!(aVar instanceof i)) {
            aVar = new i(aVar);
        }
        androidx.appcompat.app.e eVar2 = this.f8619G;
        if (eVar2 == null || this.f8649k0) {
            bVarOnWindowStartingSupportActionMode = null;
        } else {
            try {
                bVarOnWindowStartingSupportActionMode = eVar2.onWindowStartingSupportActionMode(aVar);
            } catch (AbstractMethodError unused) {
            }
        }
        if (bVarOnWindowStartingSupportActionMode != null) {
            this.f8626N = bVarOnWindowStartingSupportActionMode;
        } else {
            if (this.f8627O == null) {
                if (this.f8641c0) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = this.f8616D.getTheme();
                    theme.resolveAttribute(C2447a.f20545g, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = this.f8616D.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        dVar = new androidx.appcompat.view.d(this.f8616D, 0);
                        dVar.getTheme().setTo(themeNewTheme);
                    } else {
                        dVar = this.f8616D;
                    }
                    this.f8627O = new ActionBarContextView(dVar);
                    PopupWindow popupWindow = new PopupWindow(dVar, (AttributeSet) null, C2447a.f20548j);
                    this.f8628P = popupWindow;
                    androidx.core.widget.i.b(popupWindow, 2);
                    this.f8628P.setContentView(this.f8627O);
                    this.f8628P.setWidth(-1);
                    dVar.getTheme().resolveAttribute(C2447a.f20540b, typedValue, true);
                    this.f8627O.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, dVar.getResources().getDisplayMetrics()));
                    this.f8628P.setHeight(-2);
                    this.f8629Q = new d();
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.f8633U.findViewById(C2452f.f20658h);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(o0()));
                        this.f8627O = (ActionBarContextView) viewStubCompat.inflate();
                    }
                }
            }
            if (this.f8627O != null) {
                j0();
                this.f8627O.killMode();
                androidx.appcompat.view.e eVar3 = new androidx.appcompat.view.e(this.f8627O.getContext(), this.f8627O, aVar, this.f8628P == null);
                if (aVar.b(eVar3, eVar3.e())) {
                    eVar3.k();
                    this.f8627O.initForMode(eVar3);
                    this.f8626N = eVar3;
                    if (U0()) {
                        this.f8627O.setAlpha(0.0f);
                        C1620h0 c1620h0B = Z.e(this.f8627O).b(1.0f);
                        this.f8630R = c1620h0B;
                        c1620h0B.h(new e());
                    } else {
                        this.f8627O.setAlpha(1.0f);
                        this.f8627O.setVisibility(0);
                        if (this.f8627O.getParent() instanceof View) {
                            Z.k0((View) this.f8627O.getParent());
                        }
                    }
                    if (this.f8628P != null) {
                        this.f8617E.getDecorView().post(this.f8629Q);
                    }
                } else {
                    this.f8626N = null;
                }
            }
        }
        androidx.appcompat.view.b bVar2 = this.f8626N;
        if (bVar2 != null && (eVar = this.f8619G) != null) {
            eVar.onSupportActionModeStarted(bVar2);
        }
        c1();
        return this.f8626N;
    }

    void Y(int i7, u uVar, Menu menu) {
        if (menu == null) {
            if (uVar == null && i7 >= 0) {
                u[] uVarArr = this.f8644f0;
                if (i7 < uVarArr.length) {
                    uVar = uVarArr[i7];
                }
            }
            if (uVar != null) {
                menu = uVar.f8698j;
            }
        }
        if ((uVar == null || uVar.f8703o) && !this.f8649k0) {
            this.f8618F.d(this.f8617E.getCallback(), i7, menu);
        }
    }

    void Z(androidx.appcompat.view.menu.g gVar) {
        if (this.f8643e0) {
            return;
        }
        this.f8643e0 = true;
        this.f8623K.dismissPopups();
        Window.Callback callbackV0 = v0();
        if (callbackV0 != null && !this.f8649k0) {
            callbackV0.onPanelClosed(108, gVar);
        }
        this.f8643e0 = false;
    }

    @Override
    public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
        u uVarM0;
        Window.Callback callbackV0 = v0();
        if (callbackV0 == null || this.f8649k0 || (uVarM0 = m0(gVar.D())) == null) {
            return false;
        }
        return callbackV0.onMenuItemSelected(uVarM0.f8689a, menuItem);
    }

    @Override
    public void b(androidx.appcompat.view.menu.g gVar) {
        Q0(true);
    }

    void b0(int i7) {
        c0(t0(i7, true), true);
    }

    void c0(u uVar, boolean z7) {
        ViewGroup viewGroup;
        DecorContentParent decorContentParent;
        if (z7 && uVar.f8689a == 0 && (decorContentParent = this.f8623K) != null && decorContentParent.isOverflowMenuShowing()) {
            Z(uVar.f8698j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f8616D.getSystemService(CAqKeu.rZSJMOGUXVb);
        if (windowManager != null && uVar.f8703o && (viewGroup = uVar.f8695g) != null) {
            windowManager.removeView(viewGroup);
            if (z7) {
                Y(uVar.f8689a, uVar, null);
            }
        }
        uVar.f8701m = false;
        uVar.f8702n = false;
        uVar.f8703o = false;
        uVar.f8696h = null;
        uVar.f8705q = true;
        if (this.f8645g0 == uVar) {
            this.f8645g0 = null;
        }
        if (uVar.f8689a == 0) {
            c1();
        }
    }

    void c1() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean zW0 = W0();
            if (zW0 && this.f8614B0 == null) {
                this.f8614B0 = n.b(this.f8613A0, this);
            } else {
                if (zW0 || (onBackInvokedCallback = this.f8614B0) == null) {
                    return;
                }
                n.c(this.f8613A0, onBackInvokedCallback);
            }
        }
    }

    @Override
    public void e(View view, ViewGroup.LayoutParams layoutParams) {
        k0();
        ((ViewGroup) this.f8633U.findViewById(R.id.content)).addView(view, layoutParams);
        this.f8618F.c(this.f8617E.getCallback());
    }

    final int e1(WindowInsetsCompat windowInsetsCompat, Rect rect) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z7;
        boolean z8;
        int systemWindowInsetTop = windowInsetsCompat != null ? windowInsetsCompat.getSystemWindowInsetTop() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.f8627O;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z7 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f8627O.getLayoutParams();
            if (this.f8627O.isShown()) {
                if (this.f8661w0 == null) {
                    this.f8661w0 = new Rect();
                    this.f8662x0 = new Rect();
                }
                Rect rect2 = this.f8661w0;
                Rect rect3 = this.f8662x0;
                if (windowInsetsCompat == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(windowInsetsCompat.getSystemWindowInsetLeft(), windowInsetsCompat.getSystemWindowInsetTop(), windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom());
                }
                ViewUtils.computeFitSystemWindows(this.f8633U, rect2, rect3);
                int i7 = rect2.top;
                int i8 = rect2.left;
                int i9 = rect2.right;
                WindowInsetsCompat windowInsetsCompatF = Z.F(this.f8633U);
                int systemWindowInsetLeft = windowInsetsCompatF == null ? 0 : windowInsetsCompatF.getSystemWindowInsetLeft();
                int systemWindowInsetRight = windowInsetsCompatF == null ? 0 : windowInsetsCompatF.getSystemWindowInsetRight();
                if (marginLayoutParams.topMargin == i7 && marginLayoutParams.leftMargin == i8 && marginLayoutParams.rightMargin == i9) {
                    z8 = false;
                } else {
                    marginLayoutParams.topMargin = i7;
                    marginLayoutParams.leftMargin = i8;
                    marginLayoutParams.rightMargin = i9;
                    z8 = true;
                }
                if (i7 <= 0 || this.f8635W != null) {
                    View view = this.f8635W;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i10 = marginLayoutParams2.height;
                        int i11 = marginLayoutParams.topMargin;
                        if (i10 != i11 || marginLayoutParams2.leftMargin != systemWindowInsetLeft || marginLayoutParams2.rightMargin != systemWindowInsetRight) {
                            marginLayoutParams2.height = i11;
                            marginLayoutParams2.leftMargin = systemWindowInsetLeft;
                            marginLayoutParams2.rightMargin = systemWindowInsetRight;
                            this.f8635W.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f8616D);
                    this.f8635W = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = systemWindowInsetLeft;
                    layoutParams.rightMargin = systemWindowInsetRight;
                    this.f8633U.addView(this.f8635W, -1, layoutParams);
                }
                View view3 = this.f8635W;
                z = view3 != null;
                if (z && view3.getVisibility() != 0) {
                    f1(this.f8635W);
                }
                if (!this.f8640b0 && z) {
                    systemWindowInsetTop = 0;
                }
                z7 = z;
                z = z8;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z7 = false;
            } else {
                z7 = false;
                z = false;
            }
            if (z) {
                this.f8627O.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.f8635W;
        if (view4 != null) {
            view4.setVisibility(z7 ? 0 : 8);
        }
        return systemWindowInsetTop;
    }

    public View f0(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z7;
        if (this.f8663y0 == null) {
            String string = this.f8616D.obtainStyledAttributes(C2456j.f20720A0).getString(C2456j.f20736E0);
            if (string == null) {
                this.f8663y0 = new androidx.appcompat.app.q();
            } else {
                try {
                    this.f8663y0 = (androidx.appcompat.app.q) this.f8616D.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f8663y0 = new androidx.appcompat.app.q();
                }
            }
        }
        boolean z8 = f8609D0;
        boolean zV0 = false;
        if (z8) {
            if (this.f8664z0 == null) {
                this.f8664z0 = new androidx.appcompat.app.u();
            }
            if (this.f8664z0.a(attributeSet)) {
                z7 = true;
            } else {
                if (!(attributeSet instanceof XmlPullParser)) {
                    zV0 = V0((ViewParent) view);
                } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                    zV0 = true;
                }
                z7 = zV0;
            }
        } else {
            z7 = zV0;
        }
        return this.f8663y0.r(view, str, context, attributeSet, z7, z8, true, VectorEnabledTintResources.shouldBeUsed());
    }

    @Override
    public Context g(Context context) {
        this.f8647i0 = true;
        int iC0 = C0(context, X());
        if (androidx.appcompat.app.g.v(context)) {
            androidx.appcompat.app.g.Q(context);
        }
        u0.i iVarW = W(context);
        if (f8612G0 && (context instanceof ContextThemeWrapper)) {
            try {
                s.a((ContextThemeWrapper) context, d0(context, iC0, iVarW, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof androidx.appcompat.view.d) {
            try {
                ((androidx.appcompat.view.d) context).a(d0(context, iC0, iVarW, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f8611F0) {
            return super.g(context);
        }
        Configuration configuration = new Configuration();
        configuration.uiMode = -1;
        configuration.fontScale = 0.0f;
        Configuration configuration2 = j.a(context, configuration).getResources().getConfiguration();
        Configuration configuration3 = context.getResources().getConfiguration();
        configuration2.uiMode = configuration3.uiMode;
        Configuration configurationD0 = d0(context, iC0, iVarW, !configuration2.equals(configuration3) ? n0(configuration2, configuration3) : null, true);
        androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, C2455i.f20717b);
        dVar.a(configurationD0);
        try {
            if (context.getTheme() != null) {
                h.g.a(dVar.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return super.g(dVar);
    }

    void g0() {
        androidx.appcompat.view.menu.g gVar;
        DecorContentParent decorContentParent = this.f8623K;
        if (decorContentParent != null) {
            decorContentParent.dismissPopups();
        }
        if (this.f8628P != null) {
            this.f8617E.getDecorView().removeCallbacks(this.f8629Q);
            if (this.f8628P.isShowing()) {
                try {
                    this.f8628P.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f8628P = null;
        }
        j0();
        u uVarT0 = t0(0, false);
        if (uVarT0 == null || (gVar = uVarT0.f8698j) == null) {
            return;
        }
        gVar.close();
    }

    boolean h0(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f8615C;
        if (((obj instanceof C1642t.a) || (obj instanceof androidx.appcompat.app.p)) && (decorView = this.f8617E.getDecorView()) != null && C1642t.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f8618F.b(this.f8617E.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? E0(keyCode, keyEvent) : H0(keyCode, keyEvent);
    }

    void i0(int i7) {
        u uVarT0;
        u uVarT02 = t0(i7, true);
        if (uVarT02.f8698j != null) {
            Bundle bundle = new Bundle();
            uVarT02.f8698j.Q(bundle);
            if (bundle.size() > 0) {
                uVarT02.f8707s = bundle;
            }
            uVarT02.f8698j.d0();
            uVarT02.f8698j.clear();
        }
        uVarT02.f8706r = true;
        uVarT02.f8705q = true;
        if ((i7 != 108 && i7 != 0) || this.f8623K == null || (uVarT0 = t0(0, false)) == null) {
            return;
        }
        uVarT0.f8701m = false;
        P0(uVarT0, null);
    }

    @Override
    public <T extends View> T j(int i7) {
        k0();
        return (T) this.f8617E.findViewById(i7);
    }

    void j0() {
        C1620h0 c1620h0 = this.f8630R;
        if (c1620h0 != null) {
            c1620h0.c();
        }
    }

    @Override
    public Context l() {
        return this.f8616D;
    }

    u m0(Menu menu) {
        u[] uVarArr = this.f8644f0;
        int length = uVarArr != null ? uVarArr.length : 0;
        for (int i7 = 0; i7 < length; i7++) {
            u uVar = uVarArr[i7];
            if (uVar != null && uVar.f8698j == menu) {
                return uVar;
            }
        }
        return null;
    }

    @Override
    public final androidx.appcompat.app.b n() {
        return new f();
    }

    @Override
    public int o() {
        return this.f8651m0;
    }

    final Context o0() {
        androidx.appcompat.app.a aVarS = s();
        Context contextE = aVarS != null ? aVarS.e() : null;
        return contextE == null ? this.f8616D : contextE;
    }

    @Override
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return f0(view, str, context, attributeSet);
    }

    @Override
    public MenuInflater q() {
        if (this.f8621I == null) {
            w0();
            androidx.appcompat.app.a aVar = this.f8620H;
            this.f8621I = new androidx.appcompat.view.g(aVar != null ? aVar.e() : this.f8616D);
        }
        return this.f8621I;
    }

    @Override
    public androidx.appcompat.app.a s() {
        w0();
        return this.f8620H;
    }

    u0.i s0(Configuration configuration) {
        return l.b(configuration);
    }

    @Override
    public void t() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f8616D);
        if (layoutInflaterFrom.getFactory() == null) {
            C1644u.a(layoutInflaterFrom, this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof h) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    protected u t0(int i7, boolean z7) {
        u[] uVarArr = this.f8644f0;
        if (uVarArr == null || uVarArr.length <= i7) {
            u[] uVarArr2 = new u[i7 + 1];
            if (uVarArr != null) {
                System.arraycopy(uVarArr, 0, uVarArr2, 0, uVarArr.length);
            }
            this.f8644f0 = uVarArr2;
            uVarArr = uVarArr2;
        }
        u uVar = uVarArr[i7];
        if (uVar != null) {
            return uVar;
        }
        u uVar2 = new u(i7);
        uVarArr[i7] = uVar2;
        return uVar2;
    }

    @Override
    public void u() {
        if (N0() == null || s().g()) {
            return;
        }
        A0(0);
    }

    final CharSequence u0() {
        Object obj = this.f8615C;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f8622J;
    }

    final Window.Callback v0() {
        return this.f8617E.getCallback();
    }

    @Override
    public void x(Configuration configuration) throws PackageManager.NameNotFoundException {
        androidx.appcompat.app.a aVarS;
        if (this.f8638Z && this.f8632T && (aVarS = s()) != null) {
            aVarS.h(configuration);
        }
        AppCompatDrawableManager.get().onConfigurationChanged(this.f8616D);
        this.f8650l0 = new Configuration(this.f8616D.getResources().getConfiguration());
        S(false, false);
    }

    @Override
    public void y(Bundle bundle) {
        String strC;
        this.f8647i0 = true;
        R(false);
        l0();
        Object obj = this.f8615C;
        if (obj instanceof Activity) {
            try {
                strC = androidx.core.app.j.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
                strC = null;
            }
            if (strC != null) {
                androidx.appcompat.app.a aVarN0 = N0();
                if (aVarN0 == null) {
                    this.f8660v0 = true;
                } else {
                    aVarN0.m(true);
                }
            }
            androidx.appcompat.app.g.d(this);
        }
        this.f8650l0 = new Configuration(this.f8616D.getResources().getConfiguration());
        this.f8648j0 = true;
    }

    @Override
    public void z() {
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.z():void");
    }

    h(Dialog dialog, androidx.appcompat.app.e eVar) {
        this(dialog.getContext(), dialog.getWindow(), eVar, dialog);
    }

    @Override
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    private h(Context context, Window window, androidx.appcompat.app.e eVar, Object obj) {
        g0.k<String, Integer> kVar;
        Integer num;
        androidx.appcompat.app.d dVarZ0;
        this.f8630R = null;
        this.f8631S = true;
        this.f8651m0 = -100;
        this.f8659u0 = new a();
        this.f8616D = context;
        this.f8619G = eVar;
        this.f8615C = obj;
        if (this.f8651m0 == -100 && (obj instanceof Dialog) && (dVarZ0 = Z0()) != null) {
            this.f8651m0 = dVarZ0.getDelegate().o();
        }
        if (this.f8651m0 == -100 && (num = (kVar = f8608C0).get(obj.getClass().getName())) != null) {
            this.f8651m0 = num.intValue();
            kVar.remove(obj.getClass().getName());
        }
        if (window != null) {
            V(window);
        }
        AppCompatDrawableManager.preload();
    }
}
