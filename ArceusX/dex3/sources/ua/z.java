package ua;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002BC\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015¨\u0006\u0018"}, d2 = {"Lua/z;", "Target", "Lua/l;", "Lua/n;", "", "field", "minDigits", "maxDigits", "spacePadding", "outputPlusOnExceededWidth", "<init>", "(Lua/n;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "Lva/e;", "a", "()Lva/e;", "Lwa/q;", "b", "()Lwa/q;", "Lua/n;", "c", "()Lua/n;", "Ljava/lang/Integer;", "d", "e", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public abstract class z<Target> implements l<Target> {

    @NotNull
    private final n<Target, Integer> field;

    private final Integer minDigits;

    private final Integer maxDigits;

    private final Integer spacePadding;

    private final Integer outputPlusOnExceededWidth;

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

    public z(@NotNull n<? super Target, Integer> nVar, Integer num, Integer num2, Integer num3, Integer num4) {
        Intrinsics.checkNotNullParameter(nVar, "field");
        this.field = nVar;
        this.minDigits = num;
        this.maxDigits = num2;
        this.spacePadding = num3;
        this.outputPlusOnExceededWidth = num4;
        if (num != null && num.intValue() < 0) {
            throw new IllegalArgumentException(("The minimum number of digits (" + num + ") is negative").toString());
        }
        if (num2 == null || num == null || num2.intValue() >= num.intValue()) {
            return;
        }
        throw new IllegalArgumentException(("The maximum number of digits (" + num2 + ") is less than the minimum number of digits (" + num + ')').toString());
    }

    @Override
    @NotNull
    public va.e<Target> a() {
        a aVar = new a(this.field.b());
        Integer num = this.minDigits;
        va.g gVar = new va.g(aVar, num != null ? num.intValue() : 0, this.outputPlusOnExceededWidth);
        Integer num2 = this.spacePadding;
        return num2 != null ? new va.h(gVar, num2.intValue()) : gVar;
    }

    @Override
    @NotNull
    public wa.q<Target> b() {
        return wa.p.a(this.minDigits, this.maxDigits, this.spacePadding, this.field.b(), this.field.getName(), this.outputPlusOnExceededWidth);
    }

    @Override
    @NotNull
    public final n<Target, Integer> c() {
        return this.field;
    }
}
