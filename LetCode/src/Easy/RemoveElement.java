package Easy;

/**
 * ����һ������nums��һ��ֵval������Ҫԭ���Ƴ������������val��Ԫ�أ������Ƴ���������³���
 * ��Ҫʹ�ö��������ռ䣬�������ԭ���޸��������鲢��ʹ��O��1������ռ�����������
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
