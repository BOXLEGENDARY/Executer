package ha;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.F;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.C0405c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00142\u00020\u0001:\u0001\u0007B!\b\u0002\u0012\u0016\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u0007\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R$\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013¨\u0006\u0015"}, d2 = {"LJ1/r;", "", "", "Ljava/lang/Class;", "tags", "<init>", "(Ljava/util/Map;)V", "a", "()Ljava/util/Map;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/Map;", "b", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Tags {

    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Tags c = new Tags(F.h());

    @NotNull
    private final Map<Class<?>, Object> tags;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\u00020\u00072\u0016\u0010\u0006\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LJ1/r$a;", "", "<init>", "()V", "", "Ljava/lang/Class;", "tags", "LJ1/r;", "a", "(Ljava/util/Map;)LJ1/r;", "EMPTY", "LJ1/r;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Tags a(@NotNull Map<Class<?>, ? extends Object> tags) {
            return new Tags(C0405c.b(tags), null);
        }

        private Companion() {
        }
    }

    public Tags(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    @NotNull
    public final Map<Class<?>, Object> a() {
        return this.tags;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Tags) && Intrinsics.b(this.tags, ((Tags) other).tags);
    }

    public int hashCode() {
        return this.tags.hashCode();
    }

    @NotNull
    public String toString() {
        return "Tags(tags=" + this.tags + ')';
    }

    private Tags(Map<Class<?>, ? extends Object> map) {
        this.tags = map;
    }
}
