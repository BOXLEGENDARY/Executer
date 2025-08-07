package m6;

import android.widget.FrameLayout;
import com.roblox.client.RbxKeyboard;
import com.roblox.client.q0;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.model.NativeTextBoxInfo;
import java.util.Objects;
import n6.AbstractC2672a;

public class C2595L extends AbstractC2672a {

    protected NativeTextBoxInfo f22152i;

    public C2595L(RbxKeyboard rbxKeyboard) {
        super(rbxKeyboard);
    }

    private void k(NativeTextBoxInfo nativeTextBoxInfo, RbxKeyboard rbxKeyboard) {
        l(nativeTextBoxInfo, rbxKeyboard);
        if (nativeTextBoxInfo != null) {
            rbxKeyboard.j(nativeTextBoxInfo);
            rbxKeyboard.k(nativeTextBoxInfo.font, nativeTextBoxInfo.fontSize, g());
        }
        rbxKeyboard.setVisibility(0);
    }

    private void l(NativeTextBoxInfo nativeTextBoxInfo, RbxKeyboard rbxKeyboard) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) rbxKeyboard.getLayoutParams();
        float fG = g();
        float f7 = (nativeTextBoxInfo != null ? nativeTextBoxInfo.x : 0.0f) * fG;
        float f8 = (nativeTextBoxInfo != null ? nativeTextBoxInfo.y : 0.0f) * fG;
        float f9 = (nativeTextBoxInfo != null ? nativeTextBoxInfo.width : 0.0f) * fG;
        float f10 = nativeTextBoxInfo != null ? nativeTextBoxInfo.height : 0.0f;
        layoutParams.topMargin = (int) f8;
        layoutParams.width = (int) f9;
        layoutParams.height = (int) (fG * f10);
        layoutParams.leftMargin = (int) f7;
        rbxKeyboard.setLayoutParams(layoutParams);
    }

    @Override
    public void a() {
        h7.l.a("rbx.glview.text", "hideKeyboard()");
        this.f22312e.c();
        this.f22152i = null;
    }

    @Override
    public void b(long j7, boolean z7, String str, NativeTextBoxInfo nativeTextBoxInfo) {
        h7.l.a("rbx.glview.text", "showKeyboard() " + str);
        this.f22312e.setCurrentTextBox(j7);
        this.f22312e.setText(str);
        if (z7) {
            this.f22152i = nativeTextBoxInfo;
            k(nativeTextBoxInfo, this.f22312e);
        }
        this.f22312e.setVisibility(0);
        this.f22312e.requestFocus();
        q0.o(this.f22312e, 2);
        this.f22312e.setSelection(str.length());
        j();
    }

    @Override
    public void c() {
        NativeTextBoxInfo nativeTextBoxInfoNativeGetTextBoxInfo = NativeGLInterface.nativeGetTextBoxInfo();
        if (nativeTextBoxInfoNativeGetTextBoxInfo != null) {
            h7.l.a("rbx.glview.text", "onLuaTextBoxPropertyChanged() x:" + nativeTextBoxInfoNativeGetTextBoxInfo.x + " y:" + nativeTextBoxInfoNativeGetTextBoxInfo.y + " width:" + nativeTextBoxInfoNativeGetTextBoxInfo.width + " height:" + nativeTextBoxInfoNativeGetTextBoxInfo.height + " fontSize:" + nativeTextBoxInfoNativeGetTextBoxInfo.fontSize);
        }
        if (Objects.equals(nativeTextBoxInfoNativeGetTextBoxInfo, this.f22152i)) {
            return;
        }
        this.f22152i = nativeTextBoxInfoNativeGetTextBoxInfo;
        k(nativeTextBoxInfoNativeGetTextBoxInfo, this.f22312e);
        if (j6.d.a().j3()) {
            this.f22312e.requestFocus();
        }
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
}
