package androidx.credentials.playservices;

import A3.a;
import H3.QdLC.QcdySgfdST;
import a4.InterfaceC1569f;
import a4.InterfaceC1570g;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.github.luben.zstd.BuildConfig;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.tasks.Task;
import f3.C2442b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l3.C2527b;
import w7.Jld.EZYiRMRTxKdo;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0017\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\bH\u0002J\"\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\u0012\u0010\u0012\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0014H\u0014J\u0012\u0010\u0017\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J \u0010\u0018\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Landroidx/credentials/playservices/HiddenActivity;", "Landroid/app/Activity;", "()V", "mWaitingForActivityResult", BuildConfig.FLAVOR, "resultReceiver", "Landroid/os/ResultReceiver;", "handleBeginSignIn", BuildConfig.FLAVOR, "handleCreatePassword", "handleCreatePublicKeyCredential", "handleGetSignInIntent", "onActivityResult", "requestCode", BuildConfig.FLAVOR, "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onSaveInstanceState", "outState", "restoreState", "setupFailure", "errName", BuildConfig.FLAVOR, "errMsg", "Companion", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class HiddenActivity extends Activity {
    private static final int DEFAULT_VALUE = 1;
    private static final String KEY_AWAITING_RESULT = "androidx.credentials.playservices.AWAITING_RESULT";
    private static final String TAG = "HiddenActivity";
    private boolean mWaitingForActivityResult;
    private ResultReceiver resultReceiver;

    private final void handleBeginSignIn() {
        Task<BeginSignInResult> taskC;
        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) getIntent().getParcelableExtra(CredentialProviderBaseController.REQUEST_TAG);
        int intExtra = getIntent().getIntExtra(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG, 1);
        if (beginSignInRequest != null) {
            Task<BeginSignInResult> taskK = C2442b.b(this).k(beginSignInRequest);
            final HiddenActivity$handleBeginSignIn$1$1 hiddenActivity$handleBeginSignIn$1$1 = new HiddenActivity$handleBeginSignIn$1$1(this, intExtra);
            taskC = taskK.e(new InterfaceC1570g() {
                @Override
                public final void onSuccess(Object obj) {
                    HiddenActivity.handleBeginSignIn$lambda$10$lambda$8(hiddenActivity$handleBeginSignIn$1$1, obj);
                }
            }).c(new InterfaceC1569f() {
                @Override
                public final void onFailure(Exception exc) {
                    HiddenActivity.handleBeginSignIn$lambda$10$lambda$9(this.f$0, exc);
                }
            });
        } else {
            taskC = null;
        }
        if (taskC == null) {
            Log.i(TAG, "During begin sign in, params is null, nothing to launch for begin sign in");
            finish();
        }
    }

    public static final void handleBeginSignIn$lambda$10$lambda$8(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(obj);
    }

    public static final void handleBeginSignIn$lambda$10$lambda$9(HiddenActivity hiddenActivity, Exception exc) {
        Intrinsics.checkNotNullParameter(hiddenActivity, "this$0");
        Intrinsics.checkNotNullParameter(exc, "e");
        String str = ((exc instanceof C2527b) && CredentialProviderBaseController.INSTANCE.getRetryables().contains(Integer.valueOf(((C2527b) exc).b()))) ? CredentialProviderBaseController.GET_INTERRUPTED : CredentialProviderBaseController.GET_NO_CREDENTIALS;
        ResultReceiver resultReceiver = hiddenActivity.resultReceiver;
        Intrinsics.d(resultReceiver);
        hiddenActivity.setupFailure(resultReceiver, str, "During begin sign in, failure response from one tap: " + exc.getMessage());
    }

    private final void handleCreatePassword() {
        Task<SavePasswordResult> taskC;
        SavePasswordRequest savePasswordRequest = (SavePasswordRequest) getIntent().getParcelableExtra(CredentialProviderBaseController.REQUEST_TAG);
        int intExtra = getIntent().getIntExtra(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG, 1);
        if (savePasswordRequest != null) {
            Task<SavePasswordResult> taskF = C2442b.a(this).f(savePasswordRequest);
            final HiddenActivity$handleCreatePassword$1$1 hiddenActivity$handleCreatePassword$1$1 = new HiddenActivity$handleCreatePassword$1$1(this, intExtra);
            taskC = taskF.e(new InterfaceC1570g() {
                @Override
                public final void onSuccess(Object obj) {
                    HiddenActivity.handleCreatePassword$lambda$14$lambda$12(hiddenActivity$handleCreatePassword$1$1, obj);
                }
            }).c(new InterfaceC1569f() {
                @Override
                public final void onFailure(Exception exc) {
                    HiddenActivity.handleCreatePassword$lambda$14$lambda$13(this.f$0, exc);
                }
            });
        } else {
            taskC = null;
        }
        if (taskC == null) {
            Log.i(TAG, "During save password, params is null, nothing to launch for create password");
            finish();
        }
    }

    public static final void handleCreatePassword$lambda$14$lambda$12(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(obj);
    }

    public static final void handleCreatePassword$lambda$14$lambda$13(HiddenActivity hiddenActivity, Exception exc) {
        Intrinsics.checkNotNullParameter(hiddenActivity, "this$0");
        Intrinsics.checkNotNullParameter(exc, "e");
        String str = ((exc instanceof C2527b) && CredentialProviderBaseController.INSTANCE.getRetryables().contains(Integer.valueOf(((C2527b) exc).b()))) ? CredentialProviderBaseController.CREATE_INTERRUPTED : CredentialProviderBaseController.CREATE_UNKNOWN;
        ResultReceiver resultReceiver = hiddenActivity.resultReceiver;
        Intrinsics.d(resultReceiver);
        hiddenActivity.setupFailure(resultReceiver, str, "During save password, found password failure response from one tap " + exc.getMessage());
    }

    private final void handleCreatePublicKeyCredential() {
        Task<PendingIntent> taskC;
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) getIntent().getParcelableExtra(CredentialProviderBaseController.REQUEST_TAG);
        int intExtra = getIntent().getIntExtra(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG, 1);
        if (publicKeyCredentialCreationOptions != null) {
            Task<PendingIntent> taskE = a.a(this).E(publicKeyCredentialCreationOptions);
            final HiddenActivity$handleCreatePublicKeyCredential$1$1 hiddenActivity$handleCreatePublicKeyCredential$1$1 = new HiddenActivity$handleCreatePublicKeyCredential$1$1(this, intExtra);
            taskC = taskE.e(new InterfaceC1570g() {
                @Override
                public final void onSuccess(Object obj) {
                    HiddenActivity.handleCreatePublicKeyCredential$lambda$2$lambda$0(hiddenActivity$handleCreatePublicKeyCredential$1$1, obj);
                }
            }).c(new InterfaceC1569f() {
                @Override
                public final void onFailure(Exception exc) {
                    HiddenActivity.handleCreatePublicKeyCredential$lambda$2$lambda$1(this.f$0, exc);
                }
            });
        } else {
            taskC = null;
        }
        if (taskC == null) {
            Log.w(TAG, "During create public key credential, request is null, so nothing to launch for public key credentials");
            finish();
        }
    }

    public static final void handleCreatePublicKeyCredential$lambda$2$lambda$0(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(obj);
    }

    public static final void handleCreatePublicKeyCredential$lambda$2$lambda$1(HiddenActivity hiddenActivity, Exception exc) {
        Intrinsics.checkNotNullParameter(hiddenActivity, "this$0");
        Intrinsics.checkNotNullParameter(exc, "e");
        String str = ((exc instanceof C2527b) && CredentialProviderBaseController.INSTANCE.getRetryables().contains(Integer.valueOf(((C2527b) exc).b()))) ? CredentialProviderBaseController.CREATE_INTERRUPTED : CredentialProviderBaseController.CREATE_UNKNOWN;
        ResultReceiver resultReceiver = hiddenActivity.resultReceiver;
        Intrinsics.d(resultReceiver);
        hiddenActivity.setupFailure(resultReceiver, str, "During create public key credential, fido registration failure: " + exc.getMessage());
    }

    private final void handleGetSignInIntent() {
        Task<PendingIntent> taskC;
        GetSignInIntentRequest getSignInIntentRequest = (GetSignInIntentRequest) getIntent().getParcelableExtra(CredentialProviderBaseController.REQUEST_TAG);
        int intExtra = getIntent().getIntExtra(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG, 1);
        if (getSignInIntentRequest != null) {
            Task<PendingIntent> taskA = C2442b.b(this).a(getSignInIntentRequest);
            final HiddenActivity$handleGetSignInIntent$1$1 hiddenActivity$handleGetSignInIntent$1$1 = new HiddenActivity$handleGetSignInIntent$1$1(this, intExtra);
            taskC = taskA.e(new InterfaceC1570g() {
                @Override
                public final void onSuccess(Object obj) {
                    HiddenActivity.handleGetSignInIntent$lambda$6$lambda$4(hiddenActivity$handleGetSignInIntent$1$1, obj);
                }
            }).c(new InterfaceC1569f() {
                @Override
                public final void onFailure(Exception exc) {
                    HiddenActivity.handleGetSignInIntent$lambda$6$lambda$5(this.f$0, exc);
                }
            });
        } else {
            taskC = null;
        }
        if (taskC == null) {
            Log.i(TAG, "During get sign-in intent, params is null, nothing to launch for get sign-in intent");
            finish();
        }
    }

    public static final void handleGetSignInIntent$lambda$6$lambda$4(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(obj);
    }

    public static final void handleGetSignInIntent$lambda$6$lambda$5(HiddenActivity hiddenActivity, Exception exc) {
        Intrinsics.checkNotNullParameter(hiddenActivity, "this$0");
        Intrinsics.checkNotNullParameter(exc, "e");
        String str = ((exc instanceof C2527b) && CredentialProviderBaseController.INSTANCE.getRetryables().contains(Integer.valueOf(((C2527b) exc).b()))) ? CredentialProviderBaseController.GET_INTERRUPTED : EZYiRMRTxKdo.nNXYthPVvbca;
        ResultReceiver resultReceiver = hiddenActivity.resultReceiver;
        Intrinsics.d(resultReceiver);
        hiddenActivity.setupFailure(resultReceiver, str, QcdySgfdST.ZDQlpLau + exc.getMessage());
    }

    private final void restoreState(Bundle savedInstanceState) {
        if (savedInstanceState != null) {
            this.mWaitingForActivityResult = savedInstanceState.getBoolean(KEY_AWAITING_RESULT, false);
        }
    }

    public final void setupFailure(ResultReceiver resultReceiver, String errName, String errMsg) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(CredentialProviderBaseController.FAILURE_RESPONSE_TAG, true);
        bundle.putString(CredentialProviderBaseController.EXCEPTION_TYPE_TAG, errName);
        bundle.putString(CredentialProviderBaseController.EXCEPTION_MESSAGE_TAG, errMsg);
        resultReceiver.send(Integer.MAX_VALUE, bundle);
        finish();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Bundle bundle = new Bundle();
        bundle.putBoolean(CredentialProviderBaseController.FAILURE_RESPONSE_TAG, false);
        bundle.putInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG, requestCode);
        bundle.putParcelable(CredentialProviderBaseController.RESULT_DATA_TAG, data);
        ResultReceiver resultReceiver = this.resultReceiver;
        if (resultReceiver != null) {
            resultReceiver.send(resultCode, bundle);
        }
        this.mWaitingForActivityResult = false;
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(0, 0);
        String stringExtra = getIntent().getStringExtra(CredentialProviderBaseController.TYPE_TAG);
        ResultReceiver resultReceiver = (ResultReceiver) getIntent().getParcelableExtra(CredentialProviderBaseController.RESULT_RECEIVER_TAG);
        this.resultReceiver = resultReceiver;
        if (resultReceiver == null) {
            finish();
        }
        restoreState(savedInstanceState);
        if (this.mWaitingForActivityResult) {
            return;
        }
        if (stringExtra != null) {
            switch (stringExtra.hashCode()) {
                case -441061071:
                    if (stringExtra.equals(CredentialProviderBaseController.BEGIN_SIGN_IN_TAG)) {
                        handleBeginSignIn();
                        return;
                    }
                    break;
                case 15545322:
                    if (stringExtra.equals(CredentialProviderBaseController.CREATE_PUBLIC_KEY_CREDENTIAL_TAG)) {
                        handleCreatePublicKeyCredential();
                        return;
                    }
                    break;
                case 1246634622:
                    if (stringExtra.equals(CredentialProviderBaseController.CREATE_PASSWORD_TAG)) {
                        handleCreatePassword();
                        return;
                    }
                    break;
                case 1980564212:
                    if (stringExtra.equals(CredentialProviderBaseController.SIGN_IN_INTENT_TAG)) {
                        handleGetSignInIntent();
                        return;
                    }
                    break;
            }
        }
        Log.w(TAG, "Activity handed an unsupported type");
        finish();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        outState.putBoolean(KEY_AWAITING_RESULT, this.mWaitingForActivityResult);
        super.onSaveInstanceState(outState);
    }
}
