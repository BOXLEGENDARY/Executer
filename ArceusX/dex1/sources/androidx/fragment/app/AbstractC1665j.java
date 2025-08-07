package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

public abstract class AbstractC1665j {
    @Deprecated
    public Fragment b(Context context, String str, Bundle bundle) {
        return Fragment.instantiate(context, str, bundle);
    }

    public abstract View c(int i7);

    public abstract boolean d();
}
