package com.roblox.client;

import android.content.Context;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.github.luben.zstd.BuildConfig;
import com.roblox.engine.jni.NativeGLInterface;

public class RbxKeyboard extends AppCompatEditText {

    private final String f19822d;

    private long f19823e;

    private boolean f19824i;

    private long f19825v;

    private boolean f19826w;

    class a implements TextWatcher {
        a() {
        }

        @Override
        public void afterTextChanged(Editable editable) {
        }

        @Override
        public void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
            h7.l.a("rbx.glview.text", "onTextChanged() text:" + ((Object) charSequence));
            RbxKeyboard.this.i();
            NativeGLInterface.nativePassText(RbxKeyboard.this.getCurrentTextBox(), charSequence.toString(), false, i7 + i9);
        }
    }

    class b implements TextView.OnEditorActionListener {
        b() {
        }

        @Override
        public boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
            if (a0.k0() && SystemClock.elapsedRealtime() - RbxKeyboard.this.f19825v < j6.d.a().V0()) {
                h7.l.k("rbx.glview.text", "onEditorAction with actionId: " + i7 + " ignored since it's too close to focus event.");
                q0.o(textView, 2);
                return true;
            }
            h7.l.a("rbx.glview.text", "onEditorAction() text:" + ((Object) textView.getText()));
            RbxKeyboard.this.i();
            NativeGLInterface.nativeReturnPressedFromOnScreenKeyboard(RbxKeyboard.this.getCurrentTextBox());
            if (RbxKeyboard.this.e()) {
                return true;
            }
            NativeGLInterface.nativePassText(RbxKeyboard.this.getCurrentTextBox(), textView.getText().toString(), true, textView.getSelectionStart());
            RbxKeyboard.this.c();
            return true;
        }
    }

    public RbxKeyboard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19822d = "rbx.glview.text";
        this.f19825v = 0L;
        this.f19826w = false;
    }

    public void f(View view, boolean z7) {
        if (z7) {
            this.f19825v = SystemClock.elapsedRealtime();
            this.f19826w = true;
        }
    }

    public void c() {
        setCurrentTextBox(0L);
        q0.k(getContext(), this);
        setVisibility(8);
    }

    public void d() {
        if (a0.k0()) {
            setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public final void onFocusChange(View view, boolean z7) {
                    this.f19819a.f(view, z7);
                }
            });
        }
        addTextChangedListener(new a());
        setOnEditorActionListener(new b());
    }

    public boolean e() {
        return this.f19824i;
    }

    public void g() {
        h7.l.g("rbx.glview.text", "onVrSessionForeground");
        if (this.f19826w && a0.k0() && SystemClock.elapsedRealtime() - this.f19825v < j6.d.a().V0()) {
            h7.l.a("rbx.glview.text", "Maquettes keyboard quick hide issue encountered.");
            q0.o(this, 1);
        } else if (this.f19826w && a0.k0()) {
            h7.l.a("rbx.glview.text", "Maquettes keyboard release focus only hide triggered.");
            NativeGLInterface.nativeReleaseFocus(this.f19823e);
            this.f19823e = 0L;
            this.f19826w = false;
        }
    }

    public long getCurrentTextBox() {
        return this.f19823e;
    }

    public void h(long j7) {
        NativeGLInterface.nativeReleaseFocus(j7);
    }

    public void i() {
        String string = getText().toString();
        int selectionStart = getSelectionStart();
        h7.l.a("rbx.glview.text", "syncTextboxTextAndCursorPosition() text:" + string + " pos:" + selectionStart);
        NativeGLInterface.syncTextboxTextAndCursorPosition2(string, selectionStart);
    }

    public void j(com.roblox.engine.jni.model.NativeTextBoxInfo r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.RbxKeyboard.j(com.roblox.engine.jni.model.NativeTextBoxInfo):void");
    }

    public void k(int i7, float f7, float f8) {
        float fB;
        float f9 = 0.0f;
        if (V5.e.e(this, getContext(), i7)) {
            fB = V5.e.b(i7, getContext());
        } else {
            if (i7 == 4) {
                V5.e.d(this, getContext(), "SourceSansPro-Bold.ttf");
                f9 = 0.04f;
            } else if (i7 != 5) {
                V5.e.d(this, getContext(), "SourceSansPro-Regular.ttf");
            } else {
                V5.e.d(this, getContext(), "SourceSansPro-Light.ttf");
            }
            fB = 0.795f;
        }
        setTextSize(0, f7 * f8 * fB);
        h7.l.a("rbx.glview.text", "using letter spacing = " + f9);
        setLetterSpacing(f9);
    }

    @Override
    public boolean onKeyPreIme(int i7, KeyEvent keyEvent) {
        i();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            h(this.f19823e);
            this.f19823e = 0L;
            setVisibility(8);
            setText(BuildConfig.FLAVOR);
            q0.k(getContext(), this);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    protected void onSelectionChanged(int i7, int i8) {
        if (isInEditMode()) {
            return;
        }
        i();
    }

    public void setCurrentTextBox(long j7) {
        this.f19823e = j7;
    }

    public void setManualFocusRelease(boolean z7) {
        this.f19824i = z7;
    }
}
