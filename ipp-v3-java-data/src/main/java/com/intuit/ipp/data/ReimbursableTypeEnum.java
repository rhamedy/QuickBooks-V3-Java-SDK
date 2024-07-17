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
 * <p>Java class for ReimbursableTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ReimbursableTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Billable"/&gt;
 *     &lt;enumeration value="BillableHasBeenBilled"/&gt;
 *     &lt;enumeration value="NotBillable"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReimbursableTypeEnum")
@XmlEnum
public enum ReimbursableTypeEnum {

    @XmlEnumValue("Billable")
    BILLABLE("Billable"),
    @XmlEnumValue("BillableHasBeenBilled")
    BILLABLE_HAS_BEEN_BILLED("BillableHasBeenBilled"),
    @XmlEnumValue("NotBillable")
    NOT_BILLABLE("NotBillable");
    private final String value;

    ReimbursableTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReimbursableTypeEnum fromValue(String v) {
        for (ReimbursableTypeEnum c: ReimbursableTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
