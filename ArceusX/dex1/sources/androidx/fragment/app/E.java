package androidx.fragment.app;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.L;
import androidx.core.view.Z;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class E {

    class a implements Runnable {

        final int f10963d;

        final ArrayList f10964e;

        final ArrayList f10965i;

        final ArrayList f10966v;

        final ArrayList f10967w;

        a(int i7, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f10963d = i7;
            this.f10964e = arrayList;
            this.f10965i = arrayList2;
            this.f10966v = arrayList3;
            this.f10967w = arrayList4;
        }

        @Override
        public void run() {
            for (int i7 = 0; i7 < this.f10963d; i7++) {
                Z.G0((View) this.f10964e.get(i7), (String) this.f10965i.get(i7));
                Z.G0((View) this.f10966v.get(i7), (String) this.f10967w.get(i7));
            }
        }
    }

    protected static void d(List<View> list, View view) {
        int size = list.size();
        if (g(list, view, size)) {
            return;
        }
        if (Z.H(view) != null) {
            list.add(view);
        }
        for (int i7 = size; i7 < list.size(); i7++) {
            View view2 = list.get(i7);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i8 = 0; i8 < childCount; i8++) {
                    View childAt = viewGroup.getChildAt(i8);
                    if (!g(list, childAt, size) && Z.H(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    private static boolean g(List<View> list, View view, int i7) {
        for (int i8 = 0; i8 < i7; i8++) {
            if (list.get(i8) == view) {
                return true;
            }
        }
        return false;
    }

    protected static boolean i(List list) {
        return list == null || list.isEmpty();
    }

    public abstract void a(Object obj, View view);

    public abstract void b(Object obj, ArrayList<View> arrayList);

    public abstract void c(ViewGroup viewGroup, Object obj);

    public abstract boolean e(Object obj);

    public abstract Object f(Object obj);

    protected void h(View view, Rect rect) {
        if (Z.Q(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            view.getRootView().getLocationOnScreen(new int[2]);
            rectF.offset(r1[0], r1[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public abstract Object j(Object obj, Object obj2, Object obj3);

    public abstract Object k(Object obj, Object obj2, Object obj3);

    ArrayList<String> l(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            View view = arrayList.get(i7);
            arrayList2.add(Z.H(view));
            Z.G0(view, null);
        }
        return arrayList2;
    }

    public abstract void m(Object obj, View view, ArrayList<View> arrayList);

    public abstract void n(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    public abstract void o(Object obj, Rect rect);

    public abstract void p(Object obj, View view);

    public void q(Fragment fragment, Object obj, u0.e eVar, Runnable runnable) {
        runnable.run();
    }

    void r(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i7 = 0; i7 < size; i7++) {
            View view2 = arrayList.get(i7);
            String strH = Z.H(view2);
            arrayList4.add(strH);
            if (strH != null) {
                Z.G0(view2, null);
                String str = map.get(strH);
                int i8 = 0;
                while (true) {
                    if (i8 >= size) {
                        break;
                    }
                    if (str.equals(arrayList3.get(i8))) {
                        Z.G0(arrayList2.get(i8), strH);
                        break;
                    }
                    i8++;
                }
            }
        }
        L.a(view, new a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract void s(Object obj, View view, ArrayList<View> arrayList);

    public abstract void t(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract Object u(Object obj);
}
