package wa;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0081@\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u0088\u0001\u0002\u0092\u0001\u00020\u0001¨\u0006\u0006"}, d2 = {"Lwa/k;", "", "value", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "a", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class k {

    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\r\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"Lwa/k$a;", "", "<init>", "()V", "", "indexOfNextUnparsed", "Lwa/k;", "b", "(I)Ljava/lang/Object;", "position", "Lkotlin/Function0;", "", "message", "a", "(ILkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Object a(int position, @NotNull Function0<String> message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return k.b(new i(position, message));
        }

        @NotNull
        public final Object b(int indexOfNextUnparsed) {
            return k.b(Integer.valueOf(indexOfNextUnparsed));
        }

        private Companion() {
        }
    }

    public static Object b(Object obj) {
        return obj;
    }
}
