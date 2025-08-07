package androidx.recyclerview.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public class i extends RecyclerView.o {

    private static final int[] f11940d = {R.attr.listDivider};

    private Drawable f11941a;

    private int f11942b;

    private final Rect f11943c = new Rect();

    public i(Context context, int i7) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f11940d);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f11941a = drawable;
        if (drawable == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        typedArrayObtainStyledAttributes.recycle();
        n(i7);
    }

    private void j(Canvas canvas, RecyclerView recyclerView) {
        int height;
        int paddingTop;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingTop = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            paddingTop = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = recyclerView.getChildAt(i7);
            recyclerView.getLayoutManager().U(childAt, this.f11943c);
            int iRound = this.f11943c.right + Math.round(childAt.getTranslationX());
            this.f11941a.setBounds(iRound - this.f11941a.getIntrinsicWidth(), paddingTop, iRound, height);
            this.f11941a.draw(canvas);
        }
        canvas.restore();
    }

    private void k(Canvas canvas, RecyclerView recyclerView) {
        int width;
        int paddingLeft;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingLeft = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            paddingLeft = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = recyclerView.getChildAt(i7);
            recyclerView.f0(childAt, this.f11943c);
            int iRound = this.f11943c.bottom + Math.round(childAt.getTranslationY());
            this.f11941a.setBounds(paddingLeft, iRound - this.f11941a.getIntrinsicHeight(), width, iRound);
            this.f11941a.draw(canvas);
        }
        canvas.restore();
    }

    @Override
    public void e(Rect rect, View view, RecyclerView recyclerView, RecyclerView.A a2) {
        Drawable drawable = this.f11941a;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f11942b == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    @Override
    public void g(Canvas canvas, RecyclerView recyclerView, RecyclerView.A a2) {
        if (recyclerView.getLayoutManager() == null || this.f11941a == null) {
            return;
        }
        if (this.f11942b == 1) {
            k(canvas, recyclerView);
        } else {
            j(canvas, recyclerView);
        }
    }

    public Drawable l() {
        return this.f11941a;
    }

    public void m(Drawable drawable) {
        if (drawable == null) {
            throw new IllegalArgumentException("Drawable cannot be null.");
        }
        this.f11941a = drawable;
    }

    public void n(int i7) {
        if (i7 != 0 && i7 != 1) {
            throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
        }
        this.f11942b = i7;
    }
}
