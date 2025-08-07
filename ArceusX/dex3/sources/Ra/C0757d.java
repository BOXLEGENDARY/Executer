package ra;

import com.roblox.client.personasdk.R;
import java.time.DayOfWeek;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u0019\u0010\u0001\u001a\u00020\u0000*\u00060\u0002j\u0002`\u00038F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "isoDayNumber", "Ljava/time/DayOfWeek;", "Lkotlinx/datetime/DayOfWeek;", "a", "(I)Ljava/time/DayOfWeek;", "b", "(Ljava/time/DayOfWeek;)I", "kotlinx-datetime"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0757d {

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public class a {
        public static final T9.a<DayOfWeek> a = T9.b.a(DayOfWeek.values());
    }

    @NotNull
    public static final DayOfWeek a(int i) {
        if (1 <= i && i < 8) {
            return (DayOfWeek) a.a.get(i - 1);
        }
        throw new IllegalArgumentException(("Expected ISO day-of-week number in 1..7, got " + i).toString());
    }

    public static final int b(@NotNull DayOfWeek dayOfWeek) {
        Intrinsics.checkNotNullParameter(dayOfWeek, "<this>");
        return dayOfWeek.ordinal() + 1;
    }
}
