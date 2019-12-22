import java.lang.*;

public class lowerCase {

		public static void main(String[] args) {
				String s = "ABC*";
				String r = toLowerCase(s);
				for(char c : r.toCharArray()) System.out.print(c);
		}


		public static String toLowerCase(String str) {
				StringBuilder res = new StringBuilder();
				for(char c : str.toCharArray()){
						int val = c;
						if(val >= 65 && val <= 96) {
								val = val +  32; res.append((char)val);
						}
						else res.append(c);
				}
				return res.toString();
		}

}
