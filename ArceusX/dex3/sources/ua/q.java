package ua;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003BC\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0001\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00018\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\r\u0010\u0016R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019¨\u0006\u001a"}, d2 = {"Lua/q;", "Target", "Type", "Lua/a;", "Lua/b;", "accessor", "", "name", "defaultValue", "Lua/m;", "sign", "<init>", "(Lua/b;Ljava/lang/String;Ljava/lang/Object;Lua/m;)V", "a", "Lua/b;", "b", "()Lua/b;", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "c", "Ljava/lang/Object;", "()Ljava/lang/Object;", "d", "Lua/m;", "()Lua/m;", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class q<Target, Type> extends AbstractC0812a<Target, Type> {

    @NotNull
    private final InterfaceC0813b<Target, Type> accessor;

    @NotNull
    private final String name;

    private final Type defaultValue;

    private final m<Target> sign;

    public q(InterfaceC0813b interfaceC0813b, String str, Object obj, m mVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC0813b, (i & 2) != 0 ? interfaceC0813b.getName() : str, (i & 4) != 0 ? null : obj, (i & 8) != 0 ? null : mVar);
    }

    @Override
    public Type a() {
        return this.defaultValue;
    }

    @Override
    @NotNull
    public InterfaceC0813b<Target, Type> b() {
        return this.accessor;
    }

    @Override
    public m<Target> c() {
        return this.sign;
    }

    @Override
    @NotNull
    public String getName() {
        return this.name;
    }

    public q(@NotNull InterfaceC0813b<? super Target, Type> interfaceC0813b, @NotNull String str, Type type, m<? super Target> mVar) {
        Intrinsics.checkNotNullParameter(interfaceC0813b, "accessor");
        Intrinsics.checkNotNullParameter(str, "name");
        this.accessor = interfaceC0813b;
        this.name = str;
        this.defaultValue = type;
        this.sign = mVar;
    }
}
