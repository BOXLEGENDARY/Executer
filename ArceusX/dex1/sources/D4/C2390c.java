package d4;

import android.animation.TypeEvaluator;

public class C2390c implements TypeEvaluator<Integer> {

    private static final C2390c f20317a = new C2390c();

    public static C2390c b() {
        return f20317a;
    }

    @Override
    public Integer evaluate(float f7, Integer num, Integer num2) {
        int iIntValue = num.intValue();
        float f8 = ((iIntValue >> 24) & 255) / 255.0f;
        int iIntValue2 = num2.intValue();
        float fPow = (float) Math.pow(((iIntValue >> 16) & 255) / 255.0f, 2.2d);
        float fPow2 = (float) Math.pow(((iIntValue >> 8) & 255) / 255.0f, 2.2d);
        float fPow3 = (float) Math.pow((iIntValue & 255) / 255.0f, 2.2d);
        float fPow4 = (float) Math.pow(((iIntValue2 >> 16) & 255) / 255.0f, 2.2d);
        float f9 = f8 + (((((iIntValue2 >> 24) & 255) / 255.0f) - f8) * f7);
        float fPow5 = fPow2 + ((((float) Math.pow(((iIntValue2 >> 8) & 255) / 255.0f, 2.2d)) - fPow2) * f7);
        float fPow6 = fPow3 + (f7 * (((float) Math.pow((iIntValue2 & 255) / 255.0f, 2.2d)) - fPow3));
        return Integer.valueOf((Math.round(((float) Math.pow(fPow + ((fPow4 - fPow) * f7), 0.45454545454545453d)) * 255.0f) << 16) | (Math.round(f9 * 255.0f) << 24) | (Math.round(((float) Math.pow(fPow5, 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow(fPow6, 0.45454545454545453d)) * 255.0f));
    }
}
