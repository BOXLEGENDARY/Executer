package com.google.android.libraries.barhopper;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;

public class Barcode implements Parcelable {
    public static final Parcelable.Creator<Barcode> CREATOR = new a();
    public BoardingPass boardingPass;
    public CalendarEvent calendarEvent;
    public double confidenceScore;
    public ContactInfo contactInfo;
    public Point[] cornerPoints;
    public String displayValue;
    public DriverLicense driverLicense;
    public Email email;
    public int format;
    public GeoPoint geoPoint;
    public boolean isRecognized;
    public Phone phone;
    public byte[] rawBytes;
    public String rawValue;
    public Sms sms;
    public UrlBookmark url;
    public int valueFormat;
    public WiFi wifi;

    public static class Address implements Parcelable {
        public static final Parcelable.Creator<Address> CREATOR = new com.google.android.libraries.barhopper.a();
        public String[] addressLines;
        public int type;

        public Address() {
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeInt(this.type);
            parcel.writeStringArray(this.addressLines);
        }

        private Address(Parcel parcel) {
            this.type = parcel.readInt();
            this.addressLines = parcel.createStringArray();
        }

        Address(Parcel parcel, a aVar) {
            this(parcel);
        }
    }

    public static class BoardingPass implements Parcelable {
        public static final Parcelable.Creator<BoardingPass> CREATOR = new b();
        public FlightSegment[] flightSegment;
        public String passengerName;

        public BoardingPass() {
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeString(this.passengerName);
            parcel.writeTypedArray(this.flightSegment, 0);
        }

        private BoardingPass(Parcel parcel) {
            this.passengerName = parcel.readString();
            this.flightSegment = (FlightSegment[]) parcel.createTypedArray(FlightSegment.CREATOR);
        }

        BoardingPass(Parcel parcel, a aVar) {
            this(parcel);
        }
    }

    public static class CalendarDateTime implements Parcelable {
        public static final Parcelable.Creator<CalendarDateTime> CREATOR = new c();
        public int day;
        public int hours;
        public boolean isUtc;
        public int minutes;
        public int month;
        public String rawValue;
        public int seconds;
        public int year;

        public CalendarDateTime() {
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeInt(this.year);
            parcel.writeInt(this.month);
            parcel.writeInt(this.day);
            parcel.writeInt(this.hours);
            parcel.writeInt(this.minutes);
            parcel.writeInt(this.seconds);
            parcel.writeByte(this.isUtc ? (byte) 1 : (byte) 0);
            parcel.writeString(this.rawValue);
        }

        private CalendarDateTime(Parcel parcel) {
            this.year = parcel.readInt();
            this.month = parcel.readInt();
            this.day = parcel.readInt();
            this.hours = parcel.readInt();
            this.minutes = parcel.readInt();
            this.seconds = parcel.readInt();
            this.isUtc = parcel.readByte() != 0;
            this.rawValue = parcel.readString();
        }

        CalendarDateTime(Parcel parcel, a aVar) {
            this(parcel);
        }
    }

    public static class CalendarEvent implements Parcelable {
        public static final Parcelable.Creator<CalendarEvent> CREATOR = new d();
        public String description;
        public CalendarDateTime end;
        public String location;
        public String organizer;
        public CalendarDateTime start;
        public String status;
        public String summary;

        public CalendarEvent() {
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeString(this.summary);
            parcel.writeString(this.description);
            parcel.writeString(this.location);
            parcel.writeString(this.organizer);
            parcel.writeString(this.status);
            parcel.writeParcelable(this.start, 0);
            parcel.writeParcelable(this.end, 0);
        }

        private CalendarEvent(Parcel parcel) {
            this.summary = parcel.readString();
            this.description = parcel.readString();
            this.location = parcel.readString();
            this.organizer = parcel.readString();
            this.status = parcel.readString();
            this.start = (CalendarDateTime) parcel.readParcelable(CalendarDateTime.class.getClassLoader());
            this.end = (CalendarDateTime) parcel.readParcelable(CalendarDateTime.class.getClassLoader());
        }

        CalendarEvent(Parcel parcel, a aVar) {
            this(parcel);
        }
    }

    public static class ContactInfo implements Parcelable {
        public static final Parcelable.Creator<ContactInfo> CREATOR = new e();
        public Address[] addresses;
        public Email[] emails;
        public PersonName name;
        public String note;
        public String organization;
        public Phone[] phones;
        public String title;
        public String[] urls;

        public ContactInfo() {
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeParcelable(this.name, 0);
            parcel.writeString(this.organization);
            parcel.writeString(this.title);
            parcel.writeTypedArray(this.phones, 0);
            parcel.writeTypedArray(this.emails, 0);
            parcel.writeStringArray(this.urls);
            parcel.writeTypedArray(this.addresses, 0);
            parcel.writeString(this.note);
        }

        private ContactInfo(Parcel parcel) {
            this.name = (PersonName) parcel.readParcelable(PersonName.class.getClassLoader());
            this.organization = parcel.readString();
            this.title = parcel.readString();
            this.phones = (Phone[]) parcel.createTypedArray(Phone.CREATOR);
            this.emails = (Email[]) parcel.createTypedArray(Email.CREATOR);
            this.urls = parcel.createStringArray();
            this.addresses = (Address[]) parcel.createTypedArray(Address.CREATOR);
            this.note = parcel.readString();
        }

        ContactInfo(Parcel parcel, a aVar) {
            this(parcel);
        }
    }

    public static class DriverLicense implements Parcelable {
        public static final Parcelable.Creator<DriverLicense> CREATOR = new f();
        public String addressCity;
        public String addressState;
        public String addressStreet;
        public String addressZip;
        public String birthDate;
        public String documentType;
        public String expiryDate;
        public String firstName;
        public String gender;
        public String issueDate;
        public String issuingCountry;
        public String lastName;
        public String licenseNumber;
        public String middleName;

        public DriverLicense() {
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeString(this.documentType);
            parcel.writeString(this.firstName);
            parcel.writeString(this.middleName);
            parcel.writeString(this.lastName);
            parcel.writeString(this.gender);
            parcel.writeString(this.addressStreet);
            parcel.writeString(this.addressCity);
            parcel.writeString(this.addressState);
            parcel.writeString(this.addressZip);
            parcel.writeString(this.licenseNumber);
            parcel.writeString(this.issueDate);
            parcel.writeString(this.expiryDate);
            parcel.writeString(this.birthDate);
            parcel.writeString(this.issuingCountry);
        }

        private DriverLicense(Parcel parcel) {
            this.documentType = parcel.readString();
            this.firstName = parcel.readString();
            this.middleName = parcel.readString();
            this.lastName = parcel.readString();
            this.gender = parcel.readString();
            this.addressStreet = parcel.readString();
            this.addressCity = parcel.readString();
            this.addressState = parcel.readString();
            this.addressZip = parcel.readString();
            this.licenseNumber = parcel.readString();
            this.issueDate = parcel.readString();
            this.expiryDate = parcel.readString();
            this.birthDate = parcel.readString();
            this.issuingCountry = parcel.readString();
        }

        DriverLicense(Parcel parcel, a aVar) {
            this(parcel);
        }
    }

    public static class Email implements Parcelable {
        public static final Parcelable.Creator<Email> CREATOR = new g();
        public String address;
        public String body;
        public String subject;
        public int type;

        public Email() {
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeInt(this.type);
            parcel.writeString(this.address);
            parcel.writeString(this.subject);
            parcel.writeString(this.body);
        }

        private Email(Parcel parcel) {
            this.type = parcel.readInt();
            this.address = parcel.readString();
            this.subject = parcel.readString();
            this.body = parcel.readString();
        }

        Email(Parcel parcel, a aVar) {
            this(parcel);
        }
    }

    public static class FlightSegment implements Parcelable {
        public static final Parcelable.Creator<FlightSegment> CREATOR = new h();
        public String carrier;
        public String compartmentCode;
        public String dateOfFlightJulian;
        public String destination;
        public String flightNumber;
        public String origin;
        public String pnrCode;
        public String seatNumber;
        public String selecteeIndicator;

        public FlightSegment() {
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeString(this.pnrCode);
            parcel.writeString(this.origin);
            parcel.writeString(this.destination);
            parcel.writeString(this.carrier);
            parcel.writeString(this.flightNumber);
            parcel.writeString(this.dateOfFlightJulian);
            parcel.writeString(this.compartmentCode);
            parcel.writeString(this.seatNumber);
            parcel.writeString(this.selecteeIndicator);
        }

        private FlightSegment(Parcel parcel) {
            this.pnrCode = parcel.readString();
            this.origin = parcel.readString();
            this.destination = parcel.readString();
            this.carrier = parcel.readString();
            this.flightNumber = parcel.readString();
            this.dateOfFlightJulian = parcel.readString();
            this.compartmentCode = parcel.readString();
            this.seatNumber = parcel.readString();
            this.selecteeIndicator = parcel.readString();
        }

        FlightSegment(Parcel parcel, a aVar) {
            this(parcel);
        }
    }

    public static class GeoPoint implements Parcelable {
        public static final Parcelable.Creator<GeoPoint> CREATOR = new i();
        public double lat;
        public double lng;

        public GeoPoint() {
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeDouble(this.lat);
            parcel.writeDouble(this.lng);
        }

        private GeoPoint(Parcel parcel) {
            this.lat = parcel.readDouble();
            this.lng = parcel.readDouble();
        }

        GeoPoint(Parcel parcel, a aVar) {
            this(parcel);
        }
    }

    public static class PersonName implements Parcelable {
        public static final Parcelable.Creator<PersonName> CREATOR = new j();
        public String first;
        public String formattedName;
        public String last;
        public String middle;
        public String prefix;
        public String pronunciation;
        public String suffix;

        public PersonName() {
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeString(this.formattedName);
            parcel.writeString(this.pronunciation);
            parcel.writeString(this.prefix);
            parcel.writeString(this.first);
            parcel.writeString(this.middle);
            parcel.writeString(this.last);
            parcel.writeString(this.suffix);
        }

        private PersonName(Parcel parcel) {
            this.formattedName = parcel.readString();
            this.pronunciation = parcel.readString();
            this.prefix = parcel.readString();
            this.first = parcel.readString();
            this.middle = parcel.readString();
            this.last = parcel.readString();
            this.suffix = parcel.readString();
        }

        PersonName(Parcel parcel, a aVar) {
            this(parcel);
        }
    }

    public static class Phone implements Parcelable {
        public static final Parcelable.Creator<Phone> CREATOR = new k();
        public String number;
        public int type;

        public Phone() {
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeInt(this.type);
            parcel.writeString(this.number);
        }

        private Phone(Parcel parcel) {
            this.type = parcel.readInt();
            this.number = parcel.readString();
        }

        Phone(Parcel parcel, a aVar) {
            this(parcel);
        }
    }

    public static class Sms implements Parcelable {
        public static final Parcelable.Creator<Sms> CREATOR = new l();
        public String message;
        public String phoneNumber;

        public Sms() {
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeString(this.message);
            parcel.writeString(this.phoneNumber);
        }

        private Sms(Parcel parcel) {
            this.message = parcel.readString();
            this.phoneNumber = parcel.readString();
        }

        Sms(Parcel parcel, a aVar) {
            this(parcel);
        }
    }

    public static class UrlBookmark implements Parcelable {
        public static final Parcelable.Creator<UrlBookmark> CREATOR = new m();
        public String title;
        public String url;

        public UrlBookmark() {
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeString(this.title);
            parcel.writeString(this.url);
        }

        private UrlBookmark(Parcel parcel) {
            this.title = parcel.readString();
            this.url = parcel.readString();
        }

        UrlBookmark(Parcel parcel, a aVar) {
            this(parcel);
        }
    }

    public static class WiFi implements Parcelable {
        public static final Parcelable.Creator<WiFi> CREATOR = new n();
        public int encryptionType;
        public boolean isHidden;
        public String password;
        public String ssid;

        public WiFi() {
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeString(this.ssid);
            parcel.writeString(this.password);
            parcel.writeInt(this.encryptionType);
            parcel.writeByte(this.isHidden ? (byte) 1 : (byte) 0);
        }

        private WiFi(Parcel parcel) {
            this.ssid = parcel.readString();
            this.password = parcel.readString();
            this.encryptionType = parcel.readInt();
            this.isHidden = parcel.readByte() != 0;
        }

        WiFi(Parcel parcel, a aVar) {
            this(parcel);
        }
    }

    class a implements Parcelable.Creator<Barcode> {
        a() {
        }

        @Override
        public final Barcode createFromParcel(Parcel parcel) {
            return new Barcode(parcel, null);
        }

        @Override
        public final Barcode[] newArray(int i7) {
            return new Barcode[i7];
        }
    }

    public Barcode() {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.format);
        parcel.writeString(this.rawValue);
        parcel.writeString(this.displayValue);
        parcel.writeInt(this.valueFormat);
        parcel.writeTypedArray(this.cornerPoints, 0);
        parcel.writeParcelable(this.email, 0);
        parcel.writeParcelable(this.phone, 0);
        parcel.writeParcelable(this.sms, 0);
        parcel.writeParcelable(this.wifi, 0);
        parcel.writeParcelable(this.url, 0);
        parcel.writeParcelable(this.geoPoint, 0);
        parcel.writeParcelable(this.calendarEvent, 0);
        parcel.writeParcelable(this.contactInfo, 0);
        parcel.writeParcelable(this.driverLicense, 0);
        parcel.writeParcelable(this.boardingPass, 0);
    }

    private Barcode(Parcel parcel) {
        this.format = parcel.readInt();
        this.rawValue = parcel.readString();
        this.displayValue = parcel.readString();
        this.valueFormat = parcel.readInt();
        this.cornerPoints = (Point[]) parcel.createTypedArray(Point.CREATOR);
        this.email = (Email) parcel.readParcelable(Email.class.getClassLoader());
        this.phone = (Phone) parcel.readParcelable(Phone.class.getClassLoader());
        this.sms = (Sms) parcel.readParcelable(Sms.class.getClassLoader());
        this.wifi = (WiFi) parcel.readParcelable(WiFi.class.getClassLoader());
        this.url = (UrlBookmark) parcel.readParcelable(UrlBookmark.class.getClassLoader());
        this.geoPoint = (GeoPoint) parcel.readParcelable(GeoPoint.class.getClassLoader());
        this.calendarEvent = (CalendarEvent) parcel.readParcelable(CalendarEvent.class.getClassLoader());
        this.contactInfo = (ContactInfo) parcel.readParcelable(ContactInfo.class.getClassLoader());
        this.driverLicense = (DriverLicense) parcel.readParcelable(DriverLicense.class.getClassLoader());
        this.boardingPass = (BoardingPass) parcel.readParcelable(BoardingPass.class.getClassLoader());
    }

    Barcode(Parcel parcel, a aVar) {
        this(parcel);
    }
}
