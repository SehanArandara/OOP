import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Main2 {
	public static void main(String[] args) {
		HashMap<Integer, String> HM = new HashMap<>();
		
		HM.put(100,"Sehan");
		HM.put(101,"Deemantha");
		HM.put(102,"Arandara");
		HM.put(103,"Sehan");
		
		System.out.println(HM);     //prints {100=Sehan, 101=Deemantha, 102=Arandara, 103=Sehan}
		Set<Map.Entry<Integer, String>> myset = HM.entrySet();
		for(Map.Entry<Integer,String> val : myset) {
			System.out.println("Key = "+val.getKey() + "values ="+val.getValue());
		}
	/*	Key = 100values =Sehan
				Key = 101values =Deemantha
				Key = 102values =Arandara
				Key = 103values =Sehan*/
		
		 
		
		
	}
}
