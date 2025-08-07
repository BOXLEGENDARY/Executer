package G6;

import android.R;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Bundle;
import android.view.InterfaceC1700n;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.ActivityC1663h;
import androidx.fragment.app.Fragment;
import com.roblox.client.C;
import com.roblox.client.E;
import com.roblox.client.G;
import com.roblox.client.H;
import com.roblox.client.I;
import com.roblox.client.J;
import com.roblox.client.L;
import com.roblox.client.M;
import com.roblox.client.NotificationStreamActivity;
import com.roblox.client.P;
import com.roblox.client.a0;
import com.roblox.client.q0;
import com.roblox.engine.jni.NativeGLInterface;

public class d {

    private final String f1442a;

    private ActivityC1663h f1443b;

    private e7.c f1444c;

    private int f1445d;

    private int f1446e;

    private MenuItem f1447f;

    private TextView f1448g;

    class a implements View.OnClickListener {
        a() {
        }

        @Override
        public void onClick(View view) throws Resources.NotFoundException {
            d.this.e();
        }
    }

    static class b {

        static final int[] f1450a;

        static {
            int[] iArr = new int[e7.f.values().length];
            f1450a = iArr;
            try {
                iArr[e7.f.e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1450a[e7.f.i.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public d(Fragment fragment) {
        this(fragment, new e7.g());
    }

    private int a() {
        if (b.f1450a[this.f1444c.getTheme().ordinal()] != 1) {
            return this.f1446e;
        }
        return -1;
    }

    private int b() {
        return b.f1450a[this.f1444c.getTheme().ordinal()] != 1 ? I.f19468k : I.f19469l;
    }

    private int c() {
        return b.f1450a[this.f1444c.getTheme().ordinal()] != 1 ? I.f19480w : I.f19481x;
    }

    private void g(int i7) {
        this.f1445d = i7;
        h((TextView) this.f1447f.getActionView().findViewById(J.f19503P), this.f1445d);
    }

    private void h(TextView textView, int i7) {
        if (i7 <= 0) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        if (i7 > 99) {
            textView.setText(textView.getContext().getString(M.f19626Y));
        } else {
            textView.setText(z6.e.a(i7));
        }
    }

    private void i(InterfaceC1700n interfaceC1700n) throws Resources.NotFoundException {
        Point pointI = q0.i(this.f1443b);
        int dimensionPixelSize = this.f1443b.getResources().getDimensionPixelSize(H.f19454d);
        int dimensionPixelSize2 = this.f1443b.getResources().getDimensionPixelSize(H.f19453c);
        int iF = (int) q0.f(this.f1443b, 80);
        int iF2 = (int) q0.f(this.f1443b, 420);
        int i7 = ((pointI.y - dimensionPixelSize2) - dimensionPixelSize) - iF;
        int iF3 = (int) q0.f(this.f1443b, 15);
        C c2 = new C();
        c2.setStyle(2, 0);
        Bundle bundle = new Bundle();
        bundle.putInt("dialogWidth", iF2);
        bundle.putInt("dialogHeight", i7);
        bundle.putInt("dialogGravity", 53);
        bundle.putInt("dialogOffsetY", dimensionPixelSize);
        bundle.putInt("dialogOffsetX", iF3);
        bundle.putString("DEFAULT_URL", a0.w0());
        c2.setArguments(bundle);
        if (interfaceC1700n != null) {
            c2.getLifecycle().a(interfaceC1700n);
        }
        c2.show(this.f1443b.getSupportFragmentManager(), "NOTIFICATION_STREAM_TAG");
    }

    public MenuItem d(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(L.f19576a, menu);
        MenuItem menuItemFindItem = menu.findItem(J.f19514a);
        this.f1447f = menuItemFindItem;
        View actionView = menuItemFindItem.getActionView();
        ImageView imageView = (ImageView) actionView.findViewById(J.f19502O);
        TextView textView = (TextView) actionView.findViewById(J.f19503P);
        this.f1448g = textView;
        h(textView, this.f1445d);
        imageView.setOnClickListener(new a());
        imageView.setImageResource(c());
        this.f1448g.setBackgroundResource(b());
        this.f1448g.setTextColor(a());
        return this.f1447f;
    }

    public void e() throws Resources.NotFoundException {
        f(null);
    }

    public void f(InterfaceC1700n interfaceC1700n) throws Resources.NotFoundException {
        if (this.f1443b == null) {
            return;
        }
        int iE = g7.c.c().e();
        if (!j6.d.a().d3()) {
            P.k(iE);
        }
        g7.c.c().q(0);
        this.f1445d = 0;
        TextView textView = this.f1448g;
        if (textView != null) {
            textView.setVisibility(8);
        }
        s7.g.d().f().e().u(new u7.a());
        if (!a0.j0()) {
            i(interfaceC1700n);
            return;
        }
        Intent intent = new Intent(this.f1443b, (Class<?>) NotificationStreamActivity.class);
        if (interfaceC1700n != null) {
            intent.putExtra("SEND_DATA_MODEL_FOCUS_EVENTS_EXTRA", true);
        }
        this.f1443b.startActivityForResult(intent, 20110);
        if (NativeGLInterface.nativeUserGameSettingsGetReducedMotion()) {
            this.f1443b.overridePendingTransition(0, 0);
        } else {
            this.f1443b.overridePendingTransition(E.f19431b, R.anim.fade_out);
        }
    }

    public void j() {
        Fragment fragmentK0 = this.f1443b.getSupportFragmentManager().k0("NOTIFICATION_STREAM_TAG");
        if (fragmentK0 != null && fragmentK0.isVisible()) {
            g7.c.c().q(0);
        }
        g(g7.c.c().e());
    }

    public d(Fragment fragment, e7.c cVar) {
        this.f1442a = "NOTIFICATION_STREAM_TAG";
        this.f1445d = -1;
        ActivityC1663h activity = fragment.getActivity();
        this.f1443b = activity;
        this.f1444c = cVar;
        Resources resources = activity.getResources();
        this.f1446e = resources != null ? resources.getColor(G.f19443j) : -12303292;
    }
}
