package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import k0.C2511e;
import l0.d;
import l0.e;
import l0.k;
import l0.l;
import m0.C2558b;
import org.xmlpull.v1.XmlPullParserException;

public class ConstraintLayout extends ViewGroup {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_DRAW_CONSTRAINTS = false;
    public static final int DESIGN_INFO_ID = 0;
    private static final boolean MEASURE = false;
    private static final String TAG = "ConstraintLayout";
    private static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final String VERSION = "ConstraintLayout-2.0.4";
    SparseArray<View> mChildrenByIds;
    private ArrayList<androidx.constraintlayout.widget.b> mConstraintHelpers;
    protected androidx.constraintlayout.widget.c mConstraintLayoutSpec;
    private d mConstraintSet;
    private int mConstraintSetId;
    private f mConstraintsChangedListener;
    private HashMap<String, Integer> mDesignIds;
    protected boolean mDirtyHierarchy;
    private int mLastMeasureHeight;
    int mLastMeasureHeightMode;
    int mLastMeasureHeightSize;
    private int mLastMeasureWidth;
    int mLastMeasureWidthMode;
    int mLastMeasureWidthSize;
    protected l0.f mLayoutWidget;
    private int mMaxHeight;
    private int mMaxWidth;
    c mMeasurer;
    private C2511e mMetrics;
    private int mMinHeight;
    private int mMinWidth;
    private int mOnMeasureHeightMeasureSpec;
    private int mOnMeasureWidthMeasureSpec;
    private int mOptimizationLevel;
    private SparseArray<l0.e> mTempMapIdToWidget;

    static class a {

        static final int[] f9795a;

        static {
            int[] iArr = new int[e.b.values().length];
            f9795a = iArr;
            try {
                iArr[e.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9795a[e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9795a[e.b.f21671v.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9795a[e.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    class c implements C2558b.InterfaceC0209b {

        ConstraintLayout f9864a;

        int f9865b;

        int f9866c;

        int f9867d;

        int f9868e;

        int f9869f;

        int f9870g;

        public c(ConstraintLayout constraintLayout) {
            this.f9864a = constraintLayout;
        }

        private boolean d(int i7, int i8, int i9) {
            if (i7 == i8) {
                return ConstraintLayout.USE_CONSTRAINTS_HELPER;
            }
            int mode = View.MeasureSpec.getMode(i7);
            View.MeasureSpec.getSize(i7);
            int mode2 = View.MeasureSpec.getMode(i8);
            int size = View.MeasureSpec.getSize(i8);
            if (mode2 != 1073741824) {
                return false;
            }
            if ((mode == Integer.MIN_VALUE || mode == 0) && i9 == size) {
                return ConstraintLayout.USE_CONSTRAINTS_HELPER;
            }
            return false;
        }

        @Override
        public final void a() {
            int childCount = this.f9864a.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = this.f9864a.getChildAt(i7);
                if (childAt instanceof g) {
                    ((g) childAt).a(this.f9864a);
                }
            }
            int size = this.f9864a.mConstraintHelpers.size();
            if (size > 0) {
                for (int i8 = 0; i8 < size; i8++) {
                    ((androidx.constraintlayout.widget.b) this.f9864a.mConstraintHelpers.get(i8)).k(this.f9864a);
                }
            }
        }

        @Override
        public final void b(l0.e eVar, C2558b.a aVar) {
            int iMakeMeasureSpec;
            int iMakeMeasureSpec2;
            int baseline;
            int iMax;
            int i7;
            int measuredHeight;
            int i8;
            if (eVar == null) {
                return;
            }
            if (eVar.S() == 8 && !eVar.c0()) {
                aVar.f21901e = 0;
                aVar.f21902f = 0;
                aVar.f21903g = 0;
                return;
            }
            if (eVar.K() == null) {
                return;
            }
            e.b bVar = aVar.f21897a;
            e.b bVar2 = aVar.f21898b;
            int i9 = aVar.f21899c;
            int i10 = aVar.f21900d;
            int i11 = this.f9865b + this.f9866c;
            int i12 = this.f9867d;
            View view = (View) eVar.s();
            int[] iArr = a.f9795a;
            int i13 = iArr[bVar.ordinal()];
            if (i13 == 1) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
            } else if (i13 == 2) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f9869f, i12, -2);
            } else if (i13 == 3) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f9869f, i12 + eVar.B(), -1);
            } else if (i13 != 4) {
                iMakeMeasureSpec = 0;
            } else {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f9869f, i12, -2);
                boolean z7 = eVar.f21644p == 1;
                int i14 = aVar.f21906j;
                if (i14 == C2558b.a.f21895l || i14 == C2558b.a.f21896m) {
                    boolean z8 = view.getMeasuredHeight() == eVar.x();
                    if (aVar.f21906j == C2558b.a.f21896m || !z7 || ((z7 && z8) || (view instanceof g) || eVar.g0())) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(eVar.T(), 1073741824);
                    }
                }
            }
            int i15 = iArr[bVar2.ordinal()];
            if (i15 == 1) {
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
            } else if (i15 == 2) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f9870g, i11, -2);
            } else if (i15 == 3) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f9870g, i11 + eVar.R(), -1);
            } else if (i15 != 4) {
                iMakeMeasureSpec2 = 0;
            } else {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f9870g, i11, -2);
                boolean z9 = eVar.f21646q == 1;
                int i16 = aVar.f21906j;
                if (i16 == C2558b.a.f21895l || i16 == C2558b.a.f21896m) {
                    boolean z10 = view.getMeasuredWidth() == eVar.T();
                    if (aVar.f21906j == C2558b.a.f21896m || !z9 || ((z9 && z10) || (view instanceof g) || eVar.h0())) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(eVar.x(), 1073741824);
                    }
                }
            }
            l0.f fVar = (l0.f) eVar.K();
            if (fVar != null && k.b(ConstraintLayout.this.mOptimizationLevel, 256) && view.getMeasuredWidth() == eVar.T() && view.getMeasuredWidth() < fVar.T() && view.getMeasuredHeight() == eVar.x() && view.getMeasuredHeight() < fVar.x() && view.getBaseline() == eVar.p() && !eVar.f0() && d(eVar.C(), iMakeMeasureSpec, eVar.T()) && d(eVar.D(), iMakeMeasureSpec2, eVar.x())) {
                aVar.f21901e = eVar.T();
                aVar.f21902f = eVar.x();
                aVar.f21903g = eVar.p();
                return;
            }
            e.b bVar3 = e.b.MATCH_CONSTRAINT;
            boolean z11 = bVar == bVar3;
            boolean z12 = bVar2 == bVar3;
            e.b bVar4 = e.b.f21671v;
            boolean z13 = bVar2 == bVar4 || bVar2 == e.b.FIXED;
            boolean z14 = bVar == bVar4 || bVar == e.b.FIXED;
            boolean z15 = z11 && eVar.f21610W > 0.0f;
            boolean z16 = z12 && eVar.f21610W > 0.0f;
            if (view == null) {
                return;
            }
            b bVar5 = (b) view.getLayoutParams();
            int i17 = aVar.f21906j;
            if (i17 != C2558b.a.f21895l && i17 != C2558b.a.f21896m && z11 && eVar.f21644p == 0 && z12 && eVar.f21646q == 0) {
                i8 = -1;
                measuredHeight = 0;
                baseline = 0;
                iMax = 0;
            } else {
                if ((view instanceof j) && (eVar instanceof l)) {
                    ((j) view).o((l) eVar, iMakeMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                eVar.I0(iMakeMeasureSpec, iMakeMeasureSpec2);
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                int i18 = eVar.f21650s;
                iMax = i18 > 0 ? Math.max(i18, measuredWidth) : measuredWidth;
                int i19 = eVar.f21652t;
                if (i19 > 0) {
                    iMax = Math.min(i19, iMax);
                }
                int i20 = eVar.f21656v;
                if (i20 > 0) {
                    measuredHeight = Math.max(i20, measuredHeight2);
                    i7 = iMakeMeasureSpec;
                } else {
                    i7 = iMakeMeasureSpec;
                    measuredHeight = measuredHeight2;
                }
                int i21 = eVar.f21658w;
                if (i21 > 0) {
                    measuredHeight = Math.min(i21, measuredHeight);
                }
                if (!k.b(ConstraintLayout.this.mOptimizationLevel, 1)) {
                    if (z15 && z13) {
                        iMax = (int) ((measuredHeight * eVar.f21610W) + 0.5f);
                    } else if (z16 && z14) {
                        measuredHeight = (int) ((iMax / eVar.f21610W) + 0.5f);
                    }
                }
                if (measuredWidth != iMax || measuredHeight2 != measuredHeight) {
                    int iMakeMeasureSpec3 = measuredWidth != iMax ? View.MeasureSpec.makeMeasureSpec(iMax, 1073741824) : i7;
                    if (measuredHeight2 != measuredHeight) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
                    }
                    view.measure(iMakeMeasureSpec3, iMakeMeasureSpec2);
                    eVar.I0(iMakeMeasureSpec3, iMakeMeasureSpec2);
                    iMax = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
                i8 = -1;
            }
            boolean z17 = baseline != i8 ? ConstraintLayout.USE_CONSTRAINTS_HELPER : false;
            aVar.f21905i = (iMax == aVar.f21899c && measuredHeight == aVar.f21900d) ? false : ConstraintLayout.USE_CONSTRAINTS_HELPER;
            if (bVar5.f9820Y) {
                z17 = ConstraintLayout.USE_CONSTRAINTS_HELPER;
            }
            if (z17 && baseline != -1 && eVar.p() != baseline) {
                aVar.f21905i = ConstraintLayout.USE_CONSTRAINTS_HELPER;
            }
            aVar.f21901e = iMax;
            aVar.f21902f = measuredHeight;
            aVar.f21904h = z17;
            aVar.f21903g = baseline;
        }

        public void c(int i7, int i8, int i9, int i10, int i11, int i12) {
            this.f9865b = i9;
            this.f9866c = i10;
            this.f9867d = i11;
            this.f9868e = i12;
            this.f9869f = i7;
            this.f9870g = i8;
        }
    }

    public ConstraintLayout(Context context) throws XmlPullParserException, IOException {
        super(context);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new l0.f();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = USE_CONSTRAINTS_HELPER;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new c(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(null, 0, 0);
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int iMax2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    private final l0.e getTargetWidget(int i7) {
        if (i7 == 0) {
            return this.mLayoutWidget;
        }
        View viewFindViewById = this.mChildrenByIds.get(i7);
        if (viewFindViewById == null && (viewFindViewById = findViewById(i7)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
            onViewAdded(viewFindViewById);
        }
        if (viewFindViewById == this) {
            return this.mLayoutWidget;
        }
        if (viewFindViewById == null) {
            return null;
        }
        return ((b) viewFindViewById.getLayoutParams()).f9849n0;
    }

    private void init(AttributeSet attributeSet, int i7, int i8) throws XmlPullParserException, IOException {
        this.mLayoutWidget.o0(this);
        this.mLayoutWidget.I1(this.mMeasurer);
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.f10142a1, i7, i8);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i9 = 0; i9 < indexCount; i9++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i9);
                if (index == i.k1) {
                    this.mMinWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMinWidth);
                } else if (index == i.l1) {
                    this.mMinHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMinHeight);
                } else if (index == i.f10192i1) {
                    this.mMaxWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxWidth);
                } else if (index == i.f10199j1) {
                    this.mMaxHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxHeight);
                } else if (index == i.M2) {
                    this.mOptimizationLevel = typedArrayObtainStyledAttributes.getInt(index, this.mOptimizationLevel);
                } else if (index == i.N1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            parseLayoutDescription(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.mConstraintLayoutSpec = null;
                        }
                    }
                } else if (index == i.s1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        d dVar = new d();
                        this.mConstraintSet = dVar;
                        dVar.t(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.mLayoutWidget.J1(this.mOptimizationLevel);
    }

    private void markHierarchyDirty() {
        this.mDirtyHierarchy = USE_CONSTRAINTS_HELPER;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
    }

    private void setChildrenConstraints() throws IllegalAccessException, Resources.NotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        boolean zIsInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            l0.e viewWidget = getViewWidget(getChildAt(i7));
            if (viewWidget != null) {
                viewWidget.j0();
            }
        }
        if (zIsInEditMode) {
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = getChildAt(i8);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                    int iIndexOf = resourceName.indexOf(47);
                    if (iIndexOf != -1) {
                        resourceName = resourceName.substring(iIndexOf + 1);
                    }
                    getTargetWidget(childAt.getId()).p0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.mConstraintSetId != -1) {
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt2 = getChildAt(i9);
                if (childAt2.getId() == this.mConstraintSetId && (childAt2 instanceof e)) {
                    this.mConstraintSet = ((e) childAt2).getConstraintSet();
                }
            }
        }
        d dVar = this.mConstraintSet;
        if (dVar != null) {
            dVar.d(this, USE_CONSTRAINTS_HELPER);
        }
        this.mLayoutWidget.g1();
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                this.mConstraintHelpers.get(i10).m(this);
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt3 = getChildAt(i11);
            if (childAt3 instanceof g) {
                ((g) childAt3).b(this);
            }
        }
        this.mTempMapIdToWidget.clear();
        this.mTempMapIdToWidget.put(0, this.mLayoutWidget);
        this.mTempMapIdToWidget.put(getId(), this.mLayoutWidget);
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt4 = getChildAt(i12);
            this.mTempMapIdToWidget.put(childAt4.getId(), getViewWidget(childAt4));
        }
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt5 = getChildAt(i13);
            l0.e viewWidget2 = getViewWidget(childAt5);
            if (viewWidget2 != null) {
                b bVar = (b) childAt5.getLayoutParams();
                this.mLayoutWidget.a(viewWidget2);
                applyConstraintsFromLayoutParams(zIsInEditMode, childAt5, viewWidget2, bVar, this.mTempMapIdToWidget);
            }
        }
    }

    private boolean updateHierarchy() throws IllegalAccessException, Resources.NotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int childCount = getChildCount();
        boolean z7 = false;
        int i7 = 0;
        while (true) {
            if (i7 >= childCount) {
                break;
            }
            if (getChildAt(i7).isLayoutRequested()) {
                z7 = USE_CONSTRAINTS_HELPER;
                break;
            }
            i7++;
        }
        if (z7) {
            setChildrenConstraints();
        }
        return z7;
    }

    @Override
    public void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i7, layoutParams);
    }

    protected void applyConstraintsFromLayoutParams(boolean z7, View view, l0.e eVar, b bVar, SparseArray<l0.e> sparseArray) throws NumberFormatException {
        float f7;
        l0.e eVar2;
        l0.e eVar3;
        l0.e eVar4;
        l0.e eVar5;
        int i7;
        bVar.a();
        bVar.f9851o0 = false;
        eVar.W0(view.getVisibility());
        if (bVar.f9825b0) {
            eVar.G0(USE_CONSTRAINTS_HELPER);
            eVar.W0(8);
        }
        eVar.o0(view);
        if (view instanceof androidx.constraintlayout.widget.b) {
            ((androidx.constraintlayout.widget.b) view).i(eVar, this.mLayoutWidget.C1());
        }
        if (bVar.f9821Z) {
            l0.h hVar = (l0.h) eVar;
            int i8 = bVar.f9843k0;
            int i9 = bVar.f9845l0;
            float f8 = bVar.f9847m0;
            if (f8 != -1.0f) {
                hVar.l1(f8);
                return;
            } else if (i8 != -1) {
                hVar.j1(i8);
                return;
            } else {
                if (i9 != -1) {
                    hVar.k1(i9);
                    return;
                }
                return;
            }
        }
        int i10 = bVar.f9829d0;
        int i11 = bVar.f9831e0;
        int i12 = bVar.f9833f0;
        int i13 = bVar.f9835g0;
        int i14 = bVar.f9837h0;
        int i15 = bVar.f9839i0;
        float f9 = bVar.f9841j0;
        int i16 = bVar.f9846m;
        if (i16 != -1) {
            l0.e eVar6 = sparseArray.get(i16);
            if (eVar6 != null) {
                eVar.l(eVar6, bVar.f9850o, bVar.f9848n);
            }
        } else {
            if (i10 != -1) {
                l0.e eVar7 = sparseArray.get(i10);
                if (eVar7 != null) {
                    d.b bVar2 = d.b.LEFT;
                    f7 = f9;
                    eVar.Z(bVar2, eVar7, bVar2, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i14);
                } else {
                    f7 = f9;
                }
            } else {
                f7 = f9;
                if (i11 != -1 && (eVar2 = sparseArray.get(i11)) != null) {
                    eVar.Z(d.b.LEFT, eVar2, d.b.RIGHT, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i14);
                }
            }
            if (i12 != -1) {
                l0.e eVar8 = sparseArray.get(i12);
                if (eVar8 != null) {
                    eVar.Z(d.b.RIGHT, eVar8, d.b.LEFT, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i15);
                }
            } else if (i13 != -1 && (eVar3 = sparseArray.get(i13)) != null) {
                d.b bVar3 = d.b.RIGHT;
                eVar.Z(bVar3, eVar3, bVar3, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i15);
            }
            int i17 = bVar.f9836h;
            if (i17 != -1) {
                l0.e eVar9 = sparseArray.get(i17);
                if (eVar9 != null) {
                    d.b bVar4 = d.b.TOP;
                    eVar.Z(bVar4, eVar9, bVar4, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.f9857u);
                }
            } else {
                int i18 = bVar.f9838i;
                if (i18 != -1 && (eVar4 = sparseArray.get(i18)) != null) {
                    eVar.Z(d.b.TOP, eVar4, d.b.BOTTOM, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.f9857u);
                }
            }
            int i19 = bVar.f9840j;
            if (i19 != -1) {
                l0.e eVar10 = sparseArray.get(i19);
                if (eVar10 != null) {
                    eVar.Z(d.b.BOTTOM, eVar10, d.b.TOP, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.f9859w);
                }
            } else {
                int i20 = bVar.f9842k;
                if (i20 != -1 && (eVar5 = sparseArray.get(i20)) != null) {
                    d.b bVar5 = d.b.BOTTOM;
                    eVar.Z(bVar5, eVar5, bVar5, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.f9859w);
                }
            }
            int i21 = bVar.f9844l;
            if (i21 != -1) {
                View view2 = this.mChildrenByIds.get(i21);
                l0.e eVar11 = sparseArray.get(bVar.f9844l);
                if (eVar11 != null && view2 != null && (view2.getLayoutParams() instanceof b)) {
                    b bVar6 = (b) view2.getLayoutParams();
                    bVar.f9820Y = USE_CONSTRAINTS_HELPER;
                    bVar6.f9820Y = USE_CONSTRAINTS_HELPER;
                    d.b bVar7 = d.b.BASELINE;
                    eVar.o(bVar7).b(eVar11.o(bVar7), 0, -1, USE_CONSTRAINTS_HELPER);
                    eVar.x0(USE_CONSTRAINTS_HELPER);
                    bVar6.f9849n0.x0(USE_CONSTRAINTS_HELPER);
                    eVar.o(d.b.TOP).q();
                    eVar.o(d.b.BOTTOM).q();
                }
            }
            float f10 = f7;
            if (f10 >= 0.0f) {
                eVar.z0(f10);
            }
            float f11 = bVar.f9796A;
            if (f11 >= 0.0f) {
                eVar.Q0(f11);
            }
        }
        if (z7 && ((i7 = bVar.f9812Q) != -1 || bVar.f9813R != -1)) {
            eVar.O0(i7, bVar.f9813R);
        }
        if (bVar.f9818W) {
            eVar.C0(e.b.FIXED);
            eVar.X0(((ViewGroup.MarginLayoutParams) bVar).width);
            if (((ViewGroup.MarginLayoutParams) bVar).width == -2) {
                eVar.C0(e.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) bVar).width == -1) {
            if (bVar.f9815T) {
                eVar.C0(e.b.MATCH_CONSTRAINT);
            } else {
                eVar.C0(e.b.f21671v);
            }
            eVar.o(d.b.LEFT).f21571g = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            eVar.o(d.b.RIGHT).f21571g = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        } else {
            eVar.C0(e.b.MATCH_CONSTRAINT);
            eVar.X0(0);
        }
        if (bVar.f9819X) {
            eVar.T0(e.b.FIXED);
            eVar.y0(((ViewGroup.MarginLayoutParams) bVar).height);
            if (((ViewGroup.MarginLayoutParams) bVar).height == -2) {
                eVar.T0(e.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) bVar).height == -1) {
            if (bVar.f9816U) {
                eVar.T0(e.b.MATCH_CONSTRAINT);
            } else {
                eVar.T0(e.b.f21671v);
            }
            eVar.o(d.b.TOP).f21571g = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            eVar.o(d.b.BOTTOM).f21571g = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        } else {
            eVar.T0(e.b.MATCH_CONSTRAINT);
            eVar.y0(0);
        }
        eVar.q0(bVar.f9797B);
        eVar.E0(bVar.f9800E);
        eVar.V0(bVar.f9801F);
        eVar.A0(bVar.f9802G);
        eVar.R0(bVar.f9803H);
        eVar.D0(bVar.f9804I, bVar.f9806K, bVar.f9808M, bVar.f9810O);
        eVar.U0(bVar.f9805J, bVar.f9807L, bVar.f9809N, bVar.f9811P);
    }

    @Override
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    @Override
    protected void dispatchDraw(Canvas canvas) throws NumberFormatException {
        Object tag;
        int size;
        ArrayList<androidx.constraintlayout.widget.b> arrayList = this.mConstraintHelpers;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i7 = 0; i7 < size; i7++) {
                this.mConstraintHelpers.get(i7).l(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = getChildAt(i8);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i9 = Integer.parseInt(strArrSplit[0]);
                        int i10 = Integer.parseInt(strArrSplit[1]);
                        int i11 = Integer.parseInt(strArrSplit[2]);
                        int i12 = (int) ((i9 / 1080.0f) * width);
                        int i13 = (int) ((i10 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f7 = i12;
                        float f8 = i13;
                        float f9 = i12 + ((int) ((i11 / 1080.0f) * width));
                        canvas.drawLine(f7, f8, f9, f8, paint);
                        float f10 = i13 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f9, f8, f9, f10, paint);
                        canvas.drawLine(f9, f10, f7, f10, paint);
                        canvas.drawLine(f7, f10, f7, f8, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f7, f8, f9, f10, paint);
                        canvas.drawLine(f7, f10, f9, f8, paint);
                    }
                }
            }
        }
    }

    public void fillMetrics(C2511e c2511e) {
        this.mLayoutWidget.u1(c2511e);
    }

    @Override
    public void forceLayout() {
        markHierarchyDirty();
        super.forceLayout();
    }

    public Object getDesignInformation(int i7, Object obj) {
        if (i7 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> map = this.mDesignIds;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.mDesignIds.get(str);
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.w1();
    }

    public View getViewById(int i7) {
        return this.mChildrenByIds.get(i7);
    }

    public final l0.e getViewWidget(View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        return ((b) view.getLayoutParams()).f9849n0;
    }

    protected boolean isRtl() {
        if ((getContext().getApplicationInfo().flags & 4194304) == 0 || 1 != getLayoutDirection()) {
            return false;
        }
        return USE_CONSTRAINTS_HELPER;
    }

    public void loadLayoutDescription(int i7) {
        if (i7 == 0) {
            this.mConstraintLayoutSpec = null;
            return;
        }
        try {
            this.mConstraintLayoutSpec = new androidx.constraintlayout.widget.c(getContext(), this, i7);
        } catch (Resources.NotFoundException unused) {
            this.mConstraintLayoutSpec = null;
        }
    }

    @Override
    protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        View content;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            b bVar = (b) childAt.getLayoutParams();
            l0.e eVar = bVar.f9849n0;
            if ((childAt.getVisibility() != 8 || bVar.f9821Z || bVar.f9823a0 || bVar.f9827c0 || zIsInEditMode) && !bVar.f9825b0) {
                int iU = eVar.U();
                int iV = eVar.V();
                int iT = eVar.T() + iU;
                int iX = eVar.x() + iV;
                childAt.layout(iU, iV, iT, iX);
                if ((childAt instanceof g) && (content = ((g) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(iU, iV, iT, iX);
                }
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i12 = 0; i12 < size; i12++) {
                this.mConstraintHelpers.get(i12).j(this);
            }
        }
    }

    @Override
    protected void onMeasure(int i7, int i8) {
        if (!this.mDirtyHierarchy) {
            int childCount = getChildCount();
            int i9 = 0;
            while (true) {
                if (i9 >= childCount) {
                    break;
                }
                if (getChildAt(i9).isLayoutRequested()) {
                    this.mDirtyHierarchy = USE_CONSTRAINTS_HELPER;
                    break;
                }
                i9++;
            }
        }
        if (!this.mDirtyHierarchy) {
            int i10 = this.mOnMeasureWidthMeasureSpec;
            if (i10 == i7 && this.mOnMeasureHeightMeasureSpec == i8) {
                resolveMeasuredDimension(i7, i8, this.mLayoutWidget.T(), this.mLayoutWidget.x(), this.mLayoutWidget.D1(), this.mLayoutWidget.B1());
                return;
            }
            if (i10 == i7 && View.MeasureSpec.getMode(i7) == 1073741824 && View.MeasureSpec.getMode(i8) == Integer.MIN_VALUE && View.MeasureSpec.getMode(this.mOnMeasureHeightMeasureSpec) == Integer.MIN_VALUE && View.MeasureSpec.getSize(i8) >= this.mLayoutWidget.x()) {
                this.mOnMeasureWidthMeasureSpec = i7;
                this.mOnMeasureHeightMeasureSpec = i8;
                resolveMeasuredDimension(i7, i8, this.mLayoutWidget.T(), this.mLayoutWidget.x(), this.mLayoutWidget.D1(), this.mLayoutWidget.B1());
                return;
            }
        }
        this.mOnMeasureWidthMeasureSpec = i7;
        this.mOnMeasureHeightMeasureSpec = i8;
        this.mLayoutWidget.K1(isRtl());
        if (this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            if (updateHierarchy()) {
                this.mLayoutWidget.M1();
            }
        }
        resolveSystem(this.mLayoutWidget, this.mOptimizationLevel, i7, i8);
        resolveMeasuredDimension(i7, i8, this.mLayoutWidget.T(), this.mLayoutWidget.x(), this.mLayoutWidget.D1(), this.mLayoutWidget.B1());
    }

    @Override
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        l0.e viewWidget = getViewWidget(view);
        if ((view instanceof Guideline) && !(viewWidget instanceof l0.h)) {
            b bVar = (b) view.getLayoutParams();
            l0.h hVar = new l0.h();
            bVar.f9849n0 = hVar;
            bVar.f9821Z = USE_CONSTRAINTS_HELPER;
            hVar.m1(bVar.f9814S);
        }
        if (view instanceof androidx.constraintlayout.widget.b) {
            androidx.constraintlayout.widget.b bVar2 = (androidx.constraintlayout.widget.b) view;
            bVar2.n();
            ((b) view.getLayoutParams()).f9823a0 = USE_CONSTRAINTS_HELPER;
            if (!this.mConstraintHelpers.contains(bVar2)) {
                this.mConstraintHelpers.add(bVar2);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = USE_CONSTRAINTS_HELPER;
    }

    @Override
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.mChildrenByIds.remove(view.getId());
        this.mLayoutWidget.f1(getViewWidget(view));
        this.mConstraintHelpers.remove(view);
        this.mDirtyHierarchy = USE_CONSTRAINTS_HELPER;
    }

    protected void parseLayoutDescription(int i7) {
        this.mConstraintLayoutSpec = new androidx.constraintlayout.widget.c(getContext(), this, i7);
    }

    @Override
    public void removeView(View view) {
        super.removeView(view);
    }

    @Override
    public void requestLayout() {
        markHierarchyDirty();
        super.requestLayout();
    }

    protected void resolveMeasuredDimension(int i7, int i8, int i9, int i10, boolean z7, boolean z8) {
        c cVar = this.mMeasurer;
        int i11 = cVar.f9868e;
        int iResolveSizeAndState = View.resolveSizeAndState(i9 + cVar.f9867d, i7, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i10 + i11, i8, 0) & 16777215;
        int iMin = Math.min(this.mMaxWidth, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.mMaxHeight, iResolveSizeAndState2);
        if (z7) {
            iMin |= 16777216;
        }
        if (z8) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
        this.mLastMeasureWidth = iMin;
        this.mLastMeasureHeight = iMin2;
    }

    protected void resolveSystem(l0.f fVar, int i7, int i8, int i9) {
        int mode = View.MeasureSpec.getMode(i8);
        int size = View.MeasureSpec.getSize(i8);
        int mode2 = View.MeasureSpec.getMode(i9);
        int size2 = View.MeasureSpec.getSize(i9);
        int iMax = Math.max(0, getPaddingTop());
        int iMax2 = Math.max(0, getPaddingBottom());
        int i10 = iMax + iMax2;
        int paddingWidth = getPaddingWidth();
        this.mMeasurer.c(i8, i9, iMax, iMax2, paddingWidth, i10);
        int iMax3 = Math.max(0, getPaddingStart());
        int iMax4 = Math.max(0, getPaddingEnd());
        int iMax5 = (iMax3 > 0 || iMax4 > 0) ? isRtl() ? iMax4 : iMax3 : Math.max(0, getPaddingLeft());
        int i11 = size - paddingWidth;
        int i12 = size2 - i10;
        setSelfDimensionBehaviour(fVar, mode, i11, mode2, i12);
        fVar.E1(i7, mode, i11, mode2, i12, this.mLastMeasureWidth, this.mLastMeasureHeight, iMax5, iMax);
    }

    public void setConstraintSet(d dVar) {
        this.mConstraintSet = dVar;
    }

    public void setDesignInformation(int i7, Object obj, Object obj2) {
        if (i7 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.mDesignIds == null) {
                this.mDesignIds = new HashMap<>();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            Integer num = (Integer) obj2;
            num.intValue();
            this.mDesignIds.put(strSubstring, num);
        }
    }

    @Override
    public void setId(int i7) {
        this.mChildrenByIds.remove(getId());
        super.setId(i7);
        this.mChildrenByIds.put(getId(), this);
    }

    public void setMaxHeight(int i7) {
        if (i7 == this.mMaxHeight) {
            return;
        }
        this.mMaxHeight = i7;
        requestLayout();
    }

    public void setMaxWidth(int i7) {
        if (i7 == this.mMaxWidth) {
            return;
        }
        this.mMaxWidth = i7;
        requestLayout();
    }

    public void setMinHeight(int i7) {
        if (i7 == this.mMinHeight) {
            return;
        }
        this.mMinHeight = i7;
        requestLayout();
    }

    public void setMinWidth(int i7) {
        if (i7 == this.mMinWidth) {
            return;
        }
        this.mMinWidth = i7;
        requestLayout();
    }

    public void setOnConstraintsChanged(f fVar) {
        androidx.constraintlayout.widget.c cVar = this.mConstraintLayoutSpec;
        if (cVar != null) {
            cVar.c(fVar);
        }
    }

    public void setOptimizationLevel(int i7) {
        this.mOptimizationLevel = i7;
        this.mLayoutWidget.J1(i7);
    }

    protected void setSelfDimensionBehaviour(l0.f r8, int r9, int r10, int r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.setSelfDimensionBehaviour(l0.f, int, int, int, int):void");
    }

    public void setState(int i7, int i8, int i9) {
        androidx.constraintlayout.widget.c cVar = this.mConstraintLayoutSpec;
        if (cVar != null) {
            cVar.d(i7, i8, i9);
        }
    }

    @Override
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    @Override
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        super(context, attributeSet);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new l0.f();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = USE_CONSTRAINTS_HELPER;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new c(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i7) throws XmlPullParserException, IOException {
        super(context, attributeSet, i7);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new l0.f();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = USE_CONSTRAINTS_HELPER;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new c(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, i7, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i7, int i8) throws XmlPullParserException, IOException {
        super(context, attributeSet, i7, i8);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new l0.f();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = Integer.MAX_VALUE;
        this.mMaxHeight = Integer.MAX_VALUE;
        this.mDirtyHierarchy = USE_CONSTRAINTS_HELPER;
        this.mOptimizationLevel = 257;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new c(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, i7, i8);
    }

    public static class b extends ViewGroup.MarginLayoutParams {

        public float f9796A;

        public String f9797B;

        float f9798C;

        int f9799D;

        public float f9800E;

        public float f9801F;

        public int f9802G;

        public int f9803H;

        public int f9804I;

        public int f9805J;

        public int f9806K;

        public int f9807L;

        public int f9808M;

        public int f9809N;

        public float f9810O;

        public float f9811P;

        public int f9812Q;

        public int f9813R;

        public int f9814S;

        public boolean f9815T;

        public boolean f9816U;

        public String f9817V;

        boolean f9818W;

        boolean f9819X;

        boolean f9820Y;

        boolean f9821Z;

        public int f9822a;

        boolean f9823a0;

        public int f9824b;

        boolean f9825b0;

        public float f9826c;

        boolean f9827c0;

        public int f9828d;

        int f9829d0;

        public int f9830e;

        int f9831e0;

        public int f9832f;

        int f9833f0;

        public int f9834g;

        int f9835g0;

        public int f9836h;

        int f9837h0;

        public int f9838i;

        int f9839i0;

        public int f9840j;

        float f9841j0;

        public int f9842k;

        int f9843k0;

        public int f9844l;

        int f9845l0;

        public int f9846m;

        float f9847m0;

        public int f9848n;

        l0.e f9849n0;

        public float f9850o;

        public boolean f9851o0;

        public int f9852p;

        public int f9853q;

        public int f9854r;

        public int f9855s;

        public int f9856t;

        public int f9857u;

        public int f9858v;

        public int f9859w;

        public int f9860x;

        public int f9861y;

        public float f9862z;

        private static class a {

            public static final SparseIntArray f9863a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f9863a = sparseIntArray;
                sparseIntArray.append(i.f10218m2, 8);
                sparseIntArray.append(i.f10224n2, 9);
                sparseIntArray.append(i.f10235p2, 10);
                sparseIntArray.append(i.f10241q2, 11);
                sparseIntArray.append(i.f10277w2, 12);
                sparseIntArray.append(i.f10271v2, 13);
                sparseIntArray.append(i.U1, 14);
                sparseIntArray.append(i.T1, 15);
                sparseIntArray.append(i.R1, 16);
                sparseIntArray.append(i.V1, 2);
                sparseIntArray.append(i.X1, 3);
                sparseIntArray.append(i.W1, 4);
                sparseIntArray.append(i.f10055E2, 49);
                sparseIntArray.append(i.F2, 50);
                sparseIntArray.append(i.b2, 5);
                sparseIntArray.append(i.c2, 6);
                sparseIntArray.append(i.f10158d2, 7);
                sparseIntArray.append(i.f10147b1, 1);
                sparseIntArray.append(i.f10247r2, 17);
                sparseIntArray.append(i.f10253s2, 18);
                sparseIntArray.append(i.a2, 19);
                sparseIntArray.append(i.Z1, 20);
                sparseIntArray.append(i.I2, 21);
                sparseIntArray.append(i.L2, 22);
                sparseIntArray.append(i.f10076J2, 23);
                sparseIntArray.append(i.G2, 24);
                sparseIntArray.append(i.K2, 25);
                sparseIntArray.append(i.H2, 26);
                sparseIntArray.append(i.f10193i2, 29);
                sparseIntArray.append(i.f10283x2, 30);
                sparseIntArray.append(i.Y1, 44);
                sparseIntArray.append(i.f10206k2, 45);
                sparseIntArray.append(i.f10296z2, 46);
                sparseIntArray.append(i.f10200j2, 47);
                sparseIntArray.append(i.f10290y2, 48);
                sparseIntArray.append(i.P1, 27);
                sparseIntArray.append(i.O1, 28);
                sparseIntArray.append(i.f10033A2, 31);
                sparseIntArray.append(i.f10165e2, 32);
                sparseIntArray.append(i.f10045C2, 33);
                sparseIntArray.append(i.f10039B2, 34);
                sparseIntArray.append(i.f10050D2, 35);
                sparseIntArray.append(i.f10179g2, 36);
                sparseIntArray.append(i.f10172f2, 37);
                sparseIntArray.append(i.f10186h2, 38);
                sparseIntArray.append(i.f10212l2, 39);
                sparseIntArray.append(i.f10265u2, 40);
                sparseIntArray.append(i.o2, 41);
                sparseIntArray.append(i.S1, 42);
                sparseIntArray.append(i.Q1, 43);
                sparseIntArray.append(i.f10259t2, 51);
            }
        }

        public b(Context context, AttributeSet attributeSet) throws NumberFormatException {
            int i7;
            super(context, attributeSet);
            this.f9822a = -1;
            this.f9824b = -1;
            this.f9826c = -1.0f;
            this.f9828d = -1;
            this.f9830e = -1;
            this.f9832f = -1;
            this.f9834g = -1;
            this.f9836h = -1;
            this.f9838i = -1;
            this.f9840j = -1;
            this.f9842k = -1;
            this.f9844l = -1;
            this.f9846m = -1;
            this.f9848n = 0;
            this.f9850o = 0.0f;
            this.f9852p = -1;
            this.f9853q = -1;
            this.f9854r = -1;
            this.f9855s = -1;
            this.f9856t = -1;
            this.f9857u = -1;
            this.f9858v = -1;
            this.f9859w = -1;
            this.f9860x = -1;
            this.f9861y = -1;
            this.f9862z = 0.5f;
            this.f9796A = 0.5f;
            this.f9797B = null;
            this.f9798C = 0.0f;
            this.f9799D = 1;
            this.f9800E = -1.0f;
            this.f9801F = -1.0f;
            this.f9802G = 0;
            this.f9803H = 0;
            this.f9804I = 0;
            this.f9805J = 0;
            this.f9806K = 0;
            this.f9807L = 0;
            this.f9808M = 0;
            this.f9809N = 0;
            this.f9810O = 1.0f;
            this.f9811P = 1.0f;
            this.f9812Q = -1;
            this.f9813R = -1;
            this.f9814S = -1;
            this.f9815T = false;
            this.f9816U = false;
            this.f9817V = null;
            this.f9818W = ConstraintLayout.USE_CONSTRAINTS_HELPER;
            this.f9819X = ConstraintLayout.USE_CONSTRAINTS_HELPER;
            this.f9820Y = false;
            this.f9821Z = false;
            this.f9823a0 = false;
            this.f9825b0 = false;
            this.f9827c0 = false;
            this.f9829d0 = -1;
            this.f9831e0 = -1;
            this.f9833f0 = -1;
            this.f9835g0 = -1;
            this.f9837h0 = -1;
            this.f9839i0 = -1;
            this.f9841j0 = 0.5f;
            this.f9849n0 = new l0.e();
            this.f9851o0 = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f10142a1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i8);
                int i9 = a.f9863a.get(index);
                switch (i9) {
                    case 1:
                        this.f9814S = typedArrayObtainStyledAttributes.getInt(index, this.f9814S);
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f9846m);
                        this.f9846m = resourceId;
                        if (resourceId == -1) {
                            this.f9846m = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.f9848n = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f9848n);
                        break;
                    case 4:
                        float f7 = typedArrayObtainStyledAttributes.getFloat(index, this.f9850o) % 360.0f;
                        this.f9850o = f7;
                        if (f7 < 0.0f) {
                            this.f9850o = (360.0f - f7) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.f9822a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f9822a);
                        break;
                    case 6:
                        this.f9824b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f9824b);
                        break;
                    case 7:
                        this.f9826c = typedArrayObtainStyledAttributes.getFloat(index, this.f9826c);
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f9828d);
                        this.f9828d = resourceId2;
                        if (resourceId2 == -1) {
                            this.f9828d = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f9830e);
                        this.f9830e = resourceId3;
                        if (resourceId3 == -1) {
                            this.f9830e = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f9832f);
                        this.f9832f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f9832f = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.f9834g);
                        this.f9834g = resourceId5;
                        if (resourceId5 == -1) {
                            this.f9834g = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.f9836h);
                        this.f9836h = resourceId6;
                        if (resourceId6 == -1) {
                            this.f9836h = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.f9838i);
                        this.f9838i = resourceId7;
                        if (resourceId7 == -1) {
                            this.f9838i = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.f9840j);
                        this.f9840j = resourceId8;
                        if (resourceId8 == -1) {
                            this.f9840j = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.f9842k);
                        this.f9842k = resourceId9;
                        if (resourceId9 == -1) {
                            this.f9842k = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.f9844l);
                        this.f9844l = resourceId10;
                        if (resourceId10 == -1) {
                            this.f9844l = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.f9852p);
                        this.f9852p = resourceId11;
                        if (resourceId11 == -1) {
                            this.f9852p = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.f9853q);
                        this.f9853q = resourceId12;
                        if (resourceId12 == -1) {
                            this.f9853q = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.f9854r);
                        this.f9854r = resourceId13;
                        if (resourceId13 == -1) {
                            this.f9854r = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.f9855s);
                        this.f9855s = resourceId14;
                        if (resourceId14 == -1) {
                            this.f9855s = typedArrayObtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.f9856t = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f9856t);
                        break;
                    case 22:
                        this.f9857u = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f9857u);
                        break;
                    case 23:
                        this.f9858v = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f9858v);
                        break;
                    case 24:
                        this.f9859w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f9859w);
                        break;
                    case 25:
                        this.f9860x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f9860x);
                        break;
                    case 26:
                        this.f9861y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f9861y);
                        break;
                    case 27:
                        this.f9815T = typedArrayObtainStyledAttributes.getBoolean(index, this.f9815T);
                        break;
                    case 28:
                        this.f9816U = typedArrayObtainStyledAttributes.getBoolean(index, this.f9816U);
                        break;
                    case 29:
                        this.f9862z = typedArrayObtainStyledAttributes.getFloat(index, this.f9862z);
                        break;
                    case 30:
                        this.f9796A = typedArrayObtainStyledAttributes.getFloat(index, this.f9796A);
                        break;
                    case 31:
                        int i10 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.f9804I = i10;
                        if (i10 == 1) {
                            Log.e(ConstraintLayout.TAG, "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 32:
                        int i11 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.f9805J = i11;
                        if (i11 == 1) {
                            Log.e(ConstraintLayout.TAG, "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 33:
                        try {
                            this.f9806K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f9806K);
                            break;
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f9806K) == -2) {
                                this.f9806K = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.f9808M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f9808M);
                            break;
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f9808M) == -2) {
                                this.f9808M = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.f9810O = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f9810O));
                        this.f9804I = 2;
                        break;
                    case 36:
                        try {
                            this.f9807L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f9807L);
                            break;
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f9807L) == -2) {
                                this.f9807L = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.f9809N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f9809N);
                            break;
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f9809N) == -2) {
                                this.f9809N = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.f9811P = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f9811P));
                        this.f9805J = 2;
                        break;
                    default:
                        switch (i9) {
                            case 44:
                                String string = typedArrayObtainStyledAttributes.getString(index);
                                this.f9797B = string;
                                this.f9798C = Float.NaN;
                                this.f9799D = -1;
                                if (string != null) {
                                    int length = string.length();
                                    int iIndexOf = this.f9797B.indexOf(44);
                                    if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                                        i7 = 0;
                                    } else {
                                        String strSubstring = this.f9797B.substring(0, iIndexOf);
                                        if (strSubstring.equalsIgnoreCase("W")) {
                                            this.f9799D = 0;
                                        } else if (strSubstring.equalsIgnoreCase("H")) {
                                            this.f9799D = 1;
                                        }
                                        i7 = iIndexOf + 1;
                                    }
                                    int iIndexOf2 = this.f9797B.indexOf(58);
                                    if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                                        String strSubstring2 = this.f9797B.substring(i7);
                                        if (strSubstring2.length() > 0) {
                                            this.f9798C = Float.parseFloat(strSubstring2);
                                            break;
                                        } else {
                                            break;
                                        }
                                    } else {
                                        String strSubstring3 = this.f9797B.substring(i7, iIndexOf2);
                                        String strSubstring4 = this.f9797B.substring(iIndexOf2 + 1);
                                        if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                                            break;
                                        } else {
                                            try {
                                                float f8 = Float.parseFloat(strSubstring3);
                                                float f9 = Float.parseFloat(strSubstring4);
                                                if (f8 <= 0.0f || f9 <= 0.0f) {
                                                    break;
                                                } else if (this.f9799D == 1) {
                                                    this.f9798C = Math.abs(f9 / f8);
                                                    break;
                                                } else {
                                                    this.f9798C = Math.abs(f8 / f9);
                                                    break;
                                                }
                                            } catch (NumberFormatException unused5) {
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    break;
                                }
                                break;
                            case 45:
                                this.f9800E = typedArrayObtainStyledAttributes.getFloat(index, this.f9800E);
                                break;
                            case 46:
                                this.f9801F = typedArrayObtainStyledAttributes.getFloat(index, this.f9801F);
                                break;
                            case 47:
                                this.f9802G = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f9803H = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.f9812Q = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f9812Q);
                                break;
                            case 50:
                                this.f9813R = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f9813R);
                                break;
                            case 51:
                                this.f9817V = typedArrayObtainStyledAttributes.getString(index);
                                break;
                        }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            a();
        }

        public void a() {
            this.f9821Z = false;
            this.f9818W = ConstraintLayout.USE_CONSTRAINTS_HELPER;
            this.f9819X = ConstraintLayout.USE_CONSTRAINTS_HELPER;
            int i7 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i7 == -2 && this.f9815T) {
                this.f9818W = false;
                if (this.f9804I == 0) {
                    this.f9804I = 1;
                }
            }
            int i8 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i8 == -2 && this.f9816U) {
                this.f9819X = false;
                if (this.f9805J == 0) {
                    this.f9805J = 1;
                }
            }
            if (i7 == 0 || i7 == -1) {
                this.f9818W = false;
                if (i7 == 0 && this.f9804I == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f9815T = ConstraintLayout.USE_CONSTRAINTS_HELPER;
                }
            }
            if (i8 == 0 || i8 == -1) {
                this.f9819X = false;
                if (i8 == 0 && this.f9805J == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f9816U = ConstraintLayout.USE_CONSTRAINTS_HELPER;
                }
            }
            if (this.f9826c == -1.0f && this.f9822a == -1 && this.f9824b == -1) {
                return;
            }
            this.f9821Z = ConstraintLayout.USE_CONSTRAINTS_HELPER;
            this.f9818W = ConstraintLayout.USE_CONSTRAINTS_HELPER;
            this.f9819X = ConstraintLayout.USE_CONSTRAINTS_HELPER;
            if (!(this.f9849n0 instanceof l0.h)) {
                this.f9849n0 = new l0.h();
            }
            ((l0.h) this.f9849n0).m1(this.f9814S);
        }

        @Override
        public void resolveLayoutDirection(int r10) {
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.resolveLayoutDirection(int):void");
        }

        public b(int i7, int i8) {
            super(i7, i8);
            this.f9822a = -1;
            this.f9824b = -1;
            this.f9826c = -1.0f;
            this.f9828d = -1;
            this.f9830e = -1;
            this.f9832f = -1;
            this.f9834g = -1;
            this.f9836h = -1;
            this.f9838i = -1;
            this.f9840j = -1;
            this.f9842k = -1;
            this.f9844l = -1;
            this.f9846m = -1;
            this.f9848n = 0;
            this.f9850o = 0.0f;
            this.f9852p = -1;
            this.f9853q = -1;
            this.f9854r = -1;
            this.f9855s = -1;
            this.f9856t = -1;
            this.f9857u = -1;
            this.f9858v = -1;
            this.f9859w = -1;
            this.f9860x = -1;
            this.f9861y = -1;
            this.f9862z = 0.5f;
            this.f9796A = 0.5f;
            this.f9797B = null;
            this.f9798C = 0.0f;
            this.f9799D = 1;
            this.f9800E = -1.0f;
            this.f9801F = -1.0f;
            this.f9802G = 0;
            this.f9803H = 0;
            this.f9804I = 0;
            this.f9805J = 0;
            this.f9806K = 0;
            this.f9807L = 0;
            this.f9808M = 0;
            this.f9809N = 0;
            this.f9810O = 1.0f;
            this.f9811P = 1.0f;
            this.f9812Q = -1;
            this.f9813R = -1;
            this.f9814S = -1;
            this.f9815T = false;
            this.f9816U = false;
            this.f9817V = null;
            this.f9818W = ConstraintLayout.USE_CONSTRAINTS_HELPER;
            this.f9819X = ConstraintLayout.USE_CONSTRAINTS_HELPER;
            this.f9820Y = false;
            this.f9821Z = false;
            this.f9823a0 = false;
            this.f9825b0 = false;
            this.f9827c0 = false;
            this.f9829d0 = -1;
            this.f9831e0 = -1;
            this.f9833f0 = -1;
            this.f9835g0 = -1;
            this.f9837h0 = -1;
            this.f9839i0 = -1;
            this.f9841j0 = 0.5f;
            this.f9849n0 = new l0.e();
            this.f9851o0 = false;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f9822a = -1;
            this.f9824b = -1;
            this.f9826c = -1.0f;
            this.f9828d = -1;
            this.f9830e = -1;
            this.f9832f = -1;
            this.f9834g = -1;
            this.f9836h = -1;
            this.f9838i = -1;
            this.f9840j = -1;
            this.f9842k = -1;
            this.f9844l = -1;
            this.f9846m = -1;
            this.f9848n = 0;
            this.f9850o = 0.0f;
            this.f9852p = -1;
            this.f9853q = -1;
            this.f9854r = -1;
            this.f9855s = -1;
            this.f9856t = -1;
            this.f9857u = -1;
            this.f9858v = -1;
            this.f9859w = -1;
            this.f9860x = -1;
            this.f9861y = -1;
            this.f9862z = 0.5f;
            this.f9796A = 0.5f;
            this.f9797B = null;
            this.f9798C = 0.0f;
            this.f9799D = 1;
            this.f9800E = -1.0f;
            this.f9801F = -1.0f;
            this.f9802G = 0;
            this.f9803H = 0;
            this.f9804I = 0;
            this.f9805J = 0;
            this.f9806K = 0;
            this.f9807L = 0;
            this.f9808M = 0;
            this.f9809N = 0;
            this.f9810O = 1.0f;
            this.f9811P = 1.0f;
            this.f9812Q = -1;
            this.f9813R = -1;
            this.f9814S = -1;
            this.f9815T = false;
            this.f9816U = false;
            this.f9817V = null;
            this.f9818W = ConstraintLayout.USE_CONSTRAINTS_HELPER;
            this.f9819X = ConstraintLayout.USE_CONSTRAINTS_HELPER;
            this.f9820Y = false;
            this.f9821Z = false;
            this.f9823a0 = false;
            this.f9825b0 = false;
            this.f9827c0 = false;
            this.f9829d0 = -1;
            this.f9831e0 = -1;
            this.f9833f0 = -1;
            this.f9835g0 = -1;
            this.f9837h0 = -1;
            this.f9839i0 = -1;
            this.f9841j0 = 0.5f;
            this.f9849n0 = new l0.e();
            this.f9851o0 = false;
        }
    }
}
