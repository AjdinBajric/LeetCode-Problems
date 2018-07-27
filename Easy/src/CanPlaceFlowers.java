
public class CanPlaceFlowers {

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        
    	int solution=0;
    	
    	if(flowerbed[0]==0 && flowerbed[1]==0)solution++;
    	
    	for(int i=1;i<flowerbed.length-1;i++){
    		if(flowerbed[i-1]==0 && flowerbed[i+1]==0)solution++;
    	}
    	
    	if(flowerbed[flowerbed.length-2]==0 && flowerbed[flowerbed.length-1]==0)solution++;
    	
    	return solution==n;
    }
	
	public static void main(String[] args) {
		
		int [] array ={1,0,0,0,1};
		System.out.println(canPlaceFlowers(array,2));

	}

}
