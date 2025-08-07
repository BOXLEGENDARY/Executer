package y0;

import K0.wJ.BtcVLuo;
import U.Gw.oeVkjmfPcLbWm;
import Za.qhkq.dHkZSUxHu;
import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.checkbox.czZ.GObvYfBKohxpYX;
import g1.kQwt.YGBtcyQ;
import java.util.ArrayList;
import java.util.List;
import t2.Dbl.hgESaf;
import y0.InterfaceC3022w;

public class C3019t {

    private final AccessibilityNodeInfo f24360a;

    public int f24361b = -1;

    private int f24362c = -1;

    public static class a {

        public static final a f24363A;

        public static final a f24364B;

        public static final a f24365C;

        public static final a f24366D;

        public static final a f24367E;

        public static final a f24368F;

        public static final a f24369G;

        public static final a f24370H;

        public static final a f24371I;

        public static final a f24372J;

        public static final a f24373K;

        public static final a f24374L;

        public static final a f24375M;

        public static final a f24376N;

        public static final a f24377O;

        public static final a f24378P;

        public static final a f24379Q;

        public static final a f24380R;

        public static final a f24381S;

        public static final a f24382T;

        public static final a f24383U;

        public static final a f24384V;

        public static final a f24385e = new a(1, null);

        public static final a f24386f = new a(2, null);

        public static final a f24387g = new a(4, null);

        public static final a f24388h = new a(8, null);

        public static final a f24389i = new a(16, null);

        public static final a f24390j = new a(32, null);

        public static final a f24391k = new a(64, null);

        public static final a f24392l = new a(128, null);

        public static final a f24393m = new a(256, (CharSequence) null, (Class<? extends InterfaceC3022w.a>) InterfaceC3022w.b.class);

        public static final a f24394n = new a(512, (CharSequence) null, (Class<? extends InterfaceC3022w.a>) InterfaceC3022w.b.class);

        public static final a f24395o = new a(1024, (CharSequence) null, (Class<? extends InterfaceC3022w.a>) InterfaceC3022w.c.class);

        public static final a f24396p = new a(2048, (CharSequence) null, (Class<? extends InterfaceC3022w.a>) InterfaceC3022w.c.class);

        public static final a f24397q = new a(4096, null);

        public static final a f24398r = new a(8192, null);

        public static final a f24399s = new a(16384, null);

        public static final a f24400t = new a(32768, null);

        public static final a f24401u = new a(65536, null);

        public static final a f24402v = new a(131072, (CharSequence) null, (Class<? extends InterfaceC3022w.a>) InterfaceC3022w.g.class);

        public static final a f24403w = new a(262144, null);

        public static final a f24404x = new a(524288, null);

        public static final a f24405y = new a(1048576, null);

        public static final a f24406z = new a(2097152, (CharSequence) null, (Class<? extends InterfaceC3022w.a>) InterfaceC3022w.h.class);

        final Object f24407a;

        private final int f24408b;

        private final Class<? extends InterfaceC3022w.a> f24409c;

        protected final InterfaceC3022w f24410d;

        static {
            int i7 = Build.VERSION.SDK_INT;
            f24363A = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
            f24364B = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, InterfaceC3022w.e.class);
            f24365C = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
            f24366D = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
            f24367E = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
            f24368F = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
            f24369G = new a(i7 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            f24370H = new a(i7 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
            f24371I = new a(i7 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            f24372J = new a(i7 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
            f24373K = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            f24374L = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, InterfaceC3022w.f.class);
            f24375M = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, InterfaceC3022w.d.class);
            f24376N = new a(i7 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            f24377O = new a(i7 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
            f24378P = new a(i7 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            f24379Q = new a(i7 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
            f24380R = new a(i7 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
            f24381S = new a(i7 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
            f24382T = new a(i7 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
            f24383U = new a(i7 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
            f24384V = new a(i7 >= 34 ? d.a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
        }

        public a(int i7, CharSequence charSequence) {
            this(null, i7, charSequence, null, null);
        }

        public a a(CharSequence charSequence, InterfaceC3022w interfaceC3022w) {
            return new a(null, this.f24408b, charSequence, interfaceC3022w, this.f24409c);
        }

        public int b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f24407a).getId();
        }

        public CharSequence c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f24407a).getLabel();
        }

        public boolean d(View view, Bundle bundle) {
            InterfaceC3022w.a aVarNewInstance;
            if (this.f24410d == null) {
                return false;
            }
            Class<? extends InterfaceC3022w.a> cls = this.f24409c;
            InterfaceC3022w.a aVar = null;
            if (cls != null) {
                try {
                    aVarNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
                } catch (Exception e7) {
                    e = e7;
                }
                try {
                    aVarNewInstance.a(bundle);
                    aVar = aVarNewInstance;
                } catch (Exception e8) {
                    e = e8;
                    aVar = aVarNewInstance;
                    Class<? extends InterfaceC3022w.a> cls2 = this.f24409c;
                    Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? "null" : cls2.getName()), e);
                    return this.f24410d.a(view, aVar);
                }
            }
            return this.f24410d.a(view, aVar);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.f24407a;
            return obj2 == null ? aVar.f24407a == null : obj2.equals(aVar.f24407a);
        }

        public int hashCode() {
            Object obj = this.f24407a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AccessibilityActionCompat: ");
            String strG = C3019t.g(this.f24408b);
            if (strG.equals("ACTION_UNKNOWN") && c() != null) {
                strG = c().toString();
            }
            sb.append(strG);
            return sb.toString();
        }

        public a(int i7, CharSequence charSequence, InterfaceC3022w interfaceC3022w) {
            this(null, i7, charSequence, interfaceC3022w, null);
        }

        a(Object obj) {
            this(obj, 0, null, null, null);
        }

        private a(int i7, CharSequence charSequence, Class<? extends InterfaceC3022w.a> cls) {
            this(null, i7, charSequence, null, cls);
        }

        a(Object obj, int i7, CharSequence charSequence, InterfaceC3022w interfaceC3022w, Class<? extends InterfaceC3022w.a> cls) {
            this.f24408b = i7;
            this.f24410d = interfaceC3022w;
            if (obj == null) {
                this.f24407a = new AccessibilityNodeInfo.AccessibilityAction(i7, charSequence);
            } else {
                this.f24407a = obj;
            }
            this.f24409c = cls;
        }
    }

    private static class b {
        public static CharSequence a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }
    }

    private static class c {
        public static String a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        public static boolean b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }
    }

    private static class d {
        public static AccessibilityNodeInfo.AccessibilityAction a() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        public static CharSequence c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        public static boolean d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }
    }

    public static class e {

        final Object f24411a;

        e(Object obj) {
            this.f24411a = obj;
        }

        public static e a(int i7, int i8, boolean z7, int i9) {
            return new e(AccessibilityNodeInfo.CollectionInfo.obtain(i7, i8, z7, i9));
        }
    }

    public static class f {

        final Object f24412a;

        f(Object obj) {
            this.f24412a = obj;
        }

        public static f a(int i7, int i8, int i9, int i10, boolean z7, boolean z8) {
            return new f(AccessibilityNodeInfo.CollectionItemInfo.obtain(i7, i8, i9, i10, z7, z8));
        }
    }

    private C3019t(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f24360a = accessibilityNodeInfo;
    }

    private boolean A() {
        return !e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    public static C3019t F0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C3019t(accessibilityNodeInfo);
    }

    public static C3019t S() {
        return F0(AccessibilityNodeInfo.obtain());
    }

    public static C3019t T(View view) {
        return F0(AccessibilityNodeInfo.obtain(view));
    }

    public static C3019t U(C3019t c3019t) {
        return F0(AccessibilityNodeInfo.obtain(c3019t.f24360a));
    }

    private void Y(int i7, boolean z7) {
        Bundle bundleS = s();
        if (bundleS != null) {
            int i8 = bundleS.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i7);
            if (!z7) {
                i7 = 0;
            }
            bundleS.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i7 | i8);
        }
    }

    private List<Integer> e(String str) {
        ArrayList<Integer> integerArrayList = this.f24360a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f24360a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    static String g(int i7) {
        if (i7 == 1) {
            return "ACTION_FOCUS";
        }
        if (i7 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i7) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return GObvYfBKohxpYX.wvcNtUegEs;
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return dHkZSUxHu.elqwgI;
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionScrollInDirection:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i7) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i7) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i7) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    private boolean i(int i7) {
        Bundle bundleS = s();
        return bundleS != null && (bundleS.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i7) == i7;
    }

    public static ClickableSpan[] o(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public void A0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.b(this.f24360a, charSequence);
        } else {
            this.f24360a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public boolean B() {
        return Build.VERSION.SDK_INT >= 34 ? d.d(this.f24360a) : i(64);
    }

    public void B0(CharSequence charSequence) {
        this.f24360a.setText(charSequence);
    }

    public boolean C() {
        return this.f24360a.isCheckable();
    }

    public void C0(View view) {
        this.f24360a.setTraversalAfter(view);
    }

    public boolean D() {
        return this.f24360a.isChecked();
    }

    public void D0(boolean z7) {
        this.f24360a.setVisibleToUser(z7);
    }

    public boolean E() {
        return this.f24360a.isClickable();
    }

    public AccessibilityNodeInfo E0() {
        return this.f24360a;
    }

    public boolean F() {
        return this.f24360a.isContextClickable();
    }

    public boolean G() {
        return this.f24360a.isEnabled();
    }

    public boolean H() {
        return this.f24360a.isFocusable();
    }

    public boolean I() {
        return this.f24360a.isFocused();
    }

    public boolean J() {
        return i(67108864);
    }

    public boolean K() {
        return this.f24360a.isImportantForAccessibility();
    }

    public boolean L() {
        return this.f24360a.isLongClickable();
    }

    public boolean M() {
        return this.f24360a.isPassword();
    }

    public boolean N() {
        return this.f24360a.isScrollable();
    }

    public boolean O() {
        return this.f24360a.isSelected();
    }

    public boolean P() {
        return this.f24360a.isShowingHintText();
    }

    public boolean Q() {
        return Build.VERSION.SDK_INT >= 33 ? c.b(this.f24360a) : i(8388608);
    }

    public boolean R() {
        return this.f24360a.isVisibleToUser();
    }

    public boolean V(int i7, Bundle bundle) {
        return this.f24360a.performAction(i7, bundle);
    }

    @Deprecated
    public void W() {
    }

    public void X(boolean z7) {
        this.f24360a.setAccessibilityFocused(z7);
    }

    @Deprecated
    public void Z(Rect rect) {
        this.f24360a.setBoundsInParent(rect);
    }

    public void a(int i7) {
        this.f24360a.addAction(i7);
    }

    public void a0(Rect rect) {
        this.f24360a.setBoundsInScreen(rect);
    }

    public void b(a aVar) {
        this.f24360a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f24407a);
    }

    public void b0(boolean z7) {
        this.f24360a.setCanOpenPopup(z7);
    }

    public void c(View view, int i7) {
        this.f24360a.addChild(view, i7);
    }

    public void c0(boolean z7) {
        this.f24360a.setCheckable(z7);
    }

    public void d(CharSequence charSequence, View view) {
    }

    public void d0(boolean z7) {
        this.f24360a.setChecked(z7);
    }

    public void e0(CharSequence charSequence) {
        this.f24360a.setClassName(charSequence);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C3019t)) {
            return false;
        }
        C3019t c3019t = (C3019t) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f24360a;
        if (accessibilityNodeInfo == null) {
            if (c3019t.f24360a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(c3019t.f24360a)) {
            return false;
        }
        return this.f24362c == c3019t.f24362c && this.f24361b == c3019t.f24361b;
    }

    public List<a> f() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f24360a.getActionList();
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i7 = 0; i7 < size; i7++) {
            arrayList.add(new a(actionList.get(i7)));
        }
        return arrayList;
    }

    public void f0(boolean z7) {
        this.f24360a.setClickable(z7);
    }

    public void g0(Object obj) {
        this.f24360a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((e) obj).f24411a);
    }

    @Deprecated
    public int h() {
        return this.f24360a.getActions();
    }

    public void h0(Object obj) {
        this.f24360a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((f) obj).f24412a);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f24360a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public void i0(CharSequence charSequence) {
        this.f24360a.setContentDescription(charSequence);
    }

    @Deprecated
    public void j(Rect rect) {
        this.f24360a.getBoundsInParent(rect);
    }

    public void j0(boolean z7) {
        this.f24360a.setDismissable(z7);
    }

    public void k(Rect rect) {
        this.f24360a.getBoundsInScreen(rect);
    }

    public void k0(boolean z7) {
        this.f24360a.setEnabled(z7);
    }

    public void l(Rect rect) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.b(this.f24360a, rect);
            return;
        }
        Rect rect2 = (Rect) this.f24360a.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
        if (rect2 != null) {
            rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    public void l0(CharSequence charSequence) {
        this.f24360a.setError(charSequence);
    }

    public int m() {
        return this.f24360a.getChildCount();
    }

    public void m0(boolean z7) {
        this.f24360a.setFocusable(z7);
    }

    public CharSequence n() {
        return this.f24360a.getClassName();
    }

    public void n0(boolean z7) {
        this.f24360a.setFocused(z7);
    }

    public void o0(boolean z7) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f24360a.setHeading(z7);
        } else {
            Y(2, z7);
        }
    }

    public CharSequence p() {
        return Build.VERSION.SDK_INT >= 34 ? d.c(this.f24360a) : this.f24360a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
    }

    public void p0(CharSequence charSequence) {
        this.f24360a.setHintText(charSequence);
    }

    public CharSequence q() {
        return this.f24360a.getContentDescription();
    }

    public void q0(View view) {
        this.f24360a.setLabelFor(view);
    }

    public CharSequence r() {
        return this.f24360a.getError();
    }

    public void r0(int i7) {
        this.f24360a.setMaxTextLength(i7);
    }

    public Bundle s() {
        return this.f24360a.getExtras();
    }

    public void s0(CharSequence charSequence) {
        this.f24360a.setPackageName(charSequence);
    }

    public int t() {
        return this.f24360a.getMaxTextLength();
    }

    public void t0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f24360a.setPaneTitle(charSequence);
        } else {
            this.f24360a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        j(rect);
        sb.append("; boundsInParent: " + rect);
        k(rect);
        sb.append("; boundsInScreen: " + rect);
        l(rect);
        sb.append("; boundsInWindow: " + rect);
        sb.append("; packageName: ");
        sb.append(u());
        sb.append("; className: ");
        sb.append(n());
        sb.append(oeVkjmfPcLbWm.iPPstWZ);
        sb.append(w());
        sb.append(GObvYfBKohxpYX.RcRlXKIjiA);
        sb.append(r());
        sb.append("; maxTextLength: ");
        sb.append(t());
        sb.append("; stateDescription: ");
        sb.append(v());
        sb.append(hgESaf.lhQoAtzNN);
        sb.append(q());
        sb.append("; tooltipText: ");
        sb.append(x());
        sb.append("; viewIdResName: ");
        sb.append(z());
        sb.append(YGBtcyQ.BqRWyLttcvBOscc);
        sb.append(y());
        sb.append("; checkable: ");
        sb.append(C());
        sb.append("; checked: ");
        sb.append(D());
        sb.append("; focusable: ");
        sb.append(H());
        sb.append("; focused: ");
        sb.append(I());
        sb.append("; selected: ");
        sb.append(O());
        sb.append(BtcVLuo.KXj);
        sb.append(E());
        sb.append("; longClickable: ");
        sb.append(L());
        sb.append("; contextClickable: ");
        sb.append(F());
        sb.append("; enabled: ");
        sb.append(G());
        sb.append("; password: ");
        sb.append(M());
        sb.append("; scrollable: " + N());
        sb.append("; containerTitle: ");
        sb.append(p());
        sb.append("; granularScrollingSupported: ");
        sb.append(J());
        sb.append("; importantForAccessibility: ");
        sb.append(K());
        sb.append("; visible: ");
        sb.append(R());
        sb.append("; isTextSelectable: ");
        sb.append(Q());
        sb.append("; accessibilityDataSensitive: ");
        sb.append(B());
        sb.append("; [");
        List<a> listF = f();
        for (int i7 = 0; i7 < listF.size(); i7++) {
            a aVar = listF.get(i7);
            String strG = g(aVar.b());
            if (strG.equals("ACTION_UNKNOWN") && aVar.c() != null) {
                strG = aVar.c().toString();
            }
            sb.append(strG);
            if (i7 != listF.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public CharSequence u() {
        return this.f24360a.getPackageName();
    }

    public void u0(View view) {
        this.f24361b = -1;
        this.f24360a.setParent(view);
    }

    public CharSequence v() {
        return Build.VERSION.SDK_INT >= 30 ? b.a(this.f24360a) : this.f24360a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    public void v0(View view, int i7) {
        this.f24361b = i7;
        this.f24360a.setParent(view, i7);
    }

    public CharSequence w() {
        if (!A()) {
            return this.f24360a.getText();
        }
        List<Integer> listE = e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> listE2 = e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> listE3 = e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> listE4 = e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f24360a.getText(), 0, this.f24360a.getText().length()));
        for (int i7 = 0; i7 < listE.size(); i7++) {
            spannableString.setSpan(new C3000a(listE4.get(i7).intValue(), this, s().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), listE.get(i7).intValue(), listE2.get(i7).intValue(), listE3.get(i7).intValue());
        }
        return spannableString;
    }

    public void w0(boolean z7) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f24360a.setScreenReaderFocusable(z7);
        } else {
            Y(1, z7);
        }
    }

    public CharSequence x() {
        return Build.VERSION.SDK_INT >= 28 ? this.f24360a.getTooltipText() : this.f24360a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
    }

    public void x0(boolean z7) {
        this.f24360a.setScrollable(z7);
    }

    public String y() {
        return Build.VERSION.SDK_INT >= 33 ? c.a(this.f24360a) : this.f24360a.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    public void y0(boolean z7) {
        this.f24360a.setShowingHintText(z7);
    }

    public String z() {
        return this.f24360a.getViewIdResourceName();
    }

    public void z0(View view, int i7) {
        this.f24362c = i7;
        this.f24360a.setSource(view, i7);
    }
}
