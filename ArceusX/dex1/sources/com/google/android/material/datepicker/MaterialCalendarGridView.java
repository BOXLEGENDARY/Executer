package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.view.C1605a;
import androidx.core.view.Z;
import c4.C1750f;
import com.google.android.material.internal.s;
import java.util.Calendar;
import java.util.Iterator;
import x0.C2986c;
import y0.C3019t;

final class MaterialCalendarGridView extends GridView {

    private final Calendar f17738d;

    private final boolean f17739e;

    class a extends C1605a {
        a() {
        }

        @Override
        public void g(View view, C3019t c3019t) {
            super.g(view, c3019t);
            c3019t.g0(null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a(int i7, Rect rect) {
        if (i7 == 33) {
            setSelection(getAdapter().m());
        } else if (i7 == 130) {
            setSelection(getAdapter().b());
        } else {
            super.onFocusChanged(true, i7, rect);
        }
    }

    private View c(int i7) {
        return getChildAt(i7 - getFirstVisiblePosition());
    }

    private static int d(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    private static boolean e(Long l7, Long l8, Long l9, Long l10) {
        return l7 == null || l8 == null || l9 == null || l10 == null || l9.longValue() > l8.longValue() || l10.longValue() < l7.longValue();
    }

    @Override
    public j getAdapter() {
        return (j) super.getAdapter();
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    @Override
    protected final void onDraw(Canvas canvas) {
        int iA;
        int iD;
        int iA2;
        int iD2;
        int width;
        int i7;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        j adapter = getAdapter();
        DateSelector<?> dateSelector = adapter.f17853e;
        b bVar = adapter.f17855v;
        int iMax = Math.max(adapter.b(), getFirstVisiblePosition());
        int iMin = Math.min(adapter.m(), getLastVisiblePosition());
        Long item = adapter.getItem(iMax);
        Long item2 = adapter.getItem(iMin);
        Iterator<C2986c<Long, Long>> it = dateSelector.A().iterator();
        while (it.hasNext()) {
            C2986c<Long, Long> next = it.next();
            Long l7 = next.f24317a;
            if (l7 == null) {
                materialCalendarGridView = this;
            } else if (next.f24318b != null) {
                Long l8 = l7;
                long jLongValue = l8.longValue();
                Long l9 = next.f24318b;
                long jLongValue2 = l9.longValue();
                if (!e(item, item2, l8, l9)) {
                    boolean zH = s.h(this);
                    if (jLongValue < item.longValue()) {
                        iD = adapter.h(iMax) ? 0 : !zH ? materialCalendarGridView.c(iMax - 1).getRight() : materialCalendarGridView.c(iMax - 1).getLeft();
                        iA = iMax;
                    } else {
                        materialCalendarGridView.f17738d.setTimeInMillis(jLongValue);
                        iA = adapter.a(materialCalendarGridView.f17738d.get(5));
                        iD = d(materialCalendarGridView.c(iA));
                    }
                    if (jLongValue2 > item2.longValue()) {
                        iD2 = adapter.i(iMin) ? getWidth() : !zH ? materialCalendarGridView.c(iMin).getRight() : materialCalendarGridView.c(iMin).getLeft();
                        iA2 = iMin;
                    } else {
                        materialCalendarGridView.f17738d.setTimeInMillis(jLongValue2);
                        iA2 = adapter.a(materialCalendarGridView.f17738d.get(5));
                        iD2 = d(materialCalendarGridView.c(iA2));
                    }
                    int itemId = (int) adapter.getItemId(iA);
                    int i8 = iMax;
                    int i9 = iMin;
                    int itemId2 = (int) adapter.getItemId(iA2);
                    while (itemId <= itemId2) {
                        int numColumns = getNumColumns() * itemId;
                        int numColumns2 = (numColumns + getNumColumns()) - 1;
                        View viewC = materialCalendarGridView.c(numColumns);
                        int top = viewC.getTop() + bVar.f17754a.c();
                        j jVar = adapter;
                        int bottom = viewC.getBottom() - bVar.f17754a.b();
                        if (zH) {
                            int i10 = iA2 > numColumns2 ? 0 : iD2;
                            width = numColumns > iA ? getWidth() : iD;
                            i7 = i10;
                        } else {
                            i7 = numColumns > iA ? 0 : iD;
                            width = iA2 > numColumns2 ? getWidth() : iD2;
                        }
                        canvas.drawRect(i7, top, width, bottom, bVar.f17761h);
                        itemId++;
                        materialCalendarGridView = this;
                        it = it;
                        adapter = jVar;
                    }
                    materialCalendarGridView = this;
                    iMax = i8;
                    iMin = i9;
                }
            }
        }
    }

    @Override
    protected void onFocusChanged(boolean z7, int i7, Rect rect) {
        if (z7) {
            a(i7, rect);
        } else {
            super.onFocusChanged(false, i7, rect);
        }
    }

    @Override
    public boolean onKeyDown(int i7, KeyEvent keyEvent) {
        if (!super.onKeyDown(i7, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().b()) {
            return true;
        }
        if (19 != i7) {
            return false;
        }
        setSelection(getAdapter().b());
        return true;
    }

    @Override
    public void onMeasure(int i7, int i8) {
        if (!this.f17739e) {
            super.onMeasure(i7, i8);
            return;
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override
    public void setSelection(int i7) {
        if (i7 < getAdapter().b()) {
            super.setSelection(getAdapter().b());
        } else {
            super.setSelection(i7);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f17738d = p.i();
        if (g.H(getContext())) {
            setNextFocusLeftId(C1750f.f12871a);
            setNextFocusRightId(C1750f.f12874d);
        }
        this.f17739e = g.J(getContext());
        Z.n0(this, new a());
    }

    @Override
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof j)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), j.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
