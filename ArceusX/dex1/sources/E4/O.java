package E4;

import android.content.Context;
import android.os.LocaleList;
import com.github.luben.zstd.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class O {

    private final Context f1100a;

    public O(Context context) {
        this.f1100a = context;
    }

    private static String b(Locale locale) {
        return String.valueOf(locale.getLanguage()).concat(locale.getCountry().isEmpty() ? BuildConfig.FLAVOR : "_".concat(String.valueOf(locale.getCountry())));
    }

    public final List a() {
        LocaleList locales = this.f1100a.getResources().getConfiguration().getLocales();
        ArrayList arrayList = new ArrayList(locales.size());
        for (int i7 = 0; i7 < locales.size(); i7++) {
            arrayList.add(b(locales.get(i7)));
        }
        return arrayList;
    }
}
