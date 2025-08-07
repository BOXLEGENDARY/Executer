package v8;

import android.widget.TextView;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroid/widget/TextView;", "", "to", "", "b", "(Landroid/widget/TextView;Ljava/lang/String;)V", "government-id_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0847o {
    public static final void b(TextView textView, String str) {
        if (StringsKt.Y(str)) {
            textView.setVisibility(8);
        } else {
            textView.setText(str);
        }
    }
}
