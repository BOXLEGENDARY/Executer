package ha;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.app.d;
import androidx.lifecycle.o;
import com.roblox.client.personasdk.R;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\b\u001a\u00020\u0007*\u00020\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0011\u0010\u000b\u001a\u00020\n*\u00020\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0010\u001a\u00020\r*\u00020\u0000¢\u0006\u0004\b\u0010\u0010\u000f\u001a\u0011\u0010\u0011\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0011\u0010\u0006\u001a\u0011\u0010\u0012\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0012\u0010\u0006\"\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u0007*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\t\"\u0015\u0010\u0018\u001a\u00020\u0015*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Landroid/content/Context;", "", "b", "(Landroid/content/Context;)Ljava/lang/String;", "", "e", "(Landroid/content/Context;)Z", "Landroidx/appcompat/app/d;", "h", "(Landroid/content/Context;)Landroidx/appcompat/app/d;", "Landroidx/lifecycle/o;", "i", "(Landroid/content/Context;)Landroidx/lifecycle/o;", "", "d", "(Landroid/content/Context;)V", "j", "g", "f", "a", "activity", "Ljava/io/File;", "c", "(Landroid/content/Context;)Ljava/io/File;", "sdkCacheDir", "shared_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0456d {
    public static final d a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (context instanceof d) {
            return (d) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        Intrinsics.checkNotNullExpressionValue(baseContext, "getBaseContext(...)");
        return a(baseContext);
    }

    @NotNull
    public static final String b(@NotNull Context context) {
        String string;
        Intrinsics.checkNotNullParameter(context, "<this>");
        int i = context.getApplicationInfo().labelRes;
        if (i == 0) {
            try {
                CharSequence charSequence = context.getApplicationInfo().nonLocalizedLabel;
                return (charSequence == null || (string = charSequence.toString()) == null) ? context.getApplicationInfo().loadLabel(context.getPackageManager()).toString() : string;
            } catch (PackageManager.NameNotFoundException unused) {
                return "";
            }
        }
        String string2 = context.getString(i);
        Intrinsics.d(string2);
        return string2;
    }

    @NotNull
    public static final File c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return new File(context.getCacheDir(), "pi2");
    }

    public static final void d(@NotNull Context context) {
        View currentFocus;
        Intrinsics.checkNotNullParameter(context, "<this>");
        d dVarA = a(context);
        if (dVarA == null || (currentFocus = dVarA.getCurrentFocus()) == null) {
            return;
        }
        Object systemService = context.getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    public static final boolean e(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public static final boolean f(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            return context.getPackageManager().hasSystemFeature("android.hardware.microphone");
        } catch (Exception unused) {
            return false;
        }
    }

    public static final boolean g(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object systemService = context.getSystemService("accessibility");
        Intrinsics.e(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        return ((AccessibilityManager) systemService).isEnabled();
    }

    @NotNull
    public static final d h(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        d dVarA = a(context);
        if (dVarA != null) {
            return dVarA;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @NotNull
    public static final o i(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        d dVarA = a(context);
        if (dVarA != null) {
            return dVarA;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final void j(@NotNull Context context) {
        View currentFocus;
        Intrinsics.checkNotNullParameter(context, "<this>");
        d dVarA = a(context);
        if (dVarA == null || (currentFocus = dVarA.getCurrentFocus()) == null) {
            return;
        }
        Object systemService = context.getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(currentFocus, 1);
        }
    }
}
