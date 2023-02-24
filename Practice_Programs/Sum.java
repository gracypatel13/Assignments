import java.util.*;

class Sum {
    public int[] twoSum(int[] nums, int target) {
		int[] a={0,0};
        for (int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
					 a[0]=i;
					 a[1]=j;
					
                }
				
				
            }
        }
		 return a;
    }
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		
		
		int[] nums={2,1,3,4,5};
		int target=4;
		
		Sum s1=new Sum();
		int[] a=s1.twoSum(nums,target);
		//System.out.println(a); 
		for(int i=0;i<2;i++)
			System.out.println(a[i]);
	}
}