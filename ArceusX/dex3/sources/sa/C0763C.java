package sa;

import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lsa/C;", "Lua/r;", "Lsa/h;", "Lsa/D;", "names", "<init>", "(Lsa/D;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "d", "Lsa/D;", "kotlinx-datetime"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
final class C0763C extends ua.r<InterfaceC0786h> {

    @NotNull
    private final C0764D names;

    public C0763C(@NotNull C0764D c0764d) {
        super(C0787i.a.c(), c0764d.b(), "monthName");
        Intrinsics.checkNotNullParameter(c0764d, "names");
        this.names = c0764d;
    }

    public boolean equals(Object other) {
        return (other instanceof C0763C) && Intrinsics.b(this.names.b(), ((C0763C) other).names.b());
    }

    public int hashCode() {
        return this.names.b().hashCode();
    }
}
