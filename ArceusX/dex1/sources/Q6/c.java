package Q6;

import android.content.Context;
import org.json.JSONException;

public class c {
    private long a(String str) {
        return h7.g.a(str);
    }

    private i d(String str) {
        return p.c().b(str);
    }

    private i e(String str) {
        return p.c().d(str);
    }

    private String f(S6.g gVar) {
        if (gVar != null) {
            return gVar.f();
        }
        return null;
    }

    private String g(S6.g gVar) {
        if (gVar != null) {
            return gVar.e();
        }
        return null;
    }

    public void b(S6.i iVar, Context context) {
        long jA;
        S6.g gVarC = c(iVar);
        if (gVarC != null) {
            String strG = g(gVarC);
            String strF = f(gVarC);
            if (strF == null || strG == null) {
                return;
            }
            jA = a(strF);
            switch (strG) {
                case "FriendRequestAccepted":
                case "PrivateMessageReceived":
                case "FriendRequestReceived":
                    h(e(strG), context, jA);
                    break;
                case "ChatNewMessage":
                    h(d(gVarC.d()), context, jA);
                    break;
            }
        }
    }

    S6.g c(S6.i iVar) {
        try {
            return new S6.g(iVar);
        } catch (JSONException e7) {
            e7.printStackTrace();
            return null;
        }
    }

    void h(i iVar, Context context, long j7) {
        if (iVar != null) {
            iVar.d(context, j7);
        }
    }
}
