package ua;

import com.roblox.client.personasdk.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "", "Lua/v;", "predicates", "a", "(Ljava/util/List;)Lua/v;", "kotlinx-datetime"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class w {
    @NotNull
    public static final <T> v<T> a(@NotNull List<? extends v<? super T>> list) {
        Intrinsics.checkNotNullParameter(list, "predicates");
        return list.isEmpty() ? C0809A.a : list.size() == 1 ? (v) CollectionsKt.i0(list) : new i(list);
    }
}
