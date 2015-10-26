
package ru.lanbilling.webservice.wsdl;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for connType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="connType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *     &lt;enumeration value="HFC"/&gt;
 *     &lt;enumeration value="FTTB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "connType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2015-10-25T05:29:34+06:00", comments = "JAXB RI v2.2.11")
public enum ConnType {

    UNKNOWN,
    HFC,
    FTTB;

    public String value() {
        return name();
    }

    public static ConnType fromValue(String v) {
        return valueOf(v);
    }

}
