package com.roblox.client;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import g6.C2472h;
import org.greenrobot.eventbus.ThreadMode;

public class C extends e0 {
    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(K.f19573s, viewGroup, false);
        FrameLayout frameLayout = (FrameLayout) viewGroup2.findViewById(J.f19548w);
        frameLayout.addView(super.onCreateView(layoutInflater, frameLayout, bundle));
        return viewGroup2;
    }

    @Wa.j(threadMode = ThreadMode.MAIN)
    public void onNavigateToConversationEvent(C2472h c2472h) {
        if (getShowsDialog()) {
            getDialog().dismiss();
        }
    }

    @Wa.j(threadMode = ThreadMode.MAIN)
    public void onNavigateToFeatureEvent(g6.i iVar) {
        if (getShowsDialog()) {
            getDialog().dismiss();
        }
    }

    @Override
    public void onStart() {
        super.onStart();
        Wa.c.d().n(this);
        Dialog dialog = getDialog();
        if (dialog != null) {
            Window window = dialog.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.dimAmount = 0.0f;
            attributes.flags |= 2;
            window.setAttributes(attributes);
        }
    }

    @Override
    public void onStop() {
        Wa.c.d().p(this);
        super.onStop();
    }
}
