package ua;

import com.roblox.client.personasdk.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ta.C0804a;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B9\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lua/k;", "Target", "Lua/l;", "Lua/n;", "Lta/a;", "field", "", "minDigits", "maxDigits", "", "zerosToAdd", "<init>", "(Lua/n;IILjava/util/List;)V", "Lva/e;", "a", "()Lva/e;", "Lwa/q;", "b", "()Lwa/q;", "Lua/n;", "c", "()Lua/n;", "I", "d", "Ljava/util/List;", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public abstract class k<Target> implements l<Target> {

    @NotNull
    private final n<Target, C0804a> field;

    private final int minDigits;

    private final int maxDigits;

    @NotNull
    private final List<Integer> zerosToAdd;

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    class a extends kotlin.jvm.internal.j implements Function1<Target, C0804a> {
        a(Object obj) {
            super(1, obj, InterfaceC0813b.class, "getterNotNull", "getterNotNull(Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @NotNull
        public final C0804a invoke(Target target) {
            return (C0804a) ((InterfaceC0813b) ((kotlin.jvm.internal.d) this).receiver).b(target);
        }
    }

    public k(@NotNull n<? super Target, C0804a> nVar, int i, int i2, @NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(nVar, "field");
        Intrinsics.checkNotNullParameter(list, "zerosToAdd");
        this.field = nVar;
        this.minDigits = i;
        this.maxDigits = i2;
        this.zerosToAdd = list;
    }

    @Override
    @NotNull
    public va.e<Target> a() {
        return new va.d(new a(this.field.b()), this.minDigits, this.maxDigits, this.zerosToAdd);
    }

    @Override
    @NotNull
    public wa.q<Target> b() {
        return new wa.q<>(CollectionsKt.d(new wa.h(CollectionsKt.d(new wa.d(this.minDigits, this.maxDigits, this.field.b(), this.field.getName())))), CollectionsKt.j());
    }

    @Override
    @NotNull
    public final n<Target, C0804a> c() {
        return this.field;
    }
}
