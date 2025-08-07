package m6;

import H3.QdLC.QcdySgfdST;
import Y3.qE.KpBmp;
import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.core.view.C1630m0;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.Z;
import backtraceio.library.breadcrumbs.BacktraceBreadcrumbs;
import backtraceio.library.interfaces.TNiz.vxbbqXNtzfMxs;
import com.google.android.material.checkbox.czZ.GObvYfBKohxpYX;
import com.roblox.client.RbxKeyboard;
import com.roblox.client.q0;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.model.NativeTextBoxInfo;
import java.util.Iterator;
import java.util.List;
import m6.C2617t;
import n6.AbstractC2672a;

public class ViewTreeObserverOnGlobalLayoutListenerC2590G extends AbstractC2672a implements ViewTreeObserver.OnGlobalLayoutListener, ComponentCallbacks {

    private SurfaceHolderCallbackC2587D f22079A;

    private C2617t.f f22080B;

    protected NativeTextBoxInfo f22081C;

    private d f22082D;

    private Handler f22083E;

    private long f22084F;

    private int f22085G;

    private int f22086H;

    private boolean f22087I;

    private int f22088J;

    private int f22089K;

    private b f22090L;

    private final boolean f22091i;

    private final int f22092v;

    private final int f22093w;

    private final int f22094y;

    private l7.b f22095z;

    class a extends C1630m0.b {

        int f22096c;

        a(int i7) {
            super(i7);
            this.f22096c = 0;
        }

        @Override
        public WindowInsetsCompat d(WindowInsetsCompat windowInsetsCompat, List<C1630m0> list) {
            C1630m0 next;
            Iterator<C1630m0> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if ((next.c() & WindowInsetsCompat.Type.ime()) != 0) {
                    break;
                }
            }
            if (next != null) {
                ViewTreeObserverOnGlobalLayoutListenerC2590G.this.f22088J = this.f22096c + ((int) ((r6.f22089K - this.f22096c) * next.b()));
                ViewTreeObserverOnGlobalLayoutListenerC2590G viewTreeObserverOnGlobalLayoutListenerC2590G = ViewTreeObserverOnGlobalLayoutListenerC2590G.this;
                viewTreeObserverOnGlobalLayoutListenerC2590G.v(viewTreeObserverOnGlobalLayoutListenerC2590G.f22088J);
            }
            return windowInsetsCompat;
        }

        @Override
        public C1630m0.a e(C1630m0 c1630m0, C1630m0.a aVar) {
            this.f22096c = ViewTreeObserverOnGlobalLayoutListenerC2590G.this.f22088J;
            return aVar;
        }
    }

    private class b extends V5.b<c> {

        class a implements Runnable {
            a() {
            }

            @Override
            public void run() {
                if (ViewTreeObserverOnGlobalLayoutListenerC2590G.this.f22089K == ViewTreeObserverOnGlobalLayoutListenerC2590G.this.f22088J) {
                    h7.l.a("rbx.glview.text", "Y Shift animated successfully!");
                    return;
                }
                h7.l.a("rbx.glview.text", "The Y shift wasn't animated in time, force set!");
                ViewTreeObserverOnGlobalLayoutListenerC2590G viewTreeObserverOnGlobalLayoutListenerC2590G = ViewTreeObserverOnGlobalLayoutListenerC2590G.this;
                viewTreeObserverOnGlobalLayoutListenerC2590G.f22088J = viewTreeObserverOnGlobalLayoutListenerC2590G.f22089K;
                ViewTreeObserverOnGlobalLayoutListenerC2590G viewTreeObserverOnGlobalLayoutListenerC2590G2 = ViewTreeObserverOnGlobalLayoutListenerC2590G.this;
                viewTreeObserverOnGlobalLayoutListenerC2590G2.v(viewTreeObserverOnGlobalLayoutListenerC2590G2.f22089K);
            }
        }

        public b(String str) {
            super(str);
        }

        @Override
        public void a(c cVar) {
            ViewTreeObserverOnGlobalLayoutListenerC2590G.this.f22083E.post(new a());
        }
    }

    private class c {

        int f22100a;

        public c(int i7) {
            this.f22100a = i7;
        }
    }

    private class d extends V5.b<NativeTextBoxInfo> {

        class a implements Runnable {

            final NativeTextBoxInfo f22103d;

            a(NativeTextBoxInfo nativeTextBoxInfo) {
                this.f22103d = nativeTextBoxInfo;
            }

            @Override
            public void run() {
                ViewTreeObserverOnGlobalLayoutListenerC2590G viewTreeObserverOnGlobalLayoutListenerC2590G = ViewTreeObserverOnGlobalLayoutListenerC2590G.this;
                StringBuilder sb = new StringBuilder();
                sb.append("positioning native textbox: (");
                sb.append(this.f22103d.x);
                String str = vxbbqXNtzfMxs.ZOFdVtSpAiP;
                sb.append(str);
                sb.append(this.f22103d.y);
                sb.append(") align: (");
                sb.append(this.f22103d.xAlignment);
                sb.append(str);
                sb.append(this.f22103d.yAlignment);
                sb.append(")");
                viewTreeObserverOnGlobalLayoutListenerC2590G.x(sb.toString());
                ViewTreeObserverOnGlobalLayoutListenerC2590G viewTreeObserverOnGlobalLayoutListenerC2590G2 = ViewTreeObserverOnGlobalLayoutListenerC2590G.this;
                viewTreeObserverOnGlobalLayoutListenerC2590G2.B(viewTreeObserverOnGlobalLayoutListenerC2590G2.f22095z, ViewTreeObserverOnGlobalLayoutListenerC2590G.this.g());
                ViewTreeObserverOnGlobalLayoutListenerC2590G.this.L(this.f22103d);
                ViewTreeObserverOnGlobalLayoutListenerC2590G.this.K(this.f22103d);
                ((AbstractC2672a) ViewTreeObserverOnGlobalLayoutListenerC2590G.this).f22312e.requestFocus();
            }
        }

        public d(String str) {
            super(str);
        }

        @Override
        public void a(NativeTextBoxInfo nativeTextBoxInfo) {
            ViewTreeObserverOnGlobalLayoutListenerC2590G.this.f22083E.post(new a(nativeTextBoxInfo));
        }
    }

    public ViewTreeObserverOnGlobalLayoutListenerC2590G(RbxKeyboard rbxKeyboard, SurfaceHolderCallbackC2587D surfaceHolderCallbackC2587D, C2617t.f fVar) {
        super(rbxKeyboard);
        this.f22091i = false;
        this.f22092v = 12;
        this.f22093w = 10;
        this.f22094y = BacktraceBreadcrumbs.DEFAULT_MAX_LOG_SIZE_BYTES;
        this.f22082D = new d("rbx.glview.text");
        this.f22085G = 0;
        this.f22086H = 0;
        this.f22087I = false;
        this.f22088J = 0;
        this.f22089K = 0;
        this.f22090L = new b("rbx.glview.text");
        this.f22079A = surfaceHolderCallbackC2587D;
        this.f22080B = fVar;
        this.f22083E = new Handler(Looper.getMainLooper());
    }

    private void A(View view, int i7, int i8) {
        boolean z7;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        boolean z8 = true;
        if (layoutParams.width != i7) {
            layoutParams.width = i7;
            z7 = true;
        } else {
            z7 = false;
        }
        if (layoutParams.height != i8) {
            layoutParams.height = i8;
        } else {
            z8 = z7;
        }
        if (z8) {
            view.setLayoutParams(layoutParams);
        }
    }

    public void B(l7.b bVar, float f7) {
        float f8;
        if (bVar.e <= 10) {
            if (j6.d.a().H2()) {
                v(0);
                return;
            }
            return;
        }
        NativeTextBoxInfo nativeTextBoxInfoNativeGetTextBoxInfo = NativeGLInterface.nativeGetTextBoxInfo();
        float f9 = nativeTextBoxInfoNativeGetTextBoxInfo != null ? nativeTextBoxInfoNativeGetTextBoxInfo.x : 0.0f;
        float f10 = nativeTextBoxInfoNativeGetTextBoxInfo != null ? nativeTextBoxInfoNativeGetTextBoxInfo.y : 0.0f;
        float f11 = nativeTextBoxInfoNativeGetTextBoxInfo != null ? nativeTextBoxInfoNativeGetTextBoxInfo.width : 0.0f;
        float f12 = nativeTextBoxInfoNativeGetTextBoxInfo != null ? nativeTextBoxInfoNativeGetTextBoxInfo.height : 0.0f;
        float f13 = nativeTextBoxInfoNativeGetTextBoxInfo != null ? nativeTextBoxInfoNativeGetTextBoxInfo.fontSize : 0.0f;
        x("textbox pos/size/fontSize: (" + f9 + ", " + f10 + ", " + f11 + ", " + f12 + ", " + f13 + ")");
        float fY = y(f12 + f10, f7);
        if (fY >= bVar.b) {
            f8 = bVar.f;
            fY = y(f10 + f13, f7);
        } else {
            f8 = bVar.f;
        }
        float f14 = f8 - fY;
        float fY2 = y(12.0f, f7);
        int i7 = (int) (f14 - fY2);
        x("margin:" + fY2 + " delta:" + f14 + KpBmp.QOedfof + i7);
        if (i7 < 0) {
            if (j6.d.a().R2()) {
                H(i7);
            } else {
                v(i7);
            }
        }
    }

    private float D(int i7, float f7) {
        return (i7 / f7) + 0.5f;
    }

    private void G(NativeTextBoxInfo nativeTextBoxInfo) {
        if (nativeTextBoxInfo != null) {
            this.f22082D.e(nativeTextBoxInfo, j6.d.a().i3());
        }
    }

    private void H(int i7) {
        this.f22090L.e(new c(i7), j6.d.a().I2());
        this.f22089K = i7;
    }

    private void J(float f7, float f8, float f9, float f10) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f22312e.getLayoutParams();
        float fG = g();
        float fY = y(f7, fG);
        float fY2 = y(f8, fG);
        float fY3 = y(f9, fG);
        float fY4 = y(f10, fG);
        layoutParams.topMargin = (int) fY2;
        layoutParams.width = (int) fY3;
        layoutParams.height = (int) fY4;
        layoutParams.leftMargin = (int) fY;
        this.f22312e.setLayoutParams(layoutParams);
    }

    public void K(NativeTextBoxInfo nativeTextBoxInfo) {
        J(nativeTextBoxInfo.x, nativeTextBoxInfo.y, nativeTextBoxInfo.width, nativeTextBoxInfo.height);
    }

    public void L(NativeTextBoxInfo nativeTextBoxInfo) {
        if (nativeTextBoxInfo != null) {
            this.f22312e.j(nativeTextBoxInfo);
            this.f22312e.k(nativeTextBoxInfo.font, nativeTextBoxInfo.fontSize, g());
        }
    }

    public void x(String str) {
    }

    private float y(float f7, float f8) {
        return f7 * f8;
    }

    protected void C(l7.b bVar, float f7) {
        boolean z7 = bVar.e > 10;
        int iD = (int) D(bVar.f, f7);
        int iD2 = (int) D(bVar.a.right, f7);
        int iD3 = (int) D(bVar.e, f7);
        h7.l.i(GObvYfBKohxpYX.VqBChomYXhVf, "onUpdateKeyboardSize() v:" + z7 + QcdySgfdST.jONtxc + "0 y:" + iD + " w:" + iD2 + " h:" + iD3);
        if (z7) {
            NativeGLInterface.updateKeyboardSize(true, 0, iD, iD2, iD3);
        } else {
            NativeGLInterface.updateKeyboardSize(false, 0, iD, iD2, 0);
        }
    }

    public void E() {
        Z.I0(this.f22079A.k(), null);
    }

    public void F() {
        A(this.f22079A.k(), -1, -1);
    }

    public void I(long j7) {
        this.f22084F = j7;
    }

    @Override
    public void a() {
        if (j6.d.a().H2()) {
            h7.l.a("rbx.glview.text", "hideKeyboard()");
        }
        NativeGLInterface.nativeReleaseFocus(h());
        if (j6.d.a().R2()) {
            H(0);
        } else {
            v(0);
        }
        this.f22312e.c();
        this.f22081C = null;
    }

    @Override
    public void b(long j7, boolean z7, String str, NativeTextBoxInfo nativeTextBoxInfo) {
        this.f22081C = nativeTextBoxInfo;
        z();
        h7.l.a("rbx.glview.text", "showKeyboard() " + str);
        this.f22312e.setFilters(new InputFilter[]{new InputFilter.LengthFilter(BacktraceBreadcrumbs.DEFAULT_MAX_LOG_SIZE_BYTES)});
        this.f22312e.setCurrentTextBox(j7);
        this.f22312e.setText(str);
        if (z7) {
            NativeTextBoxInfo nativeTextBoxInfo2 = this.f22081C;
            if (nativeTextBoxInfo2 != null) {
                J(0.0f, -150.0f, nativeTextBoxInfo2.width, nativeTextBoxInfo2.height);
            } else {
                J(0.0f, -150.0f, -1.0f, 10.0f);
            }
            G(this.f22081C);
        }
        this.f22312e.setVisibility(0);
        this.f22312e.requestFocus();
        q0.o(this.f22312e, 2);
        RbxKeyboard rbxKeyboard = this.f22312e;
        rbxKeyboard.setSelection(rbxKeyboard.getText().length());
        j();
    }

    @Override
    public void c() {
        NativeTextBoxInfo nativeTextBoxInfoNativeGetTextBoxInfo = NativeGLInterface.nativeGetTextBoxInfo();
        if (nativeTextBoxInfoNativeGetTextBoxInfo != null) {
            h7.l.a("rbx.glview.text", "onLuaTextBoxPropertyChanged() x:" + nativeTextBoxInfoNativeGetTextBoxInfo.x + " y:" + nativeTextBoxInfoNativeGetTextBoxInfo.y + " width:" + nativeTextBoxInfoNativeGetTextBoxInfo.width + " height:" + nativeTextBoxInfoNativeGetTextBoxInfo.height + " fontSize:" + nativeTextBoxInfoNativeGetTextBoxInfo.fontSize);
            G(nativeTextBoxInfoNativeGetTextBoxInfo);
        }
        this.f22081C = nativeTextBoxInfoNativeGetTextBoxInfo;
    }

    @Override
    public void d(String str) {
        i(str);
    }

    @Override
    public void e() {
        RbxKeyboard rbxKeyboard = this.f22312e;
        if (rbxKeyboard != null) {
            rbxKeyboard.g();
        }
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        h7.l.g("rbx.glview.text", "Configuration change detected");
        F();
        if (!j6.d.a().H2()) {
            a();
            return;
        }
        this.f22085G = this.f22079A.r().getWidth();
        this.f22086H = this.f22079A.r().getHeight();
        v(0);
        if (j6.d.a().R2()) {
            this.f22088J = 0;
        }
    }

    @Override
    public void onGlobalLayout() {
        l7.b bVarA = this.f22080B.a();
        if (bVarA == null) {
            return;
        }
        l7.b bVar = this.f22095z;
        if (bVar == null || !bVar.equals(bVarA)) {
            this.f22095z = bVarA;
            if (j6.d.a().H2()) {
                h7.l.a("rbx.glview.text", "onGlobalLayout()");
                InputMethodManager inputMethodManager = (InputMethodManager) f().getSystemService("input_method");
                if (inputMethodManager != null && inputMethodManager.isAcceptingText()) {
                    FrameLayout frameLayoutK = this.f22079A.k();
                    int width = frameLayoutK.getWidth();
                    int height = frameLayoutK.getHeight();
                    if (width != this.f22085G || height != this.f22086H) {
                        this.f22085G = width;
                        this.f22086H = height;
                        z();
                    }
                }
            }
            h7.l.a("rbx.glview.text", String.format("Keyboard height: %d", Integer.valueOf(bVarA.e)));
            if (j6.d.a().J()) {
                boolean z7 = this.f22087I;
                boolean z8 = bVarA.e > 10;
                this.f22087I = z8;
                if (z7 && !z8) {
                    h7.l.a("rbx.glview.text", KpBmp.UbX);
                    if (j6.d.a().R2()) {
                        H(0);
                    } else {
                        v(0);
                    }
                }
            }
            float fG = g();
            B(bVarA, fG);
            C(bVarA, fG);
        }
    }

    @Override
    public void onLowMemory() {
    }

    public void v(int i7) {
        FrameLayout frameLayoutK = this.f22079A.k();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayoutK.getLayoutParams();
        if (layoutParams.topMargin != i7) {
            layoutParams.topMargin = i7;
            frameLayoutK.setLayoutParams(layoutParams);
        }
    }

    public void w() {
        Z.I0(this.f22079A.k(), new a(1));
    }

    public void z() {
        FrameLayout frameLayoutK = this.f22079A.k();
        int width = frameLayoutK.getWidth();
        int height = frameLayoutK.getHeight();
        x("Lock screen: (" + width + ", " + height + ")");
        A(frameLayoutK, width, height);
    }
}
