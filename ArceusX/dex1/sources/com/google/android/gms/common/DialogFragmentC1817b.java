package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import n3.C2651i;

public class DialogFragmentC1817b extends DialogFragment {

    private Dialog f14206d;

    private DialogInterface.OnCancelListener f14207e;

    private Dialog f14208i;

    public static DialogFragmentC1817b a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        DialogFragmentC1817b dialogFragmentC1817b = new DialogFragmentC1817b();
        Dialog dialog2 = (Dialog) C2651i.m(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        dialogFragmentC1817b.f14206d = dialog2;
        if (onCancelListener != null) {
            dialogFragmentC1817b.f14207e = onCancelListener;
        }
        return dialogFragmentC1817b;
    }

    @Override
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f14207e;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f14206d;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f14208i == null) {
            this.f14208i = new AlertDialog.Builder((Context) C2651i.l(getActivity())).create();
        }
        return this.f14208i;
    }

    @Override
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
