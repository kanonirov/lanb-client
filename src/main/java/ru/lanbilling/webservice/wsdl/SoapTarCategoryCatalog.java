
package ru.lanbilling.webservice.wsdl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for soapTarCategoryCatalog complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="soapTarCategoryCatalog"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ipcatalog" type="{urn:api3}soapIPCatalog" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ascatalog" type="{urn:api3}soapASCatalog" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="telcatalog" type="{urn:api3}soapTelCatalog" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "soapTarCategoryCatalog", propOrder = {
    "ipcatalog",
    "ascatalog",
    "telcatalog"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
public class SoapTarCategoryCatalog {

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    protected List<SoapIPCatalog> ipcatalog;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    protected List<SoapASCatalog> ascatalog;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    protected List<SoapTelCatalog> telcatalog;

    /**
     * Gets the value of the ipcatalog property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ipcatalog property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIpcatalog().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SoapIPCatalog }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public List<SoapIPCatalog> getIpcatalog() {
        if (ipcatalog == null) {
            ipcatalog = new ArrayList<SoapIPCatalog>();
        }
        return this.ipcatalog;
    }

    /**
     * Gets the value of the ascatalog property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ascatalog property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAscatalog().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SoapASCatalog }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public List<SoapASCatalog> getAscatalog() {
        if (ascatalog == null) {
            ascatalog = new ArrayList<SoapASCatalog>();
        }
        return this.ascatalog;
    }

    /**
     * Gets the value of the telcatalog property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telcatalog property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelcatalog().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SoapTelCatalog }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public List<SoapTelCatalog> getTelcatalog() {
        if (telcatalog == null) {
            telcatalog = new ArrayList<SoapTelCatalog>();
        }
        return this.telcatalog;
    }

}
