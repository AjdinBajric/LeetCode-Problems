
public class Pattern132 {

    public static boolean find132pattern(int[] nums) {
        
    	int first=0, second = 0, third = 0, first_n=0, second_n=0, third_n=0;
    	for(int i=0;i<nums.length;i++){
    		if(nums[i]==1){first=i; first_n=nums[i];}
    		if(nums[i]==3){ second=i; second_n=nums[i];}
    		if(nums[i]==2){ third=i;third_n=nums[i];}
    	}
    	
    	if(first<second && second<third && first_n<second_n && second_n<third_n ){return true;}
    	else return false;
    }
	
	public static void main(String[] args) {
		
		int nums[]= {3, 1, 4, 2};
		
		// first case
		System.out.println(find132pattern(nums));

	}

}
