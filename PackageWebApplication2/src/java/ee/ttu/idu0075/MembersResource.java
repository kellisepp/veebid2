/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee.ttu.idu0075;

import ee.ttu.idu0075._2015.ws._package.AddMemberRequest;
import ee.ttu.idu0075._2015.ws._package.GetMemberListRequest;
import ee.ttu.idu0075._2015.ws._package.GetMemberListResponse;
import ee.ttu.idu0075._2015.ws._package.GetMemberRequest;
import ee.ttu.idu0075._2015.ws._package.MemberType;
import java.math.BigInteger;
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
@Path("members")
public class MembersResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of MembersResource
     */
    public MembersResource() {
    }
 @GET
    @Produces("application/json")
    public GetMemberListResponse getMemberList(@QueryParam("token") String token) {
        PackageWebService2 ws = new PackageWebService2();
        GetMemberListRequest request = new GetMemberListRequest();
        request.setToken(token);
        return ws.getMemberList(request);
    }
    
    @GET
    @Path("{id : \\d+}") //supports digits only
    @Produces("application/json")
    public MemberType getMember(@PathParam("id") String id,
            @QueryParam("token") String token) {
        PackageWebService2 ws = new PackageWebService2();
        GetMemberRequest request = new GetMemberRequest();
        request.setId(BigInteger.valueOf(Integer.parseInt(id)));
        request.setToken(token);
        return ws.getMember(request);
    }
    
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public MemberType addMember(MemberType content, 
                                @QueryParam("token") String token) {
        PackageWebService2 ws = new PackageWebService2();
        AddMemberRequest request = new AddMemberRequest();
        request.setFirstName(content.getFirstName());
        request.setLastName(content.getLastName());
        request.setRequestCode(content.getRequestCode());
        request.setToken(token);
        return ws.addMember(request);
    }
}
