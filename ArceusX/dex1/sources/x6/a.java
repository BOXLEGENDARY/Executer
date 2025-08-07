package X6;

import android.os.AsyncTask;
import com.google.gson.f;
import com.google.gson.t;
import com.roblox.client.routing.model.RouteModel;
import g6.i;
import h7.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;

public class a {

    private static final Object f7974d = new Object();

    private static a f7975e;

    private Wa.c f7976a;

    private X6.b f7977b;

    private Executor f7978c;

    static class C0055a {

        static final int[] f7979a;

        static {
            int[] iArr = new int[c.values().length];
            f7979a = iArr;
            try {
                iArr[c.PROFILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7979a[c.GAME_DETAILS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static class b extends AsyncTask<String, Void, List<d>> {

        private Wa.c f7980a;

        private X6.b f7981b;

        private Executor f7982c;

        private String f7983d;

        private String f7984e;

        class RunnableC0056a implements Runnable {

            final List f7985d;

            RunnableC0056a(List list) {
                this.f7985d = list;
            }

            @Override
            public void run() {
                String strC;
                for (d dVar : this.f7985d) {
                    l.g("AppRouter", "Trying to post event: " + dVar.a().e());
                    i iVarB = i.b(dVar.a().e());
                    int i7 = C0055a.f7979a[dVar.a().ordinal()];
                    if (i7 == 1) {
                        String str = dVar.a().g()[0];
                        if (!dVar.b().containsKey(str)) {
                            b.this.f7981b.c(dVar.a().e(), b.this.f7983d);
                            return;
                        } else {
                            try {
                                strC = i.c(Long.valueOf(dVar.b().get(str)).longValue());
                            } catch (NumberFormatException unused) {
                                b.this.f7981b.d(dVar.a().e(), b.this.f7983d);
                                return;
                            }
                        }
                    } else if (i7 != 2) {
                        strC = null;
                    } else {
                        String str2 = dVar.a().g()[0];
                        if (!dVar.b().containsKey(str2)) {
                            b.this.f7981b.c(dVar.a().e(), b.this.f7983d);
                            return;
                        } else {
                            try {
                                strC = String.valueOf(Long.valueOf(dVar.b().get(str2)).longValue());
                            } catch (NumberFormatException unused2) {
                                b.this.f7981b.d(dVar.a().e(), b.this.f7983d);
                                return;
                            }
                        }
                    }
                    if (strC != null) {
                        iVarB.i(strC);
                        b.this.f7981b.i();
                    } else {
                        b.this.f7981b.j();
                    }
                    b.this.f7980a.j(iVarB);
                }
            }
        }

        b(Wa.c cVar, X6.b bVar, Executor executor) {
            this.f7980a = cVar;
            this.f7981b = bVar;
            this.f7982c = executor;
        }

        private List<d> d(List<String> list, HashMap<String, String> map) {
            d dVar;
            ArrayList arrayList = new ArrayList();
            for (int i7 = 0; i7 < list.size(); i7++) {
                try {
                    c cVarValueOf = c.valueOf(list.get(i7).toUpperCase());
                    if (i7 != list.size() - 1) {
                        dVar = new d(cVarValueOf);
                    } else {
                        if (cVarValueOf.f() != map.size()) {
                            l.g("AppRouter", "Incorrect number of parameters. Stop building routes.");
                            this.f7981b.f(cVarValueOf.e(), this.f7983d);
                            return arrayList;
                        }
                        dVar = new d(cVarValueOf, map);
                    }
                    arrayList.add(dVar);
                } catch (IllegalArgumentException unused) {
                    l.g("AppRouter", "AppTarget not recognized. Stop building routes.");
                }
            }
            return arrayList;
        }

        private String f(String str) {
            int iIndexOf = str.indexOf(47);
            if (iIndexOf == -1) {
                return null;
            }
            return str.substring(0, iIndexOf);
        }

        private List<String> g(String str) {
            ArrayList arrayList = new ArrayList(Arrays.asList(str.split("/")));
            if (arrayList.size() == 0) {
                return arrayList;
            }
            arrayList.remove(0);
            if (arrayList.size() == 0) {
                return arrayList;
            }
            String[] strArrSplit = ((String) arrayList.get(arrayList.size() - 1)).split("\\?");
            if (strArrSplit.length == 0) {
                return arrayList;
            }
            arrayList.remove(arrayList.size() - 1);
            arrayList.add(strArrSplit[0]);
            return arrayList;
        }

        private RouteModel i(String str) {
            try {
                return (RouteModel) new f().l(str, RouteModel.class);
            } catch (t unused) {
                l.g("AppRouter", "Invalid json string.");
                this.f7981b.e(str);
                return null;
            }
        }

        private List<d> j(String str) {
            ArrayList arrayList = new ArrayList();
            String strM = m(str);
            l.a("AppRouter", "Path: " + strM);
            if (strM == null) {
                return arrayList;
            }
            this.f7984e = f(strM);
            l.a("AppRouter", "ActionType: " + this.f7984e);
            List<String> listG = g(strM);
            l.a("AppRouter", "Actions: " + listG);
            return listG.size() == 0 ? arrayList : d(listG, h(strM));
        }

        private void k(List<d> list) {
            this.f7982c.execute(new RunnableC0056a(list));
        }

        private String m(String str) {
            int iIndexOf = str.indexOf("://");
            if (iIndexOf == -1) {
                return null;
            }
            return str.substring(iIndexOf + 3);
        }

        private boolean n(RouteModel routeModel) {
            String str = routeModel.android_default_action_handler;
            return str != null ? "native".equals(str) : "native".equals(routeModel.default_action_handler);
        }

        @Override
        public List<d> doInBackground(String... strArr) {
            this.f7981b.h();
            RouteModel routeModelI = i(strArr[0]);
            if (routeModelI == null) {
                return Collections.emptyList();
            }
            l.a("AppRouter", "defaultActionHandler: " + routeModelI.default_action_handler + ". action: " + routeModelI.default_action);
            if (!n(routeModelI)) {
                this.f7981b.a();
                l.a("AppRouter", "Should be handled by Lua.");
                return Collections.emptyList();
            }
            this.f7981b.b();
            String str = routeModelI.default_action;
            this.f7983d = str;
            List<d> listJ = j(str);
            if (listJ.size() == 0) {
                this.f7981b.g(this.f7983d);
            }
            return listJ;
        }

        public HashMap<String, String> h(String str) {
            String str2;
            String[] strArrSplit = str.split("\\?");
            HashMap<String, String> map = new HashMap<>();
            if (strArrSplit.length < 2 || (str2 = strArrSplit[1]) == null) {
                return map;
            }
            for (String str3 : str2.split("&")) {
                if (str3 != null) {
                    String[] strArrSplit2 = str3.split("=");
                    if (strArrSplit2.length == 2) {
                        map.put(strArrSplit2[0], strArrSplit2[1]);
                    }
                }
            }
            return map;
        }

        @Override
        public void onPostExecute(List<d> list) {
            super.onPostExecute(list);
            k(list);
        }
    }

    a(Wa.c cVar, X6.b bVar, Executor executor) {
        this.f7976a = cVar;
        this.f7977b = bVar;
        this.f7978c = executor;
    }

    public static a a() {
        a aVar;
        synchronized (f7974d) {
            try {
                if (f7975e == null) {
                    f7975e = new a(Wa.c.d(), new X6.b(), AsyncTask.THREAD_POOL_EXECUTOR);
                }
                aVar = f7975e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    public void b(String str) {
        new b(this.f7976a, this.f7977b, this.f7978c).executeOnExecutor(this.f7978c, str);
    }
}
