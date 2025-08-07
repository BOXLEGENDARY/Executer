package com.appsflyer.internal;

import android.media.AudioTrack;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class AFg1iSDK {
    private StringBuilder getMediationNetwork = new StringBuilder();
    private final List<AFa1zSDK> getMonetizationNetwork = new ArrayList();
    private final String getCurrencyIso4217Code = null;

    enum AFa1zSDK {
        EMPTY_ARRAY,
        NONEMPTY_ARRAY,
        EMPTY_OBJECT,
        DANGLING_KEY,
        NONEMPTY_OBJECT,
        NULL
    }

    private void getCurrencyIso4217Code() throws AFg1jSDK {
        if (this.getMonetizationNetwork.isEmpty()) {
            return;
        }
        AFa1zSDK mediationNetwork = getMediationNetwork();
        if (mediationNetwork == AFa1zSDK.EMPTY_ARRAY) {
            AFa1zSDK aFa1zSDK = AFa1zSDK.NONEMPTY_ARRAY;
            this.getMonetizationNetwork.set(r1.size() - 1, aFa1zSDK);
        } else {
            if (mediationNetwork == AFa1zSDK.NONEMPTY_ARRAY) {
                this.getMediationNetwork.append(',');
                return;
            }
            if (mediationNetwork != AFa1zSDK.DANGLING_KEY) {
                if (mediationNetwork != AFa1zSDK.NULL) {
                    throw new AFg1jSDK("Nesting problem");
                }
            } else {
                this.getMediationNetwork.append(":");
                AFa1zSDK aFa1zSDK2 = AFa1zSDK.NONEMPTY_OBJECT;
                this.getMonetizationNetwork.set(r1.size() - 1, aFa1zSDK2);
            }
        }
    }

    public final AFg1iSDK getMediationNetwork(AFa1zSDK aFa1zSDK, String str) throws AFg1jSDK {
        if (this.getMonetizationNetwork.isEmpty() && this.getMediationNetwork.length() > 0) {
            throw new AFg1jSDK("Nesting problem: multiple top-level roots");
        }
        getCurrencyIso4217Code();
        this.getMonetizationNetwork.add(aFa1zSDK);
        this.getMediationNetwork.append(str);
        return this;
    }

    public final AFg1iSDK getMonetizationNetwork(Object obj) throws Throwable {
        if (this.getMonetizationNetwork.isEmpty()) {
            throw new AFg1jSDK("Nesting problem");
        }
        if (!((Class) AFa1gSDK.getMonetizationNetwork(37 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 324 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getJumpTapTimeout() >> 16))).isInstance(obj)) {
            if (obj instanceof AFg1lSDK) {
                ((AFg1lSDK) obj).getMonetizationNetwork(this);
                return this;
            }
            getCurrencyIso4217Code();
            if (obj == null || (obj instanceof Boolean) || obj == AFg1lSDK.getCurrencyIso4217Code) {
                this.getMediationNetwork.append(obj);
            } else if (obj instanceof Number) {
                this.getMediationNetwork.append(AFg1lSDK.getRevenue((Number) obj));
            } else {
                getRevenue(obj.toString());
            }
            return this;
        }
        try {
            Object[] objArr = {this};
            Map map = AFa1gSDK.f13584e;
            Object declaredMethod = map.get(2007674121);
            if (declaredMethod == null) {
                declaredMethod = ((Class) AFa1gSDK.getMonetizationNetwork(36 - ((byte) KeyEvent.getModifierMetaStateMask()), 323 - (KeyEvent.getMaxKeyCode() >> 16), (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())))).getDeclaredMethod("AFAdRevenueData", AFg1iSDK.class);
                map.put(2007674121, declaredMethod);
            }
            ((Method) declaredMethod).invoke(obj, objArr);
            return this;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    final void getRevenue(String str) {
        this.getMediationNetwork.append("\"");
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            char cCharAt = str.charAt(i7);
            if (cCharAt == '\f') {
                this.getMediationNetwork.append("\\f");
            } else if (cCharAt == '\r') {
                this.getMediationNetwork.append("\\r");
            } else if (cCharAt != '\"' && cCharAt != '/' && cCharAt != '\\') {
                switch (cCharAt) {
                    case '\b':
                        this.getMediationNetwork.append("\\b");
                        break;
                    case '\t':
                        this.getMediationNetwork.append("\\t");
                        break;
                    case '\n':
                        this.getMediationNetwork.append("\\n");
                        break;
                    default:
                        if (cCharAt <= 31) {
                            this.getMediationNetwork.append(String.format("\\u%04x", Integer.valueOf(cCharAt)));
                            break;
                        } else {
                            this.getMediationNetwork.append(cCharAt);
                            break;
                        }
                }
            } else {
                StringBuilder sb = this.getMediationNetwork;
                sb.append('\\');
                sb.append(cCharAt);
            }
        }
        this.getMediationNetwork.append("\"");
    }

    public final String toString() {
        if (this.getMediationNetwork.length() == 0) {
            return null;
        }
        return this.getMediationNetwork.toString();
    }

    public final AFg1iSDK getMediationNetwork(AFa1zSDK aFa1zSDK, AFa1zSDK aFa1zSDK2, String str) throws AFg1jSDK {
        AFa1zSDK mediationNetwork = getMediationNetwork();
        if (mediationNetwork != aFa1zSDK2 && mediationNetwork != aFa1zSDK) {
            throw new AFg1jSDK("Nesting problem");
        }
        this.getMonetizationNetwork.remove(r2.size() - 1);
        this.getMediationNetwork.append(str);
        return this;
    }

    private AFa1zSDK getMediationNetwork() throws AFg1jSDK {
        if (!this.getMonetizationNetwork.isEmpty()) {
            return this.getMonetizationNetwork.get(r0.size() - 1);
        }
        throw new AFg1jSDK("Nesting problem");
    }

    final void getRevenue() throws AFg1jSDK {
        AFa1zSDK mediationNetwork = getMediationNetwork();
        if (mediationNetwork == AFa1zSDK.NONEMPTY_OBJECT) {
            this.getMediationNetwork.append(',');
        } else if (mediationNetwork != AFa1zSDK.EMPTY_OBJECT) {
            throw new AFg1jSDK("Nesting problem");
        }
        AFa1zSDK aFa1zSDK = AFa1zSDK.DANGLING_KEY;
        this.getMonetizationNetwork.set(r1.size() - 1, aFa1zSDK);
    }
}
