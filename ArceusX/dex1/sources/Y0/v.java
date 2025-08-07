package Y0;

import com.github.luben.zstd.BuildConfig;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0010\u0013\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\f\b\u0007\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001EB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0006J\u001f\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\nH\u0016¢\u0006\u0004\b \u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010+\u001a\u00020'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u0012\u0004\b*\u0010\u000eR\u001a\u00100\u001a\u00020,8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u0012\u0004\b/\u0010\u000eR\"\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0007018\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u00103\u0012\u0004\b4\u0010\u000eR\"\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d018\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u00107\u0012\u0004\b8\u0010\u000eR\u001a\u0010>\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b;\u0010<\u0012\u0004\b=\u0010\u000eR$\u0010B\u001a\u00020\u00032\u0006\u0010?\u001a\u00020\u00038\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b@\u0010\"\u001a\u0004\bA\u0010$R\u0014\u0010D\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010C¨\u0006F"}, d2 = {"LY0/v;", "Lc1/j;", "Lc1/i;", BuildConfig.FLAVOR, "capacity", "<init>", "(I)V", BuildConfig.FLAVOR, "query", "initArgCount", BuildConfig.FLAVOR, "m", "(Ljava/lang/String;I)V", "u", "()V", "statement", "b", "(Lc1/i;)V", "index", "N0", BuildConfig.FLAVOR, "value", "c0", "(IJ)V", BuildConfig.FLAVOR, "M", "(ID)V", "B", "(ILjava/lang/String;)V", BuildConfig.FLAVOR, "j0", "(I[B)V", "close", "d", "I", "getCapacity", "()I", "e", "Ljava/lang/String;", BuildConfig.FLAVOR, "i", "[J", "getLongBindings$annotations", "longBindings", BuildConfig.FLAVOR, "v", "[D", "getDoubleBindings$annotations", "doubleBindings", BuildConfig.FLAVOR, "w", "[Ljava/lang/String;", "getStringBindings$annotations", "stringBindings", "y", "[[B", "getBlobBindings$annotations", "blobBindings", BuildConfig.FLAVOR, "z", "[I", "getBindingTypes$annotations", "bindingTypes", "<set-?>", "A", "j", "argCount", "()Ljava/lang/String;", "sql", "a", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class v implements c1.j, c1.i {

    public static final Companion INSTANCE = new Companion(null);

    public static final TreeMap<Integer, v> f8143C = new TreeMap<>();

    private int argCount;

    private final int capacity;

    private volatile String query;

    public final long[] longBindings;

    public final double[] doubleBindings;

    public final String[] stringBindings;

    public final byte[][] blobBindings;

    private final int[] bindingTypes;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\u0003R\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000e¨\u0006\u0013"}, d2 = {"LY0/v$a;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "query", BuildConfig.FLAVOR, "argumentCount", "LY0/v;", "a", "(Ljava/lang/String;I)LY0/v;", BuildConfig.FLAVOR, "b", "BLOB", "I", "DOUBLE", "LONG", "NULL", "STRING", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final v a(String query, int argumentCount) {
            Intrinsics.checkNotNullParameter(query, "query");
            TreeMap<Integer, v> treeMap = v.f8143C;
            synchronized (treeMap) {
                Map.Entry<Integer, v> entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(argumentCount));
                if (entryCeilingEntry == null) {
                    Unit unit = Unit.a;
                    v vVar = new v(argumentCount, null);
                    vVar.m(query, argumentCount);
                    return vVar;
                }
                treeMap.remove(entryCeilingEntry.getKey());
                v value = entryCeilingEntry.getValue();
                value.m(query, argumentCount);
                Intrinsics.checkNotNullExpressionValue(value, "sqliteQuery");
                return value;
            }
        }

        public final void b() {
            TreeMap<Integer, v> treeMap = v.f8143C;
            if (treeMap.size() <= 15) {
                return;
            }
            int size = treeMap.size() - 10;
            Iterator<Integer> it = treeMap.descendingKeySet().iterator();
            Intrinsics.checkNotNullExpressionValue(it, "queryPool.descendingKeySet().iterator()");
            while (true) {
                int i7 = size - 1;
                if (size <= 0) {
                    return;
                }
                it.next();
                it.remove();
                size = i7;
            }
        }

        private Companion() {
        }
    }

    public v(int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(i7);
    }

    public static final v f(String str, int i7) {
        return INSTANCE.a(str, i7);
    }

    @Override
    public void B(int index, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.bindingTypes[index] = 4;
        this.stringBindings[index] = value;
    }

    @Override
    public void M(int index, double value) {
        this.bindingTypes[index] = 3;
        this.doubleBindings[index] = value;
    }

    @Override
    public void N0(int index) {
        this.bindingTypes[index] = 1;
    }

    @Override
    public void b(c1.i statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        int argCount = getArgCount();
        if (1 > argCount) {
            return;
        }
        int i7 = 1;
        while (true) {
            int i8 = this.bindingTypes[i7];
            if (i8 == 1) {
                statement.N0(i7);
            } else if (i8 == 2) {
                statement.c0(i7, this.longBindings[i7]);
            } else if (i8 == 3) {
                statement.M(i7, this.doubleBindings[i7]);
            } else if (i8 == 4) {
                String str = this.stringBindings[i7];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.B(i7, str);
            } else if (i8 == 5) {
                byte[] bArr = this.blobBindings[i7];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.j0(i7, bArr);
            }
            if (i7 == argCount) {
                return;
            } else {
                i7++;
            }
        }
    }

    @Override
    public void c0(int index, long value) {
        this.bindingTypes[index] = 2;
        this.longBindings[index] = value;
    }

    @Override
    public void close() {
    }

    @Override
    public String e() {
        String str = this.query;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public int getArgCount() {
        return this.argCount;
    }

    @Override
    public void j0(int index, byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.bindingTypes[index] = 5;
        this.blobBindings[index] = value;
    }

    public final void m(String query, int initArgCount) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.query = query;
        this.argCount = initArgCount;
    }

    public final void u() {
        TreeMap<Integer, v> treeMap = f8143C;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.capacity), this);
            INSTANCE.b();
            Unit unit = Unit.a;
        }
    }

    private v(int i7) {
        this.capacity = i7;
        int i8 = i7 + 1;
        this.bindingTypes = new int[i8];
        this.longBindings = new long[i8];
        this.doubleBindings = new double[i8];
        this.stringBindings = new String[i8];
        this.blobBindings = new byte[i8][];
    }
}
