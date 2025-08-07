package androidx.core.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.widget.NestedScrollView;

class NestedScrollView$SavedState$1 implements Parcelable.Creator<NestedScrollView.SavedState> {
    NestedScrollView$SavedState$1() {
    }

    @Override
    public NestedScrollView.SavedState createFromParcel(Parcel in) {
        return new NestedScrollView.SavedState(in);
    }

    @Override
    public NestedScrollView.SavedState[] newArray(int size) {
        return new NestedScrollView.SavedState[size];
    }
}
