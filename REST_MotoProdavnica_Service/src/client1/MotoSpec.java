package client1;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2017-06-18T19:37:29.993+02:00
 * Generated source version: 3.1.6
 * 
 */
@WebServiceClient(name = "motoSpec", 
                  wsdlLocation = "http://localhost:8080/SOAP_Moto_Service/MotoPortType?wsdl",
                  targetNamespace = "http://www.example.org/motoSpec/") 
public class MotoSpec extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.example.org/motoSpec/", "motoSpec");
    public final static QName MotoPortTypeImplPort = new QName("http://www.example.org/motoSpec/", "MotoPortTypeImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/SOAP_Moto_Service/MotoPortType?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(MotoSpec.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/SOAP_Moto_Service/MotoPortType?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public MotoSpec(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public MotoSpec(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MotoSpec() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public MotoSpec(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public MotoSpec(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public MotoSpec(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns MotoPortType
     */
    @WebEndpoint(name = "MotoPortTypeImplPort")
    public MotoPortType getMotoPortTypeImplPort() {
        return super.getPort(MotoPortTypeImplPort, MotoPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MotoPortType
     */
    @WebEndpoint(name = "MotoPortTypeImplPort")
    public MotoPortType getMotoPortTypeImplPort(WebServiceFeature... features) {
        return super.getPort(MotoPortTypeImplPort, MotoPortType.class, features);
    }

}
