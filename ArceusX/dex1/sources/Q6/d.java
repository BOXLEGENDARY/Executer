package Q6;

import android.content.Context;
import org.json.JSONException;

public class d {
    private i d(String str) {
        return p.c().d(str);
    }

    private String e(S6.h hVar) {
        if (hVar != null) {
            return hVar.d();
        }
        return null;
    }

    private String f(S6.h hVar) {
        if (hVar != null) {
            return hVar.e();
        }
        return null;
    }

    public void a(S6.i iVar, Context context) {
        S6.h hVarC = c(iVar);
        if (hVarC != null) {
            String strF = f(hVarC);
            String strE = e(hVarC);
            if (strF == null || strE == null) {
                return;
            }
            b(context, d(strF), strE);
        }
    }

    void b(Context context, i iVar, String str) {
        if (iVar != null) {
            iVar.a(context, str);
        }
    }

    S6.h c(S6.i iVar) {
        try {
            return new S6.h(iVar);
        } catch (JSONException e7) {
            e7.printStackTrace();
            return null;
        }
    }
}
