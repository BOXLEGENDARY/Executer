package l6;

import E6.k;
import android.content.Context;
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
import com.roblox.client.k0;
import ha.C2702h;
import t4.gYZ.uCYQMIHsy;

public class C2552h extends k0 {

    private boolean f21858P = false;

    private boolean f21859Q = false;

    private TextView f21860R;

    private FrameLayout f21861S;

    private ImageView f21862T;

    private e7.d f21863U;

    private e7.d f21864V;

    private e7.d f21865W;

    private RobloxToolbar.c f21866X;

    class a implements k.d {
        a() {
        }

        @Override
        public void a(boolean z7, int i7) {
            C2552h.this.l0();
        }
    }

    static class b {

        static final int[] f21868a;

        static {
            int[] iArr = new int[e7.f.values().length];
            f21868a = iArr;
            try {
                iArr[e7.f.i.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21868a[e7.f.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class c implements e7.d {

        private final int f21869a;

        public c(Context context) {
            this.f21869a = context.getResources().getColor(G.f19445l);
        }

        public int a(e7.f fVar) {
            if (b.f21868a[fVar.ordinal()] != 1) {
                return this.f21869a;
            }
            return -1;
        }
    }

    public static class d implements e7.d {

        private final int f21870a;

        private final int f21871b;

        public d(Context context) {
            this.f21870a = context.getResources().getColor(G.f19444k);
            this.f21871b = context.getResources().getColor(G.f19442i);
        }

        public int a(e7.f fVar) {
            return b.f21868a[fVar.ordinal()] != 1 ? this.f21870a : this.f21871b;
        }
    }

    public static class e implements e7.d {

        private final int f21872a;

        private final int f21873b;

        public e(Context context) {
            this.f21872a = context.getResources().getColor(G.f19446m);
            this.f21873b = context.getResources().getColor(G.f19439f);
        }

        public int a(e7.f fVar) {
            return b.f21868a[fVar.ordinal()] != 1 ? this.f21872a : this.f21873b;
        }
    }

    private void dismiss() {
        getActivity().getSupportFragmentManager().d1();
    }

    public void g0(ActivityC1663h activityC1663h) {
        if (activityC1663h == null || activityC1663h.isFinishing() || activityC1663h.isDestroyed()) {
            return;
        }
        if (this.f21859Q) {
            dismiss();
        } else if (j6.d.a().L()) {
            j0();
        } else {
            l0();
        }
    }

    public void h0(View view) {
        dismiss();
    }

    private void j0() {
        k.e().m(new a(), new C2702h());
    }

    private void k0(LayoutInflater layoutInflater) {
        FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(K.f19575u, this.f20089C);
        frameLayout.setVisibility(0);
        ImageView imageView = (ImageView) frameLayout.findViewById(J.f19538m);
        this.f21862T = imageView;
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f21855d.h0(view);
            }
        });
        this.f21860R = (TextView) frameLayout.findViewById(J.f19543r);
        this.f21861S = (FrameLayout) frameLayout.findViewById(J.f19544s);
    }

    private void m0(e7.f fVar) {
        this.f21861S.setBackgroundColor(this.f21859Q ? this.f21864V.a(fVar) : this.f21863U.a(fVar));
        this.f21860R.setTextColor(this.f21865W.a(fVar));
        this.f21862T.setImageResource(this.f21866X.a(fVar));
    }

    @Override
    protected void F(L6.g gVar) {
        super.F(gVar);
        final ActivityC1663h activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(new Runnable() {
                @Override
                public final void run() {
                    this.f21856d.g0(activity);
                }
            });
        }
    }

    @Override
    protected String K() {
        return this.f21859Q ? "buildersClub" : this.f21858P ? "robux" : super.K();
    }

    public void l0() {
        if (this.f21858P && isAdded()) {
            this.f21860R.setText(getString(M.V0, L6.h.a(g7.c.c().f())));
        }
    }

    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f21863U = new e(getContext());
        this.f21864V = new d(getContext());
        this.f21865W = new c(getContext());
        this.f21866X = new RobloxToolbar.c();
        k0(layoutInflater);
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (arguments.getBoolean("showRobux", false)) {
                this.f21858P = true;
                l0();
                j0();
            } else if (arguments.getBoolean(uCYQMIHsy.mqziIyvrgyKn, false)) {
                this.f21859Q = true;
                this.f21860R.setText(M.f19595H);
            }
        }
        m0(g7.c.c().g());
        return viewOnCreateView;
    }

    @Override
    public void onDestroyView() {
        if (!k.e().f() && (this.f21859Q || this.f21858P)) {
            P.c(K(), "close");
        }
        super.onDestroyView();
    }
}
