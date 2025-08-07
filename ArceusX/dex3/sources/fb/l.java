package fb;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a+\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "oldValue", "newValue", "", "times", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;", "operations-stdlib"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
public final class l {
    public static final String b(String str, String str2, String str3, int i) {
        return i > 0 ? b(StringsKt.B(str, str2, str3, false, 4, (Object) null), str2, str3, i - 1) : str;
    }
}
