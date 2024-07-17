//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.07.12 at 12:19:07 PM IST 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * 
 * 				Product: ALL
 * 				Description: Telephone number type definition. This entity is always manipulated in the context of another parent entity like Person, Organization etc.
 * 			
 * 
 * <p>Java class for TelephoneNumber complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TelephoneNumber"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://schema.intuit.com/finance/v3}id" minOccurs="0"/&gt;
 *         &lt;element name="DeviceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AreaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExchangeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FreeFormNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Default" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Tag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelephoneNumber", propOrder = {
    "id",
    "deviceType",
    "countryCode",
    "areaCode",
    "exchangeCode",
    "extension",
    "freeFormNumber",
    "_default",
    "tag"
})
public class TelephoneNumber implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "DeviceType")
    protected String deviceType;
    @XmlElement(name = "CountryCode")
    protected String countryCode;
    @XmlElement(name = "AreaCode")
    protected String areaCode;
    @XmlElement(name = "ExchangeCode")
    protected String exchangeCode;
    @XmlElement(name = "Extension")
    protected String extension;
    @XmlElement(name = "FreeFormNumber")
    protected String freeFormNumber;
    @XmlElement(name = "Default")
    protected Boolean _default;
    @XmlElement(name = "Tag")
    protected String tag;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the deviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * Sets the value of the deviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceType(String value) {
        this.deviceType = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the areaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * Sets the value of the areaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaCode(String value) {
        this.areaCode = value;
    }

    /**
     * Gets the value of the exchangeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeCode() {
        return exchangeCode;
    }

    /**
     * Sets the value of the exchangeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeCode(String value) {
        this.exchangeCode = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtension(String value) {
        this.extension = value;
    }

    /**
     * Gets the value of the freeFormNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreeFormNumber() {
        return freeFormNumber;
    }

    /**
     * Sets the value of the freeFormNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreeFormNumber(String value) {
        this.freeFormNumber = value;
    }

    /**
     * Gets the value of the default property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefault() {
        return _default;
    }

    /**
     * Sets the value of the default property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefault(Boolean value) {
        this._default = value;
    }

    /**
     * Gets the value of the tag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag() {
        return tag;
    }

    /**
     * Sets the value of the tag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag(String value) {
        this.tag = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TelephoneNumber that = ((TelephoneNumber) object);
        {
            String lhsId;
            lhsId = this.getId();
            String rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId, (this.id!= null), (that.id!= null))) {
                return false;
            }
        }
        {
            String lhsDeviceType;
            lhsDeviceType = this.getDeviceType();
            String rhsDeviceType;
            rhsDeviceType = that.getDeviceType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "deviceType", lhsDeviceType), LocatorUtils.property(thatLocator, "deviceType", rhsDeviceType), lhsDeviceType, rhsDeviceType, (this.deviceType!= null), (that.deviceType!= null))) {
                return false;
            }
        }
        {
            String lhsCountryCode;
            lhsCountryCode = this.getCountryCode();
            String rhsCountryCode;
            rhsCountryCode = that.getCountryCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "countryCode", lhsCountryCode), LocatorUtils.property(thatLocator, "countryCode", rhsCountryCode), lhsCountryCode, rhsCountryCode, (this.countryCode!= null), (that.countryCode!= null))) {
                return false;
            }
        }
        {
            String lhsAreaCode;
            lhsAreaCode = this.getAreaCode();
            String rhsAreaCode;
            rhsAreaCode = that.getAreaCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "areaCode", lhsAreaCode), LocatorUtils.property(thatLocator, "areaCode", rhsAreaCode), lhsAreaCode, rhsAreaCode, (this.areaCode!= null), (that.areaCode!= null))) {
                return false;
            }
        }
        {
            String lhsExchangeCode;
            lhsExchangeCode = this.getExchangeCode();
            String rhsExchangeCode;
            rhsExchangeCode = that.getExchangeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "exchangeCode", lhsExchangeCode), LocatorUtils.property(thatLocator, "exchangeCode", rhsExchangeCode), lhsExchangeCode, rhsExchangeCode, (this.exchangeCode!= null), (that.exchangeCode!= null))) {
                return false;
            }
        }
        {
            String lhsExtension;
            lhsExtension = this.getExtension();
            String rhsExtension;
            rhsExtension = that.getExtension();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "extension", lhsExtension), LocatorUtils.property(thatLocator, "extension", rhsExtension), lhsExtension, rhsExtension, (this.extension!= null), (that.extension!= null))) {
                return false;
            }
        }
        {
            String lhsFreeFormNumber;
            lhsFreeFormNumber = this.getFreeFormNumber();
            String rhsFreeFormNumber;
            rhsFreeFormNumber = that.getFreeFormNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "freeFormNumber", lhsFreeFormNumber), LocatorUtils.property(thatLocator, "freeFormNumber", rhsFreeFormNumber), lhsFreeFormNumber, rhsFreeFormNumber, (this.freeFormNumber!= null), (that.freeFormNumber!= null))) {
                return false;
            }
        }
        {
            Boolean lhsDefault;
            lhsDefault = this.isDefault();
            Boolean rhsDefault;
            rhsDefault = that.isDefault();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "_default", lhsDefault), LocatorUtils.property(thatLocator, "_default", rhsDefault), lhsDefault, rhsDefault, (this._default!= null), (that._default!= null))) {
                return false;
            }
        }
        {
            String lhsTag;
            lhsTag = this.getTag();
            String rhsTag;
            rhsTag = that.getTag();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tag", lhsTag), LocatorUtils.property(thatLocator, "tag", rhsTag), lhsTag, rhsTag, (this.tag!= null), (that.tag!= null))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = 1;
        {
            String theId;
            theId = this.getId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theId), currentHashCode, theId, (this.id!= null));
        }
        {
            String theDeviceType;
            theDeviceType = this.getDeviceType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "deviceType", theDeviceType), currentHashCode, theDeviceType, (this.deviceType!= null));
        }
        {
            String theCountryCode;
            theCountryCode = this.getCountryCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "countryCode", theCountryCode), currentHashCode, theCountryCode, (this.countryCode!= null));
        }
        {
            String theAreaCode;
            theAreaCode = this.getAreaCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "areaCode", theAreaCode), currentHashCode, theAreaCode, (this.areaCode!= null));
        }
        {
            String theExchangeCode;
            theExchangeCode = this.getExchangeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "exchangeCode", theExchangeCode), currentHashCode, theExchangeCode, (this.exchangeCode!= null));
        }
        {
            String theExtension;
            theExtension = this.getExtension();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "extension", theExtension), currentHashCode, theExtension, (this.extension!= null));
        }
        {
            String theFreeFormNumber;
            theFreeFormNumber = this.getFreeFormNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "freeFormNumber", theFreeFormNumber), currentHashCode, theFreeFormNumber, (this.freeFormNumber!= null));
        }
        {
            Boolean theDefault;
            theDefault = this.isDefault();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "_default", theDefault), currentHashCode, theDefault, (this._default!= null));
        }
        {
            String theTag;
            theTag = this.getTag();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tag", theTag), currentHashCode, theTag, (this.tag!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
