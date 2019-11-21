import java.lang.*;

public class toUpperCase{
	
	public static void main(String[] args){
	String s = "abc";
	String r = toUpperCase(s);
	for(char c : r.toCharArray()) System.out.print(c);
	}


	public static String toUpperCase(String str){
		StringBuilder res = new StringBuilder();
		for(char c : str.toCharArray()){
			int val = c;
			if(val >= 97 && val <= 122){
			 val = val - 32; res.append((char)val);
			}
				else res.append(c);	
		}
	return res.toString();
}
}
