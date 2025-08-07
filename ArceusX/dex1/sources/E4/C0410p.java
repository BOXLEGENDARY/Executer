package E4;

import android.os.Build;

public final class C0410p {
    public static InterfaceC0409o a() {
        int i7 = Build.VERSION.SDK_INT;
        return i7 != 26 ? (i7 == 27 && Build.VERSION.PREVIEW_SDK_INT == 0) ? new A() : new C() : new C0419z();
    }
}
