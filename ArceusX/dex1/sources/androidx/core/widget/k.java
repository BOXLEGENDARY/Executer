package androidx.core.widget;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.C1611d;
import androidx.core.view.J;

public final class k implements J {
    private static CharSequence b(Context context, ClipData.Item item, int i7) {
        if ((i7 & 1) == 0) {
            return item.coerceToStyledText(context);
        }
        CharSequence charSequenceCoerceToText = item.coerceToText(context);
        return charSequenceCoerceToText instanceof Spanned ? charSequenceCoerceToText.toString() : charSequenceCoerceToText;
    }

    private static void c(Editable editable, CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int iMax = Math.max(0, Math.min(selectionStart, selectionEnd));
        int iMax2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, iMax2);
        editable.replace(iMax, iMax2, charSequence);
    }

    @Override
    public C1611d a(View view, C1611d c1611d) {
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + c1611d);
        }
        if (c1611d.d() == 2) {
            return c1611d;
        }
        ClipData clipDataB = c1611d.b();
        int iC = c1611d.c();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z7 = false;
        for (int i7 = 0; i7 < clipDataB.getItemCount(); i7++) {
            CharSequence charSequenceB = b(context, clipDataB.getItemAt(i7), iC);
            if (charSequenceB != null) {
                if (z7) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), charSequenceB);
                } else {
                    c(editable, charSequenceB);
                    z7 = true;
                }
            }
        }
        return null;
    }
}
