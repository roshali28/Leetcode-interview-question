import java.util.*;
public class Ransom_note {
public static boolean canConstruct(String ransomNote, String magazine) {
	     HashMap<Character,Integer> h1 = new HashMap<>();	     
	     for(int i=0;i<magazine.length();i++){
	    	 if(!h1.containsKey(magazine.charAt(i)))
	    		 h1.put(magazine.charAt(i),1);
	    	 else
	    		 h1.put(magazine.charAt(i),h1.get(magazine.charAt(i))+1);
	     }
	     boolean flag=false;
	     for(int i=0;i<ransomNote.length();i++) {
	    	 if(h1.containsKey(ransomNote.charAt(i)) && h1.get(ransomNote.charAt(i)) != 0) {
	    		 h1.put(ransomNote.charAt(i),h1.get(ransomNote.charAt(i))-1);
	    		 flag=true;
	    	 }
	    	 else {
	    		 flag=false;
	    		 break;
	    	 }
	     }
	     return flag;
	    }
	public static void main(String[] args) {
		String ransomNote="aaw";
		String magazine ="aab";
		System.out.println(canConstruct(ransomNote,magazine));

	}

}
