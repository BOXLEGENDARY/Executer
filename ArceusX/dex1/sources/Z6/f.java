package z6;

import g1.kQwt.YGBtcyQ;
import h7.n;
import java.util.ArrayList;
import java.util.Iterator;

public class f {

    private static ArrayList<f> f24894c;

    public static f f24895d = new f("en_us", "en");

    public static f f24896e = new f("es_es", "es");

    public static f f24897f = new f("fr_fr", "fr");

    public static f f24898g = new f("it_it", "it");

    private String f24899a;

    private String f24900b;

    static {
        ArrayList<f> arrayList = new ArrayList<>();
        f24894c = arrayList;
        arrayList.add(f24895d);
        f24894c.add(f24896e);
        f24894c.add(f24897f);
        f24894c.add(f24898g);
        f24894c.add(new f("de_de", "de"));
        f24894c.add(new f("id_id", "id"));
        f24894c.add(new f("ja_jp", "ja"));
        f24894c.add(new f("ko_kr", "ko"));
        f24894c.add(new f("pt_br", "pt"));
        f24894c.add(new f("ru_ru", "ru"));
        f24894c.add(new f("th_th", "th"));
        f24894c.add(new f("tr_tr", "tr"));
        f24894c.add(new f("vi_vn", "vi"));
        f24894c.add(new f("zh_tw", "zh_TW"));
        if (n.i()) {
            f24894c.add(new f("zh_cjv", "zh_CN"));
        } else {
            f24894c.add(new f("zh_cn", "zh_CN"));
        }
    }

    private f(String str, String str2) {
        this.f24899a = str;
        this.f24900b = str2;
    }

    public static f a(String str) {
        Iterator<f> it = f24894c.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (next.c().equals(str) || next.c().equals(str.split(YGBtcyQ.FiXCzhWwHhvctB)[0])) {
                return next;
            }
        }
        return null;
    }

    public static f b(String str) {
        Iterator<f> it = f24894c.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (next.d().equals(str)) {
                return next;
            }
        }
        return null;
    }

    public String c() {
        return this.f24900b;
    }

    public String d() {
        return this.f24899a;
    }

    public String toString() {
        return "LocaleValue{'" + this.f24899a + "','" + this.f24900b + "'}";
    }
}
