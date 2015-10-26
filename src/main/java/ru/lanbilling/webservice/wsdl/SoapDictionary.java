
package ru.lanbilling.webservice.wsdl;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for soapDictionary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="soapDictionary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="recordid" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="nasid" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="radiustype" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="vendor" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="valuetype" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="replaceid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="tagged" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="tohistory" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "soapDictionary", propOrder = {
    "recordid",
    "nasid",
    "radiustype",
    "vendor",
    "valuetype",
    "replaceid",
    "tagged",
    "tohistory",
    "name"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
public class SoapDictionary {

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    protected long recordid;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    protected long nasid;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    protected long radiustype;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    protected long vendor;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    protected long valuetype;
    @XmlElement(defaultValue = "0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    protected Long replaceid;
    @XmlElement(defaultValue = "0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    protected Long tagged;
    @XmlElement(defaultValue = "0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    protected Long tohistory;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    protected String name;

    /**
     * Gets the value of the recordid property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public long getRecordid() {
        return recordid;
    }

    /**
     * Sets the value of the recordid property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public void setRecordid(long value) {
        this.recordid = value;
    }

    /**
     * Gets the value of the nasid property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public long getNasid() {
        return nasid;
    }

    /**
     * Sets the value of the nasid property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public void setNasid(long value) {
        this.nasid = value;
    }

    /**
     * Gets the value of the radiustype property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public long getRadiustype() {
        return radiustype;
    }

    /**
     * Sets the value of the radiustype property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public void setRadiustype(long value) {
        this.radiustype = value;
    }

    /**
     * Gets the value of the vendor property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public long getVendor() {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public void setVendor(long value) {
        this.vendor = value;
    }

    /**
     * Gets the value of the valuetype property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public long getValuetype() {
        return valuetype;
    }

    /**
     * Sets the value of the valuetype property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public void setValuetype(long value) {
        this.valuetype = value;
    }

    /**
     * Gets the value of the replaceid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public Long getReplaceid() {
        return replaceid;
    }

    /**
     * Sets the value of the replaceid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public void setReplaceid(Long value) {
        this.replaceid = value;
    }

    /**
     * Gets the value of the tagged property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public Long getTagged() {
        return tagged;
    }

    /**
     * Sets the value of the tagged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public void setTagged(Long value) {
        this.tagged = value;
    }

    /**
     * Gets the value of the tohistory property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public Long getTohistory() {
        return tohistory;
    }

    /**
     * Sets the value of the tohistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public void setTohistory(Long value) {
        this.tohistory = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public void setName(String value) {
        this.name = value;
    }

}
