package com.roblox.client.captcha;

import Wa.c;
import Wa.j;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.roblox.client.P;
import com.roblox.client.Y;
import g6.i;
import h7.l;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

public class a extends Y {

    private InterfaceC0175a f19913b0;

    private boolean f19914c0;

    private boolean f19915d0;

    private CaptchaConfig f19916e0;

    public interface InterfaceC0175a {
        void dismiss();

        void s();

        void y(String str, String str2);
    }

    public static a o0(CaptchaConfig captchaConfig) {
        a aVar = new a();
        Bundle bundle = new Bundle();
        bundle.putParcelable("captchaConfig", captchaConfig);
        aVar.setArguments(bundle);
        return aVar;
    }

    private void p0() {
        if (getView() == null) {
            return;
        }
        this.f19913b0.s();
        h0(true);
    }

    @Override
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        l.a("FragmentFunCaptcha", "onActivityCreated.");
        this.f19953I = this.f19916e0.getUrl();
        l.a("FragmentFunCaptcha", "Load captcha url: " + this.f19953I);
        a0(this.f19953I);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        l.a("FragmentFunCaptcha", "onAttach.");
        if (getActivity() instanceof InterfaceC0175a) {
            this.f19913b0 = (InterfaceC0175a) getActivity();
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l.a("FragmentFunCaptcha", "onCreate.");
        if (getArguments() != null) {
            this.f19916e0 = (CaptchaConfig) getArguments().getParcelable("captchaConfig");
        }
    }

    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        l.a("FragmentFunCaptcha", "onDetach.");
        if (!this.f19915d0) {
            this.f19913b0.dismiss();
            P.c("captcha", "close");
        }
        this.f19913b0 = null;
    }

    @j(threadMode = ThreadMode.MAIN)
    public void onNavigateToFeatureEvent(i iVar) {
        String strOptString;
        JSONObject jSONObjectOptJSONObject;
        l.a("FragmentFunCaptcha", "NavigateToFeature: " + iVar.f21001a);
        if ("CAPTCHA_SUCCESS_TAG".equals(iVar.f21001a)) {
            this.f19915d0 = true;
            JSONObject jSONObjectE = iVar.e();
            String str = null;
            if (jSONObjectE == null || (jSONObjectOptJSONObject = jSONObjectE.optJSONObject("captchaData")) == null) {
                strOptString = null;
            } else {
                String strOptString2 = jSONObjectOptJSONObject.optString("captchaToken", null);
                strOptString = jSONObjectOptJSONObject.optString("captchaProvider", null);
                str = strOptString2;
            }
            this.f19913b0.y(str, strOptString);
            return;
        }
        if ("CAPTCHA_SHOWN_TAG".equals(iVar.f21001a)) {
            l.g("FragmentFunCaptcha", "isCaptchaShown: " + this.f19914c0);
            if (this.f19914c0) {
                return;
            }
            this.f19914c0 = true;
            p0();
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        l.a("FragmentFunCaptcha", "onPause.");
        c.d().p(this);
        h0(false);
    }

    @Override
    public void onResume() {
        super.onResume();
        l.a("FragmentFunCaptcha", "onResume.");
        c.d().n(this);
        if (this.f19914c0) {
            p0();
        }
    }

    @Override
    public void onStart() {
        super.onStart();
        P.r("captcha");
    }
}
