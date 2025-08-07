package androidx.credentials.playservices.controllers;

import C0.m;
import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.y;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003\"\b\b\u0002\u0010\u0005*\u00020\u0003\"\b\b\u0003\u0010\u0006*\u00020\u0003\"\b\b\u0004\u0010\u0007*\u00020\u0003H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "T1", BuildConfig.FLAVOR, "T2", "R2", "R1", "E1", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class CredentialProviderController$Companion$maybeReportErrorResultCodeGet$1 extends l implements Function0<Unit> {
    final y<m> $exception;
    final Function1<m, Unit> $onError;

    CredentialProviderController$Companion$maybeReportErrorResultCodeGet$1(Function1<? super m, Unit> function1, y<m> yVar) {
        super(0);
        this.$onError = function1;
        this.$exception = yVar;
    }

    public Object invoke() {
        m32invoke();
        return Unit.a;
    }

    public final void m32invoke() {
        this.$onError.invoke(this.$exception.d);
    }
}
