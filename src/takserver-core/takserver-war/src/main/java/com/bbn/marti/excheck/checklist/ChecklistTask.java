//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.18 at 10:16:56 AM EST 
//


package com.bbn.marti.excheck.checklist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for checklistTask complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="checklistTask">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lineBreak" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="bgColor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="status" type="{}checklistTaskStatus" minOccurs="0"/>
 *         &lt;element name="completeBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="completeDTG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dueRelativeTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dueDTG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lineBreakText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checklistTask", propOrder = {
    "lineBreak",
    "bgColor",
    "number",
    "uid",
    "value",
    "status",
    "completeBy",
    "completeDTG",
    "notes",
    "dueRelativeTime",
    "dueDTG",
    "lineBreakText"
})
@XmlRootElement(name = "checklistTask")
public class ChecklistTask {

    protected boolean lineBreak;
    @XmlElement(required = true)
    protected String bgColor;
    protected int number;
    @XmlElement(required = true)
    protected String uid;
    @XmlElement(required = true)
    protected List<String> value;
    @XmlSchemaType(name = "string")
    protected ChecklistTaskStatus status = ChecklistTaskStatus.PENDING;
    protected String completeBy;
    protected String completeDTG;
    protected String notes;
    protected String dueRelativeTime;
    protected String dueDTG;
    protected String lineBreakText;

    /**
     * Gets the value of the lineBreak property.
     * 
     */
    public boolean isLineBreak() {
        return lineBreak;
    }

    /**
     * Sets the value of the lineBreak property.
     * 
     */
    public void setLineBreak(boolean value) {
        this.lineBreak = value;
    }

    /**
     * Gets the value of the bgColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBgColor() {
        return bgColor;
    }

    /**
     * Sets the value of the bgColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBgColor(String value) {
        this.bgColor = value;
    }

    /**
     * Gets the value of the number property.
     * 
     */
    public int getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     */
    public void setNumber(int value) {
        this.number = value;
    }

    /**
     * Gets the value of the uid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUid() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUid(String value) {
        this.uid = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the value property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getValue() {
        if (value == null) {
            value = new ArrayList<String>();
        }
        return this.value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ChecklistTaskStatus }
     *     
     */
    public ChecklistTaskStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChecklistTaskStatus }
     *     
     */
    public void setStatus(ChecklistTaskStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the completeBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompleteBy() {
        return completeBy;
    }

    /**
     * Sets the value of the completeBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompleteBy(String value) {
        this.completeBy = value;
    }

    /**
     * Gets the value of the completeDTG property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompleteDTG() {
        return completeDTG;
    }

    /**
     * Sets the value of the completeDTG property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompleteDTG(String value) {
        this.completeDTG = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the dueRelativeTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDueRelativeTime() {
        return dueRelativeTime;
    }

    /**
     * Sets the value of the dueRelativeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDueRelativeTime(String value) {
        this.dueRelativeTime = value;
    }

    /**
     * Gets the value of the dueDTG property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDueDTG() {
        return dueDTG;
    }

    /**
     * Sets the value of the dueDTG property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDueDTG(String value) {
        this.dueDTG = value;
    }

    /**
     * Gets the value of the lineBreakText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineBreakText() {
        return lineBreakText;
    }

    /**
     * Sets the value of the lineBreakText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineBreakText(String value) {
        this.lineBreakText = value;
    }

}