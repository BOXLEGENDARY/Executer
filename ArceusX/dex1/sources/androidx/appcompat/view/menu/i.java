package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.n;
import androidx.core.view.AbstractC1607b;
import com.github.luben.zstd.BuildConfig;
import g.C2454h;
import h.C2473a;
import q0.C2731a;
import r0.InterfaceMenuItemC2741b;

public final class i implements InterfaceMenuItemC2741b {

    private View f9020A;

    private AbstractC1607b f9021B;

    private MenuItem.OnActionExpandListener f9022C;

    private ContextMenu.ContextMenuInfo f9024E;

    private final int f9025a;

    private final int f9026b;

    private final int f9027c;

    private final int f9028d;

    private CharSequence f9029e;

    private CharSequence f9030f;

    private Intent f9031g;

    private char f9032h;

    private char f9034j;

    private Drawable f9036l;

    g f9038n;

    private r f9039o;

    private Runnable f9040p;

    private MenuItem.OnMenuItemClickListener f9041q;

    private CharSequence f9042r;

    private CharSequence f9043s;

    private int f9050z;

    private int f9033i = 4096;

    private int f9035k = 4096;

    private int f9037m = 0;

    private ColorStateList f9044t = null;

    private PorterDuff.Mode f9045u = null;

    private boolean f9046v = false;

    private boolean f9047w = false;

    private boolean f9048x = false;

    private int f9049y = 16;

    private boolean f9023D = false;

    class a implements AbstractC1607b.InterfaceC0087b {
        a() {
        }

        @Override
        public void onActionProviderVisibilityChanged(boolean z7) {
            i iVar = i.this;
            iVar.f9038n.J(iVar);
        }
    }

    i(g gVar, int i7, int i8, int i9, int i10, CharSequence charSequence, int i11) {
        this.f9038n = gVar;
        this.f9025a = i8;
        this.f9026b = i7;
        this.f9027c = i9;
        this.f9028d = i10;
        this.f9029e = charSequence;
        this.f9050z = i11;
    }

    private static void d(StringBuilder sb, int i7, int i8, String str) {
        if ((i7 & i8) == i8) {
            sb.append(str);
        }
    }

    private Drawable e(Drawable drawable) {
        if (drawable != null && this.f9048x && (this.f9046v || this.f9047w)) {
            drawable = C2731a.r(drawable).mutate();
            if (this.f9046v) {
                C2731a.o(drawable, this.f9044t);
            }
            if (this.f9047w) {
                C2731a.p(drawable, this.f9045u);
            }
            this.f9048x = false;
        }
        return drawable;
    }

    boolean A() {
        return this.f9038n.H() && g() != 0;
    }

    public boolean B() {
        return (this.f9050z & 4) == 4;
    }

    @Override
    public InterfaceMenuItemC2741b a(AbstractC1607b abstractC1607b) {
        AbstractC1607b abstractC1607b2 = this.f9021B;
        if (abstractC1607b2 != null) {
            abstractC1607b2.reset();
        }
        this.f9020A = null;
        this.f9021B = abstractC1607b;
        this.f9038n.K(true);
        AbstractC1607b abstractC1607b3 = this.f9021B;
        if (abstractC1607b3 != null) {
            abstractC1607b3.setVisibilityListener(new a());
        }
        return this;
    }

    @Override
    public AbstractC1607b b() {
        return this.f9021B;
    }

    public void c() {
        this.f9038n.I(this);
    }

    @Override
    public boolean collapseActionView() {
        if ((this.f9050z & 8) == 0) {
            return false;
        }
        if (this.f9020A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f9022C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f9038n.f(this);
        }
        return false;
    }

    @Override
    public boolean expandActionView() {
        if (!j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f9022C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f9038n.k(this);
        }
        return false;
    }

    public int f() {
        return this.f9028d;
    }

    char g() {
        return this.f9038n.G() ? this.f9034j : this.f9032h;
    }

    @Override
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override
    public View getActionView() {
        View view = this.f9020A;
        if (view != null) {
            return view;
        }
        AbstractC1607b abstractC1607b = this.f9021B;
        if (abstractC1607b == null) {
            return null;
        }
        View viewOnCreateActionView = abstractC1607b.onCreateActionView(this);
        this.f9020A = viewOnCreateActionView;
        return viewOnCreateActionView;
    }

    @Override
    public int getAlphabeticModifiers() {
        return this.f9035k;
    }

    @Override
    public char getAlphabeticShortcut() {
        return this.f9034j;
    }

    @Override
    public CharSequence getContentDescription() {
        return this.f9042r;
    }

    @Override
    public int getGroupId() {
        return this.f9026b;
    }

    @Override
    public Drawable getIcon() {
        Drawable drawable = this.f9036l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.f9037m == 0) {
            return null;
        }
        Drawable drawableB = C2473a.b(this.f9038n.u(), this.f9037m);
        this.f9037m = 0;
        this.f9036l = drawableB;
        return e(drawableB);
    }

    @Override
    public ColorStateList getIconTintList() {
        return this.f9044t;
    }

    @Override
    public PorterDuff.Mode getIconTintMode() {
        return this.f9045u;
    }

    @Override
    public Intent getIntent() {
        return this.f9031g;
    }

    @Override
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f9025a;
    }

    @Override
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f9024E;
    }

    @Override
    public int getNumericModifiers() {
        return this.f9033i;
    }

    @Override
    public char getNumericShortcut() {
        return this.f9032h;
    }

    @Override
    public int getOrder() {
        return this.f9027c;
    }

    @Override
    public SubMenu getSubMenu() {
        return this.f9039o;
    }

    @Override
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f9029e;
    }

    @Override
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f9030f;
        return charSequence != null ? charSequence : this.f9029e;
    }

    @Override
    public CharSequence getTooltipText() {
        return this.f9043s;
    }

    String h() {
        char cG = g();
        if (cG == 0) {
            return BuildConfig.FLAVOR;
        }
        Resources resources = this.f9038n.u().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f9038n.u()).hasPermanentMenuKey()) {
            sb.append(resources.getString(C2454h.f20712o));
        }
        int i7 = this.f9038n.G() ? this.f9035k : this.f9033i;
        d(sb, i7, 65536, resources.getString(C2454h.f20708k));
        d(sb, i7, 4096, resources.getString(C2454h.f20704g));
        d(sb, i7, 2, resources.getString(C2454h.f20703f));
        d(sb, i7, 1, resources.getString(C2454h.f20709l));
        d(sb, i7, 4, resources.getString(C2454h.f20711n));
        d(sb, i7, 8, resources.getString(C2454h.f20707j));
        if (cG == '\b') {
            sb.append(resources.getString(C2454h.f20705h));
        } else if (cG == '\n') {
            sb.append(resources.getString(C2454h.f20706i));
        } else if (cG != ' ') {
            sb.append(cG);
        } else {
            sb.append(resources.getString(C2454h.f20710m));
        }
        return sb.toString();
    }

    @Override
    public boolean hasSubMenu() {
        return this.f9039o != null;
    }

    CharSequence i(n.a aVar) {
        return (aVar == null || !aVar.a()) ? getTitle() : getTitleCondensed();
    }

    @Override
    public boolean isActionViewExpanded() {
        return this.f9023D;
    }

    @Override
    public boolean isCheckable() {
        return (this.f9049y & 1) == 1;
    }

    @Override
    public boolean isChecked() {
        return (this.f9049y & 2) == 2;
    }

    @Override
    public boolean isEnabled() {
        return (this.f9049y & 16) != 0;
    }

    @Override
    public boolean isVisible() {
        AbstractC1607b abstractC1607b = this.f9021B;
        return (abstractC1607b == null || !abstractC1607b.overridesItemVisibility()) ? (this.f9049y & 8) == 0 : (this.f9049y & 8) == 0 && this.f9021B.isVisible();
    }

    public boolean j() {
        AbstractC1607b abstractC1607b;
        if ((this.f9050z & 8) == 0) {
            return false;
        }
        if (this.f9020A == null && (abstractC1607b = this.f9021B) != null) {
            this.f9020A = abstractC1607b.onCreateActionView(this);
        }
        return this.f9020A != null;
    }

    public boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f9041q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        g gVar = this.f9038n;
        if (gVar.h(gVar, this)) {
            return true;
        }
        Runnable runnable = this.f9040p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f9031g != null) {
            try {
                this.f9038n.u().startActivity(this.f9031g);
                return true;
            } catch (ActivityNotFoundException e7) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e7);
            }
        }
        AbstractC1607b abstractC1607b = this.f9021B;
        return abstractC1607b != null && abstractC1607b.onPerformDefaultAction();
    }

    public boolean l() {
        return (this.f9049y & 32) == 32;
    }

    public boolean m() {
        return (this.f9049y & 4) != 0;
    }

    public boolean n() {
        return (this.f9050z & 1) == 1;
    }

    public boolean o() {
        return (this.f9050z & 2) == 2;
    }

    @Override
    public InterfaceMenuItemC2741b setActionView(int i7) {
        Context contextU = this.f9038n.u();
        setActionView(LayoutInflater.from(contextU).inflate(i7, (ViewGroup) new LinearLayout(contextU), false));
        return this;
    }

    @Override
    public InterfaceMenuItemC2741b setActionView(View view) {
        int i7;
        this.f9020A = view;
        this.f9021B = null;
        if (view != null && view.getId() == -1 && (i7 = this.f9025a) > 0) {
            view.setId(i7);
        }
        this.f9038n.I(this);
        return this;
    }

    public void r(boolean z7) {
        this.f9023D = z7;
        this.f9038n.K(false);
    }

    void s(boolean z7) {
        int i7 = this.f9049y;
        int i8 = (z7 ? 2 : 0) | (i7 & (-3));
        this.f9049y = i8;
        if (i7 != i8) {
            this.f9038n.K(false);
        }
    }

    @Override
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override
    public MenuItem setAlphabeticShortcut(char c2) {
        if (this.f9034j == c2) {
            return this;
        }
        this.f9034j = Character.toLowerCase(c2);
        this.f9038n.K(false);
        return this;
    }

    @Override
    public MenuItem setCheckable(boolean z7) {
        int i7 = this.f9049y;
        int i8 = (z7 ? 1 : 0) | (i7 & (-2));
        this.f9049y = i8;
        if (i7 != i8) {
            this.f9038n.K(false);
        }
        return this;
    }

    @Override
    public MenuItem setChecked(boolean z7) {
        if ((this.f9049y & 4) != 0) {
            this.f9038n.T(this);
        } else {
            s(z7);
        }
        return this;
    }

    @Override
    public MenuItem setEnabled(boolean z7) {
        if (z7) {
            this.f9049y |= 16;
        } else {
            this.f9049y &= -17;
        }
        this.f9038n.K(false);
        return this;
    }

    @Override
    public MenuItem setIcon(Drawable drawable) {
        this.f9037m = 0;
        this.f9036l = drawable;
        this.f9048x = true;
        this.f9038n.K(false);
        return this;
    }

    @Override
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f9044t = colorStateList;
        this.f9046v = true;
        this.f9048x = true;
        this.f9038n.K(false);
        return this;
    }

    @Override
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f9045u = mode;
        this.f9047w = true;
        this.f9048x = true;
        this.f9038n.K(false);
        return this;
    }

    @Override
    public MenuItem setIntent(Intent intent) {
        this.f9031g = intent;
        return this;
    }

    @Override
    public MenuItem setNumericShortcut(char c2) {
        if (this.f9032h == c2) {
            return this;
        }
        this.f9032h = c2;
        this.f9038n.K(false);
        return this;
    }

    @Override
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f9022C = onActionExpandListener;
        return this;
    }

    @Override
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f9041q = onMenuItemClickListener;
        return this;
    }

    @Override
    public MenuItem setShortcut(char c2, char c3) {
        this.f9032h = c2;
        this.f9034j = Character.toLowerCase(c3);
        this.f9038n.K(false);
        return this;
    }

    @Override
    public void setShowAsAction(int i7) {
        int i8 = i7 & 3;
        if (i8 != 0 && i8 != 1 && i8 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f9050z = i7;
        this.f9038n.I(this);
    }

    @Override
    public MenuItem setTitle(CharSequence charSequence) {
        this.f9029e = charSequence;
        this.f9038n.K(false);
        r rVar = this.f9039o;
        if (rVar != null) {
            rVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f9030f = charSequence;
        this.f9038n.K(false);
        return this;
    }

    @Override
    public MenuItem setVisible(boolean z7) {
        if (y(z7)) {
            this.f9038n.J(this);
        }
        return this;
    }

    public void t(boolean z7) {
        this.f9049y = (z7 ? 4 : 0) | (this.f9049y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.f9029e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(boolean z7) {
        if (z7) {
            this.f9049y |= 32;
        } else {
            this.f9049y &= -33;
        }
    }

    void v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f9024E = contextMenuInfo;
    }

    @Override
    public InterfaceMenuItemC2741b setShowAsActionFlags(int i7) {
        setShowAsAction(i7);
        return this;
    }

    public void x(r rVar) {
        this.f9039o = rVar;
        rVar.setHeaderTitle(getTitle());
    }

    boolean y(boolean z7) {
        int i7 = this.f9049y;
        int i8 = (z7 ? 0 : 8) | (i7 & (-9));
        this.f9049y = i8;
        return i7 != i8;
    }

    public boolean z() {
        return this.f9038n.A();
    }

    @Override
    public InterfaceMenuItemC2741b setContentDescription(CharSequence charSequence) {
        this.f9042r = charSequence;
        this.f9038n.K(false);
        return this;
    }

    @Override
    public InterfaceMenuItemC2741b setTooltipText(CharSequence charSequence) {
        this.f9043s = charSequence;
        this.f9038n.K(false);
        return this;
    }

    @Override
    public MenuItem setAlphabeticShortcut(char c2, int i7) {
        if (this.f9034j == c2 && this.f9035k == i7) {
            return this;
        }
        this.f9034j = Character.toLowerCase(c2);
        this.f9035k = KeyEvent.normalizeMetaState(i7);
        this.f9038n.K(false);
        return this;
    }

    @Override
    public MenuItem setNumericShortcut(char c2, int i7) {
        if (this.f9032h == c2 && this.f9033i == i7) {
            return this;
        }
        this.f9032h = c2;
        this.f9033i = KeyEvent.normalizeMetaState(i7);
        this.f9038n.K(false);
        return this;
    }

    @Override
    public MenuItem setShortcut(char c2, char c3, int i7, int i8) {
        this.f9032h = c2;
        this.f9033i = KeyEvent.normalizeMetaState(i7);
        this.f9034j = Character.toLowerCase(c3);
        this.f9035k = KeyEvent.normalizeMetaState(i8);
        this.f9038n.K(false);
        return this;
    }

    @Override
    public MenuItem setIcon(int i7) {
        this.f9036l = null;
        this.f9037m = i7;
        this.f9048x = true;
        this.f9038n.K(false);
        return this;
    }

    @Override
    public MenuItem setTitle(int i7) {
        return setTitle(this.f9038n.u().getString(i7));
    }
}
