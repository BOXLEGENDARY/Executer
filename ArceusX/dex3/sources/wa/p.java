package wa;

import com.roblox.client.personasdk.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a_\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a_\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\r2\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001aK\u0010\u0019\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u0012\"\u0004\b\u0001\u0010\u0013*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u00012\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Output", "", "minDigits", "maxDigits", "spacePadding", "Lwa/a;", "setter", "", "name", "plusOnExceedsWidth", "Lwa/q;", "a", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lwa/a;Ljava/lang/String;Ljava/lang/Integer;)Lwa/q;", "Target", "", "withMinus", "d", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lwa/a;Ljava/lang/String;Z)Lwa/q;", "Object", "Type", "receiver", "value", "position", "nextIndex", "Lwa/k;", "c", "(Lwa/a;Ljava/lang/Object;Ljava/lang/Object;II)Ljava/lang/Object;", "kotlinx-datetime"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class p {

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Object", "Type", "", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class a extends kotlin.jvm.internal.l implements Function0<String> {
        final Type d;
        final Type e;
        final wa.a<Object, Type> i;

        a(Type type, Type type2, wa.a<? super Object, Type> aVar) {
            super(0);
            this.d = type;
            this.e = type2;
            this.i = aVar;
        }

        @NotNull
        public final String invoke() {
            return "Attempting to assign conflicting values '" + this.d + "' and '" + this.e + "' to field '" + this.i.getName() + '\'';
        }
    }

    @NotNull
    public static final <Output> q<Output> a(Integer num, Integer num2, Integer num3, @NotNull wa.a<? super Output, Integer> aVar, @NotNull String str, Integer num4) {
        Intrinsics.checkNotNullParameter(aVar, "setter");
        Intrinsics.checkNotNullParameter(str, "name");
        List listO = CollectionsKt.o(new q[]{d(num, num2, num3, aVar, str, true)});
        if (num4 != null) {
            listO.add(e(num, num4, num3, aVar, str, false, 32, null));
            listO.add(new q(CollectionsKt.m(new o[]{new r("+"), new h(CollectionsKt.d(new v(Integer.valueOf(num4.intValue() + 1), num2, aVar, str, false)))}), CollectionsKt.j()));
        } else {
            listO.add(e(num, num2, num3, aVar, str, false, 32, null));
        }
        return new q<>(CollectionsKt.j(), listO);
    }

    public static final <Object, Type> Object c(wa.a<? super Object, Type> aVar, Object object, Type type, int i, int i2) {
        Type typeC = aVar.c(object, type);
        return typeC == null ? k.INSTANCE.b(i2) : k.INSTANCE.a(i, new a(typeC, type, aVar));
    }

    @NotNull
    public static final <Target> q<Target> d(Integer num, Integer num2, Integer num3, @NotNull wa.a<? super Target, Integer> aVar, @NotNull String str, boolean z) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(aVar, "setter");
        Intrinsics.checkNotNullParameter(str, "name");
        int iIntValue2 = (num != null ? num.intValue() : 1) + (z ? 1 : 0);
        if (num2 != null) {
            iIntValue = num2.intValue();
            if (z) {
                iIntValue++;
            }
        } else {
            iIntValue = Integer.MAX_VALUE;
        }
        int iIntValue3 = num3 != null ? num3.intValue() : 0;
        int iMin = Math.min(iIntValue, iIntValue3);
        if (iIntValue2 >= iMin) {
            return f(z, aVar, str, iIntValue2, iIntValue);
        }
        q<Target> qVarF = f(z, aVar, str, iIntValue2, iIntValue2);
        while (iIntValue2 < iMin) {
            iIntValue2++;
            qVarF = new q<>(CollectionsKt.j(), CollectionsKt.m(new q[]{f(z, aVar, str, iIntValue2, iIntValue2), n.b(CollectionsKt.m(new q[]{new q(CollectionsKt.d(new r(" ")), CollectionsKt.j()), qVarF}))}));
        }
        return iIntValue3 > iIntValue ? n.b(CollectionsKt.m(new q[]{new q(CollectionsKt.d(new r(StringsKt.v(" ", iIntValue3 - iIntValue))), CollectionsKt.j()), qVarF})) : iIntValue3 == iIntValue ? qVarF : new q<>(CollectionsKt.j(), CollectionsKt.m(new q[]{f(z, aVar, str, iIntValue3 + 1, iIntValue), qVarF}));
    }

    public static q e(Integer num, Integer num2, Integer num3, wa.a aVar, String str, boolean z, int i, Object obj) {
        if ((i & 32) != 0) {
            z = false;
        }
        return d(num, num2, num3, aVar, str, z);
    }

    private static final <Target> q<Target> f(boolean z, wa.a<? super Target, Integer> aVar, String str, int i, int i2) {
        if (i2 < (z ? 1 : 0) + 1) {
            throw new IllegalStateException("Check failed.");
        }
        List listC = CollectionsKt.c();
        if (z) {
            listC.add(new r("-"));
        }
        listC.add(new h(CollectionsKt.d(new v(Integer.valueOf(i - (z ? 1 : 0)), Integer.valueOf(i2 - (z ? 1 : 0)), aVar, str, z))));
        return new q<>(CollectionsKt.a(listC), CollectionsKt.j());
    }
}
