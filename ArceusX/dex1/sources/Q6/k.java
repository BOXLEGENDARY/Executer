package Q6;

import android.content.Context;
import android.content.Intent;
import com.roblox.client.M;
import com.roblox.client.pushnotification.notificationreceivers.PrivateMessageReceivedNotificationReceiver;

public class k extends a<S6.f> {
    @Override
    protected String j(int i7) {
        return i7 == 2 ? "private_message_received" : "private_message_received_cleared";
    }

    @Override
    protected Class<?> k() {
        return PrivateMessageReceivedNotificationReceiver.class;
    }

    @Override
    protected String m(Context context) {
        return this.f4873a.size() == 1 ? String.format(context.getResources().getString(M.f19594G0), l().f()) : String.format(context.getResources().getString(M.f19592F0), String.valueOf(this.f4873a.size()));
    }

    @Override
    public int n() {
        return 2;
    }

    @Override
    protected String p() {
        return "PrivateMessageReceived";
    }

    @Override
    public long q() {
        return ((S6.f) this.f4873a.get(r0.size() - 1)).e();
    }

    @Override
    public boolean c(S6.f fVar, S6.f fVar2) {
        return fVar.h() == fVar2.h();
    }

    @Override
    public Intent s(Intent intent, S6.f fVar) {
        if (this.f4873a.size() > 1) {
            intent.putExtra("EXTRA_CATEGORY", "PrivateMessageReceived");
            intent.putExtra("EXTRA_STACKED_NOTIFICATION", true);
        } else {
            intent.putExtra("EXTRA_CONVERSATION_ID", fVar.h());
            intent.putExtra("EXTRA_STACKED_NOTIFICATION", false);
        }
        return intent;
    }

    @Override
    public Intent t(Intent intent, S6.f fVar) {
        return intent;
    }
}
