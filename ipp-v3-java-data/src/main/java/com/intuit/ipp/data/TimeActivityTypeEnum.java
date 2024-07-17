//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.07.12 at 12:19:07 PM IST 
//


package com.intuit.ipp.data;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeActivityTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TimeActivityTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Employee"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="Vendor"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TimeActivityTypeEnum")
@XmlEnum
public enum TimeActivityTypeEnum {

    @XmlEnumValue("Employee")
    EMPLOYEE("Employee"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Vendor")
    VENDOR("Vendor");
    private final String value;

    TimeActivityTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TimeActivityTypeEnum fromValue(String v) {
        for (TimeActivityTypeEnum c: TimeActivityTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
