package B0;

import B0.AbstractC0292c;
import B0.AbstractC0298i;
import E0.b;
import E0.e;
import H3.QdLC.QcdySgfdST;
import Q6.QtA.QXojhh;
import android.content.Context;
import android.credentials.CreateCredentialException;
import android.credentials.CreateCredentialRequest;
import android.credentials.CreateCredentialResponse;
import android.credentials.Credential;
import android.credentials.CredentialManager;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialRequest;
import android.credentials.GetCredentialResponse;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.OutcomeReceiver;
import android.util.Log;
import backtraceio.library.models.BacktraceAttributeConsts;
import com.github.luben.zstd.BuildConfig;
import com.google.android.gms.common.Zb.JmBUOGMwkkxg;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00172\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0019H\u0003¢\u0006\u0004\b\u001a\u0010\u001bJE\u0010$\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 H\u0016¢\u0006\u0004\b$\u0010%JE\u0010(\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0 H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\"2\u0006\u0010+\u001a\u00020*H\u0000¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020'2\u0006\u0010+\u001a\u00020.H\u0000¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020!2\u0006\u00102\u001a\u000201H\u0000¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\tH\u0016¢\u0006\u0004\b5\u00106R\u0016\u00109\u001a\u0004\u0018\u0001078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00108¨\u0006:"}, d2 = {"LB0/Q;", "LB0/n;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lkotlin/Function0;", BuildConfig.FLAVOR, "handleNullCredMan", BuildConfig.FLAVOR, "f", "(Lkotlin/jvm/functions/Function0;)Z", "LB0/b;", "request", "Landroid/credentials/CreateCredentialRequest;", "a", "(LB0/b;Landroid/content/Context;)Landroid/credentials/CreateCredentialRequest;", "Landroid/credentials/CreateCredentialRequest$Builder;", "builder", "g", "(LB0/b;Landroid/credentials/CreateCredentialRequest$Builder;)V", "LB0/Y;", "Landroid/credentials/GetCredentialRequest;", "b", "(LB0/Y;)Landroid/credentials/GetCredentialRequest;", "Landroid/credentials/GetCredentialRequest$Builder;", "h", "(LB0/Y;Landroid/credentials/GetCredentialRequest$Builder;)V", "Landroid/os/CancellationSignal;", "cancellationSignal", "Ljava/util/concurrent/Executor;", "executor", "LB0/k;", "LB0/Z;", "LC0/m;", "callback", "onGetCredential", "(Landroid/content/Context;LB0/Y;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;LB0/k;)V", "LB0/c;", "LC0/e;", "onCreateCredential", "(Landroid/content/Context;LB0/b;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;LB0/k;)V", "Landroid/credentials/GetCredentialException;", "error", "e", "(Landroid/credentials/GetCredentialException;)LC0/m;", "Landroid/credentials/CreateCredentialException;", "d", "(Landroid/credentials/CreateCredentialException;)LC0/e;", "Landroid/credentials/GetCredentialResponse;", "response", "c", "(Landroid/credentials/GetCredentialResponse;)LB0/Z;", "isAvailableOnDevice", "()Z", "Landroid/credentials/CredentialManager;", "Landroid/credentials/CredentialManager;", "credentialManager", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Q implements InterfaceC0303n {

    private static final a f274b = new a(null);

    private final CredentialManager credentialManager;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"LB0/Q$a;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "CREATE_DOM_EXCEPTION_PREFIX", "Ljava/lang/String;", "GET_DOM_EXCEPTION_PREFIX", "TAG", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.jvm.internal.l implements Function0<Unit> {

        final InterfaceC0300k<AbstractC0292c, C0.e> f276d;

        b(InterfaceC0300k<AbstractC0292c, C0.e> interfaceC0300k) {
            super(0);
            this.f276d = interfaceC0300k;
        }

        public Object invoke() {
            m0invoke();
            return Unit.a;
        }

        public final void m0invoke() {
            this.f276d.a(new C0.j("Your device doesn't support credential manager"));
        }
    }

    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"B0/Q$c", "Landroid/os/OutcomeReceiver;", "Landroid/credentials/CreateCredentialResponse;", "Landroid/credentials/CreateCredentialException;", "response", BuildConfig.FLAVOR, "b", "(Landroid/credentials/CreateCredentialResponse;)V", "error", "a", "(Landroid/credentials/CreateCredentialException;)V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements OutcomeReceiver {

        final InterfaceC0300k<AbstractC0292c, C0.e> f277a;

        final AbstractC0291b f278b;

        final Q f279c;

        c(InterfaceC0300k<AbstractC0292c, C0.e> interfaceC0300k, AbstractC0291b abstractC0291b, Q q7) {
            this.f277a = interfaceC0300k;
            this.f278b = abstractC0291b;
            this.f279c = q7;
        }

        public void a(CreateCredentialException error) {
            Intrinsics.checkNotNullParameter(error, "error");
            Log.i("CredManProvService", "CreateCredentialResponse error returned from framework");
            this.f277a.a(this.f279c.d(error));
        }

        public void b(CreateCredentialResponse response) {
            Intrinsics.checkNotNullParameter(response, QXojhh.xcvveNORJwdvzlt);
            Log.i("CredManProvService", "Create Result returned from framework: ");
            InterfaceC0300k<AbstractC0292c, C0.e> interfaceC0300k = this.f277a;
            AbstractC0292c.Companion companion = AbstractC0292c.INSTANCE;
            String type = this.f278b.getType();
            Bundle data = response.getData();
            Intrinsics.checkNotNullExpressionValue(data, "response.data");
            interfaceC0300k.onResult(companion.a(type, data));
        }

        public void onError(Throwable th) {
            a(S.a(th));
        }

        public void onResult(Object obj) {
            b(T.a(obj));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends kotlin.jvm.internal.l implements Function0<Unit> {

        final InterfaceC0300k<Z, C0.m> f280d;

        d(InterfaceC0300k<Z, C0.m> interfaceC0300k) {
            super(0);
            this.f280d = interfaceC0300k;
        }

        public Object invoke() {
            m1invoke();
            return Unit.a;
        }

        public final void m1invoke() {
            this.f280d.a(new C0.q("Your device doesn't support credential manager"));
        }
    }

    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"B0/Q$e", "Landroid/os/OutcomeReceiver;", "Landroid/credentials/GetCredentialResponse;", "Landroid/credentials/GetCredentialException;", "response", BuildConfig.FLAVOR, "b", "(Landroid/credentials/GetCredentialResponse;)V", "error", "a", "(Landroid/credentials/GetCredentialException;)V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class e implements OutcomeReceiver {

        final InterfaceC0300k<Z, C0.m> f281a;

        final Q f282b;

        e(InterfaceC0300k<Z, C0.m> interfaceC0300k, Q q7) {
            this.f281a = interfaceC0300k;
            this.f282b = q7;
        }

        public void a(GetCredentialException error) {
            Intrinsics.checkNotNullParameter(error, "error");
            Log.i("CredManProvService", "GetCredentialResponse error returned from framework");
            this.f281a.a(this.f282b.e(error));
        }

        public void b(GetCredentialResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            Log.i("CredManProvService", "GetCredentialResponse returned from framework");
            this.f281a.onResult(this.f282b.c(response));
        }

        public void onError(Throwable th) {
            a(V.a(th));
        }

        public void onResult(Object obj) {
            b(W.a(obj));
        }
    }

    public Q(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.credentialManager = P.a(context.getSystemService("credential"));
    }

    private final CreateCredentialRequest a(AbstractC0291b request, Context context) {
        L.a();
        CreateCredentialRequest.Builder alwaysSendAppInfoToProvider = K.a(request.getType(), F0.b.INSTANCE.a(request, context), request.getCandidateQueryData()).setIsSystemProviderRequired(request.getIsSystemProviderRequired()).setAlwaysSendAppInfoToProvider(true);
        Intrinsics.checkNotNullExpressionValue(alwaysSendAppInfoToProvider, "Builder(request.type,\n  …ndAppInfoToProvider(true)");
        g(request, alwaysSendAppInfoToProvider);
        CreateCredentialRequest createCredentialRequestBuild = alwaysSendAppInfoToProvider.build();
        Intrinsics.checkNotNullExpressionValue(createCredentialRequestBuild, "createCredentialRequestBuilder.build()");
        return createCredentialRequestBuild;
    }

    private final GetCredentialRequest b(Y request) {
        I.a();
        GetCredentialRequest.Builder builderA = C0305p.a(Y.INSTANCE.a(request));
        for (AbstractC0302m abstractC0302m : request.a()) {
            J.a();
            builderA.addCredentialOption(A.a(abstractC0302m.getType(), abstractC0302m.getRequestData(), abstractC0302m.getCandidateQueryData()).setIsSystemProviderRequired(abstractC0302m.getIsSystemProviderRequired()).setAllowedProviders(abstractC0302m.a()).build());
        }
        h(request, builderA);
        GetCredentialRequest getCredentialRequestBuild = builderA.build();
        Intrinsics.checkNotNullExpressionValue(getCredentialRequestBuild, QcdySgfdST.eceB);
        return getCredentialRequestBuild;
    }

    private final boolean f(Function0<Unit> handleNullCredMan) {
        if (this.credentialManager != null) {
            return false;
        }
        handleNullCredMan.invoke();
        return true;
    }

    private final void g(AbstractC0291b request, CreateCredentialRequest.Builder builder) {
        if (request.getOrigin() != null) {
            builder.setOrigin(request.getOrigin());
        }
    }

    private final void h(Y request, GetCredentialRequest.Builder builder) {
        if (request.getOrigin() != null) {
            builder.setOrigin(request.getOrigin());
        }
    }

    public final Z c(GetCredentialResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        Credential credential = response.getCredential();
        Intrinsics.checkNotNullExpressionValue(credential, "response.credential");
        AbstractC0298i.Companion companion = AbstractC0298i.INSTANCE;
        String type = credential.getType();
        Intrinsics.checkNotNullExpressionValue(type, "credential.type");
        Bundle data = credential.getData();
        Intrinsics.checkNotNullExpressionValue(data, "credential.data");
        return new Z(companion.a(type, data));
    }

    public final C0.e d(CreateCredentialException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        String type = error.getType();
        switch (type.hashCode()) {
            case -2055374133:
                if (type.equals("android.credentials.CreateCredentialException.TYPE_USER_CANCELED")) {
                    return new C0.c(error.getMessage());
                }
                break;
            case 1316905704:
                if (type.equals("android.credentials.CreateCredentialException.TYPE_UNKNOWN")) {
                    return new C0.i(error.getMessage());
                }
                break;
            case 2092588512:
                if (type.equals("android.credentials.CreateCredentialException.TYPE_INTERRUPTED")) {
                    return new C0.f(error.getMessage());
                }
                break;
            case 2131915191:
                if (type.equals("android.credentials.CreateCredentialException.TYPE_NO_CREATE_OPTIONS")) {
                    return new C0.g(error.getMessage());
                }
                break;
        }
        String type2 = error.getType();
        Intrinsics.checkNotNullExpressionValue(type2, BacktraceAttributeConsts.ErrorType);
        if (!StringsKt.F(type2, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false, 2, (Object) null)) {
            String type3 = error.getType();
            Intrinsics.checkNotNullExpressionValue(type3, BacktraceAttributeConsts.ErrorType);
            return new C0.d(type3, error.getMessage());
        }
        b.Companion companion = E0.b.INSTANCE;
        String type4 = error.getType();
        Intrinsics.checkNotNullExpressionValue(type4, BacktraceAttributeConsts.ErrorType);
        return companion.a(type4, error.getMessage());
    }

    public final C0.m e(GetCredentialException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        String type = error.getType();
        switch (type.hashCode()) {
            case -781118336:
                if (type.equals("android.credentials.GetCredentialException.TYPE_UNKNOWN")) {
                    return new C0.p(error.getMessage());
                }
                break;
            case -45448328:
                if (type.equals("android.credentials.GetCredentialException.TYPE_INTERRUPTED")) {
                    return new C0.n(error.getMessage());
                }
                break;
            case 580557411:
                if (type.equals("android.credentials.GetCredentialException.TYPE_USER_CANCELED")) {
                    return new C0.k(error.getMessage());
                }
                break;
            case 627896683:
                if (type.equals("android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL")) {
                    return new C0.r(error.getMessage());
                }
                break;
        }
        String type2 = error.getType();
        Intrinsics.checkNotNullExpressionValue(type2, BacktraceAttributeConsts.ErrorType);
        if (!StringsKt.F(type2, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false, 2, (Object) null)) {
            String type3 = error.getType();
            Intrinsics.checkNotNullExpressionValue(type3, BacktraceAttributeConsts.ErrorType);
            return new C0.l(type3, error.getMessage());
        }
        e.Companion companion = E0.e.INSTANCE;
        String type4 = error.getType();
        Intrinsics.checkNotNullExpressionValue(type4, BacktraceAttributeConsts.ErrorType);
        return companion.a(type4, error.getMessage());
    }

    @Override
    public boolean isAvailableOnDevice() {
        return Build.VERSION.SDK_INT >= 34 && this.credentialManager != null;
    }

    @Override
    public void onCreateCredential(Context context, AbstractC0291b request, CancellationSignal cancellationSignal, Executor executor, InterfaceC0300k<AbstractC0292c, C0.e> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, JmBUOGMwkkxg.CkwLjQikkqqmi);
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (f(new b(callback))) {
            return;
        }
        c cVar = new c(callback, request, this);
        CredentialManager credentialManager = this.credentialManager;
        Intrinsics.d(credentialManager);
        credentialManager.createCredential(context, a(request, context), cancellationSignal, executor, M.a(cVar));
    }

    @Override
    public void onGetCredential(Context context, Y request, CancellationSignal cancellationSignal, Executor executor, InterfaceC0300k<Z, C0.m> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (f(new d(callback))) {
            return;
        }
        e eVar = new e(callback, this);
        CredentialManager credentialManager = this.credentialManager;
        Intrinsics.d(credentialManager);
        credentialManager.getCredential(context, b(request), cancellationSignal, executor, (OutcomeReceiver<GetCredentialResponse, GetCredentialException>) M.a(eVar));
    }
}
