package l6;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import w6.C2980b;
import w6.C2982d;

public class C2553i extends C2546b {
    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return u(layoutInflater, super.onCreateView(layoutInflater, viewGroup, bundle));
    }

    @Override
    protected C2980b t() {
        return new C2982d();
    }
}
