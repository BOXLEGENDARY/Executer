package io.noties.markwon.core.spans;

import H9.c;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import androidx.annotation.NonNull;

public class LinkSpan extends URLSpan {
    private final c d;
    private final String e;
    private final G9.c i;

    public LinkSpan(@NonNull c cVar, @NonNull String str, @NonNull G9.c cVar2) {
        super(str);
        this.d = cVar;
        this.e = str;
        this.i = cVar2;
    }

    @Override
    public void onClick(View view) {
        this.i.a(view, this.e);
    }

    @Override
    public void updateDrawState(@NonNull TextPaint textPaint) {
        this.d.f(textPaint);
    }
}
