
package ru.lanbilling.webservice.wsdl;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for soapEquipmentModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="soapEquipmentModel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="modelid" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="techtype" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="identitytype" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="strtype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "soapEquipmentModel", propOrder = {
    "modelid",
    "type",
    "techtype",
    "identitytype",
    "strtype",
    "name",
    "descr"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
public class SoapEquipmentModel {

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    protected long modelid;
    @XmlElement(defaultValue = "0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    protected Long type;
    @XmlElement(defaultValue = "-1")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    protected Long techtype;
    @XmlElement(defaultValue = "0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    protected Long identitytype;
    @XmlElement(defaultValue = "")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    protected String strtype;
    @XmlElement(defaultValue = "")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    protected String name;
    @XmlElement(defaultValue = "")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    protected String descr;

    /**
     * Gets the value of the modelid property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public long getModelid() {
        return modelid;
    }

    /**
     * Sets the value of the modelid property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public void setModelid(long value) {
        this.modelid = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public Long getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public void setType(Long value) {
        this.type = value;
    }

    /**
     * Gets the value of the techtype property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public Long getTechtype() {
        return techtype;
    }

    /**
     * Sets the value of the techtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public void setTechtype(Long value) {
        this.techtype = value;
    }

    /**
     * Gets the value of the identitytype property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public Long getIdentitytype() {
        return identitytype;
    }

    /**
     * Sets the value of the identitytype property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public void setIdentitytype(Long value) {
        this.identitytype = value;
    }

    /**
     * Gets the value of the strtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public String getStrtype() {
        return strtype;
    }

    /**
     * Sets the value of the strtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public void setStrtype(String value) {
        this.strtype = value;
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

    /**
     * Gets the value of the descr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public String getDescr() {
        return descr;
    }

    /**
     * Sets the value of the descr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public void setDescr(String value) {
        this.descr = value;
    }

}
