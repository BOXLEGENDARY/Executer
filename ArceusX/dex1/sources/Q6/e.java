package Q6;

import android.content.Context;
import android.content.Intent;
import com.github.luben.zstd.BuildConfig;
import com.roblox.client.M;
import com.roblox.client.pushnotification.notificationreceivers.FriendRequestAcceptedNotificationReceiver;
import java.util.Vector;

public class e extends a<S6.c> {
    @Override
    protected String j(int i7) {
        return i7 == 2 ? "friend_request_accepted" : "friend_request_accepted_cleared";
    }

    @Override
    protected Class<?> k() {
        return FriendRequestAcceptedNotificationReceiver.class;
    }

    @Override
    protected String m(Context context) {
        String strF;
        Vector vector = this.f4873a;
        String strF2 = ((S6.c) vector.get(vector.size() - 1)).f();
        if (this.f4873a.size() > 1) {
            Vector vector2 = this.f4873a;
            strF = ((S6.c) vector2.get(vector2.size() - 2)).f();
        } else {
            strF = BuildConfig.FLAVOR;
        }
        if (this.f4873a.size() == 1) {
            return String.format(context.getResources().getString(M.f19596H0), strF2);
        }
        if (this.f4873a.size() == 2) {
            return String.format(context.getResources().getString(M.f19602K0), strF2, strF);
        }
        if (this.f4873a.size() == 3) {
            return String.format(context.getResources().getString(M.f19598I0), strF2, strF);
        }
        if (this.f4873a.size() > 3) {
            return String.format(context.getResources().getString(M.f19588D0), strF2, strF);
        }
        return null;
    }

    @Override
    public int n() {
        return 1;
    }

    @Override
    protected String p() {
        return "FriendRequestAccepted";
    }

    @Override
    protected long q() {
        return ((S6.c) this.f4873a.get(0)).e();
    }

    @Override
    public boolean c(S6.c cVar, S6.c cVar2) {
        return cVar.e() == cVar2.e();
    }

    @Override
    public Intent s(Intent intent, S6.c cVar) {
        if (this.f4873a.size() > 1) {
            intent.putExtra("EXTRA_NOTIFICATION_TYPE", "FriendRequestAccepted");
            intent.putExtra("EXTRA_CATEGORY", "FriendRequestAccepted");
            intent.putExtra("EXTRA_STACKED_NOTIFICATION", true);
        } else {
            intent.putExtra("EXTRA_NOTIFICATION_USER_ID", cVar.e());
            intent.putExtra("EXTRA_STACKED_NOTIFICATION", false);
        }
        return intent;
    }

    @Override
    public Intent t(Intent intent, S6.c cVar) {
        return intent;
    }
}
