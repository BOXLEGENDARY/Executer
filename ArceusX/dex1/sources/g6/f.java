package G6;

import V5.i;
import W0.JWp.kNUgEaOjcPdX;
import Z.tNT.PexNRiLSd;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import com.roblox.client.I;
import com.roblox.client.J;
import com.roblox.client.L;
import com.roblox.client.M;
import com.roblox.client.P;
import com.roblox.client.components.RobloxToolbar;
import com.roblox.client.q0;
import g.C2452f;
import h7.l;
import h7.n;

public class f {

    private Fragment f1455a;

    private MenuItem f1456b;

    private Menu f1457c;

    private RobloxToolbar f1458d;

    private e f1459e;

    class a implements MenuItem.OnActionExpandListener {

        final SearchView f1460a;

        class RunnableC0020a implements Runnable {
            RunnableC0020a() {
            }

            @Override
            public void run() {
                i.d(f.this.f1458d, f.this.i());
            }
        }

        a(SearchView searchView) {
            this.f1460a = searchView;
        }

        @Override
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            f fVar = f.this;
            fVar.m(fVar.f1457c, f.this.f1456b, true);
            f fVar2 = f.this;
            fVar2.l(fVar2.f1459e.c(), "searchClose");
            return true;
        }

        @Override
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            if (f.this.f1458d != null) {
                this.f1460a.post(new RunnableC0020a());
            }
            f fVar = f.this;
            fVar.m(fVar.f1457c, f.this.f1456b, false);
            f fVar2 = f.this;
            fVar2.l(fVar2.f1459e.c(), "searchOpen");
            return true;
        }
    }

    class b implements SearchView.OnQueryTextListener {

        final SearchView f1463a;

        b(SearchView searchView) {
            this.f1463a = searchView;
        }

        @Override
        public boolean onQueryTextChange(String str) {
            return f.this.f1459e.onQueryTextChange(str);
        }

        @Override
        public boolean onQueryTextSubmit(String str) {
            return f.this.f1459e.a(this.f1463a, str);
        }
    }

    class c implements View.OnFocusChangeListener {
        c() {
        }

        @Override
        public void onFocusChange(View view, boolean z7) {
            l.g("SearchMenuOption", "... onFocusChange: hasFocus = " + z7);
            if (z7) {
                return;
            }
            if (f.this.f1455a != null) {
                q0.j(f.this.f1455a.getActivity());
            }
            f.this.f1456b.collapseActionView();
        }
    }

    static class d {

        static final int[] f1466a;

        static {
            int[] iArr = new int[e7.f.values().length];
            f1466a = iArr;
            try {
                iArr[e7.f.e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1466a[e7.f.v.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1466a[e7.f.i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public interface e extends e7.c {
        boolean a(SearchView searchView, String str);

        String b();

        int c();

        boolean onQueryTextChange(String str);
    }

    public f(Fragment fragment) {
        this.f1455a = fragment;
    }

    public int i() {
        int i7 = d.f1466a[this.f1459e.getTheme().ordinal()];
        return i7 != 1 ? i7 != 2 ? I.f19472o : I.f19471n : I.f19473p;
    }

    private int j() {
        int i7 = d.f1466a[this.f1459e.getTheme().ordinal()];
        return i7 != 1 ? i7 != 2 ? I.f19456A : I.f19483z : I.f19457B;
    }

    public void l(int i7, String str) {
        l.g("SearchMenuOption", "reportEvents: searchType = " + i7 + ", buttonEvent = " + str);
        if (i7 == 1) {
            P.d("nativeMain", str, PexNRiLSd.dPu);
            return;
        }
        if (i7 == 2) {
            P.d("nativeMain", str, kNUgEaOjcPdX.bGVG);
        } else if (i7 == 3) {
            P.d("nativeMain", str, "catalog");
        } else {
            if (i7 != 4) {
                return;
            }
            P.c("nativeMain|friends", str);
        }
    }

    public void m(Menu menu, MenuItem menuItem, boolean z7) {
        if (menu != null) {
            for (int i7 = 0; i7 < menu.size(); i7++) {
                MenuItem item = menu.getItem(i7);
                if (item != menuItem) {
                    item.setVisible(z7);
                }
            }
        }
    }

    private void q() {
        SearchView searchView = (SearchView) this.f1456b.getActionView();
        this.f1456b.setOnActionExpandListener(new a(searchView));
        EditText editText = (EditText) searchView.findViewById(C2452f.f20638I);
        editText.setTextColor(-16777216);
        editText.setHintTextColor(-7829368);
        V5.e.d(editText, editText.getContext(), "SourceSansPro-Regular.ttf");
        searchView.findViewById(C2452f.f20637H).setBackgroundResource(I.f19470m);
        searchView.setQueryHint(searchView.getContext().getString(M.l1));
        searchView.setOnQueryTextListener(new b(searchView));
        editText.setOnFocusChangeListener(new c());
    }

    public MenuItem k(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(L.f19578c, menu);
        MenuItem menuItemFindItem = menu.findItem(J.f19518c);
        this.f1456b = menuItemFindItem;
        menuItemFindItem.setIcon(this.f1455a.getResources().getDrawable(j()));
        q();
        return this.f1456b;
    }

    public void n(Menu menu) {
        this.f1457c = menu;
    }

    public void o(e eVar) {
        this.f1459e = eVar;
    }

    public void p(RobloxToolbar robloxToolbar) {
        this.f1458d = robloxToolbar;
    }

    public void r() {
        ((SearchView) this.f1456b.getActionView()).setQueryHint(this.f1459e.b());
        boolean z7 = (n.i() && this.f1459e.c() == 2) ? false : true;
        this.f1456b.setVisible(z7);
        this.f1456b.setEnabled(z7);
    }
}
