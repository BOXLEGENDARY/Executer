package I3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

public final class h extends androidx.core.content.a {
    @ResultIgnorabilityUnspecified
    @Deprecated
    public static Intent n(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (g.a()) {
            return context.registerReceiver(broadcastReceiver, intentFilter, true != g.a() ? 0 : 2);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter);
    }
}
