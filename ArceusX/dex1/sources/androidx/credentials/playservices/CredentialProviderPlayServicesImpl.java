package androidx.credentials.playservices;

import B0.AbstractC0291b;
import B0.AbstractC0292c;
import B0.AbstractC0302m;
import B0.C0290a;
import B0.C0294e;
import B0.C0296g;
import B0.InterfaceC0300k;
import B0.InterfaceC0303n;
import B0.Y;
import B0.Z;
import B0.e0;
import C0.a;
import C0.e;
import C0.m;
import a4.InterfaceC1569f;
import a4.InterfaceC1570g;
import android.content.Context;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.BeginSignIn.CredentialProviderBeginSignInController;
import androidx.credentials.playservices.controllers.CreatePassword.CredentialProviderCreatePasswordController;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.CredentialProviderCreatePublicKeyCredentialController;
import androidx.credentials.playservices.controllers.GetSignInIntent.CredentialProviderGetSignInIntentController;
import b4.b;
import com.github.luben.zstd.BuildConfig;
import com.google.android.gms.common.C1818c;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.tasks.Task;
import f3.C2442b;
import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001-B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJE\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015JE\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00162\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ?\u0010!\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u001e2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0014\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0004\u0012\u00020 0\u000fH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R(\u0010%\u001a\u00020$8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b%\u0010&\u0012\u0004\b+\u0010,\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006."}, d2 = {"Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;", "LB0/n;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", BuildConfig.FLAVOR, "isGooglePlayServicesAvailable", "(Landroid/content/Context;)I", "LB0/Y;", "request", "Landroid/os/CancellationSignal;", "cancellationSignal", "Ljava/util/concurrent/Executor;", "executor", "LB0/k;", "LB0/Z;", "LC0/m;", "callback", BuildConfig.FLAVOR, "onGetCredential", "(Landroid/content/Context;LB0/Y;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;LB0/k;)V", "LB0/b;", "LB0/c;", "LC0/e;", "onCreateCredential", "(Landroid/content/Context;LB0/b;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;LB0/k;)V", BuildConfig.FLAVOR, "isAvailableOnDevice", "()Z", "LB0/a;", "Ljava/lang/Void;", "LC0/a;", "onClearCredential", "(LB0/a;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;LB0/k;)V", "Landroid/content/Context;", "Lcom/google/android/gms/common/c;", "googleApiAvailability", "Lcom/google/android/gms/common/c;", "getGoogleApiAvailability", "()Lcom/google/android/gms/common/c;", "setGoogleApiAvailability", "(Lcom/google/android/gms/common/c;)V", "getGoogleApiAvailability$annotations", "()V", "Companion", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CredentialProviderPlayServicesImpl implements InterfaceC0303n {

    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "PlayServicesImpl";
    private final Context context;
    private C1818c googleApiAvailability;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000f\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/os/CancellationSignal;", "cancellationSignal", "Lkotlin/Function0;", BuildConfig.FLAVOR, "callback", "cancellationReviewerWithCallback$credentials_play_services_auth_release", "(Landroid/os/CancellationSignal;Lkotlin/jvm/functions/Function0;)V", "cancellationReviewerWithCallback", BuildConfig.FLAVOR, "cancellationReviewer$credentials_play_services_auth_release", "(Landroid/os/CancellationSignal;)Z", "cancellationReviewer", "LB0/Y;", "request", "isGetSignInIntentRequest$credentials_play_services_auth_release", "(LB0/Y;)Z", "isGetSignInIntentRequest", BuildConfig.FLAVOR, "TAG", "Ljava/lang/String;", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean cancellationReviewer$credentials_play_services_auth_release(CancellationSignal cancellationSignal) {
            if (cancellationSignal == null) {
                Log.i(CredentialProviderPlayServicesImpl.TAG, "No cancellationSignal found");
                return false;
            }
            if (!cancellationSignal.isCanceled()) {
                return false;
            }
            Log.i(CredentialProviderPlayServicesImpl.TAG, "the flow has been canceled");
            return true;
        }

        public final void cancellationReviewerWithCallback$credentials_play_services_auth_release(CancellationSignal cancellationSignal, Function0<Unit> callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            if (cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
                return;
            }
            callback.invoke();
        }

        public final boolean isGetSignInIntentRequest$credentials_play_services_auth_release(Y request) {
            Intrinsics.checkNotNullParameter(request, "request");
            Iterator<AbstractC0302m> it = request.a().iterator();
            while (it.hasNext()) {
                if (it.next() instanceof b) {
                    return true;
                }
            }
            return false;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "it", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends l implements Function1<Void, Unit> {
        final InterfaceC0300k<Void, a> $callback;
        final CancellationSignal $cancellationSignal;
        final Executor $executor;

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        static final class C00921 extends l implements Function0<Unit> {
            final InterfaceC0300k<Void, a> $callback;
            final Executor $executor;

            C00921(Executor executor, InterfaceC0300k<Void, a> interfaceC0300k) {
                super(0);
                this.$executor = executor;
                this.$callback = interfaceC0300k;
            }

            public static final void invoke$lambda$0(InterfaceC0300k interfaceC0300k) {
                Intrinsics.checkNotNullParameter(interfaceC0300k, "$callback");
                interfaceC0300k.onResult(null);
            }

            public Object invoke() {
                m9invoke();
                return Unit.a;
            }

            public final void m9invoke() {
                Log.i(CredentialProviderPlayServicesImpl.TAG, "During clear credential, signed out successfully!");
                Executor executor = this.$executor;
                final InterfaceC0300k<Void, a> interfaceC0300k = this.$callback;
                executor.execute(new Runnable() {
                    @Override
                    public final void run() {
                        CredentialProviderPlayServicesImpl.AnonymousClass1.C00921.invoke$lambda$0(interfaceC0300k);
                    }
                });
            }
        }

        AnonymousClass1(CancellationSignal cancellationSignal, Executor executor, InterfaceC0300k<Void, a> interfaceC0300k) {
            super(1);
            this.$cancellationSignal = cancellationSignal;
            this.$executor = executor;
            this.$callback = interfaceC0300k;
        }

        public Object invoke(Object obj) {
            invoke((Void) obj);
            return Unit.a;
        }

        public final void invoke(Void r52) {
            CredentialProviderPlayServicesImpl.INSTANCE.cancellationReviewerWithCallback$credentials_play_services_auth_release(this.$cancellationSignal, new C00921(this.$executor, this.$callback));
        }
    }

    public CredentialProviderPlayServicesImpl(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        C1818c c1818cN = C1818c.n();
        Intrinsics.checkNotNullExpressionValue(c1818cN, "getInstance()");
        this.googleApiAvailability = c1818cN;
    }

    public static void getGoogleApiAvailability$annotations() {
    }

    private final int isGooglePlayServicesAvailable(Context context) {
        return this.googleApiAvailability.g(context);
    }

    public static final void onClearCredential$lambda$0(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(obj);
    }

    public static final void onClearCredential$lambda$2(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, CancellationSignal cancellationSignal, Executor executor, InterfaceC0300k interfaceC0300k, Exception exc) {
        Intrinsics.checkNotNullParameter(credentialProviderPlayServicesImpl, "this$0");
        Intrinsics.checkNotNullParameter(executor, "$executor");
        Intrinsics.checkNotNullParameter(interfaceC0300k, "$callback");
        Intrinsics.checkNotNullParameter(exc, "e");
        INSTANCE.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new CredentialProviderPlayServicesImpl$onClearCredential$2$1$1(exc, executor, interfaceC0300k));
    }

    public final C1818c getGoogleApiAvailability() {
        return this.googleApiAvailability;
    }

    @Override
    public boolean isAvailableOnDevice() {
        int iIsGooglePlayServicesAvailable = isGooglePlayServicesAvailable(this.context);
        boolean z7 = iIsGooglePlayServicesAvailable == 0;
        if (!z7) {
            Log.w(TAG, "Connection with Google Play Services was not successful. Connection result is: " + new ConnectionResult(iIsGooglePlayServicesAvailable));
        }
        return z7;
    }

    public void onClearCredential(C0290a request, final CancellationSignal cancellationSignal, final Executor executor, final InterfaceC0300k<Void, a> callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (INSTANCE.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        Task<Void> taskJ = C2442b.c(this.context).j();
        final AnonymousClass1 anonymousClass1 = new AnonymousClass1(cancellationSignal, executor, callback);
        taskJ.e(new InterfaceC1570g() {
            @Override
            public final void onSuccess(Object obj) {
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$0(anonymousClass1, obj);
            }
        }).c(new InterfaceC1569f() {
            @Override
            public final void onFailure(Exception exc) {
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$2(this.f$0, cancellationSignal, executor, callback, exc);
            }
        });
    }

    @Override
    public void onCreateCredential(Context context, AbstractC0291b request, CancellationSignal cancellationSignal, Executor executor, InterfaceC0300k<AbstractC0292c, e> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (INSTANCE.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        if (request instanceof C0294e) {
            CredentialProviderCreatePasswordController.INSTANCE.getInstance(context).invokePlayServices((C0294e) request, callback, executor, cancellationSignal);
        } else {
            if (!(request instanceof C0296g)) {
                throw new UnsupportedOperationException("Create Credential request is unsupported, not password or publickeycredential");
            }
            CredentialProviderCreatePublicKeyCredentialController.INSTANCE.getInstance(context).invokePlayServices((C0296g) request, callback, executor, cancellationSignal);
        }
    }

    @Override
    public void onGetCredential(Context context, e0 e0Var, CancellationSignal cancellationSignal, Executor executor, InterfaceC0300k interfaceC0300k) {
        super.onGetCredential(context, e0Var, cancellationSignal, executor, (InterfaceC0300k<Z, m>) interfaceC0300k);
    }

    @Override
    public void onPrepareCredential(Y y7, CancellationSignal cancellationSignal, Executor executor, InterfaceC0300k interfaceC0300k) {
        super.onPrepareCredential(y7, cancellationSignal, executor, interfaceC0300k);
    }

    public final void setGoogleApiAvailability(C1818c c1818c) {
        Intrinsics.checkNotNullParameter(c1818c, "<set-?>");
        this.googleApiAvailability = c1818c;
    }

    @Override
    public void onGetCredential(Context context, Y request, CancellationSignal cancellationSignal, Executor executor, InterfaceC0300k<Z, m> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Companion companion = INSTANCE;
        if (companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        if (companion.isGetSignInIntentRequest$credentials_play_services_auth_release(request)) {
            new CredentialProviderGetSignInIntentController(context).invokePlayServices(request, callback, executor, cancellationSignal);
        } else {
            new CredentialProviderBeginSignInController(context).invokePlayServices(request, callback, executor, cancellationSignal);
        }
    }
}
