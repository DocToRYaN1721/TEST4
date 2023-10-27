import mypackage.GetWeatherbyCityName;
import mypackage.GetWeatherbyCityNamePro;
import mypackage.WeatherWebService;
import mypackage.WeatherWebServiceSoap;
import mypackage.ArrayOfString;

import javax.xml.ws.BindingProvider;
import java.rmi.RemoteException;
import java.util.List;

public class WeatherForecastService {

	public static void main(String[] args) {
		WeatherWebService weatherService = new WeatherWebService();
		WeatherWebServiceSoap weatherWebServiceSoap = weatherService.getWeatherWebServiceSoap();
		ArrayOfString weather = weatherWebServiceSoap.getWeatherbyCityName("54517");
		List<String> list = weather.getString();
		System.out.println(list);

	}
		}
