package ua;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002BS\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u001eR\"\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001f\u001a\u0004\b\u0016\u0010 R\u0017\u0010!\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u001c\u0010\u0015¨\u0006\""}, d2 = {"Lua/B;", "Target", "Lua/a;", "", "Lua/b;", "accessor", "minValue", "maxValue", "", "name", "defaultValue", "Lua/m;", "sign", "<init>", "(Lua/b;IILjava/lang/String;Ljava/lang/Integer;Lua/m;)V", "a", "Lua/b;", "b", "()Lua/b;", "I", "g", "()I", "c", "f", "d", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "e", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "Lua/m;", "()Lua/m;", "maxDigits", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class C0810B<Target> extends AbstractC0812a<Target, Integer> {

    @NotNull
    private final InterfaceC0813b<Target, Integer> accessor;

    private final int minValue;

    private final int maxValue;

    @NotNull
    private final String name;

    private final Integer defaultValue;

    private final m<Target> sign;

    private final int maxDigits;

    public C0810B(InterfaceC0813b interfaceC0813b, int i, int i2, String str, Integer num, m mVar, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC0813b, i, i2, (i3 & 8) != 0 ? interfaceC0813b.getName() : str, (i3 & 16) != 0 ? null : num, (i3 & 32) != 0 ? null : mVar);
    }

    @Override
    @NotNull
    public InterfaceC0813b<Target, Integer> b() {
        return this.accessor;
    }

    @Override
    public m<Target> c() {
        return this.sign;
    }

    @Override
    public Integer a() {
        return this.defaultValue;
    }

    public final int getMaxDigits() {
        return this.maxDigits;
    }

    public final int getMaxValue() {
        return this.maxValue;
    }

    public final int getMinValue() {
        return this.minValue;
    }

    @Override
    @NotNull
    public String getName() {
        return this.name;
    }

    public C0810B(@NotNull InterfaceC0813b<? super Target, Integer> interfaceC0813b, int i, int i2, @NotNull String str, Integer num, m<? super Target> mVar) {
        int i3;
        Intrinsics.checkNotNullParameter(interfaceC0813b, "accessor");
        Intrinsics.checkNotNullParameter(str, "name");
        this.accessor = interfaceC0813b;
        this.minValue = i;
        this.maxValue = i2;
        this.name = str;
        this.defaultValue = num;
        this.sign = mVar;
        if (i2 < 10) {
            i3 = 1;
        } else if (i2 < 100) {
            i3 = 2;
        } else {
            if (i2 >= 1000) {
                throw new IllegalArgumentException("Max value " + i2 + " is too large");
            }
            i3 = 3;
        }
        this.maxDigits = i3;
    }
}
