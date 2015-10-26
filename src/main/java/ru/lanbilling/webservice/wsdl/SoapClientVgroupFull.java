
package ru.lanbilling.webservice.wsdl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for soapClientVgroupFull complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="soapClientVgroupFull"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vgroup" type="{urn:api3}soapClientVgroup"/&gt;
 *         &lt;element name="tarrasp" type="{urn:api3}soapTarifsRasp" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="staff" type="{urn:api3}soapStaff" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="telstaff" type="{urn:api3}soapTelStaff" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="macstaff" type="{urn:api3}soapMacStaff" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tarstaff" type="{urn:api3}soapTarifsStaff" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="turboshape" type="{urn:api3}soapTurboShape" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="addons" type="{urn:api3}soapVgroupAddon" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="blockrasp" type="{urn:api3}soapBlockRasp" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="addresses" type="{urn:api3}soapAddressBrief" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "soapClientVgroupFull", propOrder = {
    "vgroup",
    "tarrasp",
    "staff",
    "telstaff",
    "macstaff",
    "tarstaff",
    "turboshape",
    "addons",
    "blockrasp",
    "addresses"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
public class SoapClientVgroupFull {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    protected SoapClientVgroup vgroup;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    protected List<SoapTarifsRasp> tarrasp;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    protected List<SoapStaff> staff;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    protected List<SoapTelStaff> telstaff;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    protected List<SoapMacStaff> macstaff;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    protected List<SoapTarifsStaff> tarstaff;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    protected List<SoapTurboShape> turboshape;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    protected List<SoapVgroupAddon> addons;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    protected List<SoapBlockRasp> blockrasp;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    protected List<SoapAddressBrief> addresses;

    /**
     * Gets the value of the vgroup property.
     * 
     * @return
     *     possible object is
     *     {@link SoapClientVgroup }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public SoapClientVgroup getVgroup() {
        return vgroup;
    }

    /**
     * Sets the value of the vgroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoapClientVgroup }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public void setVgroup(SoapClientVgroup value) {
        this.vgroup = value;
    }

    /**
     * Gets the value of the tarrasp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tarrasp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTarrasp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SoapTarifsRasp }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public List<SoapTarifsRasp> getTarrasp() {
        if (tarrasp == null) {
            tarrasp = new ArrayList<SoapTarifsRasp>();
        }
        return this.tarrasp;
    }

    /**
     * Gets the value of the staff property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the staff property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStaff().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SoapStaff }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public List<SoapStaff> getStaff() {
        if (staff == null) {
            staff = new ArrayList<SoapStaff>();
        }
        return this.staff;
    }

    /**
     * Gets the value of the telstaff property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telstaff property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelstaff().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SoapTelStaff }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public List<SoapTelStaff> getTelstaff() {
        if (telstaff == null) {
            telstaff = new ArrayList<SoapTelStaff>();
        }
        return this.telstaff;
    }

    /**
     * Gets the value of the macstaff property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the macstaff property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMacstaff().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SoapMacStaff }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public List<SoapMacStaff> getMacstaff() {
        if (macstaff == null) {
            macstaff = new ArrayList<SoapMacStaff>();
        }
        return this.macstaff;
    }

    /**
     * Gets the value of the tarstaff property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tarstaff property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTarstaff().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SoapTarifsStaff }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public List<SoapTarifsStaff> getTarstaff() {
        if (tarstaff == null) {
            tarstaff = new ArrayList<SoapTarifsStaff>();
        }
        return this.tarstaff;
    }

    /**
     * Gets the value of the turboshape property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the turboshape property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTurboshape().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SoapTurboShape }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public List<SoapTurboShape> getTurboshape() {
        if (turboshape == null) {
            turboshape = new ArrayList<SoapTurboShape>();
        }
        return this.turboshape;
    }

    /**
     * Gets the value of the addons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SoapVgroupAddon }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public List<SoapVgroupAddon> getAddons() {
        if (addons == null) {
            addons = new ArrayList<SoapVgroupAddon>();
        }
        return this.addons;
    }

    /**
     * Gets the value of the blockrasp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the blockrasp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBlockrasp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SoapBlockRasp }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public List<SoapBlockRasp> getBlockrasp() {
        if (blockrasp == null) {
            blockrasp = new ArrayList<SoapBlockRasp>();
        }
        return this.blockrasp;
    }

    /**
     * Gets the value of the addresses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addresses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddresses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SoapAddressBrief }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public List<SoapAddressBrief> getAddresses() {
        if (addresses == null) {
            addresses = new ArrayList<SoapAddressBrief>();
        }
        return this.addresses;
    }

}
