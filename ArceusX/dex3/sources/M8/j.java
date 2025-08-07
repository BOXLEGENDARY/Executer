package M8;

import com.roblox.client.personasdk.R;
import i8.C0591c;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aG\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001aA\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00028\u00012\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "B", "T", "Li8/c;", "baseScreen", "", "compatibilityKey", "LM8/i;", "b", "(Li8/c;Ljava/lang/Object;Ljava/lang/String;)LM8/i;", "a", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)LM8/i;", "modal_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class j {
    @NotNull
    public static final <B, T> i<B, T> a(@NotNull T t, @NotNull B b, @NotNull String str) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(b, "baseScreen");
        Intrinsics.checkNotNullParameter(str, "compatibilityKey");
        return b(new C0591c(t, CollectionsKt.j()), b, str);
    }

    @NotNull
    public static final <B, T> i<B, T> b(@NotNull C0591c<T> c0591c, @NotNull B b, @NotNull String str) {
        Intrinsics.checkNotNullParameter(c0591c, "<this>");
        Intrinsics.checkNotNullParameter(b, "baseScreen");
        Intrinsics.checkNotNullParameter(str, "compatibilityKey");
        return new i<>(b, CollectionsKt.d(c0591c), str);
    }
}
