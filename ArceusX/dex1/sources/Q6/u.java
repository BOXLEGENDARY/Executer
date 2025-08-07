package Q6;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.widget.ImageView;
import d8.E;
import h7.j;
import java.io.IOException;
import java.util.List;

public abstract class u extends AsyncTask<Void, Void, String> {

    private E f4893a = new j.a();

    private Context f4894b;

    private long f4895c;

    class a implements d8.e {

        final ImageView f4896a;

        a(ImageView imageView) {
            this.f4896a = imageView;
        }

        public void a() {
            u.this.c(null);
        }

        public void onSuccess() {
            Bitmap bitmap = ((BitmapDrawable) this.f4896a.getDrawable()).getBitmap();
            if (bitmap != null) {
                u.this.c(bitmap);
            } else {
                u.this.c(null);
            }
        }
    }

    public u(Context context, long j7) {
        this.f4894b = context;
        this.f4895c = j7;
    }

    private void b(Context context, String str) {
        ImageView imageView = new ImageView(context);
        d8.t.p(context).k(str).g(this.f4893a).d(imageView, new a(imageView));
    }

    @Override
    public String doInBackground(Void... voidArr) {
        A7.b bVar;
        List list;
        String strF = p.c().f(this.f4895c);
        if (strF != null || this.f4895c <= 0) {
            return strF;
        }
        try {
            bb.t tVarExecute = s7.g.d().c().b(Long.toString(this.f4895c), "150x150", "Png", Boolean.FALSE).execute();
            return (!tVarExecute.g() || (bVar = (A7.b) tVarExecute.a()) == null || (list = bVar.data) == null || list.get(0) == null) ? strF : ((A7.a) bVar.data.get(0)).imageUrl;
        } catch (IOException e7) {
            e7.printStackTrace();
            return strF;
        }
    }

    public abstract void c(Bitmap bitmap);

    @Override
    public void onPostExecute(String str) {
        if (str == null || str.isEmpty()) {
            c(null);
        } else {
            p.c().h(this.f4895c, str);
            b(this.f4894b, str);
        }
    }
}
