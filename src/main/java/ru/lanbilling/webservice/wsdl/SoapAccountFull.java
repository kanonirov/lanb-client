
package ru.lanbilling.webservice.wsdl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for soapAccountFull complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="soapAccountFull"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="application" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="account" type="{urn:api3}soapAccount"/&gt;
 *         &lt;element name="usergroups" type="{urn:api3}soapUsergroupFull" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="addresses" type="{urn:api3}soapAddressBrief" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="agreements" type="{urn:api3}soapAgreement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="addons" type="{urn:api3}soapAccountAddon" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "soapAccountFull", propOrder = {
    "application",
    "account",
    "usergroups",
    "addresses",
    "agreements",
    "addons"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
public class SoapAccountFull {

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    protected Long application;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    protected SoapAccount account;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    protected List<SoapUsergroupFull> usergroups;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    protected List<SoapAddressBrief> addresses;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    protected List<SoapAgreement> agreements;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    protected List<SoapAccountAddon> addons;

    /**
     * Gets the value of the application property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public Long getApplication() {
        return application;
    }

    /**
     * Sets the value of the application property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public void setApplication(Long value) {
        this.application = value;
    }

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link SoapAccount }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public SoapAccount getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoapAccount }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public void setAccount(SoapAccount value) {
        this.account = value;
    }

    /**
     * Gets the value of the usergroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usergroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsergroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SoapUsergroupFull }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public List<SoapUsergroupFull> getUsergroups() {
        if (usergroups == null) {
            usergroups = new ArrayList<SoapUsergroupFull>();
        }
        return this.usergroups;
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

    /**
     * Gets the value of the agreements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agreements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgreements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SoapAgreement }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public List<SoapAgreement> getAgreements() {
        if (agreements == null) {
            agreements = new ArrayList<SoapAgreement>();
        }
        return this.agreements;
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
     * {@link SoapAccountAddon }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public List<SoapAccountAddon> getAddons() {
        if (addons == null) {
            addons = new ArrayList<SoapAccountAddon>();
        }
        return this.addons;
    }

}
