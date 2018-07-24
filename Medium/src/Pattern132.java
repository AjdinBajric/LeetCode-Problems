
public class Pattern132 {

    public static boolean find132pattern(int[] nums) {
	    
        if (nums.length < 3)
            return false;
	    
        int[] min = new int[nums.length];
        min[0] = nums[0];
	    
        for (int i = 1; i < nums.length; i++)
		
            min[i] = Math.min(min[i - 1], nums[i]);
	    
        for (int j = nums.length - 1, k = nums.length; j >= 0; j--) {
		
            if (nums[j] > min[j]) {
		    
                while (k < nums.length && nums[k] <= min[j])
                    k++;
		    
                if (k < nums.length && nums[k] < nums[j])
                    return true;
		    
                nums[--k] = nums[j];
            }
        }
        return false;
    }
	
	public static void main(String[] args) {
		
		int nums[]= {3, 1, 4, 2};
		
		// first case
		System.out.println(find132pattern(nums));

	}

}
