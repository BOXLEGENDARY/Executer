package t6;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.Html;
import android.text.TextUtils;
import androidx.appcompat.app.c;
import com.github.luben.zstd.BuildConfig;
import com.roblox.client.M;
import com.roblox.client.P;
import org.json.JSONObject;
import q7.b;

public class o extends q7.b {

    private class a implements b.b {
        private void b(Context context, int i7) {
            c.a aVar = new c.a(context);
            aVar.h(context.getString(i7));
            aVar.j(M.f19583B, null);
            aVar.a().show();
        }

        public void a(q7.a aVar) {
            JSONObject jSONObjectF = aVar.f();
            String strOptString = jSONObjectF.optString("text");
            String strOptString2 = jSONObjectF.optString("link");
            E6.h.b().p("Android-AppMain-GameShare-ChooserShown");
            if (TextUtils.isEmpty(strOptString2) || strOptString == null) {
                b(aVar.c(), M.f19683v0);
                aVar.a(false, (JSONObject) null);
                return;
            }
            String string = Html.fromHtml(strOptString, 63).toString();
            String string2 = Html.fromHtml(strOptString2, 63).toString();
            String string3 = aVar.c().getString(M.f19663l0, string);
            P.t(BuildConfig.FLAVOR, string2);
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", string3 + " " + string2);
            intent.putExtra("android.intent.extra.SUBJECT", string3);
            if (!h7.n.a(aVar.c(), intent)) {
                b(aVar.c(), M.f19681u0);
                aVar.a(false, (JSONObject) null);
                return;
            }
            Intent intent2 = new Intent();
            intent2.setAction("android.intent.action.PICK_ACTIVITY");
            intent2.putExtra("android.intent.extra.INTENT", intent);
            ((Activity) aVar.c()).startActivityForResult(intent2, 20103);
            aVar.a(true, (JSONObject) null);
        }

        private a() {
        }
    }

    public o() {
        super("Social");
        d("presentShareDialog", new a());
    }
}
