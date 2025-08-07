package n6;

import android.content.Context;
import com.github.luben.zstd.BuildConfig;
import com.roblox.client.RbxKeyboard;
import m6.P;

public abstract class AbstractC2672a implements P {

    protected final String f22311d = "rbx.glview.text";

    protected RbxKeyboard f22312e;

    public AbstractC2672a(RbxKeyboard rbxKeyboard) {
        this.f22312e = rbxKeyboard;
        rbxKeyboard.setVisibility(8);
        this.f22312e.setImeOptions(268435460);
        this.f22312e.setSingleLine(true);
        this.f22312e.setText(BuildConfig.FLAVOR);
        this.f22312e.d();
    }

    protected Context f() {
        return this.f22312e.getContext();
    }

    protected float g() {
        return B7.a.c(f());
    }

    protected long h() {
        return this.f22312e.getCurrentTextBox();
    }

    public void i(String str) {
        if (this.f22312e.getText().toString().equals(str)) {
            return;
        }
        this.f22312e.setText(str);
        this.f22312e.setSelection(str.length());
    }

    protected void j() {
        this.f22312e.i();
    }
}
