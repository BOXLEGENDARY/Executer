package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;

public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new a();

    private final i1.a f12516d;

    static class a implements Parcelable.Creator<ParcelImpl> {
        a() {
        }

        @Override
        public ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        @Override
        public ParcelImpl[] newArray(int i7) {
            return new ParcelImpl[i7];
        }
    }

    protected ParcelImpl(Parcel parcel) {
        this.f12516d = new b(parcel).u();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i7) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        new b(parcel).L(this.f12516d);
    }
}
