package ha;

import com.roblox.client.personasdk.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "", "a", "(J)Ljava/lang/String;", "shared_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0457e {
    @NotNull
    public static final String a(long j) {
        String str = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US).format(new Date(j));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}
