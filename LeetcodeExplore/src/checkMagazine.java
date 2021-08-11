import java.util.*;

public class checkMagazine {

	public static void main(String[] args) {
		List<String> magazine = new ArrayList<String>();
		magazine.add("give");
		magazine.add("me");
		magazine.add("one1");
		magazine.add("grand");
		magazine.add("today");
		magazine.add("night");
		
		List<String> note = new ArrayList<String>();
		note.add("give");
		note.add("one");
		note.add("grand");
		note.add("today");
		
		boolean result = helper(magazine, note);
		System.out.println(result);
	}
	
	public static boolean helper(List<String> magazine, List<String> note) {
		HashMap<String, Integer> mapping = new HashMap<String, Integer>();
		Iterator<String> itr = magazine.iterator();
		while(itr.hasNext()) {
			String key = itr.next();
			if(mapping.containsKey(key)) {
				mapping.put(key, mapping.get(key) + 1);
			}else {
				mapping.put(key, 1);
			}
		}
		
		Iterator<String> itr1 = note.iterator();
		while(itr1.hasNext()) {
			String key1 = itr1.next();
			if(mapping.containsKey(key1) && mapping.get(key1) > 0) {
				mapping.put(key1, mapping.get(key1) - 1);
			}else {
				return false;
			}
		}
		return true;
	}

}
