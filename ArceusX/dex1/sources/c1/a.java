package c1;

import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R \u0010\u0006\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0017"}, d2 = {"Lc1/a;", "Lc1/j;", BuildConfig.FLAVOR, "query", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "bindArgs", "<init>", "(Ljava/lang/String;[Ljava/lang/Object;)V", "(Ljava/lang/String;)V", "Lc1/i;", "statement", BuildConfig.FLAVOR, "b", "(Lc1/i;)V", "d", "Ljava/lang/String;", "e", "[Ljava/lang/Object;", "()Ljava/lang/String;", "sql", "i", "a", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a implements j {

    public static final Companion INSTANCE = new Companion(null);

    private final String query;

    private final Object[] bindArgs;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\r\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001\u0018\u00010\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lc1/a$a;", BuildConfig.FLAVOR, "<init>", "()V", "Lc1/i;", "statement", BuildConfig.FLAVOR, "index", "arg", BuildConfig.FLAVOR, "a", "(Lc1/i;ILjava/lang/Object;)V", BuildConfig.FLAVOR, "bindArgs", "b", "(Lc1/i;[Ljava/lang/Object;)V", "sqlite_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void a(i statement, int index, Object arg) {
            if (arg == null) {
                statement.N0(index);
                return;
            }
            if (arg instanceof byte[]) {
                statement.j0(index, (byte[]) arg);
                return;
            }
            if (arg instanceof Float) {
                statement.M(index, ((Number) arg).floatValue());
                return;
            }
            if (arg instanceof Double) {
                statement.M(index, ((Number) arg).doubleValue());
                return;
            }
            if (arg instanceof Long) {
                statement.c0(index, ((Number) arg).longValue());
                return;
            }
            if (arg instanceof Integer) {
                statement.c0(index, ((Number) arg).intValue());
                return;
            }
            if (arg instanceof Short) {
                statement.c0(index, ((Number) arg).shortValue());
                return;
            }
            if (arg instanceof Byte) {
                statement.c0(index, ((Number) arg).byteValue());
                return;
            }
            if (arg instanceof String) {
                statement.B(index, (String) arg);
                return;
            }
            if (arg instanceof Boolean) {
                statement.c0(index, ((Boolean) arg).booleanValue() ? 1L : 0L);
                return;
            }
            throw new IllegalArgumentException("Cannot bind " + arg + " at index " + index + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
        }

        public final void b(i statement, Object[] bindArgs) {
            Intrinsics.checkNotNullParameter(statement, "statement");
            if (bindArgs == null) {
                return;
            }
            int length = bindArgs.length;
            int i7 = 0;
            while (i7 < length) {
                Object obj = bindArgs[i7];
                i7++;
                a(statement, i7, obj);
            }
        }

        private Companion() {
        }
    }

    public a(String str, Object[] objArr) {
        Intrinsics.checkNotNullParameter(str, "query");
        this.query = str;
        this.bindArgs = objArr;
    }

    @Override
    public void b(i statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        INSTANCE.b(statement, this.bindArgs);
    }

    @Override
    public String getQuery() {
        return this.query;
    }

    public a(String str) {
        this(str, null);
        Intrinsics.checkNotNullParameter(str, "query");
    }
}
