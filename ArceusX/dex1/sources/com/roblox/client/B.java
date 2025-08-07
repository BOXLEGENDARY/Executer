package com.roblox.client;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import org.greenrobot.eventbus.ThreadMode;

public class B extends X {

    private d f19426F;

    class a implements DialogInterface.OnCancelListener {
        a() {
        }

        @Override
        public void onCancel(DialogInterface dialogInterface) {
            P.c("logout", "no");
            dialogInterface.dismiss();
        }
    }

    class b implements DialogInterface.OnClickListener {
        b() {
        }

        @Override
        public void onClick(DialogInterface dialogInterface, int i7) {
            P.c("logout", "no");
            dialogInterface.dismiss();
        }
    }

    class c implements DialogInterface.OnClickListener {
        c() {
        }

        @Override
        public void onClick(DialogInterface dialogInterface, int i7) {
            P.c("logout", "yes");
            dialogInterface.dismiss();
            B.this.f19426F.a();
        }
    }

    public interface d {
        void a();
    }

    @Override
    public Dialog onCreateDialog(Bundle bundle) {
        return new AlertDialog.Builder(getActivity()).setMessage(M.f19666n).setPositiveButton(M.f19664m, new c()).setNegativeButton(M.f19690z, new b()).setOnCancelListener(new a()).create();
    }

    @Wa.j(threadMode = ThreadMode.MAIN)
    public void onNavigatToFeatureEvent(g6.i iVar) {
        if (getShowsDialog()) {
            getDialog().dismiss();
        }
    }

    @Override
    public void onStart() {
        super.onStart();
        Wa.c.d().n(this);
    }

    @Override
    public void onStop() {
        Wa.c.d().p(this);
        super.onStop();
    }

    public void y(d dVar) {
        this.f19426F = dVar;
    }
}
