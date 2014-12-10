//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2014.12.03 à 05:38:14 PM CET 
//


package jaxb.metier.generated;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conference" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="edition">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="acronyme" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="titre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ville" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="pays" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="dateDebut" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="dateFin" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="presidents">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="typeArticles">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="type" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                               &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="statistiques">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="acceptations" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>byte">
 *                                               &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="soumissions" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="siteWeb" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *                             &lt;element name="meilleurArticle">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="articleId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="articles">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="article" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                                       &lt;element name="auteurs">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="auteur" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                                                           &lt;element name="affiliationId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="affiliations">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="affiliation" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;simpleContent>
 *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                         &lt;attribute name="affiliationId" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *                                                       &lt;/extension>
 *                                                     &lt;/simpleContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="titre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="pages" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="resume" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="mots_cles" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="abstract" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="keywords" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="appartenance">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="affiliation" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/choice>
 *                                     &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="session" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
@XmlType(name = "", propOrder = {
    "conference"
})
@XmlRootElement(name = "conferences")
public class Conferences {

    protected List<Conferences.Conference> conference;

    /**
     * Gets the value of the conference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Conferences.Conference }
     * 
     * 
     */
    public List<Conferences.Conference> getConference() {
        if (conference == null) {
            conference = new ArrayList<Conferences.Conference>();
        }
        return this.conference;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="edition">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="acronyme" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="titre" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ville" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="pays" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="dateDebut" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="dateFin" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="presidents">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="typeArticles">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="type" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="statistiques">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="acceptations" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>byte">
     *                                     &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="soumissions" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="siteWeb" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
     *                   &lt;element name="meilleurArticle">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="articleId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="articles">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="article" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;choice maxOccurs="unbounded" minOccurs="0">
     *                             &lt;element name="auteurs">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="auteur" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                                                 &lt;element name="affiliationId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="affiliations">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="affiliation" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;simpleContent>
     *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                               &lt;attribute name="affiliationId" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *                                             &lt;/extension>
     *                                           &lt;/simpleContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="titre" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="pages" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="resume" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="mots_cles" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="abstract" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="keywords" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="appartenance">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="affiliation" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/choice>
     *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="session" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
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
    @XmlType(name = "", propOrder = {
        "edition",
        "articles"
    })
    public static class Conference {

        @XmlElement(required = true)
        protected Conferences.Conference.Edition edition;
        @XmlElement(required = true)
        protected Conferences.Conference.Articles articles;

        /**
         * Obtient la valeur de la propriété edition.
         * 
         * @return
         *     possible object is
         *     {@link Conferences.Conference.Edition }
         *     
         */
        public Conferences.Conference.Edition getEdition() {
            return edition;
        }

        /**
         * Définit la valeur de la propriété edition.
         * 
         * @param value
         *     allowed object is
         *     {@link Conferences.Conference.Edition }
         *     
         */
        public void setEdition(Conferences.Conference.Edition value) {
            this.edition = value;
        }

        /**
         * Obtient la valeur de la propriété articles.
         * 
         * @return
         *     possible object is
         *     {@link Conferences.Conference.Articles }
         *     
         */
        public Conferences.Conference.Articles getArticles() {
            return articles;
        }

        /**
         * Définit la valeur de la propriété articles.
         * 
         * @param value
         *     allowed object is
         *     {@link Conferences.Conference.Articles }
         *     
         */
        public void setArticles(Conferences.Conference.Articles value) {
            this.articles = value;
        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="article" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;choice maxOccurs="unbounded" minOccurs="0">
         *                   &lt;element name="auteurs">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="auteur" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *                                       &lt;element name="affiliationId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="affiliations">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="affiliation" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;simpleContent>
         *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                     &lt;attribute name="affiliationId" type="{http://www.w3.org/2001/XMLSchema}byte" />
         *                                   &lt;/extension>
         *                                 &lt;/simpleContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="titre" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="pages" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="resume" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="mots_cles" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="abstract" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="keywords" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="appartenance">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="affiliation" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/choice>
         *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="session" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        @XmlType(name = "", propOrder = {
            "article"
        })
        public static class Articles {

            protected List<Conferences.Conference.Articles.Article> article;

            /**
             * Gets the value of the article property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the article property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getArticle().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Conferences.Conference.Articles.Article }
             * 
             * 
             */
            public List<Conferences.Conference.Articles.Article> getArticle() {
                if (article == null) {
                    article = new ArrayList<Conferences.Conference.Articles.Article>();
                }
                return this.article;
            }


            /**
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;choice maxOccurs="unbounded" minOccurs="0">
             *         &lt;element name="auteurs">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="auteur" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
             *                             &lt;element name="affiliationId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="affiliations">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="affiliation" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;simpleContent>
             *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                           &lt;attribute name="affiliationId" type="{http://www.w3.org/2001/XMLSchema}byte" />
             *                         &lt;/extension>
             *                       &lt;/simpleContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="titre" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="pages" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="resume" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="mots_cles" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="abstract" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="keywords" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="appartenance">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="affiliation" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/choice>
             *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="session" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "auteursOrAffiliationsOrTitre"
            })
            public static class Article {

                @XmlElementRefs({
                    @XmlElementRef(name = "keywords", type = JAXBElement.class, required = false),
                    @XmlElementRef(name = "resume", type = JAXBElement.class, required = false),
                    @XmlElementRef(name = "appartenance", type = JAXBElement.class, required = false),
                    @XmlElementRef(name = "abstract", type = JAXBElement.class, required = false),
                    @XmlElementRef(name = "titre", type = JAXBElement.class, required = false),
                    @XmlElementRef(name = "pages", type = JAXBElement.class, required = false),
                    @XmlElementRef(name = "affiliations", type = JAXBElement.class, required = false),
                    @XmlElementRef(name = "type", type = JAXBElement.class, required = false),
                    @XmlElementRef(name = "mots_cles", type = JAXBElement.class, required = false),
                    @XmlElementRef(name = "auteurs", type = JAXBElement.class, required = false),
                    @XmlElementRef(name = "title", type = JAXBElement.class, required = false)
                })
                protected List<JAXBElement<?>> auteursOrAffiliationsOrTitre;
                @XmlAttribute(name = "id")
                protected String id;
                @XmlAttribute(name = "session")
                protected String session;

                /**
                 * Gets the value of the auteursOrAffiliationsOrTitre property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the auteursOrAffiliationsOrTitre property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getAuteursOrAffiliationsOrTitre().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link JAXBElement }{@code <}{@link String }{@code >}
                 * {@link JAXBElement }{@code <}{@link String }{@code >}
                 * {@link JAXBElement }{@code <}{@link Conferences.Conference.Articles.Article.Appartenance }{@code >}
                 * {@link JAXBElement }{@code <}{@link String }{@code >}
                 * {@link JAXBElement }{@code <}{@link String }{@code >}
                 * {@link JAXBElement }{@code <}{@link String }{@code >}
                 * {@link JAXBElement }{@code <}{@link Conferences.Conference.Articles.Article.Affiliations }{@code >}
                 * {@link JAXBElement }{@code <}{@link String }{@code >}
                 * {@link JAXBElement }{@code <}{@link String }{@code >}
                 * {@link JAXBElement }{@code <}{@link Conferences.Conference.Articles.Article.Auteurs }{@code >}
                 * {@link JAXBElement }{@code <}{@link String }{@code >}
                 * 
                 * 
                 */
                public List<JAXBElement<?>> getAuteursOrAffiliationsOrTitre() {
                    if (auteursOrAffiliationsOrTitre == null) {
                        auteursOrAffiliationsOrTitre = new ArrayList<JAXBElement<?>>();
                    }
                    return this.auteursOrAffiliationsOrTitre;
                }

                /**
                 * Obtient la valeur de la propriété id.
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
                 * Définit la valeur de la propriété id.
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
                 * Obtient la valeur de la propriété session.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSession() {
                    return session;
                }

                /**
                 * Définit la valeur de la propriété session.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSession(String value) {
                    this.session = value;
                }


                /**
                 * <p>Classe Java pour anonymous complex type.
                 * 
                 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="affiliation" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;simpleContent>
                 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                 &lt;attribute name="affiliationId" type="{http://www.w3.org/2001/XMLSchema}byte" />
                 *               &lt;/extension>
                 *             &lt;/simpleContent>
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
                @XmlType(name = "", propOrder = {
                    "content"
                })
                public static class Affiliations {

                    @XmlElementRef(name = "affiliation", type = JAXBElement.class, required = false)
                    @XmlMixed
                    protected List<Serializable> content;

                    /**
                     * Gets the value of the content property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the content property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getContent().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link String }
                     * {@link JAXBElement }{@code <}{@link Conferences.Conference.Articles.Article.Affiliations.Affiliation }{@code >}
                     * 
                     * 
                     */
                    public List<Serializable> getContent() {
                        if (content == null) {
                            content = new ArrayList<Serializable>();
                        }
                        return this.content;
                    }


                    /**
                     * <p>Classe Java pour anonymous complex type.
                     * 
                     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;simpleContent>
                     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                     *       &lt;attribute name="affiliationId" type="{http://www.w3.org/2001/XMLSchema}byte" />
                     *     &lt;/extension>
                     *   &lt;/simpleContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "value"
                    })
                    public static class Affiliation {

                        @XmlValue
                        protected String value;
                        @XmlAttribute(name = "affiliationId")
                        protected Byte affiliationId;

                        /**
                         * Obtient la valeur de la propriété value.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getValue() {
                            return value;
                        }

                        /**
                         * Définit la valeur de la propriété value.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setValue(String value) {
                            this.value = value;
                        }

                        /**
                         * Obtient la valeur de la propriété affiliationId.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Byte }
                         *     
                         */
                        public Byte getAffiliationId() {
                            return affiliationId;
                        }

                        /**
                         * Définit la valeur de la propriété affiliationId.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Byte }
                         *     
                         */
                        public void setAffiliationId(Byte value) {
                            this.affiliationId = value;
                        }

                    }

                }


                /**
                 * <p>Classe Java pour anonymous complex type.
                 * 
                 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="affiliation" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
                    "affiliation"
                })
                public static class Appartenance {

                    protected List<String> affiliation;

                    /**
                     * Gets the value of the affiliation property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the affiliation property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getAffiliation().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link String }
                     * 
                     * 
                     */
                    public List<String> getAffiliation() {
                        if (affiliation == null) {
                            affiliation = new ArrayList<String>();
                        }
                        return this.affiliation;
                    }

                }


                /**
                 * <p>Classe Java pour anonymous complex type.
                 * 
                 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="auteur" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
                 *                   &lt;element name="affiliationId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
                @XmlType(name = "", propOrder = {
                    "auteur"
                })
                public static class Auteurs {

                    protected List<Conferences.Conference.Articles.Article.Auteurs.Auteur> auteur;

                    /**
                     * Gets the value of the auteur property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the auteur property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getAuteur().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Conferences.Conference.Articles.Article.Auteurs.Auteur }
                     * 
                     * 
                     */
                    public List<Conferences.Conference.Articles.Article.Auteurs.Auteur> getAuteur() {
                        if (auteur == null) {
                            auteur = new ArrayList<Conferences.Conference.Articles.Article.Auteurs.Auteur>();
                        }
                        return this.auteur;
                    }


                    /**
                     * <p>Classe Java pour anonymous complex type.
                     * 
                     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
                     *         &lt;element name="affiliationId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
                        "nom",
                        "email",
                        "affiliationId"
                    })
                    public static class Auteur {

                        @XmlElement(required = true)
                        protected String nom;
                        protected List<String> email;
                        protected List<String> affiliationId;

                        /**
                         * Obtient la valeur de la propriété nom.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getNom() {
                            return nom;
                        }

                        /**
                         * Définit la valeur de la propriété nom.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setNom(String value) {
                            this.nom = value;
                        }

                        /**
                         * Gets the value of the email property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the email property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getEmail().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link String }
                         * 
                         * 
                         */
                        public List<String> getEmail() {
                            if (email == null) {
                                email = new ArrayList<String>();
                            }
                            return this.email;
                        }

                        /**
                         * Gets the value of the affiliationId property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the affiliationId property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getAffiliationId().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link String }
                         * 
                         * 
                         */
                        public List<String> getAffiliationId() {
                            if (affiliationId == null) {
                                affiliationId = new ArrayList<String>();
                            }
                            return this.affiliationId;
                        }

                    }

                }

            }

        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="acronyme" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="titre" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ville" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="pays" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="dateDebut" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="dateFin" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="presidents">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="typeArticles">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="type" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="statistiques">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="acceptations" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>byte">
         *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="soumissions" type="{http://www.w3.org/2001/XMLSchema}byte" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="siteWeb" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
         *         &lt;element name="meilleurArticle">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="articleId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        @XmlType(name = "", propOrder = {
            "acronyme",
            "titre",
            "ville",
            "pays",
            "dateDebut",
            "dateFin",
            "presidents",
            "typeArticles",
            "statistiques",
            "siteWeb",
            "meilleurArticle"
        })
        public static class Edition {

            @XmlElement(required = true)
            protected String acronyme;
            @XmlElement(required = true)
            protected String titre;
            @XmlElement(required = true)
            protected String ville;
            @XmlElement(required = true)
            protected String pays;
            @XmlElement(required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dateDebut;
            @XmlElement(required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dateFin;
            @XmlElement(required = true)
            protected Conferences.Conference.Edition.Presidents presidents;
            @XmlElement(required = true)
            protected Conferences.Conference.Edition.TypeArticles typeArticles;
            @XmlElement(required = true)
            protected Conferences.Conference.Edition.Statistiques statistiques;
            @XmlElement(required = true)
            @XmlSchemaType(name = "anyURI")
            protected String siteWeb;
            @XmlElement(required = true)
            protected Conferences.Conference.Edition.MeilleurArticle meilleurArticle;

            /**
             * Obtient la valeur de la propriété acronyme.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAcronyme() {
                return acronyme;
            }

            /**
             * Définit la valeur de la propriété acronyme.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAcronyme(String value) {
                this.acronyme = value;
            }

            /**
             * Obtient la valeur de la propriété titre.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTitre() {
                return titre;
            }

            /**
             * Définit la valeur de la propriété titre.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTitre(String value) {
                this.titre = value;
            }

            /**
             * Obtient la valeur de la propriété ville.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVille() {
                return ville;
            }

            /**
             * Définit la valeur de la propriété ville.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVille(String value) {
                this.ville = value;
            }

            /**
             * Obtient la valeur de la propriété pays.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPays() {
                return pays;
            }

            /**
             * Définit la valeur de la propriété pays.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPays(String value) {
                this.pays = value;
            }

            /**
             * Obtient la valeur de la propriété dateDebut.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDateDebut() {
                return dateDebut;
            }

            /**
             * Définit la valeur de la propriété dateDebut.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDateDebut(XMLGregorianCalendar value) {
                this.dateDebut = value;
            }

            /**
             * Obtient la valeur de la propriété dateFin.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDateFin() {
                return dateFin;
            }

            /**
             * Définit la valeur de la propriété dateFin.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDateFin(XMLGregorianCalendar value) {
                this.dateFin = value;
            }

            /**
             * Obtient la valeur de la propriété presidents.
             * 
             * @return
             *     possible object is
             *     {@link Conferences.Conference.Edition.Presidents }
             *     
             */
            public Conferences.Conference.Edition.Presidents getPresidents() {
                return presidents;
            }

            /**
             * Définit la valeur de la propriété presidents.
             * 
             * @param value
             *     allowed object is
             *     {@link Conferences.Conference.Edition.Presidents }
             *     
             */
            public void setPresidents(Conferences.Conference.Edition.Presidents value) {
                this.presidents = value;
            }

            /**
             * Obtient la valeur de la propriété typeArticles.
             * 
             * @return
             *     possible object is
             *     {@link Conferences.Conference.Edition.TypeArticles }
             *     
             */
            public Conferences.Conference.Edition.TypeArticles getTypeArticles() {
                return typeArticles;
            }

            /**
             * Définit la valeur de la propriété typeArticles.
             * 
             * @param value
             *     allowed object is
             *     {@link Conferences.Conference.Edition.TypeArticles }
             *     
             */
            public void setTypeArticles(Conferences.Conference.Edition.TypeArticles value) {
                this.typeArticles = value;
            }

            /**
             * Obtient la valeur de la propriété statistiques.
             * 
             * @return
             *     possible object is
             *     {@link Conferences.Conference.Edition.Statistiques }
             *     
             */
            public Conferences.Conference.Edition.Statistiques getStatistiques() {
                return statistiques;
            }

            /**
             * Définit la valeur de la propriété statistiques.
             * 
             * @param value
             *     allowed object is
             *     {@link Conferences.Conference.Edition.Statistiques }
             *     
             */
            public void setStatistiques(Conferences.Conference.Edition.Statistiques value) {
                this.statistiques = value;
            }

            /**
             * Obtient la valeur de la propriété siteWeb.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSiteWeb() {
                return siteWeb;
            }

            /**
             * Définit la valeur de la propriété siteWeb.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSiteWeb(String value) {
                this.siteWeb = value;
            }

            /**
             * Obtient la valeur de la propriété meilleurArticle.
             * 
             * @return
             *     possible object is
             *     {@link Conferences.Conference.Edition.MeilleurArticle }
             *     
             */
            public Conferences.Conference.Edition.MeilleurArticle getMeilleurArticle() {
                return meilleurArticle;
            }

            /**
             * Définit la valeur de la propriété meilleurArticle.
             * 
             * @param value
             *     allowed object is
             *     {@link Conferences.Conference.Edition.MeilleurArticle }
             *     
             */
            public void setMeilleurArticle(Conferences.Conference.Edition.MeilleurArticle value) {
                this.meilleurArticle = value;
            }


            /**
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="articleId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
                "articleId"
            })
            public static class MeilleurArticle {

                protected List<String> articleId;

                /**
                 * Gets the value of the articleId property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the articleId property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getArticleId().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getArticleId() {
                    if (articleId == null) {
                        articleId = new ArrayList<String>();
                    }
                    return this.articleId;
                }

            }


            /**
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
                "nom"
            })
            public static class Presidents {

                protected List<String> nom;

                /**
                 * Gets the value of the nom property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the nom property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getNom().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getNom() {
                    if (nom == null) {
                        nom = new ArrayList<String>();
                    }
                    return this.nom;
                }

            }


            /**
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="acceptations" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>byte">
             *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="soumissions" type="{http://www.w3.org/2001/XMLSchema}byte" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
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
            @XmlType(name = "", propOrder = {
                "content"
            })
            public static class Statistiques {

                @XmlElementRef(name = "acceptations", type = JAXBElement.class, required = false)
                @XmlMixed
                protected List<Serializable> content;

                /**
                 * Gets the value of the content property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the content property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getContent().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link JAXBElement }{@code <}{@link Conferences.Conference.Edition.Statistiques.Acceptations }{@code >}
                 * {@link String }
                 * 
                 * 
                 */
                public List<Serializable> getContent() {
                    if (content == null) {
                        content = new ArrayList<Serializable>();
                    }
                    return this.content;
                }


                /**
                 * <p>Classe Java pour anonymous complex type.
                 * 
                 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>byte">
                 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="soumissions" type="{http://www.w3.org/2001/XMLSchema}byte" />
                 *     &lt;/extension>
                 *   &lt;/simpleContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "value"
                })
                public static class Acceptations {

                    @XmlValue
                    protected byte value;
                    @XmlAttribute(name = "id")
                    protected String id;
                    @XmlAttribute(name = "soumissions")
                    protected Byte soumissions;

                    /**
                     * Obtient la valeur de la propriété value.
                     * 
                     */
                    public byte getValue() {
                        return value;
                    }

                    /**
                     * Définit la valeur de la propriété value.
                     * 
                     */
                    public void setValue(byte value) {
                        this.value = value;
                    }

                    /**
                     * Obtient la valeur de la propriété id.
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
                     * Définit la valeur de la propriété id.
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
                     * Obtient la valeur de la propriété soumissions.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Byte }
                     *     
                     */
                    public Byte getSoumissions() {
                        return soumissions;
                    }

                    /**
                     * Définit la valeur de la propriété soumissions.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Byte }
                     *     
                     */
                    public void setSoumissions(Byte value) {
                        this.soumissions = value;
                    }

                }

            }


            /**
             * <p>Classe Java pour anonymous complex type.
             * 
             * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="type" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
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
            @XmlType(name = "", propOrder = {
                "type"
            })
            public static class TypeArticles {

                protected List<Conferences.Conference.Edition.TypeArticles.Type> type;

                /**
                 * Gets the value of the type property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the type property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getType().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Conferences.Conference.Edition.TypeArticles.Type }
                 * 
                 * 
                 */
                public List<Conferences.Conference.Edition.TypeArticles.Type> getType() {
                    if (type == null) {
                        type = new ArrayList<Conferences.Conference.Edition.TypeArticles.Type>();
                    }
                    return this.type;
                }


                /**
                 * <p>Classe Java pour anonymous complex type.
                 * 
                 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/extension>
                 *   &lt;/simpleContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "value"
                })
                public static class Type {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "id")
                    protected String id;

                    /**
                     * Obtient la valeur de la propriété value.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getValue() {
                        return value;
                    }

                    /**
                     * Définit la valeur de la propriété value.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValue(String value) {
                        this.value = value;
                    }

                    /**
                     * Obtient la valeur de la propriété id.
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
                     * Définit la valeur de la propriété id.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setId(String value) {
                        this.id = value;
                    }

                }

            }

        }

    }

}
