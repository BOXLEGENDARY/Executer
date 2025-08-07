package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1658c;
import androidx.fragment.app.FragmentManager;
import n3.C2651i;

public class k extends DialogInterfaceOnCancelListenerC1658c {

    private Dialog f14355d;

    private DialogInterface.OnCancelListener f14356e;

    private Dialog f14357i;

    public static k q(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        k kVar = new k();
        Dialog dialog2 = (Dialog) C2651i.m(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        kVar.f14355d = dialog2;
        if (onCancelListener != null) {
            kVar.f14356e = onCancelListener;
        }
        return kVar;
    }

    @Override
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f14356e;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f14355d;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f14357i == null) {
            this.f14357i = new AlertDialog.Builder((Context) C2651i.l(getContext())).create();
        }
        return this.f14357i;
    }

    @Override
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
