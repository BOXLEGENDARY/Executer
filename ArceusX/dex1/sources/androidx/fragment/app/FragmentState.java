package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbstractC1694h;

final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new a();

    final boolean f11094A;

    final boolean f11095B;

    final Bundle f11096C;

    final boolean f11097D;

    final int f11098E;

    Bundle f11099F;

    final String f11100d;

    final String f11101e;

    final boolean f11102i;

    final int f11103v;

    final int f11104w;

    final String f11105y;

    final boolean f11106z;

    class a implements Parcelable.Creator<FragmentState> {
        a() {
        }

        @Override
        public FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        @Override
        public FragmentState[] newArray(int i7) {
            return new FragmentState[i7];
        }
    }

    FragmentState(Fragment fragment) {
        this.f11100d = fragment.getClass().getName();
        this.f11101e = fragment.mWho;
        this.f11102i = fragment.mFromLayout;
        this.f11103v = fragment.mFragmentId;
        this.f11104w = fragment.mContainerId;
        this.f11105y = fragment.mTag;
        this.f11106z = fragment.mRetainInstance;
        this.f11094A = fragment.mRemoving;
        this.f11095B = fragment.mDetached;
        this.f11096C = fragment.mArguments;
        this.f11097D = fragment.mHidden;
        this.f11098E = fragment.mMaxState.ordinal();
    }

    Fragment a(l lVar, ClassLoader classLoader) {
        Fragment fragmentA = lVar.a(classLoader, this.f11100d);
        Bundle bundle = this.f11096C;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        fragmentA.setArguments(this.f11096C);
        fragmentA.mWho = this.f11101e;
        fragmentA.mFromLayout = this.f11102i;
        fragmentA.mRestored = true;
        fragmentA.mFragmentId = this.f11103v;
        fragmentA.mContainerId = this.f11104w;
        fragmentA.mTag = this.f11105y;
        fragmentA.mRetainInstance = this.f11106z;
        fragmentA.mRemoving = this.f11094A;
        fragmentA.mDetached = this.f11095B;
        fragmentA.mHidden = this.f11097D;
        fragmentA.mMaxState = AbstractC1694h.b.values()[this.f11098E];
        Bundle bundle2 = this.f11099F;
        if (bundle2 != null) {
            fragmentA.mSavedFragmentState = bundle2;
        } else {
            fragmentA.mSavedFragmentState = new Bundle();
        }
        return fragmentA;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f11100d);
        sb.append(" (");
        sb.append(this.f11101e);
        sb.append(")}:");
        if (this.f11102i) {
            sb.append(" fromLayout");
        }
        if (this.f11104w != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f11104w));
        }
        String str = this.f11105y;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f11105y);
        }
        if (this.f11106z) {
            sb.append(" retainInstance");
        }
        if (this.f11094A) {
            sb.append(" removing");
        }
        if (this.f11095B) {
            sb.append(" detached");
        }
        if (this.f11097D) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f11100d);
        parcel.writeString(this.f11101e);
        parcel.writeInt(this.f11102i ? 1 : 0);
        parcel.writeInt(this.f11103v);
        parcel.writeInt(this.f11104w);
        parcel.writeString(this.f11105y);
        parcel.writeInt(this.f11106z ? 1 : 0);
        parcel.writeInt(this.f11094A ? 1 : 0);
        parcel.writeInt(this.f11095B ? 1 : 0);
        parcel.writeBundle(this.f11096C);
        parcel.writeInt(this.f11097D ? 1 : 0);
        parcel.writeBundle(this.f11099F);
        parcel.writeInt(this.f11098E);
    }

    FragmentState(Parcel parcel) {
        this.f11100d = parcel.readString();
        this.f11101e = parcel.readString();
        this.f11102i = parcel.readInt() != 0;
        this.f11103v = parcel.readInt();
        this.f11104w = parcel.readInt();
        this.f11105y = parcel.readString();
        this.f11106z = parcel.readInt() != 0;
        this.f11094A = parcel.readInt() != 0;
        this.f11095B = parcel.readInt() != 0;
        this.f11096C = parcel.readBundle();
        this.f11097D = parcel.readInt() != 0;
        this.f11099F = parcel.readBundle();
        this.f11098E = parcel.readInt();
    }
}
