package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

abstract class m<S> extends Fragment {

    protected final LinkedHashSet<l<S>> f17867d = new LinkedHashSet<>();

    m() {
    }

    boolean q(l<S> lVar) {
        return this.f17867d.add(lVar);
    }

    void s() {
        this.f17867d.clear();
    }
}
