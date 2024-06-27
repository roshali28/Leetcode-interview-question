import java.util.*;
public class can_place_flowers {
	public boolean canPlaceFlowers(int[] flowerbed, int n) {
	       int len = flowerbed.length;
	       if(len == 0 || n==0)
	          return true;
	        for(int i=0;i<len;i++){
	            if(flowerbed[i]==0 && (i==0 || flowerbed[i-1]==0) && (i==len-1 || flowerbed[i+1]==0)){
	                flowerbed[i]=1;
	                if(--n == 0)
	                    return true;
	            }     
	        }
	        return false;
	    }
	public static void main(String[] args) {
		
	}

}
