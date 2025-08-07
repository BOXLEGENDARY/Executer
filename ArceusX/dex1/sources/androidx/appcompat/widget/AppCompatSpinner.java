package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.appcompat.app.c;
import androidx.core.view.Z;
import g.C2447a;
import h.C2473a;
import java.lang.reflect.InvocationTargetException;
import w7.Jld.EZYiRMRTxKdo;
import x0.C2985b;

public class AppCompatSpinner extends Spinner {
    private static final int[] ATTRS_ANDROID_SPINNERMODE = {R.attr.spinnerMode};
    private static final int MAX_ITEMS_MEASURED = 15;
    private static final int MODE_DIALOG = 0;
    private static final int MODE_DROPDOWN = 1;
    private static final int MODE_THEME = -1;
    private static final String TAG = "AppCompatSpinner";
    private final C1598c mBackgroundTintHelper;
    int mDropDownWidth;
    private ForwardingListener mForwardingListener;
    private i mPopup;
    private final Context mPopupContext;
    private final boolean mPopupSet;
    private SpinnerAdapter mTempAdapter;
    final Rect mTempRect;

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        boolean f9149d;

        class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override
            public SavedState[] newArray(int i7) {
                return new SavedState[i7];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeByte(this.f9149d ? (byte) 1 : (byte) 0);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f9149d = parcel.readByte() != 0;
        }
    }

    class a extends ForwardingListener {

        final h f9150d;

        a(View view, h hVar) {
            super(view);
            this.f9150d = hVar;
        }

        @Override
        public androidx.appcompat.view.menu.p getPopup() {
            return this.f9150d;
        }

        @Override
        public boolean onForwardingStarted() {
            if (AppCompatSpinner.this.getInternalPopup().isShowing()) {
                return true;
            }
            AppCompatSpinner.this.showPopup();
            return true;
        }
    }

    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override
        public void onGlobalLayout() {
            if (!AppCompatSpinner.this.getInternalPopup().isShowing()) {
                AppCompatSpinner.this.showPopup();
            }
            ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                c.a(viewTreeObserver, this);
            }
        }
    }

    private static final class c {
        static void a(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    private static final class d {
        static int a(View view) {
            return view.getTextAlignment();
        }

        static int b(View view) {
            return view.getTextDirection();
        }

        static void c(View view, int i7) {
            view.setTextAlignment(i7);
        }

        static void d(View view, int i7) {
            view.setTextDirection(i7);
        }
    }

    private static final class e {
        static void a(android.widget.ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (C2985b.a(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                return;
            }
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }

    class f implements i, DialogInterface.OnClickListener {

        androidx.appcompat.app.c f9153d;

        private ListAdapter f9154e;

        private CharSequence f9155i;

        f() {
        }

        @Override
        public CharSequence a() {
            return this.f9155i;
        }

        @Override
        public void b(CharSequence charSequence) {
            this.f9155i = charSequence;
        }

        @Override
        public void c(int i7) {
            Log.e(EZYiRMRTxKdo.CHxWbUcvnPenke, "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override
        public void d(int i7, int i8) {
            if (this.f9154e == null) {
                return;
            }
            c.a aVar = new c.a(AppCompatSpinner.this.getPopupContext());
            CharSequence charSequence = this.f9155i;
            if (charSequence != null) {
                aVar.p(charSequence);
            }
            androidx.appcompat.app.c cVarA = aVar.n(this.f9154e, AppCompatSpinner.this.getSelectedItemPosition(), this).a();
            this.f9153d = cVarA;
            ListView listViewJ = cVarA.j();
            d.d(listViewJ, i7);
            d.c(listViewJ, i8);
            this.f9153d.show();
        }

        @Override
        public void dismiss() {
            androidx.appcompat.app.c cVar = this.f9153d;
            if (cVar != null) {
                cVar.dismiss();
                this.f9153d = null;
            }
        }

        @Override
        public Drawable getBackground() {
            return null;
        }

        @Override
        public int getHorizontalOffset() {
            return 0;
        }

        @Override
        public int getVerticalOffset() {
            return 0;
        }

        @Override
        public boolean isShowing() {
            androidx.appcompat.app.c cVar = this.f9153d;
            if (cVar != null) {
                return cVar.isShowing();
            }
            return false;
        }

        @Override
        public void onClick(DialogInterface dialogInterface, int i7) {
            AppCompatSpinner.this.setSelection(i7);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick(null, i7, this.f9154e.getItemId(i7));
            }
            dismiss();
        }

        @Override
        public void setAdapter(ListAdapter listAdapter) {
            this.f9154e = listAdapter;
        }

        @Override
        public void setBackgroundDrawable(Drawable drawable) {
            Log.e(AppCompatSpinner.TAG, "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override
        public void setHorizontalOffset(int i7) {
            Log.e(AppCompatSpinner.TAG, "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override
        public void setVerticalOffset(int i7) {
            Log.e(AppCompatSpinner.TAG, "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }
    }

    private static class g implements ListAdapter, SpinnerAdapter {

        private SpinnerAdapter f9157d;

        private ListAdapter f9158e;

        public g(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f9157d = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f9158e = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (spinnerAdapter instanceof android.widget.ThemedSpinnerAdapter) {
                    e.a((android.widget.ThemedSpinnerAdapter) spinnerAdapter, theme);
                } else if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter.getDropDownViewTheme() == null) {
                        themedSpinnerAdapter.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f9158e;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f9157d;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override
        public View getDropDownView(int i7, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f9157d;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i7, view, viewGroup);
        }

        @Override
        public Object getItem(int i7) {
            SpinnerAdapter spinnerAdapter = this.f9157d;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i7);
        }

        @Override
        public long getItemId(int i7) {
            SpinnerAdapter spinnerAdapter = this.f9157d;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i7);
        }

        @Override
        public int getItemViewType(int i7) {
            return 0;
        }

        @Override
        public View getView(int i7, View view, ViewGroup viewGroup) {
            return getDropDownView(i7, view, viewGroup);
        }

        @Override
        public int getViewTypeCount() {
            return 1;
        }

        @Override
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f9157d;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override
        public boolean isEnabled(int i7) {
            ListAdapter listAdapter = this.f9158e;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i7);
            }
            return true;
        }

        @Override
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f9157d;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f9157d;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    class h extends ListPopupWindow implements i {

        private CharSequence f9159d;

        ListAdapter f9160e;

        private final Rect f9161i;

        private int f9162v;

        class a implements AdapterView.OnItemClickListener {

            final AppCompatSpinner f9164d;

            a(AppCompatSpinner appCompatSpinner) {
                this.f9164d = appCompatSpinner;
            }

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i7, long j7) {
                AppCompatSpinner.this.setSelection(i7);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    h hVar = h.this;
                    AppCompatSpinner.this.performItemClick(view, i7, hVar.f9160e.getItemId(i7));
                }
                h.this.dismiss();
            }
        }

        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            @Override
            public void onGlobalLayout() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                h hVar = h.this;
                if (!hVar.h(AppCompatSpinner.this)) {
                    h.this.dismiss();
                } else {
                    h.this.f();
                    h.super.show();
                }
            }
        }

        class c implements PopupWindow.OnDismissListener {

            final ViewTreeObserver.OnGlobalLayoutListener f9167d;

            c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f9167d = onGlobalLayoutListener;
            }

            @Override
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f9167d);
                }
            }
        }

        public h(Context context, AttributeSet attributeSet, int i7) {
            super(context, attributeSet, i7);
            this.f9161i = new Rect();
            setAnchorView(AppCompatSpinner.this);
            setModal(true);
            setPromptPosition(0);
            setOnItemClickListener(new a(AppCompatSpinner.this));
        }

        @Override
        public CharSequence a() {
            return this.f9159d;
        }

        @Override
        public void b(CharSequence charSequence) {
            this.f9159d = charSequence;
        }

        @Override
        public void c(int i7) {
            this.f9162v = i7;
        }

        @Override
        public void d(int i7, int i8) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            ViewTreeObserver viewTreeObserver;
            boolean zIsShowing = isShowing();
            f();
            setInputMethodMode(2);
            super.show();
            ListView listView = getListView();
            listView.setChoiceMode(1);
            d.d(listView, i7);
            d.c(listView, i8);
            setSelection(AppCompatSpinner.this.getSelectedItemPosition());
            if (zIsShowing || (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            setOnDismissListener(new c(bVar));
        }

        void f() {
            int i7;
            Drawable background = getBackground();
            if (background != null) {
                background.getPadding(AppCompatSpinner.this.mTempRect);
                i7 = ViewUtils.isLayoutRtl(AppCompatSpinner.this) ? AppCompatSpinner.this.mTempRect.right : -AppCompatSpinner.this.mTempRect.left;
            } else {
                Rect rect = AppCompatSpinner.this.mTempRect;
                rect.right = 0;
                rect.left = 0;
                i7 = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int i8 = appCompatSpinner.mDropDownWidth;
            if (i8 == -2) {
                int iCompatMeasureContentWidth = appCompatSpinner.compatMeasureContentWidth((SpinnerAdapter) this.f9160e, getBackground());
                int i9 = AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = AppCompatSpinner.this.mTempRect;
                int i10 = (i9 - rect2.left) - rect2.right;
                if (iCompatMeasureContentWidth > i10) {
                    iCompatMeasureContentWidth = i10;
                }
                setContentWidth(Math.max(iCompatMeasureContentWidth, (width - paddingLeft) - paddingRight));
            } else if (i8 == -1) {
                setContentWidth((width - paddingLeft) - paddingRight);
            } else {
                setContentWidth(i8);
            }
            setHorizontalOffset(ViewUtils.isLayoutRtl(AppCompatSpinner.this) ? i7 + (((width - paddingRight) - getWidth()) - g()) : i7 + paddingLeft + g());
        }

        public int g() {
            return this.f9162v;
        }

        boolean h(View view) {
            return Z.Q(view) && view.getGlobalVisibleRect(this.f9161i);
        }

        @Override
        public void setAdapter(ListAdapter listAdapter) {
            super.setAdapter(listAdapter);
            this.f9160e = listAdapter;
        }
    }

    interface i {
        CharSequence a();

        void b(CharSequence charSequence);

        void c(int i7);

        void d(int i7, int i8);

        void dismiss();

        Drawable getBackground();

        int getHorizontalOffset();

        int getVerticalOffset();

        boolean isShowing();

        void setAdapter(ListAdapter listAdapter);

        void setBackgroundDrawable(Drawable drawable);

        void setHorizontalOffset(int i7);

        void setVerticalOffset(int i7);
    }

    public AppCompatSpinner(Context context) {
        this(context, (AttributeSet) null);
    }

    int compatMeasureContentWidth(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i7 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i7) {
                view = null;
                i7 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        drawable.getPadding(this.mTempRect);
        Rect rect = this.mTempRect;
        return iMax2 + rect.left + rect.right;
    }

    @Override
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C1598c c1598c = this.mBackgroundTintHelper;
        if (c1598c != null) {
            c1598c.b();
        }
    }

    @Override
    public int getDropDownHorizontalOffset() {
        i iVar = this.mPopup;
        return iVar != null ? iVar.getHorizontalOffset() : super.getDropDownHorizontalOffset();
    }

    @Override
    public int getDropDownVerticalOffset() {
        i iVar = this.mPopup;
        return iVar != null ? iVar.getVerticalOffset() : super.getDropDownVerticalOffset();
    }

    @Override
    public int getDropDownWidth() {
        return this.mPopup != null ? this.mDropDownWidth : super.getDropDownWidth();
    }

    final i getInternalPopup() {
        return this.mPopup;
    }

    @Override
    public Drawable getPopupBackground() {
        i iVar = this.mPopup;
        return iVar != null ? iVar.getBackground() : super.getPopupBackground();
    }

    @Override
    public Context getPopupContext() {
        return this.mPopupContext;
    }

    @Override
    public CharSequence getPrompt() {
        i iVar = this.mPopup;
        return iVar != null ? iVar.a() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1598c c1598c = this.mBackgroundTintHelper;
        if (c1598c != null) {
            return c1598c.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1598c c1598c = this.mBackgroundTintHelper;
        if (c1598c != null) {
            return c1598c.d();
        }
        return null;
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i iVar = this.mPopup;
        if (iVar == null || !iVar.isShowing()) {
            return;
        }
        this.mPopup.dismiss();
    }

    @Override
    protected void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        if (this.mPopup == null || View.MeasureSpec.getMode(i7) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), compatMeasureContentWidth(getAdapter(), getBackground())), View.MeasureSpec.getSize(i7)), getMeasuredHeight());
    }

    @Override
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (!savedState.f9149d || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new b());
    }

    @Override
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        i iVar = this.mPopup;
        savedState.f9149d = iVar != null && iVar.isShowing();
        return savedState;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ForwardingListener forwardingListener = this.mForwardingListener;
        if (forwardingListener == null || !forwardingListener.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override
    public boolean performClick() {
        i iVar = this.mPopup;
        if (iVar == null) {
            return super.performClick();
        }
        if (iVar.isShowing()) {
            return true;
        }
        showPopup();
        return true;
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1598c c1598c = this.mBackgroundTintHelper;
        if (c1598c != null) {
            c1598c.f(drawable);
        }
    }

    @Override
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        C1598c c1598c = this.mBackgroundTintHelper;
        if (c1598c != null) {
            c1598c.g(i7);
        }
    }

    @Override
    public void setDropDownHorizontalOffset(int i7) {
        i iVar = this.mPopup;
        if (iVar == null) {
            super.setDropDownHorizontalOffset(i7);
        } else {
            iVar.c(i7);
            this.mPopup.setHorizontalOffset(i7);
        }
    }

    @Override
    public void setDropDownVerticalOffset(int i7) {
        i iVar = this.mPopup;
        if (iVar != null) {
            iVar.setVerticalOffset(i7);
        } else {
            super.setDropDownVerticalOffset(i7);
        }
    }

    @Override
    public void setDropDownWidth(int i7) {
        if (this.mPopup != null) {
            this.mDropDownWidth = i7;
        } else {
            super.setDropDownWidth(i7);
        }
    }

    @Override
    public void setPopupBackgroundDrawable(Drawable drawable) {
        i iVar = this.mPopup;
        if (iVar != null) {
            iVar.setBackgroundDrawable(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override
    public void setPopupBackgroundResource(int i7) {
        setPopupBackgroundDrawable(C2473a.b(getPopupContext(), i7));
    }

    @Override
    public void setPrompt(CharSequence charSequence) {
        i iVar = this.mPopup;
        if (iVar != null) {
            iVar.b(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1598c c1598c = this.mBackgroundTintHelper;
        if (c1598c != null) {
            c1598c.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1598c c1598c = this.mBackgroundTintHelper;
        if (c1598c != null) {
            c1598c.j(mode);
        }
    }

    void showPopup() {
        this.mPopup.d(d.b(this), d.a(this));
    }

    public AppCompatSpinner(Context context, int i7) {
        this(context, null, C2447a.f20534O, i7);
    }

    @Override
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.mPopupSet) {
            this.mTempAdapter = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.mPopup != null) {
            Context context = this.mPopupContext;
            if (context == null) {
                context = getContext();
            }
            this.mPopup.setAdapter(new g(spinnerAdapter, context.getTheme()));
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2447a.f20534O);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i7) {
        this(context, attributeSet, i7, -1);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i7, int i8) {
        this(context, attributeSet, i7, i8, null);
    }

    public AppCompatSpinner(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }
}
