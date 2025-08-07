package E9;

import com.roblox.client.personasdk.R;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.F;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B3\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u0017"}, d2 = {"LE9/b;", "", "", "", "LAa/b;", "standardOperations", "LAa/a;", "functionalOperations", "<init>", "(Ljava/util/Map;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "core"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_loop, 0}, xi = 48)
public final class LogicOperations {

    @NotNull
    private final Map<String, Aa.b> standardOperations;

    @NotNull
    private final Map<String, Aa.a> functionalOperations;

    public LogicOperations() {
        Map map = null;
        this(map, map, 3, map);
    }

    @NotNull
    public final Map<String, Aa.a> a() {
        return this.functionalOperations;
    }

    @NotNull
    public final Map<String, Aa.b> b() {
        return this.standardOperations;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LogicOperations)) {
            return false;
        }
        LogicOperations logicOperations = (LogicOperations) other;
        return Intrinsics.b(this.standardOperations, logicOperations.standardOperations) && Intrinsics.b(this.functionalOperations, logicOperations.functionalOperations);
    }

    public int hashCode() {
        return (this.standardOperations.hashCode() * 31) + this.functionalOperations.hashCode();
    }

    @NotNull
    public String toString() {
        return "LogicOperations(standardOperations=" + this.standardOperations + ", functionalOperations=" + this.functionalOperations + ")";
    }

    public LogicOperations(@NotNull Map<String, ? extends Aa.b> map, @NotNull Map<String, ? extends Aa.a> map2) {
        Intrinsics.checkNotNullParameter(map, "standardOperations");
        Intrinsics.checkNotNullParameter(map2, "functionalOperations");
        this.standardOperations = map;
        this.functionalOperations = map2;
    }

    public LogicOperations(Map map, Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? F.h() : map, (i & 2) != 0 ? F.h() : map2);
    }
}
