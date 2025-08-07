package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.view.AbstractC1694h;
import androidx.fragment.app.B;
import java.util.ArrayList;

final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new a();

    final int f10929A;

    final CharSequence f10930B;

    final int f10931C;

    final CharSequence f10932D;

    final ArrayList<String> f10933E;

    final ArrayList<String> f10934F;

    final boolean f10935G;

    final int[] f10936d;

    final ArrayList<String> f10937e;

    final int[] f10938i;

    final int[] f10939v;

    final int f10940w;

    final String f10941y;

    final int f10942z;

    class a implements Parcelable.Creator<BackStackRecordState> {
        a() {
        }

        @Override
        public BackStackRecordState createFromParcel(Parcel parcel) {
            return new BackStackRecordState(parcel);
        }

        @Override
        public BackStackRecordState[] newArray(int i7) {
            return new BackStackRecordState[i7];
        }
    }

    BackStackRecordState(C1656a c1656a) {
        int size = c1656a.f10903c.size();
        this.f10936d = new int[size * 6];
        if (!c1656a.f10909i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f10937e = new ArrayList<>(size);
        this.f10938i = new int[size];
        this.f10939v = new int[size];
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            B.a aVar = c1656a.f10903c.get(i8);
            int i9 = i7 + 1;
            this.f10936d[i7] = aVar.f10920a;
            ArrayList<String> arrayList = this.f10937e;
            Fragment fragment = aVar.f10921b;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.f10936d;
            iArr[i9] = aVar.f10922c ? 1 : 0;
            iArr[i7 + 2] = aVar.f10923d;
            iArr[i7 + 3] = aVar.f10924e;
            int i10 = i7 + 5;
            iArr[i7 + 4] = aVar.f10925f;
            i7 += 6;
            iArr[i10] = aVar.f10926g;
            this.f10938i[i8] = aVar.f10927h.ordinal();
            this.f10939v[i8] = aVar.f10928i.ordinal();
        }
        this.f10940w = c1656a.f10908h;
        this.f10941y = c1656a.f10911k;
        this.f10942z = c1656a.f11141v;
        this.f10929A = c1656a.f10912l;
        this.f10930B = c1656a.f10913m;
        this.f10931C = c1656a.f10914n;
        this.f10932D = c1656a.f10915o;
        this.f10933E = c1656a.f10916p;
        this.f10934F = c1656a.f10917q;
        this.f10935G = c1656a.f10918r;
    }

    private void a(C1656a c1656a) {
        int i7 = 0;
        int i8 = 0;
        while (true) {
            boolean z7 = true;
            if (i7 >= this.f10936d.length) {
                c1656a.f10908h = this.f10940w;
                c1656a.f10911k = this.f10941y;
                c1656a.f10909i = true;
                c1656a.f10912l = this.f10929A;
                c1656a.f10913m = this.f10930B;
                c1656a.f10914n = this.f10931C;
                c1656a.f10915o = this.f10932D;
                c1656a.f10916p = this.f10933E;
                c1656a.f10917q = this.f10934F;
                c1656a.f10918r = this.f10935G;
                return;
            }
            B.a aVar = new B.a();
            int i9 = i7 + 1;
            aVar.f10920a = this.f10936d[i7];
            if (FragmentManager.J0(2)) {
                Log.v("FragmentManager", "Instantiate " + c1656a + " op #" + i8 + " base fragment #" + this.f10936d[i9]);
            }
            aVar.f10927h = AbstractC1694h.b.values()[this.f10938i[i8]];
            aVar.f10928i = AbstractC1694h.b.values()[this.f10939v[i8]];
            int[] iArr = this.f10936d;
            int i10 = i7 + 2;
            if (iArr[i9] == 0) {
                z7 = false;
            }
            aVar.f10922c = z7;
            int i11 = iArr[i10];
            aVar.f10923d = i11;
            int i12 = iArr[i7 + 3];
            aVar.f10924e = i12;
            int i13 = i7 + 5;
            int i14 = iArr[i7 + 4];
            aVar.f10925f = i14;
            i7 += 6;
            int i15 = iArr[i13];
            aVar.f10926g = i15;
            c1656a.f10904d = i11;
            c1656a.f10905e = i12;
            c1656a.f10906f = i14;
            c1656a.f10907g = i15;
            c1656a.e(aVar);
            i8++;
        }
    }

    public C1656a b(FragmentManager fragmentManager) {
        C1656a c1656a = new C1656a(fragmentManager);
        a(c1656a);
        c1656a.f11141v = this.f10942z;
        for (int i7 = 0; i7 < this.f10937e.size(); i7++) {
            String str = this.f10937e.get(i7);
            if (str != null) {
                c1656a.f10903c.get(i7).f10921b = fragmentManager.h0(str);
            }
        }
        c1656a.r(1);
        return c1656a;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeIntArray(this.f10936d);
        parcel.writeStringList(this.f10937e);
        parcel.writeIntArray(this.f10938i);
        parcel.writeIntArray(this.f10939v);
        parcel.writeInt(this.f10940w);
        parcel.writeString(this.f10941y);
        parcel.writeInt(this.f10942z);
        parcel.writeInt(this.f10929A);
        TextUtils.writeToParcel(this.f10930B, parcel, 0);
        parcel.writeInt(this.f10931C);
        TextUtils.writeToParcel(this.f10932D, parcel, 0);
        parcel.writeStringList(this.f10933E);
        parcel.writeStringList(this.f10934F);
        parcel.writeInt(this.f10935G ? 1 : 0);
    }

    BackStackRecordState(Parcel parcel) {
        this.f10936d = parcel.createIntArray();
        this.f10937e = parcel.createStringArrayList();
        this.f10938i = parcel.createIntArray();
        this.f10939v = parcel.createIntArray();
        this.f10940w = parcel.readInt();
        this.f10941y = parcel.readString();
        this.f10942z = parcel.readInt();
        this.f10929A = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f10930B = (CharSequence) creator.createFromParcel(parcel);
        this.f10931C = parcel.readInt();
        this.f10932D = (CharSequence) creator.createFromParcel(parcel);
        this.f10933E = parcel.createStringArrayList();
        this.f10934F = parcel.createStringArrayList();
        this.f10935G = parcel.readInt() != 0;
    }
}
