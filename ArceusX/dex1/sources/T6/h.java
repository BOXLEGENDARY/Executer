package t6;

import org.json.JSONObject;
import q7.b;
import t4.gYZ.uCYQMIHsy;

public class h extends q7.b {

    private class a implements b.b {
        private String b(String str) {
            if ("Settings".equals(str)) {
                return "SETTINGS_TAG";
            }
            if ("Friends".equals(str)) {
                return "FRIENDS_TAG";
            }
            if ("Games".equals(str)) {
                return "GAMES_TAG";
            }
            if ("Home".equals(str)) {
                return "HOME_TAG";
            }
            if ("Messages".equals(str)) {
                return "MESSAGES_TAG";
            }
            if ("Avatar".equals(str)) {
                return "AVATAR_EDITOR_TAG";
            }
            if ("Abuse Report".equals(str)) {
                return "ABUSE_REPORT_TAG";
            }
            if ("Friend Finder".equals(str)) {
                return "FRIEND_FINDER_TAG";
            }
            if ("Universal Friends".equals(str)) {
                return "UNIVERSAL_FRIENDS_TAG";
            }
            if (uCYQMIHsy.NOZMJsCcTGbKkCm.equals(str)) {
                return "GAME_DETAILS_TAG";
            }
            if ("CaptchaSuccess".equals(str)) {
                return "CAPTCHA_SUCCESS_TAG";
            }
            if ("CaptchaShown".equals(str)) {
                return "CAPTCHA_SHOWN_TAG";
            }
            return null;
        }

        public void a(q7.a r7) {
            throw new UnsupportedOperationException("Method not decompiled: t6.h.a.a(q7.a):void");
        }

        private a() {
        }
    }

    private class b implements b.b {
        public void a(q7.a aVar) {
            JSONObject jSONObjectF = aVar.f();
            if (jSONObjectF != null) {
                long jOptLong = jSONObjectF.optLong("userId", -1L);
                g6.i iVar = new g6.i("PROFILE_TAG");
                iVar.i(g6.i.c(jOptLong));
                Wa.c.d().j(iVar);
                aVar.a(true, (JSONObject) null);
            }
        }

        private b() {
        }
    }

    public h() {
        super("Navigation");
        d("navigateToFeature", new a());
        d("openUserProfile", new b());
    }
}
