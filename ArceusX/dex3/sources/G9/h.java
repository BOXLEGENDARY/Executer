package G9;

import G9.e;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.List;

class h extends e {
    private final TextView.BufferType a;
    private final Ta.d b;
    private final m c;
    private final g d;
    private final List<i> e;
    private final boolean f;

    h(@NonNull TextView.BufferType bufferType, e.b bVar, @NonNull Ta.d dVar, @NonNull m mVar, @NonNull g gVar, @NonNull List<i> list, boolean z) {
        this.a = bufferType;
        this.b = dVar;
        this.c = mVar;
        this.d = gVar;
        this.e = list;
        this.f = z;
    }

    @Override
    public void c(@NonNull TextView textView, @NonNull String str) {
        d(textView, e(str));
    }

    @Override
    public void d(@NonNull TextView textView, @NonNull Spanned spanned) {
        Iterator<i> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().i(textView, spanned);
        }
        textView.setText(spanned, this.a);
        Iterator<i> it2 = this.e.iterator();
        while (it2.hasNext()) {
            it2.next().h(textView);
        }
    }

    @Override
    @NonNull
    public Spanned e(@NonNull String str) {
        Spanned spannedG = g(f(str));
        return (TextUtils.isEmpty(spannedG) && this.f && !TextUtils.isEmpty(str)) ? new SpannableStringBuilder(str) : spannedG;
    }

    @NonNull
    public Sa.r f(@NonNull String str) {
        Iterator<i> it = this.e.iterator();
        while (it.hasNext()) {
            str = it.next().b(str);
        }
        return this.b.b(str);
    }

    @NonNull
    public Spanned g(@NonNull Sa.r rVar) {
        Iterator<i> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().e(rVar);
        }
        l lVarA = this.c.a();
        rVar.a(lVarA);
        Iterator<i> it2 = this.e.iterator();
        while (it2.hasNext()) {
            it2.next().c(rVar, lVarA);
        }
        return lVarA.n().l();
    }
}
