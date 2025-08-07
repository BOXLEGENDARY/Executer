package androidx.credentials.playservices.controllers.GetSignInIntent;

import C0.m;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.j;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
class CredentialProviderGetSignInIntentController$resultReceiver$1$onReceiveResult$1 extends j implements Function2<String, String, m> {
    CredentialProviderGetSignInIntentController$resultReceiver$1$onReceiveResult$1(Object obj) {
        super(2, obj, CredentialProviderBaseController.Companion.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0);
    }

    public final m invoke(String str, String str2) {
        return ((CredentialProviderBaseController.Companion) ((d) this).receiver).getCredentialExceptionTypeToException$credentials_play_services_auth_release(str, str2);
    }
}
