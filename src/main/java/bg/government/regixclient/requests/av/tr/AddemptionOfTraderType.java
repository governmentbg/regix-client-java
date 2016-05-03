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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddemptionOfTraderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddemptionOfTraderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Address" type="{http://egov.bg/RegiX/AV/TR}AddressType" minOccurs="0"/>
 *         &lt;element name="Contacts" type="{http://egov.bg/RegiX/AV/TR}ContactsType" minOccurs="0"/>
 *         &lt;element name="CompetentAuthorityForRegistration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddemptionOfTraderType", propOrder = {
    "address",
    "contacts",
    "competentAuthorityForRegistration",
    "registrationNumber"
})
public class AddemptionOfTraderType {

    @XmlElement(name = "Address")
    protected AddressType address;
    @XmlElement(name = "Contacts")
    protected ContactsType contacts;
    @XmlElement(name = "CompetentAuthorityForRegistration")
    protected String competentAuthorityForRegistration;
    @XmlElement(name = "RegistrationNumber")
    protected String registrationNumber;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddress(AddressType value) {
        this.address = value;
    }

    /**
     * Gets the value of the contacts property.
     * 
     * @return
     *     possible object is
     *     {@link ContactsType }
     *     
     */
    public ContactsType getContacts() {
        return contacts;
    }

    /**
     * Sets the value of the contacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactsType }
     *     
     */
    public void setContacts(ContactsType value) {
        this.contacts = value;
    }

    /**
     * Gets the value of the competentAuthorityForRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompetentAuthorityForRegistration() {
        return competentAuthorityForRegistration;
    }

    /**
     * Sets the value of the competentAuthorityForRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompetentAuthorityForRegistration(String value) {
        this.competentAuthorityForRegistration = value;
    }

    /**
     * Gets the value of the registrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Sets the value of the registrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationNumber(String value) {
        this.registrationNumber = value;
    }

}
