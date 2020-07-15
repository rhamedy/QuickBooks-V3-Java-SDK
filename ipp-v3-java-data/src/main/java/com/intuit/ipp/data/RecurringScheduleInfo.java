//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.07.15 at 03:58:30 PM PDT 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.intuit.sb.cdm.util.v3.DateAdapter;
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
 * 				Scheduling Information for the Transaction
 * 			
 * 
 * <p>Java class for RecurringScheduleInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecurringScheduleInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IntervalType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumInterval" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DayOfMonth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DayOfWeek" type="{http://schema.intuit.com/finance/v3}WeekEnum" minOccurs="0"/&gt;
 *         &lt;element name="WeekOfMonth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MonthOfYear" type="{http://schema.intuit.com/finance/v3}MonthEnum" minOccurs="0"/&gt;
 *         &lt;element name="RemindDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DaysBefore" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MaxOccurrences" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="NextDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="PreviousDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecurringScheduleInfo", propOrder = {
    "intervalType",
    "numInterval",
    "dayOfMonth",
    "dayOfWeek",
    "weekOfMonth",
    "monthOfYear",
    "remindDays",
    "daysBefore",
    "maxOccurrences",
    "startDate",
    "endDate",
    "nextDate",
    "previousDate"
})
public class RecurringScheduleInfo implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "IntervalType")
    protected String intervalType;
    @XmlElement(name = "NumInterval")
    protected Integer numInterval;
    @XmlElement(name = "DayOfMonth")
    protected Integer dayOfMonth;
    @XmlElement(name = "DayOfWeek")
    @XmlSchemaType(name = "string")
    protected WeekEnum dayOfWeek;
    @XmlElement(name = "WeekOfMonth")
    protected Integer weekOfMonth;
    @XmlElement(name = "MonthOfYear")
    @XmlSchemaType(name = "string")
    protected MonthEnum monthOfYear;
    @XmlElement(name = "RemindDays")
    protected Integer remindDays;
    @XmlElement(name = "DaysBefore")
    protected Integer daysBefore;
    @XmlElement(name = "MaxOccurrences")
    protected Integer maxOccurrences;
    @XmlElement(name = "StartDate", type = String.class)
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date startDate;
    @XmlElement(name = "EndDate", type = String.class)
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date endDate;
    @XmlElement(name = "NextDate", type = String.class)
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date nextDate;
    @XmlElement(name = "PreviousDate", type = String.class)
    @XmlJavaTypeAdapter(DateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date previousDate;

    /**
     * Gets the value of the intervalType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntervalType() {
        return intervalType;
    }

    /**
     * Sets the value of the intervalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntervalType(String value) {
        this.intervalType = value;
    }

    /**
     * Gets the value of the numInterval property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumInterval() {
        return numInterval;
    }

    /**
     * Sets the value of the numInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumInterval(Integer value) {
        this.numInterval = value;
    }

    /**
     * Gets the value of the dayOfMonth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDayOfMonth() {
        return dayOfMonth;
    }

    /**
     * Sets the value of the dayOfMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDayOfMonth(Integer value) {
        this.dayOfMonth = value;
    }

    /**
     * Gets the value of the dayOfWeek property.
     * 
     * @return
     *     possible object is
     *     {@link WeekEnum }
     *     
     */
    public WeekEnum getDayOfWeek() {
        return dayOfWeek;
    }

    /**
     * Sets the value of the dayOfWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeekEnum }
     *     
     */
    public void setDayOfWeek(WeekEnum value) {
        this.dayOfWeek = value;
    }

    /**
     * Gets the value of the weekOfMonth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWeekOfMonth() {
        return weekOfMonth;
    }

    /**
     * Sets the value of the weekOfMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWeekOfMonth(Integer value) {
        this.weekOfMonth = value;
    }

    /**
     * Gets the value of the monthOfYear property.
     * 
     * @return
     *     possible object is
     *     {@link MonthEnum }
     *     
     */
    public MonthEnum getMonthOfYear() {
        return monthOfYear;
    }

    /**
     * Sets the value of the monthOfYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonthEnum }
     *     
     */
    public void setMonthOfYear(MonthEnum value) {
        this.monthOfYear = value;
    }

    /**
     * Gets the value of the remindDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRemindDays() {
        return remindDays;
    }

    /**
     * Sets the value of the remindDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRemindDays(Integer value) {
        this.remindDays = value;
    }

    /**
     * Gets the value of the daysBefore property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDaysBefore() {
        return daysBefore;
    }

    /**
     * Sets the value of the daysBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDaysBefore(Integer value) {
        this.daysBefore = value;
    }

    /**
     * Gets the value of the maxOccurrences property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxOccurrences() {
        return maxOccurrences;
    }

    /**
     * Sets the value of the maxOccurrences property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxOccurrences(Integer value) {
        this.maxOccurrences = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(Date value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the nextDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getNextDate() {
        return nextDate;
    }

    /**
     * Sets the value of the nextDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextDate(Date value) {
        this.nextDate = value;
    }

    /**
     * Gets the value of the previousDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getPreviousDate() {
        return previousDate;
    }

    /**
     * Sets the value of the previousDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousDate(Date value) {
        this.previousDate = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final RecurringScheduleInfo that = ((RecurringScheduleInfo) object);
        {
            String lhsIntervalType;
            lhsIntervalType = this.getIntervalType();
            String rhsIntervalType;
            rhsIntervalType = that.getIntervalType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "intervalType", lhsIntervalType), LocatorUtils.property(thatLocator, "intervalType", rhsIntervalType), lhsIntervalType, rhsIntervalType, (this.intervalType!= null), (that.intervalType!= null))) {
                return false;
            }
        }
        {
            Integer lhsNumInterval;
            lhsNumInterval = this.getNumInterval();
            Integer rhsNumInterval;
            rhsNumInterval = that.getNumInterval();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "numInterval", lhsNumInterval), LocatorUtils.property(thatLocator, "numInterval", rhsNumInterval), lhsNumInterval, rhsNumInterval, (this.numInterval!= null), (that.numInterval!= null))) {
                return false;
            }
        }
        {
            Integer lhsDayOfMonth;
            lhsDayOfMonth = this.getDayOfMonth();
            Integer rhsDayOfMonth;
            rhsDayOfMonth = that.getDayOfMonth();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dayOfMonth", lhsDayOfMonth), LocatorUtils.property(thatLocator, "dayOfMonth", rhsDayOfMonth), lhsDayOfMonth, rhsDayOfMonth, (this.dayOfMonth!= null), (that.dayOfMonth!= null))) {
                return false;
            }
        }
        {
            WeekEnum lhsDayOfWeek;
            lhsDayOfWeek = this.getDayOfWeek();
            WeekEnum rhsDayOfWeek;
            rhsDayOfWeek = that.getDayOfWeek();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dayOfWeek", lhsDayOfWeek), LocatorUtils.property(thatLocator, "dayOfWeek", rhsDayOfWeek), lhsDayOfWeek, rhsDayOfWeek, (this.dayOfWeek!= null), (that.dayOfWeek!= null))) {
                return false;
            }
        }
        {
            Integer lhsWeekOfMonth;
            lhsWeekOfMonth = this.getWeekOfMonth();
            Integer rhsWeekOfMonth;
            rhsWeekOfMonth = that.getWeekOfMonth();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "weekOfMonth", lhsWeekOfMonth), LocatorUtils.property(thatLocator, "weekOfMonth", rhsWeekOfMonth), lhsWeekOfMonth, rhsWeekOfMonth, (this.weekOfMonth!= null), (that.weekOfMonth!= null))) {
                return false;
            }
        }
        {
            MonthEnum lhsMonthOfYear;
            lhsMonthOfYear = this.getMonthOfYear();
            MonthEnum rhsMonthOfYear;
            rhsMonthOfYear = that.getMonthOfYear();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "monthOfYear", lhsMonthOfYear), LocatorUtils.property(thatLocator, "monthOfYear", rhsMonthOfYear), lhsMonthOfYear, rhsMonthOfYear, (this.monthOfYear!= null), (that.monthOfYear!= null))) {
                return false;
            }
        }
        {
            Integer lhsRemindDays;
            lhsRemindDays = this.getRemindDays();
            Integer rhsRemindDays;
            rhsRemindDays = that.getRemindDays();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "remindDays", lhsRemindDays), LocatorUtils.property(thatLocator, "remindDays", rhsRemindDays), lhsRemindDays, rhsRemindDays, (this.remindDays!= null), (that.remindDays!= null))) {
                return false;
            }
        }
        {
            Integer lhsDaysBefore;
            lhsDaysBefore = this.getDaysBefore();
            Integer rhsDaysBefore;
            rhsDaysBefore = that.getDaysBefore();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "daysBefore", lhsDaysBefore), LocatorUtils.property(thatLocator, "daysBefore", rhsDaysBefore), lhsDaysBefore, rhsDaysBefore, (this.daysBefore!= null), (that.daysBefore!= null))) {
                return false;
            }
        }
        {
            Integer lhsMaxOccurrences;
            lhsMaxOccurrences = this.getMaxOccurrences();
            Integer rhsMaxOccurrences;
            rhsMaxOccurrences = that.getMaxOccurrences();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxOccurrences", lhsMaxOccurrences), LocatorUtils.property(thatLocator, "maxOccurrences", rhsMaxOccurrences), lhsMaxOccurrences, rhsMaxOccurrences, (this.maxOccurrences!= null), (that.maxOccurrences!= null))) {
                return false;
            }
        }
        {
            Date lhsStartDate;
            lhsStartDate = this.getStartDate();
            Date rhsStartDate;
            rhsStartDate = that.getStartDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "startDate", lhsStartDate), LocatorUtils.property(thatLocator, "startDate", rhsStartDate), lhsStartDate, rhsStartDate, (this.startDate!= null), (that.startDate!= null))) {
                return false;
            }
        }
        {
            Date lhsEndDate;
            lhsEndDate = this.getEndDate();
            Date rhsEndDate;
            rhsEndDate = that.getEndDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "endDate", lhsEndDate), LocatorUtils.property(thatLocator, "endDate", rhsEndDate), lhsEndDate, rhsEndDate, (this.endDate!= null), (that.endDate!= null))) {
                return false;
            }
        }
        {
            Date lhsNextDate;
            lhsNextDate = this.getNextDate();
            Date rhsNextDate;
            rhsNextDate = that.getNextDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nextDate", lhsNextDate), LocatorUtils.property(thatLocator, "nextDate", rhsNextDate), lhsNextDate, rhsNextDate, (this.nextDate!= null), (that.nextDate!= null))) {
                return false;
            }
        }
        {
            Date lhsPreviousDate;
            lhsPreviousDate = this.getPreviousDate();
            Date rhsPreviousDate;
            rhsPreviousDate = that.getPreviousDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "previousDate", lhsPreviousDate), LocatorUtils.property(thatLocator, "previousDate", rhsPreviousDate), lhsPreviousDate, rhsPreviousDate, (this.previousDate!= null), (that.previousDate!= null))) {
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
            String theIntervalType;
            theIntervalType = this.getIntervalType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "intervalType", theIntervalType), currentHashCode, theIntervalType, (this.intervalType!= null));
        }
        {
            Integer theNumInterval;
            theNumInterval = this.getNumInterval();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "numInterval", theNumInterval), currentHashCode, theNumInterval, (this.numInterval!= null));
        }
        {
            Integer theDayOfMonth;
            theDayOfMonth = this.getDayOfMonth();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dayOfMonth", theDayOfMonth), currentHashCode, theDayOfMonth, (this.dayOfMonth!= null));
        }
        {
            WeekEnum theDayOfWeek;
            theDayOfWeek = this.getDayOfWeek();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dayOfWeek", theDayOfWeek), currentHashCode, theDayOfWeek, (this.dayOfWeek!= null));
        }
        {
            Integer theWeekOfMonth;
            theWeekOfMonth = this.getWeekOfMonth();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "weekOfMonth", theWeekOfMonth), currentHashCode, theWeekOfMonth, (this.weekOfMonth!= null));
        }
        {
            MonthEnum theMonthOfYear;
            theMonthOfYear = this.getMonthOfYear();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "monthOfYear", theMonthOfYear), currentHashCode, theMonthOfYear, (this.monthOfYear!= null));
        }
        {
            Integer theRemindDays;
            theRemindDays = this.getRemindDays();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "remindDays", theRemindDays), currentHashCode, theRemindDays, (this.remindDays!= null));
        }
        {
            Integer theDaysBefore;
            theDaysBefore = this.getDaysBefore();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "daysBefore", theDaysBefore), currentHashCode, theDaysBefore, (this.daysBefore!= null));
        }
        {
            Integer theMaxOccurrences;
            theMaxOccurrences = this.getMaxOccurrences();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxOccurrences", theMaxOccurrences), currentHashCode, theMaxOccurrences, (this.maxOccurrences!= null));
        }
        {
            Date theStartDate;
            theStartDate = this.getStartDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "startDate", theStartDate), currentHashCode, theStartDate, (this.startDate!= null));
        }
        {
            Date theEndDate;
            theEndDate = this.getEndDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "endDate", theEndDate), currentHashCode, theEndDate, (this.endDate!= null));
        }
        {
            Date theNextDate;
            theNextDate = this.getNextDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nextDate", theNextDate), currentHashCode, theNextDate, (this.nextDate!= null));
        }
        {
            Date thePreviousDate;
            thePreviousDate = this.getPreviousDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "previousDate", thePreviousDate), currentHashCode, thePreviousDate, (this.previousDate!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
