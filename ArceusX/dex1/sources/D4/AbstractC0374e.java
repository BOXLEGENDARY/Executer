package D4;

import android.app.PendingIntent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractC0374e {
    public static AbstractC0374e b(int i7, int i8, int i9, long j7, long j8, List<String> list, List<String> list2) {
        if (i8 != 8) {
            return new C0376g(i7, i8, i9, j7, j8, list, list2, null, null);
        }
        throw new IllegalArgumentException("REQUIRES_USER_CONFIRMATION state not supported.");
    }

    public static AbstractC0374e n(Bundle bundle) {
        return new C0376g(bundle.getInt("session_id"), bundle.getInt("status"), bundle.getInt("error_code"), bundle.getLong("bytes_downloaded"), bundle.getLong("total_bytes_to_download"), bundle.getStringArrayList("module_names"), bundle.getStringArrayList("languages"), (PendingIntent) bundle.getParcelable("user_confirmation_intent"), bundle.getParcelableArrayList("split_file_intents"));
    }

    public abstract long a();

    public abstract int c();

    public boolean d() {
        int i7 = i();
        return i7 == 0 || i7 == 5 || i7 == 6 || i7 == 7;
    }

    public List<String> e() {
        return k() != null ? new ArrayList(k()) : new ArrayList();
    }

    public List<String> f() {
        return l() != null ? new ArrayList(l()) : new ArrayList();
    }

    @Deprecated
    public abstract PendingIntent g();

    public abstract int h();

    public abstract int i();

    public abstract long j();

    abstract List k();

    abstract List l();

    abstract List m();
}
