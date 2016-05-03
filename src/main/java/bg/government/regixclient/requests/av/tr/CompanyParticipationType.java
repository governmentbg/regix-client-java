//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.05.03 at 11:48:44 PM EEST 
//


package bg.government.regixclient.requests.av.tr;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompanyParticipationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyParticipationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Company" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="EIK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LegalForm" type="{http://egov.bg/RegiX/AV/TR}LegalFormType" minOccurs="0"/>
 *                   &lt;element name="Fields" type="{http://egov.bg/RegiX/AV/TR}FieldsType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyParticipationType", propOrder = {
    "company"
})
public class CompanyParticipationType {

    @XmlElement(name = "Company")
    protected List<CompanyParticipationType.Company> company;

    /**
     * Gets the value of the company property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the company property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompany().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompanyParticipationType.Company }
     * 
     * 
     */
    public List<CompanyParticipationType.Company> getCompany() {
        if (company == null) {
            company = new ArrayList<CompanyParticipationType.Company>();
        }
        return this.company;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="EIK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LegalForm" type="{http://egov.bg/RegiX/AV/TR}LegalFormType" minOccurs="0"/>
     *         &lt;element name="Fields" type="{http://egov.bg/RegiX/AV/TR}FieldsType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "eik",
        "companyName",
        "legalForm",
        "fields"
    })
    public static class Company {

        @XmlElement(name = "EIK")
        protected String eik;
        @XmlElement(name = "CompanyName")
        protected String companyName;
        @XmlElement(name = "LegalForm")
        protected LegalFormType legalForm;
        @XmlElement(name = "Fields")
        protected FieldsType fields;

        /**
         * Gets the value of the eik property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEIK() {
            return eik;
        }

        /**
         * Sets the value of the eik property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEIK(String value) {
            this.eik = value;
        }

        /**
         * Gets the value of the companyName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCompanyName() {
            return companyName;
        }

        /**
         * Sets the value of the companyName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCompanyName(String value) {
            this.companyName = value;
        }

        /**
         * Gets the value of the legalForm property.
         * 
         * @return
         *     possible object is
         *     {@link LegalFormType }
         *     
         */
        public LegalFormType getLegalForm() {
            return legalForm;
        }

        /**
         * Sets the value of the legalForm property.
         * 
         * @param value
         *     allowed object is
         *     {@link LegalFormType }
         *     
         */
        public void setLegalForm(LegalFormType value) {
            this.legalForm = value;
        }

        /**
         * Gets the value of the fields property.
         * 
         * @return
         *     possible object is
         *     {@link FieldsType }
         *     
         */
        public FieldsType getFields() {
            return fields;
        }

        /**
         * Sets the value of the fields property.
         * 
         * @param value
         *     allowed object is
         *     {@link FieldsType }
         *     
         */
        public void setFields(FieldsType value) {
            this.fields = value;
        }

    }

}
