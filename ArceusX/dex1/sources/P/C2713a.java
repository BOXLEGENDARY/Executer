package p;

import android.os.Bundle;

public final class C2713a {

    public final Integer f22568a;

    public final Integer f22569b;

    public final Integer f22570c;

    public final Integer f22571d;

    public static final class C0213a {

        private Integer f22572a;

        private Integer f22573b;

        private Integer f22574c;

        private Integer f22575d;

        public C2713a a() {
            return new C2713a(this.f22572a, this.f22573b, this.f22574c, this.f22575d);
        }
    }

    C2713a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f22568a = num;
        this.f22569b = num2;
        this.f22570c = num3;
        this.f22571d = num4;
    }

    Bundle a() {
        Bundle bundle = new Bundle();
        Integer num = this.f22568a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f22569b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f22570c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f22571d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
