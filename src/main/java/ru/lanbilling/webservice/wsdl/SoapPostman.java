
package ru.lanbilling.webservice.wsdl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for soapPostman complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="soapPostman"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="recordid" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/&gt;
 *         &lt;element name="fio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="streets" type="{urn:api3}soapIdName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="buildings" type="{urn:api3}soapIdName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="agrms" type="{urn:api3}soapIdName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "soapPostman", propOrder = {
    "recordid",
    "fio",
    "streets",
    "buildings",
    "agrms"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
public class SoapPostman {

    @XmlElement(required = true)
    @XmlSchemaType(name = "unsignedLong")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    protected BigInteger recordid;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    protected String fio;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    protected List<SoapIdName> streets;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    protected List<SoapIdName> buildings;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    protected List<SoapIdName> agrms;

    /**
     * Gets the value of the recordid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public BigInteger getRecordid() {
        return recordid;
    }

    /**
     * Sets the value of the recordid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public void setRecordid(BigInteger value) {
        this.recordid = value;
    }

    /**
     * Gets the value of the fio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public String getFio() {
        return fio;
    }

    /**
     * Sets the value of the fio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public void setFio(String value) {
        this.fio = value;
    }

    /**
     * Gets the value of the streets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the streets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStreets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SoapIdName }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public List<SoapIdName> getStreets() {
        if (streets == null) {
            streets = new ArrayList<SoapIdName>();
        }
        return this.streets;
    }

    /**
     * Gets the value of the buildings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the buildings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuildings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SoapIdName }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public List<SoapIdName> getBuildings() {
        if (buildings == null) {
            buildings = new ArrayList<SoapIdName>();
        }
        return this.buildings;
    }

    /**
     * Gets the value of the agrms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agrms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgrms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SoapIdName }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public List<SoapIdName> getAgrms() {
        if (agrms == null) {
            agrms = new ArrayList<SoapIdName>();
        }
        return this.agrms;
    }

}
