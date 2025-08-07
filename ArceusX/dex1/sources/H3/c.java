package H3;

import com.google.android.gms.common.Feature;

public final class c {

    public static final Feature f1571a;

    public static final Feature f1572b;

    public static final Feature f1573c;

    public static final Feature f1574d;

    public static final Feature[] f1575e;

    static {
        Feature feature = new Feature("sms_code_autofill", 2L);
        f1571a = feature;
        Feature feature2 = new Feature("sms_code_browser", 2L);
        f1572b = feature2;
        Feature feature3 = new Feature("sms_retrieve", 1L);
        f1573c = feature3;
        Feature feature4 = new Feature("user_consent", 3L);
        f1574d = feature4;
        f1575e = new Feature[]{feature, feature2, feature3, feature4};
    }
}
