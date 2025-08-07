package okio;

import P9.o;
import P9.p;
import ha.m;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u00012\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019¨\u0006\u001a"}, d2 = {"LO1/l;", "Lokhttp3/Callback;", "Lkotlin/Function1;", "", "", "Lkotlinx/coroutines/CompletionHandler;", "Lokhttp3/Call;", "call", "Lha/m;", "Lokhttp3/Response;", "continuation", "<init>", "(Lokhttp3/Call;Lha/m;)V", "response", "onResponse", "(Lokhttp3/Call;Lokhttp3/Response;)V", "Ljava/io/IOException;", "e", "onFailure", "(Lokhttp3/Call;Ljava/io/IOException;)V", "cause", "a", "(Ljava/lang/Throwable;)V", "d", "Lokhttp3/Call;", "Lha/m;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class C0414l implements Callback, Function1<Throwable, Unit> {

    @NotNull
    private final Call call;

    @NotNull
    private final m<Response> continuation;

    public C0414l(@NotNull Call call, @NotNull m<? super Response> mVar) {
        this.call = call;
        this.continuation = mVar;
    }

    public void a(Throwable cause) {
        try {
            this.call.cancel();
        } catch (Throwable unused) {
        }
    }

    public Object invoke(Object obj) {
        a((Throwable) obj);
        return Unit.a;
    }

    public void onFailure(@NotNull Call call, @NotNull IOException e) {
        if (call.isCanceled()) {
            return;
        }
        m<Response> mVar = this.continuation;
        o.a aVar = o.e;
        mVar.resumeWith(o.b(p.a(e)));
    }

    public void onResponse(@NotNull Call call, @NotNull Response response) {
        this.continuation.resumeWith(o.b(response));
    }
}
