package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.a;

public class IconCompatParcelizer {
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f10569a = aVar.p(iconCompat.f10569a, 1);
        iconCompat.f10571c = aVar.j(iconCompat.f10571c, 2);
        iconCompat.f10572d = aVar.r(iconCompat.f10572d, 3);
        iconCompat.f10573e = aVar.p(iconCompat.f10573e, 4);
        iconCompat.f10574f = aVar.p(iconCompat.f10574f, 5);
        iconCompat.f10575g = (ColorStateList) aVar.r(iconCompat.f10575g, 6);
        iconCompat.f10577i = aVar.t(iconCompat.f10577i, 7);
        iconCompat.f10578j = aVar.t(iconCompat.f10578j, 8);
        iconCompat.k();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.x(true, true);
        iconCompat.l(aVar.f());
        int i7 = iconCompat.f10569a;
        if (-1 != i7) {
            aVar.F(i7, 1);
        }
        byte[] bArr = iconCompat.f10571c;
        if (bArr != null) {
            aVar.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f10572d;
        if (parcelable != null) {
            aVar.H(parcelable, 3);
        }
        int i8 = iconCompat.f10573e;
        if (i8 != 0) {
            aVar.F(i8, 4);
        }
        int i9 = iconCompat.f10574f;
        if (i9 != 0) {
            aVar.F(i9, 5);
        }
        ColorStateList colorStateList = iconCompat.f10575g;
        if (colorStateList != null) {
            aVar.H(colorStateList, 6);
        }
        String str = iconCompat.f10577i;
        if (str != null) {
            aVar.J(str, 7);
        }
        String str2 = iconCompat.f10578j;
        if (str2 != null) {
            aVar.J(str2, 8);
        }
    }
}
