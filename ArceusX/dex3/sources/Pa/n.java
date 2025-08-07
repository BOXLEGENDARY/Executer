package Pa;

import Sa.u;
import Sa.w;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class n implements Ta.a {
    private static final Pattern i = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");
    private static final Pattern j = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);
    private static final Pattern k = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");
    private static final Pattern l = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);
    private static final Pattern m = Pattern.compile("`+");
    private static final Pattern n = Pattern.compile("^`+");
    private static final Pattern o = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");
    private static final Pattern p = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");
    private static final Pattern q = Pattern.compile("^ *(?:\n *)?");
    private static final Pattern r = Pattern.compile("^[\\p{Zs}\t\r\n\f]");
    private static final Pattern s = Pattern.compile("\\s+");
    private static final Pattern t = Pattern.compile(" *$");
    private final BitSet a;
    private final BitSet b;
    private final Map<Character, Va.a> c;
    private final Ta.b d;
    private String e;
    private int f;
    private f g;
    private e h;

    private static class a {
        final int a;
        final boolean b;
        final boolean c;

        a(int i, boolean z, boolean z2) {
            this.a = i;
            this.c = z;
            this.b = z2;
        }
    }

    public n(Ta.b bVar) {
        Map<Character, Va.a> mapF = f(bVar.b());
        this.c = mapF;
        BitSet bitSetE = e(mapF.keySet());
        this.b = bitSetE;
        this.a = g(bitSetE);
        this.d = bVar;
    }

    private Sa.r A() {
        int i2 = this.f;
        int length = this.e.length();
        while (true) {
            int i3 = this.f;
            if (i3 == length || this.a.get(this.e.charAt(i3))) {
                break;
            }
            this.f++;
        }
        int i4 = this.f;
        if (i2 != i4) {
            return M(this.e, i2, i4);
        }
        return null;
    }

    private char B() {
        if (this.f < this.e.length()) {
            return this.e.charAt(this.f);
        }
        return (char) 0;
    }

    private void C(f fVar) {
        boolean z;
        HashMap map = new HashMap();
        f fVar2 = this.g;
        while (fVar2 != null) {
            f fVar3 = fVar2.e;
            if (fVar3 == fVar) {
                break;
            } else {
                fVar2 = fVar3;
            }
        }
        while (fVar2 != null) {
            char c = fVar2.b;
            Va.a aVar = this.c.get(Character.valueOf(c));
            if (!fVar2.d || aVar == null) {
                fVar2 = fVar2.f;
            } else {
                char cE = aVar.e();
                f fVar4 = fVar2.e;
                int iC = 0;
                boolean z2 = false;
                while (fVar4 != null && fVar4 != fVar && fVar4 != map.get(Character.valueOf(c))) {
                    if (fVar4.c && fVar4.b == cE) {
                        iC = aVar.c(fVar4, fVar2);
                        z2 = true;
                        if (iC > 0) {
                            z = true;
                            break;
                        }
                    }
                    fVar4 = fVar4.e;
                }
                z = z2;
                z2 = false;
                if (z2) {
                    w wVar = fVar4.a;
                    w wVar2 = fVar2.a;
                    fVar4.g -= iC;
                    fVar2.g -= iC;
                    wVar.n(wVar.m().substring(0, wVar.m().length() - iC));
                    wVar2.n(wVar2.m().substring(0, wVar2.m().length() - iC));
                    G(fVar4, fVar2);
                    k(wVar, wVar2);
                    aVar.b(wVar, wVar2, iC);
                    if (fVar4.g == 0) {
                        E(fVar4);
                    }
                    if (fVar2.g == 0) {
                        f fVar5 = fVar2.f;
                        E(fVar2);
                        fVar2 = fVar5;
                    }
                } else {
                    if (!z) {
                        map.put(Character.valueOf(c), fVar2.e);
                        if (!fVar2.c) {
                            F(fVar2);
                        }
                    }
                    fVar2 = fVar2.f;
                }
            }
        }
        while (true) {
            f fVar6 = this.g;
            if (fVar6 == null || fVar6 == fVar) {
                return;
            } else {
                F(fVar6);
            }
        }
    }

    private void D(f fVar) {
        f fVar2 = fVar.e;
        if (fVar2 != null) {
            fVar2.f = fVar.f;
        }
        f fVar3 = fVar.f;
        if (fVar3 == null) {
            this.g = fVar2;
        } else {
            fVar3.e = fVar2;
        }
    }

    private void E(f fVar) {
        fVar.a.l();
        D(fVar);
    }

    private void F(f fVar) {
        D(fVar);
    }

    private void G(f fVar, f fVar2) {
        f fVar3 = fVar2.e;
        while (fVar3 != null && fVar3 != fVar) {
            f fVar4 = fVar3.e;
            F(fVar3);
            fVar3 = fVar4;
        }
    }

    private void H() {
        this.h = this.h.d;
    }

    private a J(Va.a aVar, char c) {
        boolean z;
        int i2 = this.f;
        boolean z2 = false;
        int i3 = 0;
        while (B() == c) {
            i3++;
            this.f++;
        }
        if (i3 < aVar.d()) {
            this.f = i2;
            return null;
        }
        String strSubstring = i2 == 0 ? "\n" : this.e.substring(i2 - 1, i2);
        char cB = B();
        String strValueOf = cB != 0 ? String.valueOf(cB) : "\n";
        Pattern pattern = i;
        boolean zMatches = pattern.matcher(strSubstring).matches();
        Pattern pattern2 = r;
        boolean zMatches2 = pattern2.matcher(strSubstring).matches();
        boolean zMatches3 = pattern.matcher(strValueOf).matches();
        boolean zMatches4 = pattern2.matcher(strValueOf).matches();
        boolean z3 = !zMatches4 && (!zMatches3 || zMatches2 || zMatches);
        boolean z4 = !zMatches2 && (!zMatches || zMatches4 || zMatches3);
        if (c == '_') {
            z = z3 && (!z4 || zMatches);
            if (z4 && (!z3 || zMatches3)) {
                z2 = true;
            }
        } else {
            boolean z5 = z3 && c == aVar.e();
            if (z4 && c == aVar.a()) {
                z2 = true;
            }
            z = z5;
        }
        this.f = i2;
        return new a(i3, z, z2);
    }

    private void K() {
        h(q);
    }

    private w L(String str) {
        return new w(str);
    }

    private w M(String str, int i2, int i3) {
        return new w(str.substring(i2, i3));
    }

    private void b(e eVar) {
        e eVar2 = this.h;
        if (eVar2 != null) {
            eVar2.g = true;
        }
        this.h = eVar;
    }

    private static void c(char c, Va.a aVar, Map<Character, Va.a> map) {
        if (map.put(Character.valueOf(c), aVar) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c + "'");
    }

    private static void d(Iterable<Va.a> iterable, Map<Character, Va.a> map) {
        s sVar;
        for (Va.a aVar : iterable) {
            char cE = aVar.e();
            char cA = aVar.a();
            if (cE == cA) {
                Va.a aVar2 = map.get(Character.valueOf(cE));
                if (aVar2 == null || aVar2.e() != aVar2.a()) {
                    c(cE, aVar, map);
                } else {
                    if (aVar2 instanceof s) {
                        sVar = (s) aVar2;
                    } else {
                        s sVar2 = new s(cE);
                        sVar2.f(aVar2);
                        sVar = sVar2;
                    }
                    sVar.f(aVar);
                    map.put(Character.valueOf(cE), sVar);
                }
            } else {
                c(cE, aVar, map);
                c(cA, aVar, map);
            }
        }
    }

    public static BitSet e(Set<Character> set) {
        BitSet bitSet = new BitSet();
        Iterator<Character> it = set.iterator();
        while (it.hasNext()) {
            bitSet.set(it.next().charValue());
        }
        return bitSet;
    }

    public static Map<Character, Va.a> f(List<Va.a> list) {
        HashMap map = new HashMap();
        d(Arrays.asList(new Qa.a(), new Qa.c()), map);
        d(list, map);
        return map;
    }

    public static BitSet g(BitSet bitSet) {
        BitSet bitSet2 = new BitSet();
        bitSet2.or(bitSet);
        bitSet2.set(10);
        bitSet2.set(96);
        bitSet2.set(91);
        bitSet2.set(93);
        bitSet2.set(92);
        bitSet2.set(33);
        bitSet2.set(60);
        bitSet2.set(38);
        return bitSet2;
    }

    private String h(Pattern pattern) {
        if (this.f >= this.e.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.e);
        matcher.region(this.f, this.e.length());
        if (!matcher.find()) {
            return null;
        }
        this.f = matcher.end();
        return matcher.group();
    }

    private void i(Sa.r rVar) {
        if (rVar.c() == rVar.d()) {
            return;
        }
        l(rVar.c(), rVar.d());
    }

    private void j(w wVar, w wVar2, int i2) {
        if (wVar == null || wVar2 == null || wVar == wVar2) {
            return;
        }
        StringBuilder sb = new StringBuilder(i2);
        sb.append(wVar.m());
        Sa.r rVarE = wVar.e();
        Sa.r rVarE2 = wVar2.e();
        while (rVarE != rVarE2) {
            sb.append(((w) rVarE).m());
            Sa.r rVarE3 = rVarE.e();
            rVarE.l();
            rVarE = rVarE3;
        }
        wVar.n(sb.toString());
    }

    private void k(Sa.r rVar, Sa.r rVar2) {
        if (rVar == rVar2 || rVar.e() == rVar2) {
            return;
        }
        l(rVar.e(), rVar2.g());
    }

    private void l(Sa.r rVar, Sa.r rVar2) {
        w wVar = null;
        w wVar2 = null;
        int length = 0;
        while (rVar != null) {
            if (rVar instanceof w) {
                wVar2 = (w) rVar;
                if (wVar == null) {
                    wVar = wVar2;
                }
                length += wVar2.m().length();
            } else {
                j(wVar, wVar2, length);
                wVar = null;
                wVar2 = null;
                length = 0;
            }
            if (rVar == rVar2) {
                break;
            } else {
                rVar = rVar.e();
            }
        }
        j(wVar, wVar2, length);
    }

    private Sa.r m() {
        String strH = h(o);
        if (strH != null) {
            String strSubstring = strH.substring(1, strH.length() - 1);
            Sa.n nVar = new Sa.n("mailto:" + strSubstring, null);
            nVar.b(new w(strSubstring));
            return nVar;
        }
        String strH2 = h(p);
        if (strH2 == null) {
            return null;
        }
        String strSubstring2 = strH2.substring(1, strH2.length() - 1);
        Sa.n nVar2 = new Sa.n(strSubstring2, null);
        nVar2.b(new w(strSubstring2));
        return nVar2;
    }

    private Sa.r n() {
        this.f++;
        if (B() == '\n') {
            Sa.h hVar = new Sa.h();
            this.f++;
            return hVar;
        }
        if (this.f < this.e.length()) {
            Pattern pattern = k;
            String str = this.e;
            int i2 = this.f;
            if (pattern.matcher(str.substring(i2, i2 + 1)).matches()) {
                String str2 = this.e;
                int i3 = this.f;
                w wVarM = M(str2, i3, i3 + 1);
                this.f++;
                return wVarM;
            }
        }
        return L("\\");
    }

    private Sa.r o() {
        String strH;
        String strH2 = h(n);
        if (strH2 == null) {
            return null;
        }
        int i2 = this.f;
        do {
            strH = h(m);
            if (strH == null) {
                this.f = i2;
                return L(strH2);
            }
        } while (!strH.equals(strH2));
        Sa.d dVar = new Sa.d();
        String strReplace = this.e.substring(i2, this.f - strH2.length()).replace('\n', ' ');
        if (strReplace.length() >= 3 && strReplace.charAt(0) == ' ' && strReplace.charAt(strReplace.length() - 1) == ' ' && Ra.d.e(strReplace)) {
            strReplace = strReplace.substring(1, strReplace.length() - 1);
        }
        dVar.n(strReplace);
        return dVar;
    }

    private Sa.r p() {
        int i2 = this.f;
        this.f = i2 + 1;
        if (B() != '[') {
            return L("!");
        }
        this.f++;
        w wVarL = L("![");
        b(e.a(wVarL, i2 + 1, this.h, this.g));
        return wVarL;
    }

    private Sa.r q() {
        throw new UnsupportedOperationException("Method not decompiled: Pa.n.q():Sa.r");
    }

    private Sa.r r(Va.a aVar, char c) {
        a aVarJ = J(aVar, c);
        if (aVarJ == null) {
            return null;
        }
        int i2 = aVarJ.a;
        int i3 = this.f;
        int i4 = i3 + i2;
        this.f = i4;
        w wVarM = M(this.e, i3, i4);
        f fVar = new f(wVarM, c, aVarJ.c, aVarJ.b, this.g);
        this.g = fVar;
        fVar.g = i2;
        fVar.h = i2;
        f fVar2 = fVar.e;
        if (fVar2 != null) {
            fVar2.f = fVar;
        }
        return wVarM;
    }

    private Sa.r s() {
        String strH = h(l);
        if (strH != null) {
            return L(Ra.b.a(strH));
        }
        return null;
    }

    private Sa.r t() {
        String strH = h(j);
        if (strH == null) {
            return null;
        }
        Sa.k kVar = new Sa.k();
        kVar.m(strH);
        return kVar;
    }

    private Sa.r u(Sa.r rVar) {
        Sa.r rVarY;
        char cB = B();
        if (cB == 0) {
            return null;
        }
        if (cB == '\n') {
            rVarY = y(rVar);
        } else if (cB == '!') {
            rVarY = p();
        } else if (cB == '&') {
            rVarY = s();
        } else if (cB == '<') {
            rVarY = m();
            if (rVarY == null) {
                rVarY = t();
            }
        } else if (cB != '`') {
            switch (cB) {
                case '[':
                    rVarY = z();
                    break;
                case '\\':
                    rVarY = n();
                    break;
                case ']':
                    rVarY = q();
                    break;
                default:
                    if (!this.b.get(cB)) {
                        rVarY = A();
                        break;
                    } else {
                        rVarY = r(this.c.get(Character.valueOf(cB)), cB);
                        break;
                    }
            }
        } else {
            rVarY = o();
        }
        if (rVarY != null) {
            return rVarY;
        }
        this.f++;
        return L(String.valueOf(cB));
    }

    private String v() {
        int iA = Ra.c.a(this.e, this.f);
        if (iA == -1) {
            return null;
        }
        String strSubstring = B() == '<' ? this.e.substring(this.f + 1, iA - 1) : this.e.substring(this.f, iA);
        this.f = iA;
        return Ra.a.e(strSubstring);
    }

    private String x() {
        int iD = Ra.c.d(this.e, this.f);
        if (iD == -1) {
            return null;
        }
        String strSubstring = this.e.substring(this.f + 1, iD - 1);
        this.f = iD;
        return Ra.a.e(strSubstring);
    }

    private Sa.r y(Sa.r rVar) {
        this.f++;
        if (rVar instanceof w) {
            w wVar = (w) rVar;
            if (wVar.m().endsWith(" ")) {
                String strM = wVar.m();
                Matcher matcher = t.matcher(strM);
                int iEnd = matcher.find() ? matcher.end() - matcher.start() : 0;
                if (iEnd > 0) {
                    wVar.n(strM.substring(0, strM.length() - iEnd));
                }
                return iEnd >= 2 ? new Sa.h() : new u();
            }
        }
        return new u();
    }

    private Sa.r z() {
        int i2 = this.f;
        this.f = i2 + 1;
        w wVarL = L("[");
        b(e.b(wVarL, i2, this.h, this.g));
        return wVarL;
    }

    void I(String str) {
        this.e = str;
        this.f = 0;
        this.g = null;
        this.h = null;
    }

    @Override
    public void a(String str, Sa.r rVar) {
        I(str.trim());
        Sa.r rVarU = null;
        while (true) {
            rVarU = u(rVarU);
            if (rVarU == null) {
                C(null);
                i(rVar);
                return;
            }
            rVar.b(rVarU);
        }
    }

    int w() {
        if (this.f < this.e.length() && this.e.charAt(this.f) == '[') {
            int i2 = this.f + 1;
            int iC = Ra.c.c(this.e, i2);
            int i3 = iC - i2;
            if (iC != -1 && i3 <= 999 && iC < this.e.length() && this.e.charAt(iC) == ']') {
                this.f = iC + 1;
                return i3 + 2;
            }
        }
        return 0;
    }
}
