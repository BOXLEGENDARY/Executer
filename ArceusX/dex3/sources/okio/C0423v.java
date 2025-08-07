package okio;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"LO1/v;", "", "<init>", "()V", "", "a", "()J", "Lkotlin/Function0;", "b", "Lkotlin/jvm/functions/Function0;", "provider", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class C0423v {

    @NotNull
    public static final C0423v a = new C0423v();

    @NotNull
    private static Function0<Long> provider = a.d;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    class a extends j implements Function0<Long> {
        public static final a d = new a();

        a() {
            super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
        }

        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    private C0423v() {
    }

    public final long a() {
        return ((Number) provider.invoke()).longValue();
    }
}
