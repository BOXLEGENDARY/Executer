package com.google.android.material.timepicker;

import android.text.InputFilter;
import android.text.Spanned;
import com.github.luben.zstd.BuildConfig;

class b implements InputFilter {

    private int f18738a;

    public b(int i7) {
        this.f18738a = i7;
    }

    @Override
    public CharSequence filter(CharSequence charSequence, int i7, int i8, Spanned spanned, int i9, int i10) {
        try {
            StringBuilder sb = new StringBuilder(spanned);
            sb.replace(i9, i10, charSequence.subSequence(i7, i8).toString());
            if (Integer.parseInt(sb.toString()) <= this.f18738a) {
                return null;
            }
            return BuildConfig.FLAVOR;
        } catch (NumberFormatException unused) {
            return BuildConfig.FLAVOR;
        }
    }
}
