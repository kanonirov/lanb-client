
package ru.lanbilling.webservice.wsdl;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for soapPPSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="soapPPSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="promiserent" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="promisetill" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="promisemin" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="promisemax" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="promiselimit" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="promiseondays" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="promiseblockdays" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="promiseavailable" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "soapPPSettings", propOrder = {
    "promiserent",
    "promisetill",
    "promisemin",
    "promisemax",
    "promiselimit",
    "promiseondays",
    "promiseblockdays",
    "promiseavailable"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
public class SoapPPSettings {

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    protected long promiserent;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    protected long promisetill;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    protected double promisemin;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    protected double promisemax;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    protected double promiselimit;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    protected long promiseondays;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    protected long promiseblockdays;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    protected long promiseavailable;

    /**
     * Gets the value of the promiserent property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public long getPromiserent() {
        return promiserent;
    }

    /**
     * Sets the value of the promiserent property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public void setPromiserent(long value) {
        this.promiserent = value;
    }

    /**
     * Gets the value of the promisetill property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public long getPromisetill() {
        return promisetill;
    }

    /**
     * Sets the value of the promisetill property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public void setPromisetill(long value) {
        this.promisetill = value;
    }

    /**
     * Gets the value of the promisemin property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public double getPromisemin() {
        return promisemin;
    }

    /**
     * Sets the value of the promisemin property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public void setPromisemin(double value) {
        this.promisemin = value;
    }

    /**
     * Gets the value of the promisemax property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public double getPromisemax() {
        return promisemax;
    }

    /**
     * Sets the value of the promisemax property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public void setPromisemax(double value) {
        this.promisemax = value;
    }

    /**
     * Gets the value of the promiselimit property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public double getPromiselimit() {
        return promiselimit;
    }

    /**
     * Sets the value of the promiselimit property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public void setPromiselimit(double value) {
        this.promiselimit = value;
    }

    /**
     * Gets the value of the promiseondays property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public long getPromiseondays() {
        return promiseondays;
    }

    /**
     * Sets the value of the promiseondays property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public void setPromiseondays(long value) {
        this.promiseondays = value;
    }

    /**
     * Gets the value of the promiseblockdays property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public long getPromiseblockdays() {
        return promiseblockdays;
    }

    /**
     * Sets the value of the promiseblockdays property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public void setPromiseblockdays(long value) {
        this.promiseblockdays = value;
    }

    /**
     * Gets the value of the promiseavailable property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public long getPromiseavailable() {
        return promiseavailable;
    }

    /**
     * Sets the value of the promiseavailable property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public void setPromiseavailable(long value) {
        this.promiseavailable = value;
    }

}
