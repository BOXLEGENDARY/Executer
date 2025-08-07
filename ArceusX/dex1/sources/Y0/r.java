package Y0;

import Y0.s;
import android.content.Context;
import com.github.luben.zstd.BuildConfig;
import com.google.android.material.checkbox.czZ.GObvYfBKohxpYX;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\b\b\u0000\u0010\u0004*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J?\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\b\b\u0000\u0010\u0004*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LY0/r;", BuildConfig.FLAVOR, "<init>", "()V", "T", "C", "Ljava/lang/Class;", "klass", BuildConfig.FLAVOR, "suffix", "b", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;", "LY0/s;", "Landroid/content/Context;", "context", "LY0/s$a;", "c", "(Landroid/content/Context;Ljava/lang/Class;)LY0/s$a;", "name", "a", "(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)LY0/s$a;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class r {

    public static final r f8088a = new r();

    private r() {
    }

    public static final <T extends s> s.a<T> a(Context context, Class<T> klass, String name) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(klass, "klass");
        if (name == null || StringsKt.Y(name)) {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        return new s.a<>(context, klass, name);
    }

    public static final <T, C> T b(Class<C> klass, String suffix) throws ClassNotFoundException {
        String str;
        Intrinsics.checkNotNullParameter(klass, "klass");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        Package r02 = klass.getPackage();
        Intrinsics.d(r02);
        String name = r02.getName();
        String canonicalName = klass.getCanonicalName();
        Intrinsics.d(canonicalName);
        Intrinsics.checkNotNullExpressionValue(name, "fullPackage");
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
            Intrinsics.checkNotNullExpressionValue(canonicalName, GObvYfBKohxpYX.MLhpLqRsDCHNPkm);
        }
        String str2 = StringsKt.y(canonicalName, '.', '_', false, 4, (Object) null) + suffix;
        try {
            if (name.length() == 0) {
                str = str2;
            } else {
                str = name + '.' + str2;
            }
            Class<?> cls = Class.forName(str, true, klass.getClassLoader());
            Intrinsics.e(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            return (T) cls.getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Cannot find implementation for " + klass.getCanonicalName() + ". " + str2 + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor " + klass.getCanonicalName());
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + klass.getCanonicalName());
        }
    }

    public static final <T extends s> s.a<T> c(Context context, Class<T> klass) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(klass, "klass");
        return new s.a<>(context, klass, null);
    }
}
