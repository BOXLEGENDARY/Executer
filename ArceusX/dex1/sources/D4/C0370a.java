package D4;

import com.google.android.gms.common.api.Status;
import l3.C2527b;

public class C0370a extends C2527b {
    public C0370a(int i7) {
        super(new Status(i7, String.format("Split Install Error(%d): %s", Integer.valueOf(i7), F4.a.b(i7))));
        if (i7 == 0) {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
    }

    public int c() {
        return super.b();
    }
}
