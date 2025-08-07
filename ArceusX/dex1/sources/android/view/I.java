package android.view;

import android.content.res.Resources;
import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B5\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0015\u0010\u0014R&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/activity/I;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "lightScrim", "darkScrim", "nightMode", "Lkotlin/Function1;", "Landroid/content/res/Resources;", BuildConfig.FLAVOR, "detectDarkMode", "<init>", "(IIILkotlin/jvm/functions/Function1;)V", "isDark", "d", "(Z)I", "e", "a", "I", "b", "getDarkScrim$activity_release", "()I", "c", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class I {

    public static final Companion INSTANCE = new Companion(null);

    private final int lightScrim;

    private final int darkScrim;

    private final int nightMode;

    private final Function1<Resources, Boolean> detectDarkMode;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/activity/I$a;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "lightScrim", "darkScrim", "Lkotlin/Function1;", "Landroid/content/res/Resources;", BuildConfig.FLAVOR, "detectDarkMode", "Landroidx/activity/I;", "b", "(IILkotlin/jvm/functions/Function1;)Landroidx/activity/I;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/res/Resources;", "resources", BuildConfig.FLAVOR, "a", "(Landroid/content/res/Resources;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        static final class C0065a extends l implements Function1<Resources, Boolean> {

            public static final C0065a f8415d = new C0065a();

            C0065a() {
                super(1);
            }

            public final Boolean invoke(Resources resources) {
                Intrinsics.checkNotNullParameter(resources, "resources");
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            }
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static I c(Companion companion, int i7, int i8, Function1 function1, int i9, Object obj) {
            if ((i9 & 4) != 0) {
                function1 = C0065a.f8415d;
            }
            return companion.b(i7, i8, function1);
        }

        public final I a(int i7, int i8) {
            return c(this, i7, i8, null, 4, null);
        }

        public final I b(int lightScrim, int darkScrim, Function1<? super Resources, Boolean> detectDarkMode) {
            Intrinsics.checkNotNullParameter(detectDarkMode, "detectDarkMode");
            return new I(lightScrim, darkScrim, 0, detectDarkMode, null);
        }

        private Companion() {
        }
    }

    public I(int i7, int i8, int i9, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(i7, i8, i9, function1);
    }

    public static final I a(int i7, int i8) {
        return INSTANCE.a(i7, i8);
    }

    public final Function1<Resources, Boolean> b() {
        return this.detectDarkMode;
    }

    public final int getNightMode() {
        return this.nightMode;
    }

    public final int d(boolean isDark) {
        return isDark ? this.darkScrim : this.lightScrim;
    }

    public final int e(boolean isDark) {
        if (this.nightMode == 0) {
            return 0;
        }
        return isDark ? this.darkScrim : this.lightScrim;
    }

    private I(int i7, int i8, int i9, Function1<? super Resources, Boolean> function1) {
        this.lightScrim = i7;
        this.darkScrim = i8;
        this.nightMode = i9;
        this.detectDarkMode = function1;
    }
}
