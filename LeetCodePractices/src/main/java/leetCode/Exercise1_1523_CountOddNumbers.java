package leetCode;

public class Exercise1_1523_CountOddNumbers {
	
	//1523. Count Odd Numbers in an Interval Range


	public static void main(String[] args) {
		
		Exercise1_1523_CountOddNumbers E1 = new Exercise1_1523_CountOddNumbers();

		System.out.println(E1.countOdds(32,52));
	}

public int countOdds(int low, int high) {
	
	 int N = (high - low) / 2;
	 
     // if either R or L is odd
     if (high % 2 != 0 || low % 2 != 0)
         N++;

     return N;
	/*uploading to git*/
	
		
	
	}
	
	
}	

