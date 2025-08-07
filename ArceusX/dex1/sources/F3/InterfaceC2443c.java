package f3;

import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.tasks.Task;
import l3.C2527b;
import l3.InterfaceC2533h;

public interface InterfaceC2443c extends InterfaceC2533h<h> {
    @Deprecated
    Task<PendingIntent> a(GetSignInIntentRequest getSignInIntentRequest);

    @Deprecated
    SignInCredential e(Intent intent) throws C2527b;

    String g(Intent intent) throws C2527b;

    Task<PendingIntent> i(GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest);

    @Deprecated
    Task<Void> j();

    @Deprecated
    Task<BeginSignInResult> k(BeginSignInRequest beginSignInRequest);
}
