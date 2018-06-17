package org.calculatorimc.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName="calculator/calculatorwebservice")
public class CalculatorIMCEndPoint implements CalculatorIMCWebService {

	@Override
	@WebMethod
	public String calculateIMC(double weight, double height) {
		double resultIMC = (weight) / (height * height);
		
		if(resultIMC > 35) {
			return "Obesity Grade II, IMC: " + resultIMC;
		} else if (resultIMC > 30) {
			return "Obesity Grade I, IMC: " + resultIMC;
		} else if (resultIMC > 25) {
			return "Overweight, IMC: " + resultIMC;
		} else if (resultIMC > 18.5) {
			return "Normal weight, IMC: " +resultIMC;
		} else {
			return "Below normal weight, IMC: " + resultIMC;
		}
	}
}
//http://localhost:8080/CalculatorIMCWebService/calculator/calculatorwebservice?wsdl