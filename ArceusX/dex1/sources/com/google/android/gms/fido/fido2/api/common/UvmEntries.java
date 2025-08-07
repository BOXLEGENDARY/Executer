package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.HashSet;
import java.util.List;
import n3.C2649g;
import o3.C2679b;
import org.json.JSONArray;
import org.json.JSONException;

public class UvmEntries extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UvmEntries> CREATOR = new j();

    private final List f14581d;

    UvmEntries(List list) {
        this.f14581d = list;
    }

    public boolean equals(Object obj) {
        List list;
        if (!(obj instanceof UvmEntries)) {
            return false;
        }
        UvmEntries uvmEntries = (UvmEntries) obj;
        List list2 = this.f14581d;
        return (list2 == null && uvmEntries.f14581d == null) || (list2 != null && (list = uvmEntries.f14581d) != null && list2.containsAll(list) && uvmEntries.f14581d.containsAll(this.f14581d));
    }

    public int hashCode() {
        return C2649g.c(new HashSet(this.f14581d));
    }

    public List<UvmEntry> l() {
        return this.f14581d;
    }

    public final JSONArray n() throws JSONException {
        try {
            JSONArray jSONArray = new JSONArray();
            if (this.f14581d != null) {
                for (int i7 = 0; i7 < this.f14581d.size(); i7++) {
                    UvmEntry uvmEntry = (UvmEntry) this.f14581d.get(i7);
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put((int) uvmEntry.n());
                    jSONArray2.put((int) uvmEntry.l());
                    jSONArray2.put((int) uvmEntry.n());
                    jSONArray.put(i7, jSONArray2);
                }
            }
            return jSONArray;
        } catch (JSONException e7) {
            throw new RuntimeException("Error encoding UvmEntries to JSON object", e7);
        }
    }

    @Override
    public void writeToParcel(Parcel parcel, int i7) {
        int iA = C2679b.a(parcel);
        C2679b.y(parcel, 1, l(), false);
        C2679b.b(parcel, iA);
    }
}
