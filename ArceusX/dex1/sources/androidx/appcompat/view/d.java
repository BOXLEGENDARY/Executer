package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import g.C2455i;

public class d extends ContextWrapper {

    private static Configuration f8800f;

    private int f8801a;

    private Resources.Theme f8802b;

    private LayoutInflater f8803c;

    private Configuration f8804d;

    private Resources f8805e;

    static class a {
        static Context a(d dVar, Configuration configuration) {
            return dVar.createConfigurationContext(configuration);
        }
    }

    public d() {
        super(null);
    }

    private Resources b() {
        if (this.f8805e == null) {
            Configuration configuration = this.f8804d;
            if (configuration == null || e(configuration)) {
                this.f8805e = super.getResources();
            } else {
                this.f8805e = a.a(this, this.f8804d).getResources();
            }
        }
        return this.f8805e;
    }

    private void d() {
        boolean z7 = this.f8802b == null;
        if (z7) {
            this.f8802b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f8802b.setTo(theme);
            }
        }
        f(this.f8802b, this.f8801a, z7);
    }

    private static boolean e(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f8800f == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f8800f = configuration2;
        }
        return configuration.equals(f8800f);
    }

    public void a(Configuration configuration) {
        if (this.f8805e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f8804d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f8804d = new Configuration(configuration);
    }

    @Override
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public int c() {
        return this.f8801a;
    }

    protected void f(Resources.Theme theme, int i7, boolean z7) {
        theme.applyStyle(i7, true);
    }

    @Override
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override
    public Resources getResources() {
        return b();
    }

    @Override
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f8803c == null) {
            this.f8803c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f8803c;
    }

    @Override
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f8802b;
        if (theme != null) {
            return theme;
        }
        if (this.f8801a == 0) {
            this.f8801a = C2455i.f20718c;
        }
        d();
        return this.f8802b;
    }

    @Override
    public void setTheme(int i7) {
        if (this.f8801a != i7) {
            this.f8801a = i7;
            d();
        }
    }

    public d(Context context, int i7) {
        super(context);
        this.f8801a = i7;
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f8802b = theme;
    }
}
