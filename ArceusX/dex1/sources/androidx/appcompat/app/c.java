package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
import g.C2447a;

public class c extends p implements DialogInterface {

    final AlertController f8593y;

    public static class a {

        private final AlertController.b f8594a;

        private final int f8595b;

        public a(Context context) {
            this(context, c.k(context, 0));
        }

        public c a() {
            c cVar = new c(this.f8594a.f8554a, this.f8595b);
            this.f8594a.a(cVar.f8593y);
            cVar.setCancelable(this.f8594a.f8571r);
            if (this.f8594a.f8571r) {
                cVar.setCanceledOnTouchOutside(true);
            }
            cVar.setOnCancelListener(this.f8594a.f8572s);
            cVar.setOnDismissListener(this.f8594a.f8573t);
            DialogInterface.OnKeyListener onKeyListener = this.f8594a.f8574u;
            if (onKeyListener != null) {
                cVar.setOnKeyListener(onKeyListener);
            }
            return cVar;
        }

        public Context b() {
            return this.f8594a.f8554a;
        }

        public a c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f8594a;
            bVar.f8576w = listAdapter;
            bVar.f8577x = onClickListener;
            return this;
        }

        public a d(boolean z7) {
            this.f8594a.f8571r = z7;
            return this;
        }

        public a e(View view) {
            this.f8594a.f8560g = view;
            return this;
        }

        public a f(Drawable drawable) {
            this.f8594a.f8557d = drawable;
            return this;
        }

        public a g(int i7) {
            AlertController.b bVar = this.f8594a;
            bVar.f8561h = bVar.f8554a.getText(i7);
            return this;
        }

        public a h(CharSequence charSequence) {
            this.f8594a.f8561h = charSequence;
            return this;
        }

        public a i(int i7, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f8594a;
            bVar.f8565l = bVar.f8554a.getText(i7);
            this.f8594a.f8567n = onClickListener;
            return this;
        }

        public a j(int i7, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f8594a;
            bVar.f8568o = bVar.f8554a.getText(i7);
            this.f8594a.f8570q = onClickListener;
            return this;
        }

        public a k(DialogInterface.OnDismissListener onDismissListener) {
            this.f8594a.f8573t = onDismissListener;
            return this;
        }

        public a l(DialogInterface.OnKeyListener onKeyListener) {
            this.f8594a.f8574u = onKeyListener;
            return this;
        }

        public a m(int i7, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f8594a;
            bVar.f8562i = bVar.f8554a.getText(i7);
            this.f8594a.f8564k = onClickListener;
            return this;
        }

        public a n(ListAdapter listAdapter, int i7, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f8594a;
            bVar.f8576w = listAdapter;
            bVar.f8577x = onClickListener;
            bVar.f8547I = i7;
            bVar.f8546H = true;
            return this;
        }

        public a o(int i7) {
            AlertController.b bVar = this.f8594a;
            bVar.f8559f = bVar.f8554a.getText(i7);
            return this;
        }

        public a p(CharSequence charSequence) {
            this.f8594a.f8559f = charSequence;
            return this;
        }

        public c q() {
            c cVarA = a();
            cVarA.show();
            return cVarA;
        }

        public a(Context context, int i7) {
            this.f8594a = new AlertController.b(new ContextThemeWrapper(context, c.k(context, i7)));
            this.f8595b = i7;
        }
    }

    protected c(Context context, int i7) {
        super(context, k(context, i7));
        this.f8593y = new AlertController(getContext(), this, getWindow());
    }

    static int k(Context context, int i7) {
        if (((i7 >>> 24) & 255) >= 1) {
            return i7;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C2447a.f20555q, typedValue, true);
        return typedValue.resourceId;
    }

    public Button i(int i7) {
        return this.f8593y.c(i7);
    }

    public ListView j() {
        return this.f8593y.e();
    }

    public void l(int i7, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.f8593y.k(i7, charSequence, onClickListener, null, null);
    }

    public void m(CharSequence charSequence) {
        this.f8593y.o(charSequence);
    }

    public void n(View view, int i7, int i8, int i9, int i10) {
        this.f8593y.t(view, i7, i8, i9, i10);
    }

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f8593y.f();
    }

    @Override
    public boolean onKeyDown(int i7, KeyEvent keyEvent) {
        if (this.f8593y.g(i7, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i7, keyEvent);
    }

    @Override
    public boolean onKeyUp(int i7, KeyEvent keyEvent) {
        if (this.f8593y.h(i7, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i7, keyEvent);
    }

    @Override
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f8593y.q(charSequence);
    }
}
