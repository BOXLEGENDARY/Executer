package Q6;

import Q6.QtA.QXojhh;
import android.content.Context;
import org.json.JSONException;

public class h {
    private S6.b a(S6.i iVar) {
        try {
            return new S6.b(iVar);
        } catch (g e7) {
            h7.l.c(e7.getMessage());
            return null;
        } catch (JSONException e8) {
            e8.printStackTrace();
            return null;
        }
    }

    private i b(S6.i iVar, S6.m mVar) {
        String strD;
        if (iVar == null || (strD = iVar.d()) == null) {
            return null;
        }
        if ("FriendRequestAccepted".equals(strD) || "FriendRequestReceived".equals(strD) || "PrivateMessageReceived".equals(strD)) {
            return p.c().d(strD);
        }
        if (mVar == null || !"ChatNewMessage".equals(strD)) {
            return null;
        }
        return d((S6.b) mVar);
    }

    private i d(S6.b bVar) {
        return p.c().e(bVar.e(), bVar.g());
    }

    S6.m c(S6.i iVar) {
        String strD;
        S6.m fVar;
        if (iVar == null || (strD = iVar.d()) == null) {
            return null;
        }
        try {
            if (QXojhh.gZxhjUeAETejV.equals(strD)) {
                fVar = new S6.c(iVar);
            } else if ("FriendRequestReceived".equals(strD)) {
                fVar = new S6.d(iVar);
            } else {
                if (!"PrivateMessageReceived".equals(strD)) {
                    if ("ChatNewMessage".equals(strD)) {
                        return a(iVar);
                    }
                    return null;
                }
                fVar = new S6.f(iVar);
            }
            return fVar;
        } catch (g e7) {
            h7.l.c(e7.getMessage());
            return null;
        } catch (JSONException e8) {
            e8.printStackTrace();
            return null;
        }
    }

    @Deprecated
    public void e(Context context, String str, long j7, String str2, boolean z7) {
        S6.a aVar = new S6.a(str, j7, str2, z7);
        h(aVar, context, d(aVar));
    }

    public void f(Context context, String str, String str2, String str3, boolean z7) {
        S6.a aVar = new S6.a(str, str2, str3, z7);
        h(aVar, context, d(aVar));
    }

    public void g(S6.i iVar, Context context) {
        S6.m mVarC = c(iVar);
        h(mVarC, context, b(iVar, mVarC));
    }

    void h(S6.m mVar, Context context, i iVar) {
        if (mVar == null || iVar == null) {
            return;
        }
        iVar.b(context, mVar);
    }
}
