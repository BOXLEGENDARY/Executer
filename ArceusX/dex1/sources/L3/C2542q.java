package l3;

import com.google.android.gms.common.Feature;

public final class C2542q extends UnsupportedOperationException {

    private final Feature f21803d;

    public C2542q(Feature feature) {
        this.f21803d = feature;
    }

    @Override
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.f21803d));
    }
}
