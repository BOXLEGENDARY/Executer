package androidx.recyclerview.widget;

import android.view.View;
import com.appsflyer.R;

class v {

    final b f12029a;

    a f12030b = new a();

    static class a {

        int f12031a = 0;

        int f12032b;

        int f12033c;

        int f12034d;

        int f12035e;

        a() {
        }

        void a(int i7) {
            this.f12031a = i7 | this.f12031a;
        }

        boolean b() {
            int i7 = this.f12031a;
            if ((i7 & 7) != 0 && (i7 & c(this.f12034d, this.f12032b)) == 0) {
                return false;
            }
            int i8 = this.f12031a;
            if ((i8 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) != 0 && (i8 & (c(this.f12034d, this.f12033c) << 4)) == 0) {
                return false;
            }
            int i9 = this.f12031a;
            if ((i9 & 1792) != 0 && (i9 & (c(this.f12035e, this.f12032b) << 8)) == 0) {
                return false;
            }
            int i10 = this.f12031a;
            return (i10 & 28672) == 0 || (i10 & (c(this.f12035e, this.f12033c) << 12)) != 0;
        }

        int c(int i7, int i8) {
            if (i7 > i8) {
                return 1;
            }
            return i7 == i8 ? 2 : 4;
        }

        void d() {
            this.f12031a = 0;
        }

        void e(int i7, int i8, int i9, int i10) {
            this.f12032b = i7;
            this.f12033c = i8;
            this.f12034d = i9;
            this.f12035e = i10;
        }
    }

    interface b {
        View a(int i7);

        int b(View view);

        int c();

        int d();

        int e(View view);
    }

    v(b bVar) {
        this.f12029a = bVar;
    }

    View a(int i7, int i8, int i9, int i10) {
        int iC = this.f12029a.c();
        int iD = this.f12029a.d();
        int i11 = i8 > i7 ? 1 : -1;
        View view = null;
        while (i7 != i8) {
            View viewA = this.f12029a.a(i7);
            this.f12030b.e(iC, iD, this.f12029a.b(viewA), this.f12029a.e(viewA));
            if (i9 != 0) {
                this.f12030b.d();
                this.f12030b.a(i9);
                if (this.f12030b.b()) {
                    return viewA;
                }
            }
            if (i10 != 0) {
                this.f12030b.d();
                this.f12030b.a(i10);
                if (this.f12030b.b()) {
                    view = viewA;
                }
            }
            i7 += i11;
        }
        return view;
    }

    boolean b(View view, int i7) {
        this.f12030b.e(this.f12029a.c(), this.f12029a.d(), this.f12029a.b(view), this.f12029a.e(view));
        if (i7 == 0) {
            return false;
        }
        this.f12030b.d();
        this.f12030b.a(i7);
        return this.f12030b.b();
    }
}
