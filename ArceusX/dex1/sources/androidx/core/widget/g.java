package androidx.core.widget;

import android.widget.ListView;

public class g extends a {

    private final ListView f10795L;

    public g(ListView listView) {
        super(listView);
        this.f10795L = listView;
    }

    @Override
    public boolean a(int i7) {
        return false;
    }

    @Override
    public boolean b(int i7) {
        ListView listView = this.f10795L;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i8 = firstVisiblePosition + childCount;
        if (i7 > 0) {
            if (i8 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (i7 >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void t(int i7, int i8) {
        this.f10795L.scrollListBy(i8);
    }
}
