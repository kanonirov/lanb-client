
package ru.lanbilling.webservice.wsdl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for soapCatalogFull complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="soapCatalogFull"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="catalog" type="{urn:api3}soapCatalog"/&gt;
 *         &lt;element name="ipcatalogs" type="{urn:api3}soapIPCatalog" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ascatalogs" type="{urn:api3}soapASCatalog" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="telcatalogs" type="{urn:api3}soapTelCatalog" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="servcatalogs" type="{urn:api3}soapCatalogService" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "soapCatalogFull", propOrder = {
    "catalog",
    "ipcatalogs",
    "ascatalogs",
    "telcatalogs",
    "servcatalogs"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
public class SoapCatalogFull {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    protected SoapCatalog catalog;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    protected List<SoapIPCatalog> ipcatalogs;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    protected List<SoapASCatalog> ascatalogs;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    protected List<SoapTelCatalog> telcatalogs;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    protected List<SoapCatalogService> servcatalogs;

    /**
     * Gets the value of the catalog property.
     * 
     * @return
     *     possible object is
     *     {@link SoapCatalog }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public SoapCatalog getCatalog() {
        return catalog;
    }

    /**
     * Sets the value of the catalog property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoapCatalog }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public void setCatalog(SoapCatalog value) {
        this.catalog = value;
    }

    /**
     * Gets the value of the ipcatalogs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ipcatalogs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIpcatalogs().add(newItem);
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
    public List<SoapIPCatalog> getIpcatalogs() {
        if (ipcatalogs == null) {
            ipcatalogs = new ArrayList<SoapIPCatalog>();
        }
        return this.ipcatalogs;
    }

    /**
     * Gets the value of the ascatalogs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ascatalogs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAscatalogs().add(newItem);
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
    public List<SoapASCatalog> getAscatalogs() {
        if (ascatalogs == null) {
            ascatalogs = new ArrayList<SoapASCatalog>();
        }
        return this.ascatalogs;
    }

    /**
     * Gets the value of the telcatalogs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telcatalogs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelcatalogs().add(newItem);
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
    public List<SoapTelCatalog> getTelcatalogs() {
        if (telcatalogs == null) {
            telcatalogs = new ArrayList<SoapTelCatalog>();
        }
        return this.telcatalogs;
    }

    /**
     * Gets the value of the servcatalogs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the servcatalogs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServcatalogs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SoapCatalogService }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public List<SoapCatalogService> getServcatalogs() {
        if (servcatalogs == null) {
            servcatalogs = new ArrayList<SoapCatalogService>();
        }
        return this.servcatalogs;
    }

}
