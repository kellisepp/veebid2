/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee.ttu.idu0075;

import ee.ttu.idu0075._2015.ws._package.AddMemberRequest;
import ee.ttu.idu0075._2015.ws._package.AddPackageMemberRequest;
import ee.ttu.idu0075._2015.ws._package.AddPackageRequest;
import ee.ttu.idu0075._2015.ws._package.GetMemberListRequest;
import ee.ttu.idu0075._2015.ws._package.GetMemberListResponse;
import ee.ttu.idu0075._2015.ws._package.GetMemberRequest;
import ee.ttu.idu0075._2015.ws._package.GetPackageListRequest;
import ee.ttu.idu0075._2015.ws._package.GetPackageListResponse;
import ee.ttu.idu0075._2015.ws._package.GetPackageMemberListRequest;
import ee.ttu.idu0075._2015.ws._package.GetPackageRequest;
import ee.ttu.idu0075._2015.ws._package.MemberType;
import ee.ttu.idu0075._2015.ws._package.PackageMemberListType;
import ee.ttu.idu0075._2015.ws._package.PackageMemberType;
import ee.ttu.idu0075._2015.ws._package.PackageType;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;


/**
 *
 * @author kellisepp
 */
@WebService(serviceName = "PackageService", portName = "PackagePort", endpointInterface = "ee.ttu.idu0075._2015.ws._package.PackagePortType", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/package", wsdlLocation = "WEB-INF/wsdl/PackageWebApplication2WebService/PackageService.wsdl")
public class PackageWebService2 {
    
    static int nextMemberId = 1;
    static int nextPackageId = 1;
    static List<MemberType> memberList = new ArrayList<MemberType>();
    static List<PackageType> packageList = new ArrayList<PackageType>();
    static List<String> memberCodes = new ArrayList<String>();
    static List<String> packageCodes = new ArrayList<String>();

    public ee.ttu.idu0075._2015.ws._package.MemberType getMember(ee.ttu.idu0075._2015.ws._package.GetMemberRequest parameter) {
        MemberType pt = null;
        if (parameter.getToken().equalsIgnoreCase("salajane")) {
            for (int i = 0; i < memberList.size(); i++) {
                if (memberList.get(i).getId().equals(parameter.getId())) {
                    pt = memberList.get(i);
                }

            }    
        }
        return pt;   
    }

     public MemberType addMember(AddMemberRequest parameter) {
        MemberType pt = new MemberType();
        if (parameter.getToken().equalsIgnoreCase("salajane") && !memberCodes.isEmpty() && parameter.getRequestCode().length() == 4 ) {
            
            for (String c : memberCodes){
            
                if(parameter.getRequestCode().equals(c)){
                    return null;
                }   
            } 
        } if (parameter.getToken().equalsIgnoreCase("salajane") && parameter.getRequestCode().length() == 4){
                pt.setFirstName(parameter.getFirstName());
                pt.setLastName(parameter.getLastName());
                pt.setRequestCode(parameter.getRequestCode());
                pt.setId(BigInteger.valueOf(nextMemberId++));
                memberList.add(pt);  
                memberCodes.add(parameter.getRequestCode());
        }
        return pt;
    }

    public GetMemberListResponse getMemberList(GetMemberListRequest parameter) {
        GetMemberListResponse response = new GetMemberListResponse();
        if (parameter.getToken().equalsIgnoreCase("salajane")) {
            for (MemberType memberType : memberList) {
                response.getMember().add(memberType);
            }
        }
        return response;
    }

     public PackageType getPackage(GetPackageRequest parameter) {
        PackageType it = null;
        if (parameter.getToken().equalsIgnoreCase("salajane")) {
            for (int i = 0; i < packageList.size(); i++) {
                if (packageList.get(i).getId().equals(parameter.getId())) {
                    it = packageList.get(i);
                }

            }    
        }
        return it;
    }

   
    public PackageType addPackage(AddPackageRequest parameter) {
         PackageType it = new PackageType();
    
        if (parameter.getToken().equalsIgnoreCase("salajane") && !packageCodes.isEmpty() && parameter.getRequestCode().length() == 4 ) {
            
            for (String c : packageCodes){
            
                if(parameter.getRequestCode().equals(c)){
                    return null;
                }   
            } 
        }
        if (parameter.getToken().equalsIgnoreCase("salajane") && parameter.getRequestCode().length() == 4) {
            it.setId(BigInteger.valueOf(nextPackageId++));
            it.setName(parameter.getName());
            it.setMonthPrice(parameter.getMonthPrice());
            it.setPackageMemberList(new PackageMemberListType());
            it.setRequestCode(parameter.getRequestCode());
            packageList.add(it);
            packageCodes.add(parameter.getRequestCode());
            
        
        }
        return it;
        }
  
      public GetPackageListResponse getPackageList(GetPackageListRequest parameter) {
        GetPackageListResponse response = new GetPackageListResponse();
        Double dObjMin = new Double(parameter.getMinPrice());
        Double dObjMax = new Double(parameter.getMaxPrice());
        if (parameter.getToken().equalsIgnoreCase("salajane")) {
            for (PackageType packageType : packageList) {
                if (((parameter.getHasRelatedMembers().equalsIgnoreCase("ei" ) 
                        && (packageType.getPackageMemberList() == null 
                        || packageType.getPackageMemberList().getPackageMember().isEmpty()))
                        || (parameter.getHasRelatedMembers().equalsIgnoreCase("jah" )
                        && packageType.getPackageMemberList() != null 
                        && !packageType.getPackageMemberList().getPackageMember().isEmpty())
                        || parameter.getHasRelatedMembers().equals("")) 
                    && (dObjMin != null && Double.compare(parameter.getMinPrice(),packageType.getMonthPrice())<0)
                    && (dObjMax != null && Double.compare(parameter.getMaxPrice(),packageType.getMonthPrice())>0)  
                        ){
                    
                    response.getPackage().add(packageType);
                }
            }
        }
        return response;
    }
      public PackageMemberListType getPackageMemberList(GetPackageMemberListRequest parameter) {
        PackageMemberListType packageMemberList = null;
        if (parameter.getToken().equalsIgnoreCase("salajane")) {
            for (int i = 0; i < packageList.size(); i++) {
                if (packageList.get(i).getId().equals(parameter.getPackageId())) {
                    packageMemberList = packageList.get(i).getPackageMemberList();
                }

            }    
        }
        return packageMemberList;
    }


   public PackageMemberType addPackageMember(AddPackageMemberRequest parameter) {
        PackageMemberType packageMember = new PackageMemberType();
        if (parameter.getToken().equalsIgnoreCase("salajane")) {
            GetMemberRequest memberRequest = new GetMemberRequest();
            memberRequest.setId(parameter.getMemberId());
            memberRequest.setToken(parameter.getToken());
            packageMember.setMember(getMember(memberRequest));
            packageMember.setQuantity(parameter.getQuantity());
            
        
            for (int i = 0; i < packageList.size(); i++) {
                if (packageList.get(i).getId().equals(parameter.getPackageId())) {
                    packageList.get(i).getPackageMemberList().getPackageMember().add(packageMember);
                    return packageMember;
                }

            } 
        }
        return null;
    }
    
    
}
