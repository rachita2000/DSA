package recursion1;

public class Multiplication {

	public static int multiplyTwoIntegers(int m, int n){
		// Write your code here
	if(m==0 ||n==0)
		return 0;
	
	
	return (multiplyTwoIntegers(m-1,n)+n);
	}
}
