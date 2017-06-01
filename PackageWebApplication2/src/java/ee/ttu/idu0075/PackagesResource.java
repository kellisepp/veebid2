/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee.ttu.idu0075;

import ee.ttu.idu0075._2015.ws._package.AddPackageMemberRequest;
import ee.ttu.idu0075._2015.ws._package.AddPackageRequest;
import ee.ttu.idu0075._2015.ws._package.GetPackageListRequest;
import ee.ttu.idu0075._2015.ws._package.GetPackageListResponse;
import ee.ttu.idu0075._2015.ws._package.GetPackageMemberListRequest;
import ee.ttu.idu0075._2015.ws._package.GetPackageRequest;
import ee.ttu.idu0075._2015.ws._package.PackageMemberListType;
import ee.ttu.idu0075._2015.ws._package.PackageMemberType;
import ee.ttu.idu0075._2015.ws._package.PackageType;
import java.math.BigInteger;
import java.text.ParseException;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import static javax.ws.rs.HttpMethod.POST;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author kellisepp
 */
@Path("packages")
@RequestScoped
public class PackagesResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of InvoicesResource
     */
    public PackagesResource() {
    }

    /**
     * Retrieves representation of an instance of invoice.InvoicesResource
     * @param token
     * @param hasRelatedProducts
     * @param minPriceString
     * @param maxPriceString
     * @return an instance of java.lang.String
     */
   @GET
    @Produces("application/json")
    public GetPackageListResponse getPackageList(@QueryParam("token") String token,
            @QueryParam("members") String hasRelatedMembers,
            @QueryParam("min") String minPriceString,
            @QueryParam("max") String maxPriceString) {
        PackageWebService2 ws = new PackageWebService2();
        GetPackageListRequest request = new GetPackageListRequest();
        request.setToken(token);
        request.setHasRelatedMembers(hasRelatedMembers);
        double dblMinPrice = Double.parseDouble(minPriceString);
        double dblMaxPrice = Double.parseDouble(maxPriceString);
        request.setMinPrice(dblMinPrice);
        request.setMaxPrice(dblMaxPrice);
        return ws.getPackageList(request);
    }

    @GET
    @Path("{id : \\d+}") //support digit only
    @Produces("application/json")
    public PackageType getPackage(@PathParam("id") String id,
            @QueryParam("token") String token) {
        PackageWebService2 ws = new PackageWebService2();
        GetPackageRequest request = new GetPackageRequest();
        request.setId(BigInteger.valueOf(Integer.parseInt(id)));
        request.setToken(token);
        return ws.getPackage(request);
    }
    
    /**
     *
     * @param content
     * @param token
     * @return 
     */
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public PackageType addPackage(PackageType content, 
                                @QueryParam("token") String token) {
        PackageWebService2 ws = new PackageWebService2();
        AddPackageRequest request = new AddPackageRequest();
        request.setToken(token);
        request.setMonthPrice(content.getMonthPrice());
        request.setName(content.getName());
        request.setRequestCode(content.getRequestCode());
        return ws.addPackage(request);    
    }
    
    @GET
    @Path("{id : \\d+}/members") //support digit only
    @Produces("application/json")
    public PackageMemberListType getPackageMemberList(@PathParam("id") String id,
            @QueryParam("token") String token) {
        PackageWebService2 ws = new PackageWebService2 ();
        GetPackageMemberListRequest request = new GetPackageMemberListRequest();
        request.setPackageId(BigInteger.valueOf(Integer.parseInt(id)));
        request.setToken(token);
        return ws.getPackageMemberList(request);
    }
    
    /**
     *
     * @param content
     * @param token
     * @param id
     * @return 
     */
    @POST
    @Path("{id : \\d+}/members") //support digit only
    @Consumes("application/json")
    @Produces("application/json")
    public PackageMemberType addPackageMember(AddPackageMemberRequest content, 
                                @QueryParam("token") String token,
                                @PathParam("id") String id) {
        PackageWebService2 ws = new PackageWebService2();
        AddPackageMemberRequest request = new AddPackageMemberRequest();
        request.setToken(token);
        request.setPackageId(BigInteger.valueOf(Integer.parseInt(id)));
        request.setMemberId(content.getMemberId());
        request.setQuantity(content.getQuantity());
        return ws.addPackageMember(request);    
    }
}
