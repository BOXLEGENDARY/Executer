package E1;

import ha.C0361l;
import ha.InterfaceC0883h;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\u0003J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"LE1/i;", "", "LE1/h;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface i {

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001J)\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"LE1/i$a;", "", "T", "data", "LJ1/l;", "options", "Lz1/h;", "imageLoader", "LE1/i;", "a", "(Ljava/lang/Object;LJ1/l;Lz1/h;)LE1/i;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface a<T> {
        i a(@NotNull T data, @NotNull C0361l options, @NotNull InterfaceC0883h imageLoader);
    }

    Object a(@NotNull Continuation<? super h> continuation);
}
