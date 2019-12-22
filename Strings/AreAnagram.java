import java.util.*;
import java.lang.Integer.*;
public class AreAnagram {

		public static void main(String[] args) {
				String input1 = "delhi";
				String input2 = "edhil";
				System.out.println(areAnagram(input1, input2));
		}

		public static boolean areAnagram(String str1, String str2) {
				Map<Character, Integer> freq1 = fillMap(str1);
				Map<Character, Integer> freq2 = fillMap(str2);
				if (str1.length() != str2.length()) return false;
				for (Map.Entry<Character, Integer> e : freq1.entrySet()) {
						if (e.getValue().intValue() != freq2.getOrDefault(e.getKey(), 0)) return false;
				}
				return true;
		}

		private static Map<Character, Integer> fillMap(String str) {
				Map<Character, Integer> map = new HashMap<>();
				for (int i = 0 ; i < str.length(); i++) {
						map.put(str.charAt(i), map.getOrDefault(str.charAt(i) , 0) + 1);
				}
				return map;
		}
}

