import java.util.*;
public class kid_with_the_greatest_candies {
	public static List<Boolean> KidWithCandies(int[] candies,int extraCandies){
		ArrayList <Boolean> arr = new ArrayList<>();
		int max=Integer.MIN_VALUE;
		for(int i : candies) {
			max = Math.max(i, max);
		}
		for(int i : candies) {
			if(i+extraCandies >= max)
				arr.add(true);
			else
				arr.add(false);
		}
		return arr;
	}
	public static void main(String[] args) {
		int candies[]= {2,3,5,1,3};
		System.out.println(KidWithCandies(candies,3));

	}

}
