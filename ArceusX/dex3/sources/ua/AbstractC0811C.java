package ua;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0013R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013¨\u0006\u0018"}, d2 = {"Lua/C;", "Target", "Lua/l;", "Lua/B;", "field", "", "minDigits", "spacePadding", "<init>", "(Lua/B;ILjava/lang/Integer;)V", "Lva/e;", "a", "()Lva/e;", "Lwa/q;", "b", "()Lwa/q;", "Lua/B;", "getField", "()Lua/B;", "I", "c", "Ljava/lang/Integer;", "d", "maxDigits", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public abstract class AbstractC0811C<Target> implements l<Target> {

    @NotNull
    private final C0810B<Target> field;

    private final int minDigits;

    private final Integer spacePadding;

    private final int maxDigits;

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    class a extends kotlin.jvm.internal.j implements Function1<Target, Integer> {
        a(Object obj) {
            super(1, obj, InterfaceC0813b.class, "getterNotNull", "getterNotNull(Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @NotNull
        public final Integer invoke(Target target) {
            return (Integer) ((InterfaceC0813b) ((kotlin.jvm.internal.d) this).receiver).b(target);
        }
    }

    public AbstractC0811C(@NotNull C0810B<? super Target> c0810b, int i, Integer num) {
        Intrinsics.checkNotNullParameter(c0810b, "field");
        this.field = c0810b;
        this.minDigits = i;
        this.spacePadding = num;
        int maxDigits = c0810b.getMaxDigits();
        this.maxDigits = maxDigits;
        if (i < 0) {
            throw new IllegalArgumentException(("The minimum number of digits (" + i + ") is negative").toString());
        }
        if (maxDigits < i) {
            throw new IllegalArgumentException(("The maximum number of digits (" + maxDigits + ") is less than the minimum number of digits (" + i + ')').toString());
        }
        if (num == null || num.intValue() > i) {
            return;
        }
        throw new IllegalArgumentException(("The space padding (" + num + ") should be more than the minimum number of digits (" + i + ')').toString());
    }

    @Override
    @NotNull
    public va.e<Target> a() {
        va.j jVar = new va.j(new a(this.field.b()), this.minDigits);
        Integer num = this.spacePadding;
        return num != null ? new va.h(jVar, num.intValue()) : jVar;
    }

    @Override
    @NotNull
    public wa.q<Target> b() {
        return wa.p.e(Integer.valueOf(this.minDigits), Integer.valueOf(this.maxDigits), this.spacePadding, this.field.b(), this.field.getName(), false, 32, null);
    }

    @Override
    public n c() {
        return this.field;
    }
}
