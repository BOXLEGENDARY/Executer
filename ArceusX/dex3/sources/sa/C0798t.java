package sa;

import com.roblox.client.personasdk.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012¨\u0006\u0016"}, d2 = {"Lsa/t;", "Lua/k;", "Lsa/I;", "", "minDigits", "maxDigits", "", "zerosToAdd", "<init>", "(IILjava/util/List;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "e", "I", "f", "g", "a", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0798t extends ua.k<InterfaceC0769I> {

    @NotNull
    private static final List<Integer> h = CollectionsKt.m(new Integer[]{0, 0, 0, 0, 0, 0, 0, 0, 0});

    @NotNull
    private static final List<Integer> i = CollectionsKt.m(new Integer[]{2, 1, 0, 2, 1, 0, 2, 1, 0});

    private final int minDigits;

    private final int maxDigits;

    public C0798t(int i2, int i3, List list, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3, (i4 & 4) != 0 ? h : list);
    }

    public boolean equals(Object other) {
        if (other instanceof C0798t) {
            C0798t c0798t = (C0798t) other;
            if (this.minDigits == c0798t.minDigits && this.maxDigits == c0798t.maxDigits) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.minDigits * 31) + this.maxDigits;
    }

    public C0798t(int i2, int i3, @NotNull List<Integer> list) {
        super(C0770J.a.a(), i2, i3, list);
        Intrinsics.checkNotNullParameter(list, "zerosToAdd");
        this.minDigits = i2;
        this.maxDigits = i3;
    }
}
