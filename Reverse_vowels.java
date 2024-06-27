import java.util.*;
public class Reverse_vowels {
public static void reverse(String s) {
	int l=0;
	int r=s.length()-1;
	StringBuilder sb = new StringBuilder(s);
	while(l<r) {
		while(l<r && notVowel(s.charAt(l)))
			l++;
		while(l<r && notVowel(s.charAt(r)))
			r--;
		sb.setCharAt(l, s.charAt(r));
		sb.setCharAt(r, s.charAt(l));
	}
	System.out.println(sb.toString());
	
}
public static Boolean notVowel(char c) {
	return "aeiouAEIOU".indexOf(c) == -1;
}
	public static void main(String[] args) {
		String s = "leetcode";
		reverse(s);

	}

}
