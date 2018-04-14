package getRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class GetData {

	
	@Test
	public void testResponseCode(){
		
		Response resp = get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
		
		int code = resp.getStatusCode();
		
		System.out.println("Status code of response is :"+code);
		
		System.out.println("Time Taken By This API is :" +resp.getTime());
		
		Assert.assertEquals(code, 200);
		
		
	}
	
	@Test
	public void testBodyData(){
		
		String code = get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22").getBody().asString();
		
		
		
		System.out.println("Status code of response is :"+code);
		
		System.out.println("Time Taken By This API is :" +get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22").getTime());
		
		
		
		
	}
	
	
}
