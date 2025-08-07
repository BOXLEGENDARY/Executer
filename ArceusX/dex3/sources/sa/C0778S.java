package sa;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lsa/S;", "Lua/z;", "Lsa/h;", "Lsa/F;", "padding", "", "isYearOfEra", "<init>", "(Lsa/F;Z)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "f", "Lsa/F;", "g", "Z", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
final class C0778S extends ua.z<InterfaceC0786h> {

    @NotNull
    private final EnumC0766F padding;

    private final boolean isYearOfEra;

    public C0778S(EnumC0766F enumC0766F, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC0766F, (i & 2) != 0 ? false : z);
    }

    public boolean equals(Object other) {
        if (other instanceof C0778S) {
            C0778S c0778s = (C0778S) other;
            if (this.padding == c0778s.padding && this.isYearOfEra == c0778s.isYearOfEra) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.padding.hashCode() * 31) + Boolean.hashCode(this.isYearOfEra);
    }

    public C0778S(@NotNull EnumC0766F enumC0766F, boolean z) {
        super(C0787i.a.d(), Integer.valueOf(enumC0766F != EnumC0766F.e ? 1 : 4), null, enumC0766F == EnumC0766F.i ? 4 : null, 4);
        Intrinsics.checkNotNullParameter(enumC0766F, "padding");
        this.padding = enumC0766F;
        this.isYearOfEra = z;
    }
}
