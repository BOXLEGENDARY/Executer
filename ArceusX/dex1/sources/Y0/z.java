package Y0;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \f2\u00020\u0001:\u0001\u0005R\u001a\u0010\u0007\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"LY0/z;", "Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/coroutines/d;", "d", "Lkotlin/coroutines/d;", "a", "()Lkotlin/coroutines/d;", "transactionDispatcher", "Lkotlin/coroutines/CoroutineContext$b;", "getKey", "()Lkotlin/coroutines/CoroutineContext$b;", "key", "e", "room-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class z implements CoroutineContext.Element {

    public static final Companion INSTANCE = new Companion(null);

    private final kotlin.coroutines.d transactionDispatcher;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LY0/z$a;", "Lkotlin/coroutines/CoroutineContext$b;", "LY0/z;", "<init>", "()V", "room-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion implements CoroutineContext.b<z> {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public CoroutineContext K(CoroutineContext coroutineContext) {
        return CoroutineContext.Element.a.d(this, coroutineContext);
    }

    public final kotlin.coroutines.d getTransactionDispatcher() {
        return this.transactionDispatcher;
    }

    public <E extends CoroutineContext.Element> E e(CoroutineContext.b<E> bVar) {
        return (E) CoroutineContext.Element.a.b(this, bVar);
    }

    public <R> R f1(R r7, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) CoroutineContext.Element.a.a(this, r7, function2);
    }

    public CoroutineContext.b<z> getKey() {
        return INSTANCE;
    }

    public CoroutineContext n0(CoroutineContext.b<?> bVar) {
        return CoroutineContext.Element.a.c(this, bVar);
    }
}
