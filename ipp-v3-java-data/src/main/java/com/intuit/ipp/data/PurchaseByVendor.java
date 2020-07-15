//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.07.15 at 03:58:30 PM PDT 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
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
 * Financial Transaction information that pertains to
 * 				the entire Bill.
 * 
 * <p>Java class for PurchaseByVendor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PurchaseByVendor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schema.intuit.com/finance/v3}Transaction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VendorRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="APAccountRef" type="{http://schema.intuit.com/finance/v3}ReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="TotalAmt" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="BillEmail" type="{http://schema.intuit.com/finance/v3}EmailAddress" minOccurs="0"/&gt;
 *         &lt;element name="ReplyEmail" type="{http://schema.intuit.com/finance/v3}EmailAddress" minOccurs="0"/&gt;
 *         &lt;element name="Memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GlobalTaxCalculation" type="{http://schema.intuit.com/finance/v3}GlobalTaxCalculationEnum" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PurchaseByVendor", propOrder = {
    "vendorRef",
    "apAccountRef",
    "totalAmt",
    "billEmail",
    "replyEmail",
    "memo",
    "globalTaxCalculation"
})
@XmlSeeAlso({
    PurchaseOrder.class,
    VendorCredit.class,
    Bill.class
})
public class PurchaseByVendor
    extends Transaction
    implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "VendorRef")
    protected ReferenceType vendorRef;
    @XmlElement(name = "APAccountRef")
    protected ReferenceType apAccountRef;
    @XmlElement(name = "TotalAmt")
    protected BigDecimal totalAmt;
    @XmlElement(name = "BillEmail")
    protected EmailAddress billEmail;
    @XmlElement(name = "ReplyEmail")
    protected EmailAddress replyEmail;
    @XmlElement(name = "Memo")
    protected String memo;
    @XmlElement(name = "GlobalTaxCalculation")
    @XmlSchemaType(name = "string")
    protected GlobalTaxCalculationEnum globalTaxCalculation;

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
     * Gets the value of the apAccountRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getAPAccountRef() {
        return apAccountRef;
    }

    /**
     * Sets the value of the apAccountRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setAPAccountRef(ReferenceType value) {
        this.apAccountRef = value;
    }

    /**
     * Gets the value of the totalAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAmt() {
        return totalAmt;
    }

    /**
     * Sets the value of the totalAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAmt(BigDecimal value) {
        this.totalAmt = value;
    }

    /**
     * Gets the value of the billEmail property.
     * 
     * @return
     *     possible object is
     *     {@link EmailAddress }
     *     
     */
    public EmailAddress getBillEmail() {
        return billEmail;
    }

    /**
     * Sets the value of the billEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailAddress }
     *     
     */
    public void setBillEmail(EmailAddress value) {
        this.billEmail = value;
    }

    /**
     * Gets the value of the replyEmail property.
     * 
     * @return
     *     possible object is
     *     {@link EmailAddress }
     *     
     */
    public EmailAddress getReplyEmail() {
        return replyEmail;
    }

    /**
     * Sets the value of the replyEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailAddress }
     *     
     */
    public void setReplyEmail(EmailAddress value) {
        this.replyEmail = value;
    }

    /**
     * Gets the value of the memo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemo() {
        return memo;
    }

    /**
     * Sets the value of the memo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemo(String value) {
        this.memo = value;
    }

    /**
     * Gets the value of the globalTaxCalculation property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalTaxCalculationEnum }
     *     
     */
    public GlobalTaxCalculationEnum getGlobalTaxCalculation() {
        return globalTaxCalculation;
    }

    /**
     * Sets the value of the globalTaxCalculation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalTaxCalculationEnum }
     *     
     */
    public void setGlobalTaxCalculation(GlobalTaxCalculationEnum value) {
        this.globalTaxCalculation = value;
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
        final PurchaseByVendor that = ((PurchaseByVendor) object);
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
            ReferenceType lhsAPAccountRef;
            lhsAPAccountRef = this.getAPAccountRef();
            ReferenceType rhsAPAccountRef;
            rhsAPAccountRef = that.getAPAccountRef();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "apAccountRef", lhsAPAccountRef), LocatorUtils.property(thatLocator, "apAccountRef", rhsAPAccountRef), lhsAPAccountRef, rhsAPAccountRef, (this.apAccountRef!= null), (that.apAccountRef!= null))) {
                return false;
            }
        }
        {
            BigDecimal lhsTotalAmt;
            lhsTotalAmt = this.getTotalAmt();
            BigDecimal rhsTotalAmt;
            rhsTotalAmt = that.getTotalAmt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalAmt", lhsTotalAmt), LocatorUtils.property(thatLocator, "totalAmt", rhsTotalAmt), lhsTotalAmt, rhsTotalAmt, (this.totalAmt!= null), (that.totalAmt!= null))) {
                return false;
            }
        }
        {
            EmailAddress lhsBillEmail;
            lhsBillEmail = this.getBillEmail();
            EmailAddress rhsBillEmail;
            rhsBillEmail = that.getBillEmail();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "billEmail", lhsBillEmail), LocatorUtils.property(thatLocator, "billEmail", rhsBillEmail), lhsBillEmail, rhsBillEmail, (this.billEmail!= null), (that.billEmail!= null))) {
                return false;
            }
        }
        {
            EmailAddress lhsReplyEmail;
            lhsReplyEmail = this.getReplyEmail();
            EmailAddress rhsReplyEmail;
            rhsReplyEmail = that.getReplyEmail();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "replyEmail", lhsReplyEmail), LocatorUtils.property(thatLocator, "replyEmail", rhsReplyEmail), lhsReplyEmail, rhsReplyEmail, (this.replyEmail!= null), (that.replyEmail!= null))) {
                return false;
            }
        }
        {
            String lhsMemo;
            lhsMemo = this.getMemo();
            String rhsMemo;
            rhsMemo = that.getMemo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "memo", lhsMemo), LocatorUtils.property(thatLocator, "memo", rhsMemo), lhsMemo, rhsMemo, (this.memo!= null), (that.memo!= null))) {
                return false;
            }
        }
        {
            GlobalTaxCalculationEnum lhsGlobalTaxCalculation;
            lhsGlobalTaxCalculation = this.getGlobalTaxCalculation();
            GlobalTaxCalculationEnum rhsGlobalTaxCalculation;
            rhsGlobalTaxCalculation = that.getGlobalTaxCalculation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "globalTaxCalculation", lhsGlobalTaxCalculation), LocatorUtils.property(thatLocator, "globalTaxCalculation", rhsGlobalTaxCalculation), lhsGlobalTaxCalculation, rhsGlobalTaxCalculation, (this.globalTaxCalculation!= null), (that.globalTaxCalculation!= null))) {
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
            ReferenceType theVendorRef;
            theVendorRef = this.getVendorRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vendorRef", theVendorRef), currentHashCode, theVendorRef, (this.vendorRef!= null));
        }
        {
            ReferenceType theAPAccountRef;
            theAPAccountRef = this.getAPAccountRef();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "apAccountRef", theAPAccountRef), currentHashCode, theAPAccountRef, (this.apAccountRef!= null));
        }
        {
            BigDecimal theTotalAmt;
            theTotalAmt = this.getTotalAmt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalAmt", theTotalAmt), currentHashCode, theTotalAmt, (this.totalAmt!= null));
        }
        {
            EmailAddress theBillEmail;
            theBillEmail = this.getBillEmail();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "billEmail", theBillEmail), currentHashCode, theBillEmail, (this.billEmail!= null));
        }
        {
            EmailAddress theReplyEmail;
            theReplyEmail = this.getReplyEmail();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "replyEmail", theReplyEmail), currentHashCode, theReplyEmail, (this.replyEmail!= null));
        }
        {
            String theMemo;
            theMemo = this.getMemo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "memo", theMemo), currentHashCode, theMemo, (this.memo!= null));
        }
        {
            GlobalTaxCalculationEnum theGlobalTaxCalculation;
            theGlobalTaxCalculation = this.getGlobalTaxCalculation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "globalTaxCalculation", theGlobalTaxCalculation), currentHashCode, theGlobalTaxCalculation, (this.globalTaxCalculation!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
