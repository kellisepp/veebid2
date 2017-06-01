
package ee.ttu.idu0075._2015.ws._package;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ee.ttu.idu0075._2015.ws._package package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetMemberResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2015/ws/package", "getMemberResponse");
    private final static QName _AddMemberResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2015/ws/package", "addMemberResponse");
    private final static QName _GetPackageResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2015/ws/package", "getPackageResponse");
    private final static QName _AddPackageResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2015/ws/package", "addPackageResponse");
    private final static QName _GetPackageMemberListResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2015/ws/package", "getPackageMemberListResponse");
    private final static QName _AddPackageMemberResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2015/ws/package", "addPackageMemberResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ee.ttu.idu0075._2015.ws._package
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetMemberRequest }
     * 
     */
    public GetMemberRequest createGetMemberRequest() {
        return new GetMemberRequest();
    }

    /**
     * Create an instance of {@link MemberType }
     * 
     */
    public MemberType createMemberType() {
        return new MemberType();
    }

    /**
     * Create an instance of {@link AddMemberRequest }
     * 
     */
    public AddMemberRequest createAddMemberRequest() {
        return new AddMemberRequest();
    }

    /**
     * Create an instance of {@link GetMemberListRequest }
     * 
     */
    public GetMemberListRequest createGetMemberListRequest() {
        return new GetMemberListRequest();
    }

    /**
     * Create an instance of {@link GetMemberListResponse }
     * 
     */
    public GetMemberListResponse createGetMemberListResponse() {
        return new GetMemberListResponse();
    }

    /**
     * Create an instance of {@link GetPackageRequest }
     * 
     */
    public GetPackageRequest createGetPackageRequest() {
        return new GetPackageRequest();
    }

    /**
     * Create an instance of {@link PackageType }
     * 
     */
    public PackageType createPackageType() {
        return new PackageType();
    }

    /**
     * Create an instance of {@link AddPackageRequest }
     * 
     */
    public AddPackageRequest createAddPackageRequest() {
        return new AddPackageRequest();
    }

    /**
     * Create an instance of {@link GetPackageListRequest }
     * 
     */
    public GetPackageListRequest createGetPackageListRequest() {
        return new GetPackageListRequest();
    }

    /**
     * Create an instance of {@link GetPackageListResponse }
     * 
     */
    public GetPackageListResponse createGetPackageListResponse() {
        return new GetPackageListResponse();
    }

    /**
     * Create an instance of {@link GetPackageMemberListRequest }
     * 
     */
    public GetPackageMemberListRequest createGetPackageMemberListRequest() {
        return new GetPackageMemberListRequest();
    }

    /**
     * Create an instance of {@link PackageMemberListType }
     * 
     */
    public PackageMemberListType createPackageMemberListType() {
        return new PackageMemberListType();
    }

    /**
     * Create an instance of {@link AddPackageMemberRequest }
     * 
     */
    public AddPackageMemberRequest createAddPackageMemberRequest() {
        return new AddPackageMemberRequest();
    }

    /**
     * Create an instance of {@link PackageMemberType }
     * 
     */
    public PackageMemberType createPackageMemberType() {
        return new PackageMemberType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MemberType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2015/ws/package", name = "getMemberResponse")
    public JAXBElement<MemberType> createGetMemberResponse(MemberType value) {
        return new JAXBElement<MemberType>(_GetMemberResponse_QNAME, MemberType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MemberType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2015/ws/package", name = "addMemberResponse")
    public JAXBElement<MemberType> createAddMemberResponse(MemberType value) {
        return new JAXBElement<MemberType>(_AddMemberResponse_QNAME, MemberType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PackageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2015/ws/package", name = "getPackageResponse")
    public JAXBElement<PackageType> createGetPackageResponse(PackageType value) {
        return new JAXBElement<PackageType>(_GetPackageResponse_QNAME, PackageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PackageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2015/ws/package", name = "addPackageResponse")
    public JAXBElement<PackageType> createAddPackageResponse(PackageType value) {
        return new JAXBElement<PackageType>(_AddPackageResponse_QNAME, PackageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PackageMemberListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2015/ws/package", name = "getPackageMemberListResponse")
    public JAXBElement<PackageMemberListType> createGetPackageMemberListResponse(PackageMemberListType value) {
        return new JAXBElement<PackageMemberListType>(_GetPackageMemberListResponse_QNAME, PackageMemberListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PackageMemberType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2015/ws/package", name = "addPackageMemberResponse")
    public JAXBElement<PackageMemberType> createAddPackageMemberResponse(PackageMemberType value) {
        return new JAXBElement<PackageMemberType>(_AddPackageMemberResponse_QNAME, PackageMemberType.class, null, value);
    }

}
