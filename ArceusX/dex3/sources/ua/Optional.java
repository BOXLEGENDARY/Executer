package ua;

import com.roblox.client.personasdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import va.C0854b;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0017B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR*\u0010\"\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u0000\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000b0\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Lua/t;", "T", "Lua/s;", "", "onZero", "Lua/o;", "format", "<init>", "(Ljava/lang/String;Lua/o;)V", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lwa/q;", "b", "()Lwa/q;", "Lva/e;", "a", "()Lva/e;", "Ljava/lang/String;", "getOnZero", "Lua/o;", "d", "()Lua/o;", "", "Lua/t$a;", "c", "Ljava/util/List;", "fields", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class Optional<T> implements s<T> {

    @NotNull
    private final String onZero;

    @NotNull
    private final o<T> format;

    @NotNull
    private final List<a<T, ? extends Object>> fields;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u0000 \r*\u0006\b\u0001\u0010\u0001 \u0000*\u0004\b\u0002\u0010\u00022\u00020\u0003:\u0001\tB%\b\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00028\u0002¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u0006\u001a\u00028\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lua/t$a;", "T", "E", "", "Lua/b;", "accessor", "defaultValue", "<init>", "(Lua/b;Ljava/lang/Object;)V", "a", "Lua/b;", "b", "Ljava/lang/Object;", "c", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    private static final class a<T, E> {

        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final InterfaceC0813b<T, E> accessor;

        private final E defaultValue;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\b\"\u0004\b\u0003\u0010\u0004\"\u0004\b\u0004\u0010\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lua/t$a$a;", "", "<init>", "()V", "T", "E", "Lua/n;", "field", "Lua/t$a;", "a", "(Lua/n;)Lua/t$a;", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class Companion {
            public Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final <T, E> a<T, E> a(@NotNull n<? super T, E> field) {
                Intrinsics.checkNotNullParameter(field, "field");
                E eA = field.a();
                if (eA != null) {
                    return new a<>(field.b(), eA, null);
                }
                throw new IllegalArgumentException(("The field '" + field.getName() + "' does not define a default value").toString());
            }

            private Companion() {
            }
        }

        public a(InterfaceC0813b interfaceC0813b, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
            this(interfaceC0813b, obj);
        }

        private a(InterfaceC0813b<? super T, E> interfaceC0813b, E e) {
            this.accessor = interfaceC0813b;
            this.defaultValue = e;
        }
    }

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    class b extends kotlin.jvm.internal.j implements Function1<T, Boolean> {
        b(Object obj) {
            super(1, obj, v.class, "test", "test(Ljava/lang/Object;)Z", 0);
        }

        @NotNull
        public final Boolean invoke(T t) {
            return Boolean.valueOf(((v) ((kotlin.jvm.internal.d) this).receiver).test(t));
        }
    }

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    class c extends kotlin.jvm.internal.j implements Function1<Object, Boolean> {
        c(Object obj) {
            super(1, obj, C0809A.class, "test", "test(Ljava/lang/Object;)Z", 0);
        }

        @NotNull
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(((C0809A) ((kotlin.jvm.internal.d) this).receiver).test(obj));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0006\b\u0000\u0010\u0000 \u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class d extends kotlin.jvm.internal.l implements Function1<T, Unit> {
        final Optional<T> d;

        d(Optional<? super T> optional) {
            super(1);
            this.d = optional;
        }

        public final void a(T t) {
            for (a aVar : ((Optional) this.d).fields) {
                aVar.accessor.c(t, aVar.defaultValue);
            }
        }

        public Object invoke(Object obj) {
            a(obj);
            return Unit.a;
        }
    }

    public Optional(@NotNull String str, @NotNull o<? super T> oVar) {
        Intrinsics.checkNotNullParameter(str, "onZero");
        Intrinsics.checkNotNullParameter(oVar, "format");
        this.onZero = str;
        this.format = oVar;
        List listB = p.b(oVar);
        ArrayList arrayList = new ArrayList(CollectionsKt.t(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(((l) it.next()).c());
        }
        List listG = CollectionsKt.G(arrayList);
        ArrayList arrayList2 = new ArrayList(CollectionsKt.t(listG, 10));
        Iterator<T> it2 = listG.iterator();
        while (it2.hasNext()) {
            arrayList2.add(a.INSTANCE.a((n) it2.next()));
        }
        this.fields = arrayList2;
    }

    @Override
    @NotNull
    public va.e<T> a() {
        va.e<T> eVarA = this.format.a();
        List<a<T, ? extends Object>> list = this.fields;
        ArrayList arrayList = new ArrayList(CollectionsKt.t(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            arrayList.add(new C0818g(aVar.defaultValue, new u(aVar.accessor)));
        }
        v vVarA = w.a(arrayList);
        return vVarA instanceof C0809A ? new va.c(this.onZero) : new C0854b(CollectionsKt.m(new Pair[]{P9.t.a(new b(vVarA), new va.c(this.onZero)), P9.t.a(new c(C0809A.a), eVarA)}));
    }

    @Override
    @NotNull
    public wa.q<T> b() {
        return new wa.q<>(CollectionsKt.j(), CollectionsKt.m(new wa.q[]{this.format.b(), wa.n.b(CollectionsKt.m(new wa.q[]{new ConstantFormatStructure(this.onZero).b(), new wa.q(this.fields.isEmpty() ? CollectionsKt.j() : CollectionsKt.d(new wa.u(new d(this))), CollectionsKt.j())}))}));
    }

    @NotNull
    public final o<T> d() {
        return this.format;
    }

    public boolean equals(Object other) {
        if (other instanceof Optional) {
            Optional optional = (Optional) other;
            if (Intrinsics.b(this.onZero, optional.onZero) && Intrinsics.b(this.format, optional.format)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.onZero.hashCode() * 31) + this.format.hashCode();
    }

    @NotNull
    public String toString() {
        return "Optional(" + this.onZero + ", " + this.format + ')';
    }
}
