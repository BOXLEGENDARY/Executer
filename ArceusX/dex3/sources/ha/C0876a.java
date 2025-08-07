package ha;

import android.content.Context;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lz1/a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lz1/h;", "a", "(Landroid/content/Context;)Lz1/h;", "b", "Lz1/h;", "imageLoader", "Lz1/i;", "c", "Lz1/i;", "imageLoaderFactory", "coil-singleton_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class C0876a {

    @NotNull
    public static final C0876a a = new C0876a();

    private static InterfaceC0883h imageLoader;

    private static InterfaceC0884i imageLoaderFactory;

    private C0876a() {
    }

    @NotNull
    public static final InterfaceC0883h a(@NotNull Context context) {
        InterfaceC0883h interfaceC0883h = imageLoader;
        return interfaceC0883h == null ? a.b(context) : interfaceC0883h;
    }

    private final synchronized InterfaceC0883h b(Context context) {
        InterfaceC0883h interfaceC0883hA;
        try {
            InterfaceC0883h interfaceC0883h = imageLoader;
            if (interfaceC0883h != null) {
                return interfaceC0883h;
            }
            InterfaceC0884i interfaceC0884i = imageLoaderFactory;
            if (interfaceC0884i == null || (interfaceC0883hA = interfaceC0884i.a()) == null) {
                Object applicationContext = context.getApplicationContext();
                InterfaceC0884i interfaceC0884i2 = applicationContext instanceof InterfaceC0884i ? (InterfaceC0884i) applicationContext : null;
                interfaceC0883hA = interfaceC0884i2 != null ? interfaceC0884i2.a() : C0885j.a(context);
            }
            imageLoaderFactory = null;
            imageLoader = interfaceC0883hA;
            return interfaceC0883hA;
        } catch (Throwable th) {
            throw th;
        }
    }
}
