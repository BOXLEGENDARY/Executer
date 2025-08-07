package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new a();

    ArrayList<FragmentManager.LaunchedFragmentInfo> f11086A;

    ArrayList<String> f11087d;

    ArrayList<String> f11088e;

    BackStackRecordState[] f11089i;

    int f11090v;

    String f11091w;

    ArrayList<String> f11092y;

    ArrayList<BackStackState> f11093z;

    class a implements Parcelable.Creator<FragmentManagerState> {
        a() {
        }

        @Override
        public FragmentManagerState createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        @Override
        public FragmentManagerState[] newArray(int i7) {
            return new FragmentManagerState[i7];
        }
    }

    public FragmentManagerState() {
        this.f11091w = null;
        this.f11092y = new ArrayList<>();
        this.f11093z = new ArrayList<>();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeStringList(this.f11087d);
        parcel.writeStringList(this.f11088e);
        parcel.writeTypedArray(this.f11089i, i7);
        parcel.writeInt(this.f11090v);
        parcel.writeString(this.f11091w);
        parcel.writeStringList(this.f11092y);
        parcel.writeTypedList(this.f11093z);
        parcel.writeTypedList(this.f11086A);
    }

    public FragmentManagerState(Parcel parcel) {
        this.f11091w = null;
        this.f11092y = new ArrayList<>();
        this.f11093z = new ArrayList<>();
        this.f11087d = parcel.createStringArrayList();
        this.f11088e = parcel.createStringArrayList();
        this.f11089i = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
        this.f11090v = parcel.readInt();
        this.f11091w = parcel.readString();
        this.f11092y = parcel.createStringArrayList();
        this.f11093z = parcel.createTypedArrayList(BackStackState.CREATOR);
        this.f11086A = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
    }
}
