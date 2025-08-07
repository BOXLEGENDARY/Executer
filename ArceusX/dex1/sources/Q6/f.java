package Q6;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import androidx.core.app.l;
import com.roblox.client.I;
import com.roblox.client.M;
import com.roblox.client.pushnotification.notificationreceivers.FriendRequestReceivedNotificationReceiver;
import java.util.Vector;

public class f extends a<S6.d> {
    private l.e v(Context context, l.e eVar, S6.d dVar) {
        eVar.a(I.f19458a, context.getString(M.f19687x0), y(dVar, context, "friend_request_received_accepted"));
        eVar.a(I.f19466i, context.getString(M.f19689y0), y(dVar, context, "friend_request_received_ignored"));
        return eVar;
    }

    private String w(S6.d dVar) {
        return dVar.f();
    }

    private PendingIntent y(S6.d dVar, Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) FriendRequestReceivedNotificationReceiver.class);
        intent.setAction(str);
        intent.putExtra("EXTRA_NOTIFICATION_USER_ID", dVar.e());
        intent.putExtra("EXTRA_NOTIFICATION_ID", dVar.b());
        return PendingIntent.getBroadcast(context, 0, intent, 301989888);
    }

    @Override
    public Intent t(Intent intent, S6.d dVar) {
        return intent;
    }

    @Override
    protected String j(int i7) {
        return i7 == 2 ? "friend_request_received" : "friend_request_received_cleared";
    }

    @Override
    protected Class<?> k() {
        return FriendRequestReceivedNotificationReceiver.class;
    }

    @Override
    protected String m(Context context) throws Resources.NotFoundException {
        if (this.f4873a.size() == 1) {
            String string = context.getResources().getString(M.f19606M0);
            Vector vector = this.f4873a;
            return String.format(string, w((S6.d) vector.get(vector.size() - 1)));
        }
        if (this.f4873a.size() == 2) {
            String string2 = context.getResources().getString(M.f19604L0);
            Vector vector2 = this.f4873a;
            String strW = w((S6.d) vector2.get(vector2.size() - 1));
            Vector vector3 = this.f4873a;
            return String.format(string2, strW, w((S6.d) vector3.get(vector3.size() - 2)));
        }
        if (this.f4873a.size() == 3) {
            String string3 = context.getResources().getString(M.f19600J0);
            Vector vector4 = this.f4873a;
            String strW2 = w((S6.d) vector4.get(vector4.size() - 1));
            Vector vector5 = this.f4873a;
            return String.format(string3, strW2, w((S6.d) vector5.get(vector5.size() - 2)));
        }
        if (this.f4873a.size() <= 3) {
            return null;
        }
        String string4 = context.getResources().getString(M.f19590E0);
        Vector vector6 = this.f4873a;
        String strW3 = w((S6.d) vector6.get(vector6.size() - 1));
        Vector vector7 = this.f4873a;
        return String.format(string4, strW3, w((S6.d) vector7.get(vector7.size() - 2)));
    }

    @Override
    public int n() {
        return 0;
    }

    @Override
    protected String p() {
        return "FriendRequestReceived";
    }

    @Override
    protected long q() {
        return ((S6.d) this.f4873a.get(0)).e();
    }

    @Override
    protected void u(Context context, l.e eVar) {
        if (this.f4873a.isEmpty()) {
            return;
        }
        if (this.f4873a.size() == 1) {
            v(context, eVar, (S6.d) this.f4873a.get(0));
        }
        ((NotificationManager) context.getSystemService("notification")).notify(0, eVar.c());
    }

    @Override
    public boolean c(S6.d dVar, S6.d dVar2) {
        return dVar.e() == dVar2.e();
    }

    @Override
    public Intent s(Intent intent, S6.d dVar) {
        if (this.f4873a.size() > 1) {
            intent.putExtra("EXTRA_CATEGORY", "FriendRequestReceived");
            intent.putExtra("EXTRA_STACKED_NOTIFICATION", true);
        } else {
            intent.putExtra("EXTRA_NOTIFICATION_USER_ID", dVar.e());
            intent.putExtra("EXTRA_STACKED_NOTIFICATION", false);
        }
        return intent;
    }
}
