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
import javax.xml.bind.annotation.XmlSchemaType;
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
 * 				Product: QBW
 * 				Description: The SalesRep entity allows
 * 				you to identify sales representatives and track their transactions.
 * 				A sales representative can be an employee, a vendor, or an
 * 				independent contractor. You can associate sales representatives with
 * 				sales deals to track their transactions.
 * 			
 * 
 * <p>Java class for SalesRep complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesRep"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.intuit.com/finance/v3}IntuitEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NameOf" type="{http://schema.intuit.com/finance/v3}SalesRepTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="Active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="EmployeeRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *           &lt;element name="VendorRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *           &lt;element name="OtherNameRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="Initials" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SalesRepEx" type="{http://schema.intuit.com/finance/v3}IntuitAnyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesRep", propOrder = {
    "nameOf",
    "active",
    "employeeRef",
    "vendorRef",
    "otherNameRef",
    "initials",
    "salesRepEx"
})
public class SalesRep
    extends IntuitEntity
    implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "NameOf")
    @XmlSchemaType(name = "string")
    protected SalesRepTypeEnum nameOf;
    @XmlElement(name = "Active")
    protected Boolean active;
    @XmlElement(name = "EmployeeRef")
    protected ReferenceType employeeRef;
    @XmlElement(name = "VendorRef")
    protected ReferenceType vendorRef;
    @XmlElement(name = "OtherNameRef")
    protected ReferenceType otherNameRef;
    @XmlElement(name = "Initials")
    protected String initials;
    @XmlElement(name = "SalesRepEx")
    protected IntuitAnyType salesRepEx;

    /**
     * Gets the value of the nameOf property.
     * 
     * @return
     *     possible object is
     *     {@link SalesRepTypeEnum }
     *     
     */
    public SalesRepTypeEnum getNameOf() {
        return nameOf;
    }

    /**
     * Sets the value of the nameOf property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesRepTypeEnum }
     *     
     */
    public void setNameOf(SalesRepTypeEnum value) {
        this.nameOf = value;
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActive(Boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the employeeRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getEmployeeRef() {
        return employeeRef;
    }

    /**
     * Sets the value of the employeeRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setEmployeeRef(ReferenceType value) {
        this.employeeRef = value;
    }

    /**
     * Gets the value of the vendorRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getVendorRef() {
        return vendorRef;
    }

    /**
     * Sets the value of the vendorRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setVendorRef(ReferenceType value) {
        this.vendorRef = value;
    }

    /**
     * Gets the value of the otherNameRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getOtherNameRef() {
        return otherNameRef;
    }

    /**
     * Sets the value of the otherNameRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setOtherNameRef(ReferenceType value) {
        this.otherNameRef = value;
    }

    /**
     * Gets the value of the initials property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitials() {
        return initials;
    }

    /**
     * Sets the value of the initials property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitials(String value) {
        this.initials = value;
    }

    /**
     * Gets the value of the salesRepEx property.
     * 
     * @return
     *     possible object is
     *     {@link IntuitAnyType }
     *     
     */
    public IntuitAnyType getSalesRepEx() {
        return salesRepEx;
    }

    /**
     * Sets the value of the salesRepEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntuitAnyType }
     *     
     */
    public void setSalesRepEx(IntuitAnyType value) {
        this.salesRepEx = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final SalesRep that = ((SalesRep) object);
        {
            SalesRepTypeEnum lhsNameOf;
            lhsNameOf = this.getNameOf();
            SalesRepTypeEnum rhsNameOf;
            rhsNameOf = that.getNameOf();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nameOf", lhsNameOf), LocatorUtils.property(thatLocator, "nameOf", rhsNameOf), lhsNameOf, rhsNameOf, (this.nameOf!= null), (that.nameOf!= null))) {
                return false;
            }
        }
        {
            Boolean lhsActive;
            lhsActive = this.isActive();
            Boolean rhsActive;
            rhsActive = that.isActive();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "active", lhsActive), LocatorUtils.property(thatLocator, "active", rhsActive), lhsActive, rhsActive, (this.active!= null), (that.active!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsEmployeeRef;
            lhsEmployeeRef = this.getEmployeeRef();
            ReferenceType rhsEmployeeRef;
            rhsEmployeeRef = that.getEmployeeRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "employeeRef", lhsEmployeeRef), LocatorUtils.property(thatLocator, "employeeRef", rhsEmployeeRef), lhsEmployeeRef, rhsEmployeeRef, (this.employeeRef!= null), (that.employeeRef!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsVendorRef;
            lhsVendorRef = this.getVendorRef();
            ReferenceType rhsVendorRef;
            rhsVendorRef = that.getVendorRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vendorRef", lhsVendorRef), LocatorUtils.property(thatLocator, "vendorRef", rhsVendorRef), lhsVendorRef, rhsVendorRef, (this.vendorRef!= null), (that.vendorRef!= null))) {
                return false;
            }
        }
        {
            ReferenceType lhsOtherNameRef;
            lhsOtherNameRef = this.getOtherNameRef();
            ReferenceType rhsOtherNameRef;
            rhsOtherNameRef = that.getOtherNameRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "otherNameRef", lhsOtherNameRef), LocatorUtils.property(thatLocator, "otherNameRef", rhsOtherNameRef), lhsOtherNameRef, rhsOtherNameRef, (this.otherNameRef!= null), (that.otherNameRef!= null))) {
                return false;
            }
        }
        {
            String lhsInitials;
            lhsInitials = this.getInitials();
            String rhsInitials;
            rhsInitials = that.getInitials();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "initials", lhsInitials), LocatorUtils.property(thatLocator, "initials", rhsInitials), lhsInitials, rhsInitials, (this.initials!= null), (that.initials!= null))) {
                return false;
            }
        }
        {
            IntuitAnyType lhsSalesRepEx;
            lhsSalesRepEx = this.getSalesRepEx();
            IntuitAnyType rhsSalesRepEx;
            rhsSalesRepEx = that.getSalesRepEx();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "salesRepEx", lhsSalesRepEx), LocatorUtils.property(thatLocator, "salesRepEx", rhsSalesRepEx), lhsSalesRepEx, rhsSalesRepEx, (this.salesRepEx!= null), (that.salesRepEx!= null))) {
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
        int currentHashCode = super.hashCode(locator, strategy);
        {
            SalesRepTypeEnum theNameOf;
            theNameOf = this.getNameOf();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nameOf", theNameOf), currentHashCode, theNameOf, (this.nameOf!= null));
        }
        {
            Boolean theActive;
            theActive = this.isActive();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "active", theActive), currentHashCode, theActive, (this.active!= null));
        }
        {
            ReferenceType theEmployeeRef;
            theEmployeeRef = this.getEmployeeRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "employeeRef", theEmployeeRef), currentHashCode, theEmployeeRef, (this.employeeRef!= null));
        }
        {
            ReferenceType theVendorRef;
            theVendorRef = this.getVendorRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vendorRef", theVendorRef), currentHashCode, theVendorRef, (this.vendorRef!= null));
        }
        {
            ReferenceType theOtherNameRef;
            theOtherNameRef = this.getOtherNameRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "otherNameRef", theOtherNameRef), currentHashCode, theOtherNameRef, (this.otherNameRef!= null));
        }
        {
            String theInitials;
            theInitials = this.getInitials();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "initials", theInitials), currentHashCode, theInitials, (this.initials!= null));
        }
        {
            IntuitAnyType theSalesRepEx;
            theSalesRepEx = this.getSalesRepEx();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "salesRepEx", theSalesRepEx), currentHashCode, theSalesRepEx, (this.salesRepEx!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
