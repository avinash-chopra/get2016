package assignment;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

public class TemperatureClient {
	
	public static void main(String[] args){
		
		TemperatureServiceLocator temperatureServiceLocator = new TemperatureServiceLocator();
		temperatureServiceLocator.setTemperatureEndpointAddress("http://localhost:8080/SoapWebService/services/Temperature");
		try {
			Temperature temperature = temperatureServiceLocator.getTemperature();
			System.out.println(temperature.convertFahrenheitToCelsius(100));
		} catch (ServiceException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

}
