package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.view.AbstractC1607b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import r0.InterfaceMenuC2740a;

public class g implements InterfaceMenuC2740a {

    private static final int[] f8989A = {1, 4, 5, 3, 2, 0};

    private final Context f8990a;

    private final Resources f8991b;

    private boolean f8992c;

    private boolean f8993d;

    private a f8994e;

    private ContextMenu.ContextMenuInfo f9002m;

    CharSequence f9003n;

    Drawable f9004o;

    View f9005p;

    private i f9013x;

    private boolean f9015z;

    private int f9001l = 0;

    private boolean f9006q = false;

    private boolean f9007r = false;

    private boolean f9008s = false;

    private boolean f9009t = false;

    private boolean f9010u = false;

    private ArrayList<i> f9011v = new ArrayList<>();

    private CopyOnWriteArrayList<WeakReference<m>> f9012w = new CopyOnWriteArrayList<>();

    private boolean f9014y = false;

    private ArrayList<i> f8995f = new ArrayList<>();

    private ArrayList<i> f8996g = new ArrayList<>();

    private boolean f8997h = true;

    private ArrayList<i> f8998i = new ArrayList<>();

    private ArrayList<i> f8999j = new ArrayList<>();

    private boolean f9000k = true;

    public interface a {
        boolean a(g gVar, MenuItem menuItem);

        void b(g gVar);
    }

    public interface b {
        boolean invokeItem(i iVar);
    }

    public g(Context context) {
        this.f8990a = context;
        this.f8991b = context.getResources();
        b0(true);
    }

    private static int B(int i7) {
        int i8 = ((-65536) & i7) >> 16;
        if (i8 >= 0) {
            int[] iArr = f8989A;
            if (i8 < iArr.length) {
                return (i7 & 65535) | (iArr[i8] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private void N(int i7, boolean z7) {
        if (i7 < 0 || i7 >= this.f8995f.size()) {
            return;
        }
        this.f8995f.remove(i7);
        if (z7) {
            K(true);
        }
    }

    private void W(int i7, CharSequence charSequence, int i8, Drawable drawable, View view) {
        Resources resourcesC = C();
        if (view != null) {
            this.f9005p = view;
            this.f9003n = null;
            this.f9004o = null;
        } else {
            if (i7 > 0) {
                this.f9003n = resourcesC.getText(i7);
            } else if (charSequence != null) {
                this.f9003n = charSequence;
            }
            if (i8 > 0) {
                this.f9004o = androidx.core.content.a.e(u(), i8);
            } else if (drawable != null) {
                this.f9004o = drawable;
            }
            this.f9005p = null;
        }
        K(false);
    }

    private void b0(boolean r3) {
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.g.b0(boolean):void");
    }

    private i g(int i7, int i8, int i9, int i10, CharSequence charSequence, int i11) {
        return new i(this, i7, i8, i9, i10, charSequence, i11);
    }

    private void i(boolean z7) {
        if (this.f9012w.isEmpty()) {
            return;
        }
        d0();
        Iterator<WeakReference<m>> it = this.f9012w.iterator();
        while (it.hasNext()) {
            WeakReference<m> next = it.next();
            m mVar = next.get();
            if (mVar == null) {
                this.f9012w.remove(next);
            } else {
                mVar.b(z7);
            }
        }
        c0();
    }

    private boolean j(r rVar, m mVar) {
        if (this.f9012w.isEmpty()) {
            return false;
        }
        boolean zH = mVar != null ? mVar.h(rVar) : false;
        Iterator<WeakReference<m>> it = this.f9012w.iterator();
        while (it.hasNext()) {
            WeakReference<m> next = it.next();
            m mVar2 = next.get();
            if (mVar2 == null) {
                this.f9012w.remove(next);
            } else if (!zH) {
                zH = mVar2.h(rVar);
            }
        }
        return zH;
    }

    private static int n(ArrayList<i> arrayList, int i7) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).f() <= i7) {
                return size + 1;
            }
        }
        return 0;
    }

    boolean A() {
        return this.f9009t;
    }

    Resources C() {
        return this.f8991b;
    }

    public g D() {
        return this;
    }

    public ArrayList<i> E() {
        if (!this.f8997h) {
            return this.f8996g;
        }
        this.f8996g.clear();
        int size = this.f8995f.size();
        for (int i7 = 0; i7 < size; i7++) {
            i iVar = this.f8995f.get(i7);
            if (iVar.isVisible()) {
                this.f8996g.add(iVar);
            }
        }
        this.f8997h = false;
        this.f9000k = true;
        return this.f8996g;
    }

    public boolean F() {
        return this.f9014y;
    }

    boolean G() {
        return this.f8992c;
    }

    public boolean H() {
        return this.f8993d;
    }

    void I(i iVar) {
        this.f9000k = true;
        K(true);
    }

    void J(i iVar) {
        this.f8997h = true;
        K(true);
    }

    public void K(boolean z7) {
        if (this.f9006q) {
            this.f9007r = true;
            if (z7) {
                this.f9008s = true;
                return;
            }
            return;
        }
        if (z7) {
            this.f8997h = true;
            this.f9000k = true;
        }
        i(z7);
    }

    public boolean L(MenuItem menuItem, int i7) {
        return M(menuItem, null, i7);
    }

    public boolean M(MenuItem menuItem, m mVar, int i7) {
        i iVar = (i) menuItem;
        if (iVar == null || !iVar.isEnabled()) {
            return false;
        }
        boolean zK = iVar.k();
        AbstractC1607b abstractC1607bB = iVar.b();
        boolean z7 = abstractC1607bB != null && abstractC1607bB.hasSubMenu();
        if (iVar.j()) {
            zK |= iVar.expandActionView();
            if (zK) {
                e(true);
            }
        } else if (iVar.hasSubMenu() || z7) {
            if ((i7 & 4) == 0) {
                e(false);
            }
            if (!iVar.hasSubMenu()) {
                iVar.x(new r(u(), this, iVar));
            }
            r rVar = (r) iVar.getSubMenu();
            if (z7) {
                abstractC1607bB.onPrepareSubMenu(rVar);
            }
            zK |= j(rVar, mVar);
            if (!zK) {
                e(true);
            }
        } else if ((i7 & 1) == 0) {
            e(true);
        }
        return zK;
    }

    public void O(m mVar) {
        Iterator<WeakReference<m>> it = this.f9012w.iterator();
        while (it.hasNext()) {
            WeakReference<m> next = it.next();
            m mVar2 = next.get();
            if (mVar2 == null || mVar2 == mVar) {
                this.f9012w.remove(next);
            }
        }
    }

    public void P(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(t());
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            MenuItem item = getItem(i7);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((r) item.getSubMenu()).P(bundle);
            }
        }
        int i8 = bundle.getInt("android:menu:expandedactionview");
        if (i8 <= 0 || (menuItemFindItem = findItem(i8)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    public void Q(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i7 = 0; i7 < size; i7++) {
            MenuItem item = getItem(i7);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((r) item.getSubMenu()).Q(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(t(), sparseArray);
        }
    }

    public void R(a aVar) {
        this.f8994e = aVar;
    }

    public g S(int i7) {
        this.f9001l = i7;
        return this;
    }

    void T(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f8995f.size();
        d0();
        for (int i7 = 0; i7 < size; i7++) {
            i iVar = this.f8995f.get(i7);
            if (iVar.getGroupId() == groupId && iVar.m() && iVar.isCheckable()) {
                iVar.s(iVar == menuItem);
            }
        }
        c0();
    }

    protected g U(int i7) {
        W(0, null, i7, null, null);
        return this;
    }

    protected g V(Drawable drawable) {
        W(0, null, 0, drawable, null);
        return this;
    }

    protected g X(int i7) {
        W(i7, null, 0, null, null);
        return this;
    }

    protected g Y(CharSequence charSequence) {
        W(0, charSequence, 0, null, null);
        return this;
    }

    protected g Z(View view) {
        W(0, null, 0, null, view);
        return this;
    }

    protected MenuItem a(int i7, int i8, int i9, CharSequence charSequence) {
        int iB = B(i9);
        i iVarG = g(i7, i8, i9, iB, charSequence, this.f9001l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f9002m;
        if (contextMenuInfo != null) {
            iVarG.v(contextMenuInfo);
        }
        ArrayList<i> arrayList = this.f8995f;
        arrayList.add(n(arrayList, iB), iVarG);
        K(true);
        return iVarG;
    }

    public void a0(boolean z7) {
        this.f9015z = z7;
    }

    @Override
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override
    public int addIntentOptions(int i7, int i8, int i9, ComponentName componentName, Intent[] intentArr, Intent intent, int i10, MenuItem[] menuItemArr) {
        int i11;
        PackageManager packageManager = this.f8990a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i10 & 1) == 0) {
            removeGroup(i7);
        }
        for (int i12 = 0; i12 < size; i12++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i12);
            int i13 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i13 < 0 ? intent : intentArr[i13]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i7, i8, i9, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i11 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i11] = intent3;
            }
        }
        return size;
    }

    @Override
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(m mVar) {
        c(mVar, this.f8990a);
    }

    public void c(m mVar, Context context) {
        this.f9012w.add(new WeakReference<>(mVar));
        mVar.g(context, this);
        this.f9000k = true;
    }

    public void c0() {
        this.f9006q = false;
        if (this.f9007r) {
            this.f9007r = false;
            K(this.f9008s);
        }
    }

    @Override
    public void clear() {
        i iVar = this.f9013x;
        if (iVar != null) {
            f(iVar);
        }
        this.f8995f.clear();
        K(true);
    }

    public void clearHeader() {
        this.f9004o = null;
        this.f9003n = null;
        this.f9005p = null;
        K(false);
    }

    @Override
    public void close() {
        e(true);
    }

    public void d() {
        a aVar = this.f8994e;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    public void d0() {
        if (this.f9006q) {
            return;
        }
        this.f9006q = true;
        this.f9007r = false;
        this.f9008s = false;
    }

    public final void e(boolean z7) {
        if (this.f9010u) {
            return;
        }
        this.f9010u = true;
        Iterator<WeakReference<m>> it = this.f9012w.iterator();
        while (it.hasNext()) {
            WeakReference<m> next = it.next();
            m mVar = next.get();
            if (mVar == null) {
                this.f9012w.remove(next);
            } else {
                mVar.a(this, z7);
            }
        }
        this.f9010u = false;
    }

    public boolean f(i iVar) {
        boolean zD = false;
        if (!this.f9012w.isEmpty() && this.f9013x == iVar) {
            d0();
            Iterator<WeakReference<m>> it = this.f9012w.iterator();
            while (it.hasNext()) {
                WeakReference<m> next = it.next();
                m mVar = next.get();
                if (mVar == null) {
                    this.f9012w.remove(next);
                } else {
                    zD = mVar.d(this, iVar);
                    if (zD) {
                        break;
                    }
                }
            }
            c0();
            if (zD) {
                this.f9013x = null;
            }
        }
        return zD;
    }

    @Override
    public MenuItem findItem(int i7) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            i iVar = this.f8995f.get(i8);
            if (iVar.getItemId() == i7) {
                return iVar;
            }
            if (iVar.hasSubMenu() && (menuItemFindItem = iVar.getSubMenu().findItem(i7)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    @Override
    public MenuItem getItem(int i7) {
        return this.f8995f.get(i7);
    }

    boolean h(g gVar, MenuItem menuItem) {
        a aVar = this.f8994e;
        return aVar != null && aVar.a(gVar, menuItem);
    }

    @Override
    public boolean hasVisibleItems() {
        if (this.f9015z) {
            return true;
        }
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            if (this.f8995f.get(i7).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isShortcutKey(int i7, KeyEvent keyEvent) {
        return p(i7, keyEvent) != null;
    }

    public boolean k(i iVar) {
        boolean zE = false;
        if (this.f9012w.isEmpty()) {
            return false;
        }
        d0();
        Iterator<WeakReference<m>> it = this.f9012w.iterator();
        while (it.hasNext()) {
            WeakReference<m> next = it.next();
            m mVar = next.get();
            if (mVar == null) {
                this.f9012w.remove(next);
            } else {
                zE = mVar.e(this, iVar);
                if (zE) {
                    break;
                }
            }
        }
        c0();
        if (zE) {
            this.f9013x = iVar;
        }
        return zE;
    }

    public int l(int i7) {
        return m(i7, 0);
    }

    public int m(int i7, int i8) {
        int size = size();
        if (i8 < 0) {
            i8 = 0;
        }
        while (i8 < size) {
            if (this.f8995f.get(i8).getGroupId() == i7) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    public int o(int i7) {
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            if (this.f8995f.get(i8).getItemId() == i7) {
                return i8;
            }
        }
        return -1;
    }

    i p(int i7, KeyEvent keyEvent) {
        ArrayList<i> arrayList = this.f9011v;
        arrayList.clear();
        q(arrayList, i7, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean zG = G();
        for (int i8 = 0; i8 < size; i8++) {
            i iVar = arrayList.get(i8);
            char alphabeticShortcut = zG ? iVar.getAlphabeticShortcut() : iVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (zG && alphabeticShortcut == '\b' && i7 == 67))) {
                return iVar;
            }
        }
        return null;
    }

    @Override
    public boolean performIdentifierAction(int i7, int i8) {
        return L(findItem(i7), i8);
    }

    @Override
    public boolean performShortcut(int i7, KeyEvent keyEvent, int i8) {
        i iVarP = p(i7, keyEvent);
        boolean zL = iVarP != null ? L(iVarP, i8) : false;
        if ((i8 & 2) != 0) {
            e(true);
        }
        return zL;
    }

    void q(List<i> list, int i7, KeyEvent keyEvent) {
        boolean zG = G();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i7 == 67) {
            int size = this.f8995f.size();
            for (int i8 = 0; i8 < size; i8++) {
                i iVar = this.f8995f.get(i8);
                if (iVar.hasSubMenu()) {
                    ((g) iVar.getSubMenu()).q(list, i7, keyEvent);
                }
                char alphabeticShortcut = zG ? iVar.getAlphabeticShortcut() : iVar.getNumericShortcut();
                if ((modifiers & 69647) == ((zG ? iVar.getAlphabeticModifiers() : iVar.getNumericModifiers()) & 69647) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (zG && alphabeticShortcut == '\b' && i7 == 67)) && iVar.isEnabled()) {
                        list.add(iVar);
                    }
                }
            }
        }
    }

    public void r() {
        ArrayList<i> arrayListE = E();
        if (this.f9000k) {
            Iterator<WeakReference<m>> it = this.f9012w.iterator();
            boolean zC = false;
            while (it.hasNext()) {
                WeakReference<m> next = it.next();
                m mVar = next.get();
                if (mVar == null) {
                    this.f9012w.remove(next);
                } else {
                    zC |= mVar.c();
                }
            }
            if (zC) {
                this.f8998i.clear();
                this.f8999j.clear();
                int size = arrayListE.size();
                for (int i7 = 0; i7 < size; i7++) {
                    i iVar = arrayListE.get(i7);
                    if (iVar.l()) {
                        this.f8998i.add(iVar);
                    } else {
                        this.f8999j.add(iVar);
                    }
                }
            } else {
                this.f8998i.clear();
                this.f8999j.clear();
                this.f8999j.addAll(E());
            }
            this.f9000k = false;
        }
    }

    @Override
    public void removeGroup(int i7) {
        int iL = l(i7);
        if (iL >= 0) {
            int size = this.f8995f.size() - iL;
            int i8 = 0;
            while (true) {
                int i9 = i8 + 1;
                if (i8 >= size || this.f8995f.get(iL).getGroupId() != i7) {
                    break;
                }
                N(iL, false);
                i8 = i9;
            }
            K(true);
        }
    }

    @Override
    public void removeItem(int i7) {
        N(o(i7), true);
    }

    public ArrayList<i> s() {
        r();
        return this.f8998i;
    }

    @Override
    public void setGroupCheckable(int i7, boolean z7, boolean z8) {
        int size = this.f8995f.size();
        for (int i8 = 0; i8 < size; i8++) {
            i iVar = this.f8995f.get(i8);
            if (iVar.getGroupId() == i7) {
                iVar.t(z8);
                iVar.setCheckable(z7);
            }
        }
    }

    @Override
    public void setGroupDividerEnabled(boolean z7) {
        this.f9014y = z7;
    }

    @Override
    public void setGroupEnabled(int i7, boolean z7) {
        int size = this.f8995f.size();
        for (int i8 = 0; i8 < size; i8++) {
            i iVar = this.f8995f.get(i8);
            if (iVar.getGroupId() == i7) {
                iVar.setEnabled(z7);
            }
        }
    }

    @Override
    public void setGroupVisible(int i7, boolean z7) {
        int size = this.f8995f.size();
        boolean z8 = false;
        for (int i8 = 0; i8 < size; i8++) {
            i iVar = this.f8995f.get(i8);
            if (iVar.getGroupId() == i7 && iVar.y(z7)) {
                z8 = true;
            }
        }
        if (z8) {
            K(true);
        }
    }

    @Override
    public void setQwertyMode(boolean z7) {
        this.f8992c = z7;
        K(false);
    }

    @Override
    public int size() {
        return this.f8995f.size();
    }

    protected String t() {
        return "android:menu:actionviewstates";
    }

    public Context u() {
        return this.f8990a;
    }

    public i v() {
        return this.f9013x;
    }

    public Drawable w() {
        return this.f9004o;
    }

    public CharSequence x() {
        return this.f9003n;
    }

    public View y() {
        return this.f9005p;
    }

    public ArrayList<i> z() {
        r();
        return this.f8999j;
    }

    @Override
    public MenuItem add(int i7) {
        return a(0, 0, 0, this.f8991b.getString(i7));
    }

    @Override
    public SubMenu addSubMenu(int i7) {
        return addSubMenu(0, 0, 0, this.f8991b.getString(i7));
    }

    @Override
    public MenuItem add(int i7, int i8, int i9, CharSequence charSequence) {
        return a(i7, i8, i9, charSequence);
    }

    @Override
    public SubMenu addSubMenu(int i7, int i8, int i9, CharSequence charSequence) {
        i iVar = (i) a(i7, i8, i9, charSequence);
        r rVar = new r(this.f8990a, this, iVar);
        iVar.x(rVar);
        return rVar;
    }

    @Override
    public MenuItem add(int i7, int i8, int i9, int i10) {
        return a(i7, i8, i9, this.f8991b.getString(i10));
    }

    @Override
    public SubMenu addSubMenu(int i7, int i8, int i9, int i10) {
        return addSubMenu(i7, i8, i9, this.f8991b.getString(i10));
    }
}
