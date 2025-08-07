package C;

import com.github.luben.zstd.BuildConfig;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import z.C3070z;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"LC/i0;", BuildConfig.FLAVOR, "<init>", "()V", "Lz/z;", "dynamicRangeToTest", BuildConfig.FLAVOR, "fullySpecifiedDynamicRanges", BuildConfig.FLAVOR, "c", "(Lz/z;Ljava/util/Set;)Z", "underSpecifiedDynamicRange", "fullySpecifiedDynamicRange", "d", "(Lz/z;Lz/z;)Z", "a", "b", "camera-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class C0332i0 {

    public static final C0332i0 f608a = new C0332i0();

    private C0332i0() {
    }

    private final boolean a(C3070z dynamicRangeToTest, C3070z fullySpecifiedDynamicRange) {
        x0.g.j(fullySpecifiedDynamicRange.e(), "Fully specified range is not actually fully specified.");
        return dynamicRangeToTest.a() == 0 || dynamicRangeToTest.a() == fullySpecifiedDynamicRange.a();
    }

    private final boolean b(C3070z dynamicRangeToTest, C3070z fullySpecifiedDynamicRange) {
        x0.g.j(fullySpecifiedDynamicRange.e(), "Fully specified range is not actually fully specified.");
        int iB = dynamicRangeToTest.b();
        if (iB == 0) {
            return true;
        }
        int iB2 = fullySpecifiedDynamicRange.b();
        return (iB == 2 && iB2 != 1) || iB == iB2;
    }

    public static final boolean c(C3070z dynamicRangeToTest, Set<C3070z> fullySpecifiedDynamicRanges) {
        Object next;
        Intrinsics.checkNotNullParameter(dynamicRangeToTest, "dynamicRangeToTest");
        Intrinsics.checkNotNullParameter(fullySpecifiedDynamicRanges, "fullySpecifiedDynamicRanges");
        if (dynamicRangeToTest.e()) {
            return fullySpecifiedDynamicRanges.contains(dynamicRangeToTest);
        }
        Iterator<T> it = fullySpecifiedDynamicRanges.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (f608a.d(dynamicRangeToTest, (C3070z) next)) {
                break;
            }
        }
        return next != null;
    }

    private final boolean d(C3070z underSpecifiedDynamicRange, C3070z fullySpecifiedDynamicRange) {
        return a(underSpecifiedDynamicRange, fullySpecifiedDynamicRange) && b(underSpecifiedDynamicRange, fullySpecifiedDynamicRange);
    }
}
