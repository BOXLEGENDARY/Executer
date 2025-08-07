package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import androidx.core.view.C1605a;
import androidx.core.view.C1646v;
import androidx.core.view.Z;
import c4.C1746b;
import c4.C1754j;
import c4.C1755k;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.p;
import com.google.android.material.internal.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import u4.C2931a;
import u4.InterfaceC2933c;
import u4.k;
import x4.C2990a;
import y0.C3019t;

public class MaterialButtonToggleGroup extends LinearLayout {

    private static final int f17458D = C1754j.f12970w;

    private boolean f17459A;

    private final int f17460B;

    private Set<Integer> f17461C;

    private final List<c> f17462d;

    private final e f17463e;

    private final LinkedHashSet<d> f17464i;

    private final Comparator<MaterialButton> f17465v;

    private Integer[] f17466w;

    private boolean f17467y;

    private boolean f17468z;

    class a implements Comparator<MaterialButton> {
        a() {
        }

        @Override
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            int iCompareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            return iCompareTo2 != 0 ? iCompareTo2 : Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    class b extends C1605a {
        b() {
        }

        @Override
        public void g(View view, C3019t c3019t) {
            super.g(view, c3019t);
            c3019t.h0(C3019t.f.a(0, 1, MaterialButtonToggleGroup.this.i(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    private static class c {

        private static final InterfaceC2933c f17471e = new C2931a(0.0f);

        InterfaceC2933c f17472a;

        InterfaceC2933c f17473b;

        InterfaceC2933c f17474c;

        InterfaceC2933c f17475d;

        c(InterfaceC2933c interfaceC2933c, InterfaceC2933c interfaceC2933c2, InterfaceC2933c interfaceC2933c3, InterfaceC2933c interfaceC2933c4) {
            this.f17472a = interfaceC2933c;
            this.f17473b = interfaceC2933c3;
            this.f17474c = interfaceC2933c4;
            this.f17475d = interfaceC2933c2;
        }

        public static c a(c cVar) {
            InterfaceC2933c interfaceC2933c = f17471e;
            return new c(interfaceC2933c, cVar.f17475d, interfaceC2933c, cVar.f17474c);
        }

        public static c b(c cVar, View view) {
            return s.h(view) ? c(cVar) : d(cVar);
        }

        public static c c(c cVar) {
            InterfaceC2933c interfaceC2933c = cVar.f17472a;
            InterfaceC2933c interfaceC2933c2 = cVar.f17475d;
            InterfaceC2933c interfaceC2933c3 = f17471e;
            return new c(interfaceC2933c, interfaceC2933c2, interfaceC2933c3, interfaceC2933c3);
        }

        public static c d(c cVar) {
            InterfaceC2933c interfaceC2933c = f17471e;
            return new c(interfaceC2933c, interfaceC2933c, cVar.f17473b, cVar.f17474c);
        }

        public static c e(c cVar, View view) {
            return s.h(view) ? d(cVar) : c(cVar);
        }

        public static c f(c cVar) {
            InterfaceC2933c interfaceC2933c = cVar.f17472a;
            InterfaceC2933c interfaceC2933c2 = f17471e;
            return new c(interfaceC2933c, interfaceC2933c2, cVar.f17473b, interfaceC2933c2);
        }
    }

    public interface d {
        void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i7, boolean z7);
    }

    private class e implements MaterialButton.b {
        private e() {
        }

        @Override
        public void a(MaterialButton materialButton, boolean z7) {
            MaterialButtonToggleGroup.this.invalidate();
        }

        e(MaterialButtonToggleGroup materialButtonToggleGroup, a aVar) {
            this();
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1746b.f12760w);
    }

    private void c() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i7 = firstVisibleChildIndex + 1; i7 < getChildCount(); i7++) {
            MaterialButton materialButtonH = h(i7);
            int iMin = Math.min(materialButtonH.getStrokeWidth(), h(i7 - 1).getStrokeWidth());
            LinearLayout.LayoutParams layoutParamsD = d(materialButtonH);
            if (getOrientation() == 0) {
                C1646v.c(layoutParamsD, 0);
                C1646v.d(layoutParamsD, -iMin);
                layoutParamsD.topMargin = 0;
            } else {
                layoutParamsD.bottomMargin = 0;
                layoutParamsD.topMargin = -iMin;
                C1646v.d(layoutParamsD, 0);
            }
            materialButtonH.setLayoutParams(layoutParamsD);
        }
        n(firstVisibleChildIndex);
    }

    private LinearLayout.LayoutParams d(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    private void e(int i7, boolean z7) {
        if (i7 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i7);
            return;
        }
        HashSet hashSet = new HashSet(this.f17461C);
        if (z7 && !hashSet.contains(Integer.valueOf(i7))) {
            if (this.f17468z && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i7));
        } else {
            if (z7 || !hashSet.contains(Integer.valueOf(i7))) {
                return;
            }
            if (!this.f17459A || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i7));
            }
        }
        q(hashSet);
    }

    private void g(int i7, boolean z7) {
        Iterator<d> it = this.f17464i.iterator();
        while (it.hasNext()) {
            it.next().a(this, i7, z7);
        }
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            if (k(i7)) {
                return i7;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (k(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i7 = 0;
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            if ((getChildAt(i8) instanceof MaterialButton) && k(i8)) {
                i7++;
            }
        }
        return i7;
    }

    private MaterialButton h(int i7) {
        return (MaterialButton) getChildAt(i7);
    }

    public int i(View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            if (getChildAt(i8) == view) {
                return i7;
            }
            if ((getChildAt(i8) instanceof MaterialButton) && k(i8)) {
                i7++;
            }
        }
        return -1;
    }

    private c j(int i7, int i8, int i9) {
        c cVar = this.f17462d.get(i7);
        if (i8 == i9) {
            return cVar;
        }
        boolean z7 = getOrientation() == 0;
        if (i7 == i8) {
            return z7 ? c.e(cVar, this) : c.f(cVar);
        }
        if (i7 == i9) {
            return z7 ? c.b(cVar, this) : c.a(cVar);
        }
        return null;
    }

    private boolean k(int i7) {
        return getChildAt(i7).getVisibility() != 8;
    }

    private void n(int i7) {
        if (getChildCount() == 0 || i7 == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) h(i7).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
        } else {
            C1646v.c(layoutParams, 0);
            C1646v.d(layoutParams, 0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    private void o(int i7, boolean z7) {
        View viewFindViewById = findViewById(i7);
        if (viewFindViewById instanceof MaterialButton) {
            this.f17467y = true;
            ((MaterialButton) viewFindViewById).setChecked(z7);
            this.f17467y = false;
        }
    }

    private static void p(k.b bVar, c cVar) {
        if (cVar == null) {
            bVar.o(0.0f);
        } else {
            bVar.B(cVar.f17472a).t(cVar.f17475d).F(cVar.f17473b).x(cVar.f17474c);
        }
    }

    private void q(Set<Integer> set) {
        Set<Integer> set2 = this.f17461C;
        this.f17461C = new HashSet(set);
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            int id = h(i7).getId();
            o(id, set.contains(Integer.valueOf(id)));
            if (set2.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                g(id, set.contains(Integer.valueOf(id)));
            }
        }
        invalidate();
    }

    private void r() {
        TreeMap treeMap = new TreeMap(this.f17465v);
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            treeMap.put(h(i7), Integer.valueOf(i7));
        }
        this.f17466w = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(Z.k());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f17463e);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    private void t() {
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            h(i7).setA11yClassName((this.f17468z ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    @Override
    public void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i7, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        e(materialButton.getId(), materialButton.isChecked());
        k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f17462d.add(new c(shapeAppearanceModel.r(), shapeAppearanceModel.j(), shapeAppearanceModel.t(), shapeAppearanceModel.l()));
        materialButton.setEnabled(isEnabled());
        Z.n0(materialButton, new b());
    }

    public void b(d dVar) {
        this.f17464i.add(dVar);
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        r();
        super.dispatchDraw(canvas);
    }

    public void f() {
        q(new HashSet());
    }

    public int getCheckedButtonId() {
        if (!this.f17468z || this.f17461C.isEmpty()) {
            return -1;
        }
        return this.f17461C.iterator().next().intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            int id = h(i7).getId();
            if (this.f17461C.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override
    protected int getChildDrawingOrder(int i7, int i8) {
        Integer[] numArr = this.f17466w;
        if (numArr != null && i8 < numArr.length) {
            return numArr[i8].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i8;
    }

    public boolean l() {
        return this.f17468z;
    }

    void m(MaterialButton materialButton, boolean z7) {
        if (this.f17467y) {
            return;
        }
        e(materialButton.getId(), z7);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i7 = this.f17460B;
        if (i7 != -1) {
            q(Collections.singleton(Integer.valueOf(i7)));
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C3019t.F0(accessibilityNodeInfo).g0(C3019t.e.a(1, getVisibleButtonCount(), false, l() ? 1 : 2));
    }

    @Override
    protected void onMeasure(int i7, int i8) {
        s();
        c();
        super.onMeasure(i7, i8);
    }

    @Override
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f17462d.remove(iIndexOfChild);
        }
        s();
        c();
    }

    void s() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i7 = 0; i7 < childCount; i7++) {
            MaterialButton materialButtonH = h(i7);
            if (materialButtonH.getVisibility() != 8) {
                k.b bVarV = materialButtonH.getShapeAppearanceModel().v();
                p(bVarV, j(i7, firstVisibleChildIndex, lastVisibleChildIndex));
                materialButtonH.setShapeAppearanceModel(bVarV.m());
            }
        }
    }

    @Override
    public void setEnabled(boolean z7) {
        super.setEnabled(z7);
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            h(i7).setEnabled(z7);
        }
    }

    public void setSelectionRequired(boolean z7) {
        this.f17459A = z7;
    }

    public void setSingleSelection(boolean z7) {
        if (this.f17468z != z7) {
            this.f17468z = z7;
            f();
        }
        t();
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet, int i7) {
        int i8 = f17458D;
        super(C2990a.c(context, attributeSet, i7, i8), attributeSet, i7);
        this.f17462d = new ArrayList();
        this.f17463e = new e(this, null);
        this.f17464i = new LinkedHashSet<>();
        this.f17465v = new a();
        this.f17467y = false;
        this.f17461C = new HashSet();
        TypedArray typedArrayI = p.i(getContext(), attributeSet, C1755k.a3, i7, i8, new int[0]);
        setSingleSelection(typedArrayI.getBoolean(C1755k.f13157e3, false));
        this.f17460B = typedArrayI.getResourceId(C1755k.c3, -1);
        this.f17459A = typedArrayI.getBoolean(C1755k.f13149d3, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayI.getBoolean(C1755k.b3, true));
        typedArrayI.recycle();
        Z.x0(this, 1);
    }

    public void setSingleSelection(int i7) {
        setSingleSelection(getResources().getBoolean(i7));
    }
}
