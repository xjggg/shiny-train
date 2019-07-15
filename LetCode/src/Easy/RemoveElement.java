package Easy;

/**
 * 给定一个数组nums和一个值val，你需要原地移除所有数组等于val的元素，返回移除后数组的新长度
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用O（1）额外空间的条件下完成
 * @author xjggg
 *
 */
public class RemoveElement {
	public int remove(int[] nums,int val) {
		int n = 0;
		for(int m=0;m<nums.length;m++) {
			if(nums[m]!=val) {
				nums[n]=nums[m];
				n++;
			}
		}
		return n;
	}
	
	public static void main(String args[]) {
		int nums[] = {0,1,2,2,3,0,4,2};
		int val = 2;
		RemoveElement myRemove = new RemoveElement();
		System.out.println(myRemove.remove(nums, val));
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]);
		}
	}
}
