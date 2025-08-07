package android.view;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.I;
import android.view.View;
import android.view.Window;
import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\" \u0010\r\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\b\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\" \u0010\u0011\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\b\u0012\u0004\b\u0010\u0010\f\u001a\u0004\b\u000f\u0010\n\"\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/activity/ComponentActivity;", "Landroidx/activity/I;", "statusBarStyle", "navigationBarStyle", BuildConfig.FLAVOR, "a", "(Landroidx/activity/ComponentActivity;Landroidx/activity/I;Landroidx/activity/I;)V", BuildConfig.FLAVOR, "I", "getDefaultLightScrim", "()I", "getDefaultLightScrim$annotations", "()V", "DefaultLightScrim", "b", "getDefaultDarkScrim", "getDefaultDarkScrim$annotations", "DefaultDarkScrim", "Landroidx/activity/A;", "c", "Landroidx/activity/A;", "Impl", "activity_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class r {

    private static final int f8476a = Color.argb(230, 255, 255, 255);

    private static final int f8477b = Color.argb(128, 27, 27, 27);

    private static A f8478c;

    public static final void a(ComponentActivity componentActivity, I i7, I i8) {
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        Intrinsics.checkNotNullParameter(i7, "statusBarStyle");
        Intrinsics.checkNotNullParameter(i8, "navigationBarStyle");
        View decorView = componentActivity.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        Function1<Resources, Boolean> function1B = i7.b();
        Resources resources = decorView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "view.resources");
        boolean zBooleanValue = ((Boolean) function1B.invoke(resources)).booleanValue();
        Function1<Resources, Boolean> function1B2 = i8.b();
        Resources resources2 = decorView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "view.resources");
        boolean zBooleanValue2 = ((Boolean) function1B2.invoke(resources2)).booleanValue();
        A yVar = f8478c;
        if (yVar == null) {
            int i9 = Build.VERSION.SDK_INT;
            yVar = i9 >= 30 ? new y() : i9 >= 29 ? new x() : i9 >= 28 ? new u() : new s();
        }
        Window window = componentActivity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "window");
        yVar.a(i7, i8, window, decorView, zBooleanValue, zBooleanValue2);
        Window window2 = componentActivity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window2, "window");
        yVar.b(window2);
    }

    public static void b(ComponentActivity componentActivity, I i7, I i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i7 = I.Companion.c(I.INSTANCE, 0, 0, null, 4, null);
        }
        if ((i9 & 2) != 0) {
            i8 = I.Companion.c(I.INSTANCE, f8476a, f8477b, null, 4, null);
        }
        a(componentActivity, i7, i8);
    }
}
