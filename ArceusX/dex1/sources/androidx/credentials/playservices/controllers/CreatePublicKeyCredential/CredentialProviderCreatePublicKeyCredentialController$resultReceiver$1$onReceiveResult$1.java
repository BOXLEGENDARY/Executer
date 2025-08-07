package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import C0.e;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import j0.tkB.pkcpMQSgx;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.j;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
class CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1 extends j implements Function2<String, String, e> {
    CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1(Object obj) {
        super(2, obj, CredentialProviderBaseController.Companion.class, pkcpMQSgx.MAQyXEaWhTm, "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0);
    }

    public final e invoke(String str, String str2) {
        return ((CredentialProviderBaseController.Companion) ((d) this).receiver).createCredentialExceptionTypeToException$credentials_play_services_auth_release(str, str2);
    }
}
