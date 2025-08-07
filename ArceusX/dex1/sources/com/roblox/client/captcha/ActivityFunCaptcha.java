package com.roblox.client.captcha;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.TypedValue;
import androidx.fragment.app.FragmentManager;
import com.roblox.client.H;
import com.roblox.client.J;
import com.roblox.client.K;
import com.roblox.client.S;
import com.roblox.client.captcha.a;

public class ActivityFunCaptcha extends S implements a.InterfaceC0175a {
    public static Intent H0(Context context, CaptchaConfig captchaConfig) {
        Intent intent = new Intent(context, (Class<?>) ActivityFunCaptcha.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("captchaConfigKey", captchaConfig);
        intent.putExtra("captchaConfigKey", bundle);
        return intent;
    }

    private void I0(int i7) {
        setResult(i7);
        finish();
    }

    @Override
    protected void d0() {
    }

    @Override
    public void dismiss() {
        I0(102);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        I0(102);
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(K.f19555a);
        CaptchaConfig captchaConfig = (CaptchaConfig) getIntent().getBundleExtra("captchaConfigKey").getParcelable("captchaConfigKey");
        float f7 = getResources().getDisplayMetrics().widthPixels;
        int iApplyDimension = (int) TypedValue.applyDimension(1, getResources().getDimension(H.f19451a), getResources().getDisplayMetrics());
        int iApplyDimension2 = (int) TypedValue.applyDimension(1, 330.0f, getResources().getDisplayMetrics());
        if (f7 < iApplyDimension) {
            iApplyDimension = (int) f7;
        }
        getWindow().setLayout(iApplyDimension, iApplyDimension2);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.k0("FragmentFunCaptcha") == null) {
            supportFragmentManager.p().b(J.f19526g, a.o0(captchaConfig), "FragmentFunCaptcha").g();
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    public void s() {
    }

    @Override
    public void y(String str, String str2) {
        I0(101);
    }
}
