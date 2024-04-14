/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ISETZG;


import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author lenovo
 */
@WebService(serviceName = "CalcWS", portName = "CalcWSPort", endpointInterface = "isetzg.CalcWS", targetNamespace = "http://ISETZG/", wsdlLocation = "WEB-INF/wsdl/CalcWS2/localhost_8080/MathWebServices/CalcWS.wsdl")
public class CalcWS2 {

    public String soustraction(@WebParam(name = "A")int A,@WebParam(name = "B") int B) {
        //TODO implement this method
        int res = A-B;
        return "resultat est"+res;
    }

    public String multiplication(@WebParam(name = "A") int A,@WebParam(name = "B") int B) {
        //TODO implement this method
        int res = A*B;
        return "resultat est"+res;
    }

    public java.lang.String hello(@WebParam(name = "name") java.lang.String name) {
        //TODO implement this method
        return "hello "+ name;
    }

    public String addition(@WebParam(name = "A") int A,@WebParam(name = "B") int B) {
        //TODO implement this method
        int res = A+B;
        return "resultat est"+res;
    }
    
}
