package androidx.appcompat.widget;

import android.content.Context;
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
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import org.xmlpull.v1.XmlPullParserException;

public class VectorEnabledTintResources extends w {
    public static final int MAX_SDK_WHERE_REQUIRED = 20;
    private static boolean sCompatVectorFromResourcesEnabled;
    private final WeakReference<Context> mContextRef;

    public VectorEnabledTintResources(Context context, Resources resources) {
        super(resources);
        this.mContextRef = new WeakReference<>(context);
    }

    public static boolean isCompatVectorFromResourcesEnabled() {
        return sCompatVectorFromResourcesEnabled;
    }

    public static void setCompatVectorFromResourcesEnabled(boolean z7) {
        sCompatVectorFromResourcesEnabled = z7;
    }

    public static boolean shouldBeUsed() {
        isCompatVectorFromResourcesEnabled();
        return false;
    }

    @Override
    public XmlResourceParser getAnimation(int i7) throws Resources.NotFoundException {
        return super.getAnimation(i7);
    }

    @Override
    public boolean getBoolean(int i7) throws Resources.NotFoundException {
        return super.getBoolean(i7);
    }

    @Override
    public int getColor(int i7) throws Resources.NotFoundException {
        return super.getColor(i7);
    }

    @Override
    public ColorStateList getColorStateList(int i7) throws Resources.NotFoundException {
        return super.getColorStateList(i7);
    }

    @Override
    public Configuration getConfiguration() {
        return super.getConfiguration();
    }

    @Override
    public float getDimension(int i7) throws Resources.NotFoundException {
        return super.getDimension(i7);
    }

    @Override
    public int getDimensionPixelOffset(int i7) throws Resources.NotFoundException {
        return super.getDimensionPixelOffset(i7);
    }

    @Override
    public int getDimensionPixelSize(int i7) throws Resources.NotFoundException {
        return super.getDimensionPixelSize(i7);
    }

    @Override
    public DisplayMetrics getDisplayMetrics() {
        return super.getDisplayMetrics();
    }

    @Override
    public Drawable getDrawable(int i7, Resources.Theme theme) throws Resources.NotFoundException {
        return super.getDrawable(i7, theme);
    }

    @Override
    public Drawable getDrawableForDensity(int i7, int i8) throws Resources.NotFoundException {
        return super.getDrawableForDensity(i7, i8);
    }

    @Override
    public float getFraction(int i7, int i8, int i9) {
        return super.getFraction(i7, i8, i9);
    }

    @Override
    public int getIdentifier(String str, String str2, String str3) {
        return super.getIdentifier(str, str2, str3);
    }

    @Override
    public int[] getIntArray(int i7) throws Resources.NotFoundException {
        return super.getIntArray(i7);
    }

    @Override
    public int getInteger(int i7) throws Resources.NotFoundException {
        return super.getInteger(i7);
    }

    @Override
    public XmlResourceParser getLayout(int i7) throws Resources.NotFoundException {
        return super.getLayout(i7);
    }

    @Override
    public Movie getMovie(int i7) throws Resources.NotFoundException {
        return super.getMovie(i7);
    }

    @Override
    public String getQuantityString(int i7, int i8) throws Resources.NotFoundException {
        return super.getQuantityString(i7, i8);
    }

    @Override
    public CharSequence getQuantityText(int i7, int i8) throws Resources.NotFoundException {
        return super.getQuantityText(i7, i8);
    }

    @Override
    public String getResourceEntryName(int i7) throws Resources.NotFoundException {
        return super.getResourceEntryName(i7);
    }

    @Override
    public String getResourceName(int i7) throws Resources.NotFoundException {
        return super.getResourceName(i7);
    }

    @Override
    public String getResourcePackageName(int i7) throws Resources.NotFoundException {
        return super.getResourcePackageName(i7);
    }

    @Override
    public String getResourceTypeName(int i7) throws Resources.NotFoundException {
        return super.getResourceTypeName(i7);
    }

    @Override
    public String getString(int i7) throws Resources.NotFoundException {
        return super.getString(i7);
    }

    @Override
    public String[] getStringArray(int i7) throws Resources.NotFoundException {
        return super.getStringArray(i7);
    }

    @Override
    public CharSequence getText(int i7) throws Resources.NotFoundException {
        return super.getText(i7);
    }

    @Override
    public CharSequence[] getTextArray(int i7) throws Resources.NotFoundException {
        return super.getTextArray(i7);
    }

    @Override
    public void getValue(int i7, TypedValue typedValue, boolean z7) throws Resources.NotFoundException {
        super.getValue(i7, typedValue, z7);
    }

    @Override
    public void getValueForDensity(int i7, int i8, TypedValue typedValue, boolean z7) throws Resources.NotFoundException {
        super.getValueForDensity(i7, i8, typedValue, z7);
    }

    @Override
    public XmlResourceParser getXml(int i7) throws Resources.NotFoundException {
        return super.getXml(i7);
    }

    @Override
    public TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return super.obtainAttributes(attributeSet, iArr);
    }

    @Override
    public TypedArray obtainTypedArray(int i7) throws Resources.NotFoundException {
        return super.obtainTypedArray(i7);
    }

    @Override
    public InputStream openRawResource(int i7) throws Resources.NotFoundException {
        return super.openRawResource(i7);
    }

    @Override
    public AssetFileDescriptor openRawResourceFd(int i7) throws Resources.NotFoundException {
        return super.openRawResourceFd(i7);
    }

    @Override
    public void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) throws XmlPullParserException {
        super.parseBundleExtra(str, attributeSet, bundle);
    }

    @Override
    public void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) throws XmlPullParserException, IOException {
        super.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override
    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
    }

    @Override
    public Drawable getDrawable(int i7) throws Resources.NotFoundException {
        Context context = this.mContextRef.get();
        return context != null ? ResourceManagerInternal.get().onDrawableLoadedFromResources(context, this, i7) : getDrawableCanonical(i7);
    }

    @Override
    public Drawable getDrawableForDensity(int i7, int i8, Resources.Theme theme) {
        return super.getDrawableForDensity(i7, i8, theme);
    }

    @Override
    public String getQuantityString(int i7, int i8, Object[] objArr) throws Resources.NotFoundException {
        return super.getQuantityString(i7, i8, objArr);
    }

    @Override
    public String getString(int i7, Object[] objArr) throws Resources.NotFoundException {
        return super.getString(i7, objArr);
    }

    @Override
    public CharSequence getText(int i7, CharSequence charSequence) {
        return super.getText(i7, charSequence);
    }

    @Override
    public void getValue(String str, TypedValue typedValue, boolean z7) throws Resources.NotFoundException {
        super.getValue(str, typedValue, z7);
    }

    @Override
    public InputStream openRawResource(int i7, TypedValue typedValue) throws Resources.NotFoundException {
        return super.openRawResource(i7, typedValue);
    }
}
