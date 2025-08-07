package ka;

import P9.h;
import P9.i;
import com.roblox.client.personasdk.R;
import fa.a;
import fa.m;
import java.io.EOFException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import kotlin.sequences.Sequence;
import kotlin.sequences.g;
import okio.e;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \"2\u00020\u0001:\u0001\u0016B1\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0000\u0012\u0012\b\u0002\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001e\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001e\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u000eR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00000\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010 ¨\u0006#"}, d2 = {"Lf8/s;", "", "Lfa/a;", "type", "proxiedIdentifier", "Lkotlin/Function0;", "", "description", "<init>", "(Lfa/a;Lf8/s;Lkotlin/jvm/functions/Function0;)V", "Lokio/h;", "e", "()Lokio/h;", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Lfa/a;", "b", "Lf8/s;", "c", "Lkotlin/jvm/functions/Function0;", "d", "LP9/h;", "typeName", "Lkotlin/sequences/Sequence;", "Lkotlin/sequences/Sequence;", "proxiedIdentifiers", "f", "wf1-workflow-core"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
public final class s {

    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final a type;

    private final s proxiedIdentifier;

    private final Function0<String> description;

    @NotNull
    private final h typeName;

    @NotNull
    private final Sequence<s> proxiedIdentifiers;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lf8/s$a;", "", "<init>", "()V", "Lokio/h;", "bytes", "Lf8/s;", "a", "(Lokio/h;)Lf8/s;", "", "NO_PROXY_IDENTIFIER_TAG", "B", "PROXY_IDENTIFIER_TAG", "wf1-workflow-core"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final s a(@NotNull okio.h bytes) {
            s sVarA;
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            e eVar = new e();
            eVar.k1(bytes);
            try {
                String strB = C0572j.b(eVar);
                byte b = eVar.readByte();
                if (b == 0) {
                    sVarA = null;
                } else {
                    if (b != 1) {
                        throw new IllegalArgumentException("Invalid WorkflowIdentifier");
                    }
                    sVarA = s.INSTANCE.a(eVar.C0());
                }
                return new s(Z9.a.c(Class.forName(strB)), sVarA, null, 4, null);
            } catch (EOFException unused) {
                throw new IllegalArgumentException("Invalid WorkflowIdentifier");
            }
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lf8/s;", "it", "a", "(Lf8/s;)Lf8/s;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0})
    static final class b extends l implements Function1<s, s> {
        public static final b d = new b();

        b() {
            super(1);
        }

        public final s invoke(@NotNull s sVar) {
            Intrinsics.checkNotNullParameter(sVar, "it");
            return sVar.proxiedIdentifier;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lf8/s;", "it", "", "a", "(Lf8/s;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0})
    static final class c extends l implements Function1<s, CharSequence> {
        public static final c d = new c();

        c() {
            super(1);
        }

        @NotNull
        public final CharSequence invoke(@NotNull s sVar) {
            Intrinsics.checkNotNullParameter(sVar, "it");
            return sVar.d();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "kotlin.jvm.PlatformType", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0})
    static final class d extends l implements Function0<String> {
        d() {
            super(0);
        }

        public final String invoke() {
            return s.this.type instanceof fa.c ? Z9.a.a(s.this.type).getName() : s.this.type.toString();
        }
    }

    public s(@NotNull a aVar, s sVar, Function0<String> function0) {
        Intrinsics.checkNotNullParameter(aVar, "type");
        this.type = aVar;
        this.proxiedIdentifier = sVar;
        this.description = function0;
        if (!(aVar instanceof fa.c) && (!(aVar instanceof m) || !(((m) aVar).c() instanceof fa.c))) {
            throw new IllegalArgumentException(Intrinsics.m("Expected type to be either a KClass or a KType with a KClass classifier, but was ", aVar).toString());
        }
        this.typeName = i.a(P9.l.e, new d());
        this.proxiedIdentifiers = g.d(this, b.d);
    }

    public final String d() {
        Object value = this.typeName.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-typeName>(...)");
        return (String) value;
    }

    public final okio.h e() {
        okio.h hVar = null;
        if (!(this.type instanceof fa.c)) {
            return null;
        }
        s sVar = this.proxiedIdentifier;
        if (sVar != null) {
            okio.h hVarE = sVar.e();
            if (hVarE == null) {
                return null;
            }
            hVar = hVarE;
        }
        e eVar = new e();
        C0572j.d(eVar, d());
        if (hVar != null) {
            eVar.y1(1);
            eVar.k1(hVar);
        } else {
            eVar.y1(0);
        }
        return eVar.C0();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof s) {
            s sVar = (s) other;
            if (Intrinsics.b(this.type, sVar.type) && Intrinsics.b(this.proxiedIdentifier, sVar.proxiedIdentifier)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        s sVar = this.proxiedIdentifier;
        return iHashCode + (sVar == null ? 0 : sVar.hashCode());
    }

    @NotNull
    public String toString() {
        Function0<String> function0 = this.description;
        String str = function0 == null ? null : (String) function0.invoke();
        if (str != null) {
            return str;
        }
        return "WorkflowIdentifier(" + g.p(this.proxiedIdentifiers, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, c.d, 31, (Object) null) + ')';
    }

    public s(a aVar, s sVar, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i & 2) != 0 ? null : sVar, (i & 4) != 0 ? null : function0);
    }
}
