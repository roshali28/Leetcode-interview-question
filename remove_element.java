import java.util.*;
public class remove_element {
    public static int removeElement(int[] nums, int val) {
    	int k=0;
    	int n[]= new int[nums.length];
       for(int i=0;i<nums.length;i++) {
    	   if(nums[i] != val) {
              n[k]=nums[i];
              k++;
    	   }
       }
       return k;
    }
    public static void main(String args[]) {
    	int nums[]={0,1,2,2,3,0,4,2};
    	int n=removeElement(nums,2);
        System.out.println(n);
        
        
    }
}
