package String;
import java.util.*;
public class anagramInBucket {
 
//	Input - List<String> ["star", "rats", "ice", "cie", "arts"]
//	print all anagrams in buckets:
//	["star", "rats", "arts"]
//	["ice", "cie"] 
	
	
	static void anagrams(ArrayList<String> a){
		Hashtable<String, ArrayList<String>> h = new Hashtable<>();
		for(String s:a){
			char[] array = s.toCharArray();
			Arrays.sort(array);
			String sortedS = String.valueOf(array);
			if( !h.keySet().contains(sortedS)){
				ArrayList<String> value = new ArrayList<String>();
				value.add(s);
				h.put(sortedS, value);
			}
			else{
				ArrayList<String> existingVal = h.get(sortedS);
				existingVal.add(s);
				h.put(sortedS, existingVal);
			}
		}
		ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>> ();
		result.addAll(h.values());
		for(ArrayList<String> ad:result){
			System.out.print(ad);
		}
		
	}

	public static void main(String[] args){
		ArrayList<String> s = new ArrayList<String>();
		s.add("star");
		s.add("rats");
		s.add("ice");
		s.add("cie");
		s.add("arts");
		anagramInBucket.anagrams(s);
		
	}
}
