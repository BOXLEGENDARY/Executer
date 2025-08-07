package fb;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u00052\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lfb/k;", "Lkotlin/Function0;", "", "<init>", "()V", "d", "a", "Lfb/a;", "Lfb/c;", "operations-stdlib"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
public abstract class k implements Function0<Object> {

    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lfb/k$a;", "", "<init>", "()V", "", "mode", "Lfb/j;", "replaceData", "Lfb/k;", "a", "(Ljava/lang/String;Lfb/j;)Lfb/k;", "operations-stdlib"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final k a(@NotNull String mode, @NotNull ReplaceData replaceData) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            Intrinsics.checkNotNullParameter(replaceData, "replaceData");
            if (Intrinsics.b(mode, "all")) {
                return new a(replaceData);
            }
            if (StringsKt.toIntOrNull(mode) != null) {
                return new c(replaceData, Integer.parseInt(mode));
            }
            throw new IllegalArgumentException(mode);
        }

        private Companion() {
        }
    }

    public k(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private k() {
    }
}
