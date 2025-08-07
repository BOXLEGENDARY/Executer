package Q6;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import androidx.core.app.l;
import androidx.core.app.u;
import com.roblox.client.I;
import com.roblox.client.M;
import com.roblox.client.pushnotification.notificationreceivers.ChatMessageNotificationReceiver;
import java.util.ArrayList;
import java.util.List;

public class b extends a<S6.b> {

    private static String f4877c = "key_reply_message";

    private long f4878b;

    public b(long j7) {
        this.f4878b = j7;
    }

    private PendingIntent A(S6.b bVar, Context context) {
        if (bVar == null) {
            return null;
        }
        Intent intent = new Intent(context, (Class<?>) ChatMessageNotificationReceiver.class);
        intent.setAction("chat_message_replied");
        if (j6.d.a().D()) {
            intent.putExtra("EXTRA_CONVERSATION_ID", bVar.f());
        } else {
            intent.putExtra("EXTRA_CONVERSATION_ID", bVar.g());
        }
        intent.putExtra("EXTRA_CATEGORY", bVar.e());
        intent.putExtra("EXTRA_CONVERSATION_TITLE", bVar.h());
        intent.putExtra("EXTRA_NOTIFICATION_ID", bVar.b());
        intent.putExtra("EXTRA_MESSAGE_ID", bVar.k());
        return PendingIntent.getBroadcast(context, (int) bVar.g(), intent, 301989888);
    }

    private l.e F(Context context, l.e eVar, String str, boolean z7) {
        String str2 = String.format(context.getString(M.f19586C0), str);
        if (z7) {
            str2 = String.format(context.getString(M.f19584B0), str);
        }
        eVar.l(str2);
        eVar.r(null);
        eVar.m(context.getString(M.f19582A0));
        eVar.z(new l.c().h(str2));
        return eVar;
    }

    private l.e v(Context context, l.e eVar) {
        String string = context.getString(M.f19691z0);
        eVar.b(new l.a.C0083a(I.f19459b, string, A(l(), context)).a(new u.d(f4877c).b(string).a()).d(true).b());
        return eVar;
    }

    private String w(S6.b bVar) {
        if (bVar.i().equals("OneToOneConversation")) {
            return bVar.j();
        }
        return bVar.n() + ": " + bVar.j();
    }

    private String x(List<S6.b> list) {
        ArrayList arrayList = new ArrayList(list);
        String strW = null;
        if (arrayList.size() > 0) {
            for (int i7 = r5 - 1; i7 >= 0; i7--) {
                S6.b bVar = (S6.b) arrayList.get(i7);
                if (!(bVar instanceof S6.a)) {
                    strW = strW == null ? w(bVar) : w(bVar) + "\n" + strW;
                }
            }
        }
        return strW;
    }

    private String y() {
        S6.b bVarL = l();
        if (bVarL != null) {
            return w(bVarL);
        }
        return null;
    }

    public static CharSequence z(Intent intent) {
        Bundle bundleJ = androidx.core.app.u.j(intent);
        if (bundleJ != null) {
            return bundleJ.getCharSequence(f4877c);
        }
        return null;
    }

    @Override
    public boolean c(S6.b bVar, S6.b bVar2) {
        return bVar.k() == bVar2.k();
    }

    @Override
    public Intent s(Intent intent, S6.b bVar) {
        intent.putExtra("EXTRA_CONVERSATION_ID", this.f4878b);
        intent.putExtra("EXTRA_CATEGORY", bVar.e());
        return intent;
    }

    @Override
    public Intent t(Intent intent, S6.b bVar) {
        intent.putExtra("EXTRA_CONVERSATION_ID", this.f4878b);
        intent.putExtra("EXTRA_CATEGORY", bVar.e());
        return intent;
    }

    @Override
    public void b(Context context, S6.b bVar) {
        this.f4873a.j("FAILURE_NOTIFICATION_ID");
        super.b(context, bVar);
    }

    @Override
    protected l.e g(Context context, boolean z7, Bitmap bitmap) {
        l.e eVarG = super.g(context, z7, bitmap);
        S6.b bVarL = l();
        if (bVarL instanceof S6.a) {
            return F(context, eVarG, bVarL.h(), ((S6.a) bVarL).p());
        }
        eVarG.l(y());
        return v(context, eVarG);
    }

    @Override
    protected String j(int i7) {
        return i7 == 2 ? "chat_message_received" : "chat_message_cleared";
    }

    @Override
    protected Class<?> k() {
        return ChatMessageNotificationReceiver.class;
    }

    @Override
    protected String m(Context context) {
        return x(this.f4873a);
    }

    @Override
    public int n() {
        return (int) this.f4878b;
    }

    @Override
    protected String o(Context context) {
        return l().h();
    }

    @Override
    protected String p() {
        return "ChatNewMessage";
    }

    @Override
    public long q() {
        return ((S6.b) this.f4873a.get(0)).m();
    }
}
