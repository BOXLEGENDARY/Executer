package sa;

import com.roblox.client.personasdk.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0010B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lsa/s;", "", "", "", "names", "<init>", "(Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0797s {

    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final C0797s c = new C0797s(CollectionsKt.m(new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"}));

    @NotNull
    private static final C0797s d = new C0797s(CollectionsKt.m(new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"}));

    @NotNull
    private final List<String> names;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lsa/s$a;", "", "<init>", "()V", "Lsa/s;", "ENGLISH_ABBREVIATED", "Lsa/s;", "a", "()Lsa/s;", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final C0797s a() {
            return C0797s.d;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    class b extends kotlin.jvm.internal.j implements Function1<String, String> {
        public static final b d = new b();

        b() {
            super(1, String.class, "toString", "toString()Ljava/lang/String;", 0);
        }

        @NotNull
        public final String invoke(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "p0");
            return str.toString();
        }
    }

    public C0797s(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "names");
        this.names = list;
        if (list.size() != 7) {
            throw new IllegalArgumentException("Day of week names must contain exactly 7 elements");
        }
        kotlin.collections.D it = CollectionsKt.k(list).iterator();
        while (it.hasNext()) {
            int iA = it.a();
            if (this.names.get(iA).length() <= 0) {
                throw new IllegalArgumentException("A day-of-week name can not be empty");
            }
            for (int i = 0; i < iA; i++) {
                if (Intrinsics.b(this.names.get(iA), this.names.get(i))) {
                    throw new IllegalArgumentException(("Day-of-week names must be unique, but '" + this.names.get(iA) + "' was repeated").toString());
                }
            }
        }
    }

    @NotNull
    public final List<String> b() {
        return this.names;
    }

    public boolean equals(Object other) {
        return (other instanceof C0797s) && Intrinsics.b(this.names, ((C0797s) other).names);
    }

    public int hashCode() {
        return this.names.hashCode();
    }

    @NotNull
    public String toString() {
        return CollectionsKt.U(this.names, ", ", "DayOfWeekNames(", ")", 0, (CharSequence) null, b.d, 24, (Object) null);
    }
}
