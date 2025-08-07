package o2;

import android.graphics.Matrix;
import android.util.Log;
import android.util.Xml;
import com.roblox.client.personasdk.R;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import o2.b;
import o2.e;
import o2.g;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.DefaultHandler2;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

class k {
    private int d;
    private o2.g a = null;
    private g.J b = null;
    private boolean c = false;
    private boolean e = false;
    private h f = null;
    private StringBuilder g = null;
    private boolean h = false;
    private StringBuilder i = null;

    static class a {
        static final int[] a;
        static final int[] b;

        static {
            int[] iArr = new int[g.values().length];
            b = iArr;
            try {
                iArr[g.x.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[g.y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[g.width.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[g.height.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[g.version.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[g.href.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[g.preserveAspectRatio.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[g.d.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                b[g.pathLength.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                b[g.rx.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                b[g.ry.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                b[g.cx.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                b[g.cy.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                b[g.r.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                b[g.x1.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                b[g.y1.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                b[g.x2.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                b[g.y2.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                b[g.dx.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                b[g.dy.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                b[g.requiredFeatures.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                b[g.requiredExtensions.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                b[g.systemLanguage.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                b[g.requiredFormats.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                b[g.requiredFonts.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                b[g.refX.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                b[g.refY.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                b[g.markerWidth.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                b[g.markerHeight.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                b[g.markerUnits.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                b[g.orient.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                b[g.gradientUnits.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                b[g.gradientTransform.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                b[g.spreadMethod.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                b[g.fx.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                b[g.fy.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                b[g.offset.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                b[g.clipPathUnits.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                b[g.startOffset.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                b[g.patternUnits.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                b[g.patternContentUnits.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                b[g.patternTransform.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                b[g.maskUnits.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                b[g.maskContentUnits.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                b[g.style.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                b[g.CLASS.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                b[g.fill.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                b[g.fill_rule.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                b[g.fill_opacity.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                b[g.stroke.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                b[g.stroke_opacity.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                b[g.stroke_width.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                b[g.stroke_linecap.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                b[g.stroke_linejoin.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                b[g.stroke_miterlimit.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                b[g.stroke_dasharray.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                b[g.stroke_dashoffset.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                b[g.opacity.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                b[g.color.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                b[g.font.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                b[g.font_family.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                b[g.font_size.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                b[g.font_weight.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                b[g.font_style.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                b[g.text_decoration.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                b[g.direction.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                b[g.text_anchor.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                b[g.overflow.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                b[g.marker.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                b[g.marker_start.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                b[g.marker_mid.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                b[g.marker_end.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                b[g.display.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                b[g.visibility.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                b[g.stop_color.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                b[g.stop_opacity.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                b[g.clip.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                b[g.clip_path.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                b[g.clip_rule.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                b[g.mask.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                b[g.solid_color.ordinal()] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                b[g.solid_opacity.ordinal()] = 82;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                b[g.viewport_fill.ordinal()] = 83;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                b[g.viewport_fill_opacity.ordinal()] = 84;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                b[g.vector_effect.ordinal()] = 85;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                b[g.image_rendering.ordinal()] = 86;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                b[g.viewBox.ordinal()] = 87;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                b[g.type.ordinal()] = 88;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                b[g.media.ordinal()] = 89;
            } catch (NoSuchFieldError unused89) {
            }
            int[] iArr2 = new int[h.values().length];
            a = iArr2;
            try {
                iArr2[h.svg.ordinal()] = 1;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                a[h.g.ordinal()] = 2;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                a[h.a.ordinal()] = 3;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                a[h.defs.ordinal()] = 4;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                a[h.use.ordinal()] = 5;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                a[h.path.ordinal()] = 6;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                a[h.rect.ordinal()] = 7;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                a[h.circle.ordinal()] = 8;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                a[h.ellipse.ordinal()] = 9;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                a[h.line.ordinal()] = 10;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                a[h.polyline.ordinal()] = 11;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                a[h.polygon.ordinal()] = 12;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                a[h.text.ordinal()] = 13;
            } catch (NoSuchFieldError unused102) {
            }
            try {
                a[h.tspan.ordinal()] = 14;
            } catch (NoSuchFieldError unused103) {
            }
            try {
                a[h.tref.ordinal()] = 15;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                a[h.SWITCH.ordinal()] = 16;
            } catch (NoSuchFieldError unused105) {
            }
            try {
                a[h.symbol.ordinal()] = 17;
            } catch (NoSuchFieldError unused106) {
            }
            try {
                a[h.marker.ordinal()] = 18;
            } catch (NoSuchFieldError unused107) {
            }
            try {
                a[h.linearGradient.ordinal()] = 19;
            } catch (NoSuchFieldError unused108) {
            }
            try {
                a[h.radialGradient.ordinal()] = 20;
            } catch (NoSuchFieldError unused109) {
            }
            try {
                a[h.stop.ordinal()] = 21;
            } catch (NoSuchFieldError unused110) {
            }
            try {
                a[h.title.ordinal()] = 22;
            } catch (NoSuchFieldError unused111) {
            }
            try {
                a[h.desc.ordinal()] = 23;
            } catch (NoSuchFieldError unused112) {
            }
            try {
                a[h.clipPath.ordinal()] = 24;
            } catch (NoSuchFieldError unused113) {
            }
            try {
                a[h.textPath.ordinal()] = 25;
            } catch (NoSuchFieldError unused114) {
            }
            try {
                a[h.pattern.ordinal()] = 26;
            } catch (NoSuchFieldError unused115) {
            }
            try {
                a[h.image.ordinal()] = 27;
            } catch (NoSuchFieldError unused116) {
            }
            try {
                a[h.view.ordinal()] = 28;
            } catch (NoSuchFieldError unused117) {
            }
            try {
                a[h.mask.ordinal()] = 29;
            } catch (NoSuchFieldError unused118) {
            }
            try {
                a[h.style.ordinal()] = 30;
            } catch (NoSuchFieldError unused119) {
            }
            try {
                a[h.solidColor.ordinal()] = 31;
            } catch (NoSuchFieldError unused120) {
            }
        }
    }

    private static class b {
        private static final Map<String, e.a> a;

        static {
            HashMap map = new HashMap(10);
            a = map;
            map.put("none", e.a.none);
            map.put("xMinYMin", e.a.xMinYMin);
            map.put("xMidYMin", e.a.xMidYMin);
            map.put("xMaxYMin", e.a.xMaxYMin);
            map.put("xMinYMid", e.a.xMinYMid);
            map.put("xMidYMid", e.a.xMidYMid);
            map.put("xMaxYMid", e.a.xMaxYMid);
            map.put("xMinYMax", e.a.xMinYMax);
            map.put("xMidYMax", e.a.xMidYMax);
            map.put("xMaxYMax", e.a.xMaxYMax);
        }

        static e.a a(String str) {
            return a.get(str);
        }
    }

    private static class c {
        private static final Map<String, Integer> a;

        static {
            HashMap map = new HashMap(47);
            a = map;
            map.put("aliceblue", -984833);
            map.put("antiquewhite", -332841);
            map.put("aqua", -16711681);
            map.put("aquamarine", -8388652);
            map.put("azure", -983041);
            map.put("beige", -657956);
            map.put("bisque", -6972);
            map.put("black", -16777216);
            map.put("blanchedalmond", -5171);
            map.put("blue", -16776961);
            map.put("blueviolet", -7722014);
            map.put("brown", -5952982);
            map.put("burlywood", -2180985);
            map.put("cadetblue", -10510688);
            map.put("chartreuse", -8388864);
            map.put("chocolate", -2987746);
            map.put("coral", -32944);
            map.put("cornflowerblue", -10185235);
            map.put("cornsilk", -1828);
            map.put("crimson", -2354116);
            map.put("cyan", -16711681);
            map.put("darkblue", -16777077);
            map.put("darkcyan", -16741493);
            map.put("darkgoldenrod", -4684277);
            map.put("darkgray", -5658199);
            map.put("darkgreen", -16751616);
            map.put("darkgrey", -5658199);
            map.put("darkkhaki", -4343957);
            map.put("darkmagenta", -7667573);
            map.put("darkolivegreen", -11179217);
            map.put("darkorange", -29696);
            map.put("darkorchid", -6737204);
            map.put("darkred", -7667712);
            map.put("darksalmon", -1468806);
            map.put("darkseagreen", -7357297);
            map.put("darkslateblue", -12042869);
            map.put("darkslategray", -13676721);
            map.put("darkslategrey", -13676721);
            map.put("darkturquoise", -16724271);
            map.put("darkviolet", -7077677);
            map.put("deeppink", -60269);
            map.put("deepskyblue", -16728065);
            map.put("dimgray", -9868951);
            map.put("dimgrey", -9868951);
            map.put("dodgerblue", -14774017);
            map.put("firebrick", -5103070);
            map.put("floralwhite", -1296);
            map.put("forestgreen", -14513374);
            map.put("fuchsia", -65281);
            map.put("gainsboro", -2302756);
            map.put("ghostwhite", -460545);
            map.put("gold", -10496);
            map.put("goldenrod", -2448096);
            map.put("gray", -8355712);
            map.put("green", -16744448);
            map.put("greenyellow", -5374161);
            map.put("grey", -8355712);
            map.put("honeydew", -983056);
            map.put("hotpink", -38476);
            map.put("indianred", -3318692);
            map.put("indigo", -11861886);
            map.put("ivory", -16);
            map.put("khaki", -989556);
            map.put("lavender", -1644806);
            map.put("lavenderblush", -3851);
            map.put("lawngreen", -8586240);
            map.put("lemonchiffon", -1331);
            map.put("lightblue", -5383962);
            map.put("lightcoral", -1015680);
            map.put("lightcyan", -2031617);
            map.put("lightgoldenrodyellow", -329006);
            map.put("lightgray", -2894893);
            map.put("lightgreen", -7278960);
            map.put("lightgrey", -2894893);
            map.put("lightpink", -18751);
            map.put("lightsalmon", -24454);
            map.put("lightseagreen", -14634326);
            map.put("lightskyblue", -7876870);
            map.put("lightslategray", -8943463);
            map.put("lightslategrey", -8943463);
            map.put("lightsteelblue", -5192482);
            map.put("lightyellow", -32);
            map.put("lime", -16711936);
            map.put("limegreen", -13447886);
            map.put("linen", -331546);
            map.put("magenta", -65281);
            map.put("maroon", -8388608);
            map.put("mediumaquamarine", -10039894);
            map.put("mediumblue", -16777011);
            map.put("mediumorchid", -4565549);
            map.put("mediumpurple", -7114533);
            map.put("mediumseagreen", -12799119);
            map.put("mediumslateblue", -8689426);
            map.put("mediumspringgreen", -16713062);
            map.put("mediumturquoise", -12004916);
            map.put("mediumvioletred", -3730043);
            map.put("midnightblue", -15132304);
            map.put("mintcream", -655366);
            map.put("mistyrose", -6943);
            map.put("moccasin", -6987);
            map.put("navajowhite", -8531);
            map.put("navy", -16777088);
            map.put("oldlace", -133658);
            map.put("olive", -8355840);
            map.put("olivedrab", -9728477);
            map.put("orange", -23296);
            map.put("orangered", -47872);
            map.put("orchid", -2461482);
            map.put("palegoldenrod", -1120086);
            map.put("palegreen", -6751336);
            map.put("paleturquoise", -5247250);
            map.put("palevioletred", -2396013);
            map.put("papayawhip", -4139);
            map.put("peachpuff", -9543);
            map.put("peru", -3308225);
            map.put("pink", -16181);
            map.put("plum", -2252579);
            map.put("powderblue", -5185306);
            map.put("purple", -8388480);
            map.put("rebeccapurple", -10079335);
            map.put("red", -65536);
            map.put("rosybrown", -4419697);
            map.put("royalblue", -12490271);
            map.put("saddlebrown", -7650029);
            map.put("salmon", -360334);
            map.put("sandybrown", -744352);
            map.put("seagreen", -13726889);
            map.put("seashell", -2578);
            map.put("sienna", -6270419);
            map.put("silver", -4144960);
            map.put("skyblue", -7876885);
            map.put("slateblue", -9807155);
            map.put("slategray", -9404272);
            map.put("slategrey", -9404272);
            map.put("snow", -1286);
            map.put("springgreen", -16711809);
            map.put("steelblue", -12156236);
            map.put("tan", -2968436);
            map.put("teal", -16744320);
            map.put("thistle", -2572328);
            map.put("tomato", -40121);
            map.put("turquoise", -12525360);
            map.put("violet", -1146130);
            map.put("wheat", -663885);
            map.put("white", -1);
            map.put("whitesmoke", -657931);
            map.put("yellow", -256);
            map.put("yellowgreen", -6632142);
            map.put("transparent", 0);
        }

        static Integer a(String str) {
            return a.get(str);
        }
    }

    private static class d {
        private static final Map<String, g.C0712p> a;

        static {
            HashMap map = new HashMap(9);
            a = map;
            g.d0 d0Var = g.d0.pt;
            map.put("xx-small", new g.C0712p(0.694f, d0Var));
            map.put("x-small", new g.C0712p(0.833f, d0Var));
            map.put("small", new g.C0712p(10.0f, d0Var));
            map.put("medium", new g.C0712p(12.0f, d0Var));
            map.put("large", new g.C0712p(14.4f, d0Var));
            map.put("x-large", new g.C0712p(17.3f, d0Var));
            map.put("xx-large", new g.C0712p(20.7f, d0Var));
            g.d0 d0Var2 = g.d0.percent;
            map.put("smaller", new g.C0712p(83.33f, d0Var2));
            map.put("larger", new g.C0712p(120.0f, d0Var2));
        }

        static g.C0712p a(String str) {
            return a.get(str);
        }
    }

    private static class e {
        private static final Map<String, Integer> a;

        static {
            HashMap map = new HashMap(13);
            a = map;
            map.put("normal", 400);
            map.put("bold", 700);
            map.put("bolder", 1);
            map.put("lighter", -1);
            map.put("100", 100);
            map.put("200", 200);
            map.put("300", 300);
            map.put("400", 400);
            map.put("500", 500);
            map.put("600", 600);
            map.put("700", 700);
            map.put("800", 800);
            map.put("900", 900);
        }

        static Integer a(String str) {
            return a.get(str);
        }
    }

    private class f extends DefaultHandler2 {
        private f() {
        }

        @Override
        public void characters(char[] cArr, int i, int i2) throws SAXException {
            k.this.c1(new String(cArr, i, i2));
        }

        @Override
        public void endDocument() throws SAXException {
            k.this.o();
        }

        @Override
        public void endElement(String str, String str2, String str3) throws SAXException {
            k.this.p(str, str2, str3);
        }

        @Override
        public void processingInstruction(String str, String str2) throws SAXException {
            k.this.r(str, k.this.x0(new i(str2)));
        }

        @Override
        public void startDocument() throws SAXException {
            k.this.W0();
        }

        @Override
        public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
            k.this.X0(str, str2, str3, attributes);
        }

        f(k kVar, a aVar) {
            this();
        }
    }

    private enum g {
        CLASS,
        clip,
        clip_path,
        clipPathUnits,
        clip_rule,
        color,
        cx,
        cy,
        direction,
        dx,
        dy,
        fx,
        fy,
        d,
        display,
        fill,
        fill_rule,
        fill_opacity,
        font,
        font_family,
        font_size,
        font_weight,
        font_style,
        gradientTransform,
        gradientUnits,
        height,
        href,
        image_rendering,
        marker,
        marker_start,
        marker_mid,
        marker_end,
        markerHeight,
        markerUnits,
        markerWidth,
        mask,
        maskContentUnits,
        maskUnits,
        media,
        offset,
        opacity,
        orient,
        overflow,
        pathLength,
        patternContentUnits,
        patternTransform,
        patternUnits,
        points,
        preserveAspectRatio,
        r,
        refX,
        refY,
        requiredFeatures,
        requiredExtensions,
        requiredFormats,
        requiredFonts,
        rx,
        ry,
        solid_color,
        solid_opacity,
        spreadMethod,
        startOffset,
        stop_color,
        stop_opacity,
        stroke,
        stroke_dasharray,
        stroke_dashoffset,
        stroke_linecap,
        stroke_linejoin,
        stroke_miterlimit,
        stroke_opacity,
        stroke_width,
        style,
        systemLanguage,
        text_anchor,
        text_decoration,
        transform,
        type,
        vector_effect,
        version,
        viewBox,
        width,
        x,
        y,
        x1,
        y1,
        x2,
        y2,
        viewport_fill,
        viewport_fill_opacity,
        visibility,
        UNSUPPORTED;

        private static final Map<String, g> h1 = new HashMap();

        static {
            for (g gVar : values()) {
                if (gVar == CLASS) {
                    h1.put("class", gVar);
                } else {
                    if (gVar != UNSUPPORTED) {
                        h1.put(gVar.name().replace('_', '-'), gVar);
                    }
                }
            }
        }

        public static g c(String str) {
            g gVar = h1.get(str);
            return gVar != null ? gVar : UNSUPPORTED;
        }
    }

    private enum h {
        svg,
        a,
        circle,
        clipPath,
        defs,
        desc,
        ellipse,
        g,
        image,
        line,
        linearGradient,
        marker,
        mask,
        path,
        pattern,
        polygon,
        polyline,
        radialGradient,
        rect,
        solidColor,
        stop,
        style,
        SWITCH,
        symbol,
        text,
        textPath,
        title,
        tref,
        tspan,
        use,
        view,
        UNSUPPORTED;

        private static final Map<String, h> Z = new HashMap();

        static {
            for (h hVar : values()) {
                if (hVar == SWITCH) {
                    Z.put("switch", hVar);
                } else if (hVar != UNSUPPORTED) {
                    Z.put(hVar.name(), hVar);
                }
            }
        }

        public static h c(String str) {
            h hVar = Z.get(str);
            return hVar != null ? hVar : UNSUPPORTED;
        }
    }

    static class i {
        String a;
        int c;
        int b = 0;
        private o2.d d = new o2.d();

        i(String str) {
            this.c = 0;
            String strTrim = str.trim();
            this.a = strTrim;
            this.c = strTrim.length();
        }

        void A() {
            while (true) {
                int i = this.b;
                if (i >= this.c || !k(this.a.charAt(i))) {
                    return;
                } else {
                    this.b++;
                }
            }
        }

        int a() {
            int i = this.b;
            int i2 = this.c;
            if (i == i2) {
                return -1;
            }
            int i3 = i + 1;
            this.b = i3;
            if (i3 < i2) {
                return this.a.charAt(i3);
            }
            return -1;
        }

        String b() {
            int i = this.b;
            while (!h() && !k(this.a.charAt(this.b))) {
                this.b++;
            }
            String strSubstring = this.a.substring(i, this.b);
            this.b = i;
            return strSubstring;
        }

        Boolean c(Object obj) {
            if (obj == null) {
                return null;
            }
            z();
            return m();
        }

        float d(float f) {
            if (Float.isNaN(f)) {
                return Float.NaN;
            }
            z();
            return n();
        }

        float e(Boolean bool) {
            if (bool == null) {
                return Float.NaN;
            }
            z();
            return n();
        }

        boolean f(char c) {
            int i = this.b;
            boolean z = i < this.c && this.a.charAt(i) == c;
            if (z) {
                this.b++;
            }
            return z;
        }

        boolean g(String str) {
            int length = str.length();
            int i = this.b;
            boolean z = i <= this.c - length && this.a.substring(i, i + length).equals(str);
            if (z) {
                this.b += length;
            }
            return z;
        }

        boolean h() {
            return this.b == this.c;
        }

        boolean i() {
            int i = this.b;
            if (i == this.c) {
                return false;
            }
            char cCharAt = this.a.charAt(i);
            return (cCharAt >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z');
        }

        boolean j(int i) {
            return i == 10 || i == 13;
        }

        boolean k(int i) {
            return i == 32 || i == 10 || i == 13 || i == 9;
        }

        Integer l() {
            int i = this.b;
            if (i == this.c) {
                return null;
            }
            String str = this.a;
            this.b = i + 1;
            return Integer.valueOf(str.charAt(i));
        }

        Boolean m() {
            int i = this.b;
            if (i == this.c) {
                return null;
            }
            char cCharAt = this.a.charAt(i);
            if (cCharAt != '0' && cCharAt != '1') {
                return null;
            }
            this.b++;
            return Boolean.valueOf(cCharAt == '1');
        }

        float n() {
            float fB = this.d.b(this.a, this.b, this.c);
            if (!Float.isNaN(fB)) {
                this.b = this.d.a();
            }
            return fB;
        }

        String o() {
            if (h()) {
                return null;
            }
            int i = this.b;
            int iCharAt = this.a.charAt(i);
            while (true) {
                if ((iCharAt < 97 || iCharAt > 122) && (iCharAt < 65 || iCharAt > 90)) {
                    break;
                }
                iCharAt = a();
            }
            int i2 = this.b;
            while (k(iCharAt)) {
                iCharAt = a();
            }
            if (iCharAt == 40) {
                this.b++;
                return this.a.substring(i, i2);
            }
            this.b = i;
            return null;
        }

        g.C0712p p() {
            float fN = n();
            if (Float.isNaN(fN)) {
                return null;
            }
            g.d0 d0VarV = v();
            return d0VarV == null ? new g.C0712p(fN, g.d0.px) : new g.C0712p(fN, d0VarV);
        }

        String q() {
            if (h()) {
                return null;
            }
            int i = this.b;
            char cCharAt = this.a.charAt(i);
            if (cCharAt != '\'' && cCharAt != '\"') {
                return null;
            }
            int iA = a();
            while (iA != -1 && iA != cCharAt) {
                iA = a();
            }
            if (iA == -1) {
                this.b = i;
                return null;
            }
            int i2 = this.b;
            this.b = i2 + 1;
            return this.a.substring(i + 1, i2);
        }

        String r() {
            return t(' ', false);
        }

        String s(char c) {
            return t(c, false);
        }

        String t(char c, boolean z) {
            if (h()) {
                return null;
            }
            char cCharAt = this.a.charAt(this.b);
            if ((!z && k(cCharAt)) || cCharAt == c) {
                return null;
            }
            int i = this.b;
            int iA = a();
            while (iA != -1 && iA != c && (z || !k(iA))) {
                iA = a();
            }
            return this.a.substring(i, this.b);
        }

        String u(char c) {
            return t(c, true);
        }

        g.d0 v() {
            if (h()) {
                return null;
            }
            if (this.a.charAt(this.b) == '%') {
                this.b++;
                return g.d0.percent;
            }
            int i = this.b;
            if (i > this.c - 2) {
                return null;
            }
            try {
                g.d0 d0VarValueOf = g.d0.valueOf(this.a.substring(i, i + 2).toLowerCase(Locale.US));
                this.b += 2;
                return d0VarValueOf;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        String w() {
            if (h()) {
                return null;
            }
            int i = this.b;
            char cCharAt = this.a.charAt(i);
            if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
                this.b = i;
                return null;
            }
            int iA = a();
            while (true) {
                if ((iA < 65 || iA > 90) && (iA < 97 || iA > 122)) {
                    break;
                }
                iA = a();
            }
            return this.a.substring(i, this.b);
        }

        float x() {
            z();
            float fB = this.d.b(this.a, this.b, this.c);
            if (!Float.isNaN(fB)) {
                this.b = this.d.a();
            }
            return fB;
        }

        String y() {
            if (h()) {
                return null;
            }
            int i = this.b;
            this.b = this.c;
            return this.a.substring(i);
        }

        boolean z() {
            A();
            int i = this.b;
            if (i == this.c || this.a.charAt(i) != ',') {
                return false;
            }
            this.b++;
            A();
            return true;
        }
    }

    private class j implements Attributes {
        private XmlPullParser a;

        public j(XmlPullParser xmlPullParser) {
            this.a = xmlPullParser;
        }

        @Override
        public int getIndex(String str, String str2) {
            return -1;
        }

        @Override
        public int getLength() {
            return this.a.getAttributeCount();
        }

        @Override
        public String getLocalName(int i) {
            return this.a.getAttributeName(i);
        }

        @Override
        public String getQName(int i) {
            String attributeName = this.a.getAttributeName(i);
            if (this.a.getAttributePrefix(i) == null) {
                return attributeName;
            }
            return this.a.getAttributePrefix(i) + ':' + attributeName;
        }

        @Override
        public String getType(int i) {
            return null;
        }

        @Override
        public String getURI(int i) {
            return this.a.getAttributeNamespace(i);
        }

        @Override
        public String getValue(int i) {
            return this.a.getAttributeValue(i);
        }

        @Override
        public int getIndex(String str) {
            return -1;
        }

        @Override
        public String getType(String str, String str2) {
            return null;
        }

        @Override
        public String getValue(String str, String str2) {
            return null;
        }

        @Override
        public String getType(String str) {
            return null;
        }

        @Override
        public String getValue(String str) {
            return null;
        }
    }

    k() {
    }

    private void A(g.C0701d c0701d, Attributes attributes) throws o2.j {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String strTrim = attributes.getValue(i2).trim();
            switch (a.b[g.c(attributes.getLocalName(i2)).ordinal()]) {
                case R.styleable.LottieAnimationView_lottie_repeatCount:
                    c0701d.o = o0(strTrim);
                    break;
                case R.styleable.LottieAnimationView_lottie_repeatMode:
                    c0701d.p = o0(strTrim);
                    break;
                case R.styleable.LottieAnimationView_lottie_scale:
                    g.C0712p c0712pO0 = o0(strTrim);
                    c0701d.q = c0712pO0;
                    if (c0712pO0.h()) {
                        throw new o2.j("Invalid <circle> element. r cannot be negative");
                    }
                    break;
            }
        }
    }

    private static Set<String> A0(String str) {
        i iVar = new i(str);
        HashSet hashSet = new HashSet();
        while (!iVar.h()) {
            hashSet.add(iVar.r());
            iVar.A();
        }
        return hashSet;
    }

    private void B(g.C0702e c0702e, Attributes attributes) throws o2.j {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String strTrim = attributes.getValue(i2).trim();
            if (a.b[g.c(attributes.getLocalName(i2)).ordinal()] == 38) {
                if ("objectBoundingBox".equals(strTrim)) {
                    c0702e.p = Boolean.FALSE;
                } else {
                    if (!"userSpaceOnUse".equals(strTrim)) {
                        throw new o2.j("Invalid value for attribute clipPathUnits");
                    }
                    c0702e.p = Boolean.TRUE;
                }
            }
        }
    }

    private static g.C0712p[] B0(String str) {
        g.C0712p c0712pP;
        i iVar = new i(str);
        iVar.A();
        if (iVar.h() || (c0712pP = iVar.p()) == null || c0712pP.h()) {
            return null;
        }
        float fA = c0712pP.a();
        ArrayList arrayList = new ArrayList();
        arrayList.add(c0712pP);
        while (!iVar.h()) {
            iVar.z();
            g.C0712p c0712pP2 = iVar.p();
            if (c0712pP2 == null || c0712pP2.h()) {
                return null;
            }
            arrayList.add(c0712pP2);
            fA += c0712pP2.a();
        }
        if (fA == 0.0f) {
            return null;
        }
        return (g.C0712p[]) arrayList.toArray(new g.C0712p[arrayList.size()]);
    }

    private void C(g.G g2, Attributes attributes) throws o2.j {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String strTrim = attributes.getValue(i2).trim();
            switch (a.b[g.c(attributes.getLocalName(i2)).ordinal()]) {
                case 21:
                    g2.f(z0(strTrim));
                    break;
                case 22:
                    g2.h(strTrim);
                    break;
                case 23:
                    g2.k(F0(strTrim));
                    break;
                case 24:
                    g2.b(A0(strTrim));
                    break;
                case 25:
                    List<String> listI0 = i0(strTrim);
                    g2.d(listI0 != null ? new HashSet(listI0) : new HashSet(0));
                    break;
            }
        }
    }

    private static g.E.c C0(String str) {
        if ("butt".equals(str)) {
            return g.E.c.Butt;
        }
        if ("round".equals(str)) {
            return g.E.c.Round;
        }
        if ("square".equals(str)) {
            return g.E.c.Square;
        }
        return null;
    }

    private void D(g.L l, Attributes attributes) throws o2.j {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String qName = attributes.getQName(i2);
            if (qName.equals("id") || qName.equals("xml:id")) {
                l.c = attributes.getValue(i2).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                String strTrim = attributes.getValue(i2).trim();
                if ("default".equals(strTrim)) {
                    l.d = Boolean.FALSE;
                    return;
                } else {
                    if ("preserve".equals(strTrim)) {
                        l.d = Boolean.TRUE;
                        return;
                    }
                    throw new o2.j("Invalid value for \"xml:space\" attribute: " + strTrim);
                }
            }
        }
    }

    private static g.E.d D0(String str) {
        if ("miter".equals(str)) {
            return g.E.d.Miter;
        }
        if ("round".equals(str)) {
            return g.E.d.Round;
        }
        if ("bevel".equals(str)) {
            return g.E.d.Bevel;
        }
        return null;
    }

    private void E(g.C0705i c0705i, Attributes attributes) throws o2.j {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String strTrim = attributes.getValue(i2).trim();
            switch (a.b[g.c(attributes.getLocalName(i2)).ordinal()]) {
                case R.styleable.LottieAnimationView_lottie_rawRes:
                    g.C0712p c0712pO0 = o0(strTrim);
                    c0705i.q = c0712pO0;
                    if (c0712pO0.h()) {
                        throw new o2.j("Invalid <ellipse> element. rx cannot be negative");
                    }
                    break;
                case R.styleable.LottieAnimationView_lottie_renderMode:
                    g.C0712p c0712pO02 = o0(strTrim);
                    c0705i.r = c0712pO02;
                    if (c0712pO02.h()) {
                        throw new o2.j("Invalid <ellipse> element. ry cannot be negative");
                    }
                    break;
                case R.styleable.LottieAnimationView_lottie_repeatCount:
                    c0705i.o = o0(strTrim);
                    break;
                case R.styleable.LottieAnimationView_lottie_repeatMode:
                    c0705i.p = o0(strTrim);
                    break;
            }
        }
    }

    private static void E0(g.L l, String str) {
        i iVar = new i(str.replaceAll("/\\*.*?\\*/", ""));
        while (true) {
            String strS = iVar.s(':');
            iVar.A();
            if (!iVar.f(':')) {
                return;
            }
            iVar.A();
            String strU = iVar.u(';');
            if (strU == null) {
                return;
            }
            iVar.A();
            if (iVar.h() || iVar.f(';')) {
                if (l.f == null) {
                    l.f = new g.E();
                }
                S0(l.f, strS, strU);
                iVar.A();
            }
        }
    }

    private void F(o2.g.AbstractC0706j r5, org.xml.sax.Attributes r6) throws o2.j {
        throw new UnsupportedOperationException("Method not decompiled: o2.k.F(o2.g$j, org.xml.sax.Attributes):void");
    }

    private static Set<String> F0(String str) {
        i iVar = new i(str);
        HashSet hashSet = new HashSet();
        while (!iVar.h()) {
            String strR = iVar.r();
            int iIndexOf = strR.indexOf(45);
            if (iIndexOf != -1) {
                strR = strR.substring(0, iIndexOf);
            }
            hashSet.add(new Locale(strR, "", "").getLanguage());
            iVar.A();
        }
        return hashSet;
    }

    private void G(g.C0711o c0711o, Attributes attributes) throws o2.j {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String strTrim = attributes.getValue(i2).trim();
            int i3 = a.b[g.c(attributes.getLocalName(i2)).ordinal()];
            if (i3 == 1) {
                c0711o.q = o0(strTrim);
            } else if (i3 == 2) {
                c0711o.r = o0(strTrim);
            } else if (i3 == 3) {
                g.C0712p c0712pO0 = o0(strTrim);
                c0711o.s = c0712pO0;
                if (c0712pO0.h()) {
                    throw new o2.j("Invalid <use> element. width cannot be negative");
                }
            } else if (i3 == 4) {
                g.C0712p c0712pO02 = o0(strTrim);
                c0711o.t = c0712pO02;
                if (c0712pO02.h()) {
                    throw new o2.j("Invalid <use> element. height cannot be negative");
                }
            } else if (i3 != 6) {
                if (i3 == 7) {
                    w0(c0711o, strTrim);
                }
            } else if ("".equals(attributes.getURI(i2)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i2))) {
                c0711o.p = strTrim;
            }
        }
    }

    private static g.E.f G0(String str) {
        str.hashCode();
        switch (str) {
            case "middle":
                return g.E.f.Middle;
            case "end":
                return g.E.f.End;
            case "start":
                return g.E.f.Start;
            default:
                return null;
        }
    }

    private void H(g.C0713q c0713q, Attributes attributes) throws o2.j {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String strTrim = attributes.getValue(i2).trim();
            switch (a.b[g.c(attributes.getLocalName(i2)).ordinal()]) {
                case R.styleable.LottieAnimationView_lottie_speed:
                    c0713q.o = o0(strTrim);
                    break;
                case R.styleable.LottieAnimationView_lottie_url:
                    c0713q.p = o0(strTrim);
                    break;
                case 17:
                    c0713q.q = o0(strTrim);
                    break;
                case 18:
                    c0713q.r = o0(strTrim);
                    break;
            }
        }
    }

    private static g.E.EnumC0258g H0(String str) {
        str.hashCode();
        switch (str) {
            case "line-through":
                return g.E.EnumC0258g.LineThrough;
            case "underline":
                return g.E.EnumC0258g.Underline;
            case "none":
                return g.E.EnumC0258g.None;
            case "blink":
                return g.E.EnumC0258g.Blink;
            case "overline":
                return g.E.EnumC0258g.Overline;
            default:
                return null;
        }
    }

    private void I(g.M m, Attributes attributes) throws o2.j {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String strTrim = attributes.getValue(i2).trim();
            switch (a.b[g.c(attributes.getLocalName(i2)).ordinal()]) {
                case R.styleable.LottieAnimationView_lottie_speed:
                    m.m = o0(strTrim);
                    break;
                case R.styleable.LottieAnimationView_lottie_url:
                    m.n = o0(strTrim);
                    break;
                case 17:
                    m.o = o0(strTrim);
                    break;
                case 18:
                    m.p = o0(strTrim);
                    break;
            }
        }
    }

    private static g.E.h I0(String str) {
        str.hashCode();
        if (str.equals("ltr")) {
            return g.E.h.LTR;
        }
        if (str.equals("rtl")) {
            return g.E.h.RTL;
        }
        return null;
    }

    private void J(g.C0714r c0714r, Attributes attributes) throws o2.j {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String strTrim = attributes.getValue(i2).trim();
            switch (a.b[g.c(attributes.getLocalName(i2)).ordinal()]) {
                case 26:
                    c0714r.r = o0(strTrim);
                    break;
                case 27:
                    c0714r.s = o0(strTrim);
                    break;
                case 28:
                    g.C0712p c0712pO0 = o0(strTrim);
                    c0714r.t = c0712pO0;
                    if (c0712pO0.h()) {
                        throw new o2.j("Invalid <marker> element. markerWidth cannot be negative");
                    }
                    break;
                case 29:
                    g.C0712p c0712pO02 = o0(strTrim);
                    c0714r.u = c0712pO02;
                    if (c0712pO02.h()) {
                        throw new o2.j("Invalid <marker> element. markerHeight cannot be negative");
                    }
                    break;
                case 30:
                    if (!"strokeWidth".equals(strTrim)) {
                        if (!"userSpaceOnUse".equals(strTrim)) {
                            throw new o2.j("Invalid value for attribute markerUnits");
                        }
                        c0714r.q = true;
                        break;
                    } else {
                        c0714r.q = false;
                        break;
                    }
                case 31:
                    if ("auto".equals(strTrim)) {
                        c0714r.v = Float.valueOf(Float.NaN);
                        break;
                    } else {
                        c0714r.v = Float.valueOf(f0(strTrim));
                        break;
                    }
            }
        }
    }

    private Matrix J0(String str) throws o2.j {
        Matrix matrix = new Matrix();
        i iVar = new i(str);
        iVar.A();
        while (!iVar.h()) {
            String strO = iVar.o();
            if (strO == null) {
                throw new o2.j("Bad transform function encountered in transform list: " + str);
            }
            switch (strO) {
                case "matrix":
                    iVar.A();
                    float fN = iVar.n();
                    iVar.z();
                    float fN2 = iVar.n();
                    iVar.z();
                    float fN3 = iVar.n();
                    iVar.z();
                    float fN4 = iVar.n();
                    iVar.z();
                    float fN5 = iVar.n();
                    iVar.z();
                    float fN6 = iVar.n();
                    iVar.A();
                    if (!Float.isNaN(fN6) && iVar.f(')')) {
                        Matrix matrix2 = new Matrix();
                        matrix2.setValues(new float[]{fN, fN3, fN5, fN2, fN4, fN6, 0.0f, 0.0f, 1.0f});
                        matrix.preConcat(matrix2);
                        break;
                    } else {
                        throw new o2.j("Invalid transform list: " + str);
                    }
                    break;
                case "rotate":
                    iVar.A();
                    float fN7 = iVar.n();
                    float fX = iVar.x();
                    float fX2 = iVar.x();
                    iVar.A();
                    if (Float.isNaN(fN7) || !iVar.f(')')) {
                        throw new o2.j("Invalid transform list: " + str);
                    }
                    if (Float.isNaN(fX)) {
                        matrix.preRotate(fN7);
                        break;
                    } else if (!Float.isNaN(fX2)) {
                        matrix.preRotate(fN7, fX, fX2);
                        break;
                    } else {
                        throw new o2.j("Invalid transform list: " + str);
                    }
                    break;
                case "scale":
                    iVar.A();
                    float fN8 = iVar.n();
                    float fX3 = iVar.x();
                    iVar.A();
                    if (!Float.isNaN(fN8) && iVar.f(')')) {
                        if (!Float.isNaN(fX3)) {
                            matrix.preScale(fN8, fX3);
                            break;
                        } else {
                            matrix.preScale(fN8, fN8);
                            break;
                        }
                    } else {
                        throw new o2.j("Invalid transform list: " + str);
                    }
                case "skewX":
                    iVar.A();
                    float fN9 = iVar.n();
                    iVar.A();
                    if (!Float.isNaN(fN9) && iVar.f(')')) {
                        matrix.preSkew((float) Math.tan(Math.toRadians(fN9)), 0.0f);
                        break;
                    } else {
                        throw new o2.j("Invalid transform list: " + str);
                    }
                    break;
                case "skewY":
                    iVar.A();
                    float fN10 = iVar.n();
                    iVar.A();
                    if (!Float.isNaN(fN10) && iVar.f(')')) {
                        matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians(fN10)));
                        break;
                    } else {
                        throw new o2.j("Invalid transform list: " + str);
                    }
                    break;
                case "translate":
                    iVar.A();
                    float fN11 = iVar.n();
                    float fX4 = iVar.x();
                    iVar.A();
                    if (!Float.isNaN(fN11) && iVar.f(')')) {
                        if (!Float.isNaN(fX4)) {
                            matrix.preTranslate(fN11, fX4);
                            break;
                        } else {
                            matrix.preTranslate(fN11, 0.0f);
                            break;
                        }
                    } else {
                        throw new o2.j("Invalid transform list: " + str);
                    }
                    break;
                default:
                    throw new o2.j("Invalid transform list fn: " + strO + ")");
            }
            if (iVar.h()) {
                return matrix;
            }
            iVar.z();
        }
        return matrix;
    }

    private void K(g.C0715s c0715s, Attributes attributes) throws o2.j {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String strTrim = attributes.getValue(i2).trim();
            int i3 = a.b[g.c(attributes.getLocalName(i2)).ordinal()];
            if (i3 == 1) {
                c0715s.q = o0(strTrim);
            } else if (i3 == 2) {
                c0715s.r = o0(strTrim);
            } else if (i3 == 3) {
                g.C0712p c0712pO0 = o0(strTrim);
                c0715s.s = c0712pO0;
                if (c0712pO0.h()) {
                    throw new o2.j("Invalid <mask> element. width cannot be negative");
                }
            } else if (i3 == 4) {
                g.C0712p c0712pO02 = o0(strTrim);
                c0715s.t = c0712pO02;
                if (c0712pO02.h()) {
                    throw new o2.j("Invalid <mask> element. height cannot be negative");
                }
            } else if (i3 != 43) {
                if (i3 != 44) {
                    continue;
                } else if ("objectBoundingBox".equals(strTrim)) {
                    c0715s.p = Boolean.FALSE;
                } else {
                    if (!"userSpaceOnUse".equals(strTrim)) {
                        throw new o2.j("Invalid value for attribute maskContentUnits");
                    }
                    c0715s.p = Boolean.TRUE;
                }
            } else if ("objectBoundingBox".equals(strTrim)) {
                c0715s.o = Boolean.FALSE;
            } else {
                if (!"userSpaceOnUse".equals(strTrim)) {
                    throw new o2.j("Invalid value for attribute maskUnits");
                }
                c0715s.o = Boolean.TRUE;
            }
        }
    }

    private void K0(InputStream inputStream) throws ParserConfigurationException, SAXException, IOException {
        Log.d("SVGParser", "Falling back to SAX parser");
        try {
            SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            XMLReader xMLReader = sAXParserFactoryNewInstance.newSAXParser().getXMLReader();
            f fVar = new f(this, null);
            xMLReader.setContentHandler(fVar);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", fVar);
            xMLReader.parse(new InputSource(inputStream));
        } catch (IOException e2) {
            throw new o2.j("Stream error", e2);
        } catch (ParserConfigurationException e3) {
            throw new o2.j("XML parser problem", e3);
        } catch (SAXException e4) {
            throw new o2.j("SVG parse error", e4);
        }
    }

    private void L(g.C0718v c0718v, Attributes attributes) throws o2.j {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String strTrim = attributes.getValue(i2).trim();
            int i3 = a.b[g.c(attributes.getLocalName(i2)).ordinal()];
            if (i3 == 8) {
                c0718v.o = u0(strTrim);
            } else if (i3 != 9) {
                continue;
            } else {
                Float fValueOf = Float.valueOf(f0(strTrim));
                c0718v.p = fValueOf;
                if (fValueOf.floatValue() < 0.0f) {
                    throw new o2.j("Invalid <path> element. pathLength cannot be negative");
                }
            }
        }
    }

    private void L0(InputStream inputStream, boolean z) throws XmlPullParserException, ParserConfigurationException, SAXException, IOException {
        try {
            try {
                XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                j jVar = new j(xmlPullParserNewPullParser);
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                xmlPullParserNewPullParser.setInput(inputStream, null);
                for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.nextToken()) {
                    if (eventType == 0) {
                        W0();
                    } else if (eventType == 8) {
                        Log.d("SVGParser", "PROC INSTR: " + xmlPullParserNewPullParser.getText());
                        i iVar = new i(xmlPullParserNewPullParser.getText());
                        r(iVar.r(), x0(iVar));
                    } else if (eventType == 10) {
                        if (z && this.a.m() == null && xmlPullParserNewPullParser.getText().contains("<!ENTITY ")) {
                            try {
                                Log.d("SVGParser", "Switching to SAX parser to process entities");
                                inputStream.reset();
                                K0(inputStream);
                                return;
                            } catch (IOException unused) {
                                Log.w("SVGParser", "Detected internal entity definitions, but could not parse them.");
                                return;
                            }
                        }
                    } else if (eventType == 2) {
                        String name = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name = xmlPullParserNewPullParser.getPrefix() + ':' + name;
                        }
                        X0(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name, jVar);
                    } else if (eventType == 3) {
                        String name2 = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name2 = xmlPullParserNewPullParser.getPrefix() + ':' + name2;
                        }
                        p(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name2);
                    } else if (eventType == 4) {
                        int[] iArr = new int[2];
                        e1(xmlPullParserNewPullParser.getTextCharacters(iArr), iArr[0], iArr[1]);
                    } else if (eventType == 5) {
                        c1(xmlPullParserNewPullParser.getText());
                    }
                }
                o();
            } catch (IOException e2) {
                throw new o2.j("Stream error", e2);
            }
        } catch (XmlPullParserException e3) {
            throw new o2.j("XML parser problem", e3);
        }
    }

    private void M(o2.g.C0721y r6, org.xml.sax.Attributes r7) throws o2.j {
        throw new UnsupportedOperationException("Method not decompiled: o2.k.M(o2.g$y, org.xml.sax.Attributes):void");
    }

    private static g.E.i M0(String str) {
        str.hashCode();
        if (str.equals("none")) {
            return g.E.i.None;
        }
        if (str.equals("non-scaling-stroke")) {
            return g.E.i.NonScalingStroke;
        }
        return null;
    }

    private void N(g.C0722z c0722z, Attributes attributes, String str) throws o2.j {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            if (g.c(attributes.getLocalName(i2)) == g.points) {
                i iVar = new i(attributes.getValue(i2));
                ArrayList arrayList = new ArrayList();
                iVar.A();
                while (!iVar.h()) {
                    float fN = iVar.n();
                    if (Float.isNaN(fN)) {
                        throw new o2.j("Invalid <" + str + "> points attribute. Non-coordinate content found in list.");
                    }
                    iVar.z();
                    float fN2 = iVar.n();
                    if (Float.isNaN(fN2)) {
                        throw new o2.j("Invalid <" + str + "> points attribute. There should be an even number of coordinates.");
                    }
                    iVar.z();
                    arrayList.add(Float.valueOf(fN));
                    arrayList.add(Float.valueOf(fN2));
                }
                c0722z.o = new float[arrayList.size()];
                Iterator it = arrayList.iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    c0722z.o[i3] = ((Float) it.next()).floatValue();
                    i3++;
                }
            }
        }
    }

    private static g.C0699b N0(String str) throws o2.j {
        i iVar = new i(str);
        iVar.A();
        float fN = iVar.n();
        iVar.z();
        float fN2 = iVar.n();
        iVar.z();
        float fN3 = iVar.n();
        iVar.z();
        float fN4 = iVar.n();
        if (Float.isNaN(fN) || Float.isNaN(fN2) || Float.isNaN(fN3) || Float.isNaN(fN4)) {
            throw new o2.j("Invalid viewBox definition - should have four numbers");
        }
        if (fN3 < 0.0f) {
            throw new o2.j("Invalid viewBox. width cannot be negative");
        }
        if (fN4 >= 0.0f) {
            return new g.C0699b(fN, fN2, fN3, fN4);
        }
        throw new o2.j("Invalid viewBox. height cannot be negative");
    }

    private void O(o2.g.Q r5, org.xml.sax.Attributes r6) throws o2.j {
        throw new UnsupportedOperationException("Method not decompiled: o2.k.O(o2.g$Q, org.xml.sax.Attributes):void");
    }

    private void O0(Attributes attributes) throws o2.j {
        l("<path>", new Object[0]);
        if (this.b == null) {
            throw new o2.j("Invalid document. Root element must be <svg>");
        }
        g.C0718v c0718v = new g.C0718v();
        c0718v.a = this.a;
        c0718v.b = this.b;
        D(c0718v, attributes);
        S(c0718v, attributes);
        W(c0718v, attributes);
        C(c0718v, attributes);
        L(c0718v, attributes);
        this.b.i(c0718v);
    }

    private void P(g.B b3, Attributes attributes) throws o2.j {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String strTrim = attributes.getValue(i2).trim();
            int i3 = a.b[g.c(attributes.getLocalName(i2)).ordinal()];
            if (i3 == 1) {
                b3.o = o0(strTrim);
            } else if (i3 == 2) {
                b3.p = o0(strTrim);
            } else if (i3 == 3) {
                g.C0712p c0712pO0 = o0(strTrim);
                b3.q = c0712pO0;
                if (c0712pO0.h()) {
                    throw new o2.j("Invalid <rect> element. width cannot be negative");
                }
            } else if (i3 == 4) {
                g.C0712p c0712pO02 = o0(strTrim);
                b3.r = c0712pO02;
                if (c0712pO02.h()) {
                    throw new o2.j("Invalid <rect> element. height cannot be negative");
                }
            } else if (i3 == 10) {
                g.C0712p c0712pO03 = o0(strTrim);
                b3.s = c0712pO03;
                if (c0712pO03.h()) {
                    throw new o2.j("Invalid <rect> element. rx cannot be negative");
                }
            } else if (i3 != 11) {
                continue;
            } else {
                g.C0712p c0712pO04 = o0(strTrim);
                b3.t = c0712pO04;
                if (c0712pO04.h()) {
                    throw new o2.j("Invalid <rect> element. ry cannot be negative");
                }
            }
        }
    }

    private void P0(Attributes attributes) throws o2.j {
        l("<pattern>", new Object[0]);
        if (this.b == null) {
            throw new o2.j("Invalid document. Root element must be <svg>");
        }
        g.C0721y c0721y = new g.C0721y();
        c0721y.a = this.a;
        c0721y.b = this.b;
        D(c0721y, attributes);
        S(c0721y, attributes);
        C(c0721y, attributes);
        Y(c0721y, attributes);
        M(c0721y, attributes);
        this.b.i(c0721y);
        this.b = c0721y;
    }

    private void Q(g.F f2, Attributes attributes) throws o2.j {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String strTrim = attributes.getValue(i2).trim();
            int i3 = a.b[g.c(attributes.getLocalName(i2)).ordinal()];
            if (i3 == 1) {
                f2.q = o0(strTrim);
            } else if (i3 == 2) {
                f2.r = o0(strTrim);
            } else if (i3 == 3) {
                g.C0712p c0712pO0 = o0(strTrim);
                f2.s = c0712pO0;
                if (c0712pO0.h()) {
                    throw new o2.j("Invalid <svg> element. width cannot be negative");
                }
            } else if (i3 == 4) {
                g.C0712p c0712pO02 = o0(strTrim);
                f2.t = c0712pO02;
                if (c0712pO02.h()) {
                    throw new o2.j("Invalid <svg> element. height cannot be negative");
                }
            } else if (i3 == 5) {
                f2.u = strTrim;
            }
        }
    }

    private void Q0(Attributes attributes) throws o2.j {
        l("<polygon>", new Object[0]);
        if (this.b == null) {
            throw new o2.j("Invalid document. Root element must be <svg>");
        }
        g.C0722z a3 = new g.A();
        a3.a = this.a;
        a3.b = this.b;
        D(a3, attributes);
        S(a3, attributes);
        W(a3, attributes);
        C(a3, attributes);
        N(a3, attributes, "polygon");
        this.b.i(a3);
    }

    private void R(g.D d2, Attributes attributes) throws o2.j {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String strTrim = attributes.getValue(i2).trim();
            if (a.b[g.c(attributes.getLocalName(i2)).ordinal()] == 37) {
                d2.h = n0(strTrim);
            }
        }
    }

    private void R0(Attributes attributes) throws o2.j {
        l("<polyline>", new Object[0]);
        if (this.b == null) {
            throw new o2.j("Invalid document. Root element must be <svg>");
        }
        g.C0722z c0722z = new g.C0722z();
        c0722z.a = this.a;
        c0722z.b = this.b;
        D(c0722z, attributes);
        S(c0722z, attributes);
        W(c0722z, attributes);
        C(c0722z, attributes);
        N(c0722z, attributes, "polyline");
        this.b.i(c0722z);
    }

    private void S(g.L l, Attributes attributes) throws o2.j {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String strTrim = attributes.getValue(i2).trim();
            if (strTrim.length() != 0) {
                int i3 = a.b[g.c(attributes.getLocalName(i2)).ordinal()];
                if (i3 == 45) {
                    E0(l, strTrim);
                } else if (i3 != 46) {
                    if (l.e == null) {
                        l.e = new g.E();
                    }
                    S0(l.e, attributes.getLocalName(i2), attributes.getValue(i2).trim());
                } else {
                    l.g = o2.b.f(strTrim);
                }
            }
        }
    }

    static void S0(g.E e2, String str, String str2) {
        if (str2.length() == 0 || str2.equals("inherit")) {
            return;
        }
        try {
            switch (a.b[g.c(str).ordinal()]) {
                case 47:
                    g.O oT0 = t0(str2);
                    e2.e = oT0;
                    if (oT0 != null) {
                        e2.d |= 1;
                        return;
                    }
                    return;
                case 48:
                    g.E.a aVarE0 = e0(str2);
                    e2.i = aVarE0;
                    if (aVarE0 != null) {
                        e2.d |= 2;
                        return;
                    }
                    return;
                case 49:
                    Float fR0 = r0(str2);
                    e2.v = fR0;
                    if (fR0 != null) {
                        e2.d |= 4;
                        return;
                    }
                    return;
                case 50:
                    g.O oT02 = t0(str2);
                    e2.w = oT02;
                    if (oT02 != null) {
                        e2.d |= 8;
                        return;
                    }
                    return;
                case 51:
                    Float fR02 = r0(str2);
                    e2.y = fR02;
                    if (fR02 != null) {
                        e2.d |= 16;
                        return;
                    }
                    return;
                case 52:
                    e2.z = o0(str2);
                    e2.d |= 32;
                    break;
                case 53:
                    g.E.c cVarC0 = C0(str2);
                    e2.A = cVarC0;
                    if (cVarC0 != null) {
                        e2.d |= 64;
                        return;
                    }
                    return;
                case 54:
                    g.E.d dVarD0 = D0(str2);
                    e2.B = dVarD0;
                    if (dVarD0 != null) {
                        e2.d |= 128;
                        return;
                    }
                    return;
                case 55:
                    e2.C = Float.valueOf(f0(str2));
                    e2.d |= 256;
                    break;
                case 56:
                    if ("none".equals(str2)) {
                        e2.D = null;
                        e2.d |= 512;
                        return;
                    }
                    g.C0712p[] c0712pArrB0 = B0(str2);
                    e2.D = c0712pArrB0;
                    if (c0712pArrB0 != null) {
                        e2.d |= 512;
                        return;
                    }
                    return;
                case 57:
                    e2.E = o0(str2);
                    e2.d |= 1024;
                    break;
                case 58:
                    e2.F = r0(str2);
                    e2.d |= 2048;
                    return;
                case 59:
                    e2.G = b0(str2);
                    e2.d |= 4096;
                    break;
                case 60:
                    h0(e2, str2);
                    return;
                case 61:
                    List<String> listI0 = i0(str2);
                    e2.H = listI0;
                    if (listI0 != null) {
                        e2.d |= 8192;
                        return;
                    }
                    return;
                case 62:
                    g.C0712p c0712pJ0 = j0(str2);
                    e2.I = c0712pJ0;
                    if (c0712pJ0 != null) {
                        e2.d |= 16384;
                        return;
                    }
                    return;
                case 63:
                    Integer numL0 = l0(str2);
                    e2.J = numL0;
                    if (numL0 != null) {
                        e2.d |= 32768;
                        return;
                    }
                    return;
                case 64:
                    g.E.b bVarK0 = k0(str2);
                    e2.K = bVarK0;
                    if (bVarK0 != null) {
                        e2.d |= 65536;
                        return;
                    }
                    return;
                case 65:
                    g.E.EnumC0258g enumC0258gH0 = H0(str2);
                    e2.L = enumC0258gH0;
                    if (enumC0258gH0 != null) {
                        e2.d |= 131072;
                        return;
                    }
                    return;
                case 66:
                    g.E.h hVarI0 = I0(str2);
                    e2.M = hVarI0;
                    if (hVarI0 != null) {
                        e2.d |= 68719476736L;
                        return;
                    }
                    return;
                case 67:
                    g.E.f fVarG0 = G0(str2);
                    e2.N = fVarG0;
                    if (fVarG0 != null) {
                        e2.d |= 262144;
                        return;
                    }
                    return;
                case 68:
                    Boolean boolS0 = s0(str2);
                    e2.O = boolS0;
                    if (boolS0 != null) {
                        e2.d |= 524288;
                        return;
                    }
                    return;
                case 69:
                    String strM0 = m0(str2, str);
                    e2.Q = strM0;
                    e2.R = strM0;
                    e2.S = strM0;
                    e2.d |= 14680064;
                    return;
                case 70:
                    e2.Q = m0(str2, str);
                    e2.d |= 2097152;
                    return;
                case 71:
                    e2.R = m0(str2, str);
                    e2.d |= 4194304;
                    return;
                case 72:
                    e2.S = m0(str2, str);
                    e2.d |= 8388608;
                    return;
                case 73:
                    if (str2.indexOf(124) < 0) {
                        if ("|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|".contains('|' + str2 + '|')) {
                            e2.T = Boolean.valueOf(!str2.equals("none"));
                            e2.d |= 16777216;
                            return;
                        }
                        return;
                    }
                    return;
                case 74:
                    if (str2.indexOf(124) < 0) {
                        if ("|visible|hidden|collapse|".contains('|' + str2 + '|')) {
                            e2.U = Boolean.valueOf(str2.equals("visible"));
                            e2.d |= 33554432;
                            return;
                        }
                        return;
                    }
                    return;
                case 75:
                    if (str2.equals("currentColor")) {
                        e2.V = g.C0259g.a();
                    } else {
                        try {
                            e2.V = b0(str2);
                        } catch (o2.j e3) {
                            Log.w("SVGParser", e3.getMessage());
                            return;
                        }
                    }
                    e2.d |= 67108864;
                    return;
                case 76:
                    e2.W = r0(str2);
                    e2.d |= 134217728;
                    return;
                case 77:
                    g.C0700c c0700cA0 = a0(str2);
                    e2.P = c0700cA0;
                    if (c0700cA0 != null) {
                        e2.d |= 1048576;
                        return;
                    }
                    return;
                case 78:
                    e2.X = m0(str2, str);
                    e2.d |= 268435456;
                    return;
                case 79:
                    e2.Y = e0(str2);
                    e2.d |= 536870912;
                    return;
                case 80:
                    e2.Z = m0(str2, str);
                    e2.d |= 1073741824;
                    return;
                case 81:
                    if (str2.equals("currentColor")) {
                        e2.a0 = g.C0259g.a();
                    } else {
                        try {
                            e2.a0 = b0(str2);
                        } catch (o2.j e4) {
                            Log.w("SVGParser", e4.getMessage());
                            return;
                        }
                    }
                    e2.d |= 2147483648L;
                    return;
                case 82:
                    e2.b0 = r0(str2);
                    e2.d |= 4294967296L;
                    return;
                case 83:
                    if (str2.equals("currentColor")) {
                        e2.c0 = g.C0259g.a();
                    } else {
                        try {
                            e2.c0 = b0(str2);
                        } catch (o2.j e5) {
                            Log.w("SVGParser", e5.getMessage());
                            return;
                        }
                    }
                    e2.d |= 8589934592L;
                    return;
                case 84:
                    e2.d0 = r0(str2);
                    e2.d |= 17179869184L;
                    return;
                case 85:
                    g.E.i iVarM0 = M0(str2);
                    e2.e0 = iVarM0;
                    if (iVarM0 != null) {
                        e2.d |= 34359738368L;
                        return;
                    }
                    return;
                case 86:
                    g.E.e eVarY0 = y0(str2);
                    e2.f0 = eVarY0;
                    if (eVarY0 != null) {
                        e2.d |= 137438953472L;
                        return;
                    }
                    return;
                default:
                    return;
            }
        } catch (o2.j unused) {
        }
    }

    private void T(g.U u, Attributes attributes) {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String strTrim = attributes.getValue(i2).trim();
            if (a.b[g.c(attributes.getLocalName(i2)).ordinal()] == 6 && ("".equals(attributes.getURI(i2)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i2)))) {
                u.o = strTrim;
            }
        }
    }

    private void T0(Attributes attributes) throws o2.j {
        l("<radialGradient>", new Object[0]);
        if (this.b == null) {
            throw new o2.j("Invalid document. Root element must be <svg>");
        }
        g.Q q = new g.Q();
        q.a = this.a;
        q.b = this.b;
        D(q, attributes);
        S(q, attributes);
        F(q, attributes);
        O(q, attributes);
        this.b.i(q);
        this.b = q;
    }

    private void U(g.Z z, Attributes attributes) throws o2.j {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String strTrim = attributes.getValue(i2).trim();
            int i3 = a.b[g.c(attributes.getLocalName(i2)).ordinal()];
            if (i3 != 6) {
                if (i3 == 39) {
                    z.p = o0(strTrim);
                }
            } else if ("".equals(attributes.getURI(i2)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i2))) {
                z.o = strTrim;
            }
        }
    }

    private void U0(Attributes attributes) throws o2.j {
        l("<rect>", new Object[0]);
        if (this.b == null) {
            throw new o2.j("Invalid document. Root element must be <svg>");
        }
        g.B b3 = new g.B();
        b3.a = this.a;
        b3.b = this.b;
        D(b3, attributes);
        S(b3, attributes);
        W(b3, attributes);
        C(b3, attributes);
        P(b3, attributes);
        this.b.i(b3);
    }

    private void V(g.a0 a0Var, Attributes attributes) throws o2.j {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String strTrim = attributes.getValue(i2).trim();
            int i3 = a.b[g.c(attributes.getLocalName(i2)).ordinal()];
            if (i3 == 1) {
                a0Var.o = p0(strTrim);
            } else if (i3 == 2) {
                a0Var.p = p0(strTrim);
            } else if (i3 == 19) {
                a0Var.q = p0(strTrim);
            } else if (i3 == 20) {
                a0Var.r = p0(strTrim);
            }
        }
    }

    private void V0(Attributes attributes) throws o2.j {
        l("<solidColor>", new Object[0]);
        if (this.b == null) {
            throw new o2.j("Invalid document. Root element must be <svg>");
        }
        g.C c3 = new g.C();
        c3.a = this.a;
        c3.b = this.b;
        D(c3, attributes);
        S(c3, attributes);
        this.b.i(c3);
        this.b = c3;
    }

    private void W(g.InterfaceC0710n interfaceC0710n, Attributes attributes) throws o2.j {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            if (g.c(attributes.getLocalName(i2)) == g.transform) {
                interfaceC0710n.j(J0(attributes.getValue(i2)));
            }
        }
    }

    public void W0() {
        this.a = new o2.g();
    }

    private void X(g.e0 e0Var, Attributes attributes) throws o2.j {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String strTrim = attributes.getValue(i2).trim();
            int i3 = a.b[g.c(attributes.getLocalName(i2)).ordinal()];
            if (i3 == 1) {
                e0Var.q = o0(strTrim);
            } else if (i3 == 2) {
                e0Var.r = o0(strTrim);
            } else if (i3 == 3) {
                g.C0712p c0712pO0 = o0(strTrim);
                e0Var.s = c0712pO0;
                if (c0712pO0.h()) {
                    throw new o2.j("Invalid <use> element. width cannot be negative");
                }
            } else if (i3 == 4) {
                g.C0712p c0712pO02 = o0(strTrim);
                e0Var.t = c0712pO02;
                if (c0712pO02.h()) {
                    throw new o2.j("Invalid <use> element. height cannot be negative");
                }
            } else if (i3 == 6 && ("".equals(attributes.getURI(i2)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i2)))) {
                e0Var.p = strTrim;
            }
        }
    }

    public void X0(String str, String str2, String str3, Attributes attributes) throws o2.j {
        if (this.c) {
            this.d++;
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            h hVarC = h.c(str2);
            switch (a.a[hVarC.ordinal()]) {
                case 1:
                    a1(attributes);
                    break;
                case 2:
                case 3:
                    q(attributes);
                    break;
                case 4:
                    m(attributes);
                    break;
                case 5:
                    i1(attributes);
                    break;
                case R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations:
                    O0(attributes);
                    break;
                case R.styleable.LottieAnimationView_lottie_imageAssetsFolder:
                    U0(attributes);
                    break;
                case R.styleable.LottieAnimationView_lottie_loop:
                    i(attributes);
                    break;
                case R.styleable.LottieAnimationView_lottie_progress:
                    n(attributes);
                    break;
                case R.styleable.LottieAnimationView_lottie_rawRes:
                    v(attributes);
                    break;
                case R.styleable.LottieAnimationView_lottie_renderMode:
                    R0(attributes);
                    break;
                case R.styleable.LottieAnimationView_lottie_repeatCount:
                    Q0(attributes);
                    break;
                case R.styleable.LottieAnimationView_lottie_repeatMode:
                    d1(attributes);
                    break;
                case R.styleable.LottieAnimationView_lottie_scale:
                    h1(attributes);
                    break;
                case R.styleable.LottieAnimationView_lottie_speed:
                    g1(attributes);
                    break;
                case R.styleable.LottieAnimationView_lottie_url:
                    k1(attributes);
                    break;
                case 17:
                    b1(attributes);
                    break;
                case 18:
                    x(attributes);
                    break;
                case 19:
                    w(attributes);
                    break;
                case 20:
                    T0(attributes);
                    break;
                case 21:
                    Y0(attributes);
                    break;
                case 22:
                case 23:
                    this.e = true;
                    this.f = hVarC;
                    break;
                case 24:
                    k(attributes);
                    break;
                case 25:
                    f1(attributes);
                    break;
                case 26:
                    P0(attributes);
                    break;
                case 27:
                    u(attributes);
                    break;
                case 28:
                    j1(attributes);
                    break;
                case 29:
                    y(attributes);
                    break;
                case 30:
                    Z0(attributes);
                    break;
                case 31:
                    V0(attributes);
                    break;
                default:
                    this.c = true;
                    this.d = 1;
                    break;
            }
        }
    }

    private void Y(g.R r, Attributes attributes) throws o2.j {
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String strTrim = attributes.getValue(i2).trim();
            int i3 = a.b[g.c(attributes.getLocalName(i2)).ordinal()];
            if (i3 == 7) {
                w0(r, strTrim);
            } else if (i3 == 87) {
                r.p = N0(strTrim);
            }
        }
    }

    private void Y0(Attributes attributes) throws o2.j {
        l("<stop>", new Object[0]);
        g.J j2 = this.b;
        if (j2 == null) {
            throw new o2.j("Invalid document. Root element must be <svg>");
        }
        if (!(j2 instanceof g.AbstractC0706j)) {
            throw new o2.j("Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements.");
        }
        g.D d2 = new g.D();
        d2.a = this.a;
        d2.b = this.b;
        D(d2, attributes);
        S(d2, attributes);
        R(d2, attributes);
        this.b.i(d2);
        this.b = d2;
    }

    private void Z(String str) {
        this.a.a(new o2.b(b.f.screen, b.u.Document).d(str));
    }

    private void Z0(Attributes attributes) throws o2.j {
        l("<style>", new Object[0]);
        if (this.b == null) {
            throw new o2.j("Invalid document. Root element must be <svg>");
        }
        String str = "all";
        boolean zEquals = true;
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String strTrim = attributes.getValue(i2).trim();
            int i3 = a.b[g.c(attributes.getLocalName(i2)).ordinal()];
            if (i3 == 88) {
                zEquals = strTrim.equals("text/css");
            } else if (i3 == 89) {
                str = strTrim;
            }
        }
        if (zEquals && o2.b.b(str, b.f.screen)) {
            this.h = true;
        } else {
            this.c = true;
            this.d = 1;
        }
    }

    private static g.C0700c a0(String str) {
        if ("auto".equals(str) || !str.startsWith("rect(")) {
            return null;
        }
        i iVar = new i(str.substring(5));
        iVar.A();
        g.C0712p c0712pQ0 = q0(iVar);
        iVar.z();
        g.C0712p c0712pQ02 = q0(iVar);
        iVar.z();
        g.C0712p c0712pQ03 = q0(iVar);
        iVar.z();
        g.C0712p c0712pQ04 = q0(iVar);
        iVar.A();
        if (iVar.f(')') || iVar.h()) {
            return new g.C0700c(c0712pQ0, c0712pQ02, c0712pQ03, c0712pQ04);
        }
        return null;
    }

    private void a1(Attributes attributes) throws o2.j {
        l("<svg>", new Object[0]);
        g.F f2 = new g.F();
        f2.a = this.a;
        f2.b = this.b;
        D(f2, attributes);
        S(f2, attributes);
        C(f2, attributes);
        Y(f2, attributes);
        Q(f2, attributes);
        g.J j2 = this.b;
        if (j2 == null) {
            this.a.u(f2);
        } else {
            j2.i(f2);
        }
        this.b = f2;
    }

    private static g.C0703f b0(String str) throws o2.j {
        if (str.charAt(0) == '#') {
            o2.c cVarB = o2.c.b(str, 1, str.length());
            if (cVarB == null) {
                throw new o2.j("Bad hex colour value: " + str);
            }
            int iA = cVarB.a();
            if (iA == 4) {
                int iD = cVarB.d();
                int i2 = iD & 3840;
                int i3 = iD & 240;
                int i4 = iD & 15;
                return new g.C0703f(i4 | (i2 << 8) | (-16777216) | (i2 << 12) | (i3 << 8) | (i3 << 4) | (i4 << 4));
            }
            if (iA == 5) {
                int iD2 = cVarB.d();
                int i5 = 61440 & iD2;
                int i6 = iD2 & 3840;
                int i7 = iD2 & 240;
                int i10 = iD2 & 15;
                return new g.C0703f((i10 << 24) | (i10 << 28) | (i5 << 8) | (i5 << 4) | (i6 << 4) | i6 | i7 | (i7 >> 4));
            }
            if (iA == 7) {
                return new g.C0703f(cVarB.d() | (-16777216));
            }
            if (iA == 9) {
                return new g.C0703f((cVarB.d() >>> 8) | (cVarB.d() << 24));
            }
            throw new o2.j("Bad hex colour value: " + str);
        }
        String lowerCase = str.toLowerCase(Locale.US);
        boolean zStartsWith = lowerCase.startsWith("rgba(");
        if (!zStartsWith && !lowerCase.startsWith("rgb(")) {
            boolean zStartsWith2 = lowerCase.startsWith("hsla(");
            if (!zStartsWith2 && !lowerCase.startsWith("hsl(")) {
                return c0(lowerCase);
            }
            i iVar = new i(str.substring(zStartsWith2 ? 5 : 4));
            iVar.A();
            float fN = iVar.n();
            float fD = iVar.d(fN);
            if (!Float.isNaN(fD)) {
                iVar.f('%');
            }
            float fD2 = iVar.d(fD);
            if (!Float.isNaN(fD2)) {
                iVar.f('%');
            }
            if (!zStartsWith2) {
                iVar.A();
                if (!Float.isNaN(fD2) && iVar.f(')')) {
                    return new g.C0703f(s(fN, fD, fD2) | (-16777216));
                }
                throw new o2.j("Bad hsl() colour value: " + str);
            }
            float fD3 = iVar.d(fD2);
            iVar.A();
            if (!Float.isNaN(fD3) && iVar.f(')')) {
                return new g.C0703f((j(fD3 * 256.0f) << 24) | s(fN, fD, fD2));
            }
            throw new o2.j("Bad hsla() colour value: " + str);
        }
        i iVar2 = new i(str.substring(zStartsWith ? 5 : 4));
        iVar2.A();
        float fN2 = iVar2.n();
        if (!Float.isNaN(fN2) && iVar2.f('%')) {
            fN2 = (fN2 * 256.0f) / 100.0f;
        }
        float fD4 = iVar2.d(fN2);
        if (!Float.isNaN(fD4) && iVar2.f('%')) {
            fD4 = (fD4 * 256.0f) / 100.0f;
        }
        float fD5 = iVar2.d(fD4);
        if (!Float.isNaN(fD5) && iVar2.f('%')) {
            fD5 = (fD5 * 256.0f) / 100.0f;
        }
        if (!zStartsWith) {
            iVar2.A();
            if (!Float.isNaN(fD5) && iVar2.f(')')) {
                return new g.C0703f((j(fN2) << 16) | (-16777216) | (j(fD4) << 8) | j(fD5));
            }
            throw new o2.j("Bad rgb() colour value: " + str);
        }
        float fD6 = iVar2.d(fD5);
        iVar2.A();
        if (!Float.isNaN(fD6) && iVar2.f(')')) {
            return new g.C0703f((j(fD6 * 256.0f) << 24) | (j(fN2) << 16) | (j(fD4) << 8) | j(fD5));
        }
        throw new o2.j("Bad rgba() colour value: " + str);
    }

    private void b1(Attributes attributes) throws o2.j {
        l("<symbol>", new Object[0]);
        if (this.b == null) {
            throw new o2.j("Invalid document. Root element must be <svg>");
        }
        g.R t = new g.T();
        t.a = this.a;
        t.b = this.b;
        D(t, attributes);
        S(t, attributes);
        C(t, attributes);
        Y(t, attributes);
        this.b.i(t);
        this.b = t;
    }

    private static g.C0703f c0(String str) throws o2.j {
        Integer numA = c.a(str);
        if (numA != null) {
            return new g.C0703f(numA.intValue());
        }
        throw new o2.j("Invalid colour keyword: " + str);
    }

    public void c1(String str) throws o2.j {
        if (this.c) {
            return;
        }
        if (this.e) {
            if (this.g == null) {
                this.g = new StringBuilder(str.length());
            }
            this.g.append(str);
        } else if (this.h) {
            if (this.i == null) {
                this.i = new StringBuilder(str.length());
            }
            this.i.append(str);
        } else if (this.b instanceof g.Y) {
            h(str);
        }
    }

    private static g.O d0(String str) {
        str.hashCode();
        if (str.equals("none")) {
            return g.C0703f.i;
        }
        if (str.equals("currentColor")) {
            return g.C0259g.a();
        }
        try {
            return b0(str);
        } catch (o2.j unused) {
            return null;
        }
    }

    private void d1(Attributes attributes) throws o2.j {
        l("<text>", new Object[0]);
        if (this.b == null) {
            throw new o2.j("Invalid document. Root element must be <svg>");
        }
        g.W w = new g.W();
        w.a = this.a;
        w.b = this.b;
        D(w, attributes);
        S(w, attributes);
        W(w, attributes);
        C(w, attributes);
        V(w, attributes);
        this.b.i(w);
        this.b = w;
    }

    private static g.E.a e0(String str) {
        if ("nonzero".equals(str)) {
            return g.E.a.NonZero;
        }
        if ("evenodd".equals(str)) {
            return g.E.a.EvenOdd;
        }
        return null;
    }

    private void e1(char[] cArr, int i2, int i3) throws o2.j {
        if (this.c) {
            return;
        }
        if (this.e) {
            if (this.g == null) {
                this.g = new StringBuilder(i3);
            }
            this.g.append(cArr, i2, i3);
        } else if (this.h) {
            if (this.i == null) {
                this.i = new StringBuilder(i3);
            }
            this.i.append(cArr, i2, i3);
        } else if (this.b instanceof g.Y) {
            h(new String(cArr, i2, i3));
        }
    }

    private static float f0(String str) throws o2.j {
        int length = str.length();
        if (length != 0) {
            return g0(str, 0, length);
        }
        throw new o2.j("Invalid float value (empty string)");
    }

    private void f1(Attributes attributes) throws o2.j {
        l("<textPath>", new Object[0]);
        if (this.b == null) {
            throw new o2.j("Invalid document. Root element must be <svg>");
        }
        g.Z z = new g.Z();
        z.a = this.a;
        z.b = this.b;
        D(z, attributes);
        S(z, attributes);
        C(z, attributes);
        U(z, attributes);
        this.b.i(z);
        this.b = z;
        g.J j2 = z.b;
        if (j2 instanceof g.b0) {
            z.o((g.b0) j2);
        } else {
            z.o(((g.X) j2).e());
        }
    }

    private static float g0(String str, int i2, int i3) throws o2.j {
        float fB = new o2.d().b(str, i2, i3);
        if (!Float.isNaN(fB)) {
            return fB;
        }
        throw new o2.j("Invalid float value: " + str);
    }

    private void g1(Attributes attributes) throws o2.j {
        l("<tref>", new Object[0]);
        g.J j2 = this.b;
        if (j2 == null) {
            throw new o2.j("Invalid document. Root element must be <svg>");
        }
        if (!(j2 instanceof g.Y)) {
            throw new o2.j("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.");
        }
        g.U u = new g.U();
        u.a = this.a;
        u.b = this.b;
        D(u, attributes);
        S(u, attributes);
        C(u, attributes);
        T(u, attributes);
        this.b.i(u);
        g.J j3 = u.b;
        if (j3 instanceof g.b0) {
            u.o((g.b0) j3);
        } else {
            u.o(((g.X) j3).e());
        }
    }

    private void h(String str) throws o2.j {
        g.H h2 = (g.H) this.b;
        int size = h2.i.size();
        g.N n = size == 0 ? null : h2.i.get(size - 1);
        if (!(n instanceof g.c0)) {
            this.b.i(new g.c0(str));
            return;
        }
        StringBuilder sb = new StringBuilder();
        g.c0 c0Var = (g.c0) n;
        sb.append(c0Var.c);
        sb.append(str);
        c0Var.c = sb.toString();
    }

    private static void h0(g.E e2, String str) {
        String strS;
        if ("|caption|icon|menu|message-box|small-caption|status-bar|".contains('|' + str + '|')) {
            i iVar = new i(str);
            Integer numA = null;
            g.E.b bVarK0 = null;
            String str2 = null;
            while (true) {
                strS = iVar.s('/');
                iVar.A();
                if (strS != null) {
                    if (numA != null && bVarK0 != null) {
                        break;
                    }
                    if (!strS.equals("normal") && (numA != null || (numA = e.a(strS)) == null)) {
                        if (bVarK0 != null || (bVarK0 = k0(strS)) == null) {
                            if (str2 != null || !strS.equals("small-caps")) {
                                break;
                            } else {
                                str2 = strS;
                            }
                        }
                    }
                } else {
                    return;
                }
            }
            g.C0712p c0712pJ0 = j0(strS);
            if (iVar.f('/')) {
                iVar.A();
                String strR = iVar.r();
                if (strR != null) {
                    try {
                        o0(strR);
                    } catch (o2.j unused) {
                        return;
                    }
                }
                iVar.A();
            }
            e2.H = i0(iVar.y());
            e2.I = c0712pJ0;
            e2.J = Integer.valueOf(numA == null ? 400 : numA.intValue());
            if (bVarK0 == null) {
                bVarK0 = g.E.b.Normal;
            }
            e2.K = bVarK0;
            e2.d |= 122880;
        }
    }

    private void h1(Attributes attributes) throws o2.j {
        l("<tspan>", new Object[0]);
        g.J j2 = this.b;
        if (j2 == null) {
            throw new o2.j("Invalid document. Root element must be <svg>");
        }
        if (!(j2 instanceof g.Y)) {
            throw new o2.j("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.");
        }
        g.V v = new g.V();
        v.a = this.a;
        v.b = this.b;
        D(v, attributes);
        S(v, attributes);
        C(v, attributes);
        V(v, attributes);
        this.b.i(v);
        this.b = v;
        g.J j3 = v.b;
        if (j3 instanceof g.b0) {
            v.o((g.b0) j3);
        } else {
            v.o(((g.X) j3).e());
        }
    }

    private void i(Attributes attributes) throws o2.j {
        l("<circle>", new Object[0]);
        if (this.b == null) {
            throw new o2.j("Invalid document. Root element must be <svg>");
        }
        g.C0701d c0701d = new g.C0701d();
        c0701d.a = this.a;
        c0701d.b = this.b;
        D(c0701d, attributes);
        S(c0701d, attributes);
        W(c0701d, attributes);
        C(c0701d, attributes);
        A(c0701d, attributes);
        this.b.i(c0701d);
    }

    private static List<String> i0(String str) {
        i iVar = new i(str);
        ArrayList arrayList = null;
        do {
            String strQ = iVar.q();
            if (strQ == null) {
                strQ = iVar.u(',');
            }
            if (strQ == null) {
                break;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(strQ);
            iVar.z();
        } while (!iVar.h());
        return arrayList;
    }

    private void i1(Attributes attributes) throws o2.j {
        l("<use>", new Object[0]);
        if (this.b == null) {
            throw new o2.j("Invalid document. Root element must be <svg>");
        }
        g.e0 e0Var = new g.e0();
        e0Var.a = this.a;
        e0Var.b = this.b;
        D(e0Var, attributes);
        S(e0Var, attributes);
        W(e0Var, attributes);
        C(e0Var, attributes);
        X(e0Var, attributes);
        this.b.i(e0Var);
        this.b = e0Var;
    }

    private static int j(float f2) {
        if (f2 < 0.0f) {
            return 0;
        }
        if (f2 > 255.0f) {
            return 255;
        }
        return Math.round(f2);
    }

    private static g.C0712p j0(String str) {
        try {
            g.C0712p c0712pA = d.a(str);
            return c0712pA == null ? o0(str) : c0712pA;
        } catch (o2.j unused) {
            return null;
        }
    }

    private void j1(Attributes attributes) throws o2.j {
        l("<view>", new Object[0]);
        if (this.b == null) {
            throw new o2.j("Invalid document. Root element must be <svg>");
        }
        g.R f0Var = new g.f0();
        f0Var.a = this.a;
        f0Var.b = this.b;
        D(f0Var, attributes);
        C(f0Var, attributes);
        Y(f0Var, attributes);
        this.b.i(f0Var);
        this.b = f0Var;
    }

    private void k(Attributes attributes) throws o2.j {
        l("<clipPath>", new Object[0]);
        if (this.b == null) {
            throw new o2.j("Invalid document. Root element must be <svg>");
        }
        g.C0702e c0702e = new g.C0702e();
        c0702e.a = this.a;
        c0702e.b = this.b;
        D(c0702e, attributes);
        S(c0702e, attributes);
        W(c0702e, attributes);
        C(c0702e, attributes);
        B(c0702e, attributes);
        this.b.i(c0702e);
        this.b = c0702e;
    }

    private static g.E.b k0(String str) {
        str.hashCode();
        switch (str) {
            case "oblique":
                return g.E.b.Oblique;
            case "italic":
                return g.E.b.Italic;
            case "normal":
                return g.E.b.Normal;
            default:
                return null;
        }
    }

    private void k1(Attributes attributes) throws o2.j {
        l("<switch>", new Object[0]);
        if (this.b == null) {
            throw new o2.j("Invalid document. Root element must be <svg>");
        }
        g.S s = new g.S();
        s.a = this.a;
        s.b = this.b;
        D(s, attributes);
        S(s, attributes);
        W(s, attributes);
        C(s, attributes);
        this.b.i(s);
        this.b = s;
    }

    private void l(String str, Object... objArr) {
    }

    private static Integer l0(String str) {
        return e.a(str);
    }

    private void m(Attributes attributes) throws o2.j {
        l("<defs>", new Object[0]);
        if (this.b == null) {
            throw new o2.j("Invalid document. Root element must be <svg>");
        }
        g.C0704h c0704h = new g.C0704h();
        c0704h.a = this.a;
        c0704h.b = this.b;
        D(c0704h, attributes);
        S(c0704h, attributes);
        W(c0704h, attributes);
        this.b.i(c0704h);
        this.b = c0704h;
    }

    private static String m0(String str, String str2) {
        if (!str.equals("none") && str.startsWith("url(")) {
            return str.endsWith(")") ? str.substring(4, str.length() - 1).trim() : str.substring(4).trim();
        }
        return null;
    }

    private void n(Attributes attributes) throws o2.j {
        l("<ellipse>", new Object[0]);
        if (this.b == null) {
            throw new o2.j("Invalid document. Root element must be <svg>");
        }
        g.C0705i c0705i = new g.C0705i();
        c0705i.a = this.a;
        c0705i.b = this.b;
        D(c0705i, attributes);
        S(c0705i, attributes);
        W(c0705i, attributes);
        C(c0705i, attributes);
        E(c0705i, attributes);
        this.b.i(c0705i);
    }

    private Float n0(String str) throws o2.j {
        if (str.length() == 0) {
            throw new o2.j("Invalid offset value in <stop> (empty string)");
        }
        int length = str.length();
        boolean z = true;
        if (str.charAt(str.length() - 1) == '%') {
            length--;
        } else {
            z = false;
        }
        try {
            float fG0 = g0(str, 0, length);
            float f2 = 100.0f;
            if (z) {
                fG0 /= 100.0f;
            }
            if (fG0 < 0.0f) {
                f2 = 0.0f;
            } else if (fG0 <= 100.0f) {
                f2 = fG0;
            }
            return Float.valueOf(f2);
        } catch (NumberFormatException e2) {
            throw new o2.j("Invalid offset value in <stop>: " + str, e2);
        }
    }

    public void o() {
    }

    static g.C0712p o0(String str) throws o2.j {
        if (str.length() == 0) {
            throw new o2.j("Invalid length value (empty string)");
        }
        int length = str.length();
        g.d0 d0VarValueOf = g.d0.px;
        char cCharAt = str.charAt(length - 1);
        if (cCharAt == '%') {
            length--;
            d0VarValueOf = g.d0.percent;
        } else if (length > 2 && Character.isLetter(cCharAt) && Character.isLetter(str.charAt(length - 2))) {
            length -= 2;
            try {
                d0VarValueOf = g.d0.valueOf(str.substring(length).toLowerCase(Locale.US));
            } catch (IllegalArgumentException unused) {
                throw new o2.j("Invalid length unit specifier: " + str);
            }
        }
        try {
            return new g.C0712p(g0(str, 0, length), d0VarValueOf);
        } catch (NumberFormatException e2) {
            throw new o2.j("Invalid length value: " + str, e2);
        }
    }

    public void p(String str, String str2, String str3) throws o2.j {
        if (this.c) {
            int i2 = this.d - 1;
            this.d = i2;
            if (i2 == 0) {
                this.c = false;
                return;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            int i3 = a.a[h.c(str2).ordinal()];
            if (i3 != 1 && i3 != 2 && i3 != 4 && i3 != 5 && i3 != 13 && i3 != 14) {
                switch (i3) {
                    case 22:
                    case 23:
                        this.e = false;
                        StringBuilder sb = this.g;
                        if (sb != null) {
                            h hVar = this.f;
                            if (hVar == h.title) {
                                this.a.v(sb.toString());
                            } else if (hVar == h.desc) {
                                this.a.q(sb.toString());
                            }
                            this.g.setLength(0);
                            break;
                        }
                        break;
                    case 30:
                        StringBuilder sb2 = this.i;
                        if (sb2 != null) {
                            this.h = false;
                            Z(sb2.toString());
                            this.i.setLength(0);
                            break;
                        }
                        break;
                }
                return;
            }
            this.b = ((g.N) this.b).b;
        }
    }

    private static List<g.C0712p> p0(String str) throws o2.j {
        if (str.length() == 0) {
            throw new o2.j("Invalid length list (empty string)");
        }
        ArrayList arrayList = new ArrayList(1);
        i iVar = new i(str);
        iVar.A();
        while (!iVar.h()) {
            float fN = iVar.n();
            if (Float.isNaN(fN)) {
                throw new o2.j("Invalid length list value: " + iVar.b());
            }
            g.d0 d0VarV = iVar.v();
            if (d0VarV == null) {
                d0VarV = g.d0.px;
            }
            arrayList.add(new g.C0712p(fN, d0VarV));
            iVar.z();
        }
        return arrayList;
    }

    private void q(Attributes attributes) throws o2.j {
        l("<g>", new Object[0]);
        if (this.b == null) {
            throw new o2.j("Invalid document. Root element must be <svg>");
        }
        g.C0709m c0709m = new g.C0709m();
        c0709m.a = this.a;
        c0709m.b = this.b;
        D(c0709m, attributes);
        S(c0709m, attributes);
        W(c0709m, attributes);
        C(c0709m, attributes);
        this.b.i(c0709m);
        this.b = c0709m;
    }

    private static g.C0712p q0(i iVar) {
        return iVar.g("auto") ? new g.C0712p(0.0f) : iVar.p();
    }

    public void r(String str, Map<String, String> map) {
        if (str.equals("xml-stylesheet")) {
            o2.g.k();
        }
    }

    private static Float r0(String str) {
        try {
            float fF0 = f0(str);
            float f2 = 0.0f;
            if (fF0 < 0.0f) {
                fF0 = f2;
            } else {
                f2 = 1.0f;
                if (fF0 > 1.0f) {
                    fF0 = f2;
                }
            }
            return Float.valueOf(fF0);
        } catch (o2.j unused) {
            return null;
        }
    }

    private static int s(float f2, float f3, float f4) {
        float f5 = f2 % 360.0f;
        if (f2 < 0.0f) {
            f5 += 360.0f;
        }
        float f6 = f5 / 60.0f;
        float f7 = f3 / 100.0f;
        float f10 = f4 / 100.0f;
        if (f7 < 0.0f) {
            f7 = 0.0f;
        } else if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        float f11 = f10 >= 0.0f ? f10 > 1.0f ? 1.0f : f10 : 0.0f;
        float f12 = f11 <= 0.5f ? (f7 + 1.0f) * f11 : (f11 + f7) - (f7 * f11);
        float f13 = (f11 * 2.0f) - f12;
        return j(t(f13, f12, f6 - 2.0f) * 256.0f) | (j(t(f13, f12, f6 + 2.0f) * 256.0f) << 16) | (j(t(f13, f12, f6) * 256.0f) << 8);
    }

    private static Boolean s0(String str) {
        str.hashCode();
        switch (str) {
            case "hidden":
            case "scroll":
                return Boolean.FALSE;
            case "auto":
            case "visible":
                return Boolean.TRUE;
            default:
                return null;
        }
    }

    private static float t(float f2, float f3, float f4) {
        float f5;
        if (f4 < 0.0f) {
            f4 += 6.0f;
        }
        if (f4 >= 6.0f) {
            f4 -= 6.0f;
        }
        if (f4 < 1.0f) {
            f5 = (f3 - f2) * f4;
        } else {
            if (f4 < 3.0f) {
                return f3;
            }
            if (f4 >= 4.0f) {
                return f2;
            }
            f5 = (f3 - f2) * (4.0f - f4);
        }
        return f5 + f2;
    }

    private static g.O t0(String str) {
        if (!str.startsWith("url(")) {
            return d0(str);
        }
        int iIndexOf = str.indexOf(")");
        if (iIndexOf == -1) {
            return new g.C0717u(str.substring(4).trim(), null);
        }
        String strTrim = str.substring(4, iIndexOf).trim();
        String strTrim2 = str.substring(iIndexOf + 1).trim();
        return new g.C0717u(strTrim, strTrim2.length() > 0 ? d0(strTrim2) : null);
    }

    private void u(Attributes attributes) throws o2.j {
        l("<image>", new Object[0]);
        if (this.b == null) {
            throw new o2.j("Invalid document. Root element must be <svg>");
        }
        g.C0711o c0711o = new g.C0711o();
        c0711o.a = this.a;
        c0711o.b = this.b;
        D(c0711o, attributes);
        S(c0711o, attributes);
        W(c0711o, attributes);
        C(c0711o, attributes);
        G(c0711o, attributes);
        this.b.i(c0711o);
        this.b = c0711o;
    }

    private static o2.g.C0719w u0(java.lang.String r20) {
        throw new UnsupportedOperationException("Method not decompiled: o2.k.u0(java.lang.String):o2.g$w");
    }

    private void v(Attributes attributes) throws o2.j {
        l("<line>", new Object[0]);
        if (this.b == null) {
            throw new o2.j("Invalid document. Root element must be <svg>");
        }
        g.C0713q c0713q = new g.C0713q();
        c0713q.a = this.a;
        c0713q.b = this.b;
        D(c0713q, attributes);
        S(c0713q, attributes);
        W(c0713q, attributes);
        C(c0713q, attributes);
        H(c0713q, attributes);
        this.b.i(c0713q);
    }

    static o2.e v0(String str) throws o2.j {
        e.b bVar;
        i iVar = new i(str);
        iVar.A();
        String strR = iVar.r();
        if ("defer".equals(strR)) {
            iVar.A();
            strR = iVar.r();
        }
        e.a aVarA = b.a(strR);
        iVar.A();
        if (iVar.h()) {
            bVar = null;
        } else {
            String strR2 = iVar.r();
            strR2.hashCode();
            if (strR2.equals("meet")) {
                bVar = e.b.meet;
            } else {
                if (!strR2.equals("slice")) {
                    throw new o2.j("Invalid preserveAspectRatio definition: " + str);
                }
                bVar = e.b.slice;
            }
        }
        return new o2.e(aVarA, bVar);
    }

    private void w(Attributes attributes) throws o2.j {
        l("<linearGradient>", new Object[0]);
        if (this.b == null) {
            throw new o2.j("Invalid document. Root element must be <svg>");
        }
        g.M m = new g.M();
        m.a = this.a;
        m.b = this.b;
        D(m, attributes);
        S(m, attributes);
        F(m, attributes);
        I(m, attributes);
        this.b.i(m);
        this.b = m;
    }

    private static void w0(g.P p, String str) throws o2.j {
        p.o = v0(str);
    }

    private void x(Attributes attributes) throws o2.j {
        l("<marker>", new Object[0]);
        if (this.b == null) {
            throw new o2.j("Invalid document. Root element must be <svg>");
        }
        g.C0714r c0714r = new g.C0714r();
        c0714r.a = this.a;
        c0714r.b = this.b;
        D(c0714r, attributes);
        S(c0714r, attributes);
        C(c0714r, attributes);
        Y(c0714r, attributes);
        J(c0714r, attributes);
        this.b.i(c0714r);
        this.b = c0714r;
    }

    public Map<String, String> x0(i iVar) {
        HashMap map = new HashMap();
        iVar.A();
        String strS = iVar.s('=');
        while (strS != null) {
            iVar.f('=');
            map.put(strS, iVar.q());
            iVar.A();
            strS = iVar.s('=');
        }
        return map;
    }

    private void y(Attributes attributes) throws o2.j {
        l("<mask>", new Object[0]);
        if (this.b == null) {
            throw new o2.j("Invalid document. Root element must be <svg>");
        }
        g.C0715s c0715s = new g.C0715s();
        c0715s.a = this.a;
        c0715s.b = this.b;
        D(c0715s, attributes);
        S(c0715s, attributes);
        C(c0715s, attributes);
        K(c0715s, attributes);
        this.b.i(c0715s);
        this.b = c0715s;
    }

    private static g.E.e y0(String str) {
        str.hashCode();
        switch (str) {
            case "optimizeQuality":
                return g.E.e.optimizeQuality;
            case "auto":
                return g.E.e.auto;
            case "optimizeSpeed":
                return g.E.e.optimizeSpeed;
            default:
                return null;
        }
    }

    private static Set<String> z0(String str) {
        i iVar = new i(str);
        HashSet hashSet = new HashSet();
        while (!iVar.h()) {
            String strR = iVar.r();
            if (strR.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                hashSet.add(strR.substring(35));
            } else {
                hashSet.add("UNSUPPORTED");
            }
            iVar.A();
        }
        return hashSet;
    }

    o2.g z(InputStream inputStream, boolean z) throws IOException, o2.j {
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        try {
            inputStream.mark(3);
            int i2 = inputStream.read() + (inputStream.read() << 8);
            inputStream.reset();
            if (i2 == 35615) {
                inputStream = new BufferedInputStream(new GZIPInputStream(inputStream));
            }
        } catch (IOException unused) {
        }
        try {
            inputStream.mark(4096);
            L0(inputStream, z);
            return this.a;
        } finally {
            try {
                inputStream.close();
            } catch (IOException unused2) {
                Log.e("SVGParser", "Exception thrown closing input stream");
            }
        }
    }
}
