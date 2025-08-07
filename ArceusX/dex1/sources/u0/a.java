package u0;

import android.os.Build;
import android.os.ext.SdkExtensions;
import com.github.luben.zstd.BuildConfig;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000f¨\u0006\u0015"}, d2 = {"Lu0/a;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "codename", "buildCodename", BuildConfig.FLAVOR, "a", "(Ljava/lang/String;Ljava/lang/String;)Z", "b", "()Z", "c", "d", BuildConfig.FLAVOR, "I", "R_EXTENSION_INT", "S_EXTENSION_INT", "T_EXTENSION_INT", "e", "AD_SERVICES_EXTENSION_INT", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a {

    public static final a f23878a = new a();

    public static final int R_EXTENSION_INT;

    public static final int S_EXTENSION_INT;

    public static final int T_EXTENSION_INT;

    public static final int AD_SERVICES_EXTENSION_INT;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lu0/a$a;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "extension", "a", "(I)I", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class C0230a {

        public static final C0230a f23883a = new C0230a();

        private C0230a() {
        }

        public final int a(int extension) {
            return SdkExtensions.getExtensionVersion(extension);
        }
    }

    static {
        int i7 = Build.VERSION.SDK_INT;
        R_EXTENSION_INT = i7 >= 30 ? C0230a.f23883a.a(30) : 0;
        S_EXTENSION_INT = i7 >= 30 ? C0230a.f23883a.a(31) : 0;
        T_EXTENSION_INT = i7 >= 30 ? C0230a.f23883a.a(33) : 0;
        AD_SERVICES_EXTENSION_INT = i7 >= 30 ? C0230a.f23883a.a(1000000) : 0;
    }

    private a() {
    }

    public static final boolean a(String codename, String buildCodename) {
        Intrinsics.checkNotNullParameter(codename, "codename");
        Intrinsics.checkNotNullParameter(buildCodename, "buildCodename");
        if (Intrinsics.b("REL", buildCodename)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String upperCase = buildCodename.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String upperCase2 = codename.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase.compareTo(upperCase2) >= 0;
    }

    public static final boolean b() {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 31) {
            if (i7 >= 30) {
                String str = Build.VERSION.CODENAME;
                Intrinsics.checkNotNullExpressionValue(str, "CODENAME");
                if (a("S", str)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean c() {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 33) {
            if (i7 >= 32) {
                String str = Build.VERSION.CODENAME;
                Intrinsics.checkNotNullExpressionValue(str, "CODENAME");
                if (a("Tiramisu", str)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean d() {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 35) {
            if (i7 >= 34) {
                String str = Build.VERSION.CODENAME;
                Intrinsics.checkNotNullExpressionValue(str, "CODENAME");
                if (a("VanillaIceCream", str)) {
                }
            }
            return false;
        }
        return true;
    }
}
