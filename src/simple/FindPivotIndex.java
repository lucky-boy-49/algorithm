package simple;

import java.util.Arrays;

/**
 * 724. 寻找数组的中心下标
 * @author HJ
 */
public class FindPivotIndex {

	public int pivotIndex(int[] nums) {
		int total = Arrays.stream(nums).sum(), sum = 0;
		for(int i = 0; i < nums.length; i++) {
			if (2 * sum + nums[i] == total) {
				return i;
			}
			sum += nums[i];
		}
		return -1;
	}

	public static void main(String[] args){

		FindPivotIndex findPivotIndex = new FindPivotIndex();
		int[] nums = {-1,-1,-1,-1,-1,-1};
		System.out.println(findPivotIndex.pivotIndex(nums));

	}

}