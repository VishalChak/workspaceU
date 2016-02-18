import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonStreamParser;

public class GsonFoo
{
  public static void main(String[] args) throws Exception
  {
    Gson gson = new GsonBuilder().create();

    JsonStreamParser parser = new JsonStreamParser(new FileReader("/home/vishal/metadata.json"));
    //JsonArray arr;
    while(parser.hasNext())
    {
    	//System.out.println(parser.next());
    	System.out.println();
      System.out.println(gson.fromJson(parser.next(), Node.class));
    }
  }
}