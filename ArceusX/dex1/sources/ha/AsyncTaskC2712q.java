package ha;

import android.os.AsyncTask;
import com.github.luben.zstd.BuildConfig;
import ha.C2697c;

public class AsyncTaskC2712q extends AsyncTask<Void, Void, C2704j> {

    private C2704j f22551a;

    private String f22552b;

    private String f22553c;

    private C2697c.a[] f22554d;

    private String f22555e;

    protected InterfaceC2707m f22556f;

    protected int f22557g;

    protected int f22558h;

    public AsyncTaskC2712q(String str, String str2, C2697c.a[] aVarArr, InterfaceC2707m interfaceC2707m) {
        this(str, str2, aVarArr, interfaceC2707m, null);
    }

    @Override
    public C2704j doInBackground(Void... voidArr) {
        C2704j c2704jL = C2697c.l(this.f22552b, this.f22553c, this.f22554d, this.f22555e, this.f22557g, this.f22558h);
        this.f22551a = c2704jL;
        return c2704jL;
    }

    @Override
    public void onPostExecute(C2704j c2704j) {
        super.onPostExecute(c2704j);
        InterfaceC2707m interfaceC2707m = this.f22556f;
        if (interfaceC2707m != null) {
            interfaceC2707m.a(this.f22551a);
        }
    }

    public AsyncTaskC2712q(String str, String str2, C2697c.a[] aVarArr, InterfaceC2707m interfaceC2707m, String str3) {
        this(str, str2, aVarArr, interfaceC2707m, str3, -1, -1);
    }

    public AsyncTaskC2712q(String str, String str2, C2697c.a[] aVarArr, InterfaceC2707m interfaceC2707m, String str3, int i7, int i8) {
        this.f22557g = -1;
        this.f22558h = -1;
        this.f22556f = interfaceC2707m;
        this.f22552b = str;
        this.f22553c = str2;
        this.f22554d = aVarArr;
        this.f22555e = str3;
        if (str2 == null) {
            this.f22553c = BuildConfig.FLAVOR;
        }
        this.f22557g = i7;
        this.f22558h = i8;
    }
}
