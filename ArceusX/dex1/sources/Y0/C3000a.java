package y0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

public final class C3000a extends ClickableSpan {

    private final int f24356d;

    private final C3019t f24357e;

    private final int f24358i;

    public C3000a(int i7, C3019t c3019t, int i8) {
        this.f24356d = i7;
        this.f24357e = c3019t;
        this.f24358i = i8;
    }

    @Override
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f24356d);
        this.f24357e.V(this.f24358i, bundle);
    }
}
