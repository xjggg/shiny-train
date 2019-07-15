package Easy;

/**
 * 给定一个排序数组，需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用O（1）额外空间的条件下完成
 * @author xjggg
 *
 */
public class RemoveDuplicates {
	public int remove(int[] nums) {
		int n = 0;
		for(int m=1;m<nums.length;m++) {
			if(nums[n]!=nums[m]) {
				n += 1;
				nums[n] = nums[m];
			}
		}
		return n+1;
	}
	
	public static void main(String args[]) {
		int[] nums = {0,0,1,1,1,2,2,3,4,4,4,5,6,7,7};
		RemoveDuplicates myRemove = new RemoveDuplicates();
		System.out.println(myRemove.remove(nums));
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]);
		}
	}
}
