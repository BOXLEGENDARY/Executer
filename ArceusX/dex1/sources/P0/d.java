package p0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

public final class d {

    private final Shader f22630a;

    private final ColorStateList f22631b;

    private int f22632c;

    private d(Shader shader, ColorStateList colorStateList, int i7) {
        this.f22630a = shader;
        this.f22631b = colorStateList;
        this.f22632c = i7;
    }

    private static d a(Resources resources, int i7, Resources.Theme theme) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int next;
        XmlResourceParser xml = resources.getXml(i7);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.hashCode();
        if (name.equals("gradient")) {
            return d(f.b(resources, xml, attributeSetAsAttributeSet, theme));
        }
        if (name.equals("selector")) {
            return c(c.b(resources, xml, attributeSetAsAttributeSet, theme));
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
    }

    static d b(int i7) {
        return new d(null, null, i7);
    }

    static d c(ColorStateList colorStateList) {
        return new d(null, colorStateList, colorStateList.getDefaultColor());
    }

    static d d(Shader shader) {
        return new d(shader, null, 0);
    }

    public static d g(Resources resources, int i7, Resources.Theme theme) {
        try {
            return a(resources, i7, theme);
        } catch (Exception e7) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e7);
            return null;
        }
    }

    public int e() {
        return this.f22632c;
    }

    public Shader f() {
        return this.f22630a;
    }

    public boolean h() {
        return this.f22630a != null;
    }

    public boolean i() {
        ColorStateList colorStateList;
        return this.f22630a == null && (colorStateList = this.f22631b) != null && colorStateList.isStateful();
    }

    public boolean j(int[] iArr) {
        if (i()) {
            ColorStateList colorStateList = this.f22631b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f22632c) {
                this.f22632c = colorForState;
                return true;
            }
        }
        return false;
    }

    public void k(int i7) {
        this.f22632c = i7;
    }

    public boolean l() {
        return h() || this.f22632c != 0;
    }
}
