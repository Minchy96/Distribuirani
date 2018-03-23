package client1;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2017-06-18T19:37:29.948+02:00
 * Generated source version: 3.1.6
 * 
 */
@WebService(targetNamespace = "http://www.example.org/motoSpec/", name = "MotoPortType")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface MotoPortType {

    @WebMethod
    @WebResult(name = "slobodniMotoriResponse", targetNamespace = "http://www.example.org/motoSpec/", partName = "out")
    public MotoriType prikaziSlobodneMotore(
        @WebParam(partName = "in", name = "slobodniMotoriRequest", targetNamespace = "http://www.example.org/motoSpec/")
        java.lang.String in
    );

    @WebMethod(action = "http://www.example.org/motoSpec/napraviNalog")
    @WebResult(name = "nalogResponse", targetNamespace = "http://www.example.org/motoSpec/", partName = "out")
    public boolean napraviNalog(
        @WebParam(partName = "in", name = "nalogRequest", targetNamespace = "http://www.example.org/motoSpec/")
        VlasnikType in
    );

    @WebMethod
    @WebResult(name = "motorResponse", targetNamespace = "http://www.example.org/motoSpec/", partName = "out")
    public boolean sacuvajMotor(
        @WebParam(partName = "in", name = "motorRequest", targetNamespace = "http://www.example.org/motoSpec/")
        MotorType in
    );

    @WebMethod
    @WebResult(name = "vlasnikResponse", targetNamespace = "http://www.example.org/motoSpec/", partName = "out")
    public VlasniciType vratiVlasnike(
        @WebParam(partName = "in", name = "vlasnikRequest", targetNamespace = "http://www.example.org/motoSpec/")
        java.lang.String in
    );

    @WebMethod
    @WebResult(name = "kupiResponse", targetNamespace = "http://www.example.org/motoSpec/", partName = "out")
    public boolean kupiMotor(
        @WebParam(partName = "in", name = "kupiRequest", targetNamespace = "http://www.example.org/motoSpec/")
        java.lang.String in
    );
}