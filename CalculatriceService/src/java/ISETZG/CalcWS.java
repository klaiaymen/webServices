/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package ISETZG;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author lenovo
 */
@WebService(serviceName = "CalcWS")
public class CalcWS {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Addition")
    public int Addition(@WebParam(name = "A") int A, @WebParam(name = "B") int B) {
        //TODO write your implementation code here:
        return A+B;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Multiplication")
    public int Multiplication(@WebParam(name = "A") int A, @WebParam(name = "B") int B) {
        //TODO write your implementation code here:
        return A*B;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Soustraction")
    public int Soustraction(@WebParam(name = "A") int A, @WebParam(name = "B") int B) {
        //TODO write your implementation code here:
        return A-B;
    }
    
    
    
    
}
