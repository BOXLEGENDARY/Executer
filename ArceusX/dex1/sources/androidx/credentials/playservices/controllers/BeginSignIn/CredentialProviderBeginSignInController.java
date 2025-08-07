package androidx.credentials.playservices.controllers.BeginSignIn;

import B0.AbstractC0298i;
import B0.InterfaceC0300k;
import B0.Y;
import B0.Z;
import B0.d0;
import B0.f0;
import C0.k;
import C0.m;
import C0.n;
import C0.p;
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
import androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import b4.c;
import backtraceio.library.interfaces.TNiz.vxbbqXNtzfMxs;
import com.github.luben.zstd.BuildConfig;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.Zb.JmBUOGMwkkxg;
import f3.C2442b;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.y;
import l3.C2527b;

@Metadata(d1 = {"\u0000]\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\b\u0005*\u00015\b\u0000\u0018\u0000 82 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001:\u00018B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ=\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u00022\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010 \u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0004H\u0017¢\u0006\u0004\b#\u0010$R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010%R4\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00108\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b\u0011\u0010&\u0012\u0004\b+\u0010,\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R(\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b\u0013\u0010-\u0012\u0004\b2\u0010,\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u0015\u00103\u0012\u0004\b4\u0010,R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u00069"}, d2 = {"Landroidx/credentials/playservices/controllers/BeginSignIn/CredentialProviderBeginSignInController;", "Landroidx/credentials/playservices/controllers/CredentialProviderController;", "LB0/Y;", "Lcom/google/android/gms/auth/api/identity/BeginSignInRequest;", "Lcom/google/android/gms/auth/api/identity/SignInCredential;", "LB0/Z;", "LC0/m;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "response", "Lb4/c;", "createGoogleIdCredential", "(Lcom/google/android/gms/auth/api/identity/SignInCredential;)Lb4/c;", "request", "LB0/k;", "callback", "Ljava/util/concurrent/Executor;", "executor", "Landroid/os/CancellationSignal;", "cancellationSignal", BuildConfig.FLAVOR, "invokePlayServices", "(LB0/Y;LB0/k;Ljava/util/concurrent/Executor;Landroid/os/CancellationSignal;)V", BuildConfig.FLAVOR, "uniqueRequestCode", "resultCode", "Landroid/content/Intent;", "data", "handleResponse$credentials_play_services_auth_release", "(IILandroid/content/Intent;)V", "handleResponse", "convertRequestToPlayServices", "(LB0/Y;)Lcom/google/android/gms/auth/api/identity/BeginSignInRequest;", "convertResponseToCredentialManager", "(Lcom/google/android/gms/auth/api/identity/SignInCredential;)LB0/Z;", "Landroid/content/Context;", "LB0/k;", "getCallback", "()LB0/k;", "setCallback", "(LB0/k;)V", "getCallback$annotations", "()V", "Ljava/util/concurrent/Executor;", "getExecutor", "()Ljava/util/concurrent/Executor;", "setExecutor", "(Ljava/util/concurrent/Executor;)V", "getExecutor$annotations", "Landroid/os/CancellationSignal;", "getCancellationSignal$annotations", "androidx/credentials/playservices/controllers/BeginSignIn/CredentialProviderBeginSignInController$resultReceiver$1", "resultReceiver", "Landroidx/credentials/playservices/controllers/BeginSignIn/CredentialProviderBeginSignInController$resultReceiver$1;", "Companion", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CredentialProviderBeginSignInController extends CredentialProviderController<Y, BeginSignInRequest, SignInCredential, Z, m> {

    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "BeginSignIn";
    private static CredentialProviderBeginSignInController controller;
    public InterfaceC0300k<Z, m> callback;
    private CancellationSignal cancellationSignal;
    private final Context context;
    public Executor executor;
    private final CredentialProviderBeginSignInController$resultReceiver$1 resultReceiver;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Landroidx/credentials/playservices/controllers/BeginSignIn/CredentialProviderBeginSignInController$Companion;", BuildConfig.FLAVOR, "()V", "TAG", BuildConfig.FLAVOR, "controller", "Landroidx/credentials/playservices/controllers/BeginSignIn/CredentialProviderBeginSignInController;", "getInstance", "context", "Landroid/content/Context;", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CredentialProviderBeginSignInController getInstance(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (CredentialProviderBeginSignInController.controller == null) {
                CredentialProviderBeginSignInController.controller = new CredentialProviderBeginSignInController(context);
            }
            CredentialProviderBeginSignInController credentialProviderBeginSignInController = CredentialProviderBeginSignInController.controller;
            Intrinsics.d(credentialProviderBeginSignInController);
            return credentialProviderBeginSignInController;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends l implements Function0<Unit> {
        AnonymousClass1() {
            super(0);
        }

        public static final void invoke$lambda$0(CredentialProviderBeginSignInController credentialProviderBeginSignInController) {
            Intrinsics.checkNotNullParameter(credentialProviderBeginSignInController, JmBUOGMwkkxg.nJEbmVSkkf);
            credentialProviderBeginSignInController.getCallback().a(new p(CredentialProviderController.ERROR_MESSAGE_START_ACTIVITY_FAILED));
        }

        public Object invoke() {
            m19invoke();
            return Unit.a;
        }

        public final void m19invoke() {
            Executor executor = CredentialProviderBeginSignInController.this.getExecutor();
            final CredentialProviderBeginSignInController credentialProviderBeginSignInController = CredentialProviderBeginSignInController.this;
            executor.execute(new Runnable() {
                @Override
                public final void run() {
                    CredentialProviderBeginSignInController.AnonymousClass1.invoke$lambda$0(credentialProviderBeginSignInController);
                }
            });
        }
    }

    public CredentialProviderBeginSignInController(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.resultReceiver = new ResultReceiver(handler) {
            @Override
            public void onReceiveResult(int resultCode, Bundle resultData) {
                Intrinsics.checkNotNullParameter(resultData, "resultData");
                if (this.this$0.maybeReportErrorFromResultReceiver(resultData, new CredentialProviderBeginSignInController$resultReceiver$1$onReceiveResult$1(CredentialProviderBaseController.INSTANCE), this.this$0.getExecutor(), this.this$0.getCallback(), this.this$0.cancellationSignal)) {
                    return;
                }
                this.this$0.handleResponse$credentials_play_services_auth_release(resultData.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), resultCode, (Intent) resultData.getParcelable(CredentialProviderBaseController.RESULT_DATA_TAG));
            }
        };
    }

    private final c createGoogleIdCredential(SignInCredential response) {
        c.a aVar = new c.a();
        String strQ = response.q();
        Intrinsics.checkNotNullExpressionValue(strQ, "response.id");
        c.a aVarE = aVar.e(strQ);
        String strP = response.p();
        Intrinsics.d(strP);
        c.a aVarF = aVarE.f(strP);
        if (response.l() != null) {
            aVarF.b(response.l());
        }
        if (response.o() != null) {
            aVarF.d(response.o());
        }
        if (response.n() != null) {
            aVarF.c(response.n());
        }
        if (response.s() != null) {
            aVarF.g(response.s());
        }
        if (response.t() != null) {
            aVarF.h(response.t());
        }
        return aVarF.a();
    }

    public static void getCallback$annotations() {
    }

    private static void getCancellationSignal$annotations() {
    }

    public static void getExecutor$annotations() {
    }

    public static final CredentialProviderBeginSignInController getInstance(Context context) {
        return INSTANCE.getInstance(context);
    }

    public final InterfaceC0300k<Z, m> getCallback() {
        InterfaceC0300k<Z, m> interfaceC0300k = this.callback;
        if (interfaceC0300k != null) {
            return interfaceC0300k;
        }
        Intrinsics.v("callback");
        return null;
    }

    public final Executor getExecutor() {
        Executor executor = this.executor;
        if (executor != null) {
            return executor;
        }
        Intrinsics.v("executor");
        return null;
    }

    public final void handleResponse$credentials_play_services_auth_release(int uniqueRequestCode, int resultCode, Intent data) {
        if (uniqueRequestCode != CredentialProviderBaseController.getCONTROLLER_REQUEST_CODE()) {
            Log.w(TAG, "Returned request code " + CredentialProviderBaseController.getCONTROLLER_REQUEST_CODE() + " which  does not match what was given " + uniqueRequestCode);
            return;
        }
        if (CredentialProviderController.maybeReportErrorResultCodeGet(resultCode, CredentialProviderBeginSignInController$handleResponse$1.INSTANCE, new CredentialProviderBeginSignInController$handleResponse$2(this), this.cancellationSignal)) {
            return;
        }
        try {
            SignInCredential signInCredentialE = C2442b.c(this.context).e(data);
            Intrinsics.checkNotNullExpressionValue(signInCredentialE, "getSignInClient(context)…redentialFromIntent(data)");
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderBeginSignInController$handleResponse$3(this, convertResponseToCredentialManager(signInCredentialE)));
        } catch (m e7) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderBeginSignInController$handleResponse$5(this, e7));
        } catch (C2527b e8) {
            y yVar = new y();
            yVar.d = new p(e8.getMessage());
            if (e8.b() == 16) {
                yVar.d = new k(e8.getMessage());
            } else if (CredentialProviderBaseController.INSTANCE.getRetryables().contains(Integer.valueOf(e8.b()))) {
                yVar.d = new n(e8.getMessage());
            }
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderBeginSignInController$handleResponse$4(this, yVar));
        } catch (Throwable th) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderBeginSignInController$handleResponse$6(this, new p(th.getMessage())));
        }
    }

    public final void setCallback(InterfaceC0300k<Z, m> interfaceC0300k) {
        Intrinsics.checkNotNullParameter(interfaceC0300k, "<set-?>");
        this.callback = interfaceC0300k;
    }

    public final void setExecutor(Executor executor) {
        Intrinsics.checkNotNullParameter(executor, "<set-?>");
        this.executor = executor;
    }

    @Override
    public BeginSignInRequest convertRequestToPlayServices(Y request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return BeginSignInControllerUtility.INSTANCE.constructBeginSignInRequest$credentials_play_services_auth_release(request, this.context);
    }

    @Override
    public Z convertResponseToCredentialManager(SignInCredential response) throws p {
        AbstractC0298i f0Var;
        Intrinsics.checkNotNullParameter(response, "response");
        if (response.r() != null) {
            String strQ = response.q();
            Intrinsics.checkNotNullExpressionValue(strQ, vxbbqXNtzfMxs.zqSxEiskd);
            String strR = response.r();
            Intrinsics.d(strR);
            f0Var = new d0(strQ, strR);
        } else if (response.p() != null) {
            f0Var = createGoogleIdCredential(response);
        } else if (response.v() != null) {
            f0Var = new f0(PublicKeyCredentialControllerUtility.INSTANCE.toAssertPasskeyResponse(response));
        } else {
            Log.w(TAG, "Credential returned but no google Id or password or passkey found");
            f0Var = null;
        }
        if (f0Var != null) {
            return new Z(f0Var);
        }
        throw new p("When attempting to convert get response, null credential found");
    }

    @Override
    public void invokePlayServices(Y request, InterfaceC0300k<Z, m> callback, Executor executor, CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.cancellationSignal = cancellationSignal;
        setCallback(callback);
        setExecutor(executor);
        if (CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        BeginSignInRequest beginSignInRequestConvertRequestToPlayServices = convertRequestToPlayServices(request);
        Intent intent = new Intent(this.context, (Class<?>) HiddenActivity.class);
        intent.putExtra(CredentialProviderBaseController.REQUEST_TAG, beginSignInRequestConvertRequestToPlayServices);
        generateHiddenActivityIntent(this.resultReceiver, intent, CredentialProviderBaseController.BEGIN_SIGN_IN_TAG);
        try {
            this.context.startActivity(intent);
        } catch (Exception unused) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new AnonymousClass1());
        }
    }
}
