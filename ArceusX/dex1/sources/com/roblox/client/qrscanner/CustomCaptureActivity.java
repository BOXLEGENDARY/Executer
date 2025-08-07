package com.roblox.client.qrscanner;

import a4.InterfaceC1569f;
import a4.InterfaceC1570g;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.util.Size;
import android.view.View;
import android.widget.TextView;
import androidx.camera.core.f;
import androidx.camera.core.n;
import androidx.camera.lifecycle.e;
import androidx.camera.view.PreviewView;
import androidx.core.content.a;
import com.github.luben.zstd.BuildConfig;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.common.util.concurrent.p;
import com.roblox.client.J;
import com.roblox.client.K;
import com.roblox.client.S;
import j6.d;
import java.util.List;
import java.util.concurrent.ExecutionException;
import q5.C2735b;
import q5.C2736c;
import q5.InterfaceC2734a;
import r5.C2756a;
import u5.C2938a;
import z.C3061p;
import z.o0;

public class CustomCaptureActivity extends S {

    private p<e> f20221H;

    public void N0(List list) {
        if (list.size() > 0) {
            String strD = ((C2756a) list.get(0)).d();
            Intent intent = new Intent();
            intent.putExtra("QrCodeScanResult", strD);
            setResult(-1, intent);
            finish();
        }
    }

    public void O0(Exception exc) {
        Intent intent = new Intent();
        intent.putExtra("QrCodeScanResult", BuildConfig.FLAVOR);
        setResult(0, intent);
        finish();
    }

    public void Q0(InterfaceC2734a interfaceC2734a, final n nVar) {
        interfaceC2734a.d(C2938a.c(nVar.l(), nVar.D0().c())).e(new InterfaceC1570g() {
            @Override
            public final void onSuccess(Object obj) {
                this.f7601a.N0((List) obj);
            }
        }).c(new InterfaceC1569f() {
            @Override
            public final void onFailure(Exception exc) {
                this.f7602a.O0(exc);
            }
        }).addOnCompleteListener(new OnCompleteListener() {
            @Override
            public final void onComplete(Task task) {
                nVar.close();
            }
        });
    }

    public void R0() {
        try {
            M0(this.f20221H.get());
        } catch (InterruptedException | ExecutionException unused) {
            Intent intent = new Intent();
            intent.putExtra("QrCodeScanResult", BuildConfig.FLAVOR);
            setResult(0, intent);
            finish();
        }
    }

    void M0(e eVar) {
        o0 o0VarF = new o0.a().f();
        C3061p c3061pA = new C3061p.a().a();
        o0VarF.o0(((PreviewView) findViewById(J.f19506S)).getSurfaceProvider());
        final InterfaceC2734a interfaceC2734aA = C2736c.a(new C2735b.a().b(256, new int[0]).a());
        f fVarF = new f.c().b(new Size(1280, 720)).j(0).f();
        fVarF.q0(a.h(this), new f.a() {
            @Override
            public final void k(n nVar) {
                this.f7604d.Q0(interfaceC2734aA, nVar);
            }
        });
        if (!d.a().b()) {
            eVar.o(this, c3061pA, fVarF, o0VarF);
            return;
        }
        try {
            eVar.o(this, c3061pA, fVarF, o0VarF);
        } catch (IllegalArgumentException | IllegalStateException e7) {
            Log.e("CustomCaptureActivity", "bindToLifecycle threw exception", e7);
            Intent intent = new Intent();
            intent.putExtra("QrCodeScanResult", BuildConfig.FLAVOR);
            setResult(0, intent);
            finish();
        }
    }

    public void backButtonPressed(View view) {
        finishAfterTransition();
    }

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(K.f19556b);
        String stringExtra = getIntent().getStringExtra("FONT_PATH_MESSAGE");
        if (d.a().r2()) {
            h7.d.a("FONT_PATH_MESSAGE");
        }
        Typeface typefaceCreateFromAsset = Typeface.createFromAsset(getApplicationContext().getAssets(), stringExtra);
        TextView textView = (TextView) findViewById(J.f19505R);
        TextView textView2 = (TextView) findViewById(J.f19510W);
        textView.setTypeface(typefaceCreateFromAsset);
        textView2.setTypeface(typefaceCreateFromAsset);
        p<e> pVarT = e.t(this);
        this.f20221H = pVarT;
        pVarT.c(new Runnable() {
            @Override
            public final void run() {
                this.f7600d.R0();
            }
        }, a.h(this));
    }
}
