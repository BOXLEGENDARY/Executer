package G0;

import G0.b;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import k0.BAKp.xAQOwX;

public abstract class a extends BaseAdapter implements Filterable, b.a {

    protected G0.b f1316A;

    protected boolean f1317d;

    protected boolean f1318e;

    protected Cursor f1319i;

    protected Context f1320v;

    protected int f1321w;

    protected C0019a f1322y;

    protected DataSetObserver f1323z;

    private class C0019a extends ContentObserver {
        C0019a() {
            super(new Handler());
        }

        @Override
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override
        public void onChange(boolean z7) {
            a.this.s();
        }
    }

    private class b extends DataSetObserver {
        b() {
        }

        @Override
        public void onChanged() {
            a aVar = a.this;
            aVar.f1317d = true;
            aVar.notifyDataSetChanged();
        }

        @Override
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f1317d = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z7) {
        p(context, cursor, z7 ? 1 : 2);
    }

    @Override
    public void a(Cursor cursor) {
        Cursor cursorT = t(cursor);
        if (cursorT != null) {
            cursorT.close();
        }
    }

    @Override
    public Cursor b() {
        return this.f1319i;
    }

    @Override
    public abstract CharSequence d(Cursor cursor);

    @Override
    public int getCount() {
        Cursor cursor;
        if (!this.f1317d || (cursor = this.f1319i) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override
    public View getDropDownView(int i7, View view, ViewGroup viewGroup) {
        if (!this.f1317d) {
            return null;
        }
        this.f1319i.moveToPosition(i7);
        if (view == null) {
            view = q(this.f1320v, this.f1319i, viewGroup);
        }
        o(view, this.f1320v, this.f1319i);
        return view;
    }

    @Override
    public Filter getFilter() {
        if (this.f1316A == null) {
            this.f1316A = new G0.b(this);
        }
        return this.f1316A;
    }

    @Override
    public Object getItem(int i7) {
        Cursor cursor;
        if (!this.f1317d || (cursor = this.f1319i) == null) {
            return null;
        }
        cursor.moveToPosition(i7);
        return this.f1319i;
    }

    @Override
    public long getItemId(int i7) {
        Cursor cursor;
        if (this.f1317d && (cursor = this.f1319i) != null && cursor.moveToPosition(i7)) {
            return this.f1319i.getLong(this.f1321w);
        }
        return 0L;
    }

    @Override
    public View getView(int i7, View view, ViewGroup viewGroup) {
        if (!this.f1317d) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f1319i.moveToPosition(i7)) {
            if (view == null) {
                view = r(this.f1320v, this.f1319i, viewGroup);
            }
            o(view, this.f1320v, this.f1319i);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i7);
    }

    public abstract void o(View view, Context context, Cursor cursor);

    void p(Context context, Cursor cursor, int i7) {
        if ((i7 & 1) == 1) {
            i7 |= 2;
            this.f1318e = true;
        } else {
            this.f1318e = false;
        }
        boolean z7 = cursor != null;
        this.f1319i = cursor;
        this.f1317d = z7;
        this.f1320v = context;
        this.f1321w = z7 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i7 & 2) == 2) {
            this.f1322y = new C0019a();
            this.f1323z = new b();
        } else {
            this.f1322y = null;
            this.f1323z = null;
        }
        if (z7) {
            C0019a c0019a = this.f1322y;
            if (c0019a != null) {
                cursor.registerContentObserver(c0019a);
            }
            DataSetObserver dataSetObserver = this.f1323z;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View q(Context context, Cursor cursor, ViewGroup viewGroup);

    public abstract View r(Context context, Cursor cursor, ViewGroup viewGroup);

    protected void s() {
        Cursor cursor;
        if (!this.f1318e || (cursor = this.f1319i) == null || cursor.isClosed()) {
            return;
        }
        this.f1317d = this.f1319i.requery();
    }

    public Cursor t(Cursor cursor) {
        Cursor cursor2 = this.f1319i;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0019a c0019a = this.f1322y;
            if (c0019a != null) {
                cursor2.unregisterContentObserver(c0019a);
            }
            DataSetObserver dataSetObserver = this.f1323z;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1319i = cursor;
        if (cursor != null) {
            C0019a c0019a2 = this.f1322y;
            if (c0019a2 != null) {
                cursor.registerContentObserver(c0019a2);
            }
            DataSetObserver dataSetObserver2 = this.f1323z;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f1321w = cursor.getColumnIndexOrThrow(xAQOwX.WulxPabMuT);
            this.f1317d = true;
            notifyDataSetChanged();
        } else {
            this.f1321w = -1;
            this.f1317d = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
