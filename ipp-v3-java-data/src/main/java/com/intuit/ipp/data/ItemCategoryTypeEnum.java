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
 * <p>Java class for ItemCategoryTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ItemCategoryTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Product"/&gt;
 *     &lt;enumeration value="Service"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ItemCategoryTypeEnum")
@XmlEnum
public enum ItemCategoryTypeEnum {

    @XmlEnumValue("Product")
    PRODUCT("Product"),
    @XmlEnumValue("Service")
    SERVICE("Service");
    private final String value;

    ItemCategoryTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemCategoryTypeEnum fromValue(String v) {
        for (ItemCategoryTypeEnum c: ItemCategoryTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
