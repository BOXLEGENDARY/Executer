package com.roblox.client.components;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.roblox.client.G;
import com.roblox.client.I;
import com.roblox.client.J;
import e7.e;

public class RobloxToolbar extends Toolbar implements e.b {

    private g f19930A;

    private e7.f f19931B;

    private e7.c f19932C;

    private TextView f19933d;

    private TextView f19934e;

    private Integer f19935i;

    private Integer f19936v;

    private e f19937w;

    private h f19938y;

    private i f19939z;

    static class a {

        static final int[] f19940a;

        static {
            int[] iArr = new int[e7.f.values().length];
            f19940a = iArr;
            try {
                iArr[e7.f.i.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19940a[e7.f.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class b implements e {
        @Override
        public int a(e7.f fVar) {
            int i7 = a.f19940a[fVar.ordinal()];
            return i7 != 1 ? i7 != 2 ? I.f19471n : I.f19473p : I.f19472o;
        }
    }

    public static class c implements e {
        @Override
        public int a(e7.f fVar) {
            int i7 = a.f19940a[fVar.ordinal()];
            return i7 != 1 ? i7 != 2 ? I.f19474q : I.f19476s : I.f19475r;
        }
    }

    public static class d implements h {
        @Override
        public int a(e7.f fVar) {
            return a.f19940a[fVar.ordinal()] != 1 ? G.f19448o : G.f19441h;
        }

        @Override
        public int b(e7.f fVar) {
            return a.f19940a[fVar.ordinal()] != 1 ? G.f19448o : G.f19448o;
        }
    }

    public interface e {
        int a(e7.f fVar);
    }

    public static class f implements h {
        @Override
        public int a(e7.f fVar) {
            return a.f19940a[fVar.ordinal()] != 1 ? G.f19447n : G.f19440g;
        }

        @Override
        public int b(e7.f fVar) {
            return a.f19940a[fVar.ordinal()] != 1 ? G.f19440g : G.f19447n;
        }
    }

    public static class g {
        public String a(e7.f fVar) {
            int i7 = a.f19940a[fVar.ordinal()];
            return (i7 == 1 || i7 == 2) ? "BuilderSans-Medium.otf" : "SourceSansPro-Regular.ttf";
        }
    }

    public interface h {
        int a(e7.f fVar);

        int b(e7.f fVar);
    }

    public static class i {
        public String a(e7.f fVar) {
            int i7 = a.f19940a[fVar.ordinal()];
            return (i7 == 1 || i7 == 2) ? "BuilderSans-Medium.otf" : "SourceSansPro-Semibold.ttf";
        }
    }

    public static class j implements h {
        @Override
        public int a(e7.f fVar) {
            int i7 = a.f19940a[fVar.ordinal()];
            return i7 != 1 ? i7 != 2 ? G.f19434a : G.f19448o : G.f19441h;
        }

        @Override
        public int b(e7.f fVar) {
            return a.f19940a[fVar.ordinal()] != 2 ? G.f19450q : G.f19441h;
        }
    }

    public RobloxToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19935i = null;
        this.f19936v = null;
        this.f19932C = new e7.g();
        this.f19937w = new b();
        this.f19938y = new j();
        this.f19939z = new i();
        this.f19930A = new g();
    }

    private int a(e7.f fVar) {
        if (fVar == null) {
            fVar = this.f19932C.getTheme();
        }
        return this.f19937w.a(fVar);
    }

    private void b() {
        if (this.f19934e == null) {
            TextView textView = (TextView) findViewById(J.f19525f0);
            this.f19934e = textView;
            textView.setVisibility(0);
            Integer num = this.f19936v;
            if (num != null) {
                this.f19934e.setTextColor(num.intValue());
            }
            d(this.f19934e, getSubTitleFont());
        }
    }

    private void c() {
        if (this.f19933d == null) {
            TextView textView = (TextView) findViewById(J.f19527g0);
            this.f19933d = textView;
            textView.setVisibility(0);
            Integer num = this.f19935i;
            if (num != null) {
                this.f19933d.setTextColor(num.intValue());
            }
            d(this.f19933d, getTitleFont());
        }
    }

    private void d(TextView textView, String str) {
        if (textView == null || V5.e.f(textView, str, getContext())) {
            return;
        }
        V5.e.d(textView, getContext(), str);
    }

    private void e(boolean z7) {
        if (z7) {
            setNavigationIcon(a(this.f19931B));
        } else {
            setNavigationIcon((Drawable) null);
        }
    }

    private String getSubTitleFont() {
        return this.f19930A.a(this.f19932C.getTheme());
    }

    private String getTitleFont() {
        return this.f19939z.a(this.f19932C.getTheme());
    }

    public void R(e7.f fVar) {
        if (fVar == this.f19931B) {
            return;
        }
        this.f19931B = fVar;
        int backgroundColor = getBackgroundColor();
        int foregroundColor = getForegroundColor();
        setBackgroundColor(backgroundColor);
        setTitleTextColor(foregroundColor);
        setSubtitleTextColor(foregroundColor);
        d(this.f19933d, getTitleFont());
        d(this.f19934e, getSubTitleFont());
        e(getNavigationIcon() != null);
    }

    public int getBackgroundColor() {
        return getResources().getColor(this.f19938y.a(this.f19932C.getTheme()));
    }

    public int getForegroundColor() {
        return getResources().getColor(this.f19938y.b(this.f19932C.getTheme()));
    }

    public void setIconDelegate(e eVar) {
        this.f19937w = eVar;
    }

    @Override
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        super.setNavigationOnClickListener(onClickListener);
        e(onClickListener != null);
    }

    @Override
    public void setSubtitle(CharSequence charSequence) {
        b();
        this.f19934e.setText(charSequence);
    }

    @Override
    public void setSubtitleTextColor(int i7) {
        this.f19936v = Integer.valueOf(i7);
        TextView textView = this.f19934e;
        if (textView != null) {
            textView.setTextColor(i7);
        }
    }

    public void setThemeChooser(e7.c cVar) {
        this.f19932C = cVar;
    }

    public void setThemeColorDelegate(h hVar) {
        this.f19938y = hVar;
    }

    @Override
    public void setTitle(int i7) {
        c();
        this.f19933d.setText(i7);
    }

    @Override
    public void setTitleTextColor(int i7) {
        this.f19935i = Integer.valueOf(i7);
        TextView textView = this.f19933d;
        if (textView != null) {
            textView.setTextColor(i7);
        }
    }

    @Override
    public void setVisibility(int i7) {
        super.setVisibility(i7);
    }

    @Override
    public void setTitle(CharSequence charSequence) {
        c();
        this.f19933d.setText(charSequence);
    }
}
