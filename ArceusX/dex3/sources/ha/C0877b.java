package ha;

import E1.i;
import E1.m;
import G1.b;
import H1.d;
import P9.t;
import ha.C0361l;
import ha.InterfaceC0333b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.C0405c;
import okio.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001)B«\u0001\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u00120\u0010\b\u001a,\u0012(\u0012&\u0012\u0014\u0012\u0012\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u0002\u0012(\u0010\n\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u0002\u0012(\u0010\f\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000b\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u0002\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0002¢\u0006\u0004\b\u000f\u0010\u0010B\t\b\u0016¢\u0006\u0004\b\u000f\u0010\u0011J\u001d\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019J?\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00052\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001f\u0010 J?\u0010$\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00052\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b$\u0010%J\r\u0010'\u001a\u00020&¢\u0006\u0004\b'\u0010(R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,RA\u0010\b\u001a,\u0012(\u0012&\u0012\u0014\u0012\u0012\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u00028\u0006¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b.\u0010,R9\u0010\n\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u00028\u0006¢\u0006\f\n\u0004\b+\u0010*\u001a\u0004\b/\u0010,R9\u0010\f\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000b\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00070\u00050\u00028\u0006¢\u0006\f\n\u0004\b/\u0010*\u001a\u0004\b-\u0010,R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00028\u0006¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b)\u0010,¨\u00060"}, d2 = {"Lz1/b;", "", "", "LF1/b;", "interceptors", "Lkotlin/Pair;", "LH1/d;", "Ljava/lang/Class;", "mappers", "LG1/b;", "keyers", "LE1/i$a;", "fetcherFactories", "LB1/h$a;", "decoderFactories", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "()V", "data", "LJ1/l;", "options", "g", "(Ljava/lang/Object;LJ1/l;)Ljava/lang/Object;", "", "f", "(Ljava/lang/Object;LJ1/l;)Ljava/lang/String;", "Lz1/h;", "imageLoader", "", "startIndex", "LE1/i;", "j", "(Ljava/lang/Object;LJ1/l;Lz1/h;I)Lkotlin/Pair;", "LE1/m;", "result", "LB1/h;", "i", "(LE1/m;LJ1/l;Lz1/h;I)Lkotlin/Pair;", "Lz1/b$a;", "h", "()Lz1/b$a;", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "e", "d", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class C0877b {

    @NotNull
    private final List<InterfaceC0333b> interceptors;

    @NotNull
    private final List<Pair<d<? extends Object, ? extends Object>, Class<? extends Object>>> mappers;

    @NotNull
    private final List<Pair<b<? extends Object>, Class<? extends Object>>> keyers;

    @NotNull
    private final List<Pair<i.a<? extends Object>, Class<? extends Object>>> fetcherFactories;

    @NotNull
    private final List<h.a> decoderFactories;

    public C0877b(List list, List list2, List list3, List list4, List list5, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, list3, list4, list5);
    }

    @NotNull
    public final List<h.a> a() {
        return this.decoderFactories;
    }

    @NotNull
    public final List<Pair<i.a<? extends Object>, Class<? extends Object>>> b() {
        return this.fetcherFactories;
    }

    @NotNull
    public final List<InterfaceC0333b> c() {
        return this.interceptors;
    }

    @NotNull
    public final List<Pair<b<? extends Object>, Class<? extends Object>>> d() {
        return this.keyers;
    }

    @NotNull
    public final List<Pair<d<? extends Object, ? extends Object>, Class<? extends Object>>> e() {
        return this.mappers;
    }

    public final String f(@NotNull Object data, @NotNull C0361l options) {
        List<Pair<b<? extends Object>, Class<? extends Object>>> list = this.keyers;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Pair<b<? extends Object>, Class<? extends Object>> pair = list.get(i);
            b bVar = (b) pair.a();
            if (((Class) pair.b()).isAssignableFrom(data.getClass())) {
                Intrinsics.e(bVar, "null cannot be cast to non-null type coil.key.Keyer<kotlin.Any>");
                String strA = bVar.a(data, options);
                if (strA != null) {
                    return strA;
                }
            }
        }
        return null;
    }

    @NotNull
    public final Object g(@NotNull Object data, @NotNull C0361l options) {
        List<Pair<d<? extends Object, ? extends Object>, Class<? extends Object>>> list = this.mappers;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Pair<d<? extends Object, ? extends Object>, Class<? extends Object>> pair = list.get(i);
            d dVar = (d) pair.a();
            if (((Class) pair.b()).isAssignableFrom(data.getClass())) {
                Intrinsics.e(dVar, "null cannot be cast to non-null type coil.map.Mapper<kotlin.Any, *>");
                Object objA = dVar.a(data, options);
                if (objA != null) {
                    data = objA;
                }
            }
        }
        return data;
    }

    @NotNull
    public final a h() {
        return new a(this);
    }

    public final Pair<h, Integer> i(@NotNull m result, @NotNull C0361l options, @NotNull InterfaceC0883h imageLoader, int startIndex) {
        int size = this.decoderFactories.size();
        while (startIndex < size) {
            h hVarA = this.decoderFactories.get(startIndex).a(result, options, imageLoader);
            if (hVarA != null) {
                return t.a(hVarA, Integer.valueOf(startIndex));
            }
            startIndex++;
        }
        return null;
    }

    public final Pair<i, Integer> j(@NotNull Object data, @NotNull C0361l options, @NotNull InterfaceC0883h imageLoader, int startIndex) {
        int size = this.fetcherFactories.size();
        while (startIndex < size) {
            Pair<i.a<? extends Object>, Class<? extends Object>> pair = this.fetcherFactories.get(startIndex);
            i.a aVar = (i.a) pair.a();
            if (((Class) pair.b()).isAssignableFrom(data.getClass())) {
                Intrinsics.e(aVar, "null cannot be cast to non-null type coil.fetch.Fetcher.Factory<kotlin.Any>");
                i iVarA = aVar.a(data, options, imageLoader);
                if (iVarA != null) {
                    return t.a(iVarA, Integer.valueOf(startIndex));
                }
            }
            startIndex++;
        }
        return null;
    }

    private C0877b(List<? extends InterfaceC0333b> list, List<? extends Pair<? extends d<? extends Object, ? extends Object>, ? extends Class<? extends Object>>> list2, List<? extends Pair<? extends b<? extends Object>, ? extends Class<? extends Object>>> list3, List<? extends Pair<? extends i.a<? extends Object>, ? extends Class<? extends Object>>> list4, List<? extends h.a> list5) {
        this.interceptors = list;
        this.mappers = list2;
        this.keyers = list3;
        this.fetcherFactories = list4;
        this.decoderFactories = list5;
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J7\u0010\f\u001a\u00020\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00012\u0010\u0010\t\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\f\u0010\rJ3\u0010\u0010\u001a\u00020\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\u0010\u0010\u0011J3\u0010\u0014\u001a\u00020\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aR \u0010 \u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR@\u0010#\u001a(\u0012$\u0012\"\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\u0002\b\u00030\b\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\n0!0\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001d\u001a\u0004\b\"\u0010\u001fR<\u0010%\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\n0!0\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b$\u0010\u001fR<\u0010'\u001a$\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\n0!0\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b&\u0010\u001fR \u0010)\u001a\b\u0012\u0004\u0012\u00020\u00160\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001d\u001a\u0004\b(\u0010\u001f¨\u0006*"}, d2 = {"Lz1/b$a;", "", "<init>", "()V", "Lz1/b;", "registry", "(Lz1/b;)V", "T", "LH1/d;", "mapper", "Ljava/lang/Class;", "type", "d", "(LH1/d;Ljava/lang/Class;)Lz1/b$a;", "LG1/b;", "keyer", "c", "(LG1/b;Ljava/lang/Class;)Lz1/b$a;", "LE1/i$a;", "factory", "b", "(LE1/i$a;Ljava/lang/Class;)Lz1/b$a;", "LB1/h$a;", "a", "(LB1/h$a;)Lz1/b$a;", "e", "()Lz1/b;", "", "LF1/b;", "Ljava/util/List;", "getInterceptors$coil_base_release", "()Ljava/util/List;", "interceptors", "Lkotlin/Pair;", "getMappers$coil_base_release", "mappers", "getKeyers$coil_base_release", "keyers", "g", "fetcherFactories", "f", "decoderFactories", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        @NotNull
        private final List<InterfaceC0333b> interceptors;

        @NotNull
        private final List<Pair<d<? extends Object, ?>, Class<? extends Object>>> mappers;

        @NotNull
        private final List<Pair<b<? extends Object>, Class<? extends Object>>> keyers;

        @NotNull
        private final List<Pair<i.a<? extends Object>, Class<? extends Object>>> fetcherFactories;

        @NotNull
        private final List<h.a> decoderFactories;

        public a() {
            this.interceptors = new ArrayList();
            this.mappers = new ArrayList();
            this.keyers = new ArrayList();
            this.fetcherFactories = new ArrayList();
            this.decoderFactories = new ArrayList();
        }

        @NotNull
        public final a a(@NotNull h.a factory) {
            this.decoderFactories.add(factory);
            return this;
        }

        @NotNull
        public final <T> a b(@NotNull i.a<T> factory, @NotNull Class<T> type) {
            this.fetcherFactories.add(t.a(factory, type));
            return this;
        }

        @NotNull
        public final <T> a c(@NotNull b<T> keyer, @NotNull Class<T> type) {
            this.keyers.add(t.a(keyer, type));
            return this;
        }

        @NotNull
        public final <T> a d(@NotNull d<T, ?> mapper, @NotNull Class<T> type) {
            this.mappers.add(t.a(mapper, type));
            return this;
        }

        @NotNull
        public final C0877b e() {
            return new C0877b(C0405c.a(this.interceptors), C0405c.a(this.mappers), C0405c.a(this.keyers), C0405c.a(this.fetcherFactories), C0405c.a(this.decoderFactories), null);
        }

        @NotNull
        public final List<h.a> f() {
            return this.decoderFactories;
        }

        @NotNull
        public final List<Pair<i.a<? extends Object>, Class<? extends Object>>> g() {
            return this.fetcherFactories;
        }

        public a(@NotNull C0877b c0877b) {
            this.interceptors = CollectionsKt.t0(c0877b.c());
            this.mappers = CollectionsKt.t0(c0877b.e());
            this.keyers = CollectionsKt.t0(c0877b.d());
            this.fetcherFactories = CollectionsKt.t0(c0877b.b());
            this.decoderFactories = CollectionsKt.t0(c0877b.a());
        }
    }

    public C0877b() {
        this(CollectionsKt.j(), CollectionsKt.j(), CollectionsKt.j(), CollectionsKt.j(), CollectionsKt.j());
    }
}
