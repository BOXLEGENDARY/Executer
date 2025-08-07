package androidx.credentials.playservices.controllers.GetSignInIntent;

import android.os.CancellationSignal;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "s", "Landroid/os/CancellationSignal;", "f", "Lkotlin/Function0;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class CredentialProviderGetSignInIntentController$handleResponse$1 extends l implements Function2<CancellationSignal, Function0<? extends Unit>, Unit> {
    public static final CredentialProviderGetSignInIntentController$handleResponse$1 INSTANCE = new CredentialProviderGetSignInIntentController$handleResponse$1();

    CredentialProviderGetSignInIntentController$handleResponse$1() {
        super(2);
    }

    public Object invoke(Object obj, Object obj2) {
        invoke((CancellationSignal) obj, (Function0<Unit>) obj2);
        return Unit.a;
    }

    public final void invoke(CancellationSignal cancellationSignal, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "f");
        CredentialProviderController.Companion companion = CredentialProviderController.INSTANCE;
        CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, function0);
    }
}
