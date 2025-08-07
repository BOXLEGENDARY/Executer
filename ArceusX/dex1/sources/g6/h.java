package G6;

import G6.f;
import androidx.appcompat.widget.SearchView;
import com.roblox.client.M;
import com.roblox.client.e0;
import com.roblox.client.realtime.WEmv.tAjeAKSIqDqzNP;
import g6.p;

public class h implements f.e {

    private e0 f1468a;

    private String f1469b;

    private final String f1470c;

    private final String f1471d;

    private final String f1472e;

    private final String f1473f;

    private e7.c f1474g = new e7.g();

    public h(e0 e0Var) {
        this.f1468a = e0Var;
        this.f1470c = e0Var.getString(M.f19656i1);
        this.f1471d = this.f1468a.getString(M.k1);
        this.f1472e = this.f1468a.getString(M.f19653h1);
        this.f1473f = this.f1468a.getString(M.f19659j1);
    }

    private String d() {
        String str = this.f1469b;
        return str != null ? str : this.f1468a.Q();
    }

    @Override
    public boolean a(SearchView searchView, String str) {
        Wa.c.d().j(new p(c(), str));
        searchView.onActionViewCollapsed();
        return true;
    }

    @Override
    public String b() {
        int iC = c();
        if (iC != 1) {
            if (iC == 3) {
                return this.f1472e;
            }
            if (iC != 4) {
                return iC != 5 ? this.f1470c : this.f1473f;
            }
        }
        return this.f1471d;
    }

    @Override
    public int c() {
        String strD = d();
        if (strD == null) {
            return 2;
        }
        if (strD.contains("profile") || strD.contains("friends") || strD.contains("users")) {
            return 1;
        }
        if (strD.contains("games")) {
            return 2;
        }
        if (strD.contains("catalog")) {
            return 3;
        }
        return strD.contains(tAjeAKSIqDqzNP.aXGMVcYgUmuUC) ? 5 : 2;
    }

    public void e(String str) {
        this.f1469b = str;
    }

    public e7.f getTheme() {
        return this.f1474g.getTheme();
    }

    @Override
    public boolean onQueryTextChange(String str) {
        return false;
    }
}
