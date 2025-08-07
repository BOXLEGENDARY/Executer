package Pa;

import java.util.regex.Pattern;

public class k extends Ua.a {
    private static final Pattern[][] e = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(">")}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|section|source|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};
    private final Sa.j a;
    private final Pattern b;
    private boolean c;
    private Pa.a d;

    public static class b extends Ua.b {
        @Override
        public Ua.f a(Ua.h hVar, Ua.g gVar) {
            int i = hVar.i();
            CharSequence charSequenceH = hVar.h();
            if (hVar.g() < 4 && charSequenceH.charAt(i) == '<') {
                for (int i2 = 1; i2 <= 7; i2++) {
                    if (i2 != 7 || !(gVar.a().g() instanceof Sa.t)) {
                        Pattern pattern = k.e[i2][0];
                        Pattern pattern2 = k.e[i2][1];
                        if (pattern.matcher(charSequenceH.subSequence(i, charSequenceH.length())).find()) {
                            return Ua.f.d(new k(pattern2)).b(hVar.e());
                        }
                    }
                }
            }
            return Ua.f.c();
        }
    }

    @Override
    public Ua.c b(Ua.h hVar) {
        return this.c ? Ua.c.d() : (hVar.f() && this.b == null) ? Ua.c.d() : Ua.c.b(hVar.e());
    }

    @Override
    public void e() {
        this.a.n(this.d.b());
        this.d = null;
    }

    @Override
    public Sa.a g() {
        return this.a;
    }

    @Override
    public void h(CharSequence charSequence) {
        this.d.a(charSequence);
        Pattern pattern = this.b;
        if (pattern == null || !pattern.matcher(charSequence).find()) {
            return;
        }
        this.c = true;
    }

    private k(Pattern pattern) {
        this.a = new Sa.j();
        this.c = false;
        this.d = new Pa.a();
        this.b = pattern;
    }
}
