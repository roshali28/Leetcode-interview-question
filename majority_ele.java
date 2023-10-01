import java.util.*;
public class majority_ele {
	public static int majorityElement(int[] nums) {
	    HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
	    int n = nums.length;
	    int ans=0;
	    for(int i=0;i<nums.length;i++){
	     if(h.containsKey(nums[i])){
	         h.put(nums[i],h.get(nums[i])+1);
	     }
	     else{
	         h.put(nums[i],1);
	     }
	     if(h.get(nums[i])>(n/2)){
	        ans=nums[i]; 
	     }
	    }
	    return ans;  
	    }
	public static void main(String[] args) {
		int nums[]= {2,2,1,1,1,2,2};
		int ans=majorityElement(nums);
		System.out.println(ans);

	}

}
