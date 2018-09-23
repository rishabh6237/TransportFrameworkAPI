package StepDefinition;

import org.json.simple.JSONObject;
import org.junit.Assert;

import API.APICalls;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TripPlanDefintionAPI

{

	JSONObject locationObject;
	
	
	public JSONObject getLocationObject() 
	
	{
		return locationObject;
	}

	public void setLocationObject(JSONObject locationObject)
	
	{
		this.locationObject = locationObject;
	}
	
	@Given("^Phileas is looking for a stop$")
	public void phileas_is_looking_for_a_stop() throws Throwable 
	
	{
	    // No code required here
	   
	}

	@When("^he searches for \"([^\"]*)\"$")
	public void he_searches_for(String destName) throws Throwable 
	
	{
	    
		String newURL = "https://www.transportnsw.info/web/XML_STOPFINDER_REQUEST?TfNSWSF=true&language=en"
				+ "&name_sf="+destName+"​&outputFormat=rapidJSON&type_sf=any&version=10.2.2.48\r\n";
		
		//hits the URL and then fetches the JSON Object containing data
		locationObject=APICalls.hitURL(newURL);
		
		//throws error if the JSON was not as expected
		if(locationObject.isEmpty())
		{
			throw new Exception("JSON object is not correct");
		}
		setLocationObject(locationObject);
		
	    
	}

	@Then("^a stop named \"([^\"]*)\" is found$")
	public void a_stop_named_is_found(String stopName) throws Throwable 
	
	{
	    
		locationObject=getLocationObject();
		
		//verifies that the station name is correct
		Assert.assertTrue("The Station could not be verified ", APICalls.verifyStationName(locationObject, stopName));	
	}

	@Then("^the stop provides more than one mode of transport$")
	public void the_stop_provides_more_than_one_mode_of_transport() throws Throwable 
	
	{
	    //verifies that the number of mode of transport are more than one
		locationObject=getLocationObject();
		Assert.assertTrue("The Station does not provide enough modes ", APICalls.verifyNumberOfModes(locationObject));
	}
	
}
