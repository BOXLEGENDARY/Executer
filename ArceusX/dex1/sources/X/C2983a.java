package x;

import A.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import s.O0;
import t.C2894g;
import t.O;
import y.h;
import ya.HnSi.PLHvHoayk;
import z.C3039b0;
import z.C3043d0;
import z.InterfaceC3060o;

public class C2983a implements A.a {

    private final O f24311a;

    private int f24316f = 0;

    private final Map<String, List<String>> f24313c = new HashMap();

    private Set<Set<String>> f24315e = new HashSet();

    private final List<a.InterfaceC0000a> f24312b = new ArrayList();

    private List<InterfaceC3060o> f24314d = new ArrayList();

    public C2983a(O o2) {
        this.f24311a = o2;
        e();
    }

    private void e() {
        Set<Set<String>> hashSet = new HashSet<>();
        try {
            hashSet = this.f24311a.e();
        } catch (C2894g unused) {
            C3043d0.c("Camera2CameraCoordinator", PLHvHoayk.zwdw);
        }
        Iterator<Set<String>> it = hashSet.iterator();
        while (it.hasNext()) {
            ArrayList arrayList = new ArrayList(it.next());
            if (arrayList.size() >= 2) {
                String str = (String) arrayList.get(0);
                String str2 = (String) arrayList.get(1);
                try {
                    if (O0.a(this.f24311a, str) && O0.a(this.f24311a, str2)) {
                        this.f24315e.add(new HashSet(Arrays.asList(str, str2)));
                        if (!this.f24313c.containsKey(str)) {
                            this.f24313c.put(str, new ArrayList());
                        }
                        if (!this.f24313c.containsKey(str2)) {
                            this.f24313c.put(str2, new ArrayList());
                        }
                        this.f24313c.get(str).add((String) arrayList.get(1));
                        this.f24313c.get(str2).add((String) arrayList.get(0));
                    }
                } catch (C3039b0 unused2) {
                    C3043d0.a("Camera2CameraCoordinator", "Concurrent camera id pair: (" + str + ", " + str2 + ") is not backward compatible");
                }
            }
        }
    }

    @Override
    public void a(a.InterfaceC0000a interfaceC0000a) {
        this.f24312b.add(interfaceC0000a);
    }

    @Override
    public int b() {
        return this.f24316f;
    }

    @Override
    public String c(String str) {
        if (!this.f24313c.containsKey(str)) {
            return null;
        }
        for (String str2 : this.f24313c.get(str)) {
            Iterator<InterfaceC3060o> it = this.f24314d.iterator();
            while (it.hasNext()) {
                if (str2.equals(h.a(it.next()).c())) {
                    return str2;
                }
            }
        }
        return null;
    }

    @Override
    public void d(int i7) {
        if (i7 != this.f24316f) {
            Iterator<a.InterfaceC0000a> it = this.f24312b.iterator();
            while (it.hasNext()) {
                it.next().a(this.f24316f, i7);
            }
        }
        if (this.f24316f == 2 && i7 != 2) {
            this.f24314d.clear();
        }
        this.f24316f = i7;
    }
}
