package Easy;

/**
 * ����һ���������飬��Ҫ��ԭ��ɾ���ظ����ֵ�Ԫ�أ�ʹ��ÿ��Ԫ��ֻ����һ�Σ������Ƴ���������³���
 * ��Ҫʹ�ö��������ռ䣬�������ԭ���޸��������鲢��ʹ��O��1������ռ�����������
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
