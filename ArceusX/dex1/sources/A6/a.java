package A6;

import android.content.Context;
import android.content.res.Resources;
import com.github.luben.zstd.BuildConfig;
import h7.l;
import java.util.IllegalFormatException;

public class a {
    private static String a() {
        l.d("rbx.strings", "context is null");
        return BuildConfig.FLAVOR;
    }

    private static String b(Context context, int i7, Object... objArr) {
        try {
            l.i("rbx.strings", "ResourceId: " + i7);
            return objArr.length > 0 ? context.getString(i7, objArr) : context.getString(i7);
        } catch (Resources.NotFoundException unused) {
            l.c("Resources.NotFoundException thrown in getStringFromResources()");
            return BuildConfig.FLAVOR;
        } catch (IllegalFormatException unused2) {
            l.c("IllegalFormatException thrown in getStringFromResources()");
            return BuildConfig.FLAVOR;
        }
    }

    public static String c(Context context, int i7, Object... objArr) {
        return context == null ? a() : b(context, i7, objArr);
    }
}
