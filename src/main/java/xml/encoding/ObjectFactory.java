
package xml.encoding;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the xml.encoding package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static javax.xml.namespace.QName _Array_QNAME = new javax.xml.namespace.QName("encoding.xml", "Array");
    private final static javax.xml.namespace.QName _Struct_QNAME = new javax.xml.namespace.QName("encoding.xml", "Struct");
    private final static javax.xml.namespace.QName _Duration_QNAME = new javax.xml.namespace.QName("encoding.xml", "duration");
    private final static javax.xml.namespace.QName _DateTime_QNAME = new javax.xml.namespace.QName("encoding.xml", "dateTime");
    private final static javax.xml.namespace.QName _NOTATION_QNAME = new javax.xml.namespace.QName("encoding.xml", "NOTATION");
    private final static javax.xml.namespace.QName _Time_QNAME = new javax.xml.namespace.QName("encoding.xml", "time");
    private final static javax.xml.namespace.QName _Date_QNAME = new javax.xml.namespace.QName("encoding.xml", "date");
    private final static javax.xml.namespace.QName _GYearMonth_QNAME = new javax.xml.namespace.QName("encoding.xml", "gYearMonth");
    private final static javax.xml.namespace.QName _GYear_QNAME = new javax.xml.namespace.QName("encoding.xml", "gYear");
    private final static javax.xml.namespace.QName _GMonthDay_QNAME = new javax.xml.namespace.QName("encoding.xml", "gMonthDay");
    private final static javax.xml.namespace.QName _GDay_QNAME = new javax.xml.namespace.QName("encoding.xml", "gDay");
    private final static javax.xml.namespace.QName _GMonth_QNAME = new javax.xml.namespace.QName("encoding.xml", "gMonth");
    private final static javax.xml.namespace.QName _Boolean_QNAME = new javax.xml.namespace.QName("encoding.xml", "boolean");
    private final static javax.xml.namespace.QName _Base64Binary_QNAME = new javax.xml.namespace.QName("encoding.xml", "base64Binary");
    private final static javax.xml.namespace.QName _HexBinary_QNAME = new javax.xml.namespace.QName("encoding.xml", "hexBinary");
    private final static javax.xml.namespace.QName _Float_QNAME = new javax.xml.namespace.QName("encoding.xml", "float");
    private final static javax.xml.namespace.QName _Double_QNAME = new javax.xml.namespace.QName("encoding.xml", "double");
    private final static javax.xml.namespace.QName _AnyURI_QNAME = new javax.xml.namespace.QName("encoding.xml", "anyURI");
    private final static javax.xml.namespace.QName _QName_QNAME = new javax.xml.namespace.QName("encoding.xml", "QName");
    private final static javax.xml.namespace.QName _String_QNAME = new javax.xml.namespace.QName("encoding.xml", "string");
    private final static javax.xml.namespace.QName _NormalizedString_QNAME = new javax.xml.namespace.QName("encoding.xml", "normalizedString");
    private final static javax.xml.namespace.QName _Token_QNAME = new javax.xml.namespace.QName("encoding.xml", "token");
    private final static javax.xml.namespace.QName _Language_QNAME = new javax.xml.namespace.QName("encoding.xml", "language");
    private final static javax.xml.namespace.QName _Name_QNAME = new javax.xml.namespace.QName("encoding.xml", "Name");
    private final static javax.xml.namespace.QName _NMTOKEN_QNAME = new javax.xml.namespace.QName("encoding.xml", "NMTOKEN");
    private final static javax.xml.namespace.QName _NCName_QNAME = new javax.xml.namespace.QName("encoding.xml", "NCName");
    private final static javax.xml.namespace.QName _NMTOKENS_QNAME = new javax.xml.namespace.QName("encoding.xml", "NMTOKENS");
    private final static javax.xml.namespace.QName _ID_QNAME = new javax.xml.namespace.QName("encoding.xml", "ID");
    private final static javax.xml.namespace.QName _IDREF_QNAME = new javax.xml.namespace.QName("encoding.xml", "IDREF");
    private final static javax.xml.namespace.QName _ENTITY_QNAME = new javax.xml.namespace.QName("encoding.xml", "ENTITY");
    private final static javax.xml.namespace.QName _IDREFS_QNAME = new javax.xml.namespace.QName("encoding.xml", "IDREFS");
    private final static javax.xml.namespace.QName _ENTITIES_QNAME = new javax.xml.namespace.QName("encoding.xml", "ENTITIES");
    private final static javax.xml.namespace.QName _Decimal_QNAME = new javax.xml.namespace.QName("encoding.xml", "decimal");
    private final static javax.xml.namespace.QName _Integer_QNAME = new javax.xml.namespace.QName("encoding.xml", "integer");
    private final static javax.xml.namespace.QName _NonPositiveInteger_QNAME = new javax.xml.namespace.QName("encoding.xml", "nonPositiveInteger");
    private final static javax.xml.namespace.QName _NegativeInteger_QNAME = new javax.xml.namespace.QName("encoding.xml", "negativeInteger");
    private final static javax.xml.namespace.QName _Long_QNAME = new javax.xml.namespace.QName("encoding.xml", "long");
    private final static javax.xml.namespace.QName _Int_QNAME = new javax.xml.namespace.QName("encoding.xml", "int");
    private final static javax.xml.namespace.QName _Short_QNAME = new javax.xml.namespace.QName("encoding.xml", "short");
    private final static javax.xml.namespace.QName _Byte_QNAME = new javax.xml.namespace.QName("encoding.xml", "byte");
    private final static javax.xml.namespace.QName _NonNegativeInteger_QNAME = new javax.xml.namespace.QName("encoding.xml", "nonNegativeInteger");
    private final static javax.xml.namespace.QName _UnsignedLong_QNAME = new javax.xml.namespace.QName("encoding.xml", "unsignedLong");
    private final static javax.xml.namespace.QName _UnsignedInt_QNAME = new javax.xml.namespace.QName("encoding.xml", "unsignedInt");
    private final static javax.xml.namespace.QName _UnsignedShort_QNAME = new javax.xml.namespace.QName("encoding.xml", "unsignedShort");
    private final static javax.xml.namespace.QName _UnsignedByte_QNAME = new javax.xml.namespace.QName("encoding.xml", "unsignedByte");
    private final static javax.xml.namespace.QName _PositiveInteger_QNAME = new javax.xml.namespace.QName("encoding.xml", "positiveInteger");
    private final static javax.xml.namespace.QName _AnyType_QNAME = new javax.xml.namespace.QName("encoding.xml", "anyType");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: xml.encoding
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Array }
     * 
     */
    public Array createArray() {
        return new Array();
    }

    /**
     * Create an instance of {@link Struct }
     * 
     */
    public Struct createStruct() {
        return new Struct();
    }

    /**
     * Create an instance of {@link Duration }
     * 
     */
    public Duration createDuration() {
        return new Duration();
    }

    /**
     * Create an instance of {@link DateTime }
     * 
     */
    public DateTime createDateTime() {
        return new DateTime();
    }

    /**
     * Create an instance of {@link NOTATION }
     * 
     */
    public NOTATION createNOTATION() {
        return new NOTATION();
    }

    /**
     * Create an instance of {@link Time }
     * 
     */
    public Time createTime() {
        return new Time();
    }

    /**
     * Create an instance of {@link Date }
     * 
     */
    public Date createDate() {
        return new Date();
    }

    /**
     * Create an instance of {@link GYearMonth }
     * 
     */
    public GYearMonth createGYearMonth() {
        return new GYearMonth();
    }

    /**
     * Create an instance of {@link GYear }
     * 
     */
    public GYear createGYear() {
        return new GYear();
    }

    /**
     * Create an instance of {@link GMonthDay }
     * 
     */
    public GMonthDay createGMonthDay() {
        return new GMonthDay();
    }

    /**
     * Create an instance of {@link GDay }
     * 
     */
    public GDay createGDay() {
        return new GDay();
    }

    /**
     * Create an instance of {@link GMonth }
     * 
     */
    public GMonth createGMonth() {
        return new GMonth();
    }

    /**
     * Create an instance of {@link Boolean }
     * 
     */
    public Boolean createBoolean() {
        return new Boolean();
    }

    /**
     * Create an instance of {@link Base64Binary }
     * 
     */
    public Base64Binary createBase64Binary() {
        return new Base64Binary();
    }

    /**
     * Create an instance of {@link HexBinary }
     * 
     */
    public HexBinary createHexBinary() {
        return new HexBinary();
    }

    /**
     * Create an instance of {@link Float }
     * 
     */
    public Float createFloat() {
        return new Float();
    }

    /**
     * Create an instance of {@link Double }
     * 
     */
    public Double createDouble() {
        return new Double();
    }

    /**
     * Create an instance of {@link AnyURI }
     * 
     */
    public AnyURI createAnyURI() {
        return new AnyURI();
    }

    /**
     * Create an instance of {@link xml.encoding.QName }
     * 
     */
    public xml.encoding.QName createQName() {
        return new xml.encoding.QName();
    }

    /**
     * Create an instance of {@link String }
     * 
     */
    public String createString() {
        return new String();
    }

    /**
     * Create an instance of {@link NormalizedString }
     * 
     */
    public NormalizedString createNormalizedString() {
        return new NormalizedString();
    }

    /**
     * Create an instance of {@link Token }
     * 
     */
    public Token createToken() {
        return new Token();
    }

    /**
     * Create an instance of {@link Language }
     * 
     */
    public Language createLanguage() {
        return new Language();
    }

    /**
     * Create an instance of {@link Name }
     * 
     */
    public Name createName() {
        return new Name();
    }

    /**
     * Create an instance of {@link NMTOKEN }
     * 
     */
    public NMTOKEN createNMTOKEN() {
        return new NMTOKEN();
    }

    /**
     * Create an instance of {@link NCName }
     * 
     */
    public NCName createNCName() {
        return new NCName();
    }

    /**
     * Create an instance of {@link NMTOKENS }
     * 
     */
    public NMTOKENS createNMTOKENS() {
        return new NMTOKENS();
    }

    /**
     * Create an instance of {@link ID }
     * 
     */
    public ID createID() {
        return new ID();
    }

    /**
     * Create an instance of {@link IDREF }
     * 
     */
    public IDREF createIDREF() {
        return new IDREF();
    }

    /**
     * Create an instance of {@link ENTITY }
     * 
     */
    public ENTITY createENTITY() {
        return new ENTITY();
    }

    /**
     * Create an instance of {@link IDREFS }
     * 
     */
    public IDREFS createIDREFS() {
        return new IDREFS();
    }

    /**
     * Create an instance of {@link ENTITIES }
     * 
     */
    public ENTITIES createENTITIES() {
        return new ENTITIES();
    }

    /**
     * Create an instance of {@link Decimal }
     * 
     */
    public Decimal createDecimal() {
        return new Decimal();
    }

    /**
     * Create an instance of {@link Integer }
     * 
     */
    public Integer createInteger() {
        return new Integer();
    }

    /**
     * Create an instance of {@link NonPositiveInteger }
     * 
     */
    public NonPositiveInteger createNonPositiveInteger() {
        return new NonPositiveInteger();
    }

    /**
     * Create an instance of {@link NegativeInteger }
     * 
     */
    public NegativeInteger createNegativeInteger() {
        return new NegativeInteger();
    }

    /**
     * Create an instance of {@link Long }
     * 
     */
    public Long createLong() {
        return new Long();
    }

    /**
     * Create an instance of {@link Int }
     * 
     */
    public Int createInt() {
        return new Int();
    }

    /**
     * Create an instance of {@link Short }
     * 
     */
    public Short createShort() {
        return new Short();
    }

    /**
     * Create an instance of {@link Byte }
     * 
     */
    public Byte createByte() {
        return new Byte();
    }

    /**
     * Create an instance of {@link NonNegativeInteger }
     * 
     */
    public NonNegativeInteger createNonNegativeInteger() {
        return new NonNegativeInteger();
    }

    /**
     * Create an instance of {@link UnsignedLong }
     * 
     */
    public UnsignedLong createUnsignedLong() {
        return new UnsignedLong();
    }

    /**
     * Create an instance of {@link UnsignedInt }
     * 
     */
    public UnsignedInt createUnsignedInt() {
        return new UnsignedInt();
    }

    /**
     * Create an instance of {@link UnsignedShort }
     * 
     */
    public UnsignedShort createUnsignedShort() {
        return new UnsignedShort();
    }

    /**
     * Create an instance of {@link UnsignedByte }
     * 
     */
    public UnsignedByte createUnsignedByte() {
        return new UnsignedByte();
    }

    /**
     * Create an instance of {@link PositiveInteger }
     * 
     */
    public PositiveInteger createPositiveInteger() {
        return new PositiveInteger();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Array }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "encoding.xml", name = "Array")
    public JAXBElement<Array> createArray(Array value) {
        return new JAXBElement<Array>(_Array_QNAME, Array.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Struct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "encoding.xml", name = "Struct")
    public JAXBElement<Struct> createStruct(Struct value) {
        return new JAXBElement<Struct>(_Struct_QNAME, Struct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "encoding.xml", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "encoding.xml", name = "dateTime")
    public JAXBElement<DateTime> createDateTime(DateTime value) {
        return new JAXBElement<DateTime>(_DateTime_QNAME, DateTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NOTATION }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "encoding.xml", name = "NOTATION")
    public JAXBElement<NOTATION> createNOTATION(NOTATION value) {
        return new JAXBElement<NOTATION>(_NOTATION_QNAME, NOTATION.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Time }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "encoding.xml", name = "time")
    public JAXBElement<Time> createTime(Time value) {
        return new JAXBElement<Time>(_Time_QNAME, Time.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Date }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "encoding.xml", name = "date")
    public JAXBElement<Date> createDate(Date value) {
        return new JAXBElement<Date>(_Date_QNAME, Date.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GYearMonth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "encoding.xml", name = "gYearMonth")
    public JAXBElement<GYearMonth> createGYearMonth(GYearMonth value) {
        return new JAXBElement<GYearMonth>(_GYearMonth_QNAME, GYearMonth.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GYear }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "encoding.xml", name = "gYear")
    public JAXBElement<GYear> createGYear(GYear value) {
        return new JAXBElement<GYear>(_GYear_QNAME, GYear.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GMonthDay }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "encoding.xml", name = "gMonthDay")
    public JAXBElement<GMonthDay> createGMonthDay(GMonthDay value) {
        return new JAXBElement<GMonthDay>(_GMonthDay_QNAME, GMonthDay.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GDay }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "encoding.xml", name = "gDay")
    public JAXBElement<GDay> createGDay(GDay value) {
        return new JAXBElement<GDay>(_GDay_QNAME, GDay.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GMonth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "encoding.xml", name = "gMonth")
    public JAXBElement<GMonth> createGMonth(GMonth value) {
        return new JAXBElement<GMonth>(_GMonth_QNAME, GMonth.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "encoding.xml", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Base64Binary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "encoding.xml", name = "base64Binary")
    public JAXBElement<Base64Binary> createBase64Binary(Base64Binary value) {
        return new JAXBElement<Base64Binary>(_Base64Binary_QNAME, Base64Binary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HexBinary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "encoding.xml", name = "hexBinary")
    public JAXBElement<HexBinary> createHexBinary(HexBinary value) {
        return new JAXBElement<HexBinary>(_HexBinary_QNAME, HexBinary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "encoding.xml", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "encoding.xml", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnyURI }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "encoding.xml", name = "anyURI")
    public JAXBElement<AnyURI> createAnyURI(AnyURI value) {
        return new JAXBElement<AnyURI>(_AnyURI_QNAME, AnyURI.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link xml.encoding.QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "encoding.xml", name = "QName")
    public JAXBElement<xml.encoding.QName> createQName(xml.encoding.QName value) {
        return new JAXBElement<xml.encoding.QName>(_QName_QNAME, xml.encoding.QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "encoding.xml", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NormalizedString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "encoding.xml", name = "normalizedString")
    public JAXBElement<NormalizedString> createNormalizedString(NormalizedString value) {
        return new JAXBElement<NormalizedString>(_NormalizedString_QNAME, NormalizedString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Token }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "encoding.xml", name = "token")
    public JAXBElement<Token> createToken(Token value) {
        return new JAXBElement<Token>(_Token_QNAME, Token.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Language }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "encoding.xml", name = "language")
    public JAXBElement<Language> createLanguage(Language value) {
        return new JAXBElement<Language>(_Language_QNAME, Language.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Name }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "encoding.xml", name = "Name")
    public JAXBElement<Name> createName(Name value) {
        return new JAXBElement<Name>(_Name_QNAME, Name.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NMTOKEN }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "encoding.xml", name = "NMTOKEN")
    public JAXBElement<NMTOKEN> createNMTOKEN(NMTOKEN value) {
        return new JAXBElement<NMTOKEN>(_NMTOKEN_QNAME, NMTOKEN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NCName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "encoding.xml", name = "NCName")
    public JAXBElement<NCName> createNCName(NCName value) {
        return new JAXBElement<NCName>(_NCName_QNAME, NCName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NMTOKENS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "encoding.xml", name = "NMTOKENS")
    public JAXBElement<NMTOKENS> createNMTOKENS(NMTOKENS value) {
        return new JAXBElement<NMTOKENS>(_NMTOKENS_QNAME, NMTOKENS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "encoding.xml", name = "ID")
    public JAXBElement<ID> createID(ID value) {
        return new JAXBElement<ID>(_ID_QNAME, ID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDREF }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "encoding.xml", name = "IDREF")
    public JAXBElement<IDREF> createIDREF(IDREF value) {
        return new JAXBElement<IDREF>(_IDREF_QNAME, IDREF.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ENTITY }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "encoding.xml", name = "ENTITY")
    public JAXBElement<ENTITY> createENTITY(ENTITY value) {
        return new JAXBElement<ENTITY>(_ENTITY_QNAME, ENTITY.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDREFS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "encoding.xml", name = "IDREFS")
    public JAXBElement<IDREFS> createIDREFS(IDREFS value) {
        return new JAXBElement<IDREFS>(_IDREFS_QNAME, IDREFS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ENTITIES }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "encoding.xml", name = "ENTITIES")
    public JAXBElement<ENTITIES> createENTITIES(ENTITIES value) {
        return new JAXBElement<ENTITIES>(_ENTITIES_QNAME, ENTITIES.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Decimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "encoding.xml", name = "decimal")
    public JAXBElement<Decimal> createDecimal(Decimal value) {
        return new JAXBElement<Decimal>(_Decimal_QNAME, Decimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "encoding.xml", name = "integer")
    public JAXBElement<Integer> createInteger(Integer value) {
        return new JAXBElement<Integer>(_Integer_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NonPositiveInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "encoding.xml", name = "nonPositiveInteger")
    public JAXBElement<NonPositiveInteger> createNonPositiveInteger(NonPositiveInteger value) {
        return new JAXBElement<NonPositiveInteger>(_NonPositiveInteger_QNAME, NonPositiveInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NegativeInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "encoding.xml", name = "negativeInteger")
    public JAXBElement<NegativeInteger> createNegativeInteger(NegativeInteger value) {
        return new JAXBElement<NegativeInteger>(_NegativeInteger_QNAME, NegativeInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "encoding.xml", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Int }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "encoding.xml", name = "int")
    public JAXBElement<Int> createInt(Int value) {
        return new JAXBElement<Int>(_Int_QNAME, Int.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "encoding.xml", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "encoding.xml", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NonNegativeInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "encoding.xml", name = "nonNegativeInteger")
    public JAXBElement<NonNegativeInteger> createNonNegativeInteger(NonNegativeInteger value) {
        return new JAXBElement<NonNegativeInteger>(_NonNegativeInteger_QNAME, NonNegativeInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnsignedLong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "encoding.xml", name = "unsignedLong")
    public JAXBElement<UnsignedLong> createUnsignedLong(UnsignedLong value) {
        return new JAXBElement<UnsignedLong>(_UnsignedLong_QNAME, UnsignedLong.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnsignedInt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "encoding.xml", name = "unsignedInt")
    public JAXBElement<UnsignedInt> createUnsignedInt(UnsignedInt value) {
        return new JAXBElement<UnsignedInt>(_UnsignedInt_QNAME, UnsignedInt.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnsignedShort }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "encoding.xml", name = "unsignedShort")
    public JAXBElement<UnsignedShort> createUnsignedShort(UnsignedShort value) {
        return new JAXBElement<UnsignedShort>(_UnsignedShort_QNAME, UnsignedShort.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnsignedByte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "encoding.xml", name = "unsignedByte")
    public JAXBElement<UnsignedByte> createUnsignedByte(UnsignedByte value) {
        return new JAXBElement<UnsignedByte>(_UnsignedByte_QNAME, UnsignedByte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PositiveInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "encoding.xml", name = "positiveInteger")
    public JAXBElement<PositiveInteger> createPositiveInteger(PositiveInteger value) {
        return new JAXBElement<PositiveInteger>(_PositiveInteger_QNAME, PositiveInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "encoding.xml", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

}
