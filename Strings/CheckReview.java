import java.util.*;

public class CheckReview{
	
	public static void main(String[] args){	
	String para = "Hotel was really clean and best, great service , friendly staff, small space but good";
	List<String> positive = new ArrayList<>();
	positive.add("clean");
	positive.add("best");
	positive.add("great");
	positive.add("friendly");
	positive.add("good");
	List<String> negative = new ArrayList<>();
        negative.add("small");
	negative.add("bad");
negative.add("unclean");
negative.add("rude");
	checkReview(para, positive, negative);
}


	public static void checkReview(String paragraph, List<String> good, List<String> bad){
	String[] review = paragraph.split(" ");
	int pos = 0; int neg = 0;
	for(String word : review){
	if(good.contains(word)) pos++;
	else if(bad.contains(word)) neg++;
	}
	System.out.print("pos" + pos + "neg" + neg);
	if(pos - neg > 2) System.out.println("Postive Review");
	 if (neg - pos > 2) System.out.println("Negative Review");
	 if(neg == pos) System.out.println("Neutral Review");

}


}
