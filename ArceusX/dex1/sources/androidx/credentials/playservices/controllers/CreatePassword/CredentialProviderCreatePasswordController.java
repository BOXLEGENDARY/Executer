package androidx.credentials.playservices.controllers.CreatePassword;

import B0.AbstractC0292c;
import B0.C0294e;
import B0.C0295f;
import B0.InterfaceC0300k;
import C0.e;
import C0.i;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.HiddenActivity;
import androidx.credentials.playservices.controllers.BeginSignIn.ip.KwdswzaUHE;
import androidx.credentials.playservices.controllers.CreatePassword.CredentialProviderCreatePasswordController;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import com.github.luben.zstd.BuildConfig;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.SignInPassword;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000G\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\b\u0005*\u0001&\b\u0000\u0018\u0000 )2 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001:\u0001)B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001fR(\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\f8\u0002@\u0002X\u0083.¢\u0006\f\n\u0004\b\r\u0010 \u0012\u0004\b!\u0010\"R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010#R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u0011\u0010$\u0012\u0004\b%\u0010\"R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006*"}, d2 = {"Landroidx/credentials/playservices/controllers/CreatePassword/CredentialProviderCreatePasswordController;", "Landroidx/credentials/playservices/controllers/CredentialProviderController;", "LB0/e;", "Lcom/google/android/gms/auth/api/identity/SavePasswordRequest;", BuildConfig.FLAVOR, "LB0/c;", "LC0/e;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "request", "LB0/k;", "callback", "Ljava/util/concurrent/Executor;", "executor", "Landroid/os/CancellationSignal;", "cancellationSignal", "invokePlayServices", "(LB0/e;LB0/k;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V", BuildConfig.FLAVOR, "uniqueRequestCode", "resultCode", "handleResponse$credentials_play_services_auth_release", "(II)V", "handleResponse", "convertRequestToPlayServices", "(LB0/e;)Lcom/google/android/gms/auth/api/identity/SavePasswordRequest;", "response", "convertResponseToCredentialManager", "(Lkotlin/Unit;)LB0/c;", "Landroid/content/Context;", "LB0/k;", "getCallback$annotations", "()V", "Ljava/util/concurrent/Executor;", "Landroid/os/CancellationSignal;", "getCancellationSignal$annotations", "androidx/credentials/playservices/controllers/CreatePassword/CredentialProviderCreatePasswordController$resultReceiver$1", "resultReceiver", "Landroidx/credentials/playservices/controllers/CreatePassword/CredentialProviderCreatePasswordController$resultReceiver$1;", "Companion", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CredentialProviderCreatePasswordController extends CredentialProviderController<C0294e, SavePasswordRequest, Unit, AbstractC0292c, e> {

    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "CreatePassword";
    private static CredentialProviderCreatePasswordController controller;
    private InterfaceC0300k<AbstractC0292c, e> callback;
    private CancellationSignal cancellationSignal;
    private final Context context;
    private Executor executor;
    private final CredentialProviderCreatePasswordController$resultReceiver$1 resultReceiver;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Landroidx/credentials/playservices/controllers/CreatePassword/CredentialProviderCreatePasswordController$Companion;", BuildConfig.FLAVOR, "()V", "TAG", BuildConfig.FLAVOR, "controller", "Landroidx/credentials/playservices/controllers/CreatePassword/CredentialProviderCreatePasswordController;", "getInstance", "context", "Landroid/content/Context;", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CredentialProviderCreatePasswordController getInstance(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (CredentialProviderCreatePasswordController.controller == null) {
                CredentialProviderCreatePasswordController.controller = new CredentialProviderCreatePasswordController(context);
            }
            CredentialProviderCreatePasswordController credentialProviderCreatePasswordController = CredentialProviderCreatePasswordController.controller;
            Intrinsics.d(credentialProviderCreatePasswordController);
            return credentialProviderCreatePasswordController;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends l implements Function0<Unit> {
        AnonymousClass1() {
            super(0);
        }

        public static final void invoke$lambda$0(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController) {
            Intrinsics.checkNotNullParameter(credentialProviderCreatePasswordController, "this$0");
            InterfaceC0300k interfaceC0300k = credentialProviderCreatePasswordController.callback;
            if (interfaceC0300k == null) {
                Intrinsics.v("callback");
                interfaceC0300k = null;
            }
            interfaceC0300k.a(new i(CredentialProviderController.ERROR_MESSAGE_START_ACTIVITY_FAILED));
        }

        public Object invoke() {
            m21invoke();
            return Unit.a;
        }

        public final void m21invoke() {
            Executor executor = CredentialProviderCreatePasswordController.this.executor;
            if (executor == null) {
                Intrinsics.v("executor");
                executor = null;
            }
            final CredentialProviderCreatePasswordController credentialProviderCreatePasswordController = CredentialProviderCreatePasswordController.this;
            executor.execute(new Runnable() {
                @Override
                public final void run() {
                    CredentialProviderCreatePasswordController.AnonymousClass1.invoke$lambda$0(credentialProviderCreatePasswordController);
                }
            });
        }
    }

    public CredentialProviderCreatePasswordController(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.resultReceiver = new ResultReceiver(handler) {
            @Override
            public void onReceiveResult(int resultCode, Bundle resultData) {
                Executor executor;
                InterfaceC0300k interfaceC0300k;
                Intrinsics.checkNotNullParameter(resultData, "resultData");
                CredentialProviderCreatePasswordController credentialProviderCreatePasswordController = this.this$0;
                CredentialProviderCreatePasswordController$resultReceiver$1$onReceiveResult$1 credentialProviderCreatePasswordController$resultReceiver$1$onReceiveResult$1 = new CredentialProviderCreatePasswordController$resultReceiver$1$onReceiveResult$1(CredentialProviderBaseController.INSTANCE);
                Executor executor2 = this.this$0.executor;
                if (executor2 == null) {
                    Intrinsics.v("executor");
                    executor = null;
                } else {
                    executor = executor2;
                }
                InterfaceC0300k interfaceC0300k2 = this.this$0.callback;
                if (interfaceC0300k2 == null) {
                    Intrinsics.v("callback");
                    interfaceC0300k = null;
                } else {
                    interfaceC0300k = interfaceC0300k2;
                }
                if (credentialProviderCreatePasswordController.maybeReportErrorFromResultReceiver(resultData, credentialProviderCreatePasswordController$resultReceiver$1$onReceiveResult$1, executor, interfaceC0300k, this.this$0.cancellationSignal)) {
                    return;
                }
                this.this$0.handleResponse$credentials_play_services_auth_release(resultData.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), resultCode);
            }
        };
    }

    private static void getCallback$annotations() {
    }

    private static void getCancellationSignal$annotations() {
    }

    public static final CredentialProviderCreatePasswordController getInstance(Context context) {
        return INSTANCE.getInstance(context);
    }

    public final void handleResponse$credentials_play_services_auth_release(int uniqueRequestCode, int resultCode) {
        if (uniqueRequestCode == CredentialProviderBaseController.getCONTROLLER_REQUEST_CODE()) {
            if (CredentialProviderController.maybeReportErrorResultCodeCreate(resultCode, CredentialProviderCreatePasswordController$handleResponse$1.INSTANCE, new CredentialProviderCreatePasswordController$handleResponse$2(this), this.cancellationSignal)) {
                return;
            }
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderCreatePasswordController$handleResponse$3(this, convertResponseToCredentialManager(Unit.a)));
            return;
        }
        Log.w(TAG, KwdswzaUHE.aNow + CredentialProviderBaseController.getCONTROLLER_REQUEST_CODE() + " which does not match what was given " + uniqueRequestCode);
    }

    @Override
    public SavePasswordRequest convertRequestToPlayServices(C0294e request) {
        Intrinsics.checkNotNullParameter(request, "request");
        SavePasswordRequest savePasswordRequestA = SavePasswordRequest.l().b(new SignInPassword(request.getId(), request.getPassword())).a();
        Intrinsics.checkNotNullExpressionValue(savePasswordRequestA, "builder().setSignInPassw…ssword)\n        ).build()");
        return savePasswordRequestA;
    }

    @Override
    public AbstractC0292c convertResponseToCredentialManager(Unit response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return new C0295f();
    }

    @Override
    public void invokePlayServices(C0294e request, InterfaceC0300k<AbstractC0292c, e> callback, Executor executor, CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.cancellationSignal = cancellationSignal;
        this.callback = callback;
        this.executor = executor;
        if (CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        SavePasswordRequest savePasswordRequestConvertRequestToPlayServices = convertRequestToPlayServices(request);
        Intent intent = new Intent(this.context, (Class<?>) HiddenActivity.class);
        intent.putExtra(CredentialProviderBaseController.REQUEST_TAG, savePasswordRequestConvertRequestToPlayServices);
        generateHiddenActivityIntent(this.resultReceiver, intent, CredentialProviderBaseController.CREATE_PASSWORD_TAG);
        try {
            this.context.startActivity(intent);
        } catch (Exception unused) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new AnonymousClass1());
        }
    }
}
