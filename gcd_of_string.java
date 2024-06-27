import java.util.*;
public class gcd_of_string {
public static String gcdofString(String str1,String str2) {
	if(!(str1+str2).equals(str2+str1))
		return "";
	int len = gcd(str1.length(),str2.length());
	return str1.substring(0,len);
}
public static int gcd(int a,int b) {
	return b == 0 ? a:gcd(b,a%b);
}
	public static void main(String[] args) {
		String str1="ABCABC";
		String str2="ABC";
		System.out.println(gcdofString(str1,str2));

	}

}
