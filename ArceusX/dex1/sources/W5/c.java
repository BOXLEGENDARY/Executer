package W5;

import android.app.Activity;
import com.roblox.client.M;
import h7.n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroid/app/Activity;", "LW5/i;", "c", "(Landroid/app/Activity;)LW5/i;", "NativeShell_googleProdRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class c {
    public static final i c(final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        return new f(activity, new Function0() {
            public final Object invoke() {
                return c.d(activity);
            }
        }, null, new Function0() {
            public final Object invoke() {
                return c.e(activity);
            }
        }, 4, null);
    }

    public static final String d(Activity activity) {
        String string = activity.getString(M.f19680u, activity.getString(M.f19605M));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    public static final Unit e(Activity activity) {
        n.k(activity, activity.getPackageName());
        return Unit.a;
    }
}
