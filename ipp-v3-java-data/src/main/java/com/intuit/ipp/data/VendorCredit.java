//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.07.12 at 12:19:07 PM IST 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.math.BigDecimal;
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
 * Bill is an AP transaction representing a
 * 				request-for-payment from a third party for goods/services rendered
 * 				and/or received
 * 
 * <p>Java class for VendorCredit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VendorCredit"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.intuit.com/finance/v3}PurchaseByVendor"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VendorAddr" type="{http://schema.intuit.com/finance/v3}PhysicalAddress" minOccurs="0"/&gt;
 *         &lt;element name="VendorCreditEx" type="{http://schema.intuit.com/finance/v3}IntuitAnyType" minOccurs="0"/&gt;
 *         &lt;element name="Balance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="IncludeInAnnualTPAR" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VendorCredit", propOrder = {
    "vendorAddr",
    "vendorCreditEx",
    "balance",
    "includeInAnnualTPAR"
})
public class VendorCredit
    extends PurchaseByVendor
    implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "VendorAddr")
    protected PhysicalAddress vendorAddr;
    @XmlElement(name = "VendorCreditEx")
    protected IntuitAnyType vendorCreditEx;
    @XmlElement(name = "Balance")
    protected BigDecimal balance;
    @XmlElement(name = "IncludeInAnnualTPAR")
    protected Boolean includeInAnnualTPAR;

    /**
     * Gets the value of the vendorAddr property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalAddress }
     *     
     */
    public PhysicalAddress getVendorAddr() {
        return vendorAddr;
    }

    /**
     * Sets the value of the vendorAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalAddress }
     *     
     */
    public void setVendorAddr(PhysicalAddress value) {
        this.vendorAddr = value;
    }

    /**
     * Gets the value of the vendorCreditEx property.
     * 
     * @return
     *     possible object is
     *     {@link IntuitAnyType }
     *     
     */
    public IntuitAnyType getVendorCreditEx() {
        return vendorCreditEx;
    }

    /**
     * Sets the value of the vendorCreditEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntuitAnyType }
     *     
     */
    public void setVendorCreditEx(IntuitAnyType value) {
        this.vendorCreditEx = value;
    }

    /**
     * Gets the value of the balance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBalance(BigDecimal value) {
        this.balance = value;
    }

    /**
     * Gets the value of the includeInAnnualTPAR property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeInAnnualTPAR() {
        return includeInAnnualTPAR;
    }

    /**
     * Sets the value of the includeInAnnualTPAR property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeInAnnualTPAR(Boolean value) {
        this.includeInAnnualTPAR = value;
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
        final VendorCredit that = ((VendorCredit) object);
        {
            PhysicalAddress lhsVendorAddr;
            lhsVendorAddr = this.getVendorAddr();
            PhysicalAddress rhsVendorAddr;
            rhsVendorAddr = that.getVendorAddr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vendorAddr", lhsVendorAddr), LocatorUtils.property(thatLocator, "vendorAddr", rhsVendorAddr), lhsVendorAddr, rhsVendorAddr, (this.vendorAddr!= null), (that.vendorAddr!= null))) {
                return false;
            }
        }
        {
            IntuitAnyType lhsVendorCreditEx;
            lhsVendorCreditEx = this.getVendorCreditEx();
            IntuitAnyType rhsVendorCreditEx;
            rhsVendorCreditEx = that.getVendorCreditEx();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vendorCreditEx", lhsVendorCreditEx), LocatorUtils.property(thatLocator, "vendorCreditEx", rhsVendorCreditEx), lhsVendorCreditEx, rhsVendorCreditEx, (this.vendorCreditEx!= null), (that.vendorCreditEx!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsBalance;
            lhsBalance = this.getBalance();
            BigDecimal rhsBalance;
            rhsBalance = that.getBalance();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "balance", lhsBalance), LocatorUtils.property(thatLocator, "balance", rhsBalance), lhsBalance, rhsBalance, (this.balance!= null), (that.balance!= null))) {
                return false;
            }
        }
        {
            Boolean lhsIncludeInAnnualTPAR;
            lhsIncludeInAnnualTPAR = this.isIncludeInAnnualTPAR();
            Boolean rhsIncludeInAnnualTPAR;
            rhsIncludeInAnnualTPAR = that.isIncludeInAnnualTPAR();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "includeInAnnualTPAR", lhsIncludeInAnnualTPAR), LocatorUtils.property(thatLocator, "includeInAnnualTPAR", rhsIncludeInAnnualTPAR), lhsIncludeInAnnualTPAR, rhsIncludeInAnnualTPAR, (this.includeInAnnualTPAR!= null), (that.includeInAnnualTPAR!= null))) {
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
            PhysicalAddress theVendorAddr;
            theVendorAddr = this.getVendorAddr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vendorAddr", theVendorAddr), currentHashCode, theVendorAddr, (this.vendorAddr!= null));
        }
        {
            IntuitAnyType theVendorCreditEx;
            theVendorCreditEx = this.getVendorCreditEx();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vendorCreditEx", theVendorCreditEx), currentHashCode, theVendorCreditEx, (this.vendorCreditEx!= null));
        }
        {
            BigDecimal theBalance;
            theBalance = this.getBalance();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "balance", theBalance), currentHashCode, theBalance, (this.balance!= null));
        }
        {
            Boolean theIncludeInAnnualTPAR;
            theIncludeInAnnualTPAR = this.isIncludeInAnnualTPAR();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "includeInAnnualTPAR", theIncludeInAnnualTPAR), currentHashCode, theIncludeInAnnualTPAR, (this.includeInAnnualTPAR!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
