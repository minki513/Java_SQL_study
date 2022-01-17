package generics;
import java.util.*;

public class Generics_15 {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("david", "qwer123"); //<key,value> 쌍을 HashMap에 추가
		map.put("cindy", "9abc9");
		map.put("alice", "abc000");
		map.put("paul", "asdf5757");
		map.put("marry", "good!*?");
		Set<String> keySet = map.keySet(); //Key들의 집합을 반환
		System.out.println(keySet);
		System.out.println("-------------------");
		
		for(Map.Entry<String, String> e:map.entrySet()) { //모든 엔트리를 반환
			String key = e.getKey();
			String value = e.getValue();
			System.out.println(key + ":" +value);
		}
			System.out.println("-----------------");
			String val = (String)map.get("alice"); //key에 해당하는 값 반환
			System.out.println("Value for key alice is: " +val);
		}

}
