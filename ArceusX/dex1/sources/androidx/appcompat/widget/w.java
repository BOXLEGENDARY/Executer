package androidx.appcompat.widget;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import j.C2489a;
import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParserException;

class w extends Resources {
    private final Resources mResources;

    public w(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.mResources = resources;
    }

    @Override
    public XmlResourceParser getAnimation(int i7) throws Resources.NotFoundException {
        return this.mResources.getAnimation(i7);
    }

    @Override
    public boolean getBoolean(int i7) throws Resources.NotFoundException {
        return this.mResources.getBoolean(i7);
    }

    @Override
    public int getColor(int i7) throws Resources.NotFoundException {
        return this.mResources.getColor(i7);
    }

    @Override
    public ColorStateList getColorStateList(int i7) throws Resources.NotFoundException {
        return this.mResources.getColorStateList(i7);
    }

    @Override
    public Configuration getConfiguration() {
        return this.mResources.getConfiguration();
    }

    @Override
    public float getDimension(int i7) throws Resources.NotFoundException {
        return this.mResources.getDimension(i7);
    }

    @Override
    public int getDimensionPixelOffset(int i7) throws Resources.NotFoundException {
        return this.mResources.getDimensionPixelOffset(i7);
    }

    @Override
    public int getDimensionPixelSize(int i7) throws Resources.NotFoundException {
        return this.mResources.getDimensionPixelSize(i7);
    }

    @Override
    public DisplayMetrics getDisplayMetrics() {
        return this.mResources.getDisplayMetrics();
    }

    @Override
    public Drawable getDrawable(int i7) throws Resources.NotFoundException {
        return this.mResources.getDrawable(i7);
    }

    final Drawable getDrawableCanonical(int i7) throws Resources.NotFoundException {
        return super.getDrawable(i7);
    }

    @Override
    public Drawable getDrawableForDensity(int i7, int i8) throws Resources.NotFoundException {
        return p0.h.f(this.mResources, i7, i8, null);
    }

    @Override
    public float getFraction(int i7, int i8, int i9) {
        return this.mResources.getFraction(i7, i8, i9);
    }

    @Override
    public int getIdentifier(String str, String str2, String str3) {
        return this.mResources.getIdentifier(str, str2, str3);
    }

    @Override
    public int[] getIntArray(int i7) throws Resources.NotFoundException {
        return this.mResources.getIntArray(i7);
    }

    @Override
    public int getInteger(int i7) throws Resources.NotFoundException {
        return this.mResources.getInteger(i7);
    }

    @Override
    public XmlResourceParser getLayout(int i7) throws Resources.NotFoundException {
        return this.mResources.getLayout(i7);
    }

    @Override
    public Movie getMovie(int i7) throws Resources.NotFoundException {
        return this.mResources.getMovie(i7);
    }

    @Override
    public String getQuantityString(int i7, int i8, Object... objArr) throws Resources.NotFoundException {
        return this.mResources.getQuantityString(i7, i8, objArr);
    }

    @Override
    public CharSequence getQuantityText(int i7, int i8) throws Resources.NotFoundException {
        return this.mResources.getQuantityText(i7, i8);
    }

    @Override
    public String getResourceEntryName(int i7) throws Resources.NotFoundException {
        return this.mResources.getResourceEntryName(i7);
    }

    @Override
    public String getResourceName(int i7) throws Resources.NotFoundException {
        return this.mResources.getResourceName(i7);
    }

    @Override
    public String getResourcePackageName(int i7) throws Resources.NotFoundException {
        return this.mResources.getResourcePackageName(i7);
    }

    @Override
    public String getResourceTypeName(int i7) throws Resources.NotFoundException {
        return this.mResources.getResourceTypeName(i7);
    }

    @Override
    public String getString(int i7) throws Resources.NotFoundException {
        return this.mResources.getString(i7);
    }

    @Override
    public String[] getStringArray(int i7) throws Resources.NotFoundException {
        return this.mResources.getStringArray(i7);
    }

    @Override
    public CharSequence getText(int i7) throws Resources.NotFoundException {
        return this.mResources.getText(i7);
    }

    @Override
    public CharSequence[] getTextArray(int i7) throws Resources.NotFoundException {
        return this.mResources.getTextArray(i7);
    }

    @Override
    public void getValue(int i7, TypedValue typedValue, boolean z7) throws Resources.NotFoundException {
        this.mResources.getValue(i7, typedValue, z7);
    }

    @Override
    public void getValueForDensity(int i7, int i8, TypedValue typedValue, boolean z7) throws Resources.NotFoundException {
        C2489a.a(this.mResources, i7, i8, typedValue, z7);
    }

    @Override
    public XmlResourceParser getXml(int i7) throws Resources.NotFoundException {
        return this.mResources.getXml(i7);
    }

    @Override
    public TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return this.mResources.obtainAttributes(attributeSet, iArr);
    }

    @Override
    public TypedArray obtainTypedArray(int i7) throws Resources.NotFoundException {
        return this.mResources.obtainTypedArray(i7);
    }

    @Override
    public InputStream openRawResource(int i7) throws Resources.NotFoundException {
        return this.mResources.openRawResource(i7);
    }

    @Override
    public AssetFileDescriptor openRawResourceFd(int i7) throws Resources.NotFoundException {
        return this.mResources.openRawResourceFd(i7);
    }

    @Override
    public void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) throws XmlPullParserException {
        this.mResources.parseBundleExtra(str, attributeSet, bundle);
    }

    @Override
    public void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) throws XmlPullParserException, IOException {
        this.mResources.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override
    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        Resources resources = this.mResources;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }

    @Override
    public Drawable getDrawable(int i7, Resources.Theme theme) throws Resources.NotFoundException {
        return p0.h.e(this.mResources, i7, theme);
    }

    @Override
    public Drawable getDrawableForDensity(int i7, int i8, Resources.Theme theme) {
        return p0.h.f(this.mResources, i7, i8, theme);
    }

    @Override
    public String getQuantityString(int i7, int i8) throws Resources.NotFoundException {
        return this.mResources.getQuantityString(i7, i8);
    }

    @Override
    public String getString(int i7, Object... objArr) throws Resources.NotFoundException {
        return this.mResources.getString(i7, objArr);
    }

    @Override
    public CharSequence getText(int i7, CharSequence charSequence) {
        return this.mResources.getText(i7, charSequence);
    }

    @Override
    public void getValue(String str, TypedValue typedValue, boolean z7) throws Resources.NotFoundException {
        this.mResources.getValue(str, typedValue, z7);
    }

    @Override
    public InputStream openRawResource(int i7, TypedValue typedValue) throws Resources.NotFoundException {
        return this.mResources.openRawResource(i7, typedValue);
    }
}
