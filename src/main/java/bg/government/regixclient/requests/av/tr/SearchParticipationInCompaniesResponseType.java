//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.03 at 11:48:44 PM EEST 
//


package bg.government.regixclient.requests.av.tr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SearchParticipationInCompaniesResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchParticipationInCompaniesResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IsFound" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PersonInformation" type="{http://egov.bg/RegiX/AV/TR}SubjectType" minOccurs="0"/>
 *         &lt;element name="CompanyParticipation" type="{http://egov.bg/RegiX/AV/TR}CompanyParticipationType" minOccurs="0"/>
 *         &lt;element name="DataValidForDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchParticipationInCompaniesResponseType", namespace = "http://egov.bg/RegiX/AV/TR/SearchParticipationInCompaniesResponse", propOrder = {
    "isFound",
    "personInformation",
    "companyParticipation",
    "dataValidForDate"
})
public class SearchParticipationInCompaniesResponseType {

    @XmlElement(name = "IsFound")
    protected Boolean isFound;
    @XmlElement(name = "PersonInformation")
    protected SubjectType personInformation;
    @XmlElement(name = "CompanyParticipation")
    protected CompanyParticipationType companyParticipation;
    @XmlElement(name = "DataValidForDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataValidForDate;

    /**
     * Gets the value of the isFound property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFound() {
        return isFound;
    }

    /**
     * Sets the value of the isFound property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFound(Boolean value) {
        this.isFound = value;
    }

    /**
     * Gets the value of the personInformation property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectType }
     *     
     */
    public SubjectType getPersonInformation() {
        return personInformation;
    }

    /**
     * Sets the value of the personInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectType }
     *     
     */
    public void setPersonInformation(SubjectType value) {
        this.personInformation = value;
    }

    /**
     * Gets the value of the companyParticipation property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyParticipationType }
     *     
     */
    public CompanyParticipationType getCompanyParticipation() {
        return companyParticipation;
    }

    /**
     * Sets the value of the companyParticipation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyParticipationType }
     *     
     */
    public void setCompanyParticipation(CompanyParticipationType value) {
        this.companyParticipation = value;
    }

    /**
     * Gets the value of the dataValidForDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataValidForDate() {
        return dataValidForDate;
    }

    /**
     * Sets the value of the dataValidForDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataValidForDate(XMLGregorianCalendar value) {
        this.dataValidForDate = value;
    }

}
