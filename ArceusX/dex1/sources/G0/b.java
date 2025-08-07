package G0;

import android.database.Cursor;
import android.widget.Filter;

class b extends Filter {

    a f1326a;

    interface a {
        void a(Cursor cursor);

        Cursor b();

        CharSequence d(Cursor cursor);

        Cursor g(CharSequence charSequence);
    }

    b(a aVar) {
        this.f1326a = aVar;
    }

    @Override
    public CharSequence convertResultToString(Object obj) {
        return this.f1326a.d((Cursor) obj);
    }

    @Override
    protected Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor cursorG = this.f1326a.g(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (cursorG != null) {
            filterResults.count = cursorG.getCount();
            filterResults.values = cursorG;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    @Override
    protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor cursorB = this.f1326a.b();
        Object obj = filterResults.values;
        if (obj == null || obj == cursorB) {
            return;
        }
        this.f1326a.a((Cursor) obj);
    }
}
