package n3;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import m3.InterfaceC2575f;

public abstract class AbstractDialogInterfaceOnClickListenerC2665w implements DialogInterface.OnClickListener {
    public static AbstractDialogInterfaceOnClickListenerC2665w b(Activity activity, Intent intent, int i7) {
        return new C2663u(intent, activity, i7);
    }

    public static AbstractDialogInterfaceOnClickListenerC2665w c(InterfaceC2575f interfaceC2575f, Intent intent, int i7) {
        return new C2664v(intent, interfaceC2575f, 2);
    }

    protected abstract void a();

    @Override
    public final void onClick(DialogInterface dialogInterface, int i7) {
        try {
            try {
                a();
            } catch (ActivityNotFoundException e7) {
                Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e7);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
