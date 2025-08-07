package j9;

import android.text.StaticLayout;
import android.widget.TextView;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroid/widget/TextView;", "", "a", "(Landroid/widget/TextView;)I", "shared_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class l {
    public static final int a(@NotNull TextView textView) {
        int width;
        Intrinsics.checkNotNullParameter(textView, "<this>");
        CharSequence text = textView.getText();
        if (text == null || (width = textView.getWidth()) == 0 || StringsKt.Y(text)) {
            return 0;
        }
        StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(text, 0, text.length(), textView.getPaint(), width).build();
        Intrinsics.checkNotNullExpressionValue(staticLayoutBuild, "build(...)");
        return staticLayoutBuild.getLineCount();
    }
}
