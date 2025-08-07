package l3;

import com.github.luben.zstd.BuildConfig;
import com.google.android.gms.common.api.Status;

public class C2527b extends Exception {

    @Deprecated
    protected final Status f21785d;

    public C2527b(Status status) {
        super(status.o() + ": " + (status.p() != null ? status.p() : BuildConfig.FLAVOR));
        this.f21785d = status;
    }

    public Status a() {
        return this.f21785d;
    }

    public int b() {
        return this.f21785d.o();
    }
}
