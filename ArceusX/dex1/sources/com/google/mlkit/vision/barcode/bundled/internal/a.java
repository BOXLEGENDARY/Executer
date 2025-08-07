package com.google.mlkit.vision.barcode.bundled.internal;

import P3.b;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.media.Image;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzak;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zze;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzf;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzg;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzh;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzi;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzj;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzk;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzl;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzm;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzn;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzo;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzp;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzq;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzs;
import com.google.android.libraries.barhopper.Barcode;
import com.google.android.libraries.barhopper.BarhopperV2;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import n3.C2651i;
import v5.C2949d;
import y3.BinderC3024b;
import y3.InterfaceC3023a;

final class a extends b {

    private final RecognitionOptions f19239d;

    private BarhopperV2 f19240e;

    a(Context context, zzs zzsVar) {
        RecognitionOptions recognitionOptions = new RecognitionOptions();
        this.f19239d = recognitionOptions;
        recognitionOptions.a(zzsVar.l());
    }

    private static zzf O0(Barcode.CalendarDateTime calendarDateTime) {
        if (calendarDateTime == null) {
            return null;
        }
        return new zzf(calendarDateTime.year, calendarDateTime.month, calendarDateTime.day, calendarDateTime.hours, calendarDateTime.minutes, calendarDateTime.seconds, calendarDateTime.isUtc, calendarDateTime.rawValue);
    }

    private final Barcode[] V0(ByteBuffer byteBuffer, zzak zzakVar) {
        BarhopperV2 barhopperV2 = (BarhopperV2) C2651i.l(this.f19240e);
        if (((ByteBuffer) C2651i.l(byteBuffer)).isDirect()) {
            return barhopperV2.e(zzakVar.p(), zzakVar.l(), byteBuffer, this.f19239d);
        }
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            return barhopperV2.f(zzakVar.p(), zzakVar.l(), byteBuffer.array(), this.f19239d);
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return barhopperV2.f(zzakVar.p(), zzakVar.l(), bArr, this.f19239d);
    }

    @Override
    public final List<zzq> V1(InterfaceC3023a interfaceC3023a, zzak zzakVar) {
        Barcode[] barcodeArrJ;
        Barcode[] barcodeArr;
        Matrix matrix;
        int i7;
        zzh zzhVar;
        ArrayList arrayList;
        int i8;
        zzi zziVar;
        zzm[] zzmVarArr;
        zzj[] zzjVarArr;
        zze[] zzeVarArr;
        int iN = zzakVar.n();
        int i9 = 0;
        if (iN == -1) {
            barcodeArrJ = ((BarhopperV2) C2651i.l(this.f19240e)).j((Bitmap) BinderC3024b.V0(interfaceC3023a), this.f19239d);
        } else if (iN == 17) {
            barcodeArrJ = V0((ByteBuffer) BinderC3024b.V0(interfaceC3023a), zzakVar);
        } else if (iN != 35) {
            if (iN != 842094169) {
                int iN2 = zzakVar.n();
                StringBuilder sb = new StringBuilder(37);
                sb.append("Unsupported image format: ");
                sb.append(iN2);
                throw new IllegalArgumentException(sb.toString());
            }
            barcodeArrJ = V0((ByteBuffer) BinderC3024b.V0(interfaceC3023a), zzakVar);
        } else {
            barcodeArrJ = V0(((Image) C2651i.l((Image) BinderC3024b.V0(interfaceC3023a))).getPlanes()[0].getBuffer(), zzakVar);
        }
        ArrayList arrayList2 = new ArrayList();
        Matrix matrixE = C2949d.b().e(zzakVar.p(), zzakVar.l(), zzakVar.o());
        int length = barcodeArrJ.length;
        int i10 = 0;
        while (i10 < length) {
            Barcode barcode = barcodeArrJ[i10];
            if (barcode.cornerPoints != null && matrixE != null) {
                float[] fArr = new float[8];
                int i11 = i9;
                while (true) {
                    Point[] pointArr = barcode.cornerPoints;
                    if (i11 >= pointArr.length) {
                        break;
                    }
                    int i12 = i11 + i11;
                    Point point = pointArr[i11];
                    fArr[i12] = point.x;
                    fArr[i12 + 1] = point.y;
                    i11++;
                }
                matrixE.mapPoints(fArr);
                int iO = zzakVar.o();
                int i13 = i9;
                while (true) {
                    Point[] pointArr2 = barcode.cornerPoints;
                    int length2 = pointArr2.length;
                    if (i13 >= length2) {
                        break;
                    }
                    Point point2 = pointArr2[(i13 + iO) % length2];
                    int i14 = i13 + i13;
                    point2.x = (int) fArr[i14];
                    point2.y = (int) fArr[i14 + 1];
                    i13++;
                }
            }
            Barcode.Email email = barcode.email;
            zzj zzjVar = email != null ? new zzj(email.type, email.address, email.subject, email.body) : null;
            Barcode.Phone phone = barcode.phone;
            zzm zzmVar = phone != null ? new zzm(phone.type, phone.number) : null;
            Barcode.Sms sms = barcode.sms;
            zzn zznVar = sms != null ? new zzn(sms.message, sms.phoneNumber) : null;
            Barcode.WiFi wiFi = barcode.wifi;
            zzp zzpVar = wiFi != null ? new zzp(wiFi.ssid, wiFi.password, wiFi.encryptionType) : null;
            Barcode.UrlBookmark urlBookmark = barcode.url;
            zzo zzoVar = urlBookmark != null ? new zzo(urlBookmark.title, urlBookmark.url) : null;
            Barcode.GeoPoint geoPoint = barcode.geoPoint;
            zzk zzkVar = geoPoint != null ? new zzk(geoPoint.lat, geoPoint.lng) : null;
            Barcode.CalendarEvent calendarEvent = barcode.calendarEvent;
            zzg zzgVar = calendarEvent != null ? new zzg(calendarEvent.summary, calendarEvent.description, calendarEvent.location, calendarEvent.organizer, calendarEvent.status, O0(calendarEvent.start), O0(calendarEvent.end)) : null;
            Barcode.ContactInfo contactInfo = barcode.contactInfo;
            if (contactInfo != null) {
                Barcode.PersonName personName = contactInfo.name;
                zzl zzlVar = personName != null ? new zzl(personName.formattedName, personName.pronunciation, personName.prefix, personName.first, personName.middle, personName.last, personName.suffix) : null;
                String str = contactInfo.organization;
                String str2 = contactInfo.title;
                Barcode.Phone[] phoneArr = contactInfo.phones;
                if (phoneArr == null) {
                    zzmVarArr = null;
                } else {
                    zzm[] zzmVarArr2 = new zzm[phoneArr.length];
                    int i15 = 0;
                    while (i15 < phoneArr.length) {
                        Barcode.Phone phone2 = phoneArr[i15];
                        zzmVarArr2[i15] = new zzm(phone2.type, phone2.number);
                        i15++;
                        phoneArr = phoneArr;
                    }
                    zzmVarArr = zzmVarArr2;
                }
                Barcode.Email[] emailArr = contactInfo.emails;
                if (emailArr == null) {
                    barcodeArr = barcodeArrJ;
                    matrix = matrixE;
                    i7 = length;
                    zzjVarArr = null;
                } else {
                    zzj[] zzjVarArr2 = new zzj[emailArr.length];
                    int i16 = 0;
                    while (i16 < emailArr.length) {
                        Barcode[] barcodeArr2 = barcodeArrJ;
                        Barcode.Email email2 = emailArr[i16];
                        zzjVarArr2[i16] = new zzj(email2.type, email2.address, email2.subject, email2.body);
                        i16++;
                        emailArr = emailArr;
                        barcodeArrJ = barcodeArr2;
                        matrixE = matrixE;
                        length = length;
                    }
                    barcodeArr = barcodeArrJ;
                    matrix = matrixE;
                    i7 = length;
                    zzjVarArr = zzjVarArr2;
                }
                String[] strArr = contactInfo.urls;
                Barcode.Address[] addressArr = contactInfo.addresses;
                if (addressArr == null) {
                    zzeVarArr = null;
                } else {
                    zze[] zzeVarArr2 = new zze[addressArr.length];
                    for (int i17 = 0; i17 < addressArr.length; i17++) {
                        Barcode.Address address = addressArr[i17];
                        zzeVarArr2[i17] = new zze(address.type, address.addressLines);
                    }
                    zzeVarArr = zzeVarArr2;
                }
                zzhVar = new zzh(zzlVar, str, str2, zzmVarArr, zzjVarArr, strArr, zzeVarArr);
            } else {
                barcodeArr = barcodeArrJ;
                matrix = matrixE;
                i7 = length;
                zzhVar = null;
            }
            Barcode.DriverLicense driverLicense = barcode.driverLicense;
            if (driverLicense != null) {
                i8 = i10;
                arrayList = arrayList2;
                zziVar = new zzi(driverLicense.documentType, driverLicense.firstName, driverLicense.middleName, driverLicense.lastName, driverLicense.gender, driverLicense.addressStreet, driverLicense.addressCity, driverLicense.addressState, driverLicense.addressZip, driverLicense.licenseNumber, driverLicense.issueDate, driverLicense.expiryDate, driverLicense.birthDate, driverLicense.issuingCountry);
            } else {
                arrayList = arrayList2;
                i8 = i10;
                zziVar = null;
            }
            ArrayList arrayList3 = arrayList;
            arrayList3.add(new zzq(barcode.format, barcode.displayValue, barcode.rawValue, barcode.rawBytes, barcode.cornerPoints, barcode.valueFormat, zzjVar, zzmVar, zznVar, zzpVar, zzoVar, zzkVar, zzgVar, zzhVar, zziVar));
            i10 = i8 + 1;
            arrayList2 = arrayList3;
            barcodeArrJ = barcodeArr;
            matrixE = matrix;
            length = i7;
            i9 = 0;
        }
        return arrayList2;
    }

    @Override
    public final void a() {
        if (this.f19240e != null) {
            return;
        }
        BarhopperV2 barhopperV2 = new BarhopperV2();
        this.f19240e = barhopperV2;
        barhopperV2.b();
    }

    @Override
    public final void d() {
        BarhopperV2 barhopperV2 = this.f19240e;
        if (barhopperV2 != null) {
            barhopperV2.close();
            this.f19240e = null;
        }
    }
}
