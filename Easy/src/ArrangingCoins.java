
public class ArrangingCoins {

    public static int arrangeCoins(int n) {
    	
        int count=0;
        
        if(n==0) return 0;
        
        for(int i=1;i<=n;i++){
        	
            n=n-i;
            count=count+1;
        }
        return count;
    }
    
	
	public static void main(String[] args) {
		System.out.println(arrangeCoins(6));

	}

}
