package sa;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ra.C0755b;
import ua.C0817f;
import wa.c;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004B\t\b\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0001H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00028\u00018&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0001\u0003\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lsa/a;", "T", "Lwa/c;", "U", "Lsa/n;", "<init>", "()V", "intermediate", "d", "(Lwa/c;)Ljava/lang/Object;", "", "input", "a", "(Ljava/lang/CharSequence;)Ljava/lang/Object;", "Lua/f;", "b", "()Lua/f;", "actualFormat", "c", "()Lwa/c;", "emptyIntermediate", "Lsa/l;", "Lsa/y;", "Lsa/M;", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public abstract class AbstractC0779a<T, U extends wa.c<U>> implements InterfaceC0792n<T> {
    public AbstractC0779a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override
    public T a(@NotNull CharSequence input) {
        String str;
        Intrinsics.checkNotNullParameter(input, "input");
        try {
            try {
                return d(wa.l.c(wa.l.a(b().b()), input, c(), 0, 4, null));
            } catch (IllegalArgumentException e) {
                String message = e.getMessage();
                if (message == null) {
                    str = "The value parsed from '" + ((Object) input) + "' is invalid";
                } else {
                    str = message + " (when parsing '" + ((Object) input) + "')";
                }
                throw new C0755b(str, e);
            }
        } catch (wa.j e2) {
            throw new C0755b("Failed to parse value from '" + ((Object) input) + '\'', e2);
        }
    }

    @NotNull
    public abstract C0817f<U> b();

    @NotNull
    public abstract U c();

    public abstract T d(@NotNull U intermediate);

    private AbstractC0779a() {
    }
}
