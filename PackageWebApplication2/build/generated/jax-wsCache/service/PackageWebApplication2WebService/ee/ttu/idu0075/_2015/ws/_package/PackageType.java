
package ee.ttu.idu0075._2015.ws._package;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for packageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="packageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="monthPrice" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="requestCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="packageMemberList" type="{http://www.ttu.ee/idu0075/2015/ws/package}packageMemberListType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "packageType", propOrder = {
    "id",
    "name",
    "monthPrice",
    "requestCode",
    "packageMemberList"
})
public class PackageType {

    @XmlElement(required = true)
    protected BigInteger id;
    @XmlElement(required = true)
    protected String name;
    protected double monthPrice;
    @XmlElement(required = true)
    protected String requestCode;
    @XmlElement(required = true)
    protected PackageMemberListType packageMemberList;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the monthPrice property.
     * 
     */
    public double getMonthPrice() {
        return monthPrice;
    }

    /**
     * Sets the value of the monthPrice property.
     * 
     */
    public void setMonthPrice(double value) {
        this.monthPrice = value;
    }

    /**
     * Gets the value of the requestCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestCode() {
        return requestCode;
    }

    /**
     * Sets the value of the requestCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestCode(String value) {
        this.requestCode = value;
    }

    /**
     * Gets the value of the packageMemberList property.
     * 
     * @return
     *     possible object is
     *     {@link PackageMemberListType }
     *     
     */
    public PackageMemberListType getPackageMemberList() {
        return packageMemberList;
    }

    /**
     * Sets the value of the packageMemberList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageMemberListType }
     *     
     */
    public void setPackageMemberList(PackageMemberListType value) {
        this.packageMemberList = value;
    }

}
