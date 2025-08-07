package X6;

import E6.h;
import com.roblox.client.P;

public class b {
    public void a() {
        h.b().p("Android-AppRouter-RouteHandledByLua");
    }

    public void b() {
        h.b().p("Android-AppRouter-RouteHandledNatively");
    }

    public void c(String str, String str2) {
        h.b().p("Android-AppRouter-ErrorIncorrectParamName");
        P.e("appRouter", "incorrectParamName", "Event:" + str + ". URL:" + str2);
    }

    public void d(String str, String str2) {
        h.b().p("Android-AppRouter-ErrorIncorrectParamValue");
        P.e("appRouter", "incorrectParamValue", "Event:" + str + ". URL:" + str2);
    }

    public void e(String str) {
        h.b().p("Android-AppRouter-ErrorInvalidJson");
        P.e("appRouter", "invalidJson", str);
    }

    public void f(String str, String str2) {
        h.b().p("Android-AppRouter-ErrorNoParamsFoundForEvent");
        P.e("appRouter", "noParamsFoundForEvent", "Event:" + str + ". URL:" + str2);
    }

    public void g(String str) {
        h.b().p("Android-AppRouter-ErrorNoRoutesParsed");
        P.e("appRouter", "noRoutesParsed", str);
    }

    public void h() {
        h.b().p("Android-AppRouter-ParseRouteCalled");
    }

    public void i() {
        h.b().p("Android-AppRouter-PostEventWithParams");
    }

    public void j() {
        h.b().p("Android-AppRouter-PostEventWithoutParams");
    }
}
