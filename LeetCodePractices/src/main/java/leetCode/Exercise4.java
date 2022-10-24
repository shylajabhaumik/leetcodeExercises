package leetCode;

public class Exercise4 {
	
	//1281. Subtract the Product and Sum of Digits of an Integer


	public static void main(String[] args) {
		Exercise4 E4 = new Exercise4();
		System.out.println(E4.subtractProductAndSum(234));

	}

	public int subtractProductAndSum(int n) {
   	 int result;
        int remainder;
        int sum = 0;
        int product = 1;
	 while(n>=10) 
	 {
			 remainder = (n%10);
			 sum = sum + (n % 10);
			 product = product * remainder;
			
	         n = n / 10;
	       
	         
			}
	 
	 sum = sum + n;
	 product = product * n;
	//System.out.println(sum);
//	System.out.println(product);
	result = product - sum;

	return result;
}
}
