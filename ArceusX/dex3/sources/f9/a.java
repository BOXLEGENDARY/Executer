package F9;

import F9.b;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LF9/a;", "LAa/b;", "LF9/b;", "<init>", "()V", "", "expression", "data", "e", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "operations-stdlib"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
public final class a implements Aa.b, b {

    @NotNull
    public static final a a = new a();

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "formatSequence", "", "arg", "a", "(Ljava/lang/String;D)Ljava/lang/String;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0})
    static final class C0022a extends l implements Function2<String, Double, String> {
        public static final C0022a d = new C0022a();

        C0022a() {
            super(2);
        }

        @NotNull
        public final String a(@NotNull String str, double d2) {
            Intrinsics.checkNotNullParameter(str, "formatSequence");
            String str2 = String.format(str, Double.valueOf(d2));
            Intrinsics.checkNotNullExpressionValue(str2, "format(formatSequence, arg)");
            return str2;
        }

        public Object invoke(Object obj, Object obj2) {
            return a((String) obj, ((Number) obj2).doubleValue());
        }
    }

    private a() {
    }

    public String a(Object obj, Object obj2, @NotNull Function2<? super String, ? super Double, String> function2) {
        return b.a.b(this, obj, obj2, function2);
    }

    @Override
    public Object e(Object expression, Object data) {
        return a(expression, data, C0022a.d);
    }
}
