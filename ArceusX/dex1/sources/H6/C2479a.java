package h6;

import E6.k;
import S5.Cg.XjqcfAbdbc;
import androidx.fragment.app.Fragment;
import com.roblox.client.feature.FeatureState;
import h7.l;

public class C2479a {

    public final String f21041a = "rbx.appshell";

    private d f21042b;

    private int f21043c;

    public C2479a(d dVar, int i7) {
        this.f21042b = dVar;
        this.f21043c = i7;
    }

    private String e() {
        return C2479a.class.getName();
    }

    protected m7.c a(String str) {
        return new m7.d(str);
    }

    protected m7.b b(long j7) {
        return new m7.b("AppShellNotifications", Long.toString(j7), "StartConversationWithId", XjqcfAbdbc.weQwq);
    }

    protected m7.b c(long j7) {
        return new m7.b("AppShellNotifications", Long.toString(j7), "StartConversationWithUserId", "Chat");
    }

    public com.roblox.client.game.a d() {
        Fragment fragmentW = this.f21042b.w(e());
        if (fragmentW instanceof com.roblox.client.game.a) {
            return (com.roblox.client.game.a) fragmentW;
        }
        return null;
    }

    public boolean f() {
        com.roblox.client.game.b.k().u();
        return true;
    }

    public void g(FeatureState featureState) {
        com.roblox.client.game.a aVarD = d();
        if (aVarD == null) {
            l.g("rbx.appshell", "onShow: Create a GL fragment for LuaApp...");
            aVarD = new com.roblox.client.game.a();
        }
        l.a("rbx.appshell", "onShow: ... state = " + featureState.getName() + ", IsLoggedIn = " + k.e().f());
        if (k.e().f()) {
            i(featureState);
        }
        this.f21042b.D(this.f21043c, aVarD, e());
    }

    protected void h(m7.c cVar) {
        com.roblox.client.game.b.k().D(cVar);
    }

    protected void i(FeatureState featureState) {
        if (!featureState.getName().equals("CHAT_TAG")) {
            if (featureState.getName().equals("AVATAR_EDITOR_TAG")) {
                l.g("rbx.appshell", "sendAppEvents() start avatar");
                h(a("AvatarEditor"));
                return;
            } else if (featureState.getName().equals("HOME_TAG")) {
                l.g("rbx.appshell", "sendAppEvents() start home");
                h(a("Home"));
                return;
            } else {
                if (featureState.getName().equals("GAMES_TAG")) {
                    l.g("rbx.appshell", "sendAppEvents() start games");
                    h(a("Games"));
                    return;
                }
                return;
            }
        }
        l.g("rbx.appshell", "sendAppEvents() start chat");
        h(a("Chat"));
        long jB = featureState.b("USER_ID_EXTRA", -1L);
        long jB2 = featureState.b("CHAT_CONVERSATION_ID", -1L);
        if (jB != -1) {
            l.g("rbx.appshell", "sendAppEvents() userId:" + jB);
            j(c(jB));
            return;
        }
        if (jB2 != -1) {
            l.g("rbx.appshell", "sendAppEvents() conversationId:" + jB2);
            j(b(jB2));
        }
    }

    protected void j(m7.b bVar) {
        com.roblox.client.game.b.k().F(bVar);
    }
}
