package assignment;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Temperature {
	
	@WebMethod
	public double convertFahrenheitToCelsius(double temperatureInFahrenheit){
		
		double temperatureInCelsius = 0;
		
		try{
			
			temperatureInCelsius = ((temperatureInFahrenheit - 32)*5.0)/9.0;
		}catch(Exception ex){
			
			ex.printStackTrace();
		}
		
		return temperatureInCelsius;
	}

}
