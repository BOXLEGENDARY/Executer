package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new a();

    final List<String> f10943d;

    final List<BackStackRecordState> f10944e;

    class a implements Parcelable.Creator<BackStackState> {
        a() {
        }

        @Override
        public BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        @Override
        public BackStackState[] newArray(int i7) {
            return new BackStackState[i7];
        }
    }

    BackStackState(Parcel parcel) {
        this.f10943d = parcel.createStringArrayList();
        this.f10944e = parcel.createTypedArrayList(BackStackRecordState.CREATOR);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeStringList(this.f10943d);
        parcel.writeTypedList(this.f10944e);
    }
}
