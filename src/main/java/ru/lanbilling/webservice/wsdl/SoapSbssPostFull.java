
package ru.lanbilling.webservice.wsdl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for soapSbssPostFull complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="soapSbssPostFull"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="post" type="{urn:api3}soapSbssPost"/&gt;
 *         &lt;element name="files" type="{urn:api3}soapSbssPostFile" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "soapSbssPostFull", propOrder = {
    "post",
    "files"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
public class SoapSbssPostFull {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    protected SoapSbssPost post;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    protected List<SoapSbssPostFile> files;

    /**
     * Gets the value of the post property.
     * 
     * @return
     *     possible object is
     *     {@link SoapSbssPost }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public SoapSbssPost getPost() {
        return post;
    }

    /**
     * Sets the value of the post property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoapSbssPost }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public void setPost(SoapSbssPost value) {
        this.post = value;
    }

    /**
     * Gets the value of the files property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the files property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFiles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SoapSbssPostFile }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
    public List<SoapSbssPostFile> getFiles() {
        if (files == null) {
            files = new ArrayList<SoapSbssPostFile>();
        }
        return this.files;
    }

}
