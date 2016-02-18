import java.util.HashMap;
import java.util.Map;

public class collectionPrac {
	
	public static void  colMap(){
		System.out.println("map");
		Map<Integer, Integer> map = null;
		map = new HashMap<>();
		map.put(1, 5);
		map.put(0, 10);
		for(int i: map.keySet()){
			System.out.print(map.get(i)+" ");
		}
	}
	public static void main(String args[]) {
		colMap();
	}
}
