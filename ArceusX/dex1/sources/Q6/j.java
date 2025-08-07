package Q6;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

public class j {
    private String a(S6.i iVar) {
        if (iVar != null) {
            return iVar.d();
        }
        return null;
    }

    private S6.i b(JSONObject jSONObject) {
        try {
            return new S6.i(jSONObject);
        } catch (g e7) {
            h7.l.c(e7.getMessage());
            return null;
        } catch (JSONException e8) {
            e8.printStackTrace();
            return null;
        }
    }

    void c(Context context, S6.i iVar, h hVar, d dVar, c cVar) throws JSONException {
        String strA;
        if (iVar == null || (strA = a(iVar)) == null) {
            return;
        }
        if (hVar != null && ("FriendRequestAccepted".equals(strA) || "FriendRequestReceived".equals(strA) || "PrivateMessageReceived".equals(strA) || "ChatNewMessage".equals(strA))) {
            hVar.g(iVar, context);
            return;
        }
        if ("PushExpiryMessage".equals(strA) && dVar != null) {
            dVar.a(iVar, context);
        } else {
            if (!"PushCategoryExpiryMessage".equals(strA) || cVar == null) {
                return;
            }
            cVar.b(iVar, context);
        }
    }

    public void d(JSONObject jSONObject, Context context) throws JSONException {
        c(context, b(jSONObject), new h(), new d(), new c());
    }
}
