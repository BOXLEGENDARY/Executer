package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.view.Z;
import c4.C1750f;
import c4.C1752h;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.o;
import com.google.android.material.internal.s;
import com.google.android.material.textfield.TextInputLayout;

class ChipTextInputComboView extends FrameLayout implements Checkable {

    private final Chip f18676d;

    private final TextInputLayout f18677e;

    private final EditText f18678i;

    private TextWatcher f18679v;

    private TextView f18680w;

    private class b extends o {
        private b() {
        }

        @Override
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.f18676d.setText(ChipTextInputComboView.this.c("00"));
                return;
            }
            String strC = ChipTextInputComboView.this.c(editable);
            Chip chip = ChipTextInputComboView.this.f18676d;
            if (TextUtils.isEmpty(strC)) {
                strC = ChipTextInputComboView.this.c("00");
            }
            chip.setText(strC);
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public String c(CharSequence charSequence) {
        return TimeModel.a(getResources(), charSequence);
    }

    private void d() {
        this.f18678i.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    @Override
    public boolean isChecked() {
        return this.f18676d.isChecked();
    }

    @Override
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        d();
    }

    @Override
    public void setChecked(boolean z7) {
        this.f18676d.setChecked(z7);
        this.f18678i.setVisibility(z7 ? 0 : 4);
        this.f18676d.setVisibility(z7 ? 8 : 0);
        if (isChecked()) {
            s.n(this.f18678i, false);
        }
    }

    @Override
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f18676d.setOnClickListener(onClickListener);
    }

    @Override
    public void setTag(int i7, Object obj) {
        this.f18676d.setTag(i7, obj);
    }

    @Override
    public void toggle() {
        this.f18676d.toggle();
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        Chip chip = (Chip) layoutInflaterFrom.inflate(C1752h.f12908i, (ViewGroup) this, false);
        this.f18676d = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) layoutInflaterFrom.inflate(C1752h.f12909j, (ViewGroup) this, false);
        this.f18677e = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f18678i = editText;
        editText.setVisibility(4);
        b bVar = new b();
        this.f18679v = bVar;
        editText.addTextChangedListener(bVar);
        d();
        addView(chip);
        addView(textInputLayout);
        this.f18680w = (TextView) findViewById(C1750f.f12884n);
        editText.setId(Z.k());
        Z.A0(this.f18680w, editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }
}
