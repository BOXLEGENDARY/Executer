package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

public abstract class b extends View {

    private View[] f9888A;

    private HashMap<Integer, String> f9889B;

    protected int[] f9890d;

    protected int f9891e;

    protected Context f9892i;

    protected l0.i f9893v;

    protected boolean f9894w;

    protected String f9895y;

    protected String f9896z;

    public b(Context context) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super(context);
        this.f9890d = new int[32];
        this.f9894w = false;
        this.f9888A = null;
        this.f9889B = new HashMap<>();
        this.f9892i = context;
        h(null);
    }

    private void a(String str) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        if (str == null || str.length() == 0 || this.f9892i == null) {
            return;
        }
        String strTrim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        int iG = g(strTrim);
        if (iG != 0) {
            this.f9889B.put(Integer.valueOf(iG), strTrim);
            b(iG);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
    }

    private void b(int i7) {
        if (i7 == getId()) {
            return;
        }
        int i8 = this.f9891e + 1;
        int[] iArr = this.f9890d;
        if (i8 > iArr.length) {
            this.f9890d = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f9890d;
        int i9 = this.f9891e;
        iArr2[i9] = i7;
        this.f9891e = i9 + 1;
    }

    private void c(String str) {
        if (str == null || str.length() == 0 || this.f9892i == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = constraintLayout.getChildAt(i7);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.b) && strTrim.equals(((ConstraintLayout.b) layoutParams).f9817V)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    b(childAt.getId());
                }
            }
        }
    }

    private int f(ConstraintLayout constraintLayout, String str) throws Resources.NotFoundException {
        Resources resources;
        String resourceEntryName;
        if (str == null || constraintLayout == null || (resources = this.f9892i.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = constraintLayout.getChildAt(i7);
            if (childAt.getId() != -1) {
                try {
                    resourceEntryName = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    resourceEntryName = null;
                }
                if (str.equals(resourceEntryName)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    private int g(String str) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int iF = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object designInformation = constraintLayout.getDesignInformation(0, str);
            if (designInformation instanceof Integer) {
                iF = ((Integer) designInformation).intValue();
            }
        }
        if (iF == 0 && constraintLayout != null) {
            iF = f(constraintLayout, str);
        }
        if (iF == 0) {
            try {
                iF = h.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return iF == 0 ? this.f9892i.getResources().getIdentifier(str, "id", this.f9892i.getPackageName()) : iF;
    }

    protected void d() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        e((ConstraintLayout) parent);
    }

    protected void e(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i7 = 0; i7 < this.f9891e; i7++) {
            View viewById = constraintLayout.getViewById(this.f9890d[i7]);
            if (viewById != null) {
                viewById.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f9890d, this.f9891e);
    }

    protected void h(AttributeSet attributeSet) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.f10142a1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i7);
                if (index == i.t1) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f9895y = string;
                    setIds(string);
                } else if (index == i.u1) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f9896z = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void i(l0.e eVar, boolean z7) {
    }

    public void j(ConstraintLayout constraintLayout) {
    }

    public void k(ConstraintLayout constraintLayout) {
    }

    public void l(ConstraintLayout constraintLayout) {
    }

    public void m(ConstraintLayout constraintLayout) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        String str;
        int iF;
        if (isInEditMode()) {
            setIds(this.f9895y);
        }
        l0.i iVar = this.f9893v;
        if (iVar == null) {
            return;
        }
        iVar.b();
        for (int i7 = 0; i7 < this.f9891e; i7++) {
            int i8 = this.f9890d[i7];
            View viewById = constraintLayout.getViewById(i8);
            if (viewById == null && (iF = f(constraintLayout, (str = this.f9889B.get(Integer.valueOf(i8))))) != 0) {
                this.f9890d[i7] = iF;
                this.f9889B.put(Integer.valueOf(iF), str);
                viewById = constraintLayout.getViewById(iF);
            }
            if (viewById != null) {
                this.f9893v.a(constraintLayout.getViewWidget(viewById));
            }
        }
        this.f9893v.c(constraintLayout.mLayoutWidget);
    }

    public void n() {
        if (this.f9893v == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).f9849n0 = (l0.e) this.f9893v;
        }
    }

    @Override
    protected void onAttachedToWindow() throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.onAttachedToWindow();
        String str = this.f9895y;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f9896z;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
    }

    @Override
    protected void onMeasure(int i7, int i8) {
        if (this.f9894w) {
            super.onMeasure(i7, i8);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    protected void setIds(String str) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        this.f9895y = str;
        if (str == null) {
            return;
        }
        int i7 = 0;
        this.f9891e = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i7);
            if (iIndexOf == -1) {
                a(str.substring(i7));
                return;
            } else {
                a(str.substring(i7, iIndexOf));
                i7 = iIndexOf + 1;
            }
        }
    }

    protected void setReferenceTags(String str) {
        this.f9896z = str;
        if (str == null) {
            return;
        }
        int i7 = 0;
        this.f9891e = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i7);
            if (iIndexOf == -1) {
                c(str.substring(i7));
                return;
            } else {
                c(str.substring(i7, iIndexOf));
                i7 = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f9895y = null;
        this.f9891e = 0;
        for (int i7 : iArr) {
            b(i7);
        }
    }

    @Override
    public void setTag(int i7, Object obj) {
        super.setTag(i7, obj);
        if (obj == null && this.f9895y == null) {
            b(i7);
        }
    }

    public b(Context context, AttributeSet attributeSet) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super(context, attributeSet);
        this.f9890d = new int[32];
        this.f9894w = false;
        this.f9888A = null;
        this.f9889B = new HashMap<>();
        this.f9892i = context;
        h(attributeSet);
    }
}
