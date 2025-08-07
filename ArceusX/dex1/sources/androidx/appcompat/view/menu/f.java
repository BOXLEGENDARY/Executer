package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.n;
import java.util.ArrayList;

public class f extends BaseAdapter {

    g f8983d;

    private int f8984e = -1;

    private boolean f8985i;

    private final boolean f8986v;

    private final LayoutInflater f8987w;

    private final int f8988y;

    public f(g gVar, LayoutInflater layoutInflater, boolean z7, int i7) {
        this.f8986v = z7;
        this.f8987w = layoutInflater;
        this.f8983d = gVar;
        this.f8988y = i7;
        a();
    }

    void a() {
        i iVarV = this.f8983d.v();
        if (iVarV != null) {
            ArrayList<i> arrayListZ = this.f8983d.z();
            int size = arrayListZ.size();
            for (int i7 = 0; i7 < size; i7++) {
                if (arrayListZ.get(i7) == iVarV) {
                    this.f8984e = i7;
                    return;
                }
            }
        }
        this.f8984e = -1;
    }

    public g b() {
        return this.f8983d;
    }

    @Override
    public i getItem(int i7) {
        ArrayList<i> arrayListZ = this.f8986v ? this.f8983d.z() : this.f8983d.E();
        int i8 = this.f8984e;
        if (i8 >= 0 && i7 >= i8) {
            i7++;
        }
        return arrayListZ.get(i7);
    }

    public void d(boolean z7) {
        this.f8985i = z7;
    }

    @Override
    public int getCount() {
        return this.f8984e < 0 ? (this.f8986v ? this.f8983d.z() : this.f8983d.E()).size() : r0.size() - 1;
    }

    @Override
    public long getItemId(int i7) {
        return i7;
    }

    @Override
    public View getView(int i7, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f8987w.inflate(this.f8988y, viewGroup, false);
        }
        int groupId = getItem(i7).getGroupId();
        int i8 = i7 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f8983d.F() && groupId != (i8 >= 0 ? getItem(i8).getGroupId() : groupId));
        n.a aVar = (n.a) view;
        if (this.f8985i) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.b(getItem(i7), 0);
        return view;
    }

    @Override
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
