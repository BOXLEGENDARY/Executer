package com.roblox.client.game;

import E6.k;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC1663h;
import com.roblox.client.C2366n;
import com.roblox.client.C2367o;
import com.roblox.client.C2374w;
import com.roblox.client.D;
import com.roblox.client.H;
import com.roblox.client.J;
import com.roblox.client.RbxKeyboard;
import com.roblox.client.S;
import com.roblox.client.V;
import com.roblox.client.X;
import com.roblox.client.a0;
import com.roblox.client.game.b;
import com.roblox.client.game.c;
import com.roblox.client.purchase.IAPPurchaseManager;
import com.roblox.engine.jni.OnAppBridgeNotificationListener;
import com.roblox.engine.jni.RunOnMainEngineJavaCallback;
import com.roblox.protocols.bugreporter.BugReporterProtocol;
import h7.l;
import k7.c;
import l7.a;
import m6.AbstractC2608j;
import m6.C2595L;
import m6.P;

public class a extends X implements SurfaceHolder.Callback, c.f, View.OnClickListener, L6.a {

    private g f20018G;

    private SurfaceView f20019H;

    private View f20020I;

    private View f20021J;

    private l7.a f20022K;

    private ViewTreeObserver.OnGlobalLayoutListener f20023L;

    private P f20025N;

    private boolean f20026O;

    private C2367o f20027P;

    private IAPPurchaseManager f20028Q;

    private f f20029R;

    private d f20030S;

    public final String f20017F = "AppShellFragment";

    private Handler f20024M = new Handler(Looper.getMainLooper());

    class C0177a extends l7.a {
        C0177a(Context context, a.a aVar) {
            super(context, aVar);
        }

        public l7.b b() {
            ActivityC1663h activity = a.this.getActivity();
            if (activity != null) {
                return l7.b.a(a.this.f20019H.getRootView(), activity.getWindowManager(), a.this.f20020I, ((S) a.this.getActivity()).f0().c());
            }
            return null;
        }
    }

    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override
        public void onGlobalLayout() {
            if (!a.this.isAdded()) {
                l.k("AppShellFragment", "onGlobalLayout() fragment not attached");
                return;
            }
            a.this.f20022K.d(false);
            if (a.this.getActivity() != null) {
                View viewFindViewById = a.this.getActivity().findViewById(J.f19522e);
                if (viewFindViewById == null) {
                    l.d("AppShellFragment", "Surface view not found! Cannot reset its layout.");
                    return;
                }
                ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                if (layoutParams.width == -1 && layoutParams.height == -1) {
                    return;
                }
                l.g("AppShellFragment", "Resetting surface container's layout.");
                layoutParams.width = -1;
                layoutParams.height = -1;
                viewFindViewById.setLayoutParams(layoutParams);
            }
        }
    }

    private class c implements c.a {
        @Override
        public void c(String str) {
            l.a("AppShellFragment", "onAppReady() " + str);
            if ("AvatarEditor".equals(str)) {
                l.a("AppShellFragment", "onAppReady() check catalog promo");
                a.this.f20027P.b();
            }
            if (a.this.f20018G != null) {
                a.this.f20018G.c(str);
            }
        }

        private c() {
        }
    }

    private class d extends AbstractC2608j {

        private OnAppBridgeNotificationListener f20034a;

        public void b(long j7) {
            if (a.this.f20022K != null) {
                a.this.f20022K.d(true);
            }
        }

        public void e(String str) {
            if (a.this.f20029R != null) {
                a.this.f20029R.b(true);
            }
        }

        public void f(String str, String str2) {
            if (this.f20034a == null) {
                this.f20034a = C2374w.h().a(new c(), new e());
            }
            this.f20034a.a(str, str2);
        }

        public void i(String str, String str2) {
            C2366n.f(a.this.getActivity(), str2, str);
        }

        public void j(long j7, String str) {
            a.this.f20028Q.n(j7, str);
        }

        public void k(long j7, String str, String str2) {
            a.this.f20028Q.o(j7, str, str2);
        }

        public void l(long j7, String str, String str2) {
            a.this.f20028Q.p(j7, str, str2);
        }

        @Override
        public P p() {
            return a.this.f20025N;
        }

        public void t() {
            if (this.f20034a == null) {
                this.f20034a = C2374w.h().a(new c(), new e());
            }
            ((com.roblox.client.game.c) this.f20034a).f();
        }

        private d() {
        }
    }

    private class e implements c.b {
        @Override
        public X a() {
            return a.this;
        }

        private e() {
        }
    }

    public interface f extends D {
    }

    public interface g {
        void c(String str);

        void t();
    }

    public a() {
        d dVar = new d();
        com.roblox.client.game.b.k().G(new RunOnMainEngineJavaCallback(this.f20024M, dVar));
        this.f20027P = new C2367o(this);
        this.f20028Q = new IAPPurchaseManager(this, false);
        this.f20030S = dVar;
    }

    private a.a G() throws Resources.NotFoundException {
        a.a aVar = new a.a();
        TypedValue typedValue = new TypedValue();
        getResources().getValue(H.f19454d, typedValue, true);
        aVar.a = (int) TypedValue.complexToFloat(typedValue.data);
        return aVar;
    }

    private void I(View view) {
        RbxKeyboard rbxKeyboard = (RbxKeyboard) getActivity().findViewById(J.f19551z);
        rbxKeyboard.setLayoutParams((FrameLayout.LayoutParams) rbxKeyboard.getLayoutParams());
        rbxKeyboard.setBackgroundColor(0);
        V5.e.d(rbxKeyboard, getContext(), "SourceSansPro-Regular.ttf");
        this.f20025N = new C2595L(rbxKeyboard);
    }

    private void J() throws Resources.NotFoundException {
        this.f20022K = new C0177a(getContext(), G());
        this.f20023L = new b();
        this.f20019H.getViewTreeObserver().addOnGlobalLayoutListener(this.f20023L);
    }

    private void K(View view) {
        l.a("AppShellFragment", "initSurfaceView()");
        SurfaceView surfaceView = (SurfaceView) getActivity().findViewById(J.f19511X);
        this.f20019H = surfaceView;
        surfaceView.setFocusable(true);
        this.f20019H.setFocusableInTouchMode(true);
        this.f20019H.getHolder().addCallback(this);
    }

    private void L() {
        l.a("AppShellFragment", "loadSettings()");
        this.f20021J.setVisibility(8);
        com.roblox.client.game.b.k().l(a0.C0() ? com.roblox.client.game.d.b(getContext(), getActivity()) : com.roblox.client.game.d.a(getContext()));
        this.f20019H.setVisibility(0);
    }

    private void M() {
        b.d dVarJ;
        if (a0.C0() && (dVarJ = com.roblox.client.game.b.k().j()) != null) {
            dVarJ.f20055a = getActivity();
        }
        com.roblox.client.game.b.k().I(this.f20019H.getHolder().getSurface());
        g gVar = this.f20018G;
        if (gVar != null) {
            gVar.t();
        }
    }

    @Override
    public Activity C() {
        return getActivity();
    }

    public Surface H() {
        if (this.f20026O) {
            return this.f20019H.getHolder().getSurface();
        }
        return null;
    }

    @Override
    public V S() {
        return (V) getActivity();
    }

    public boolean a() {
        return this.f20026O;
    }

    @Override
    public void o(int i7) {
        V v7 = (V) getActivity();
        if (v7 != null) {
            v7.o(i7);
        }
    }

    @Override
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f20020I = getActivity().findViewById(J.f19532j);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof f) {
            this.f20029R = (f) activity;
        } else {
            l.d("AppShellFragment", "Error: AppShellFragment cannot find the listener!");
        }
    }

    @Override
    public void onClick(View view) {
        if (view.getId() != J.f19508U || q()) {
            return;
        }
        L();
    }

    @Override
    public void onCreate(Bundle bundle) {
        if (com.roblox.client.startup.d.z()) {
            l.g("AppShellFragment", "onCreate: App was previously destroyed due to process death");
            super.onCreate(bundle);
        } else {
            super.onCreate(bundle);
            l.g("AppShellFragment", "onCreate:");
            com.roblox.client.game.b.k().H(getContext());
            com.roblox.client.game.b.k().l(a0.C0() ? com.roblox.client.game.d.b(getContext(), getActivity()) : com.roblox.client.game.d.a(getContext()));
        }
    }

    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws Resources.NotFoundException {
        l.g("AppShellFragment", "onCreateView:");
        K(null);
        I(null);
        J();
        boolean zA = this.f20029R.a();
        this.f20026O = zA;
        if (zA) {
            M();
        }
        View viewFindViewById = getActivity().findViewById(J.f19509V);
        this.f20021J = viewFindViewById;
        viewFindViewById.findViewById(J.f19508U).setOnClickListener(this);
        if (com.roblox.client.game.b.k().n()) {
            this.f20019H.setVisibility(0);
        } else {
            this.f20021J.setVisibility(0);
        }
        return null;
    }

    @Override
    public void onDestroy() {
        if (com.roblox.client.startup.d.z()) {
            l.g("AppShellFragment", "onDestroy: App was previously destroyed due to process death");
            super.onDestroy();
        } else {
            super.onDestroy();
            l.g("AppShellFragment", "onDestroy()");
            this.f20019H.getHolder().removeCallback(this);
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        l.a("AppShellFragment", "onDestroyView()");
        this.f20019H.getViewTreeObserver().removeOnGlobalLayoutListener(this.f20023L);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        this.f20029R = null;
    }

    @Override
    public void onHiddenChanged(boolean z7) {
        super.onHiddenChanged(z7);
        l.a("AppShellFragment", "onHiddenChanged() hidden:" + z7);
        if (z7) {
            com.roblox.client.game.b.k().w();
        } else {
            if (this.f20026O) {
                com.roblox.client.game.b.k().I(this.f20019H.getHolder().getSurface());
                return;
            }
            l.a("AppShellFragment", "onHiddenChanged() surface not yet created - show surface");
            this.f20019H.setVisibility(0);
            this.f20021J.setVisibility(8);
        }
    }

    @Override
    public void onPause() {
        f fVar;
        super.onPause();
        if (j6.d.a().X1() || (fVar = this.f20029R) == null) {
            return;
        }
        fVar.l();
    }

    @Override
    public void onResume() {
        super.onResume();
        if (this.f20021J.getVisibility() == 0) {
            L();
        }
    }

    @Override
    public void onStart() {
        super.onStart();
        if (k.e().f()) {
            this.f20030S.t();
        }
        f fVar = this.f20029R;
        if (fVar != null) {
            fVar.I();
        }
        U7.e.n().o(getContext());
        if (C7.c.b()) {
            C7.c.c().e(requireActivity());
        } else {
            BugReporterProtocol.c().e(getActivity());
        }
    }

    @Override
    public void onStop() {
        super.onStop();
        l.g("AppShellFragment", "onStop()");
        O7.a.a().c();
        U7.e.n().p();
        if (C7.c.b()) {
            C7.c.c().f();
        } else {
            BugReporterProtocol.c().f();
        }
    }

    @Override
    public void r(String str) {
        V v7 = (V) getActivity();
        if (v7 != null) {
            v7.r(str);
        }
    }

    @Override
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i7, int i8, int i9) {
        l.g("AppShellFragment", "surfaceChanged()");
        if (isHidden()) {
            return;
        }
        float fC = B7.a.c(getContext());
        if (!j6.d.a().X()) {
            com.roblox.client.game.b.k().L(surfaceHolder.getSurface(), fC);
        } else {
            Point pointG = B7.a.g(getContext());
            com.roblox.client.game.b.k().M(surfaceHolder.getSurface(), fC, pointG.x, pointG.y);
        }
    }

    @Override
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        l.g("AppShellFragment", "surfaceCreated()");
        this.f20026O = true;
        if (isHidden()) {
            return;
        }
        l.g("AppShellFragment", "Start the lua app");
        M();
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        l.g("AppShellFragment", "surfaceDestroyed()");
        this.f20026O = false;
        com.roblox.client.game.b.k().K();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof g) {
            this.f20018G = (g) context;
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
    }
}
