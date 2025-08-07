package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.Zb.JmBUOGMwkkxg;
import java.util.Iterator;

public final class i<S> extends m<S> {

    private int f17846e;

    private DateSelector<S> f17847i;

    private CalendarConstraints f17848v;

    class a extends l<S> {
        a() {
        }

        @Override
        public void a(S s7) {
            Iterator<l<S>> it = i.this.f17867d.iterator();
            while (it.hasNext()) {
                it.next().a(s7);
            }
        }
    }

    static <T> i<T> t(DateSelector<T> dateSelector, int i7, CalendarConstraints calendarConstraints) {
        i<T> iVar = new i<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i7);
        bundle.putParcelable("DATE_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        iVar.setArguments(bundle);
        return iVar;
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f17846e = bundle.getInt("THEME_RES_ID_KEY");
        this.f17847i = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f17848v = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f17847i.Z(layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f17846e)), viewGroup, bundle, this.f17848v, new a());
    }

    @Override
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f17846e);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f17847i);
        bundle.putParcelable(JmBUOGMwkkxg.oSRaALwQVWVVFN, this.f17848v);
    }
}
