package a1;

import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\"\"\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u0012\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Ljava/lang/StringBuilder;", "b", "()Ljava/lang/StringBuilder;", "builder", BuildConfig.FLAVOR, "count", BuildConfig.FLAVOR, "a", "(Ljava/lang/StringBuilder;I)V", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "[Ljava/lang/String;", "getEMPTY_STRING_ARRAY$annotations", "()V", "EMPTY_STRING_ARRAY", "room-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class d {

    public static final String[] f8256a = new String[0];

    public static final void a(StringBuilder sb, int i7) {
        Intrinsics.checkNotNullParameter(sb, "builder");
        for (int i8 = 0; i8 < i7; i8++) {
            sb.append("?");
            if (i8 < i7 - 1) {
                sb.append(",");
            }
        }
    }

    public static final StringBuilder b() {
        return new StringBuilder();
    }
}
