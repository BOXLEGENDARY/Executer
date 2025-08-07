package androidx.appcompat.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import g.C2447a;
import g.C2448b;
import g.C2450d;
import g.C2456j;

public class a {

    private Context f8797a;

    private a(Context context) {
        this.f8797a = context;
    }

    public static a b(Context context) {
        return new a(context);
    }

    public boolean a() {
        return this.f8797a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int c() {
        return this.f8797a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int d() {
        Configuration configuration = this.f8797a.getResources().getConfiguration();
        int i7 = configuration.screenWidthDp;
        int i8 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i7 > 600) {
            return 5;
        }
        if (i7 > 960 && i8 > 720) {
            return 5;
        }
        if (i7 > 720 && i8 > 960) {
            return 5;
        }
        if (i7 >= 500) {
            return 4;
        }
        if (i7 > 640 && i8 > 480) {
            return 4;
        }
        if (i7 <= 480 || i8 <= 640) {
            return i7 >= 360 ? 3 : 2;
        }
        return 4;
    }

    public int e() {
        return this.f8797a.getResources().getDimensionPixelSize(C2450d.f20575b);
    }

    public int f() {
        TypedArray typedArrayObtainStyledAttributes = this.f8797a.obtainStyledAttributes(null, C2456j.f20794a, C2447a.f20541c, 0);
        int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(C2456j.f20833j, 0);
        Resources resources = this.f8797a.getResources();
        if (!g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C2450d.f20574a));
        }
        typedArrayObtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public boolean g() {
        return this.f8797a.getResources().getBoolean(C2448b.f20565a);
    }

    public boolean h() {
        return true;
    }
}
