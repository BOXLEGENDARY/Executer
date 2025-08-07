package n9;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import com.roblox.client.personasdk.R;
import ha.C0476u;
import ha.EnumC0477v;
import j9.C0599b;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroid/content/Context;", "context", "", "fontName", "Landroid/graphics/Typeface;", "a", "(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Typeface;", "ui-step-renderer_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class t0 {
    public static final Typeface a(@NotNull Context context, @NotNull String str) throws Resources.NotFoundException, IOException {
        Typeface typefaceH;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "fontName");
        String str2 = str + ".ttf";
        C0599b.Companion companion = C0599b.INSTANCE;
        if (companion.a().containsKey(str2)) {
            typefaceH = companion.a().get(str2);
        } else {
            String[] list = context.getAssets().list("fonts");
            if (list == null || !kotlin.collections.i.w(list, str2)) {
                Integer numG = C0476u.g(context, str, EnumC0477v.d);
                if (numG != null) {
                    typefaceH = p0.h.h(context, numG.intValue());
                }
                typefaceH = null;
            } else {
                typefaceH = Typeface.createFromAsset(context.getAssets(), "fonts/" + str2);
            }
        }
        C0599b.INSTANCE.a().put(str2, typefaceH);
        return typefaceH;
    }
}
