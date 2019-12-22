import java.util.*;

public class Atoi {

		public static void main(String[] args) {
				String str = args[0];
				int r = atoi(str);
				System.out.print(r);
		}

		public static int atoi(String str) {
				if (str.charAt(0) == '+') return _atoi(str.substring(1));
				else if (str.charAt(0) == '-') return -1 * _atoi(str.substring(1));
				else return _atoi(str);
		}

		private static int _atoi(String str) {
				int start = 0;
				while (start < str.length() && (str.charAt(start) - '0') == 0) start++;
				if (start >= str.length()) return 0;
				else {
						int result = str.charAt(start) - '0';
						for (int i = start + 1; i < str.length(); i++) {
								int curr = str.charAt(i) - '0';
								result = result * 10 + curr;
						} 
						return result;
				}
		}

}

