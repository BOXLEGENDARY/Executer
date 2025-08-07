package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import B0.AbstractC0292c;
import B0.C0296g;
import B0.C0297h;
import B0.InterfaceC0300k;
import C0.e;
import C0.i;
import D0.B;
import D0.f;
import E0.a;
import Z.tNT.PexNRiLSd;
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
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import com.github.luben.zstd.BuildConfig;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import org.json.JSONException;

@Metadata(d1 = {"\u0000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\b\u0005*\u0001/\b\u0000\u0018\u0000 22 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001:\u00012B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ=\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u00022\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010!\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0000¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u0004H\u0017¢\u0006\u0004\b%\u0010&R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010'R(\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00118\u0002@\u0002X\u0083.¢\u0006\f\n\u0004\b\u0012\u0010(\u0012\u0004\b)\u0010*R\u001c\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0083.¢\u0006\f\n\u0004\b\u0014\u0010+\u0012\u0004\b,\u0010*R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u0016\u0010-\u0012\u0004\b.\u0010*R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00063"}, d2 = {"Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;", "Landroidx/credentials/playservices/controllers/CredentialProviderController;", "LB0/g;", "Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions;", "Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential;", "LB0/c;", "LC0/e;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lorg/json/JSONException;", "exception", "LE0/a;", "JSONExceptionToPKCError", "(Lorg/json/JSONException;)LE0/a;", "request", "LB0/k;", "callback", "Ljava/util/concurrent/Executor;", "executor", "Landroid/os/CancellationSignal;", "cancellationSignal", BuildConfig.FLAVOR, "invokePlayServices", "(LB0/g;LB0/k;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V", BuildConfig.FLAVOR, "uniqueRequestCode", "resultCode", "Landroid/content/Intent;", "data", "handleResponse$credentials_play_services_auth_release", "(IILandroid/content/Intent;)V", "handleResponse", "convertRequestToPlayServices", "(LB0/g;)Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions;", "response", "convertResponseToCredentialManager", "(Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential;)LB0/c;", "Landroid/content/Context;", "LB0/k;", "getCallback$annotations", "()V", "Ljava/util/concurrent/Executor;", "getExecutor$annotations", "Landroid/os/CancellationSignal;", "getCancellationSignal$annotations", "androidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1", "resultReceiver", "Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1;", "Companion", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CredentialProviderCreatePublicKeyCredentialController extends CredentialProviderController<C0296g, PublicKeyCredentialCreationOptions, PublicKeyCredential, AbstractC0292c, e> {

    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "CreatePublicKey";
    private static CredentialProviderCreatePublicKeyCredentialController controller;
    private InterfaceC0300k<AbstractC0292c, e> callback;
    private CancellationSignal cancellationSignal;
    private final Context context;
    private Executor executor;
    private final CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1 resultReceiver;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController$Companion;", BuildConfig.FLAVOR, "()V", "TAG", BuildConfig.FLAVOR, "controller", "Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/CredentialProviderCreatePublicKeyCredentialController;", "getInstance", "context", "Landroid/content/Context;", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CredentialProviderCreatePublicKeyCredentialController getInstance(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (CredentialProviderCreatePublicKeyCredentialController.controller == null) {
                CredentialProviderCreatePublicKeyCredentialController.controller = new CredentialProviderCreatePublicKeyCredentialController(context);
            }
            CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = CredentialProviderCreatePublicKeyCredentialController.controller;
            Intrinsics.d(credentialProviderCreatePublicKeyCredentialController);
            return credentialProviderCreatePublicKeyCredentialController;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends l implements Function0<Unit> {
        final JSONException $e;

        AnonymousClass1(JSONException jSONException) {
            super(0);
            this.$e = jSONException;
        }

        public static final void invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, JSONException jSONException) {
            Intrinsics.checkNotNullParameter(credentialProviderCreatePublicKeyCredentialController, "this$0");
            Intrinsics.checkNotNullParameter(jSONException, "$e");
            InterfaceC0300k interfaceC0300k = credentialProviderCreatePublicKeyCredentialController.callback;
            if (interfaceC0300k == null) {
                Intrinsics.v("callback");
                interfaceC0300k = null;
            }
            interfaceC0300k.a(credentialProviderCreatePublicKeyCredentialController.JSONExceptionToPKCError(jSONException));
        }

        public Object invoke() {
            m28invoke();
            return Unit.a;
        }

        public final void m28invoke() {
            Executor executor = CredentialProviderCreatePublicKeyCredentialController.this.executor;
            if (executor == null) {
                Intrinsics.v("executor");
                executor = null;
            }
            final CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = CredentialProviderCreatePublicKeyCredentialController.this;
            final JSONException jSONException = this.$e;
            executor.execute(new Runnable() {
                @Override
                public final void run() {
                    CredentialProviderCreatePublicKeyCredentialController.AnonymousClass1.invoke$lambda$0(credentialProviderCreatePublicKeyCredentialController, jSONException);
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends l implements Function0<Unit> {
        final Throwable $t;

        AnonymousClass2(Throwable th) {
            super(0);
            this.$t = th;
        }

        public static final void invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, Throwable th) {
            Intrinsics.checkNotNullParameter(credentialProviderCreatePublicKeyCredentialController, "this$0");
            Intrinsics.checkNotNullParameter(th, "$t");
            InterfaceC0300k interfaceC0300k = credentialProviderCreatePublicKeyCredentialController.callback;
            if (interfaceC0300k == null) {
                Intrinsics.v("callback");
                interfaceC0300k = null;
            }
            interfaceC0300k.a(new i(th.getMessage()));
        }

        public Object invoke() {
            m29invoke();
            return Unit.a;
        }

        public final void m29invoke() {
            Executor executor = CredentialProviderCreatePublicKeyCredentialController.this.executor;
            if (executor == null) {
                Intrinsics.v("executor");
                executor = null;
            }
            final CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = CredentialProviderCreatePublicKeyCredentialController.this;
            final Throwable th = this.$t;
            executor.execute(new Runnable() {
                @Override
                public final void run() {
                    CredentialProviderCreatePublicKeyCredentialController.AnonymousClass2.invoke$lambda$0(credentialProviderCreatePublicKeyCredentialController, th);
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass3 extends l implements Function0<Unit> {
        AnonymousClass3() {
            super(0);
        }

        public static final void invoke$lambda$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController) {
            Intrinsics.checkNotNullParameter(credentialProviderCreatePublicKeyCredentialController, "this$0");
            InterfaceC0300k interfaceC0300k = credentialProviderCreatePublicKeyCredentialController.callback;
            if (interfaceC0300k == null) {
                Intrinsics.v("callback");
                interfaceC0300k = null;
            }
            interfaceC0300k.a(new i(CredentialProviderController.ERROR_MESSAGE_START_ACTIVITY_FAILED));
        }

        public Object invoke() {
            m30invoke();
            return Unit.a;
        }

        public final void m30invoke() {
            Executor executor = CredentialProviderCreatePublicKeyCredentialController.this.executor;
            if (executor == null) {
                Intrinsics.v("executor");
                executor = null;
            }
            final CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = CredentialProviderCreatePublicKeyCredentialController.this;
            executor.execute(new Runnable() {
                @Override
                public final void run() {
                    CredentialProviderCreatePublicKeyCredentialController.AnonymousClass3.invoke$lambda$0(credentialProviderCreatePublicKeyCredentialController);
                }
            });
        }
    }

    public CredentialProviderCreatePublicKeyCredentialController(Context context) {
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
                CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = this.this$0;
                CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1 credentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1 = new CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1(CredentialProviderBaseController.INSTANCE);
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
                if (credentialProviderCreatePublicKeyCredentialController.maybeReportErrorFromResultReceiver(resultData, credentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1, executor, interfaceC0300k, this.this$0.cancellationSignal)) {
                    return;
                }
                this.this$0.handleResponse$credentials_play_services_auth_release(resultData.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), resultCode, (Intent) resultData.getParcelable(CredentialProviderBaseController.RESULT_DATA_TAG));
            }
        };
    }

    public final a JSONExceptionToPKCError(JSONException exception) {
        String message = exception.getMessage();
        return (message == null || message.length() <= 0) ? new a(new f(), "Unknown error") : new a(new f(), message);
    }

    private static void getCallback$annotations() {
    }

    private static void getCancellationSignal$annotations() {
    }

    private static void getExecutor$annotations() {
    }

    public static final CredentialProviderCreatePublicKeyCredentialController getInstance(Context context) {
        return INSTANCE.getInstance(context);
    }

    public static final void handleResponse$lambda$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController) {
        Intrinsics.checkNotNullParameter(credentialProviderCreatePublicKeyCredentialController, "this$0");
        InterfaceC0300k<AbstractC0292c, e> interfaceC0300k = credentialProviderCreatePublicKeyCredentialController.callback;
        if (interfaceC0300k == null) {
            Intrinsics.v("callback");
            interfaceC0300k = null;
        }
        interfaceC0300k.a(new a(new B(), "Upon handling create public key credential response, fido module giving null bytes indicating internal error"));
    }

    public final void handleResponse$credentials_play_services_auth_release(int uniqueRequestCode, int resultCode, Intent data) {
        if (uniqueRequestCode != CredentialProviderBaseController.getCONTROLLER_REQUEST_CODE()) {
            Log.w(TAG, "Returned request code " + CredentialProviderBaseController.getCONTROLLER_REQUEST_CODE() + " does not match what was given " + uniqueRequestCode);
            return;
        }
        if (CredentialProviderController.maybeReportErrorResultCodeCreate(resultCode, CredentialProviderCreatePublicKeyCredentialController$handleResponse$1.INSTANCE, new CredentialProviderCreatePublicKeyCredentialController$handleResponse$2(this), this.cancellationSignal)) {
            return;
        }
        Executor executor = null;
        byte[] byteArrayExtra = data != null ? data.getByteArrayExtra("FIDO2_CREDENTIAL_EXTRA") : null;
        if (byteArrayExtra == null) {
            if (CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth_release(this.cancellationSignal)) {
                return;
            }
            Executor executor2 = this.executor;
            if (executor2 == null) {
                Intrinsics.v("executor");
            } else {
                executor = executor2;
            }
            executor.execute(new Runnable() {
                @Override
                public final void run() {
                    CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$0(this.f$0);
                }
            });
            return;
        }
        PublicKeyCredential publicKeyCredentialL = PublicKeyCredential.l(byteArrayExtra);
        Intrinsics.checkNotNullExpressionValue(publicKeyCredentialL, "deserializeFromBytes(bytes)");
        e eVarPublicKeyCredentialResponseContainsError = PublicKeyCredentialControllerUtility.INSTANCE.publicKeyCredentialResponseContainsError(publicKeyCredentialL);
        if (eVarPublicKeyCredentialResponseContainsError != null) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderCreatePublicKeyCredentialController$handleResponse$4(this, eVarPublicKeyCredentialResponseContainsError));
            return;
        }
        try {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderCreatePublicKeyCredentialController$handleResponse$5(this, convertResponseToCredentialManager(publicKeyCredentialL)));
        } catch (JSONException e7) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderCreatePublicKeyCredentialController$handleResponse$6(this, e7));
        } catch (Throwable th) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderCreatePublicKeyCredentialController$handleResponse$7(this, th));
        }
    }

    @Override
    public PublicKeyCredentialCreationOptions convertRequestToPlayServices(C0296g request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return PublicKeyCredentialControllerUtility.INSTANCE.convert(request);
    }

    @Override
    public AbstractC0292c convertResponseToCredentialManager(PublicKeyCredential response) throws i {
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            String strT = response.t();
            Intrinsics.checkNotNullExpressionValue(strT, PexNRiLSd.qHOAtcHzenZN);
            return new C0297h(strT);
        } catch (Throwable th) {
            throw new i("The PublicKeyCredential response json had an unexpected exception when parsing: " + th.getMessage());
        }
    }

    @Override
    public void invokePlayServices(C0296g request, InterfaceC0300k<AbstractC0292c, e> callback, Executor executor, CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.cancellationSignal = cancellationSignal;
        this.callback = callback;
        this.executor = executor;
        try {
            PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptionsConvertRequestToPlayServices = convertRequestToPlayServices(request);
            if (CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
                return;
            }
            Intent intent = new Intent(this.context, (Class<?>) HiddenActivity.class);
            intent.putExtra(CredentialProviderBaseController.REQUEST_TAG, publicKeyCredentialCreationOptionsConvertRequestToPlayServices);
            generateHiddenActivityIntent(this.resultReceiver, intent, CredentialProviderBaseController.CREATE_PUBLIC_KEY_CREDENTIAL_TAG);
            try {
                this.context.startActivity(intent);
            } catch (Exception unused) {
                CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new AnonymousClass3());
            }
        } catch (JSONException e7) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new AnonymousClass1(e7));
        } catch (Throwable th) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new AnonymousClass2(th));
        }
    }
}
