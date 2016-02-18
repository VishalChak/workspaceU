import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeSet;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


public class Fragma {

	public static void main(String args[]){
		String filePath = "/home/vishal/metadata.json";
		read(new File(filePath));
		//System.out.println(new File(filePath).exists());
	}
	
	

	 
	 
	public static void readFile(String jsonFilePath){
		JSONParser parser  = new JSONParser();
		
		try {
			Object obj = parser.parse(new FileReader(jsonFilePath));
			JSONObject jsonObj = (JSONObject)obj;
			//JSONArray arr = JSONArray
			
			String name = (String) jsonObj.get("name");
			String id = (String) jsonObj.get("id");
			String nametype = (String) jsonObj.get("nametype");
			String recclass = (String) jsonObj.get("recclass");
			String mass = (String) jsonObj.get("mass (g)");
			String fall = (String) jsonObj.get("fall");
			String year = (String) jsonObj.get("year");
			String reclat = (String) jsonObj.get("reclat");
			String reclong = (String) jsonObj.get("reclong");
			String address = (String) jsonObj.get("GeoLocation (address)");
			String zip = (String) jsonObj.get("GeoLocation (zip)");
			String city = (String) jsonObj.get("GeoLocation (city)");
			String POINT = (String) jsonObj.get("GeoLocation");
			String state = (String) jsonObj.get("GeoLocation (state)");
			
			System.out.println(name +" "+id +" "+nametype +" "+ recclass +" "+mass +" "+ fall +" "+year+" "+reclat+" "+reclong+" "+address+" "+zip+" "+city+" "+POINT+" "+state);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	class Node implements Comparable<Node>{
		private String name;
		private String id ;
		private String nametype ;
		private String recclass ;
//		private String mass ;
//		private String fall  ;
//		private String year  ;
//		private String reclat ;
//		private String reclong;
//		private String address;
//		private String zip ;
//		private String city;
//		private String POINT;
//		private String state;
		
		public String getname() {
			return name;
		}
		public void setname(String name) {
			this.name = name;
		}
		
		public String getid() {
			return id;
		}
		public void setid(String id) {
			this.id = id;
		}
		
		public String getnametype() {
			return nametype;
		}
		public void setnametype(String nametype) {
			this.nametype = nametype;
		}
		
		public String getrecclass() {
			return recclass;
		}
		public void setrecclass(String recclass) {
			this.recclass = recclass;
		}
		
		/*public String getfall() {
			return id;
		}
		public void setid(String id) {
			this.id = id;
		}
		
		public String getid() {
			return id;
		}
		public void setid(String id) {
			this.id = id;
		}
		
		public String getid() {
			return id;
		}
		public void setid(String id) {
			this.id = id;
		}
		
		public String getid() {
			return id;
		}
		public void setid(String id) {
			this.id = id;
		}
		
		public String getid() {
			return id;
		}
		public void setid(String id) {
			this.id = id;
		}
		
		public String getid() {
			return id;
		}
		public void setid(String id) {
			this.id = id;
		}
		
		public String getid() {
			return id;
		}
		public void setid(String id) {
			this.id = id;
		}
		
		public String getid() {
			return id;
		}
		public void setid(String id) {
			this.id = id;
		}
		
		public String getid() {
			return id;
		}
		public void setid(String id) {
			this.id = id;
		}
		
		public String getid() {
			return id;
		}
		public void setid(String id) {
			this.id = id;
		}*/
		
		
		@Override
		public int compareTo(Node id) {
			// TODO Auto-generated method stub
			return this.id.compareTo(id.getid());
		}
		
	}
	public static void  read(File jsonFile) {
		TreeSet< Node>  metadata = new TreeSet<Node>();
		if (jsonFile.exists()) {
			BufferedReader br = null;
			try {
				br = new BufferedReader(new FileReader(jsonFile));
			} catch (FileNotFoundException fnf) {
				System.err.println(fnf.getMessage());
			}
			Gson gson = new Gson();
			metadata = gson.fromJson(br, new TypeToken<TreeSet<Node>>() {
			}.getType());
		}
	}
}
