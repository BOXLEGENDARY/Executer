package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import com.github.luben.zstd.BuildConfig;
import g0.C2457a;
import java.lang.reflect.Method;

class b extends a {

    private final SparseIntArray f12520d;

    private final Parcel f12521e;

    private final int f12522f;

    private final int f12523g;

    private final String f12524h;

    private int f12525i;

    private int f12526j;

    private int f12527k;

    b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), BuildConfig.FLAVOR, new C2457a(), new C2457a(), new C2457a());
    }

    @Override
    public void A(byte[] bArr) {
        if (bArr == null) {
            this.f12521e.writeInt(-1);
        } else {
            this.f12521e.writeInt(bArr.length);
            this.f12521e.writeByteArray(bArr);
        }
    }

    @Override
    protected void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f12521e, 0);
    }

    @Override
    public void E(int i7) {
        this.f12521e.writeInt(i7);
    }

    @Override
    public void G(Parcelable parcelable) {
        this.f12521e.writeParcelable(parcelable, 0);
    }

    @Override
    public void I(String str) {
        this.f12521e.writeString(str);
    }

    @Override
    public void a() {
        int i7 = this.f12525i;
        if (i7 >= 0) {
            int i8 = this.f12520d.get(i7);
            int iDataPosition = this.f12521e.dataPosition();
            this.f12521e.setDataPosition(i8);
            this.f12521e.writeInt(iDataPosition - i8);
            this.f12521e.setDataPosition(iDataPosition);
        }
    }

    @Override
    protected a b() {
        Parcel parcel = this.f12521e;
        int iDataPosition = parcel.dataPosition();
        int i7 = this.f12526j;
        if (i7 == this.f12522f) {
            i7 = this.f12523g;
        }
        return new b(parcel, iDataPosition, i7, this.f12524h + "  ", this.f12517a, this.f12518b, this.f12519c);
    }

    @Override
    public boolean g() {
        return this.f12521e.readInt() != 0;
    }

    @Override
    public byte[] i() {
        int i7 = this.f12521e.readInt();
        if (i7 < 0) {
            return null;
        }
        byte[] bArr = new byte[i7];
        this.f12521e.readByteArray(bArr);
        return bArr;
    }

    @Override
    protected CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f12521e);
    }

    @Override
    public boolean m(int i7) {
        while (this.f12526j < this.f12523g) {
            int i8 = this.f12527k;
            if (i8 == i7) {
                return true;
            }
            if (String.valueOf(i8).compareTo(String.valueOf(i7)) > 0) {
                return false;
            }
            this.f12521e.setDataPosition(this.f12526j);
            int i9 = this.f12521e.readInt();
            this.f12527k = this.f12521e.readInt();
            this.f12526j += i9;
        }
        return this.f12527k == i7;
    }

    @Override
    public int o() {
        return this.f12521e.readInt();
    }

    @Override
    public <T extends Parcelable> T q() {
        return (T) this.f12521e.readParcelable(getClass().getClassLoader());
    }

    @Override
    public String s() {
        return this.f12521e.readString();
    }

    @Override
    public void w(int i7) {
        a();
        this.f12525i = i7;
        this.f12520d.put(i7, this.f12521e.dataPosition());
        E(0);
        E(i7);
    }

    @Override
    public void y(boolean z7) {
        this.f12521e.writeInt(z7 ? 1 : 0);
    }

    private b(Parcel parcel, int i7, int i8, String str, C2457a<String, Method> c2457a, C2457a<String, Method> c2457a2, C2457a<String, Class> c2457a3) {
        super(c2457a, c2457a2, c2457a3);
        this.f12520d = new SparseIntArray();
        this.f12525i = -1;
        this.f12527k = -1;
        this.f12521e = parcel;
        this.f12522f = i7;
        this.f12523g = i8;
        this.f12526j = i7;
        this.f12524h = str;
    }
}
