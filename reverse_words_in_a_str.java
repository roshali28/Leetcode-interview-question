import java.util.*;
public class reverse_words_in_a_str {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String s[]= str.trim().split(" +");
		StringBuffer sb = new StringBuffer();
		for(int i=s.length-1;i>=0;i--) {
			sb.append(s[i]);
			sb.append(" ");
		}
		String ans = sb.toString().trim();
		System.out.println(ans);
	}

}
