package wa;

import com.roblox.client.personasdk.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0011B1\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ-\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Lwa/t;", "Output", "Lwa/o;", "", "", "strings", "Lwa/a;", "setter", "whatThisExpects", "<init>", "(Ljava/util/Collection;Lwa/a;Ljava/lang/String;)V", "storage", "", "input", "", "startIndex", "Lwa/k;", "a", "(Ljava/lang/Object;Ljava/lang/CharSequence;I)Ljava/lang/Object;", "Lwa/a;", "b", "Ljava/lang/String;", "Lwa/t$a;", "c", "Lwa/t$a;", "trie", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class t<Output> implements o<Output> {

    @NotNull
    private final wa.a<Output, String> setter;

    @NotNull
    private final String whatThisExpects;

    @NotNull
    private final a trie;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B-\u0012\u001a\b\u0002\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00000\u00030\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR)\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00000\u00030\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lwa/t$a;", "", "", "Lkotlin/Pair;", "", "children", "", "isTerminal", "<init>", "(Ljava/util/List;Z)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Z", "()Z", "c", "(Z)V", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    private static final class a {

        @NotNull
        private final List<Pair<String, a>> children;

        private boolean isTerminal;

        public a() {
            List list = null;
            this(list, false, 3, list);
        }

        @NotNull
        public final List<Pair<String, a>> a() {
            return this.children;
        }

        public final boolean getIsTerminal() {
            return this.isTerminal;
        }

        public final void c(boolean z) {
            this.isTerminal = z;
        }

        public a(@NotNull List<Pair<String, a>> list, boolean z) {
            Intrinsics.checkNotNullParameter(list, "children");
            this.children = list;
            this.isTerminal = z;
        }

        public a(List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? false : z);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    public static final class b<T> implements Comparator {
        @Override
        public final int compare(T t, T t2) {
            return R9.a.a((String) ((Pair) t).c(), (String) ((Pair) t2).c());
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Output", "", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class c extends kotlin.jvm.internal.l implements Function0<String> {
        final t<Output> d;
        final CharSequence e;
        final int i;
        final w v;

        c(t<Output> tVar, CharSequence charSequence, int i, w wVar) {
            super(0);
            this.d = tVar;
            this.e = charSequence;
            this.i = i;
            this.v = wVar;
        }

        @NotNull
        public final String invoke() {
            return "Expected " + ((t) this.d).whatThisExpects + " but got " + this.e.subSequence(this.i, this.v.d).toString();
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u000e\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00010\u00012\u0006\u0010\u0003\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "", "K", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Integer;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    public static final class d extends kotlin.jvm.internal.l implements Function1<Pair<? extends String, ? extends a>, Integer> {
        final Comparable d;

        public d(Comparable comparable) {
            super(1);
            this.d = comparable;
        }

        @NotNull
        public final Integer invoke(Pair<? extends String, ? extends a> pair) {
            return Integer.valueOf(R9.a.a((String) pair.c(), this.d));
        }
    }

    public t(@NotNull Collection<String> collection, @NotNull wa.a<? super Output, String> aVar, @NotNull String str) {
        Intrinsics.checkNotNullParameter(collection, "strings");
        Intrinsics.checkNotNullParameter(aVar, "setter");
        Intrinsics.checkNotNullParameter(str, "whatThisExpects");
        this.setter = aVar;
        this.whatThisExpects = str;
        List list = null;
        boolean z = false;
        int i = 3;
        this.trie = new a(list, z, i, list);
        for (String str2 : collection) {
            if (str2.length() <= 0) {
                throw new IllegalArgumentException(("Found an empty string in " + this.whatThisExpects).toString());
            }
            a aVar2 = this.trie;
            int length = str2.length();
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = str2.charAt(i2);
                List<Pair<String, a>> listA = aVar2.a();
                int iG = CollectionsKt.g(listA, 0, listA.size(), new d(String.valueOf(cCharAt)));
                if (iG < 0) {
                    a aVar3 = new a(list, z, i, list);
                    aVar2.a().add((-iG) - 1, P9.t.a(String.valueOf(cCharAt), aVar3));
                    aVar2 = aVar3;
                } else {
                    aVar2 = (a) aVar2.a().get(iG).d();
                }
            }
            if (aVar2.getIsTerminal()) {
                throw new IllegalArgumentException(("The string '" + str2 + "' was passed several times").toString());
            }
            aVar2.c(true);
        }
        b(this.trie);
    }

    private static final void b(a aVar) {
        Iterator<Pair<String, a>> it = aVar.a().iterator();
        while (it.hasNext()) {
            b((a) it.next().b());
        }
        ArrayList arrayList = new ArrayList();
        for (Pair<String, a> pair : aVar.a()) {
            String str = (String) pair.a();
            a aVar2 = (a) pair.b();
            if (aVar2.getIsTerminal() || aVar2.a().size() != 1) {
                arrayList.add(P9.t.a(str, aVar2));
            } else {
                Pair pair2 = (Pair) CollectionsKt.i0(aVar2.a());
                String str2 = (String) pair2.a();
                arrayList.add(P9.t.a(str + str2, (a) pair2.b()));
            }
        }
        aVar.a().clear();
        aVar.a().addAll(CollectionsKt.l0(arrayList, new b()));
    }

    @Override
    @org.jetbrains.annotations.NotNull
    public java.lang.Object a(Output r12, @org.jetbrains.annotations.NotNull java.lang.CharSequence r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: wa.t.a(java.lang.Object, java.lang.CharSequence, int):java.lang.Object");
    }
}
