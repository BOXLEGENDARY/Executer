package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class C2247m extends AbstractC2230i2 {

    private long f16897c;

    private String f16898d;

    private AccountManager f16899e;

    private Boolean f16900f;

    private long f16901g;

    C2247m(N1 n1) {
        super(n1);
    }

    @Override
    protected final boolean j() {
        Calendar calendar = Calendar.getInstance();
        this.f16897c = TimeUnit.MINUTES.convert(calendar.get(15) + calendar.get(16), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        StringBuilder sb = new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length());
        sb.append(lowerCase);
        sb.append("-");
        sb.append(lowerCase2);
        this.f16898d = sb.toString();
        return false;
    }

    final long o() {
        h();
        return this.f16901g;
    }

    public final long p() {
        k();
        return this.f16897c;
    }

    public final String q() {
        k();
        return this.f16898d;
    }

    final void r() {
        h();
        this.f16900f = null;
        this.f16901g = 0L;
    }

    final boolean s() throws OperationCanceledException, IOException, AuthenticatorException {
        Account[] result;
        h();
        long jA = this.f16818a.c().a();
        if (jA - this.f16901g > 86400000) {
            this.f16900f = null;
        }
        Boolean bool = this.f16900f;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (androidx.core.content.a.a(this.f16818a.f(), "android.permission.GET_ACCOUNTS") != 0) {
            this.f16818a.b().y().a("Permission error checking for dasher/unicorn accounts");
            this.f16901g = jA;
            this.f16900f = Boolean.FALSE;
            return false;
        }
        if (this.f16899e == null) {
            this.f16899e = AccountManager.get(this.f16818a.f());
        }
        try {
            result = this.f16899e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, null, null).getResult();
        } catch (AuthenticatorException e7) {
            e = e7;
            this.f16818a.b().t().b("Exception checking account types", e);
            this.f16901g = jA;
            this.f16900f = Boolean.FALSE;
            return false;
        } catch (OperationCanceledException e8) {
            e = e8;
            this.f16818a.b().t().b("Exception checking account types", e);
            this.f16901g = jA;
            this.f16900f = Boolean.FALSE;
            return false;
        } catch (IOException e9) {
            e = e9;
            this.f16818a.b().t().b("Exception checking account types", e);
            this.f16901g = jA;
            this.f16900f = Boolean.FALSE;
            return false;
        }
        if (result != null && result.length > 0) {
            this.f16900f = Boolean.TRUE;
            this.f16901g = jA;
            return true;
        }
        Account[] result2 = this.f16899e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, null, null).getResult();
        if (result2 != null && result2.length > 0) {
            this.f16900f = Boolean.TRUE;
            this.f16901g = jA;
            return true;
        }
        this.f16901g = jA;
        this.f16900f = Boolean.FALSE;
        return false;
    }
}
