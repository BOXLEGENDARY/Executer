package C4;

import E4.G;
import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;
import java.io.File;
import java.util.Iterator;
import java.util.Set;

public final class b {

    private final f f826a;

    public b(f fVar) {
        this.f826a = fVar;
    }

    public static final int c(AssetManager assetManager, File file) {
        int iIntValue = ((Integer) G.d(assetManager, "addAssetPath", Integer.class, String.class, file.getPath())).intValue();
        Log.d("SplitCompat", "addAssetPath completed with " + iIntValue);
        return iIntValue;
    }

    public final synchronized void a(Context context, Set set) {
        AssetManager assets = context.getAssets();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            c(assets, (File) it.next());
        }
    }

    final synchronized boolean b(android.content.Context r5, java.util.Set r6) {
        throw new UnsupportedOperationException("Method not decompiled: C4.b.b(android.content.Context, java.util.Set):boolean");
    }
}
