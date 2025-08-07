package androidx.credentials.playservices.controllers;

import B0.InterfaceC0300k;
import C0.c;
import C0.e;
import C0.i;
import C0.k;
import C0.m;
import C0.p;
import android.content.Context;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import com.github.luben.zstd.BuildConfig;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.y;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\b \u0018\u0000 #*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u0001*\b\b\u0002\u0010\u0004*\u00020\u0001*\b\b\u0003\u0010\u0005*\u00020\u0001*\b\b\u0004\u0010\u0006*\u00020\u00012\u00020\u0007:\u0001#B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ[\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\f2\u001c\u0010\u0010\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00028\u00040\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0004¢\u0006\u0004\b\u0018\u0010\u0019J=\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00028\u00002\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u00132\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H&¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00028\u00012\u0006\u0010\u001a\u001a\u00028\u0000H$¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00028\u00032\u0006\u0010 \u001a\u00028\u0002H$¢\u0006\u0004\b!\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"¨\u0006$"}, d2 = {"Landroidx/credentials/playservices/controllers/CredentialProviderController;", BuildConfig.FLAVOR, "T1", "T2", "R2", "R1", "E1", "Landroidx/credentials/playservices/controllers/CredentialProviderBaseController;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "resultData", "Lkotlin/Function2;", BuildConfig.FLAVOR, "conversionFn", "Ljava/util/concurrent/Executor;", "executor", "LB0/k;", "callback", "Landroid/os/CancellationSignal;", "cancellationSignal", BuildConfig.FLAVOR, "maybeReportErrorFromResultReceiver", "(Landroid/os/Bundle;Lkotlin/jvm/functions/Function2;Ljava/util/concurrent/Executor;LB0/k;Landroid/os/CancellationSignal;)Z", "request", BuildConfig.FLAVOR, "invokePlayServices", "(Ljava/lang/Object;LB0/k;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V", "convertRequestToPlayServices", "(Ljava/lang/Object;)Ljava/lang/Object;", "response", "convertResponseToCredentialManager", "Landroid/content/Context;", "Companion", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class CredentialProviderController<T1, T2, R2, R1, E1> extends CredentialProviderBaseController {

    public static final Companion INSTANCE = new Companion(null);
    public static final String ERROR_MESSAGE_START_ACTIVITY_FAILED = "Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.";
    private final Context context;

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JW\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042 \u0010\n\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\t0\u00062\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0018\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0016\u0010\u0017JW\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042 \u0010\n\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\t0\u00062\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\t0\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0005¢\u0006\u0004\b\u001a\u0010\u0011J'\u0010\u001c\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0005¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00128\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Landroidx/credentials/playservices/controllers/CredentialProviderController$Companion;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "resultCode", "Lkotlin/Function2;", "Landroid/os/CancellationSignal;", "Lkotlin/Function0;", BuildConfig.FLAVOR, "cancelOnError", "Lkotlin/Function1;", "LC0/e;", "onError", "cancellationSignal", BuildConfig.FLAVOR, "maybeReportErrorResultCodeCreate", "(ILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroid/os/CancellationSignal;)Z", BuildConfig.FLAVOR, "generateErrorStringUnknown$credentials_play_services_auth_release", "(I)Ljava/lang/String;", "generateErrorStringUnknown", "generateErrorStringCanceled$credentials_play_services_auth_release", "()Ljava/lang/String;", "generateErrorStringCanceled", "LC0/m;", "maybeReportErrorResultCodeGet", "onResultOrException", "cancelOrCallbackExceptionOrResult", "(Landroid/os/CancellationSignal;Lkotlin/jvm/functions/Function0;)V", "ERROR_MESSAGE_START_ACTIVITY_FAILED", "Ljava/lang/String;", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        protected final void cancelOrCallbackExceptionOrResult(CancellationSignal cancellationSignal, Function0<Unit> onResultOrException) {
            Intrinsics.checkNotNullParameter(onResultOrException, "onResultOrException");
            if (CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
                return;
            }
            onResultOrException.invoke();
        }

        public final String generateErrorStringCanceled$credentials_play_services_auth_release() {
            return "activity is cancelled by the user.";
        }

        public final String generateErrorStringUnknown$credentials_play_services_auth_release(int resultCode) {
            return "activity with result code: " + resultCode + " indicating not RESULT_OK";
        }

        protected final boolean maybeReportErrorResultCodeCreate(int resultCode, Function2<? super CancellationSignal, ? super Function0<Unit>, Unit> cancelOnError, Function1<? super e, Unit> onError, CancellationSignal cancellationSignal) {
            Intrinsics.checkNotNullParameter(cancelOnError, "cancelOnError");
            Intrinsics.checkNotNullParameter(onError, "onError");
            if (resultCode == -1) {
                return false;
            }
            y yVar = new y();
            yVar.d = new i(generateErrorStringUnknown$credentials_play_services_auth_release(resultCode));
            if (resultCode == 0) {
                yVar.d = new c(generateErrorStringCanceled$credentials_play_services_auth_release());
            }
            cancelOnError.invoke(cancellationSignal, new CredentialProviderController$Companion$maybeReportErrorResultCodeCreate$1(onError, yVar));
            return true;
        }

        protected final boolean maybeReportErrorResultCodeGet(int resultCode, Function2<? super CancellationSignal, ? super Function0<Unit>, Unit> cancelOnError, Function1<? super m, Unit> onError, CancellationSignal cancellationSignal) {
            Intrinsics.checkNotNullParameter(cancelOnError, "cancelOnError");
            Intrinsics.checkNotNullParameter(onError, "onError");
            if (resultCode == -1) {
                return false;
            }
            y yVar = new y();
            yVar.d = new p(generateErrorStringUnknown$credentials_play_services_auth_release(resultCode));
            if (resultCode == 0) {
                yVar.d = new k(generateErrorStringCanceled$credentials_play_services_auth_release());
            }
            cancelOnError.invoke(cancellationSignal, new CredentialProviderController$Companion$maybeReportErrorResultCodeGet$1(onError, yVar));
            return true;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003\"\b\b\u0002\u0010\u0005*\u00020\u0003\"\b\b\u0003\u0010\u0006*\u00020\u0003\"\b\b\u0004\u0010\u0007*\u00020\u0003H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "T1", BuildConfig.FLAVOR, "T2", "R2", "R1", "E1", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends l implements Function0<Unit> {
        final InterfaceC0300k<R1, E1> $callback;
        final E1 $exception;
        final Executor $executor;

        AnonymousClass1(Executor executor, InterfaceC0300k<R1, E1> interfaceC0300k, E1 e12) {
            super(0);
            this.$executor = executor;
            this.$callback = interfaceC0300k;
            this.$exception = e12;
        }

        public static final void invoke$lambda$0(InterfaceC0300k interfaceC0300k, Object obj) {
            Intrinsics.checkNotNullParameter(interfaceC0300k, "$callback");
            Intrinsics.checkNotNullParameter(obj, "$exception");
            interfaceC0300k.a(obj);
        }

        public Object invoke() {
            m34invoke();
            return Unit.a;
        }

        public final void m34invoke() {
            Executor executor = this.$executor;
            final InterfaceC0300k<R1, E1> interfaceC0300k = this.$callback;
            final E1 e12 = this.$exception;
            executor.execute(new Runnable() {
                @Override
                public final void run() {
                    CredentialProviderController.AnonymousClass1.invoke$lambda$0(interfaceC0300k, e12);
                }
            });
        }
    }

    public CredentialProviderController(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    public static final void cancelOrCallbackExceptionOrResult(CancellationSignal cancellationSignal, Function0<Unit> function0) {
        INSTANCE.cancelOrCallbackExceptionOrResult(cancellationSignal, function0);
    }

    protected static final boolean maybeReportErrorResultCodeCreate(int i7, Function2<? super CancellationSignal, ? super Function0<Unit>, Unit> function2, Function1<? super e, Unit> function1, CancellationSignal cancellationSignal) {
        return INSTANCE.maybeReportErrorResultCodeCreate(i7, function2, function1, cancellationSignal);
    }

    protected static final boolean maybeReportErrorResultCodeGet(int i7, Function2<? super CancellationSignal, ? super Function0<Unit>, Unit> function2, Function1<? super m, Unit> function1, CancellationSignal cancellationSignal) {
        return INSTANCE.maybeReportErrorResultCodeGet(i7, function2, function1, cancellationSignal);
    }

    protected abstract T2 convertRequestToPlayServices(T1 request);

    protected abstract R1 convertResponseToCredentialManager(R2 response);

    public abstract void invokePlayServices(T1 request, InterfaceC0300k<R1, E1> callback, Executor executor, CancellationSignal cancellationSignal);

    public final boolean maybeReportErrorFromResultReceiver(Bundle resultData, Function2<? super String, ? super String, ? extends E1> conversionFn, Executor executor, InterfaceC0300k<R1, E1> callback, CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(resultData, "resultData");
        Intrinsics.checkNotNullParameter(conversionFn, "conversionFn");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!resultData.getBoolean(CredentialProviderBaseController.FAILURE_RESPONSE_TAG)) {
            return false;
        }
        cancelOrCallbackExceptionOrResult(cancellationSignal, new AnonymousClass1(executor, callback, conversionFn.invoke(resultData.getString(CredentialProviderBaseController.EXCEPTION_TYPE_TAG), resultData.getString(CredentialProviderBaseController.EXCEPTION_MESSAGE_TAG))));
        return true;
    }
}
