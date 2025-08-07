package okio;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.L;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b\"\u0018\u0010\r\u001a\u00020\u0003*\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"\u0018\u0010\u000e\u001a\u00020\u0003*\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\f¨\u0006\u000f"}, d2 = {"LB1/k;", "", "mimeType", "", "c", "(LB1/k;Ljava/lang/String;)Z", "", "a", "Ljava/util/Set;", "RESPECT_PERFORMANCE_MIME_TYPES", "LB1/i;", "b", "(LB1/i;)Z", "isSwapped", "isRotated", "coil-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class m {

    @NotNull
    private static final Set<String> a = L.f(new String[]{"image/jpeg", "image/webp", "image/heic", "image/heif"});

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public class a {
        public static final int[] a;

        static {
            int[] iArr = new int[k.values().length];
            try {
                iArr[k.e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k.i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final boolean a(@NotNull i iVar) {
        return iVar.getRotationDegrees() > 0;
    }

    public static final boolean b(@NotNull i iVar) {
        return iVar.getRotationDegrees() == 90 || iVar.getRotationDegrees() == 270;
    }

    public static final boolean c(@NotNull k kVar, String str) throws P9.m {
        int i = a.a[kVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return false;
            }
            if (i != 3) {
                throw new P9.m();
            }
        } else if (str == null || !a.contains(str)) {
            return false;
        }
        return true;
    }
}
