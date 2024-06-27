import java.util.*;
public class product_of_array_except_self {
	public static int[] productExceptSelf(int[] nums) {
        int ans[]=new int[nums.length];
        int l=0;
        int temp =1;
        int temp1 =1;
        for(int i=0;i<nums.length;i++){
             temp *= nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                ans[l++] = temp/nums[i];
            }
            else{
                for(int j=0;j<nums.length;j++){
                    if(j != i){
                        temp1 *= nums[j];
                    }
                }
                ans[l++]=temp1;
            }
        }
        return ans;
    }
	public static void main(String[] args) {
		int nums[]= {1,-1,0,3,-3};
		System.out.println(Arrays.toString(productExceptSelf(nums)));

	}

}
