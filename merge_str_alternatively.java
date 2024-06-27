import java.util.*;
public class merge_str_alternatively {
	public static String mergeAlternately(String w1, String w2) {
		int l1=w1.length();
		int l2 = w2.length();
		int l = Math.min(l1, l2);
		String s = "";
		for(int i=0;i<l;i++) {
			s=s+w1.charAt(i);
			s=s+w2.charAt(i);
		}
		if(l1>l) {
			s=s+s.copyValueOf(w1.toCharArray(),l,l1-1);
		}
		else {
			s=s+s.copyValueOf(w2.toCharArray(),l,l2-1);
		}
		return s;
	}
	public static void main(String[] args) {
		String w1="ab";
		String w2="pqrs";
		System.out.println(mergeAlternately(w1,w2));

	}

}
