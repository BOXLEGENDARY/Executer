package ua;

import com.roblox.client.personasdk.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u000fB+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lua/r;", "Target", "Lua/l;", "Lua/B;", "field", "", "", "values", "name", "<init>", "(Lua/B;Ljava/util/List;Ljava/lang/String;)V", "target", "h", "(Ljava/lang/Object;)Ljava/lang/String;", "Lva/e;", "a", "()Lva/e;", "Lwa/q;", "b", "()Lwa/q;", "Lua/B;", "g", "()Lua/B;", "Ljava/util/List;", "c", "Ljava/lang/String;", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public abstract class r<Target> implements l<Target> {

    @NotNull
    private final C0810B<Target> field;

    @NotNull
    private final List<String> values;

    @NotNull
    private final String name;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0082\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lua/r$a;", "Lwa/a;", "", "<init>", "(Lua/r;)V", "container", "newValue", "d", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    private final class a implements wa.a<Target, String> {
        public a() {
        }

        @Override
        public String c(Target container, @NotNull String newValue) {
            Intrinsics.checkNotNullParameter(newValue, "newValue");
            Integer numC = r.this.g().b().c(container, Integer.valueOf(((r) r.this).values.indexOf(newValue) + r.this.g().getMinValue()));
            if (numC == null) {
                return null;
            }
            r<Target> rVar = r.this;
            return (String) ((r) rVar).values.get(numC.intValue() - rVar.g().getMinValue());
        }

        @Override
        @NotNull
        public String getName() {
            return ((r) r.this).name;
        }
    }

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    class b extends kotlin.jvm.internal.j implements Function1<Target, String> {
        b(Object obj) {
            super(1, obj, r.class, "getStringValue", "getStringValue(Ljava/lang/Object;)Ljava/lang/String;", 0);
        }

        @NotNull
        public final String invoke(Target target) {
            return ((r) ((kotlin.jvm.internal.d) this).receiver).h(target);
        }
    }

    public r(@NotNull C0810B<? super Target> c0810b, @NotNull List<String> list, @NotNull String str) {
        Intrinsics.checkNotNullParameter(c0810b, "field");
        Intrinsics.checkNotNullParameter(list, "values");
        Intrinsics.checkNotNullParameter(str, "name");
        this.field = c0810b;
        this.values = list;
        this.name = str;
        if (list.size() == (c0810b.getMaxValue() - c0810b.getMinValue()) + 1) {
            return;
        }
        throw new IllegalArgumentException(("The number of values (" + list.size() + ") in " + list + " does not match the range of the field (" + ((c0810b.getMaxValue() - c0810b.getMinValue()) + 1) + ')').toString());
    }

    public final String h(Target target) {
        int iIntValue = this.field.b().b(target).intValue();
        String str = (String) CollectionsKt.O(this.values, iIntValue - this.field.getMinValue());
        if (str != null) {
            return str;
        }
        return "The value " + iIntValue + " of " + this.field.getName() + " does not have a corresponding string representation";
    }

    @Override
    @NotNull
    public va.e<Target> a() {
        return new va.i(new b(this));
    }

    @Override
    @NotNull
    public wa.q<Target> b() {
        return new wa.q<>(CollectionsKt.d(new wa.t(this.values, new a(), "one of " + this.values + " for " + this.name)), CollectionsKt.j());
    }

    @Override
    public n c() {
        return this.field;
    }

    @NotNull
    public final C0810B<Target> g() {
        return this.field;
    }
}
