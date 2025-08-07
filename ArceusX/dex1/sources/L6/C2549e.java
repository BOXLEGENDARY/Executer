package l6;

import E6.k;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.ActivityC1663h;
import com.roblox.client.G;
import com.roblox.client.J;
import com.roblox.client.K;
import com.roblox.client.M;
import com.roblox.client.P;
import com.roblox.client.components.RobloxToolbar;
import com.roblox.client.e0;
import ha.C2702h;

public class C2549e extends e0 {

    private boolean f21839a0 = false;

    private boolean f21840b0 = false;

    private TextView f21841c0;

    private FrameLayout f21842d0;

    private ImageView f21843e0;

    private e7.d f21844f0;

    private e7.d f21845g0;

    private e7.d f21846h0;

    private RobloxToolbar.c f21847i0;

    class a implements k.d {
        a() {
        }

        @Override
        public void a(boolean z7, int i7) {
            C2549e.this.t0();
        }
    }

    static class b {

        static final int[] f21849a;

        static {
            int[] iArr = new int[e7.f.values().length];
            f21849a = iArr;
            try {
                iArr[e7.f.i.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21849a[e7.f.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class c implements e7.d {

        private final int f21850a;

        public c(Context context) {
            this.f21850a = context.getResources().getColor(G.f19445l);
        }

        public int a(e7.f fVar) {
            if (b.f21849a[fVar.ordinal()] != 1) {
                return this.f21850a;
            }
            return -1;
        }
    }

    public static class d implements e7.d {

        private final int f21851a;

        private final int f21852b;

        public d(Context context) {
            this.f21851a = context.getResources().getColor(G.f19444k);
            this.f21852b = context.getResources().getColor(G.f19442i);
        }

        public int a(e7.f fVar) {
            return b.f21849a[fVar.ordinal()] != 1 ? this.f21851a : this.f21852b;
        }
    }

    public static class C0207e implements e7.d {

        private final int f21853a;

        private final int f21854b;

        public C0207e(Context context) {
            this.f21853a = context.getResources().getColor(G.f19446m);
            this.f21854b = context.getResources().getColor(G.f19439f);
        }

        public int a(e7.f fVar) {
            return b.f21849a[fVar.ordinal()] != 1 ? this.f21853a : this.f21854b;
        }
    }

    public void p0(ActivityC1663h activityC1663h) {
        if (activityC1663h == null || activityC1663h.isFinishing() || activityC1663h.isDestroyed()) {
            return;
        }
        if (this.f21840b0) {
            dismiss();
        } else if (j6.d.a().L()) {
            r0();
        } else {
            t0();
        }
    }

    public void q0(View view) {
        dismiss();
    }

    private void r0() {
        k.e().m(new a(), new C2702h());
    }

    private void s0(LayoutInflater layoutInflater) {
        FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(K.f19575u, this.f19959O);
        frameLayout.setVisibility(0);
        ImageView imageView = (ImageView) frameLayout.findViewById(J.f19538m);
        this.f21843e0 = imageView;
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f21836d.q0(view);
            }
        });
        this.f21841c0 = (TextView) frameLayout.findViewById(J.f19543r);
        this.f21842d0 = (FrameLayout) frameLayout.findViewById(J.f19544s);
    }

    private void u0(e7.f fVar) {
        this.f21842d0.setBackgroundColor(this.f21840b0 ? this.f21845g0.a(fVar) : this.f21844f0.a(fVar));
        this.f21841c0.setTextColor(this.f21846h0.a(fVar));
        this.f21843e0.setImageResource(this.f21847i0.a(fVar));
    }

    @Override
    protected void L(L6.g gVar) {
        super.L(gVar);
        final ActivityC1663h activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(new Runnable() {
                @Override
                public final void run() {
                    this.f21837d.p0(activity);
                }
            });
        }
    }

    @Override
    protected String O() {
        return this.f21840b0 ? "buildersClub" : this.f21839a0 ? "robux" : super.O();
    }

    @Override
    public void R(e7.f fVar) {
        super.R(fVar);
        u0(fVar);
    }

    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f21844f0 = new C0207e(getContext());
        this.f21845g0 = new d(getContext());
        this.f21846h0 = new c(getContext());
        this.f21847i0 = new RobloxToolbar.c();
        s0(layoutInflater);
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (arguments.getBoolean("showRobux", false)) {
                this.f21839a0 = true;
                t0();
                r0();
            } else if (arguments.getBoolean("showPremium", false)) {
                this.f21840b0 = true;
                this.f21841c0.setText(M.f19595H);
            }
        }
        u0(g7.c.c().g());
        return viewOnCreateView;
    }

    @Override
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (k.e().f()) {
            return;
        }
        if (this.f21840b0 || this.f21839a0) {
            P.c(O(), "close");
        }
    }

    public void t0() {
        if (this.f21839a0 && isAdded()) {
            this.f21841c0.setText(getString(M.V0, L6.h.a(g7.c.c().f())));
        }
    }
}
