package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import g.C2453g;
import java.util.ArrayList;

public class e implements m, AdapterView.OnItemClickListener {

    private m.a f8972A;

    a f8973B;

    Context f8974d;

    LayoutInflater f8975e;

    g f8976i;

    ExpandedMenuView f8977v;

    int f8978w;

    int f8979y;

    int f8980z;

    private class a extends BaseAdapter {

        private int f8981d = -1;

        public a() {
            a();
        }

        void a() {
            i iVarV = e.this.f8976i.v();
            if (iVarV != null) {
                ArrayList<i> arrayListZ = e.this.f8976i.z();
                int size = arrayListZ.size();
                for (int i7 = 0; i7 < size; i7++) {
                    if (arrayListZ.get(i7) == iVarV) {
                        this.f8981d = i7;
                        return;
                    }
                }
            }
            this.f8981d = -1;
        }

        @Override
        public i getItem(int i7) {
            ArrayList<i> arrayListZ = e.this.f8976i.z();
            int i8 = i7 + e.this.f8978w;
            int i9 = this.f8981d;
            if (i9 >= 0 && i8 >= i9) {
                i8++;
            }
            return arrayListZ.get(i8);
        }

        @Override
        public int getCount() {
            int size = e.this.f8976i.z().size() - e.this.f8978w;
            return this.f8981d < 0 ? size : size - 1;
        }

        @Override
        public long getItemId(int i7) {
            return i7;
        }

        @Override
        public View getView(int i7, View view, ViewGroup viewGroup) {
            if (view == null) {
                e eVar = e.this;
                view = eVar.f8975e.inflate(eVar.f8980z, viewGroup, false);
            }
            ((n.a) view).b(getItem(i7), 0);
            return view;
        }

        @Override
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public e(Context context, int i7) {
        this(i7, 0);
        this.f8974d = context;
        this.f8975e = LayoutInflater.from(context);
    }

    @Override
    public void a(g gVar, boolean z7) {
        m.a aVar = this.f8972A;
        if (aVar != null) {
            aVar.a(gVar, z7);
        }
    }

    @Override
    public void b(boolean z7) {
        a aVar = this.f8973B;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public boolean d(g gVar, i iVar) {
        return false;
    }

    @Override
    public boolean e(g gVar, i iVar) {
        return false;
    }

    @Override
    public void f(m.a aVar) {
        this.f8972A = aVar;
    }

    @Override
    public void g(Context context, g gVar) {
        if (this.f8979y != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f8979y);
            this.f8974d = contextThemeWrapper;
            this.f8975e = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f8974d != null) {
            this.f8974d = context;
            if (this.f8975e == null) {
                this.f8975e = LayoutInflater.from(context);
            }
        }
        this.f8976i = gVar;
        a aVar = this.f8973B;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override
    public boolean h(r rVar) {
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        new h(rVar).d(null);
        m.a aVar = this.f8972A;
        if (aVar == null) {
            return true;
        }
        aVar.b(rVar);
        return true;
    }

    public ListAdapter i() {
        if (this.f8973B == null) {
            this.f8973B = new a();
        }
        return this.f8973B;
    }

    public n j(ViewGroup viewGroup) {
        if (this.f8977v == null) {
            this.f8977v = (ExpandedMenuView) this.f8975e.inflate(C2453g.f20685i, viewGroup, false);
            if (this.f8973B == null) {
                this.f8973B = new a();
            }
            this.f8977v.setAdapter((ListAdapter) this.f8973B);
            this.f8977v.setOnItemClickListener(this);
        }
        return this.f8977v;
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i7, long j7) {
        this.f8976i.M(this.f8973B.getItem(i7), this, 0);
    }

    public e(int i7, int i8) {
        this.f8980z = i7;
        this.f8979y = i8;
    }
}
