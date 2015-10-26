
package ru.lanbilling.webservice.wsdl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for soapTarifFull complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="soapTarifFull"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tarif" type="{urn:api3}soapTarif"/&gt;
 *         &lt;element name="sizeshapes" type="{urn:api3}soapSizeShape" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="timeshapes" type="{urn:api3}soapTimeShape" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "soapTarifFull", propOrder = {
    "tarif",
    "sizeshapes",
    "timeshapes"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
public class SoapTarifFull {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    protected SoapTarif tarif;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    protected List<SoapSizeShape> sizeshapes;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    protected List<SoapTimeShape> timeshapes;

    /**
     * Gets the value of the tarif property.
     * 
     * @return
     *     possible object is
     *     {@link SoapTarif }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public SoapTarif getTarif() {
        return tarif;
    }

    /**
     * Sets the value of the tarif property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoapTarif }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public void setTarif(SoapTarif value) {
        this.tarif = value;
    }

    /**
     * Gets the value of the sizeshapes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sizeshapes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSizeshapes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SoapSizeShape }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public List<SoapSizeShape> getSizeshapes() {
        if (sizeshapes == null) {
            sizeshapes = new ArrayList<SoapSizeShape>();
        }
        return this.sizeshapes;
    }

    /**
     * Gets the value of the timeshapes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeshapes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeshapes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SoapTimeShape }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public List<SoapTimeShape> getTimeshapes() {
        if (timeshapes == null) {
            timeshapes = new ArrayList<SoapTimeShape>();
        }
        return this.timeshapes;
    }

}
