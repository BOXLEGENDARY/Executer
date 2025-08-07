package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

class l {

    int f11996b;

    int f11997c;

    int f11998d;

    int f11999e;

    boolean f12002h;

    boolean f12003i;

    boolean f11995a = true;

    int f12000f = 0;

    int f12001g = 0;

    l() {
    }

    boolean a(RecyclerView.A a2) {
        int i7 = this.f11997c;
        return i7 >= 0 && i7 < a2.b();
    }

    View b(RecyclerView.w wVar) {
        View viewO = wVar.o(this.f11997c);
        this.f11997c += this.f11998d;
        return viewO;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f11996b + ", mCurrentPosition=" + this.f11997c + ", mItemDirection=" + this.f11998d + ", mLayoutDirection=" + this.f11999e + ", mStartLine=" + this.f12000f + ", mEndLine=" + this.f12001g + '}';
    }
}
