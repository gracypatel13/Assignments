package leetcode;

public class RemoveElement {
	public static void main(String args[]) {
		Solution1 s=new Solution1();
		int[] nums=new int[7];
		nums[0]=1;
		nums[1]=2;
		nums[2]=3;
		nums[3]=3;
		nums[4]=1;
		nums[5]=1;
		nums[6]=4;
		s.removeElement(nums, 1);
	//System.out.println(num);
	}

	
}
class Solution1 {
    public void removeElement(int[] nums, int val) {
        int number,temp,count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val && i<nums.length-1){
                temp=nums[i];
                nums[i]=nums[i+1];
                nums[i+1]=temp;
                count++;
                System.out.println(count);

            }
            if(nums[nums.length-1]==val){
                count=count+1;
            }
        }
        for(int i=0;i<nums.length;i++) {
        	System.out.print(nums[i]);
        }
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==val){

        //     }
        // }
      //  return count;
System.out.println("count ="+count);
    }
}