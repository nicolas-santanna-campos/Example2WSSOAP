package org.calculatorimc.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface CalculatorIMCWebService {

@WebMethod 
public String calculateIMC(@WebParam(name="weight") double weight, @WebParam(name="height") double height);

}
