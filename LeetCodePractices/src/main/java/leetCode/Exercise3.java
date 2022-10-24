package leetCode;

public class Exercise3 {

	//Exercise3_1512_NumberofGoodPairs
	
	
	public static void main(String[] args) {
		
		Exercise3 E3 = new Exercise3();
		int[] myArr = {1,2,3,1,1,3};
		System.out.println(E3.numIdenticalPairs(myArr));
		
	}

	 public int numIdenticalPairs(int[] nums) {
	        int sum=0;
	   for(int i = 0; i<nums.length-1;i++) {
		    	
		    	for(int j=i+1;j<nums.length;j++) {
		    		
		  
		    		if((nums[i]==nums[j]) && (i < j)){
		    		
		    		//	System.out.println("Good pairs are:" + " " + i+","+j);
		    			sum = sum+ 1;
		    			//System.out.println(sum);
		    			
		    			
		    		}
		    	}
		    	
		    }
			return sum;
	    }
}
