package A0;

import android.content.ClipData;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.core.view.C1611d;
import androidx.core.view.Z;
import x0.C2985b;
import x0.g;

public final class c {

    class a extends InputConnectionWrapper {

        final b f3d;

        a(InputConnection inputConnection, boolean z7, b bVar) {
            super(inputConnection, z7);
            this.f3d = bVar;
        }

        @Override
        public boolean commitContent(InputContentInfo inputContentInfo, int i7, Bundle bundle) {
            if (this.f3d.a(d.f(inputContentInfo), i7, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i7, bundle);
        }
    }

    public interface b {
        boolean a(d dVar, int i7, Bundle bundle);
    }

    private static b b(final View view) {
        g.g(view);
        return new b() {
            @Override
            public final boolean a(d dVar, int i7, Bundle bundle) {
                return c.e(view, dVar, i7, bundle);
            }
        };
    }

    public static InputConnection c(View view, InputConnection inputConnection, EditorInfo editorInfo) {
        return d(inputConnection, editorInfo, b(view));
    }

    @Deprecated
    public static InputConnection d(InputConnection inputConnection, EditorInfo editorInfo, b bVar) {
        C2985b.d(inputConnection, "inputConnection must be non-null");
        C2985b.d(editorInfo, "editorInfo must be non-null");
        C2985b.d(bVar, "onCommitContentListener must be non-null");
        return new a(inputConnection, false, bVar);
    }

    public static boolean e(View view, d dVar, int i7, Bundle bundle) {
        if ((i7 & 1) != 0) {
            try {
                dVar.d();
                Parcelable parcelable = (Parcelable) dVar.e();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e7) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e7);
                return false;
            }
        }
        return Z.d0(view, new C1611d.a(new ClipData(dVar.b(), new ClipData.Item(dVar.a())), 2).d(dVar.c()).b(bundle).a()) == null;
    }
}
