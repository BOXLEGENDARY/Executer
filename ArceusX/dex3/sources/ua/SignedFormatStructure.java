package ua;

import com.roblox.client.personasdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lua/y;", "T", "Lua/s;", "Lua/o;", "format", "", "withPlusSign", "<init>", "(Lua/o;Z)V", "", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lwa/q;", "b", "()Lwa/q;", "Lva/e;", "a", "()Lva/e;", "Lua/o;", "f", "()Lua/o;", "Z", "getWithPlusSign", "()Z", "", "Lua/m;", "c", "Ljava/util/Set;", "fieldSigns", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class SignedFormatStructure<T> implements s<T> {

    @NotNull
    private final o<T> format;

    private final boolean withPlusSign;

    @NotNull
    private final Set<m<T>> fieldSigns;

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    class a extends kotlin.jvm.internal.j implements Function1<T, Boolean> {
        final SignedFormatStructure<T> d;

        a(SignedFormatStructure<? super T> signedFormatStructure) {
            super(1, Intrinsics.a.class, "checkIfAllNegative", "formatter$checkIfAllNegative(Lkotlinx/datetime/internal/format/SignedFormatStructure;Ljava/lang/Object;)Z", 0);
            this.d = signedFormatStructure;
        }

        @NotNull
        public final Boolean invoke(T t) {
            return Boolean.valueOf(SignedFormatStructure.e(this.d, t));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0006\b\u0000\u0010\u0000 \u00002\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "value", "", "isNegative", "", "a", "(Ljava/lang/Object;Z)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class b extends kotlin.jvm.internal.l implements Function2<T, Boolean, Unit> {
        final SignedFormatStructure<T> d;

        b(SignedFormatStructure<? super T> signedFormatStructure) {
            super(2);
            this.d = signedFormatStructure;
        }

        public final void a(T t, boolean z) {
            for (m mVar : ((SignedFormatStructure) this.d).fieldSigns) {
                mVar.a().c(t, Boolean.valueOf(z != Intrinsics.b(mVar.a().a(t), Boolean.TRUE)));
            }
        }

        public Object invoke(Object obj, Object obj2) {
            a(obj, ((Boolean) obj2).booleanValue());
            return Unit.a;
        }
    }

    public SignedFormatStructure(@NotNull o<? super T> oVar, boolean z) {
        Intrinsics.checkNotNullParameter(oVar, "format");
        this.format = oVar;
        this.withPlusSign = z;
        List listB = p.b(oVar);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            m mVarC = ((l) it.next()).c().c();
            if (mVarC != null) {
                arrayList.add(mVarC);
            }
        }
        Set<m<T>> setV0 = CollectionsKt.v0(arrayList);
        this.fieldSigns = setV0;
        if (setV0.isEmpty()) {
            throw new IllegalArgumentException("Signed format must contain at least one field with a sign");
        }
    }

    public static final <T> boolean e(SignedFormatStructure<? super T> signedFormatStructure, T t) {
        boolean z = false;
        for (m<? super T> mVar : ((SignedFormatStructure) signedFormatStructure).fieldSigns) {
            if (Intrinsics.b(mVar.a().a(t), Boolean.TRUE)) {
                z = true;
            } else if (!mVar.b(t)) {
                return false;
            }
        }
        return z;
    }

    @Override
    @NotNull
    public va.e<T> a() {
        return new va.f(this.format.a(), new a(this), this.withPlusSign);
    }

    @Override
    @NotNull
    public wa.q<T> b() {
        return wa.n.b(CollectionsKt.m(new wa.q[]{new wa.q(CollectionsKt.d(new wa.s(new b(this), this.withPlusSign, "sign for " + this.fieldSigns)), CollectionsKt.j()), this.format.b()}));
    }

    public boolean equals(Object other) {
        if (other instanceof SignedFormatStructure) {
            SignedFormatStructure signedFormatStructure = (SignedFormatStructure) other;
            if (Intrinsics.b(this.format, signedFormatStructure.format) && this.withPlusSign == signedFormatStructure.withPlusSign) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final o<T> f() {
        return this.format;
    }

    public int hashCode() {
        return (this.format.hashCode() * 31) + Boolean.hashCode(this.withPlusSign);
    }

    @NotNull
    public String toString() {
        return "SignedFormatStructure(" + this.format + ')';
    }
}
