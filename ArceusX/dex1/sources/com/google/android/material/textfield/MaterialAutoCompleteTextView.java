package com.google.android.material.textfield;

import android.R;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.ListPopupWindow;
import androidx.core.view.Z;
import c4.C1746b;
import c4.C1748d;
import c4.C1752h;
import c4.C1754j;
import c4.C1755k;
import com.github.luben.zstd.BuildConfig;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import k4.C2517a;
import q0.C2731a;
import r4.C2754c;
import u4.C2937g;
import x4.C2990a;

public class MaterialAutoCompleteTextView extends AppCompatAutoCompleteTextView {

    private ColorStateList f18455A;

    private final ListPopupWindow f18456d;

    private final AccessibilityManager f18457e;

    private final Rect f18458i;

    private final int f18459v;

    private final float f18460w;

    private ColorStateList f18461y;

    private int f18462z;

    class a implements AdapterView.OnItemClickListener {
        a() {
        }

        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i7, long j7) {
            MaterialAutoCompleteTextView materialAutoCompleteTextView = MaterialAutoCompleteTextView.this;
            MaterialAutoCompleteTextView.this.k(i7 < 0 ? materialAutoCompleteTextView.f18456d.getSelectedItem() : materialAutoCompleteTextView.getAdapter().getItem(i7));
            AdapterView.OnItemClickListener onItemClickListener = MaterialAutoCompleteTextView.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i7 < 0) {
                    view = MaterialAutoCompleteTextView.this.f18456d.getSelectedView();
                    i7 = MaterialAutoCompleteTextView.this.f18456d.getSelectedItemPosition();
                    j7 = MaterialAutoCompleteTextView.this.f18456d.getSelectedItemId();
                }
                onItemClickListener.onItemClick(MaterialAutoCompleteTextView.this.f18456d.getListView(), view, i7, j7);
            }
            MaterialAutoCompleteTextView.this.f18456d.dismiss();
        }
    }

    private class b<T> extends ArrayAdapter<String> {

        private ColorStateList f18464d;

        private ColorStateList f18465e;

        b(Context context, int i7, String[] strArr) {
            super(context, i7, strArr);
            f();
        }

        private ColorStateList a() {
            if (!c() || !d()) {
                return null;
            }
            int[] iArr = {R.attr.state_hovered, -16842919};
            int[] iArr2 = {R.attr.state_selected, -16842919};
            int colorForState = MaterialAutoCompleteTextView.this.f18455A.getColorForState(iArr2, 0);
            int colorForState2 = MaterialAutoCompleteTextView.this.f18455A.getColorForState(iArr, 0);
            return new ColorStateList(new int[][]{iArr2, iArr, new int[0]}, new int[]{C2517a.i(MaterialAutoCompleteTextView.this.f18462z, colorForState), C2517a.i(MaterialAutoCompleteTextView.this.f18462z, colorForState2), MaterialAutoCompleteTextView.this.f18462z});
        }

        private Drawable b() {
            if (!c()) {
                return null;
            }
            ColorDrawable colorDrawable = new ColorDrawable(MaterialAutoCompleteTextView.this.f18462z);
            if (this.f18465e == null) {
                return colorDrawable;
            }
            C2731a.o(colorDrawable, this.f18464d);
            return new RippleDrawable(this.f18465e, colorDrawable, null);
        }

        private boolean c() {
            return MaterialAutoCompleteTextView.this.f18462z != 0;
        }

        private boolean d() {
            return MaterialAutoCompleteTextView.this.f18455A != null;
        }

        private ColorStateList e() {
            if (!d()) {
                return null;
            }
            int[] iArr = {R.attr.state_pressed};
            return new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{MaterialAutoCompleteTextView.this.f18455A.getColorForState(iArr, 0), 0});
        }

        void f() {
            this.f18465e = e();
            this.f18464d = a();
        }

        @Override
        public View getView(int i7, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i7, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                Z.r0(textView, MaterialAutoCompleteTextView.this.getText().toString().contentEquals(textView.getText()) ? b() : null);
            }
            return view2;
        }
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1746b.f12731a);
    }

    private TextInputLayout e() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private boolean f() {
        return h() || g();
    }

    private boolean g() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f18457e;
        if (accessibilityManager != null && accessibilityManager.isEnabled() && (enabledAccessibilityServiceList = this.f18457e.getEnabledAccessibilityServiceList(16)) != null) {
            for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean h() {
        AccessibilityManager accessibilityManager = this.f18457e;
        return accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled();
    }

    private int i() {
        ListAdapter adapter = getAdapter();
        TextInputLayout textInputLayoutE = e();
        int i7 = 0;
        if (adapter == null || textInputLayoutE == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMin = Math.min(adapter.getCount(), Math.max(0, this.f18456d.getSelectedItemPosition()) + 15);
        View view = null;
        int iMax = 0;
        for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
            int itemViewType = adapter.getItemViewType(iMax2);
            if (itemViewType != i7) {
                view = null;
                i7 = itemViewType;
            }
            view = adapter.getView(iMax2, view, textInputLayoutE);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax = Math.max(iMax, view.getMeasuredWidth());
        }
        Drawable background = this.f18456d.getBackground();
        if (background != null) {
            background.getPadding(this.f18458i);
            Rect rect = this.f18458i;
            iMax += rect.left + rect.right;
        }
        return iMax + textInputLayoutE.getEndIconView().getMeasuredWidth();
    }

    private void j() {
        TextInputLayout textInputLayoutE = e();
        if (textInputLayoutE != null) {
            textInputLayoutE.s0();
        }
    }

    public <T extends ListAdapter & Filterable> void k(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    @Override
    public void dismissDropDown() {
        if (f()) {
            this.f18456d.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f18461y;
    }

    @Override
    public CharSequence getHint() {
        TextInputLayout textInputLayoutE = e();
        return (textInputLayoutE == null || !textInputLayoutE.R()) ? super.getHint() : textInputLayoutE.getHint();
    }

    public float getPopupElevation() {
        return this.f18460w;
    }

    public int getSimpleItemSelectedColor() {
        return this.f18462z;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f18455A;
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutE = e();
        if (textInputLayoutE != null && textInputLayoutE.R() && super.getHint() == null && com.google.android.material.internal.i.b()) {
            setHint(BuildConfig.FLAVOR);
        }
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f18456d.dismiss();
    }

    @Override
    protected void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        if (View.MeasureSpec.getMode(i7) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), i()), View.MeasureSpec.getSize(i7)), getMeasuredHeight());
        }
    }

    @Override
    public void onWindowFocusChanged(boolean z7) {
        if (f()) {
            return;
        }
        super.onWindowFocusChanged(z7);
    }

    @Override
    public <T extends ListAdapter & Filterable> void setAdapter(T t7) {
        super.setAdapter(t7);
        this.f18456d.setAdapter(getAdapter());
    }

    @Override
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        ListPopupWindow listPopupWindow = this.f18456d;
        if (listPopupWindow != null) {
            listPopupWindow.setBackgroundDrawable(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i7) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i7));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f18461y = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof C2937g) {
            ((C2937g) dropDownBackground).a0(this.f18461y);
        }
    }

    @Override
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f18456d.setOnItemSelectedListener(getOnItemSelectedListener());
    }

    @Override
    public void setRawInputType(int i7) {
        super.setRawInputType(i7);
        j();
    }

    public void setSimpleItemSelectedColor(int i7) {
        this.f18462z = i7;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).f();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f18455A = colorStateList;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).f();
        }
    }

    public void setSimpleItems(int i7) {
        setSimpleItems(getResources().getStringArray(i7));
    }

    @Override
    public void showDropDown() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (f()) {
            this.f18456d.show();
        } else {
            super.showDropDown();
        }
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet, int i7) {
        super(C2990a.c(context, attributeSet, i7, 0), attributeSet, i7);
        this.f18458i = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayI = com.google.android.material.internal.p.i(context2, attributeSet, C1755k.f13294x2, i7, C1754j.f12951d, new int[0]);
        int i8 = C1755k.f13302y2;
        if (typedArrayI.hasValue(i8) && typedArrayI.getInt(i8, 0) == 0) {
            setKeyListener(null);
        }
        this.f18459v = typedArrayI.getResourceId(C1755k.f12983B2, C1752h.f12911l);
        this.f18460w = typedArrayI.getDimensionPixelOffset(C1755k.f13309z2, C1748d.f12799Z);
        int i9 = C1755k.f12976A2;
        if (typedArrayI.hasValue(i9)) {
            this.f18461y = ColorStateList.valueOf(typedArrayI.getColor(i9, 0));
        }
        this.f18462z = typedArrayI.getColor(C1755k.f12990C2, 0);
        this.f18455A = C2754c.a(context2, typedArrayI, C1755k.f12996D2);
        this.f18457e = (AccessibilityManager) context2.getSystemService("accessibility");
        ListPopupWindow listPopupWindow = new ListPopupWindow(context2);
        this.f18456d = listPopupWindow;
        listPopupWindow.setModal(true);
        listPopupWindow.setAnchorView(this);
        listPopupWindow.setInputMethodMode(2);
        listPopupWindow.setAdapter(getAdapter());
        listPopupWindow.setOnItemClickListener(new a());
        int i10 = C1755k.f13002E2;
        if (typedArrayI.hasValue(i10)) {
            setSimpleItems(typedArrayI.getResourceId(i10, 0));
        }
        typedArrayI.recycle();
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new b(getContext(), this.f18459v, strArr));
    }
}
