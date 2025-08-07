package ha;

import T9.a;
import T9.b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u000b\u0010\nj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"LJ1/a;", "", "", "readEnabled", "writeEnabled", "<init>", "(Ljava/lang/String;IZZ)V", "d", "Z", "e", "()Z", "f", "i", "v", "w", "y", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EnumC0350a {
    private static final a A;
    public static final EnumC0350a i = new EnumC0350a("ENABLED", 0, true, true);
    public static final EnumC0350a v = new EnumC0350a("READ_ONLY", 1, true, false);
    public static final EnumC0350a w = new EnumC0350a("WRITE_ONLY", 2, false, true);
    public static final EnumC0350a y = new EnumC0350a("DISABLED", 3, false, false);
    private static final EnumC0350a[] z;

    private final boolean readEnabled;

    private final boolean writeEnabled;

    static {
        EnumC0350a[] enumC0350aArrC = c();
        z = enumC0350aArrC;
        A = b.a(enumC0350aArrC);
    }

    private EnumC0350a(String str, int i2, boolean z2, boolean z3) {
        this.readEnabled = z2;
        this.writeEnabled = z3;
    }

    private static final EnumC0350a[] c() {
        return new EnumC0350a[]{i, v, w, y};
    }

    public static EnumC0350a valueOf(String str) {
        return (EnumC0350a) Enum.valueOf(EnumC0350a.class, str);
    }

    public static EnumC0350a[] values() {
        return (EnumC0350a[]) z.clone();
    }

    public final boolean getReadEnabled() {
        return this.readEnabled;
    }

    public final boolean getWriteEnabled() {
        return this.writeEnabled;
    }
}
