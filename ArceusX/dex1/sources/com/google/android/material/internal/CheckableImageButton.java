package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.core.view.C1605a;
import androidx.core.view.Z;
import androidx.customview.view.AbsSavedState;
import g.C2447a;
import y0.C3019t;

public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    private static final int[] f18031v = {R.attr.state_checked};

    private boolean f18032d;

    private boolean f18033e;

    private boolean f18034i;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        boolean f18035d;

        class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override
            public SavedState[] newArray(int i7) {
                return new SavedState[i7];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private void a(Parcel parcel) {
            this.f18035d = parcel.readInt() == 1;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeInt(this.f18035d ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            a(parcel);
        }
    }

    class a extends C1605a {
        a() {
        }

        @Override
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override
        public void g(View view, C3019t c3019t) {
            super.g(view, c3019t);
            c3019t.c0(CheckableImageButton.this.a());
            c3019t.d0(CheckableImageButton.this.isChecked());
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2447a.f20525F);
    }

    public boolean a() {
        return this.f18033e;
    }

    @Override
    public boolean isChecked() {
        return this.f18032d;
    }

    @Override
    public int[] onCreateDrawableState(int i7) {
        if (!this.f18032d) {
            return super.onCreateDrawableState(i7);
        }
        int[] iArr = f18031v;
        return View.mergeDrawableStates(super.onCreateDrawableState(i7 + iArr.length), iArr);
    }

    @Override
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setChecked(savedState.f18035d);
    }

    @Override
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f18035d = this.f18032d;
        return savedState;
    }

    public void setCheckable(boolean z7) {
        if (this.f18033e != z7) {
            this.f18033e = z7;
            sendAccessibilityEvent(0);
        }
    }

    @Override
    public void setChecked(boolean z7) {
        if (!this.f18033e || this.f18032d == z7) {
            return;
        }
        this.f18032d = z7;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z7) {
        this.f18034i = z7;
    }

    @Override
    public void setPressed(boolean z7) {
        if (this.f18034i) {
            super.setPressed(z7);
        }
    }

    @Override
    public void toggle() {
        setChecked(!this.f18032d);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f18033e = true;
        this.f18034i = true;
        Z.n0(this, new a());
    }
}
