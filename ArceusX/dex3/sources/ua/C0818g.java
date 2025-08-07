package ua;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\u0006\u0010\u0004\u001a\u00028\u0001\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\"\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lua/g;", "T", "E", "Lua/v;", "expectedValue", "Lkotlin/Function1;", "getter", "<init>", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "value", "", "test", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "b", "Lkotlin/jvm/functions/Function1;", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0818g<T, E> implements v<T> {

    private final E expectedValue;

    @NotNull
    private final Function1<T, E> getter;

    public C0818g(E e, @NotNull Function1<? super T, ? extends E> function1) {
        Intrinsics.checkNotNullParameter(function1, "getter");
        this.expectedValue = e;
        this.getter = function1;
    }

    @Override
    public boolean test(T value) {
        return Intrinsics.b(this.getter.invoke(value), this.expectedValue);
    }
}
