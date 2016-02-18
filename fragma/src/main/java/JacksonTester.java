import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.DatabaseMetaData;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JacksonTester {
	
	static JSONArray array=null;
	static Scanner scan;
	static HashMap< String, Integer> map;
	static HashMap<Integer, Integer> dateMap;
	static Double Heaviest,Lightest,avg;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		String jsonFile = "D:/metadata.json";
		readFileBYJSON(jsonFile);
		//System.out.println(Heaviest +" "+Lightest +" "+avg);
//		int x;
//		do{
//			System.out.println("1:Number of recording grouped by recclass");
//			System.out.println("2:Heaviest and Lightest Meteorite landing recorded");
//			System.out.println("3:Number of recordings per 10 year period Sorted by Year Range Ascending");
//			System.out.println("4:Number of recordings per 10 year period Sorted by Number of Sightings Descending");
//			System.out.println("5:Average mass of meteorites");
//			x=scan.nextInt();
//		}while(x>0 && x< 6);
    }
    
	 public static void readFileBYJSON (String jsonFile){
		 JSONParser parser = new JSONParser();
	    	Object obj;
	    	JSONObject objNode=null;
	    	String key, date;
	    	int count= 0,year,x,y,temp=0;
	    	Double db; 
	    	map =new HashMap<String, Integer>();
	    	dateMap = new HashMap<Integer, Integer>();
	    	try {
				obj =parser.parse(new FileReader(jsonFile));
				array= (JSONArray)obj;
			} catch (FileNotFoundException fnfe) {
				System.err.println(fnfe.getMessage());
			} catch (IOException io) {
				System.err.println(io.getMessage());
			} catch (ParseException pe) {
				System.err.println(pe.getMessage());
			}
	    	avg = 0.0;
	    	Heaviest= 0.0;
	    	for(Object node: array){
				objNode = (JSONObject) node;
				key = (String)objNode.get("recclass");
				if(map.get(key)==null)
					map.put(key,0);
				else map.put(key,map.get(key)+1);
				db = Double.parseDouble(objNode.get("mass (g)").toString());
				
				if(count==0){
					Lightest=db;
				} else if(Lightest>db && db!=0){
					Lightest = db;
				}
				if(Heaviest< db)
					Heaviest = db;
				avg = avg+db;
				date =objNode.get("year").toString();
				if(date.length()>1){
					year= Integer.parseInt(date.substring(6,10));
					year= year-year%10;
					if(dateMap.get(year)==null)
						dateMap.put(year, 1);
					else dateMap.put(year, dateMap.get(year).intValue()+1);
					System.out.println(dateMap.get(year));
				}
//				for(Integer i : dateMap.keySet()){
//					//System.out.println(i+" "+dateMap.get(i));
//					
//				}
				count++;
			}
	    	//System.out.println(count +"     "+temp);
	    	avg= avg/count;
	}
}