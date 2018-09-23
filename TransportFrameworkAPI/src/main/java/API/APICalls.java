package API;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class APICalls 

{
	
	 /**
     * Purpose : Hitting the URL and then fetching the return JSON Object
	 */
	public static JSONObject hitURL(String mainURL)
	
	{
	
		URL url;
		JSONObject jsonObject=new JSONObject();
		try {
			url = new URL(mainURL);
		//your url i.e fetch data from .
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "application/json");
        if (conn.getResponseCode() != 200) {
            throw new RuntimeException("Failed : HTTP Error code : "
                    + conn.getResponseCode());
        }
        
        InputStreamReader in = new InputStreamReader(conn.getInputStream());
        BufferedReader br = new BufferedReader(in);
        String output,str="";
        while ((output = br.readLine()) != null) {
           str=str+output;
        }
   
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(str);
       jsonObject =  (JSONObject) obj;
        
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jsonObject;  
	}
	
	 /**
     * Purpose : Verifies the station name from the returned output
	 */
	public static Boolean verifyStationName(JSONObject jsonObject,String stationName)
	
	{
	
		Boolean flag = false;
		JSONArray locationObject=(JSONArray) jsonObject.get("locations");
		JSONObject Temp;
		String name="";
       
        for(Object o : locationObject)
        {
     	   Temp = (JSONObject)o;
     	   name = (String) Temp.get("name");
     	   System.out.println("Station Name "+name);
     	   //checking the name of the station    	   
    	   if(stationName.equals(name))
    	   {
    		   flag=true;
    		   break;
    	   }	    

        }
    	 return flag;
		
	}
	
	/**
     * Purpose : Verifies the number of modes in the output
	 */
	public static Boolean verifyNumberOfModes(JSONObject jsonObject)
	{
	
		Boolean flag = false;
		JSONArray locationObject=(JSONArray) jsonObject.get("locations");
        JSONObject Temp;
        int noOfModes=0;
        JSONArray modes;

       //fetching number of modes from the json Object
        for(Object o : locationObject)
        {
     	   Temp = (JSONObject)o;
	       modes = (JSONArray)Temp.get("modes");
	       noOfModes=modes.size();
	    }
  	    
        //checking the number of modes are more than 1
	       if(noOfModes>1)
	       {
	    	   flag=true;
	       }
		
		 return flag;
	}
	
}
